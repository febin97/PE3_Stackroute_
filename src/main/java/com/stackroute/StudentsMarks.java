package com.stackroute;

public class StudentsMarks {

    public int no_of_students;
    public int grade[];
    public void set_no(int n)
    {
        this.no_of_students=n;
        this.grade=new int[n];

    }
    public String set_grade(int a[])
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
