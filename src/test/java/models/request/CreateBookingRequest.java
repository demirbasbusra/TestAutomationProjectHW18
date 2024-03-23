package models.request;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CreateBookingRequest {
    private String firstname;
    private String additionalneeds;
    private Bookingdates bookingdates;
    private Integer totalprice;
    private Boolean depositpaid;
    private String lastname;

    @Builder
    @Getter
    @Setter
    public static class Bookingdates{
        private String checkin;
        private String checkout;
    }
}
