package com.miniproj.WomensCompanion.ui.depression;

public class depressionQuestionModel {

    public String[] mQues = {
            "1. I have been able to laugh and see the funny side of things",
            "2. I have looked forward with enjoyment to things",
            "3. I have blamed myself unnecessarily when things went wrong",
            "4. I have been anxious or worried for no good reason",
            "5. I have felt scared or panicky for no very good reason",
            "6. I have been feeling that things have been getting on top of me",
            "7. I have been so unhappy that I have had difficulty sleeping",
            "8. I have felt sad or miserable",
            "9. I have been so unhappy that I have been crying"
    };

    private String[][] mChoices = {
            {"Not at all sure", "Several days", "Over half the days", "Nearly every day"},
            {"Not at all sure", "Several days", "Over half the days", "Nearly every day"},
            {"Not at all sure", "Several days", "Over half the days", "Nearly every day"},
            {"Not at all sure", "Several days", "Over half the days", "Nearly every day"},
            {"Not at all sure", "Several days", "Over half the days", "Nearly every day"},
            {"Not at all sure", "Several days", "Over half the days", "Nearly every day"},
            {"Not at all sure", "Several days", "Over half the days", "Nearly every day"},
            {"Not at all sure", "Several days", "Over half the days", "Nearly every day"},
            {"Not at all sure", "Several days", "Over half the days", "Nearly every day"}
    };

    public String getQuestion(int i){
        String question = mQues[i];
        return question;
    }

    public String getChoice1(int i){
        String choice1 = mChoices[i][0];
        return choice1;
    }

    public String getChoice2(int i){
        String choice2 = mChoices[i][1];
        return choice2;
    }

    public String getChoice3(int i){
        String choice3 = mChoices[i][2];
        return choice3;
    }

    public String getChoice4(int i){
        String choice4 = mChoices[i][3];
        return choice4;
    }

    public int getLength(){
        int len = mQues.length;
        return len;
    }

}
