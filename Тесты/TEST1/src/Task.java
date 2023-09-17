public class Task
{
    private String question, answer1, answer2, answer3, answer4, answer5;
    private int num, balls;

    Task(String question, String answer1, String answer2, String answer3, String answer4, String answer5, int num, int balls)
    {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.num = num;
        this.balls = balls;
    }

    String getQuestion() {return question;}
    void setQuestion(String question) {this.question = question;}
    String getAnswer1() {return answer1;}
    void setAnswer1(String answer1) {this.answer1 = answer1;}
    String getAnswer2() {return answer2;}
    void setAnswer2(String answer2) {this.answer2 = answer2;}
    String getAnswer3() {return answer3;}
    void setAnswer3(String answer3) {this.answer3 = answer3;}
    String getAnswer4() {return answer4;}
    void setAnswer4(String answer4) {this.answer4 = answer4;}
    String getAnswer5() {return answer5;}
    void setAnswer5(String answer5) {this.answer5 = answer5;}
    int getNum() {return num;}
    void setNum(int num) {this.num = num;}
    int getBalls() {return balls;}
    void setBalls(int balls) {this.balls = balls;}

    void print()
    {
        System.out.println("Вопрос: "+this.question+"\nОтвет 1: "+this.answer1+"\nОтвет 2: "+this.answer2+"\nОтвет 3: "+this.answer3+"\nОтвет 4: "+this.answer4+"\nОтвет 5: "+this.answer5+"\nПравильный ответ: "+this.num+"\nКол-во баллов: "+this.balls);
    }
}