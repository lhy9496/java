package testAssist;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) {
		int port = 3000;
		
		ServerSocket server;
		
		try {
			server = new ServerSocket(port);
			Socket client = server.accept();
			while(true) {
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
