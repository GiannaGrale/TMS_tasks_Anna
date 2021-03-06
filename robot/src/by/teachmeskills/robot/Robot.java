package src.by.teachmeskills.robot;

import src.by.teachmeskills.robot.hands.IHand;
import src.by.teachmeskills.robot.heads.IHead;
import src.by.teachmeskills.robot.legs.ILeg;

public class Robot implements IRobot {

    private IHead head;
    private IHand hand;
    private ILeg leg;
    private int price;

    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot(){}

    public IHead getHead() {
        return head;
    }
    public void setHead(IHead head) {
        this.head = head;
    }
    public IHand getHand() {
        return hand;
    }
    public void setHand(IHand hand) {
        this.hand = hand;
    }
    public ILeg getLeg() {
        return leg;
    }
    public void setLeg(ILeg leg) {
        this.leg = leg;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPrice() {
        price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }

}
