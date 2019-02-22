
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


public class army extends mainmethod{
	
	public static Integer totalArmy(int no_of_players, int total_country) {
		int armies_per_player = 0;
		
		if(no_of_players == 2) {
			armies_per_player = (int)(40*total_country)/42;
		}else if(no_of_players == 3) {
			armies_per_player = (int)(35*total_country)/42;
		}else if(no_of_players == 4) {
			armies_per_player = (int)(30*total_country)/42;
		}else if(no_of_players == 5) {
			armies_per_player = (int)(25*total_country)/42;
		}else if(no_of_players == 6) {
			armies_per_player = (int)(20*total_country)/42;
		}
		
		return armies_per_player;
	}
	
	public static List<List<String>> divideCountry(String player_name[], ArrayList<String> country_name){
		List<List<String>> country_list_for_player = new ArrayList<List<String>>();
		List<String> country_for_player1 = new ArrayList<String>();
		List<String> country_for_player2 = new ArrayList<String>();
		List<String> country_for_player3 = new ArrayList<String>();
		List<String> country_for_player4 = new ArrayList<String>();
		List<String> country_for_player5 = new ArrayList<String>();
		List<String> country_for_player6 = new ArrayList<String>();
		int p = player_name.length;
		int j = 0;
		int total_no_of_country = country_name.size();
		for(int i=0; i<p && total_no_of_country != 0; i++) {
			if(i == 0) {
				total_no_of_country--;
				country_for_player1.add(country_name.get(j));
				j++;
				if(total_no_of_country == 0)
					break;
				if(i == (p-1))
					i = -1;
			}else if(i == 1) {
				total_no_of_country--;
				country_for_player2.add(country_name.get(j));
				j++;
				if(total_no_of_country == 0)
					break;
				if(i == (p-1))
					i = -1;
			}else if(i == 2) {
				total_no_of_country--;
				country_for_player3.add(country_name.get(j));
				j++;
				if(total_no_of_country == 0)
					break;
				if(i == (p-1))
					i = -1;
			}else if(i == 3) {
				total_no_of_country--;
				country_for_player4.add(country_name.get(j));
				j++;
				if(total_no_of_country == 0)
					break;
				if(i == (p-1))
					i = -1;
			}else if(i == 4) {
				total_no_of_country--;
				country_for_player5.add(country_name.get(j));
				j++;
				if(total_no_of_country == 0)
					break;
				if(i == (p-1))
					i = -1;
			}else if(i == 5) {
				total_no_of_country--;
				country_for_player6.add(country_name.get(j));
				j++;
				if(total_no_of_country == 0)
					break;
				if(i == (p-1))
					i = -1;
			}
		}
		for(int i=0; i<p; i++){
		    if(i == 0){
		        country_list_for_player.add(country_for_player1);
		    }else if(i == 1){
		        country_list_for_player.add(country_for_player2);
		    }else if(i == 2){
		        country_list_for_player.add(country_for_player3);
		    }else if(i == 3){
		        country_list_for_player.add(country_for_player4);
		    }else if(i == 4){
		        country_list_for_player.add(country_for_player5);
		    }else if(i == 5){
		        country_list_for_player.add(country_for_player6);
		    }
		}
		return country_list_for_player;
	}
	
	public static HashMap<String,Integer> armyPerCountry(String[] player_name, int army_per_player, List<List<String>> country_per_player){
		HashMap<String,Integer> army_per_country = new HashMap<String,Integer>();
		int p = player_name.length;
		for(int i=0; i<p; i++) {
			int ap = army_per_player;
			int q = country_per_player.get(i).size();
			for(int j=0; j<q; j++) {
				String s = country_per_player.get(i).get(j);
				if(army_per_country.containsKey(s)) {
					army_per_country.put(s, army_per_country.get(s)+1);
					ap--;
				}else {
					army_per_country.put(s, 1);
					ap--;
				}
				if(ap == 0)
					break;
				if(j == (q-1))
					j = -1;
			}
		}
		
		return army_per_country;
	}

}