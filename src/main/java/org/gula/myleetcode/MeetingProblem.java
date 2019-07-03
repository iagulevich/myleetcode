package org.gula.myleetcode;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MeetingProblem {

    public int getCountOfRoom(List<Meeting> meetings) {
        int result = (meetings.size() == 0) ? 0 : 1;

        meetings.sort((m1, m2) -> {
            int startDateCompareTo = m1.getStart().compareTo(m2.getStart());
            if (startDateCompareTo == 0) {
                return m1.getEnd().compareTo(m2.getEnd());
            } else {
                return startDateCompareTo;
            }
        });


        for (int i = 0; i < meetings.size() - 1; i++) {
            Meeting meeting1 = meetings.get(i);
            Meeting meeting2 = meetings.get(i + 1);
            if (meeting1.getEnd().after(meeting2.getStart())) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        Date start = Date.from(now.toInstant(ZoneOffset.UTC));
        LocalDateTime plus = now.plus(1, ChronoUnit.HOURS);
        Date end = Date.from(plus.toInstant(ZoneOffset.UTC));

        Date start2 = Date.from(now.plus(1, ChronoUnit.HOURS).toInstant(ZoneOffset.UTC));
        Date end2 = Date.from(now.plus(3, ChronoUnit.HOURS).toInstant(ZoneOffset.UTC));

        Date start3 = Date.from(now.plus(2, ChronoUnit.HOURS).toInstant(ZoneOffset.UTC));
        Date end3 = Date.from(now.plus(4, ChronoUnit.HOURS).toInstant(ZoneOffset.UTC));

        List<Meeting> meetings = Arrays.asList(
                new Meeting(start, end),
                new Meeting(start2, end2),
                new Meeting(start3, end3)
        );
        System.out.println(meetings);
        int roomNumber = new MeetingProblem().getCountOfRoom(meetings);
        System.out.println("roomNumber:" + roomNumber);
    }

    static class Meeting {
        private final Date start;
        private final Date end;

        Meeting(Date start, Date end) {
            this.start = start;
            this.end = end;
        }

        public Date getStart() {
            return start;
        }

        public Date getEnd() {
            return end;
        }

        @Override
        public String toString() {
            return "Meeting{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

}
