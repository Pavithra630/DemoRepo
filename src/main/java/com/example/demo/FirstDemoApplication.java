package com.example.demo;

import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstDemoApplication.class, args);
		
		String s="my name is pavithra and my native place is hyderabad";



		System.out.println(Stream.of(s.split(" ")).filter(str->str.equals("my")).count());
		
		System.out.println(isPolindrom("am"));
		Optional<String> str=Optional.ofNullable("nnn");
		System.out.println(str.get());

				

				
	}
	public static boolean isPolindrom(String s){
		for(int i=0;i<s.length()/2;i++){

		if(s.charAt(i)!=s.charAt(s.length()-1-i)){
		
		return false;
		}
		}//for ending

		return true;

		}

}
