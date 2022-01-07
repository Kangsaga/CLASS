import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	// DAO -> Database Access Object
	// ������ ���̽��� �����ϱ� ���� ��ü�� ���� �� �ִ� Ŭ����

//	Scanner sc = new Scanner(System.in);

	// ���۷��� Ÿ���� �ʵ忡 ������ �ʱⰪ(null)�� ����
	// �ڷ������� ������ ������ ���� Ÿ���� �ʱⰪ(0)�� ����
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	// ����̹� �ε��� Ŀ�ؼ� ��ü�� �������� �޼ҵ�
	// public�� ���� ������Ʈ �ȿ����� �������°��� �����ϴ�
	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(db_url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// DataBase�� ������ �����ִ� �޼ҵ�
	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// �α��� ���
	public String login(String id, String pw) {

		getConnection();

		try {
			String sql = "select * from bigmember where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next()) {
				return rs.getString("nick");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			close();

		}
		return null;
	}

	public int join(String id, String pw, String nick) {

		getConnection();

		try {
			String sql = "insert into  bigmember values(?,?,?)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);

			return psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			close();

		}
		return 0;
	}

	public ArrayList<MemberDTO> selectALL() {

		getConnection();

		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();

		try {

			String sql = "select * from bigmember";

			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String nick = rs.getString("nick");
				MemberDTO m = new MemberDTO(id, pw, nick);
				list.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;

	}

	public int update(String id, String pw, String nick) {

		getConnection();

		try {
			String sql = "update bigmember set nick = ? where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, nick);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			return psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			close();

		}
		return 0;
	}

	public int delete(String id, String pw) {

		getConnection();

		try {
			String sql = "delete bigmember where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			return psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return 0;
	}

	public int adminUpdate(String change_id, String change_nick) {

		getConnection();

		try {
			String spl = "update bigmember set nick = ? where id = ?";

			psmt = conn.prepareStatement(spl);
			psmt.setString(1, change_nick);
			psmt.setString(2, change_id);

			return psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return 0;
	}

	public int deleteId(String removeid) {
		
		getConnection();

		try {
			String sql = "delete bigmember where id = ? ";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, removeid);
			
			return psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return 0;
	}

}
