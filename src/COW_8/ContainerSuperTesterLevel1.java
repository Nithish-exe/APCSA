package COW_8;

public class ContainerSuperTesterLevel1
{
    public static boolean testSwap(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {85, 35, 27, 1, 64, 87, 70, 97, 71, 84, 63, 86, 39, 37, 71, 67, 26, };
        int[] arrInput2 = {71, 60, 34, 37, 80, 17, 77, 89, 86, 43, 99, 47, };
        int[] arrResult1 = {85, 35, 27, 1, 64, 37, 70, 97, 71, 84, 63, 86, 39, 87, 71, 67, 26, };
        int[] arrResult2 = {47, 60, 34, 37, 80, 17, 43, 89, 86, 77, 99, 71, };
        
        boolean success = true;
        
        student.setArray(arrInput1);
        student.swap(5, 13);
        if(!arraysMatch(student.getArray(), arrResult1)){
            success = false;
            System.out.println("Basic swap failed");
        }
        
        student.setArray(arrInput2);
        student.swap(9, 6);
        student.swap(0, 11);
        if(!arraysMatch(student.getArray(), arrResult2)){
            success = false;
            System.out.println("Advanced swap failed");
        }
        
        return success;
    }
    
    public static boolean testFindIndexOfBiggest(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {85, 35, 27, 1, 64, 87, 70, 97, 71, 84, 63, 86, 39, 37, 71, 67, 26, };
        int[] arrInput2 = {71, 60, 34, 37, 80, 17, 77, 89, 86, 43, 47, 99, };
        int biggestIndex1 = 7;
        int biggestIndex2 = 11;
        
        boolean success = true;
        
        student.setArray(arrInput1);
        if(student.findIndexOfBiggest() != biggestIndex1){
            success = false;
            System.out.println("findIndexOfBiggest failed");
        }
        
        student.setArray(arrInput2);
        if(student.findIndexOfBiggest() != biggestIndex2){
            success = false;
            System.out.println("findIndexOfBiggest failed");
        }
        
        return success;
    }
    
    public static boolean testFindIndexOfSmallest(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {85, 35, 27, 1, 64, 87, 70, 97, 71, 84, 63, 86, 39, 37, 71, 67, 26, };
        int[] arrInput2 = {7, 60, 34, 37, 80, 17, 77, 89, 86, 43, 47, 99, };
        int smallestIndex1 = 3;
        int smallestIndex2 = 0;
        
        boolean success = true;
        
        student.setArray(arrInput1);
        if(student.findIndexOfSmallest() != smallestIndex1){
            success = false;
            System.out.println("findIndexOfSmallest failed");
        }
        
        student.setArray(arrInput2);
        if(student.findIndexOfSmallest() != smallestIndex2){
            success = false;
            System.out.println("findIndexOfSmallest failed");
        }
        
        return success;
    }
    
    public static boolean testAppendArray(){
        ArrayContainer student = new ArrayContainer();
        
        int[] arrInput1 = {85, 35, 27, 1, 64, 87, 70, 97, 71, 84, 63, 86, 39, 37, 71, 67, 26, };
        int[] arrInput2 = {71, 60, 34, 37, 80, 17};
        int[] arrResult1 = {85, 35, 27, 1, 64, 87, 70, 97, 71, 84, 63, 86, 39, 37, 71, 67, 26, 71, 60, 34, 37, 80, 17};
        
        boolean success = true;
        
        student.setArray(arrInput1);
        student.appendArray(arrInput2);
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
