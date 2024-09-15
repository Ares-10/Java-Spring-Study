package YOURSSU.assignment.global.exception.response;

import java.time.LocalDateTime;

import YOURSSU.assignment.global.exception.GlobalErrorCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {
    private LocalDateTime time;
    private String status;
    private String message;
    private String requestURI;

    public ErrorResponse(GlobalErrorCode e, String requestURI) {
        this.time = LocalDateTime.now();
        this.status = e.getHttpStatus().name();
        this.message = e.getMessage();
        this.requestURI = requestURI;
    }

    public ErrorResponse(String status, String message, String requestURI) {
        this.time = LocalDateTime.now();
        this.status = status;
        this.message = message;
        this.requestURI = requestURI;
    }
}
