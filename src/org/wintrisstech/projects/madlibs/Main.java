package org.wintrisstech.projects.madlibs;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String noun = JOptionPane.showInputDialog("an article of clothing (plural)");

        JOptionPane.showMessageDialog(null, "What big " + noun + " you have!");
    }

}
