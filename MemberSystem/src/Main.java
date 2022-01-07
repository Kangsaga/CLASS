import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1.로그인 2.회원가입 3.회원목록보기 4.회원정보수정 5.회원탈퇴 6.종료

		Scanner sc = new Scanner(System.in);

		MemberDAO dao = new MemberDAO();

		System.out.println("==== 회원관리 시스템 ====");

		while (true) {
			System.out.print("1.로그인 2.회원가입 3.회원목록보기 4.회원정보수정 5.회원탈퇴 6.종료 >>>");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("==== 로그인 ====");

				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();

				String nick = dao.login(id, pw);

				if (nick != null) {
					System.out.println(nick + "님 환영합니다");
					
					if(id.equals("admin")) {
						System.out.println("1.회원정보수정 2.회원정보삭제");
						choice = sc.nextInt();
						
						if(choice == 1) {
							System.out.println("==== 관리자 회원 정보 수정 ====");
							System.out.println("아이디 입력 : ");
							String change_id = sc.next();
							System.out.println("변경할 닉네임 입력 : ");
							String change_nick = sc.next();
							
							int cnt = dao.adminUpdate(change_id, change_nick);
							
							if (cnt > 0) {
								System.out.println("회원정보 수정 완료");
							}else {
								System.out.println("회원정보 수정 실패");
							}
							
						}else if (choice == 2) {
							System.out.println("==== 관리자 회원삭제 ====");
							
							// 문제1. 회원의 아이디만 콘솔에 전부 출력하세요
							ArrayList<MemberDTO> mid = dao.selectALL();
							
							int cnt = 1;
							
							for (int i = 0; i < mid.size(); i++) {
								if(!mid.get(i).getId().equals("admin")) {
								System.out.println(cnt + "." + mid.get(i).getId());
								cnt++;
								}
							}
							System.out.print("삭제할 아이디 입력 : ");
							String removeid = sc.next();
							
							int result = dao.deleteId(removeid);
							
							if (result > 0) {
								System.out.println("아이디 삭제 완료");
							}else {
								System.out.println("아이디 삭제 실패");
							}
							
							
						}
						
								
					}
					
				} else {
					System.out.println("로그인 실패");
				}
//
//				System.out.println("====로그인====");
//
//				System.out.print("아이디 입력 : ");
//				String id = sc.next();
//				System.out.print("비밀번호 입력 : ");
//				String pw = sc.next();
//
//				Connection conn = null;
//				PreparedStatement psmt = null;
//				ResultSet rs = null;
//
//				try {
//					// JDBC
//					// 0.JDBC를 사용하는 프로젝트에 DRIVER 파일 넣기
//					// 1.DRIVER 로딩 (oracle Driver) -> 동적로딩
//					// 내가 사용하는 DBMS의 드라이버 로딩
//					Class.forName("oracle.jdbc.driver.OracleDriver");
//
//					// 2.connection 연결
//					// connection을 연결하기위해서는
//					// DB에 접속가능한 url, id, pw가 필요하다
//
//					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
//					String db_id = "hr";
//					String db_pw = "hr";
//
//					conn = DriverManager.getConnection(db_url, db_id, db_pw);
//
//					// 3. SQL문 작성 및 실행
//					String sql = "select * from bigmember where id = ? and pw = ?";
//
//					psmt = conn.prepareStatement(sql);
//					psmt.setString(1, id);
//					psmt.setString(2, pw);
//
//					// ResultSet은 커서를 움직일수 있다
//					// 나온 값이 있다면 커서를 움직일수 있고 못 움직인다면 커서를 못 움직인다
//					rs = psmt.executeQuery();
//
//					// rs.next()는
//					if (rs.next()) {
//						System.out.println("로그인 성공");
//						System.out.println(rs.getString("nick") + "님 환영합니다");
////						System.out.println(rs.getString("id"));
////						System.out.println(rs.getString("pw"));
//
//					} else {
//						System.out.println("로그인 실패");
//					}
//
//				} catch (ClassNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				// 무조건 오는 구간
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
				System.out.println("==== 회원가입 ====");
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("패스워드 입력 : ");
				String pw = sc.next();
				System.out.print("닉네임 입력 : ");
				String nick = sc.next();

				int cnt = dao.join(id, pw, nick);

				if (cnt > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
				}

//				Connection conn = null;
//				PreparedStatement psmt = null;

//				try {
//					// JDBC
//					// 0.JDBC를 사용하는 프로젝트에 DRIVER 파일 넣기
//					// 1.DRIVER 로딩 (oracle Driver) -> 동적로딩
//					// 내가 사용하는 DBMS의 드라이버 로딩
//					Class.forName("oracle.jdbc.driver.OracleDriver");
//
//					// 2.connection 연결
//					// connection을 연결하기위해서는
//					// DB에 접속가능한 url, id, pw가 필요하다
//
//					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
//					String db_id = "hr";
//					String db_pw = "hr";
//
//					conn = DriverManager.getConnection(db_url, db_id, db_pw);
//
//					// 3. SQL문 작성 및 실행
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
//						System.out.println("회원가입 성공");
//					} else {
//						System.out.println("회원가입 실패");
//					}
//
//				} catch (ClassNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				// 무조건 오는 구간
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
				// 파일 목록 보기

				System.out.println("==== 회원 목록 보기 ====");
				ArrayList<MemberDTO> list = dao.selectALL();
				for (int i = 0; i < list.size(); i++) {
					System.out
							.println(list.get(i).getId() + " - " + list.get(i).getPw() + " - " + list.get(i).getNick());
				}

			} else if (choice == 4) {
				// 회원 정보 수정
				// 0.JDBC를 사용하는 프로젝트에 DRIVER 파일 넣기
				// 1.드라이버 로딩
				// 2.connection 연결
				// 3.sql 문 작성 및 실행
				// update 테이블명 set 컬럼명 = 바꾸고 싶은값 where 조건
				// executeQuery -> 테이블에 데이터가 변함 없을때
				// result set 로 변환
				// executeUpdate -> 테이블에 데이터가 변함 있을때
				// int 타입을로 변환! -> 실행된 sql 문의 수!
				// 4.finally
				// conn 객체, psmt, rs
				// 닫아주는 순서 -> rs -> psmt -> conn

				// id -> pbk인 회원의 닉네임을
				// '킹병관' 으로 바꾸어 주세요!

				System.out.println("==== 회원정보 수정 ====");
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();
				System.out.print("바꾸고 싶은 닉네임 입력 :");
				String nick = sc.next();

				int cnt = dao.update(id, pw, nick);

				if (cnt > 0) {
					System.out.println("정보수정 성공");
				} else {
					System.out.println("정보수정 실패");
				}
//				Connection conn = null;
//				PreparedStatement psmt = null;

//				try {
//					// JDBC
//					// 0.JDBC를 사용하는 프로젝트에 DRIVER 파일 넣기
//					// 1.DRIVER 로딩 (oracle Driver) -> 동적로딩
//					// 내가 사용하는 DBMS의 드라이버 로딩
//					Class.forName("oracle.jdbc.driver.OracleDriver");
//
//					// 2.connection 연결
//					// connection을 연결하기위해서는
//					// DB에 접속가능한 url, id, pw가 필요하다
//
//					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
//					String db_id = "hr";
//					String db_pw = "hr";
//
//					conn = DriverManager.getConnection(db_url, db_id, db_pw);
//
//					// 3. SQL문 작성 및 실행
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
//						System.out.println("정보수정 성공");
//					} else {
//						System.out.println("정보수정 실패");
//					}
//
//				} catch (ClassNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				// 무조건 오는 구간
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
				// 회원 탈퇴

				System.out.println("==== 회원 탈퇴 ====");
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();

				int cnt = dao.delete(id, pw);

				if (cnt > 0) {
					System.out.println("회원삭제 완료");
				} else {
					System.out.println("회원삭제 실패");
				}

			} else if (choice == 6) {
				System.out.println("프로그램을 종료합니다...");
				break;
			} else {
				System.out.println("정확한 숫자를 다시 입력해주세요");
			}

		}
		sc.close();
	}

}
