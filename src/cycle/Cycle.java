package cycle;

public class Cycle {
//task from lesson
    public static boolean isCycle(String str1, String str2) {
        boolean isCycle = false;
        String newStr = str1+str1;
        if (newStr.contains(str2)){
            isCycle = true;
        }
        return isCycle;

    }
}

