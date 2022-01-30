package com.rb.examples.textart.textlogic;

public class TextArt {

	private Style style;
	private String[][] font;
	private int wordLength;
	private String[][] output;
	
	public TextArt() {
		style = new Style();
	}
	
	public String[][] getFont(int type, String text){
		
		font = style.getStyle(type);
		wordLength = font[0].length;
		
		if(text.equals("")) text = " ";

		output = new String[text.length()][wordLength];
		
		char currentChar;
		int charNo;
		
		for(int i=0; i<text.length(); i++) {
			currentChar = text.charAt(i);
			charNo = getCharNumber(currentChar);
			
			for(int j=0; j<wordLength; j++) {
				output[i][j] = font[charNo][j];
			}
		}
		
		return output;
	}

	private int getCharNumber(char ch) {
		
		String allChar = " !\"#$%&\\()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
		
		int charNo = allChar.indexOf(ch);
		
		if(charNo<0) charNo = 0;
		
		return charNo;
	}
	
	
}
