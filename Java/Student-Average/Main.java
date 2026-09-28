import java.util.Scanner;

public class Main {
    static String gradeFunction(double avg) {
        if (avg >= 70) {
            return "1st";
        } else if (avg >= 60) {
            return "2:1"; 
        } else if (avg >= 50) {
            return "2:2";
        } else if (avg >= 40) {
            return "3rd";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Module[] modules = {new Module("CSC2031"), new Module("CSC2032"), new Module("CSC2034"), new Module("CSC2035")};
        double total = 0;
        
        for (Module module : modules) {
            System.out.println("Enter grade for " + module.title + ": ");
            module.grade = Integer.parseInt(s.nextLine());
            total += module.grade;
        }
        System.out.println("Your degree classification: " + gradeFunction(total/modules.length));
    }
} 