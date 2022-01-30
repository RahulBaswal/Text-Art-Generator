package com.rb.examples.textart.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rb.examples.textart.textlogic.TextArt;

@RestController
@RequestMapping("/api")
public class TextRestController {

	@GetMapping("/textart")
	public String[][] getTextArt(
			@RequestParam(value="type", required=false, defaultValue = "0") int type,
			@RequestParam String text) {
		
		TextArt art = new TextArt();
		
		String word[][] = art.getFont(type, text);
		
		return  word;		
	}
	
}
