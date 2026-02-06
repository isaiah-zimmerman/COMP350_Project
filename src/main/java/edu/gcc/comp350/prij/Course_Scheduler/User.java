package edu.gcc.comp350.prij.Course_Scheduler;

import java.util.Map;

public class User {
    private int id;
    private String email;
    private String name;
    private Map<Semester, Schedule> schedules;
}
