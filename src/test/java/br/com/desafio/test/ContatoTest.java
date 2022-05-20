package br.com.desafio.test;

import static io.restassured.RestAssured.given;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class ContatoTest {

    private String dados = "{ \"name\": \"\",\"last_name\": \"Santos\",\"email\": \"andersen30@gmail.com\",\"age\": \"75\",\"phone\": \"51994533283\",\"address\": \"Rua Flores\",\"state\": \"RS\",\"city\": \"Canoas\"}";

    @DataProvider
    public static Object[][] contatos() {
        return new Object[][] {
                { "Luiz", "Aparecido", "j1.aparecido@gmail.com", "16", "51994533283",
                        "Rua Floriano Peixoto, 100", "RS",
                        "Viamão" },
                { "", "Aparecido", "j2.aparecido@gmail.com", "16", "51994533283",
                        "Rua Floriano Peixoto, 100", "RS",
                        "Viamão" },
                { "9999", "Aparecido", "j3.aparecido@gmail.com", "16", "51994533283",
                        "Rua Floriano Peixoto, 100", "RS",
                        "Viamão" },
                { "#@$%", "Aparecido", "j4.aparecido@gmail.com", "16", "51994533283",
                        "Rua Floriano Peixoto, 100", "RS",
                        "Viamão" },
                { " ", "Aparecido", "j5.aparecido@gmail.com", "16", "51994533283",
                        "Rua Floriano Peixoto, 100", "RS",
                        "Viamão" },
                { "Anderson", "", "j6.aparecido@gmail.com", "16", "51994533283",
                        "Rua Floriano Peixoto, 100", "RS",
                        "Viamão" },
                { "Anderson", "9999", "j7.aparecido@gmail.com", "16", "51994533283",
                        "Rua Floriano Peixoto, 100", "RS",
                        "Viamão" },
                { "Anderson", "&%$#", "j8.aparecido@gmail.com", "16", "51994533283",
                        "Rua Floriano Peixoto, 100", "RS",
                        "Viamão" },
                { "Anderson", " ", "j9.aparecido@gmail.com", "16", "51994533283",
                        "Rua Floriano Peixoto, 100", "RS",
                        "Viamão" },
                { "Anderson", "Aparecido", "j.a1parecidogmail.com", "16", "51994533283",
                        "Rua Floriano Peixoto, 100",
                        "RS", "Viamão" },
                { "Anderson", "Aparecido", "j.a2parecido@gmail", "16", "51994533283",
                        "Rua Floriano Peixoto, 100", "RS",
                        "Viamão" },
                { "Anderson", "Aparecido", "", "16", "51994533283", "Rua Floriano Peixoto, 100", "RS",
                        "Viamão" },
                { "Anderson", "Aparecido", "j.a3parecido@gmail.com", "@#", "51994533283",
                        "Rua Floriano Peixoto, 100",
                        "RS", "Viamão" },
                { "Anderson", "Aparecido", "j.a4parecido@gmail.com", " ", "51994533283",
                        "Rua Floriano Peixoto, 100",
                        "RS", "Viamão" },
                { "Anderson", "Aparecido", "j.a5parecido@gmail.com", "idade", "51994533283",
                        "Rua Floriano Peixoto, 100",
                        "RS", "Viamão" },
                { "Anderson", "Aparecido", "j.a6parecido@gmail.com", "16", "@#$",
                        "Rua Floriano Peixoto, 100", "RS",
                        "Viamão" },
                { "Anderson", "Aparecido", "j.a7parecido@gmail.com", "16", " ",
                        "Rua Floriano Peixoto, 100", "RS",
                        "Viamão" },
                { "Anderson", "Aparecido", "j.a8parecido@gmail.com", "16", "51994533283", "100", "RS",
                        "Viamão" },
                { "Anderson", "Aparecido", "j.a9parecido@gmail.com", "16", "51994533283", "@#%$", "RS",
                        "Viamão" },
                { "Anderson", "Aparecido", "j.ap1arecido@gmail.com", "16", "51994533283", " ", "RS",
                        "Viamão" },
                { "Anderson", "Aparecido", "j.ap2arecido@gmail.com", "16", "51994533283",
                        "Rua Floriano Peixoto, 100",
                        "51", "Viamão" },
                { "Anderson", "Aparecido", "j.ap3arecido@gmail.com", "16", "51994533283",
                        "Rua Floriano Peixoto, 100",
                        "#@$", "Viamão" },
                { "Anderson", "Aparecido", "j.ap4arecido@gmail.com", "16", "51994533283",
                        "Rua Floriano Peixoto, 100",
                        " ", "Viamão" },
                { "Anderson", "Aparecido", "j.ap5arecido@gmail.com", "16", "51994533283",
                        "Rua Floriano Peixoto, 100",
                        "RS", "9999" },
                { "Anderson", "Aparecido", "j.ap6arecido@gmail.com", "16", "51994533283",
                        "Rua Floriano Peixoto, 100",
                        "RS", "#2%@" },
                { "Anderson", "Aparecido", "j.ap7arecido@gmail.com", "16", "51994533283",
                        "Rua Floriano Peixoto, 100",
                        "RS", " " }

        };
    }

    @DataProvider
    public static Object[][] listaExclusao() {
        return new Object[][] {
                { "1736" },
                { "1737" },
                { "1738" },
                { "1739" },
                { "1740" },
                { "1741" },
                { "1742" },
                { "1743" },
                { "1734" },
                { "1735" },
                { "1736" },
                { "1747" },
                { "1748" },
                { "1749" },
                { "1750" },
                { "1755" },
                { "1756" },
                { "1757" },
                { "1758" },
                { "1759" },
                { "1760" },
                { "1761" },
                { "1762" },
                { "1763" }

        };
    }

    @Test
    // @UseDataProvider("contatos")
    public void ct001_deveListarTodosOsContatos() {
        given()
                .log()
                .all()
                .when()
                .get("https://api-de-tarefas.herokuapp.com/contacts")
                .then()
                .log()
                .body()
                .statusCode(200);
    }

    @Test
    @UseDataProvider("contatos")
    public void ct003_ct027_naoDeveCadastrarUmNovoContato(String name, String last_name, String email, String age,
            String phone, String address, String state, String city) {
        given()
                .log()
                .all()
                .contentType("application/json")
                .body("{ \"name\": \"" + name + "\",\"last_name\": \"" + last_name + "\",\"email\": \"" + email
                        + "\",\"age\": \"" + age + "\",\"phone\":\"" + phone + "\",\"address\": \"" + address
                        + "\",\"state\": \"" + state + "\",\"city\":\" " + city + "\"}")
                .when()
                .post("https://api-de-tarefas.herokuapp.com/contacts")
                .then()
                .log()
                .body()
                .statusCode(422);
    }

    @Test
    public void ct002_deveCadastrarUmNovoContato() {
        given()
                .log()
                .all()
                .contentType("application/json")
                .body(dados)
                .when()
                .post("https://api-de-tarefas.herokuapp.com/contacts")
                .then()
                .log()
                .body()
                .statusCode(201);
    }

    @Test
    public void ct068_deveAlterarUmNovoContato() {
        given()
                .log()
                .all()
                .contentType("application/json")
                .body(dados)
                .when()
                .put("https://api-de-tarefas.herokuapp.com/contacts/441")
                .then().statusCode(200);

    }

    @Test
    @UseDataProvider("contatos")
    public void ct069_ct093_naoDeveAlterarUmNovoContato(String name, String last_name, String email, String age,
            String phone, String address, String state, String city) {
        given()
                .log()
                .all()
                .contentType("application/json")
                .body("{ \"name\": \"" + name + "\",\"last_name\": \"" + last_name + "\",\"email\": \"" + email
                        + "\",\"age\": \"" + age + "\",\"phone\":\"" + phone + "\",\"address\": \"" + address
                        + "\",\"state\": \"" + state + "\",\"city\":\" " + city + "\"}")
                .when()
                .put("https://api-de-tarefas.herokuapp.com/contacts/441")
                .then()
                .log()
                .body()
                .statusCode(422);
    }

    @Test
    @UseDataProvider("listaExclusao")
    public void ct135_deveExcluirContatoExistente(String id) {
        given()
                .log()
                .all()
                .pathParam("id", id)
                .when()
                .delete("https://api-de-tarefas.herokuapp.com/contacts/{id}")
                .then()
                .log()
                .body()
                .statusCode(204);
    }

    @Test
    public void ct134_naoDeveExcluirContatoInexistente() {
        given()
                .log()
                .all()
                .when()
                .delete("https://api-de-tarefas.herokuapp.com/contacts/9999")
                .then()
                .log()
                .body()
                .statusCode(404);
    }

}