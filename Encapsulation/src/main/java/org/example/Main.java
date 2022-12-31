package org.example;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("peace", 50);

        System.out.println(player1.looseHealth(10));
        System.out.println(player1.healthStatus());

        Printer panasonic = new Printer(30, 0, false);
        System.out.println(panasonic.fillTonerUp(50));
        System.out.println(panasonic.printPage(41));
    }
}