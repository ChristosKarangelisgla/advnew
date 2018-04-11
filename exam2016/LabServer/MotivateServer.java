package LabServer;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import LabserverSolution.MotivateServer3;
import LabserverSolution.QuoteLoader;
import LabserverSolution.MotivateServer2.ClientThread;

public class MotivateServer {

	private static int PORT = 8765;
	private static Random r = new Random();
	private ArrayList<String> quotes;
	private ServerSocket serverSocket;
		
		public void runServer() {
			try {
				serverSocket = new ServerSocket(PORT);
				// Load the motivational quotes
				ArrayList<String> quotes = QuoteLoader.loadQuotes("quotes.txt");
				// Wait for a connection from a client
				while(true) {
					Socket client = serverSocket.accept();
					new ClientThread(client,quotes).start();
				}
			}catch(Exception e) {
			}finally {
				// close the socket
				try {
					serverSocket.close();
				}catch(Exception e) {
				}
			}
		}
		
		public static class ClientThread extends Thread {
			private Socket client;
			private PrintWriter out;
			private BufferedReader in;
			private ArrayList<String> quotes;
			public ClientThread(Socket socket,ArrayList<String> quotes) {
				client = socket;
				this.quotes = quotes;
			}
			public void run() {
				try {
					// Create the writer and reader
					out = new PrintWriter(client.getOutputStream(),true);
					in = new BufferedReader(new InputStreamReader(client.getInputStream()));
					while(true) {
						// Pick a random number
						int quote = r.nextInt(quotes.size());
						// send the random quote
						out.println(quotes.get(quote));
						// Wait for a response. If none comes, the client is dead
						if(in.readLine() == null) {
							break;
						}
						// Sleep for five seconds
						Thread.sleep(2000);
					}
				}catch(Exception e) {

				}finally {
					// Collapse nicely if the server goes
					try {
						in.close();
						out.close();
						client.close();
					}catch(Exception e) {}
				}
			}
		}
		
	public static void main(String[] args) {
		
		new MotivateServer().runServer();
	}
}