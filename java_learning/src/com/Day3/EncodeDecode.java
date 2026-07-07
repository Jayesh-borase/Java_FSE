package com.Day3;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodeDecode {

	public static void main(String[] args) {
		
		String pass = "Varun@3613";
		
		Encoder encoder = Base64.getEncoder();
		String encoded = encoder.encodeToString(pass.getBytes());
		
		System.out.println("Encoded password : "+ encoded);
		
		Decoder decoder = Base64.getDecoder();
		byte[] decoded = decoder.decode(encoded.getBytes());
		
		System.out.println("Decoded password : " + new String(decoded));
		
	}
	
	
}
