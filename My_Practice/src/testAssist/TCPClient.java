package testAssist;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] args) {
		int port = 3000;
		String serverIP;
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println(serverIP);
				Socket socket = new Socket(serverIP, port);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
