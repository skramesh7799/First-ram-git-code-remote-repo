package com.app.raghu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TestDataRunner implements CommandLineRunner {
@Autowired
private Process pob;
	@Override
	public void run(String... args) throws Exception {
		Process p1=Process.builder()
				.code("Qqq")
				.type("model")
				.id(777)
				.build();
	System.out.println(p1);	
	
		
		
	}
	

}
