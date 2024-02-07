package com.example.TransferFund.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class Test {

	private static void testScenario01() throws IOException {
		URL url = new URL("http://localhost:8080/fundtransfer/");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Accept", "application/json");
		con.setDoOutput(true);
		String jsonInputString = "{\"withdrawFrom\":1001,\"depositTo\":1002,\"amount\":10}";


		try (OutputStream os = con.getOutputStream()) 
		{
			byte[] input = jsonInputString.getBytes("utf-8");
			os.write(input, 0, input.length);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) 
		{
			StringBuilder response = new StringBuilder();
			String responseLine = null;
			while ((responseLine = br.readLine()) != null) 
			{
				response.append(responseLine.trim());
			}
			if(response.toString().equals("Money deposit successful...!")) {
				System.out.println("Test pass!");
			}
		}
	}
	private static void testScenario02() throws IOException {
		URL url = new URL("http://localhost:8080/fundtransfer/");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Accept", "application/json");
		con.setDoOutput(true);
		String jsonInputString = "{\"withdrawFrom\":1001,\"depositTo\":1002,\"amount\":10000}";


		try (OutputStream os = con.getOutputStream()) 
		{
			byte[] input = jsonInputString.getBytes("utf-8");
			os.write(input, 0, input.length);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) 
		{
			StringBuilder response = new StringBuilder();
			String responseLine = null;
			while ((responseLine = br.readLine()) != null) 
			{
				response.append(responseLine.trim());
			}
			if(response.toString().equals("Money deposit successful...!")) {
				System.out.println("Test pass!");
			}
		}
	}
	public static void main(String [] args) throws IOException {
		testScenario01();
		testScenario02();
		
	}
}