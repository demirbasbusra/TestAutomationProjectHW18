package models.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class BookUserRequest {
    private String password;
    private String userName;
}
