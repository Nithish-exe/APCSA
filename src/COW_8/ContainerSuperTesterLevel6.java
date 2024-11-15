package COW_8;

public class ContainerSuperTesterLevel6
{
    public static boolean testAppendArrayAtIndex(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {94, 42, 28, 6, 99, 24, 40, 85, 39, 18, 58, 22, 65, 33, 88, 65, 2, 26, 73, 71, };
        int[] arrInput2 = {22, 40, 79, 97, 25, 99, };
        int[] arrResult1 = {94, 42, 28, 6, 99, 24, 40, 85, 39, 22, 40, 79, 97, 25, 99, 18, 58, 22, 65, 33, 88, 65, 2, 26, 73, 71, };
        int[] arrResult2 = {22, 40, 94, 42, 28, 6, 99, 24, 40, 85, 39, 18, 58, 22, 65, 33, 88, 65, 2, 26, 73, 71, 79, 97, 25, 99, };
        
        boolean success = true;
        
        student.setArray(arrInput1);
        student.appendArrayAtIndex(arrInput2, 9);
        if(!arraysMatch(student.getArray(), arrResult1)){
            success = false;
            System.out.println("appendArrayAtIndex failed");
        }
        
        student.setArray(arrInput2);
        student.appendArrayAtIndex(arrInput1, 2);
        if(!arraysMatch(student.getArray(), arrResult2)){
            success = false;
            System.out.println("appendArrayAtIndex failed");
        }
        
        return success;
    }
    
    public static boolean testMoveLargestToFront(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {94, 42, 28, 6, 99, 24, 40, 85, 39, 18, 58, 22, 65, 33, 88, 65, 2, 26, 73, 71, };
        int[] arrInput2 = {22, 40, 79, 7, 25, 9, 8, 30, 9, 17, 52, 47, 21, 6, 87, 15, 19, 23, 68, 19, 3, 41, 29, 8 };
        int[] arrResult1 = {99, 94, 42, 28, 6, 24, 40, 85, 39, 18, 58, 22, 65, 33, 88, 65, 2, 26, 73, 71, };
        int[] arrResult2 = {87, 22, 40, 79, 7, 25, 9, 8, 30, 9, 17, 52, 47, 21, 6, 15, 19, 23, 68, 19, 3, 41, 29, 8 };
        
        boolean success = true;
        
        student.setArray(arrInput1);
        student.moveLargestToFront();
        if(!arraysMatch(student.getArray(), arrResult1)){
            success = false;
            System.out.println("moveLargestToFront failed");
        }
        
        student.setArray(arrInput2);
        student.moveLargestToFront();
        if(!arraysMatch(student.getArray(), arrResult2)){
            success = false;
            System.out.println("moveLargestToFront failed");
        }
        
        return success;
    }
    
    public static boolean testMoveLargestToBack(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {94, 42, 28, 6, 99, 24, 40, 85, 39, 18, 58, 22, 65, 33, 88, 65, 2, 26, 73, 71, };
        int[] arrInput2 = {22, 40, 79, 7, 25, 9, 8, 30, 9, 17, 52, 47, 21, 6, 87, 15, 19, 23, 68, 19, 3, 41, 29, 8 };
        int[] arrResult1 = {94, 42, 28, 6, 24, 40, 85, 39, 18, 58, 22, 65, 33, 88, 65, 2, 26, 73, 71, 99, };
        int[] arrResult2 = {22, 40, 79, 7, 25, 9, 8, 30, 9, 17, 52, 47, 21, 6, 15, 19, 23, 68, 19, 3, 41, 29, 8, 87,};
        
        boolean success = true;
        
        student.setArray(arrInput1);
        student.moveLargestToBack();
        if(!arraysMatch(student.getArray(), arrResult1)){
            success = false;
            System.out.println("moveLargestToBack failed");
        }
        
        student.setArray(arrInput2);
        student.moveLargestToBack();
        if(!arraysMatch(student.getArray(), arrResult2)){
            success = false;
            System.out.println("moveLargestToBack failed");
        }
        
        return success;
    }
    
    public static boolean testRemoveSubArray(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {67, 81, 8, 30, 93, 8, 62, 31, 38, 47, 4, 41, 86, 3, 57, 25, 83, 17, 75, 21, 12, 66, 35, 79, 61, 12, 15, 79, 24, 39, 52, 37, 57, };
        int[] arrInput2 = {71, 60, 34, 37, 80, 17};
        int[] arrResult1 = {67, 81, 8, 30, 93, 8, 62, 31, 38, 47, 4, 83, 17, 75, 21, 12, 66, 35, 79, 61, 12, 15, 79, 24, 39, 52, 37, 57, };
        int[] arrResult1Return = { 41, 86, 3, 57, 25 };
        int[] arrResult2 = {71, 17};
        int[] arrResult2Return = {60, 34, 37, 80};
        
        boolean success = true;
        
        student.setArray(arrInput1);
        int[] returnArray1 = student.removeSubArray(11, 15);
        if(!arraysMatch(student.getArray(), arrResult1) || !arraysMatch(returnArray1, arrResult1Return)){
            success = false;
            System.out.println("removeSubArray failed");
        }
        
        student.setArray(arrInput2);
        int[] returnArray2 = student.removeSubArray(1, 4);
        if(!arraysMatch(student.getArray(), arrResult2) || !arraysMatch(returnArray1, arrResult1Return)){
            success = false;
            System.out.println("removeSubArray failed");
        }
        
        return success;
    }
    
        
    public static boolean arraysMatch(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
