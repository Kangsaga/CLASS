import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1.�α��� 2.ȸ������ 3.ȸ����Ϻ��� 4.ȸ���������� 5.ȸ��Ż�� 6.����

		Scanner sc = new Scanner(System.in);

		MemberDAO dao = new MemberDAO();

		System.out.println("==== ȸ������ �ý��� ====");

		while (true) {
			System.out.print("1.�α��� 2.ȸ������ 3.ȸ����Ϻ��� 4.ȸ���������� 5.ȸ��Ż�� 6.���� >>>");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("==== �α��� ====");

				System.out.print("���̵� �Է� : ");
				String id = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				String pw = sc.next();

				String nick = dao.login(id, pw);

				if (nick != null) {
					System.out.println(nick + "�� ȯ���մϴ�");
					
					if(id.equals("admin")) {
						System.out.println("1.ȸ���������� 2.ȸ����������");
						choice = sc.nextInt();
						
						if(choice == 1) {
							System.out.println("==== ������ ȸ�� ���� ���� ====");
							System.out.println("���̵� �Է� : ");
							String change_id = sc.next();
							System.out.println("������ �г��� �Է� : ");
							String change_nick = sc.next();
							
							int cnt = dao.adminUpdate(change_id, change_nick);
							
							if (cnt > 0) {
								System.out.println("ȸ������ ���� �Ϸ�");
							}else {
								System.out.println("ȸ������ ���� ����");
							}
							
						}else if (choice == 2) {
							System.out.println("==== ������ ȸ������ ====");
							
							// ����1. ȸ���� ���̵� �ֿܼ� ���� ����ϼ���
							ArrayList<MemberDTO> mid = dao.selectALL();
							
							int cnt = 1;
							
							for (int i = 0; i < mid.size(); i++) {
								if(!mid.get(i).getId().equals("admin")) {
								System.out.println(cnt + "." + mid.get(i).getId());
								cnt++;
								}
							}
							System.out.print("������ ���̵� �Է� : ");
							String removeid = sc.next();
							
							int result = dao.deleteId(removeid);
							
							if (result > 0) {
								System.out.println("���̵� ���� �Ϸ�");
							}else {
								System.out.println("���̵� ���� ����");
							}
							
							
						}
						
								
					}
					
				} else {
					System.out.println("�α��� ����");
				}
//
//				System.out.println("====�α���====");
//
//				System.out.print("���̵� �Է� : ");
//				String id = sc.next();
//				System.out.print("��й�ȣ �Է� : ");
//				String pw = sc.next();
//
//				Connection conn = null;
//				PreparedStatement psmt = null;
//				ResultSet rs = null;
//
//				try {
//					// JDBC
//					// 0.JDBC�� ����ϴ� ������Ʈ�� DRIVER ���� �ֱ�
//					// 1.DRIVER �ε� (oracle Driver) -> �����ε�
//					// ���� ����ϴ� DBMS�� ����̹� �ε�
//					Class.forName("oracle.jdbc.driver.OracleDriver");
//
//					// 2.connection ����
//					// connection�� �����ϱ����ؼ���
//					// DB�� ���Ӱ����� url, id, pw�� �ʿ��ϴ�
//
//					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
//					String db_id = "hr";
//					String db_pw = "hr";
//
//					conn = DriverManager.getConnection(db_url, db_id, db_pw);
//
//					// 3. SQL�� �ۼ� �� ����
//					String sql = "select * from bigmember where id = ? and pw = ?";
//
//					psmt = conn.prepareStatement(sql);
//					psmt.setString(1, id);
//					psmt.setString(2, pw);
//
//					// ResultSet�� Ŀ���� �����ϼ� �ִ�
//					// ���� ���� �ִٸ� Ŀ���� �����ϼ� �ְ� �� �����δٸ� Ŀ���� �� �����δ�
//					rs = psmt.executeQuery();
//
//					// rs.next()��
//					if (rs.next()) {
//						System.out.println("�α��� ����");
//						System.out.println(rs.getString("nick") + "�� ȯ���մϴ�");
////						System.out.println(rs.getString("id"));
////						System.out.println(rs.getString("pw"));
//
//					} else {
//						System.out.println("�α��� ����");
//					}
//
//				} catch (ClassNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				// ������ ���� ����
//				finally {
//
//					try {
//						if (rs != null) {
//							rs.close();
//						}
//						if (psmt != null) {
//							psmt.close();
//						}
//						if (conn != null) {
//							conn.close();
//						}
//
//					} catch (SQLException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//
//				}
//
			} else if (choice == 2) {
				System.out.println("==== ȸ������ ====");
				System.out.print("���̵� �Է� : ");
				String id = sc.next();
				System.out.print("�н����� �Է� : ");
				String pw = sc.next();
				System.out.print("�г��� �Է� : ");
				String nick = sc.next();

				int cnt = dao.join(id, pw, nick);

				if (cnt > 0) {
					System.out.println("ȸ������ ����");
				} else {
					System.out.println("ȸ������ ����");
				}

//				Connection conn = null;
//				PreparedStatement psmt = null;

//				try {
//					// JDBC
//					// 0.JDBC�� ����ϴ� ������Ʈ�� DRIVER ���� �ֱ�
//					// 1.DRIVER �ε� (oracle Driver) -> �����ε�
//					// ���� ����ϴ� DBMS�� ����̹� �ε�
//					Class.forName("oracle.jdbc.driver.OracleDriver");
//
//					// 2.connection ����
//					// connection�� �����ϱ����ؼ���
//					// DB�� ���Ӱ����� url, id, pw�� �ʿ��ϴ�
//
//					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
//					String db_id = "hr";
//					String db_pw = "hr";
//
//					conn = DriverManager.getConnection(db_url, db_id, db_pw);
//
//					// 3. SQL�� �ۼ� �� ����
//					String sql = "insert into  bigmember values(?,?,?)";
//
//					psmt = conn.prepareStatement(sql);
//					psmt.setString(1, id);
//					psmt.setString(2, pw);
//					psmt.setString(3, nick);
//
//					int cnt = psmt.executeUpdate();
//
//					if (cnt > 0) {
//						System.out.println("ȸ������ ����");
//					} else {
//						System.out.println("ȸ������ ����");
//					}
//
//				} catch (ClassNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				// ������ ���� ����
//				finally {
//
//					try {
//						if (psmt != null) {
//							psmt.close();
//						}
//						if (conn != null) {
//							conn.close();
//						}
//					} catch (SQLException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//
//				}

			} else if (choice == 3) {
				// ���� ��� ����

				System.out.println("==== ȸ�� ��� ���� ====");
				ArrayList<MemberDTO> list = dao.selectALL();
				for (int i = 0; i < list.size(); i++) {
					System.out
							.println(list.get(i).getId() + " - " + list.get(i).getPw() + " - " + list.get(i).getNick());
				}

			} else if (choice == 4) {
				// ȸ�� ���� ����
				// 0.JDBC�� ����ϴ� ������Ʈ�� DRIVER ���� �ֱ�
				// 1.����̹� �ε�
				// 2.connection ����
				// 3.sql �� �ۼ� �� ����
				// update ���̺�� set �÷��� = �ٲٰ� ������ where ����
				// executeQuery -> ���̺� �����Ͱ� ���� ������
				// result set �� ��ȯ
				// executeUpdate -> ���̺� �����Ͱ� ���� ������
				// int Ÿ������ ��ȯ! -> ����� sql ���� ��!
				// 4.finally
				// conn ��ü, psmt, rs
				// �ݾ��ִ� ���� -> rs -> psmt -> conn

				// id -> pbk�� ȸ���� �г�����
				// 'ŷ����' ���� �ٲپ� �ּ���!

				System.out.println("==== ȸ������ ���� ====");
				System.out.print("���̵� �Է� : ");
				String id = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				String pw = sc.next();
				System.out.print("�ٲٰ� ���� �г��� �Է� :");
				String nick = sc.next();

				int cnt = dao.update(id, pw, nick);

				if (cnt > 0) {
					System.out.println("�������� ����");
				} else {
					System.out.println("�������� ����");
				}
//				Connection conn = null;
//				PreparedStatement psmt = null;

//				try {
//					// JDBC
//					// 0.JDBC�� ����ϴ� ������Ʈ�� DRIVER ���� �ֱ�
//					// 1.DRIVER �ε� (oracle Driver) -> �����ε�
//					// ���� ����ϴ� DBMS�� ����̹� �ε�
//					Class.forName("oracle.jdbc.driver.OracleDriver");
//
//					// 2.connection ����
//					// connection�� �����ϱ����ؼ���
//					// DB�� ���Ӱ����� url, id, pw�� �ʿ��ϴ�
//
//					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
//					String db_id = "hr";
//					String db_pw = "hr";
//
//					conn = DriverManager.getConnection(db_url, db_id, db_pw);
//
//					// 3. SQL�� �ۼ� �� ����
//					String sql = "update bigmember set nick = ? where id = ? and pw = ?";
//
//					psmt = conn.prepareStatement(sql);
//					psmt.setString(1, nick);
//					psmt.setString(2, id);
//					psmt.setString(3, pw);
//
//					int cnt = psmt.executeUpdate();
//
//					if (cnt > 0) {
//						System.out.println("�������� ����");
//					} else {
//						System.out.println("�������� ����");
//					}
//
//				} catch (ClassNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				// ������ ���� ����
//				finally {
//
//					try {
//
//						if (psmt != null) {
//							psmt.close();
//						}
//						if (conn != null) {
//							conn.close();
//						}
//
//					} catch (SQLException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//
//				}

			} else if (choice == 5) {
				// ȸ�� Ż��

				System.out.println("==== ȸ�� Ż�� ====");
				System.out.print("���̵� �Է� : ");
				String id = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				String pw = sc.next();

				int cnt = dao.delete(id, pw);

				if (cnt > 0) {
					System.out.println("ȸ������ �Ϸ�");
				} else {
					System.out.println("ȸ������ ����");
				}

			} else if (choice == 6) {
				System.out.println("���α׷��� �����մϴ�...");
				break;
			} else {
				System.out.println("��Ȯ�� ���ڸ� �ٽ� �Է����ּ���");
			}

		}
		sc.close();
	}

}
