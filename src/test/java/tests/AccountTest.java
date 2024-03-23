package tests;

import helpers.AuthHelper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static helpers.HelperMethods.checkStatus;
import static org.assertj.core.api.Assertions.assertThat;
public class AccountTest {
    AuthHelper authHelper = new AuthHelper();
    String userId;
    String token;

    @Test(description = "Add New User",priority = 1)
    public void addNewBookUser(){

        Response response = authHelper.addUser("busradem","123654Bd/*");
        checkStatus(response, 201);
        assertThat(response.jsonPath().getString("username")).isEqualTo("busradem");
        userId = response.jsonPath().getString("userID");
        System.out.println(userId);
    }

    @Test(description = "Authorized New User",priority = 1)
    public void authorizeNewUser(){
        Response response = authHelper.authorizeUser("busradem","123654Bd/*");
        checkStatus(response, 200);
        token = response.jsonPath().getString("token");
        System.out.println("token" + token);
    }


}
