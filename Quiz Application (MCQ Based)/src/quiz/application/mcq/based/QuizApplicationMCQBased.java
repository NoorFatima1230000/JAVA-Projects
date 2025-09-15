 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.application.mcq.based;

import java.util.ArrayList;

public class QuizApplicationMCQBased {
    public static void main(String[] args) {
        ArrayList<Question> list = new ArrayList<>();

        list.add(new Question("Capital of Pakistan?", 
                new String[]{"Lahore", "Karachi", "Islamabad", "Multan"}, "Islamabad"));

        list.add(new Question("2 + 2 = ?", 
                new String[]{"3", "4", "5", "6"}, "4"));

        list.add(new Question("Color of sky?", 
                new String[]{"Blue", "Green", "Red", "Yellow"}, "Blue"));

        new QuizFrame(list);
    }
}
