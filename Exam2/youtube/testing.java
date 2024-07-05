package Exam2.youtube;

public class testing {
    public static void main(String[] args) {
        shoe s = new shoe("Nike", 10.0);  // The original superclass object
        System.out.printf("%s = %.1f\n\n", s.brand, s.size);
        
        running r = new running(12.0, "Adidas", 11.0); // The subclass running object
        System.out.printf("%.1f -> %s = %.1f\n\n", r.weight, r.brand, r.size);
        
        walking w = new walking(true, "Underarmor", 12.0); // The subclass walking object
        System.out.printf("%b -> %s = %.1f", w.gorTex, w.brand, w.size);
    }
}
