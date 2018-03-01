package com.example.erdemyilmaz.yambda;

/**
 * Created by erdemyilmaz on 2/27/18.
 */
public class QuizAfterSurgery {
    public QuizDatabase QDB = new QuizDatabase();
    private QuizPage QP = new QuizPage();
    public int quizId = 412;
    public int numOfQuestions = 8;

    private String[] SS = new String[6];

    private String[][] quizDatabase() {
        String[][] DB = new String[numOfQuestions][6];

        // SET empty
        for (int i=0; i<numOfQuestions;i++) {
            for (int j=0; j<6;j++){
                DB[i][j]="notValid";
            }
        }

        DB[0][0] = "Ways to decrease your chances of an infection after surgery include";
        DB[0][1] = "A- Keeping a good diet as recommended by your doctor,nurse, and nutritionist";
        DB[0][2] = "B- Taking all your medications as prescribed";
        DB[0][3] = "C- Monitoring how your surgical site looks";
        DB[0][4] = "D- Staying well hydrated and fed";
        DB[0][5] = "E- All of the above";

        DB[1][0] = "What is in an infection?";
        DB[1][1] = "A- When you have a fever";
        DB[1][2] = "B- Having a stomach ache";
        DB[1][3] = "C- Having bacteria invade some of your body’s tissues (for example, an area of skin)";
        DB[1][4] = "D- Having a cough";

        DB[2][0] = "It's possible to completely elimnate risk of infection after a surgery";
        DB[2][1] = "TRUE";
        DB[2][2] = "FALSE";

        DB[3][0] = "Good nutrition after surgery is important for healing after your surgery\n";
        DB[3][1] = "TRUE";
        DB[3][2] = "FALSE";

        DB[4][0] = "Stomach problems after surgery are common because of anesthesia";
        DB[4][1] = "TRUE";
        DB[4][2] = "FALSE";


        DB[5][0] = "Stomach problems usually go away soon after surgery";
        DB[5][1] = "TRUE";
        DB[5][2] = "FALSE";


        DB[6][0] = "This is q7";
        DB[6][1] = "A1-1";
        DB[6][2] = "A1";
        DB[6][3] = "A1";
        DB[6][4] = "A1";
        DB[6][5] = "A1";

        DB[7][0] = "This is q8";
        DB[7][1] = "A1-1";
        DB[7][2] = "A1";
        DB[7][3] = "A1";
        DB[7][4] = "A1";
        DB[7][5] = "A1";

        return DB;
    }

    public  QuizAfterSurgery()
    {
        String[][] myDB = quizDatabase();
        String[] SS = new String[6];

        for(int i=0; i<numOfQuestions; i++){
            for (int j=0; j<6; j++) {
                SS[j] = myDB[i][j];
            }
            addArrayToTheQuiz(SS);
        }

    }

    private void addArrayToTheQuiz(String[] mnm) {
        QP = new QuizPage();
        QP.setQuiz(mnm[0],mnm[1],mnm[2],mnm[3],mnm[4],mnm[5]);
        QDB.QL.add(QP);
    }
}
