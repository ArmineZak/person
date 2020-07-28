package entrypoint;

import core.model.Dancer;
import core.model.Programmer;
import core.model.Singer;


public class Main {
    public static void main(String[] args) {

        Dancer dancer = new Dancer(" ", " ");
        dancer.dance();

        Singer singer = new Singer(" ", " ");
        singer.playGuitar();

        Programmer programmer = new Programmer(" ", "");
        programmer.code();

    }
}

