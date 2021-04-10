package moz.api;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ProvinceResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/")
          .then()
             .statusCode(200)
             .body(is("Hello REST API"));
    }

    @Test
    public void testProvinceEndpoint(){
        var uuid = "Tete";
        given()
                .param("name", uuid).when()
                .get("/hello/province/{name}")
                .then().statusCode(200)
                .body(is("hello " + uuid));
    }

}