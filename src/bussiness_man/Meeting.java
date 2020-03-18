package bussiness_man;

import java.time.LocalTime;

public class Meeting {
	private LocalTime begin;
	private LocalTime end;

	public Meeting() {
	}

	public LocalTime getBegin() {
		return begin;
	}

	public void setBegin(LocalTime begin) {
		this.begin = begin;
	}

	public LocalTime getEnd() {
		return end;
	}

	public void setEnd(LocalTime end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "Meeting [begin=" + begin + ", end=" + end + "]";
	}

}
