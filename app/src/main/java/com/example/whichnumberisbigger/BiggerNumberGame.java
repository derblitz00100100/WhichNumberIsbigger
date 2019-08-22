package com.example.whichnumberisbigger;

public class BiggerNumberGame {
    private int number1;
    private int number2;
    private int score;
    private int lowerLimit;
    private int upperLimit;

    public BiggerNumberGame(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public void generateRandomNumbers() {
        // generate a number between upper and lower limit inclusive
        // store that in number1
        // generate new number and make sure its different than number1
        // store that in number2
        number1 = (int) ((upperLimit - lowerLimit + 1) * Math.random() + lowerLimit);
        number2 = (int) ((upperLimit - lowerLimit + 1) * Math.random() + lowerLimit);

        while (number2 == number1) {
        number2 = (int) ((upperLimit - lowerLimit + 1) * Math.random() + lowerLimit);
        }
    }

    public String checkAnswer(int answer) {
        // determine if the answer is right
            // based on the values of number1 and number2
        // update the score accordingly
        // return a relevant message
        if (answer == Math.max(number1, number2)) {
            return "You are indeed correct";
        }
        else {
            return "You are indeed incorrect";
        }
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }
}
