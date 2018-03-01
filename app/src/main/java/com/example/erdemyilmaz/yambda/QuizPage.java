package com.example.erdemyilmaz.yambda;

/**
 * Created by erdemyilmaz on 2/27/18.
 */

public class QuizPage {
    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String answerE;


    public void setQuiz(String q, String aa, String ab, String ac, String ad, String ae) {
        this.question = q;
        this.answerA = aa;
        this.answerB = ab;
        this.answerC = ac;
        this.answerD = ad;
        this.answerE = ae;
    }

    public String[] getQuiz() {
        String[] QuizOut = new String[6];
        QuizOut[0] = this.question;
        QuizOut[1] = this.answerA;
        QuizOut[2] = this.answerB;
        QuizOut[3] = this.answerC;
        QuizOut[4] = this.answerD;
        QuizOut[5] = this.answerE;
        return QuizOut;
    }
}
