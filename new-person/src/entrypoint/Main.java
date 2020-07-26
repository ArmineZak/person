package entrypoint;

import service.*;

public class Main {
    public static void main(String[] args) {

        Dancer dancer = new Dancer(" ", " ");
        dancer.eat();
        dancer.learn();
        dancer.walk();
        dancer.dance();

        Singer singer = new Singer(" ", " ");
        singer.learn();
        singer.eat();
        singer.walk();
        singer.playGuitar();

        Programmer programmer = new Programmer(" ", "");
        programmer.eat();
        programmer.learn();
        programmer.walk();
        programmer.code();

    }
}

