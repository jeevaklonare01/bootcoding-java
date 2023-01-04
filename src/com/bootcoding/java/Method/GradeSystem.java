package com.bootcoding.java.Method;

public class GradeSystem {
    public static void main(String[] args) {
        int[] studentPercentages = {67, 58, 99, 69, 35, 87};
        char[] gradeResult = calculateGrade(studentPercentages);
        for (int i = 0; i < gradeResult.length; i++) {
            System.out.println(studentPercentages[i] + "->" + gradeResult[i]);
        }
    }

    public static char[] calculateGrade(int[] studentPercentages) {
        char[] grades = new char[studentPercentages.length];
        for (int i = 0; i < studentPercentages.length; i++) {
            char grade;
            int precentage = studentPercentages[i];
            grade = getGrade(precentage);
            grades[i] = grade;
        }
        return grades;
    }

    private static char getGrade(int precentage) {
        char grade;
        if (precentage >= 75) {
            grade = 'A';
        } else if (precentage >= 60) {
            grade = 'B';
        } else {
            grade = 'C';
        }
        return grade;
    }
}
