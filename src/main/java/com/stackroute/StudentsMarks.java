package com.stackroute;

public class StudentsMarks {

    public int no_of_students;
    public int grade[];

    public int getNo_of_students() {
        return no_of_students;
    }

    public void setNo_of_students(int no_of_students) {
        this.no_of_students = no_of_students;
        this.grade=new int[no_of_students];
    }

    public int[] getGrade() {
        return grade;
    }

    public void setGrade(int[] grade) {
        this.grade = grade;
    }

    public String checkGrade(int a[])
    {
         for(int i=0;i<this.no_of_students;i++)
         {
             if(a[i]<0 || a[i]>100)
             {
                return "Error Message";
             }
         }
         return "Success";
    }

}
