package COW_8;

public class ContainerSuperTesterLevel3
{
    public static boolean testShiftLeft(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {94, 42, 28, 6, 99, 24, 40, 85, 39, 18, 58, 22, 65, 33, 88, 65, 2, 26, 73, 71, };
        int[] arrInput2 = {22, 40, 79, 97, 25, 99, 8, 30, 9, 17, 52, 47, 21, 96, 87, 15, 19, 23, 68, 19, 93, 41, 29, };
        int[] arrResult1 = {42, 28, 6, 99, 24, 40, 85, 39, 18, 58, 22, 65, 33, 88, 65, 2, 26, 73, 71, 94, };
        int[] arrResult2 = {40, 79, 97, 25, 99, 8, 30, 9, 17, 52, 47, 21, 96, 87, 15, 19, 23, 68, 19, 93, 41, 29, 22, };
        
        boolean success = true;
        
        student.setArray(arrInput1);
        student.shiftLeft();
        if(!arraysMatch(student.getArray(), arrResult1)){
            success = false;
            System.out.println("shiftLeft failed");
        }
        
        student.setArray(arrInput2);
        student.shiftLeft();
        if(!arraysMatch(student.getArray(), arrResult2)){
            success = false;
            System.out.println("shiftLeft failed");
        }
        
        return success;
    }
    
    public static boolean testFindIndexOfBiggestInRangeOfIndexes(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {85, 35, 27, 1, 64, 87, 70, 97, 71, 84, 63, 56, 39, 37, 71, 67, 26, };
        int[] arrInput2 = {71, 60, 34, 37, 80, 17, 77, 89, 86, 43, 47, 98, };
        int biggest1 = 10;
        int biggest2 = 4;
        
        boolean success = true;
        
        student.setArray(arrInput1);
        if(student.findIndexOfBiggestInRangeOfIndexes(10, 13) != biggest1){
            success = false;
            System.out.println("IndexOfBiggestInRangeOfIndexes failed");
        }
        
        student.setArray(arrInput2);
        if(student.findIndexOfBiggestInRangeOfIndexes(0, 6) != biggest2){
            success = false;
            System.out.println("IndexOfBiggestInRangeOfIndexes failed");
        }
        
        return success;
    }
    
    public static boolean testFindIndexOfSmallestInRangeOfIndexes(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {85, 35, 27, 1, 64, 87, 70, 97, 71, 84, 63, 86, 39, 37, 71, 67, 26, };
        int[] arrInput2 = {7, 60, 34, 37, 80, 17, 77, 89, 86, 43, 47, 99, };
        int smallest1 = 2;
        int smallest2 = 9;
        
        boolean success = true;
        
        student.setArray(arrInput1);
        if(student.findIndexOfSmallestInRangeOfIndexes(0, 2) != smallest1){
            success = false;
            System.out.println("findIndexOfSmallestInRangeOfIndexes failed");
        }
        
        student.setArray(arrInput2);
        if(student.findIndexOfSmallestInRangeOfIndexes(6, 11) != smallest2){
            success = false;
            System.out.println("findIndexOfSmallestInRangeOfIndexes failed");
        }
        
        return success;
    }
    
    public static boolean testGetSubArray(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {85, 35, 27, 1, 64, 87, 70, 97, 71, 84, 63, 86, 39, 37, 71, 67, 26, };
        int[] arrInput2 = {71, 60, 34, 37, 80, 17};
        int[] arrResult1 = {87, 70, 97, 71, 84, 63};
        int[] arrResult2 = {60, 34, 37, 80, 17};
        
        boolean success = true;
        
        student.setArray(arrInput1);
        if(!arraysMatch(student.getSubArray(5, 10), arrResult1)){
            success = false;
            System.out.println("GetSubArray failed");
        }
        
        student.setArray(arrInput2);
        if(!arraysMatch(student.getSubArray(1, 5), arrResult2)){
            success = false;
            System.out.println("GetSubArray failed");
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