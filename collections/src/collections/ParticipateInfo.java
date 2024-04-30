package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParticipateInfo {
	private Map<String,Integer> participantMap = new HashMap<>();
	
	public int findTheTimeByTheParticipant(String participantName) {
		for(String s : participantMap.keySet()) {
			if(s==participantName) {
				return participantMap.get(s);
			}
		}
		return -1;
	}
	public List<String> findTheParticipantWithTheShortestTime(){
		
		int k = Integer.MAX_VALUE;
		List<String> x = new ArrayList<>();
		String q;
		for(String s : participantMap.keySet()) {
			if(participantMap.get(s)<k) {
				x.clear();
				x.add(s);
			}
		}
		return x;
	}
	public static void main(String[] args) {
		
		
	}

}
