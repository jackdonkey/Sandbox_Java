package com.jackdonkey;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        try {
            // These coordinates are screen coordinates
            int xCord = 500;
            int yCord = 500;

            // Move the cursor
            Robot robot = new Robot();
            robot.mouseMove(xCord, yCord);
        } catch (AWTException e) {
           e.printStackTrace();
        }
    }
}
