package com.rb.examples.textart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rb.examples.textart.textlogic.TextArt;

@SpringBootApplication
public class TextartApplication {

	public static void main(String[] args) {
		SpringApplication.run(TextartApplication.class, args);
	}
	
	private void TestApp() {
		TextArt art = new TextArt();
		
		for(int k=0; k<10; k++) {
		String word[][] = art.getFont(k, " !\"#$%&\\()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~");
		
		for(int i=0; i<word[0].length; i++) {
			for(int j=0; j<word.length; j++) {
				System.out.print(word[j][i]);
			}
			System.out.println();
		}
		}
	}

}

