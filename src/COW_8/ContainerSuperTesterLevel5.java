package COW_8;

public class ContainerSuperTesterLevel5
{
    public static boolean testMove(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {94, 42, 28, 6, 99, 24, 40, 85, 39, 18, 58, 22, 65, 33, 88, 65, 2, 26, 73, 71, };
        int[] arrInput2 = {22, 40, 79, 97, 25, 99, 8, 30, 9, 17, 52, 47, 21, 96, 87, 15, 19, 23, 68, 19, 93, 41, 29, };
        int[] arrResult1 = {94, 42, 28, 6, 99, 24, 40, 39, 18, 58, 22, 85, 65, 33, 88, 65, 2, 26, 73, 71, };
        int[] arrResult2 = {22, 40, 96, 79, 97, 25, 99, 8, 30, 9, 17, 52, 47, 21, 87, 15, 19, 23, 68, 19, 93, 41, 29, };
        
        boolean success = true;
        
        student.setArray(arrInput1);
        student.move(7, 11);
        if(!arraysMatch(student.getArray(), arrResult1)){
            success = false;
            System.out.println("move forward failed");
        }
        
        student.setArray(arrInput2);
        student.move(13, 2);
        if(!arraysMatch(student.getArray(), arrResult2)){
            success = false;
            System.out.println("move backward failed");
        }
        
        return success;
    }
    
    public static boolean testSwapLargestToFront(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {94, 42, 28, 6, 99, 24, 40, 85, 39, 18, 58, 22, 65, 33, 88, 65, 2, 26, 73, 71, };
        int[] arrInput2 = {22, 40, 79, 7, 25, 9, 8, 30, 9, 17, 52, 47, 21, 6, 87, 15, 19, 23, 68, 19, 3, 41, 29, 88 };
        int[] arrResult1 = {99, 42, 28, 6, 94, 24, 40, 85, 39, 18, 58, 22, 65, 33, 88, 65, 2, 26, 73, 71, };
        int[] arrResult2 = {88, 40, 79, 7, 25, 9, 8, 30, 9, 17, 52, 47, 21, 6, 87, 15, 19, 23, 68, 19, 3, 41, 29, 22 };
        
        boolean success = true;
        
        student.setArray(arrInput1);
        student.swapLargestToFront();
        if(!arraysMatch(student.getArray(), arrResult1)){
            success = false;
            System.out.println("swapLargestToFront failed");
        }
        
        student.setArray(arrInput2);
        student.swapLargestToFront();
        if(!arraysMatch(student.getArray(), arrResult2)){
            success = false;
            System.out.println("swapLargestToFront failed");
        }
        
        return success;
    }
    
    public static boolean testSwapLargestToBack(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {94, 42, 28, 6, 99, 24, 40, 85, 39, 18, 58, 22, 65, 33, 88, 65, 2, 26, 73, 71, };
        int[] arrInput2 = {22, 40, 79, 7, 25, 9, 8, 30, 9, 17, 52, 47, 21, 6, 87, 15, 19, 23, 68, 19, 3, 41, 29, 88 };
        int[] arrResult1 = {94, 42, 28, 6, 71, 24, 40, 85, 39, 18, 58, 22, 65, 33, 88, 65, 2, 26, 73, 99,};
        int[] arrResult2 = {22, 40, 79, 7, 25, 9, 8, 30, 9, 17, 52, 47, 21, 6, 87, 15, 19, 23, 68, 19, 3, 41, 29, 88 };
        
        boolean success = true;
        
        student.setArray(arrInput1);
        student.swapLargestToBack();
        if(!arraysMatch(student.getArray(), arrResult1)){
            success = false;
            System.out.println("swapLargestToBack failed");
        }
        
        student.setArray(arrInput2);
        student.swapLargestToBack();
        if(!arraysMatch(student.getArray(), arrResult2)){
            success = false;
            System.out.println("swapLargestToBack failed");
        }
        
        return success;
    }
    
    public static boolean testRemoveElementsWithinIndexes(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {67, 81, 8, 30, 93, 8, 62, 31, 38, 47, 4, 41, 86, 3, 57, 25, 83, 17, 75, 21, 12, 66, 35, 79, 61, 12, 15, 79, 24, 39, 52, 37, 57, };
        int[] arrInput2 = {71, 60, 34, 37, 80, 17};
        int[] arrResult1 = {67, 81, 8, 30, 93, 8, 62, 31, 38, 47, 4, 83, 17, 75, 21, 12, 66, 35, 79, 61, 12, 15, 79, 24, 39, 52, 37, 57, };
        int[] arrResult2 = {71, 17};
        
        boolean success = true;
        
        student.setArray(arrInput1);
        student.removeElements(11, 15);
        if(!arraysMatch(student.getArray(), arrResult1)){
            success = false;
            System.out.println("RemoveElements Within Indexes failed");
        }
        
        student.setArray(arrInput2);
        student.removeElements(1, 4);
        if(!arraysMatch(student.getArray(), arrResult2)){
            success = false;
            System.out.println("RemoveElements Within Indexes failed");
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