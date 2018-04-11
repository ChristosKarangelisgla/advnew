package server;

import java.net.*;
import java.util.Scanner;
import java.io.*;
public class JokeServer2 {
	private static int PORT = 8765;
	public static void main(String[] args) throws IOException {
		// Make a server object
		ServerSocket listener = new ServerSocket(PORT);
		// Wait for a connection and create a client
		
		Socket client = listener.accept();
		// Now we're connected, create a writer to send messages
		PrintWriter writer = new PrintWriter(client.getOutputStream(),true);
		BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));

		writer.println("Type your password");
		String response = reader.readLine();
		//System.out.println(response);
		if(response.equals("123")) {
			writer.println("You Joined the session");
			String response2 = reader.readLine();
			System.out.println(response2);
			
			while (true) {
				Scanner scanner = new Scanner(System.in);
				String message = scanner.nextLine();
				writer.println(message);
				response = reader.readLine();
				System.out.println(response);
			}
			
		}else {
			writer.println("Wrong pass.. goodbye");
			client.close();
		}
		
		

		// Close the connection
		client.close();
	}
}