package dk.telenor.vlpo;

/**
 * Created by vlpo on 24/04/2015.
 */

public class Request {
    private String requestDescription;
    private RequestType requestType;

    public Request() {
    }

    public Request(String requestDescription, RequestType requestType) {
        this.requestDescription = requestDescription;
        this.requestType = requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void setRequestDescription(String requestDescription) {
        this.requestDescription = requestDescription;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }
}
