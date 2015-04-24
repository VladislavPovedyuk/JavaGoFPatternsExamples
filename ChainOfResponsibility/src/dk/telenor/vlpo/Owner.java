package dk.telenor.vlpo;

/**
 * Created by vlpo on 24/04/2015.
 */

public class Owner {

    RequestHandler chain;

    public Owner() {
        buildChain();
    }

    private void buildChain() {
        chain = new Director(new Manager(new Developer(null)));
    }

    public void makeRequest(Request req) {
        chain.handleRequest(req);
    }


}
