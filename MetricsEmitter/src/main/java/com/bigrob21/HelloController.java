package com.bigrob21;

import java.util.UUID;
import java.util.function.Supplier;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.MessageRecord;

@RestController
public class HelloController {

	Supplier<MessageRecord> GenericMessageRecordSupplier = () -> {
		final String anId = UUID.randomUUID().toString();
		return new MessageRecord(anId, String.format("Hello World with id %s", anId));
	}; 
	
	@GetMapping(value = "/hello", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<MessageRecord> sayHello(){
		return ResponseEntity.ok(GenericMessageRecordSupplier.get());
	}
	
}
