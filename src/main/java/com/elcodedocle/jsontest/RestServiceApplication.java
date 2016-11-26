package com.elcodedocle.jsontest;

import java.io.IOException;

import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	RestServiceApplication(){
		// NOOP
	}
	
    public static void main(String[] args) throws JSONException, IOException {
    	if (args != null && args.length > 0 && "runtest".equals(args[0])){
    		JsonTest.main(args);
    	} else {
    		SpringApplication.run(RestServiceApplication.class, args);
    	}
    }
}
