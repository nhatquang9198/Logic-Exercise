package bussiness_man;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

	public static void main(String[] args) {
		String s = "Sun 10:00-20:00\n" + "Fri 05:00-10:00\n" + "Fri 16:30-23:50\n" + "Sat 10:00-24:00\n"
				+ "Sun 01:00-04:00\n" + "Sat 02:00-06:00\n" + "Tue 03:30-18:15\n" + "Tue 19:00-20:00\n"
				+ "Wed 04:25-15:14\n" + "Wed 15:14-22:40\n" + "Thu 00:00-23:59\n" + "Mon 05:00-13:00\n"
				+ "Mon 15:00-21:00\n";

		Map<DayOfWeek, List<Meeting>> map = new TreeMap<>();
//		List<Meeting> schedule = new ArrayList<>();
		Meeting meeting;

		String[] inputString = s.split("\n");

		for (String part : inputString) {
			String day = part.split(" ")[0];
			String time = part.split(" ")[1];

			DayOfWeek dayOfWeek = null;

			meeting = new Meeting();
			meeting.setBegin(LocalTime.parse(time.split("-")[0]));
			if (time.split("-")[1].equalsIgnoreCase("24:00")) {
				meeting.setEnd(LocalTime.parse("00:00"));
			} else {
				meeting.setEnd(LocalTime.parse(time.split("-")[1]));
			}

//			System.out.println(day + " " + meeting);

			switch (day) {
			case "Mon":
				dayOfWeek = DayOfWeek.MONDAY;
				break;

			case "Tue":
				dayOfWeek = DayOfWeek.TUESDAY;
				break;

			case "Wed":
				dayOfWeek = DayOfWeek.WEDNESDAY;
				break;

			case "Thu":
				dayOfWeek = DayOfWeek.THURSDAY;
				break;

			case "Fri":
				dayOfWeek = DayOfWeek.FRIDAY;
				break;

			case "Sat":
				dayOfWeek = DayOfWeek.SATURDAY;
				break;

			case "Sun":
				dayOfWeek = DayOfWeek.SUNDAY;
				break;
			}

			if (!map.containsKey(dayOfWeek)) {
				map.put(dayOfWeek, new ArrayList<Meeting>());
			}
			map.get(dayOfWeek).add(meeting);
		}

		System.out.println(map);

	}

	public int solution() {
		return 0;
	}
}
