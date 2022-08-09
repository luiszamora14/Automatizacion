package support;

import io.restassured.response.Response;
import objects.payloadUser;

public class requestUser {
    apihelper api;
    public static Response responseuser;
    payloadUser user;

    public requestUser() {
        api = new apihelper();
    }

    public void getUsers(){
        String url ="https://reqres.in/api/users?page=2";
        responseuser = api.get(url);
    }

    public void getUser(String id){
        String url = "https://reqres.in/api/users/"+id;
        responseuser = api.get(url);
    }

    public void createUsers(String nombre, String puesto){
        String url="https://reqres.in/api/users";
        user = new payloadUser(nombre, puesto);
        responseuser = api.post(url,user);
    }

    public void updateUserPut(String id, String nombre, String puesto){
        String url="https://reqres.in/api/users/"+id;
        user = new payloadUser(nombre, puesto);
        responseuser = api.put(url,user);
    }

    public void updateUserPatch(String id, String nombre, String puesto){
        String url="https://reqres.in/api/users/"+id;
        String user = "{\"job\": \""+puesto+"\"" +
                "}";
        responseuser = api.pacth(url,user);
    }
}
