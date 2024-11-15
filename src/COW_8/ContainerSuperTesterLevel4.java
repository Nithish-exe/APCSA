package COW_8;

public class ContainerSuperTesterLevel4
{
    public static boolean testShiftRight(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {94, 42, 28, 6, 99, 24, 40, 85, 39, 18, 58, 22, 65, 33, 88, 65, 2, 26, 73, 71, };
        int[] arrInput2 = {22, 40, 79, 97, 25, 99, 8, 30, 9, 17, 52, 47, 21, 96, 87, 15, 19, 23, 68, 19, 93, 41, 29, };
        int[] arrResult1 = {71, 94, 42, 28, 6, 99, 24, 40, 85, 39, 18, 58, 22, 65, 33, 88, 65, 2, 26, 73,  };
        int[] arrResult2 = {29, 22, 40, 79, 97, 25, 99, 8, 30, 9, 17, 52, 47, 21, 96, 87, 15, 19, 23, 68, 19, 93, 41,  };
        
        boolean success = true;
        
        student.setArray(arrInput1);
        student.shiftRight();
        if(!arraysMatch(student.getArray(), arrResult1)){
            success = false;
            System.out.println("shiftRight failed");
        }
        
        student.setArray(arrInput2);
        student.shiftRight();
        if(!arraysMatch(student.getArray(), arrResult2)){
            success = false;
            System.out.println("shiftRight failed");
        }
        
        return success;
    }
    
    public static boolean testFindBiggestValueInRangeOfIndexes(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {85, 35, 27, 1, 64, 87, 70, 97, 71, 84, 63, 56, 39, 37, 71, 67, 26, };
        int[] arrInput2 = {71, 60, 34, 37, 80, 17, 77, 89, 86, 43, 47, 98, };
        int biggest1 = 63;
        int biggest2 = 80;
        
        boolean success = true;
        
        student.setArray(arrInput1);
        if(student.findBiggestValueInRangeOfIndexes(10, 13) != biggest1){
            success = false;
            System.out.println("findBiggestValueInRangeOfIndexes failed");
        }
        
        student.setArray(arrInput2);
        if(student.findBiggestValueInRangeOfIndexes(0, 6) != biggest2){
            success = false;
            System.out.println("findBiggestValueInRangeOfIndexes failed");
        }
        
        return success;
    }
    
    public static boolean testFindSmallestValueInRangeOfIndexes(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {85, 35, 27, 1, 64, 87, 70, 97, 71, 84, 63, 86, 39, 37, 71, 67, 26, };
        int[] arrInput2 = {7, 60, 34, 37, 80, 17, 77, 89, 86, 43, 47, 99, };
        int smallest1 = 27;
        int smallest2 = 43;
        
        boolean success = true;
        
        student.setArray(arrInput1);
        if(student.findSmallestValueInRangeOfIndexes(0, 2) != smallest1){
            success = false;
            System.out.println("findSmallestValueInRangeOfIndexes failed");
        }
        
        student.setArray(arrInput2);
        if(student.findSmallestValueInRangeOfIndexes(6, 11) != smallest2){
            success = false;
            System.out.println("findSmallestValueInRangeOfIndexes failed");
        }
        
        return success;
    }
    
    public static boolean testFindRangeOfValuesInRangeOfIndexes(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {85, 35, 27, 1, 64, 87, 70, 97, 71, 84, 63, 86, 39, 37, 71, 67, 26, };
        int[] arrInput2 = {7, 60, 34, 37, 80, 17, 77, 89, 86, 43, 47, 99, };
        int range1 = 45;
        int range2 = 46;
        
        boolean success = true;
        
        student.setArray(arrInput1);
        if(student.findRangeOfValuesInRangeOfIndexes(12, 16) != range1){
            success = false;
            System.out.println("findRangeOfValuesInRangeOfIndexes failed");
        }
        
        student.setArray(arrInput2);
        if(student.findRangeOfValuesInRangeOfIndexes(1, 4) != range2){
            success = false;
            System.out.println("findRangeOfValuesInRangeOfIndexes failed");
        }
        
        return success;
    }
    
    public static boolean testRemoveElements(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {67, 81, 8, 30, 93, 8, 62, 31, 38, 47, 4, 41, 86, 3, 57, 25, 83, 17, 75, 21, 12, 66, 35, 79, 61, 12, 15, 79, 24, 39, 52, 37, 57, };
        int[] arrInput2 = {71, 60, 34, 37, 80, 17};
        int[] arrResult1 = {67, 81, 8, 30, 93, 8, 62, 31, 38, 47, 4, 41, 86, 3, 57, 25, 83, 17, 75, 21, 12, 66, 35,};
        int[] arrResult2 = {71, 60, 34, 37};
        
        boolean success = true;
        
        student.setArray(arrInput1);
        student.removeElements(10);
        if(!arraysMatch(student.getArray(), arrResult1)){
            success = false;
            System.out.println("RemoveElements failed");
        }
        
        student.setArray(arrInput2);
        student.removeElements(2);
        if(!arraysMatch(student.getArray(), arrResult2)){
            success = false;
            System.out.println("RemoveElements failed");
        }
        
        return success;
    }
    
    public static boolean testRemoveElementsFromFront(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {67, 81, 8, 30, 93, 8, 62, 31, 38, 47, 4, 41, 86, 3, 57, 25, 83, 17, 75, 21, 12, 66, 35, 79, 61, 12, 15, 79, 24, 39, 52, 37, 57, };
        int[] arrInput2 = {71, 60, 34, 37, 80, 17};
        int[] arrResult1 = {4, 41, 86, 3, 57, 25, 83, 17, 75, 21, 12, 66, 35, 79, 61, 12, 15, 79, 24, 39, 52, 37, 57, };
        int[] arrResult2 = {34, 37, 80, 17};
        
        boolean success = true;
        
        student.setArray(arrInput1);
        student.removeElementsFromFront(10);
        if(!arraysMatch(student.getArray(), arrResult1)){
            success = false;
            System.out.println("RemoveElementsFromFront failed");
        }
        
        student.setArray(arrInput2);
        student.removeElementsFromFront(2);
        if(!arraysMatch(student.getArray(), arrResult2)){
            success = false;
            System.out.println("RemoveElementsFromFront failed");
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