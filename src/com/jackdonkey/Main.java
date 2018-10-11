package com.jackdonkey;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        try {
            // These coordinates are screen coordinates
            int xCoord = 500;
            int yCoord = 500;

            // Move the cursor
            Robot robot = new Robot();
            robot.mouseMove(xCoord, yCoord);
        } catch (AWTException e) {
           e.printStackTrace();
        }
    }
}
