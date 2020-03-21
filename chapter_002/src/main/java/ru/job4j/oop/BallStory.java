package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare hare = new Hare();
        Ball ball = new Ball();
        GrayWolf wolf = new GrayWolf();
        Fox fox = new Fox();

        ball.sing(hare);
        hare.letGo(ball);
        ball.run(wolf);
        wolf.lose(ball);
        ball.trust(fox);
        fox.deceive(ball);
        fox.eat(ball);
    }
}
