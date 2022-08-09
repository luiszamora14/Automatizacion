package support;

import io.restassured.response.Response;
import objects.payloadUser;

import static io.restassured.RestAssured.given;

public class apihelper {

    public Response get(String url){
        Response response = given().get(url);
        return response;
    }

    public Response post(String url, Object payload){
        Response response = given().body(payload).contentType("application/json").post(url);
        return response;
    }

    public Response put(String url, Object payload){
        Response response = given().body(payload).contentType("application/json").put(url);
        return response;
    }

    public Response pacth(String url, Object payload) {
        Response response = given().body(payload).contentType("application/json").patch(url);
        return response;
    }
}
