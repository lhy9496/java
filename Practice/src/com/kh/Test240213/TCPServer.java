package com.kh.Test240213;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BufferedReader bf = null;
		PrintWriter pw = null;
		
		int port = 9496;
		
		ServerSocket server;
		try {
			server = new ServerSocket(port);
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결 요청 중...");
			
			bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			pw = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String message = bf.readLine();
				System.out.println("클라이언트 : " + message);
				
				System.out.print("서버 : ");
				String sendmessage = sc.nextLine();
				
				pw.println(sendmessage);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		sc.close();
		
	}
}
