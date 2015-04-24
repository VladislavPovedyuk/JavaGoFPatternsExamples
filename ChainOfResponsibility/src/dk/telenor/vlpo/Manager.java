package dk.telenor.vlpo;

/**
 * Created by vlpo on 24/04/2015.
 */

public class Manager extends RequestHandler {

    public Manager(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType() == RequestType.RECEIVE_SALARY) {
            processRequest(req);
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Manager ";
    }
}
