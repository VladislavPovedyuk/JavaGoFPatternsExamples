package dk.telenor.vlpo;

/**
 * Created by vlpo on 24/04/2015.
 */

public class Developer extends RequestHandler {

    public Developer(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType() == RequestType.WORK) {
            processRequest(req);
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Developer ";
    }
}
