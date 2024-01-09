package org.example;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import static org.example.fit_player.*;

public class fit_start {
    //String name,String date,String place,String referce, String umpire
    public static void start(){
        try {
            // 等待UI完全加載
            Robot robot = new Robot();
            robot.mouseMove(1050 , 375);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void start_setName(String name){
        try {
            Thread.sleep(500);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.mouseMove(700 , 115);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            for (char c : name.toCharArray()) {
                int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
                if (Character.isUpperCase(c)) {
                    robot.keyPress(KeyEvent.VK_SHIFT);
                }
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
                if (Character.isUpperCase(c)) {
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                }
            }
            Thread.sleep(500);

        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void start_setDate(String date){
        try {
            Thread.sleep(500);
            Robot robot = new Robot();
            robot.mouseMove(700 , 190);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            for (char c : date.toCharArray()) {
                int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
                if (Character.isUpperCase(c)) {
                    robot.keyPress(KeyEvent.VK_SHIFT);
                }
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
                if (Character.isUpperCase(c)) {
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                }
            }

            Thread.sleep(500);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void start_setPlace(String place){
        try {
            Thread.sleep(500);
            Robot robot = new Robot();
            robot.mouseMove(700 , 265);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            for (char c : place.toCharArray()) {
                int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
                if (Character.isUpperCase(c)) {
                    robot.keyPress(KeyEvent.VK_SHIFT);
                }
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
                if (Character.isUpperCase(c)) {
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                }
            }
            Thread.sleep(500);



        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void start_setReferce(String referce){
        try {
            Thread.sleep(500);
            Robot robot = new Robot();
            robot.mouseMove(700 , 340);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            for (char c : referce.toCharArray()) {
                int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
                if (Character.isUpperCase(c)) {
                    robot.keyPress(KeyEvent.VK_SHIFT);
                }
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
                if (Character.isUpperCase(c)) {
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                }
            }

            Thread.sleep(500);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void start_setUmpire(String umpire){
        try {
            Thread.sleep(500);
            Robot robot = new Robot();
            robot.mouseMove(700 , 375);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            for (char c : umpire.toCharArray()) {
                int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
                if (Character.isUpperCase(c)) {
                    robot.keyPress(KeyEvent.VK_SHIFT);
                }
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
                if (Character.isUpperCase(c)) {
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                }
            }
            Thread.sleep(500);
            robot.mouseMove(1000 , 415);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void set_teamA(int number){
        try {
            Robot robot = new Robot();
            robot.mouseMove(1000, 115);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            robot.mouseMove(1000, 150);
            robot.mouseWheel(-99);
            Thread.sleep(500);
            robot.mouseWheel(number / 3);
            Thread.sleep(500);
            if (number <= 92) {
                robot.mouseMove(1000, 150 + 18 * (number % 3));
            }
            if (number > 92) {
                robot.mouseMove(1000, 150 + 18 * (number - 92));
            }
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            robot.mouseMove(1000 , 190);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        }
        catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void set_teamB(int number){
        try {
            Robot robot = new Robot();
            robot.mouseMove(1000 , 255);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            robot.mouseMove(1000 , 282);
            robot.mouseWheel(-99);
            Thread.sleep(500);
            robot.mouseWheel((int)number/3);
            Thread.sleep(500);
            if(number<=92) {
                robot.mouseMove(1000, 282 + 18 * (number % 3));
            }
            if(number>92){
                robot.mouseMove(1000, 282 + 18 * (number-92));
            }
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            robot.mouseMove(1000 , 340);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        }
        catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}