package test1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

	@RequestMapping(value="/inquiryservice")
	public ResponseEntity<?> hello(@RequestBody String payload) {
		System.out.println("Entered Inquiry Service at Node 1");
		System.out.println(payload);
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
		headers.add("Content-Type", "application/xml");
		String response = "<Student>\r\n"
							+"<Name>Pratik</Name>\r\n"
							+"<City>Pune</City>\r\n"
						+"</Student>";
		return new ResponseEntity<>(response, headers, HttpStatus.OK);
	}

}
