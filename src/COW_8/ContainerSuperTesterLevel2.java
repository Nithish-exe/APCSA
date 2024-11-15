package COW_8;

public class ContainerSuperTesterLevel2
{
    public static boolean testReverse(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {48, 57, 52, 97, 89, 3, 15, 92, 26, 78, 54, 32, 15, 29, 64, 40, 40, 10, 13, 40, 56, 96, 35, 60, 38, 83, 17, };
        int[] arrInput2 = {21, 43, 18, 50, 26, 0, 84, 34, 41, 16, 43, 79, 79, 38, 15, 72, 43, 14, 77, 45, 18, 56, };
        int[] arrResult1 = {17, 83, 38, 60, 35, 96, 56, 40, 13, 10, 40, 40, 64, 29, 15, 32, 54, 78, 26, 92, 15, 3, 89, 97, 52, 57, 48, };
        int[] arrResult2 = {56, 18, 45, 77, 14, 43, 72, 15, 38, 79, 79, 43, 16, 41, 34, 84, 0, 26, 50, 18, 43, 21, };
        
        boolean success = true;
        
        student.setArray(arrInput1);
        student.reverse();
        if(!arraysMatch(student.getArray(), arrResult1)){
            success = false;
            System.out.println("Reverse failed");
        }
        
        student.setArray(arrInput2);
        student.reverse();
        if(!arraysMatch(student.getArray(), arrResult2)){
            success = false;
            System.out.println("Reverse failed");
        }
        
        return success;
    }
    
    public static boolean testFindBiggestValue(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {85, 35, 27, 1, 64, 87, 70, 97, 71, 84, 63, 86, 39, 37, 71, 67, 26, };
        int[] arrInput2 = {71, 60, 34, 37, 80, 17, 77, 89, 86, 43, 47, 98, };
        int biggest1 = 97;
        int biggest2 = 98;
        
        boolean success = true;
        
        student.setArray(arrInput1);
        if(student.findBiggestValue() != biggest1){
            success = false;
            System.out.println("FindBiggestValue failed");
        }
        
        student.setArray(arrInput2);
        if(student.findBiggestValue() != biggest2){
            success = false;
            System.out.println("FindBiggestValue failed");
        }
        
        return success;
    }
    
    public static boolean testFindSmallestValue(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {85, 35, 27, 1, 64, 87, 70, 97, 71, 84, 63, 86, 39, 37, 71, 67, 26, };
        int[] arrInput2 = {7, 60, 34, 37, 80, 17, 77, 89, 86, 43, 47, 99, };
        int smallest1 = 1;
        int smallest2 = 7;
        
        boolean success = true;
        
        student.setArray(arrInput1);
        if(student.findSmallestValue() != smallest1){
            success = false;
            System.out.println("findSmallestValue failed");
        }
        
        student.setArray(arrInput2);
        if(student.findSmallestValue() != smallest2){
            success = false;
            System.out.println("findSmallestValue failed");
        }
        
        return success;
    }
    
    public static boolean testFindRangeOfValues(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {85, 35, 27, 1, 64, 87, 70, 97, 71, 84, 63, 86, 39, 37, 71, 67, 26, };
        int[] arrInput2 = {7, 60, 34, 37, 80, 17, 77, 89, 86, 43, 47, 99, };
        int range1 = 96;
        int range2 = 92;
        
        boolean success = true;
        
        student.setArray(arrInput1);
        if(student.findRangeOfValues() != range1){
            success = false;
            System.out.println("findRangeOfValues failed");
        }
        
        student.setArray(arrInput2);
        if(student.findRangeOfValues() != range2){
            success = false;
            System.out.println("findRangeOfValues failed");
        }
        
        return success;
    }
    
    public static boolean testAppendArrayAtFront(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {85, 35, 27, 1, 64, 87, 70, 97, 71, 84, 63, 86, 39, 37, 71, 67, 26, };
        int[] arrInput2 = {71, 60, 34, 37, 80, 17};
        int[] arrResult1 = {71, 60, 34, 37, 80, 17, 85, 35, 27, 1, 64, 87, 70, 97, 71, 84, 63, 86, 39, 37, 71, 67, 26};
        
        boolean success = true;
        
        student.setArray(arrInput1);
        student.appendArrayAtFront(arrInput2);
        if(!arraysMatch(student.getArray(), arrResult1)){
            success = false;
            System.out.println("AppendArray failed");
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