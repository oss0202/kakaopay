package com.oss.kakaopay.barofn.sampleError;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class ApiExceptionController {

	@GetMapping("/ex1") // 목록
	public void list(Model model) {
		/*throw new ApiException(
		        "INVALID_CLIENT_ID",
		        "The requested client identifier is invalid.",
		        new ApiExceptionData().add("client_id", "aa")
		);*/
		System.out.println("exception호출");
		throw new ExtensionException("br code not found error");

//		new IllegalStateException("Basic Error");
	}
}
