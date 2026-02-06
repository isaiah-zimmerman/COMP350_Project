package edu.gcc.comp350.prij.Course_Scheduler;

import java.util.ArrayList;

public interface Filter {
    public ArrayList<Course> filter(ArrayList<Course> currentCourses);
}
