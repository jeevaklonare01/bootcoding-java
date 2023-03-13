package com.bootcoding.java.OPPs.OMP;

public class GradeSystem {
    public char FindGrade(Student std){
        if(std.percentage>90){
            return 'A';
        } else if (std.percentage>80) {
            return 'B';
        }
        return 'C';
    }
}
