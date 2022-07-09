package co.com.choucair.certification.apirest.exceptions;

public class ErrorServicesException extends RuntimeException{

    public ErrorServicesException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
