package COW2;

public class BranchTesterLevel3
{
    public static double getLevel3Score(){
        double score = 0;
        if(testgetLetter()){
            score += .2;
        }
        if(testwhatsTheFine()){
            score += .2;
        }
        if(testWhatIsMyBaseSalary()){
            score += .2;
        }
        if(testWhatHogwartsHouse()){
            score += .2;
        }
        if(testGetNumberOfMonth()){
            score += .2;
        }
        return score;
    }
    
    public static void main(String [] arg){
        testLevel3();
    }

    public static boolean testLevel3(){
        boolean one = testgetLetter();
        boolean two = testwhatsTheFine();
        boolean three = testWhatIsMyBaseSalary();
        boolean four = testWhatHogwartsHouse();
        boolean five = testGetNumberOfMonth();
        if(one && two && three && four && five){
            System.out.println("Level 3 works");
            return true;
        }else{
            System.out.println("Level 3 DOES NOT work");
            return false;
        }
    }

    public static boolean testgetLetter(){
        Grader student = new Grader(); 
        boolean output = true;

        double [] grades = {0.0, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5, 6.0, 6.5, 7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 12.5, 13.0, 13.5, 14.0, 14.5, 15.0, 15.5, 16.0, 16.5, 17.0, 17.5, 18.0, 18.5, 19.0, 19.5, 20.0, 20.5, 21.0, 21.5, 22.0, 22.5, 23.0, 23.5, 24.0, 24.5, 25.0, 25.5, 26.0, 26.5, 27.0, 27.5, 28.0, 28.5, 29.0, 29.5, 30.0, 30.5, 31.0, 31.5, 32.0, 32.5, 33.0, 33.5, 34.0, 34.5, 35.0, 35.5, 36.0, 36.5, 37.0, 37.5, 38.0, 38.5, 39.0, 39.5, 40.0, 40.5, 41.0, 41.5, 42.0, 42.5, 43.0, 43.5, 44.0, 44.5, 45.0, 45.5, 46.0, 46.5, 47.0, 47.5, 48.0, 48.5, 49.0, 49.5, 50.0, 50.5, 51.0, 51.5, 52.0, 52.5, 53.0, 53.5, 54.0, 54.5, 55.0, 55.5, 56.0, 56.5, 57.0, 57.5, 58.0, 58.5, 59.0, 59.5, 60.0, 60.5, 61.0, 61.5, 62.0, 62.5, 63.0, 63.5, 64.0, 64.5, 65.0, 65.5, 66.0, 66.5, 67.0, 67.5, 68.0, 68.5, 69.0, 69.5, 70.0, 70.5, 71.0, 71.5, 72.0, 72.5, 73.0, 73.5, 74.0, 74.5, 75.0, 75.5, 76.0, 76.5, 77.0, 77.5, 78.0, 78.5, 79.0, 79.5, 80.0, 80.5, 81.0, 81.5, 82.0, 82.5, 83.0, 83.5, 84.0, 84.5, 85.0, 85.5, 86.0, 86.5, 87.0, 87.5, 88.0, 88.5, 89.0, 89.5, 90.0, 90.5, 91.0, 91.5, 92.0, 92.5, 93.0, 93.5, 94.0, 94.5, 95.0, 95.5, 96.0, 96.5, 97.0, 97.5, 98.0, 98.5, 99.0, 99.5, 100.0, };
        String [] results = {"F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A", "A"};

        for(int i = 0; i < grades.length; i++){
            if(!student.getLetter(grades[i]).equals(results[i])){
                System.out.println("getLetter failed, " + "getLetter(" + grades[i] + ")" + " results in " + student.getLetter(grades[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("getLetter works");
        }else{
            System.out.println("getLetter does not work");
        }
        return output;
    }

    public static boolean testwhatsTheFine(){
        Cop student = new Cop(); 
        boolean output = true;

        double [] speeds = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 7.5, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 12.5, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 15.0, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 17.5, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 20.0, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 22.5, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 25.0, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 27.5, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 30.0, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 32.5, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 35.0, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 37.5, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 40.0, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 42.5, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 45.0, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 47.5, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 52.5, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 55.0, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 57.5, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 62.5, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 65.0, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 67.5, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 72.5, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 75.0, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 77.5, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 82.5, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 87.5, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 92.5, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 97.5, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, };
	double [] speedLimits = {20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, 20.0, 20.0, 25.0, 25.0, 30.0, 30.0, 35.0, 35.0, 40.0, 40.0, 45.0, 45.0, 50.0, 50.0, 55.0, 55.0, 60.0, 60.0, 65.0, 65.0, 70.0, 70.0, 75.0, 75.0, 80.0, 80.0, };
	boolean [] isOnHighways = {true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, };
	Double [] results = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 145.0, 145.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 170.0, 170.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 195.0, 195.0, 145.0, 145.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 220.0, 5000.0, 170.0, 170.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 245.0, 5000.0, 195.0, 195.0, 145.0, 145.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 270.0, 5000.0, 220.0, 5000.0, 170.0, 170.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 295.0, 5000.0, 245.0, 5000.0, 195.0, 195.0, 145.0, 145.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5000.0, 5000.0, 270.0, 5000.0, 220.0, 5000.0, 170.0, 170.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5000.0, 5000.0, 295.0, 5000.0, 245.0, 5000.0, 195.0, 195.0, 145.0, 145.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5000.0, 5000.0, 5000.0, 5000.0, 270.0, 5000.0, 220.0, 5000.0, 170.0, 170.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5000.0, 5000.0, 5000.0, 5000.0, 295.0, 5000.0, 245.0, 5000.0, 195.0, 195.0, 145.0, 145.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 270.0, 5000.0, 220.0, 5000.0, 170.0, 170.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 295.0, 5000.0, 245.0, 5000.0, 195.0, 195.0, 145.0, 145.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 270.0, 5000.0, 220.0, 5000.0, 170.0, 170.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 295.0, 5000.0, 245.0, 5000.0, 195.0, 195.0, 145.0, 145.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 270.0, 5000.0, 220.0, 5000.0, 170.0, 170.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 295.0, 5000.0, 245.0, 5000.0, 195.0, 195.0, 145.0, 145.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 270.0, 5000.0, 220.0, 5000.0, 170.0, 170.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 295.0, 5000.0, 245.0, 5000.0, 195.0, 195.0, 145.0, 145.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 270.0, 5000.0, 220.0, 5000.0, 170.0, 170.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 295.0, 5000.0, 245.0, 5000.0, 195.0, 195.0, 145.0, 145.0, 0.0, 0.0, 0.0, 0.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 270.0, 5000.0, 220.0, 5000.0, 170.0, 170.0, 0.0, 0.0, 0.0, 0.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 295.0, 5000.0, 245.0, 5000.0, 195.0, 195.0, 145.0, 145.0, 0.0, 0.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 270.0, 5000.0, 220.0, 5000.0, 170.0, 170.0, 0.0, 0.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 295.0, 5000.0, 245.0, 5000.0, 195.0, 195.0, 145.0, 145.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 270.0, 5000.0, 220.0, 5000.0, 170.0, 170.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 295.0, 5000.0, 245.0, 5000.0, 195.0, 195.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 270.0, 5000.0, 220.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 295.0, 5000.0, 245.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 270.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 295.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, 5000.0, };

        for(int i = 0; i < results.length; i++){
            if(student.whatsTheFine(speeds[i], speedLimits[i], isOnHighways[i]) != results[i]){
                System.out.println("whatsTheFine failed, " + "whatsTheFine(" + speeds[i] + ", " + speedLimits[i] + "," + isOnHighways[i] + ")" + " results in " + student.whatsTheFine(speeds[i], speedLimits[i], isOnHighways[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("whatsTheFine works");
        }else{
            System.out.println("whatsTheFine does not work");
        }
        return output;
    }

    public static boolean testWhatIsMyBaseSalary(){
        PayRoll student = new PayRoll(); 
        boolean output = true;

        String [] degrees = {"Doctorate", "Masters", "Bachelors", "Associates", "No Degree"};
        double [] results = {100000.0, 60000.0, 40000.0, 25000.0, 15000.0, };

        for(int i = 0; i < degrees.length; i++){
            if(Math.abs(student.whatIsMyBaseSalary(degrees[i]) - results[i]) > .01){
                System.out.println("whatIsMyBaseSalary failed, " + "whatIsMyBaseSalary(" + degrees[i] + ")" + " results in " + student.whatIsMyBaseSalary(degrees[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("whatIsMyBaseSalary works");
        }else{
            System.out.println("whatIsMyBaseSalary does not work");
        }
        return output;
    }

        public static boolean testWhatHogwartsHouse(){
        Hogwarts student = new Hogwarts(); 
        boolean output = true;

        int [] dedications = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, };
        int [] intelligences = {25, 25, 25, 25, 25, 25, 50, 50, 50, 50, 50, 50, 75, 75, 75, 75, 75, 75, 100, 100, 100, 100, 100, 100, 0, 0, 0, 0, 0, 0, 50, 50, 50, 50, 50, 50, 75, 75, 75, 75, 75, 75, 100, 100, 100, 100, 100, 100, 0, 0, 0, 0, 0, 0, 25, 25, 25, 25, 25, 25, 75, 75, 75, 75, 75, 75, 100, 100, 100, 100, 100, 100, 0, 0, 0, 0, 0, 0, 25, 25, 25, 25, 25, 25, 50, 50, 50, 50, 50, 50, 100, 100, 100, 100, 100, 100, 0, 0, 0, 0, 0, 0, 25, 25, 25, 25, 25, 25, 50, 50, 50, 50, 50, 50, 75, 75, 75, 75, 75, 75, };
        int [] braveries = {50, 50, 75, 75, 100, 100, 25, 25, 75, 75, 100, 100, 25, 25, 50, 50, 100, 100, 25, 25, 50, 50, 75, 75, 50, 50, 75, 75, 100, 100, 0, 0, 75, 75, 100, 100, 0, 0, 50, 50, 100, 100, 0, 0, 50, 50, 75, 75, 25, 25, 75, 75, 100, 100, 0, 0, 75, 75, 100, 100, 0, 0, 25, 25, 100, 100, 0, 0, 25, 25, 75, 75, 25, 25, 50, 50, 100, 100, 0, 0, 50, 50, 100, 100, 0, 0, 25, 25, 100, 100, 0, 0, 25, 25, 50, 50, 25, 25, 50, 50, 75, 75, 0, 0, 50, 50, 75, 75, 0, 0, 25, 25, 75, 75, 0, 0, 25, 25, 50, 50, };
        int [] ambitions = {75, 100, 50, 100, 50, 75, 75, 100, 25, 100, 25, 75, 50, 100, 25, 100, 25, 50, 50, 75, 25, 75, 25, 50, 75, 100, 50, 100, 50, 75, 75, 100, 0, 100, 0, 75, 50, 100, 0, 100, 0, 50, 50, 75, 0, 75, 0, 50, 75, 100, 25, 100, 25, 75, 75, 100, 0, 100, 0, 75, 25, 100, 0, 100, 0, 25, 25, 75, 0, 75, 0, 25, 50, 100, 25, 100, 25, 50, 50, 100, 0, 100, 0, 50, 25, 100, 0, 100, 0, 25, 25, 50, 0, 50, 0, 25, 50, 75, 25, 75, 25, 50, 50, 75, 0, 75, 0, 50, 25, 75, 0, 75, 0, 25, 25, 50, 0, 50, 0, 25, };
        String [] results = {"Slytherin", "Slytherin", "Gryffindor", "Slytherin", "Gryffindor", "Gryffindor", "Slytherin", "Slytherin", "Gryffindor", "Slytherin", "Gryffindor", "Gryffindor", "Ravenclaw", "Slytherin", "Ravenclaw", "Slytherin", "Gryffindor", "Gryffindor", "Ravenclaw", "Ravenclaw", "Ravenclaw", "Ravenclaw", "Ravenclaw", "Ravenclaw", "Slytherin", "Slytherin", "Gryffindor", "Slytherin", "Gryffindor", "Gryffindor", "Slytherin", "Slytherin", "Gryffindor", "Slytherin", "Gryffindor", "Gryffindor", "Ravenclaw", "Slytherin", "Ravenclaw", "Slytherin", "Gryffindor", "Gryffindor", "Ravenclaw", "Ravenclaw", "Ravenclaw", "Ravenclaw", "Ravenclaw", "Ravenclaw", "Slytherin", "Slytherin", "Gryffindor", "Slytherin", "Gryffindor", "Gryffindor", "Slytherin", "Slytherin", "Gryffindor", "Slytherin", "Gryffindor", "Gryffindor", "Ravenclaw", "Slytherin", "Ravenclaw", "Slytherin", "Gryffindor", "Gryffindor", "Ravenclaw", "Ravenclaw", "Ravenclaw", "Ravenclaw", "Ravenclaw", "Ravenclaw", "Hufflepuff", "Slytherin", "Hufflepuff", "Slytherin", "Gryffindor", "Gryffindor", "Hufflepuff", "Slytherin", "Hufflepuff", "Slytherin", "Gryffindor", "Gryffindor", "Hufflepuff", "Slytherin", "Hufflepuff", "Slytherin", "Gryffindor", "Gryffindor", "Ravenclaw", "Ravenclaw", "Ravenclaw", "Ravenclaw", "Ravenclaw", "Ravenclaw", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", "Hufflepuff", };

        for(int i = 0; i < dedications.length; i++){
            if(!(student.whatHogwartsHouse(dedications[i], intelligences[i], braveries[i], ambitions[i]).equals(results[i]))){
                System.out.println("whatHogwartsHouse failed, " + "whatHogwartsHouse(" + dedications[i] + ", " + intelligences[i] + ", " + braveries[i] + ", " + ambitions[i] +")" + " results in " + student.whatHogwartsHouse(dedications[i], intelligences[i], braveries[i], ambitions[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("whatHogwartsHouse works");
        }else{
            System.out.println("whatHogwartsHouse does not work");
        }
        return output;
    }

    public static boolean testGetNumberOfMonth(){
        Calendar student = new Calendar(); 
        boolean output = true;

        String [] monthInText = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int [] results = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for(int i = 0; i < monthInText.length; i++){
            if(student.getNumberOfMonth(monthInText[i]) != results[i]){
                System.out.println("getNumberOfMonth failed, " + "getNumberOfMonth(" + monthInText[i] + ")" + " results in " + student.getNumberOfMonth(monthInText[i]) + ", not equal to " + results[i]);
                output = false;
            }
        }

        if(output){
            System.out.println("getNumberOfMonth works");
        }else{
            System.out.println("getNumberOfMonth does not work");
        }
        return output;
    }


    
}
