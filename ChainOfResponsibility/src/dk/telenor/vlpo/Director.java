package dk.telenor.vlpo;

/**
 * Created by vlpo on 24/04/2015.
 */

public class Director extends RequestHandler {

    public Director(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType() == RequestType.FLY_TO_BAHAMAS) {
            processRequest(req);
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Director ";
    }
}
