public class Module {
    public String title;
    public int grade;

    public Module(String ptitle) {
        title = ptitle;
        grade = 0;
    }
    public Module(String ptitle, int pgrade) {
        try {
            if (pgrade > 100 || pgrade < 0) {
                throw new Exception("Grade must be an int >= 0 and <= 100");
            }
        } catch (Exception e) {
        }
        
        title = ptitle;
        grade = pgrade;
    }
}