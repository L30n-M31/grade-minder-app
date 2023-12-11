package com.example.gradetrackerapp.data.ref;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

import java.util.List;

@Entity(tableName = "courses")
public class Course {
    @PrimaryKey(autoGenerate = true)
    public int courseId;

    public String courseName;
    public String courseCode;
    public String courseInstructor;
    public int courseGrade;
    public int examWeight;
    public int classStandingWeight;

    //@Relation(parentColumn = "courseId", entityColumn = "courseId")
    //public List<Term> terms;

    public Course() {
        courseGrade = 0;
        examWeight = 50;
        classStandingWeight = 50;
    } // end of constructor
} // end of Course class
