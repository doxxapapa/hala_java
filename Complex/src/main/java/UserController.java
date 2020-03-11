
	import java.util.Scanner;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class UserController {

		public static void main(String[] args) {

			List<User> users = new ArrayList<User>();

			Scanner sc = new Scanner(System.in);

			boolean folyt = true;

			while (folyt) {

				System.out.println("Username: ");
				String username = sc.next();

				mentes(username, users);

				System.out.println("Wanna continue?");
				String answer = sc.next();
				if (answer.equals("yes")) {
					folyt = true;
				} else {
					folyt = false;
				}

			}

			sc.close();

			for (User u : users) {
				System.out.println(u);

			}
		}

		public static void mentes(String username, List<User> users) {
			if (username.length() < 6 || username.contains(" ")) {
				System.out
						.println("Wrong username: " + username + ".Please check if it cointains whitespaces and the length is more then 6.");

			} else {
				User e = new User(username);
				users.add(e);
				System.out.println(e + " save");
			}
		}	
		
	}

