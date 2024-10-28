//package COW3;
//
//import java.awt.*;
//
//public class Level6Tester
//{
//    public static double getLevel6Score(){
//        double score = 0;
//        if(testAddress()){
//            score += .3;
//        }
//        if(testBox()){
//            score += .2;
//        }
//        if(testRobot()){
//            score += .5;
//        }
//        return score;
//    }
//
//    public static void main(String [] arg){
//        testLevel6();
//    }
//
//    public static boolean testLevel6(){
//        boolean one = testAddress();
//        boolean two = testBox();
//        boolean three = testRobot();
//        if(one && two && three){
//            System.out.println("Level 6 works");
//            return true;
//        }else{
//            System.out.println("Level 6 DOES NOT work");
//            return false;
//        }
//    }
//
//    public static boolean testAddress(){
//        Address [] addresses = new Address [6];
//
//        addresses[0] = new Address(1234, "Milky Way Lane", "Sterling", "VA", 20165, "USA");
//
//        addresses[1] = new Address(986, "Glowood Drive", true, 227, "Pittsburgh", "PA", 15227, "USA");
//
//        addresses[2] = new Address(986, "Glowood Drive", true, 228, "Pittsburgh", "PA", 15227, "USA");
//
//        addresses[3] = new Address(986, "Glowood Drive", true, 227, "Richmond", "VA", 15227, "USA");
//
//        addresses[4] = new Address(986, "Glowood Drive", "Pittsburgh", "PA", 15227, "USA");
//
//        addresses[5] = new Address(986, "Glowood Drive", true, 227, "Pittsburgh", "PA", 15227, "USA");
//
//        boolean success = true;
//
//        if(addresses[0].getNumber() != 1234 || addresses[1].getNumber() != 986){
//            success = false;
//            System.out.println("number variable or accessor method not set up correctly!");
//        }
//        if(!addresses[0].getStreet().equals("Milky Way Lane") || !addresses[1].getStreet().equals("Glowood Drive")){
//            success = false;
//            System.out.println("street variable or accessor method not set up correctly!");
//        }
//        if(addresses[0].isApartment() != false || addresses[1].isApartment() != true){
//            success = false;
//            System.out.println("isApartment variable or accessor method not set up correctly!");
//        }
//        if(addresses[0].getApartmentNumber() != 1 || addresses[1].getApartmentNumber() != 227){
//            success = false;
//            System.out.println("apartmentNumber variable or accessor method not set up correctly!");
//        }
//        if(!addresses[0].getCounty().equals("Sterling") || !addresses[1].getCounty().equals("Pittsburgh")){
//            success = false;
//            System.out.println("county variable or accessor method not set up correctly!");
//        }
//        if(!addresses[0].getState().equals("VA") || !addresses[1].getState().equals("PA")){
//            success = false;
//            System.out.println("state variable or accessor method not set up correctly!");
//        }
//        if(addresses[0].getZipCode() != 20165 || addresses[1].getZipCode() != 15227){
//            success = false;
//            System.out.println("zipCode variable or accessor method not set up correctly!");
//        }
//        if(!addresses[0].getCountry().equals("USA") || !addresses[1].getCountry().equals("USA")){
//            success = false;
//            System.out.println("country variable or accessor method not set up correctly!");
//        }
//
//        if(!addresses[0].toString().equals("1234 Milky Way Lane\nSterling, VA 20165\nUSA")){
//            success = false;
//            System.out.println("toString method for non apartments not set up correctly!");
//        }
//
//        if(!addresses[1].toString().equals("986 Glowood Drive, Apt 227\nPittsburgh, PA 15227\nUSA")){
//            success = false;
//            System.out.println("toString method for apartments not set up correctly!");
//        }
//
//        for(int n = 0; n < addresses.length; n++){
//            System.out.println("     Address " + (n+1));
//            System.out.println(addresses[n]);
//            System.out.println();
//        }
//        for(int n = 2; n < addresses.length-1; n++){
//            if(addresses[n].equals(addresses[1])){
//                success = false;
//                System.out.println("False positive for equals");
//            }
//        }
//        if(!addresses[5].equals(addresses[1])){
//            success = false;
//            System.out.println("False negative for equals");
//        }
//
//        return success;
//    }
//
//    public static boolean testBox(){
//        boolean success = true;
//        Box theBox = new Box(200, 300, Color.BLUE, 50, 125);
//        theBox.stretchLeft(33);
//        if(theBox.getX() != 167 || theBox.getWidth() != 83){
//            success = false;
//            System.out.println("stretchLeft does not appear to work!");
//        }
//        theBox = new Box(200, 300, Color.BLUE, 50, 125);
//        theBox.stretchUp(64);
//        if(theBox.getY() != 236 || theBox.getHeight() != 189){
//            success = false;
//            System.out.println("stretchUp does not appear to work!");
//        }
//
//        theBox = new Box(200, 300, Color.BLUE, 50, 125);
//        theBox.stretch(27);
//        if(theBox.getX() != 173 || theBox.getWidth() != 104 || theBox.getY() != 273 || theBox.getHeight() != 179){
//            success = false;
//            System.out.println("stretch does not appear to work!");
//        }
//
//        if(success){
//            System.out.println("Level 6 Box does appear to work!");
//        }else{
//            System.out.println("Level 6 Box does NOT appear to work!");
//        }
//        return success;
//    }
//
//    public static boolean testRobot(){
//        boolean success = true;
//
//        Box leftLeg, rightLeg, body, leftArm, rightArm, head, rightEye, leftEye, mouth;
//        leftLeg = new Box(235, 450, Color.MAGENTA, 40, 150);
//        rightLeg = new Box(325, 450, Color.MAGENTA, 40, 150);
//        body = new Box(225, 250, Color.ORANGE, 150, 200);
//        leftArm = new Box(185, 260, Color.YELLOW, 40, 150);
//        rightArm = new Box(375, 260, Color.YELLOW, 40, 150);
//        head = new Box(255, 190, Color.GRAY, 90, 60);
//        rightEye = new Box(305, 200, Color.GREEN, 30, 15);
//        leftEye = new Box(265, 200, Color.GREEN, 30, 15);
//        mouth = new Box(280, 225, Color.BLUE, 40, 15);
//        Robot bob = new Robot(leftLeg, rightLeg, body, leftArm, rightArm, head, rightEye, leftEye, mouth);
//        String [] bodyPartNames = {"Left Leg", "Right Leg", "Body", "Left Arm", "Right Arm", "Head", "Right Eye", "Left Eye", "Mouth"};
//
//        if(!leftLeg.equals(bob.getBox("Left Leg")) || !rightLeg.equals(bob.getBox("Right Leg")) || !body.equals(bob.getBox("Body")) || !leftArm.equals(bob.getBox("Left Arm")) || !rightArm.equals(bob.getBox("Right Arm")) || !head.equals(bob.getBox("Head")) || !rightEye.equals(bob.getBox("Right Eye")) || !leftEye.equals(bob.getBox("Left Eye")) || !mouth.equals(bob.getBox("Mouth"))){
//            success = false;
//            System.out.println("Constructor for Robot or GetBox method not set up correctly");
//        }
//
//        int [] rightXs = {243, 333, 233, 193, 383, 263, 313, 273, 288};
//        bob.moveRight(8);
//        for(int i = 0; i < bodyPartNames.length; i++){
//            if(bob.getBox(bodyPartNames[i]).getX() != rightXs[i]){
//                success = false;
//                System.out.println("moveRight is not functioning properly for the " + bodyPartNames[i]);
//            }
//        }
//
//        leftLeg = new Box(235, 450, Color.MAGENTA, 40, 150);
//        rightLeg = new Box(325, 450, Color.MAGENTA, 40, 150);
//        body = new Box(225, 250, Color.ORANGE, 150, 200);
//        leftArm = new Box(185, 260, Color.YELLOW, 40, 150);
//        rightArm = new Box(375, 260, Color.YELLOW, 40, 150);
//        head = new Box(255, 190, Color.GRAY, 90, 60);
//        rightEye = new Box(305, 200, Color.GREEN, 30, 15);
//        leftEye = new Box(265, 200, Color.GREEN, 30, 15);
//        mouth = new Box(280, 225, Color.BLUE, 40, 15);
//        bob = new Robot(leftLeg, rightLeg, body, leftArm, rightArm, head, rightEye, leftEye, mouth);
//
//        int [] leftXs = {226, 316, 216, 176, 366, 246, 296, 256, 271};
//        bob.moveLeft(9);
//        for(int i = 0; i < bodyPartNames.length; i++){
//            if(bob.getBox(bodyPartNames[i]).getX() != leftXs[i]){
//                success = false;
//                System.out.println("moveLeft is not functioning properly for the " + bodyPartNames[i]);
//            }
//        }
//
//        leftLeg = new Box(235, 450, Color.MAGENTA, 40, 150);
//        rightLeg = new Box(325, 450, Color.MAGENTA, 40, 150);
//        body = new Box(225, 250, Color.ORANGE, 150, 200);
//        leftArm = new Box(185, 260, Color.YELLOW, 40, 150);
//        rightArm = new Box(375, 260, Color.YELLOW, 40, 150);
//        head = new Box(255, 190, Color.GRAY, 90, 60);
//        rightEye = new Box(305, 200, Color.GREEN, 30, 15);
//        leftEye = new Box(265, 200, Color.GREEN, 30, 15);
//        mouth = new Box(280, 225, Color.BLUE, 40, 15);
//        bob = new Robot(leftLeg, rightLeg, body, leftArm, rightArm, head, rightEye, leftEye, mouth);
//
//        int [] upYs = {440, 440, 240, 250, 250, 180, 190, 190, 215};
//        bob.moveUp(10);
//        for(int i = 0; i < bodyPartNames.length; i++){
//            if(bob.getBox(bodyPartNames[i]).getY() != upYs[i]){
//                success = false;
//                System.out.println("moveUp is not functioning properly for the " + bodyPartNames[i]);
//            }
//        }
//
//        leftLeg = new Box(235, 450, Color.MAGENTA, 40, 150);
//        rightLeg = new Box(325, 450, Color.MAGENTA, 40, 150);
//        body = new Box(225, 250, Color.ORANGE, 150, 200);
//        leftArm = new Box(185, 260, Color.YELLOW, 40, 150);
//        rightArm = new Box(375, 260, Color.YELLOW, 40, 150);
//        head = new Box(255, 190, Color.GRAY, 90, 60);
//        rightEye = new Box(305, 200, Color.GREEN, 30, 15);
//        leftEye = new Box(265, 200, Color.GREEN, 30, 15);
//        mouth = new Box(280, 225, Color.BLUE, 40, 15);
//        bob = new Robot(leftLeg, rightLeg, body, leftArm, rightArm, head, rightEye, leftEye, mouth);
//
//        int [] downYs = {550, 550, 350, 360, 360, 290, 300, 300, 325};
//        bob.moveDown(100);
//        for(int i = 0; i < bodyPartNames.length; i++){
//            if(bob.getBox(bodyPartNames[i]).getY() != downYs[i]){
//                success = false;
//                System.out.println("moveDown is not functioning properly for the " + bodyPartNames[i]);
//            }
//        }
//
//        bob.closeRightEye();
//        bob.closeLeftEye();
//        if(rightEye.getHeight() != 0 || leftEye.getHeight() != 0){
//            success = false;
//            System.out.println("eye closing methods do not appear to be working");
//        }
//
//        bob.openRightEye(5);
//        bob.openLeftEye(5);
//        if(rightEye.getHeight() != 10 || leftEye.getHeight() != 10){
//            success = false;
//            System.out.println("eye opening methods do not appear to be working");
//        }
//
//        leftLeg = new Box(235, 450, Color.MAGENTA, 40, 150);
//        rightLeg = new Box(325, 450, Color.MAGENTA, 40, 150);
//        body = new Box(225, 250, Color.ORANGE, 150, 200);
//        leftArm = new Box(185, 260, Color.YELLOW, 40, 150);
//        rightArm = new Box(375, 260, Color.YELLOW, 40, 150);
//        head = new Box(255, 190, Color.GRAY, 90, 60);
//        rightEye = new Box(305, 200, Color.GREEN, 30, 15);
//        leftEye = new Box(265, 200, Color.GREEN, 30, 15);
//        mouth = new Box(280, 225, Color.BLUE, 40, 15);
//        bob = new Robot(leftLeg, rightLeg, body, leftArm, rightArm, head, rightEye, leftEye, mouth);
//
//        int [] upYs2 = {435, 435, 235, 245, 245, 175, 185, 185, 210};
//        bob.growLegs(15);
//        for(int i = 0; i < bodyPartNames.length; i++){
//            if(bob.getBox(bodyPartNames[i]).getY() != upYs2[i]){
//                success = false;
//                System.out.println("growLegs is not functioning properly, positioning off for the " + bodyPartNames[i]);
//            }
//        }
//        if(rightLeg.getHeight() != 165 || leftLeg.getHeight() != 165){
//            success = false;
//            System.out.println("growLegs is not functioning properly, height of legs inaccurate");
//        }
//
//        leftLeg = new Box(235, 450, Color.MAGENTA, 40, 150);
//        rightLeg = new Box(325, 450, Color.MAGENTA, 40, 150);
//        body = new Box(225, 250, Color.ORANGE, 150, 200);
//        leftArm = new Box(185, 260, Color.YELLOW, 40, 150);
//        rightArm = new Box(375, 260, Color.YELLOW, 40, 150);
//        head = new Box(255, 190, Color.GRAY, 90, 60);
//        rightEye = new Box(305, 200, Color.GREEN, 30, 15);
//        leftEye = new Box(265, 200, Color.GREEN, 30, 15);
//        mouth = new Box(280, 225, Color.BLUE, 40, 15);
//        bob = new Robot(leftLeg, rightLeg, body, leftArm, rightArm, head, rightEye, leftEye, mouth);
//
//        bob.swivelArms();
//        if(leftArm.getY() != 130 || rightArm.getY() != 130 || leftArm.getHeight() != 150 || leftArm.getHeight() != 150){
//            success = false;
//            System.out.println("swivelArms is not working properly");
//        }
//
//        bob.swivelArms();
//        if(leftArm.getY() != 260 || rightArm.getY() != 260 || leftArm.getHeight() != 150 || leftArm.getHeight() != 150){
//            success = false;
//            System.out.println("swivelArms is not working properly");
//        }
//
//        if(success){
//            System.out.println("Level 6 Robot does appear to work!");
//        }else{
//            System.out.println("Level 6 Robot does NOT appear to work!");
//        }
//        return success;
//    }
//}
