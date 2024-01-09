package org.example;
import java.awt.*;
import java.awt.event.InputEvent;

public class fit_player {
    public static void player_A1(){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(480 , 180);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void player_A2(){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(610 , 180);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void player_A3(){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(740 , 180);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void player_A4(){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(480 , 335);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void player_A5(){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(610 , 335);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void team_A_record(int C0_S1){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(740 , 335);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            if(C0_S1 == 0){
                robot.mouseMove(900 , 435);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
            if(C0_S1 == 1){
                robot.mouseMove(1100 , 435);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void player_B1(){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(870 , 180);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void player_B2(){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(1000 , 180);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void player_B3(){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(1130 , 180);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void player_B4(){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(870 , 335);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void player_B5(){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(1000 , 335);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void team_B_record(int C0_S1){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(1130 , 335);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            if(C0_S1 == 0){
                robot.mouseMove(900 , 435);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
            if(C0_S1 == 1){
                robot.mouseMove(1100 , 435);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void player_score(int point,int ast,int G0_F1,int C0_S1){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(550 , 180);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            if(point ==2){
                robot.mouseMove(1000 , 180);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
                robot.mouseMove(1000 , 240);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
            if(point ==3){
                robot.mouseMove(1000 , 180);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
                robot.mouseMove(1000 , 260);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
            if(G0_F1 ==1){
                robot.mouseMove(1000 , 370);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
                robot.mouseMove(1000 , 445);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
            if(C0_S1 == 0){
                robot.mouseMove(900 , 435);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
            if(C0_S1 == 1){
                robot.mouseMove(1100 , 435);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void player_mistake(int C0_S1){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(815 , 180);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            if(C0_S1 == 0){
                robot.mouseMove(900 , 435);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
            if(C0_S1 == 1){
                robot.mouseMove(1100 , 435);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void player_foul(int C0_S1){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(1075 , 180);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            if(C0_S1 == 0){
                robot.mouseMove(900 , 435);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
            if(C0_S1 == 1){
                robot.mouseMove(1100 , 435);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void player_steal(int C0_S1){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(550 , 335);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            if(C0_S1 == 0){
                robot.mouseMove(900 , 435);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
            if(C0_S1 == 1){
                robot.mouseMove(1100 , 435);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void player_rebound(int offense0_defense1,int C0_S1){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(815 , 335);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            if(offense0_defense1 == 1){
                robot.mouseMove(1000 , 250);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
                robot.mouseMove(1000 , 435);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
            if(C0_S1 == 0){
                robot.mouseMove(900 , 435);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
            if(C0_S1 == 1){
                robot.mouseMove(1100 , 435);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void player_substitution(int number,int C0_S1){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(1075 , 335);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            robot.mouseMove(1000 , 250);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            robot.mouseMove(1000 , 415);
            robot.mouseWheel((int)number/3);
            Thread.sleep(500);
            if(number<=92) {
                robot.mouseMove(1000, 415 + 18 * (number % 3));
            }
            if(number>92){
                robot.mouseMove(1000, 415 + 18 * (number-92));
            }
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
            if(C0_S1 == 0){
                robot.mouseMove(900 , 435);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
            if(C0_S1 == 1){
                robot.mouseMove(1100 , 435);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(500);
            }
            Thread.sleep(500);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void player_cancel(){
        try {
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.mouseMove(1075 , 435);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}