package com.restful.booker.userinfo;

import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetBookingByIDTest extends TestBase {
    @Test
    public void getBookingByID() {
        Response response = given()
                .pathParam("id",236)
                .when()
                .get("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}

