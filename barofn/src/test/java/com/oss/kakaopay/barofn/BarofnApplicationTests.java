package com.oss.kakaopay.barofn;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BarofnApplicationTests {

    @Autowired
    MockMvc mockMvc;
    
    @Autowired
    private WebApplicationContext ctx;
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx)
                .addFilters(new CharacterEncodingFilter("UTF-8", true))  // 한글필터 추가
                .alwaysDo(print())
                .build();
    }
    @Test
    public void maxSumUser() throws Exception {
    	mockMvc.perform(get("/kakaopay/barofn/maxSumUser")
        						.content(MediaType.APPLICATION_JSON_VALUE)
        						).andExpect(status().isOk()).andDo(print());
    }
    @Test
    public void yearNotDeUser() throws Exception {
    	mockMvc.perform(get("/kakaopay/barofn/yearNotDeUser")
    			.content(MediaType.APPLICATION_JSON_VALUE)
    			).andExpect(status().isOk()).andDo(print());
    }
    @Test
    public void yearBrSumAmt() throws Exception {
    	mockMvc.perform(get("/kakaopay/barofn/yearBrSumAmt")
    			.content(MediaType.APPLICATION_JSON_VALUE)
    			).andExpect(status().isOk()).andDo(print());
    }
    @Test
    public void brDeSumAmt() throws Exception {
    	mockMvc.perform(get("/kakaopay/barofn/brDeSumAmt").param("brName", "판교점")
    			.content(MediaType.APPLICATION_JSON_VALUE)
    			).andExpect(status().isOk()).andDo(print());
    }
}