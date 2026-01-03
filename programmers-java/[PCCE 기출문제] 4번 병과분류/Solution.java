import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String lastFourWords = code.substring(code.length()-4, code.length());

        if(lastFourWords.equals("_eye")) {
            System.out.println("Ophthalmologyc");
        }
        else if(lastFourWords.equals("head")) {
            System.out.println("Neurosurgery");
        }
        else if(lastFourWords.equals("infl")) {
            System.out.println("Orthopedics");
        }
        else if(lastFourWords.equals("skin")) {
            System.out.println("Dermatology");
        }
        else {
            System.out.println("direct recommendation");
        }
        /*
        switch (lastFourWords) {
            case "_eye" -> System.out.println("Ophthalmologyc");
            case "head" -> System.out.println("Neurosurgery");
            case "infl" -> System.out.println("Orthopedics");
            case "skin" -> System.out.println("Dermatology");
            default -> System.out.println("direct recommendation");
        }
        */
    }
}