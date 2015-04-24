package dk.telenor.vlpo;

/**
 * Created by vlpo on 24/04/2015.
 */

public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request req) {
        if (next != null) {
            next.handleRequest(req);
        }
    }

    protected void processRequest(Request req) {
        System.out.println(this + "handling request \"" + req + "\"");
    }

    @Override
    public abstract String toString();

}
