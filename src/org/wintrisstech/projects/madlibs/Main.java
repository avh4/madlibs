package org.wintrisstech.projects.madlibs;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String noun = JOptionPane.showInputDialog("an article of clothing (plural)");
        String color = JOptionPane.showInputDialog("a color");
        String person = JOptionPane.showInputDialog("a famous person");
        String animal = JOptionPane.showInputDialog("a type of animal");
        String place = JOptionPane.showInputDialog("a scary place");

        JOptionPane.showMessageDialog(null,
                "Little " + color + " Riding Hood was walking through " +
                place + "\non her way to " + person + "'s house.  Little did " +
                "she know that a sneaky\n" + animal + " had eaten poor " + person
                + " and was lying in wait for her.");
    }

}
