package tests;

import helpers.BookStoreHelper;
import models.response.BookDetailsModel;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

import static helpers.HelperMethods.checkStatus;
import static org.assertj.core.api.Assertions.assertThat;
public class BookStoreTest {
    BookStoreHelper bookStoreHelper = new BookStoreHelper();
    @Test(description = "Get All Books",priority = 3)
    public void getAllBooks(){
        Response response = bookStoreHelper.getAllBooks();
        checkStatus(response, 200);
        JsonPath jsonPath = response.getBody().jsonPath();
        List<String> allBooks = jsonPath.getList("books.title");

        List<BookDetailsModel> allBoks = jsonPath.getList("books", BookDetailsModel.class);
        for(BookDetailsModel book : allBoks)
        {
            System.out.println("Book name is: " + book.getTitle());
        }
        assertThat(allBoks.size()).isEqualTo(8);

    }

}
