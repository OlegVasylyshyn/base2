package week5.day2;

public enum ResponseCodes {

    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500);

    private int responseCode;

    private ResponseCodes(int code){
        this.responseCode = code;
    }

    public int getResponseCode() {
        return responseCode;
    }
}
