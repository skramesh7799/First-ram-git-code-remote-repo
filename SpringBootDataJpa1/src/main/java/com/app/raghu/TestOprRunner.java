package com.app.raghu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TestOprRunner implements CommandLineRunner {
	
	@Autowired
private	StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
	Student sob=new Student();
	System.out.println(repo.getClass().getName());
	sob.setStdId(99);
	sob.setStdName("Ramesh");
	sob.setStdFee(777.89);
	repo.save(sob);

	}

}
