package com.example.nonz.spaze;
public class Question {
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private int answer;

    public String mQuestion[] = {
        "Which is the first planet in Solar system?",
            "Which is the name of the second planet in Solar system?",
            "Which is the largest planet in Solar system?",
            "Which planet is an only dwarf planet in Solar system?",
            "What comes after Uranus?",
            "What comes before Mars?",
            "What type of the planet Jupiter is?"
    };

    private String mChoices[][]= {{"Mercury","Uranus","Earth","Neptune"},{"Mars","Saturn","Venus","Neptune"},{"Earth","Uranus","Jupiter","Saturn"}
                                    , {"Mercury", "Venus", "Pluto", "Neptune"},{"Pluto", "Neptune","Saturn","Mars"},{"Venus","Sun","Earth","Saturn"},{"Ice Giant","Terrestrial","Rock Giant","Gas Giant"}};

    private String CorrectAnswer[] = {"Mercury","Venus","Jupiter","Pluto","Neptune","Earth","Gas Giant"};

    public String getQuestion(int a)
    {
        String question = mQuestion[a];
        return question;
    }

    public String getChoice1(int a)
    {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a)
    {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a)
    {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a)
    {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a)
    {
        String answer = CorrectAnswer[a];
        return answer;
    }



    /*public Question(String question, String option1, String option2, String option3, String option4, int answer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }*/
}

