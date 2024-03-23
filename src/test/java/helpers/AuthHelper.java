package helpers;


import client.RestAssuredClient;
import config.BaseURLAccount;
import io.restassured.response.Response;
import models.request.BookUserRequest;


import java.util.HashMap;
import java.util.Map;

public class AuthHelper extends RestAssuredClient {

    public AuthHelper() {
        super(BaseURLAccount.APIUrl.BASE_URL);
    }

    public Response addUser(String name, String password) {
        BookUserRequest bookUserRequest = BookUserRequest.builder()
                .userName(name)
                .password(password)
                .build();

        return post("/User", null, null, bookUserRequest);
    }

    public Response authorizeUser(String name, String password) {
        BookUserRequest bookUserRequest = BookUserRequest.builder()
                .userName(name)
                .password(password)
                .build();

        return post("/GenerateToken", null, null, bookUserRequest);
    }

    public Response getUserWithId(String user,String token){

        Map<String, Object> header = new HashMap<>();
        header.put("Authorization",token);
        return get("/User/"+ user,null,header,null);
    }
}
