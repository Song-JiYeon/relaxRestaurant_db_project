import java.sql.*;
import java.util.Scanner;
import java.io.*;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

				//String ur="jdbc:postgresql://127.0.0.1:5433/test";
				String ur="jdbc:postgresql://localhost/";
				String user="postgres";
				//String password="****";

				Connection con = null;

				try 
			      {
					 // connection establish �ϱ�
			         con = DriverManager.getConnection(ur, user, password);
			           
			      }
			      catch (SQLException e) 
			      {
			         System.out.println("Connection Failed Check output console");
			         e.printStackTrace();
			         return; 
			      }
			      
			      if (con != null)
			      {
//			         System.out.println("Connection Success");
			      } 
			      else 
			      {
			         System.out.println("Failed to make conn");
			      }

				Scanner scan = new Scanner(System.in);

				System.out.println("�ȽɽĴ� ���� ���� ����");
				System.out.println("--------------------------------------");
				System.out.println("���");
				System.out.println("1. ���� �� ������ ������ �ȽɽĴ� ���� Ž��");
				System.out.println("2. �ȽɽĴ� �˻�");
				System.out.println("3. ����");

				while(true) {
					
					int function_choice = scan.nextInt();
					
					if(function_choice == 1) {
						try {
							Region region = new Region();
							region.main(con);	
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
					}
						
					else if (function_choice == 2) {
						try {
							
							RelaxRestaurant rstrnt=new RelaxRestaurant();
							rstrnt.main(con);
							
						
						} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}
						
						
					}
					else if (function_choice == 3) {
						System.out.println("���α׷��� �����մϴ�.");
						
						System.exit(0);
					
					}
					else {
						System.out.println("�߸��� �Է��Դϴ�.");

					}
				}
			
	}

}
