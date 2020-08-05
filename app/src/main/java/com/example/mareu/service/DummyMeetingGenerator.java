package com.example.mareu.service;

import com.example.mareu.model.Meeting;
import com.example.mareu.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DummyMeetingGenerator {

    public static List<Meeting> DUMMY_MEETING = Arrays.asList(
            new Meeting("Salle A", generateStartMeeting(), generateEndMeeting(), "Sujet 1", User.listParticipants),
            new Meeting("Salle B", generateStartMeeting(), generateEndMeeting(), "Sujet 2", User.listParticipants),
            new Meeting("Salle C", generateStartMeeting(), generateEndMeeting(), "Sujet 3", User.listParticipants),
            new Meeting("Salle D", generateStartMeeting(), generateEndMeeting(), "Sujet 4", User.listParticipants)
    );

    static List<Meeting> generateMeeting() {
        return new ArrayList<>(DUMMY_MEETING);
    }

    private static Date generateStartMeeting() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 8);
        cal.set(Calendar.MINUTE, 0);
        return cal.getTime();
    }

    private static Date generateEndMeeting() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 9);
        cal.set(Calendar.MINUTE, 0);
        return cal.getTime();
    }
}
