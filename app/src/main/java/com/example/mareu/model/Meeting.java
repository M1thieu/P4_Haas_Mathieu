package com.example.mareu.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class Meeting {

    private String room;

    private Date dateStart;

    private Date dateEnd;

    public Date getDateEnd() {
        return dateEnd;
    }

    private String subject;

    private List<String> participantsList;

    public Date getDateStart() {
        return dateStart;
    }

    public String getRoom() {
        return room;
    }

    private String getSubject() {
        return subject;
    }

    public String getParticipantsList() {
        StringBuilder participants = new StringBuilder();
        for (String participant : participantsList) {
            participants.append(participant).append(", ");
        }
        return participants.toString();
    }

    public String getInfo() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm", Locale.FRANCE);
        return this.getRoom() + " - " + dateFormat.format(dateStart).replace(':', 'h') + " - " + this.getSubject();
    }

    public Meeting(String room, Date dateStart, Date dateEnd, String subject, List<String> participantsList) {
        this.room = room;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.subject = subject;
        this.participantsList = participantsList;
    }

}
