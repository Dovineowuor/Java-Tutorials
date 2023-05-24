import javax.swing.JOptionPane;

public class Quiz {

    public static void main(String[] args) {
        String question = "When was the first Computer Science program invented,\nby whom and completed by when?\n";
        String A = "a";
        String B = "b";
        String C = "c";
        String D = "d";
        String E = "e";
        
        question += "A. 1672 by Gottfried Wilhelm Leibniz completed 1974\n";
        question += "B. 1972 by Gottfried Wilhelm Leibniz completed 1694\n";
        question += "C. 2010 by Dovine K completed 2022\n";
        question += "D. 1602 by Godfrey Wiliams completed 1974\n";
        question += "E. Not dated\n";
        
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            if (answer == null) {
                // User clicked "Cancel" or closed the dialog
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                JOptionPane.showMessageDialog(null, "Correct!");
                break;
            } else if (answer.equalsIgnoreCase(A) || answer.equalsIgnoreCase(E) || answer.equalsIgnoreCase(C) || answer.equalsIgnoreCase(D)) {
                JOptionPane.showMessageDialog(null, "Almost there, try again.");
            } else {
                JOptionPane.showMessageDialog(null, "Please choose one of the options provided: A, B, C, D, or E.");
            }
        }
    }

}

