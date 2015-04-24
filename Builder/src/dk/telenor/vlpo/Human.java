package dk.telenor.vlpo;

/**
 * Created by vlpo on 24/04/2015.
 */

public class Human {

    private boolean head;
    private boolean brain;
    private boolean body;
    private boolean leftHand;
    private boolean rightHand;
    private boolean leftFoot;
    private boolean rightFoot;

    public boolean isHead() {
        return head;
    }

    public boolean isBrain() {
        return brain;
    }

    public boolean isBody() {
        return body;
    }

    public boolean isLeftHand() {
        return leftHand;
    }

    public boolean isRightHand() {
        return rightHand;
    }

    public boolean isLeftFoot() {
        return leftFoot;
    }

    public boolean isRightFoot() {
        return rightFoot;
    }

    public Human(HumanBuilder builder) {
        this.head = builder.head;
        this.brain = builder.brain;
        this.body = builder.body;
        this.leftHand = builder.leftHand;
        this.rightHand = builder.rightHand;
        this.leftFoot = builder.leftFoot;
        this.rightFoot = builder.rightFoot;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Human build successfully. This instance has: ");
        sb.append(this.head ? "head, " : "no head, ");
        sb.append(this.brain ? "brain, " : "no brain, ");
        sb.append(this.body ? "body, " : "no body, ");
        sb.append(this.leftHand ? "left hand, " : "no left hand, ");
        sb.append(this.rightHand ? "right hand, " : "no right hand, ");
        sb.append(this.leftFoot ? "left foot, " : "no left foot, ");
        sb.append(this.rightFoot ? "right foot, " : "no right foot, ");

        if (sb.lastIndexOf(", ") == sb.length() - 2) {
            sb.delete(sb.length() - 2, sb.length() - 1);
        }

        return sb.toString();
    }

    public static class HumanBuilder {
        private boolean head;
        private boolean brain;
        private boolean body;
        private boolean leftHand;
        private boolean rightHand;
        private boolean leftFoot;
        private boolean rightFoot;

        public HumanBuilder withHead(boolean withHead) {
            this.head = withHead;
            return this;
        }

        public HumanBuilder withBrain(boolean withBrain) {
            this.brain = withBrain;
            return this;
        }

        public HumanBuilder withBody(boolean withBody) {
            this.body = withBody;
            return this;
        }

        public HumanBuilder withLeftHand(boolean withLeftHand) {
            this.leftHand = withLeftHand;
            return this;
        }

        public HumanBuilder withRightHand(boolean withRightHand) {
            this.rightHand = withRightHand;
            return this;
        }

        public HumanBuilder withLeftFoot(boolean withLeftFoot) {
            this.leftFoot = withLeftFoot;
            return this;
        }

        public HumanBuilder withRightFoot(boolean withRightFoot) {
            this.rightFoot = withRightFoot;
            return this;
        }

        public Human build() {
            return new Human(this);
        }


    }
}
