/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.br.gpe;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 *
 * @author 07014437151
 */
@SpringBootTest
@AutoConfigureMockMvc
public class AlunoControllerTest {

    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public void dadoAluno_retorneObjeto() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/aluno/{cpf}","00000000000");
        RequestActions result = mockMvc.perform(request);
        // Verificar se o STATUS da requisição é igual a 200.
        ResultMatcher resultStatus = MockMvcResultMatchers.status().isOk();
        result.andExpect(resultStatus);  
// Verifica se o tipo do conteúdo é JSON
        ResultMatcher resultMediaType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);
        result.andExpect(resultMediaType);
        
          String expectedCpf = "00000000000";
        ResultMatcher resultId = MockMvcResultMatchers.jsonPath("$.cpf").value(expectedCpf);
        result.andExpect(resultId);
    }
    
}
