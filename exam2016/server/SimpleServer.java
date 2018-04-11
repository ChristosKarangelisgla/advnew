package server;

import java.net.*;
import java.io.*;


public class SimpleServer {
	private static int PORT = 8765;
	public static void main(String[] args) throws IOException {
		// Make a server object
		ServerSocket listener = new ServerSocket(PORT);
		// Wait for a connection and create a client
		Socket client = listener.accept();
		// Close the connection
		client.close();
	}
}