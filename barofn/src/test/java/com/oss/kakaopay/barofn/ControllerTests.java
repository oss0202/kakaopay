package com.oss.kakaopay.barofn;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class ControllerTests {
	@Autowired
	MockMvc mockMvc;

		@Test
	    public void hello() throws Exception {
	        mockMvc.perform(get("/kakaopay/barofn/1"))
	                .andExpect(status().isOk())
	                .andDo(print());
//	                .andExpect((ResultMatcher) content().string("hello saelobi"))
	    }

}
