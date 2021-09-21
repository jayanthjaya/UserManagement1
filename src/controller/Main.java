package controller;

		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.sql.SQLException;

import dao.AdminDAO;
import dao.UserDAO;
import model.Admin;
import model.User;

	public class Main {

		public static void main(String[] args) throws NumberFormatException, IOException,ClassNotFoundException, SQLException  {	
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int x;											
			int option;
			User user = new User();
			Admin admin = new Admin();
			UserDAO Userdao = new UserDAO();
			AdminDAO admindao = new AdminDAO();
		

			do 
			{
				System.out.println("1.User");					
				System.out.println("2.Admin");
				System.out.println("3.Exist");
				x = Integer.parseInt(br.readLine())	;
			
				switch(x)
				{
				case 1: 
					System.out.println("Enterusername ");
					String username = br.readLine();
					System.out.println("Enter Password");
					String password = br.readLine();
				
					user.setPassword(password);
					user.setUsername(username);
				
				if(Userdao.validate(user)==true)
				{
					System.out.println("Login Successful!");	
				}
				else
				{
					System.out.println("Login UnSuccessful!");
				}
				break;
				case 2:
					System.out.println("Enterusername ");
					String username1 = br.readLine();
					System.out.println("Enter Password");
					String password1 = br.readLine();
					user.setUsername(username1);
					user.setPassword(password1);
					
				
				if(Userdao.validate(user)==true)
				{
					System.out.println("Login Successful!");
				do 
				{
						
					System.out.println("1.Add User");
					System.out.println("2.Upadte User");
					System.out.println("3.Delete User");
					System.out.println("4.Exist");
					option = Integer.parseInt(br.readLine());
					int id ;
					switch(option) 
					{
					case 1 :
						System.out.println("Enter ID Number");
						int id1 = Integer.parseInt(br.readLine());
						System.out.println("Enter New User Name");
						String username2 = br.readLine();
						System.out.println("Enter New Password");
						String password2 = br.readLine();
						
						admin.setId(id1);
						admin.setUsername(username2);
						admin.setPassword(password2);
						admindao.addAdmin(admin);
						
						System.out.println("New User Details Are Added");
						
						break;
						
						case 2:
						
							System.out.println("Enter ID Number");
							int id3 = Integer.parseInt(br.readLine());
							System.out.println("Enter New User Name");
							String username3 = br.readLine();
							System.out.println("Enter New Password");
							String password3 = br.readLine();
							System.out.println("Enter ID Number");
							int id4 = Integer.parseInt(br.readLine());
							
							admin.setId(id3);
							admin.setUsername(username3);
							admin.setPassword(password3);
							admin.setId(id4);
							admindao.update(admin);
							System.out.println(" Details Updated Successful ");
						break;
						case 3:
							
							System.out.println("Enter The ID Number To delete");
							int id2 = Integer.parseInt(br.readLine());
							admin.setId(id2);
							admindao.delect(admin);
							System.out.println(" Deleted Successful ");
							
						break;
						case 4: 
							System.out.println("Thanku for visiting us");
							break;
					}
				}
				while (option!=4);
				}
				else
				{
					System.out.println("Login UnSuccessful!");
				}
				}
			
				
			}
			while (x!=3);
			}
		}
		
