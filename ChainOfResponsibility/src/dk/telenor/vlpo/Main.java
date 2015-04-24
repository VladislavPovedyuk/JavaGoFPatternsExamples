package dk.telenor.vlpo;

/**
 * Created by vlpo on 24/04/2015.
 */

public class Main {

    public static void main(String[] args) {
        Owner owner = new Owner();
        owner.makeRequest(new Request("Do some hard working stuff", RequestType.WORK));
        owner.makeRequest(new Request("Receive bonuses for good job", RequestType.RECEIVE_SALARY));
        owner.makeRequest(new Request("Go to conference", RequestType.FLY_TO_BAHAMAS));
    }

}
