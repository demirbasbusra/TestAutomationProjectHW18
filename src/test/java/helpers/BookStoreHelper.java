package helpers;

import client.RestAssuredClient;
import config.BaseURLBookStore;
import io.restassured.response.Response;

public class BookStoreHelper extends RestAssuredClient {
    public BookStoreHelper() {
        super(BaseURLBookStore.APIUrl.BASE_URL);
    }

    public Response getAllBooks(){
        return get("/Books/",null,null,null);
    }
}
