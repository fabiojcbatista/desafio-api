package br.com.desafio.test;

import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(DataProviderRunner.class)
public class ContatoTest {

 @DataProvider
 public static Object[][] contatos() {
     return new Object[][] {
         { "", "Aparecido", "j.aparecido@gmail.com","16","51994533283","Rua Floriano Peixoto, 100", "RS", "Viamão" },
         { "us", "12345", "Schenectady" },
         { "ca", "B2R", "Waverley"},
         {"nl", "1001", "Amsterdam"}
     };
 }


 @Test
 @UseDataProvider("contatos")
 public void ct001_ct020_naoDeveCadastrarCasosDeTesteComDadosInvalidos(String countryCode, String zipCode, String expectedPlaceName) 
 {

}

}