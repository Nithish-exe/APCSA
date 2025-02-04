public class SlotsTester {
    public static void main(String[] args) {
        testLevel4();
    }

    public static boolean testLevel4() {
        boolean result1 = testSlot();
        boolean result2 = testSpinMachine();
        boolean result3 = testGetWinnings();
        if (result1 && result2 && result3) {
            System.out.println("Level 4 success!");
            return true;
        } else {
            System.out.println("Level 4 error.");
            return false;
        }
    }

    public static boolean testSlot() {
        boolean success = true;
        int size = 9;
        double multiples = 2000;
        int[] results = new int[size];
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            Slot theSlot = new Slot();
            theSlot.spin();
            int result = theSlot.getNumber();
            if (result < 1 || result > 9) {
                System.out.println("slot fails - range");
                return false;
            }
            results[result - 1] += 1;
        }
        for (int i = 0; i < results.length; i++) {
            double offset = Math.abs(results[i] - multiples) / multiples;
            if (offset > .15) {
                System.out.println("slot fails - distribution");
                return false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean testSpinMachine() {
        boolean success = true;
        SlotMachine machine = new SlotMachine();
        int size = 9;
        double multiples = 2000;
        int[] results = new int[size];
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            machine.spinMachine();
            for (int i = 0; i < 3; i++) {
                int result = machine.getSlot(i);
                if (result < 1 || result > 9) {
                    System.out.println("spinMachine fails - range");
                    return false;
                }
                results[result - 1] += 1;
            }
        }
        for (int i = 0; i < results.length; i++) {
            double offset = Math.abs(results[i] - (multiples * 3)) / (multiples * 3);
            if (offset > .15) {
                System.out.println("spinMachine fails - distribution");
                success = false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean testGetWinnings() {
        boolean success = true;
        SlotMachine machine = new SlotMachine();
        machine.setSlots(1, 3, 7);
        if (machine.getWinnings() != 0) {
            success = false;
        }
        machine.setSlots(1, 1, 1);
        if (machine.getWinnings() != 0) {
            success = false;
        }
        machine.setSlots(9, 9, 1);
        if (machine.getWinnings() != 0) {
            success = false;
        }
        machine.setSlots(4, 3, 7);
        if (machine.getWinnings() != 7) {
            success = false;
        }
        machine.setSlots(4, 8, 7);
        if (machine.getWinnings() != 8) {
            success = false;
        }
        machine.setSlots(4, 3, 2);
        if (machine.getWinnings() != 4) {
            success = false;
        }
        machine.setSlots(4, 4, 7);
        if (machine.getWinnings() != 20) {
            success = false;
        }
        machine.setSlots(7, 3, 7);
        if (machine.getWinnings() != 35) {
            success = false;
        }
        machine.setSlots(4, 3, 3);
        if (machine.getWinnings() != 15) {
            success = false;
        }
        machine.setSlots(4, 4, 4);
        if (machine.getWinnings() != 40) {
            success = false;
        }
        machine.setSlots(3, 3, 3);
        if (machine.getWinnings() != 30) {
            success = false;
        }
        machine.setSlots(9, 3, 7);
        if (machine.getWinnings() != 100) {
            success = false;
        }
        machine.setSlots(4, 9, 7);
        if (machine.getWinnings() != 100) {
            success = false;
        }
        machine.setSlots(4, 3, 9);
        if (machine.getWinnings() != 100) {
            success = false;
        }
        machine.setSlots(9, 9, 7);
        if (machine.getWinnings() != 1000) {
            success = false;
        }
        machine.setSlots(9, 3, 9);
        if (machine.getWinnings() != 1000) {
            success = false;
        }
        machine.setSlots(4, 9, 9);
        if (machine.getWinnings() != 1000) {
            success = false;
        }
        machine.setSlots(9, 9, 9);
        if (machine.getWinnings() != 10000) {
            success = false;
        }
        if (success) {
            return true;
        } else {
            System.out.println("getWinnings fails");
            return false;
        }
    }

}
