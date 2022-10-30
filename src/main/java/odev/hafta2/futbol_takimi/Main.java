package odev.hafta2.futbol_takimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Takim Sayisi Girin:");
        int numOfTeam = Integer.parseInt(getInput());
        List<String> teams = generateTeams(numOfTeam);

        for(String res : shuffle(teams)){
            System.out.println(res);
        }
    }

    static String getInput(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    static List<String> generateTeams(int teamSize){
        List<String> generatedTeams = new ArrayList<>();
        for (int i = 0; i < teamSize; i++) {
            generatedTeams.add((i+1)+".takim");
        }

        return generatedTeams;
    }

    static List<String> shuffle(List<String> teams){

        List<String> result = new ArrayList<>();

        for (int i=teams.size();i>0;i-=2){
            int firstRandom = (int)(Math.random()*i);
            int secondRandom = 0;

            boolean isSame=true;
            while (isSame){
                secondRandom = (int)(Math.random()*i);
                isSame = firstRandom == secondRandom;
            }

            result.add(teams.get(firstRandom) + " vs. " + teams.get(secondRandom));

            teams.removeAll(List.of(teams.get(firstRandom),teams.get(secondRandom)));
        }

        return result;
    }
}
