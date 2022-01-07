import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	// DAO -> Database Access Object
	// 데이터 베이스에 접근하기 위한 객체를 만들 수 있는 클래스

//	Scanner sc = new Scanner(System.in);

	// 레퍼런스 타입은 필드에 있으면 초기값(null)이 들어간다
	// 자료형에서 논리형을 제외한 변수 타입은 초기값(0)이 들어간다
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	// 드라이버 로딩과 커넥션 객체를 가져오는 메소드
	// public은 같은 프로젝트 안에서만 가져오는건이 가능하다
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

	// DataBase와 연결을 끊어주는 메소드
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

	// 로그인 기능
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
