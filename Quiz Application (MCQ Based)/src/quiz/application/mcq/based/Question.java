/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application.mcq.based;

public class Question {
    private String question;
    private String[] options;
    private String correctAnswer;

    public Question(String question, String[] options, String correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() { return question; }
    public String[] getOptions() { return options; }
    public String getCorrectAnswer() { return correctAnswer; }
}

    

