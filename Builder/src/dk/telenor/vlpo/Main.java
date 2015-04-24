package dk.telenor.vlpo;

/**
 * Created by vlpo on 24/04/2015.
 */

public class Main {

    public static void main(String[] args) {
        Human normalHuman = new Human.HumanBuilder()
                .withHead(true)
                .withBody(true)
                .withBrain(true)
                .withLeftHand(true)
                .withRightHand(true)
                .withLeftFoot(true)
                .withRightFoot(true)
                .build();

        System.out.println(normalHuman);

        Human zombie = new Human.HumanBuilder()
                .withHead(true)
                .withBody(true)
                .withLeftFoot(true)
                .withRightFoot(true)
                .build();

        System.out.println(zombie);

    }

}
