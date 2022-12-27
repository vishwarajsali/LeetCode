package com.vishwaraj.OldFiles.Java.src.main.java.Contest.WeeklyContest182;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * _5370DesignUndergroundSystem
 */
public class _5370DesignUndergroundSystem {
    public static void main(String[] args) {
        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);
        System.out.println(undergroundSystem.getAverageTime("Paradise", "Cambridge")); // return 14.0. There was only
                                                                                       // one travel from "Paradise" (at
                                                                                       // time 8) to "Cambridge" (at
                                                                                       // time 22)
        undergroundSystem.getAverageTime("Leyton", "Waterloo"); // return 11.0. There were two travels from "Leyton" to
                                                                // "Waterloo", a customer with id=45 from time=3 to
                                                                // time=15 and a customer with id=27 from time=10 to
                                                                // time=20. So the average time is ( (15-3) + (20-10) )
                                                                // / 2 = 11.0
        undergroundSystem.checkIn(10, "Leyton", 24);
        undergroundSystem.getAverageTime("Leyton", "Waterloo"); // return 11.0
        undergroundSystem.checkOut(10, "Waterloo", 38);
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo")); // return 12.0
    }
}

class UndergroundSystem {

    // List<Punch> punchs;
    Map<Integer, List<Punch>> punchs;
    Map<String, Integer> pair;

    public UndergroundSystem() {
        punchs = new HashMap<>();
        pair = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {

        if (!punchs.containsKey(id)) {
            List<Punch> l = new ArrayList<>();
            l.add(new Punch(id, stationName, t, 'I'));
            punchs.put(id, l);
        } else {
            punchs.get(id).add(new Punch(id, stationName, t, 'I'));
        }

        if(!pair.containsKey(stationName)){
            pair.put(stationName, 1);
        }else {
            pair.put(stationName, pair.get(stationName)+1);
        }
    }

    public void checkOut(int id, String stationName, int t) {       
        punchs.get(id).add(new Punch(id, stationName, t, 'O'));
        pair.put(stationName, pair.get(stationName)+1);
    }

    public double getAverageTime(String startStation, String endStation) {
        double avg = 0;
        double count =0;
        for (Entry<Integer, List<Punch>> e : punchs.entrySet()) {
            List<Punch> p = e.getValue();
            double totalSum =0 ;

            for (int i = 0; i < p.size() ; i++) {
                
                if (p.get(i).getStation().equals(startStation) && p.get(i).getC() == 'I') {
                    totalSum -= p.get(i).getT();
                }

                if (p.get(i).getStation().equals(endStation) && p.get(i).getC() == 'O') {
                    totalSum += p.get(i).getT();
                     
                    count++;
                }
            }
            avg +=  totalSum;
             

        }

        return avg/count;
    }
}

class Punch {
    private int id;
    private String station;
    private int t;
    private char c;
    private int pair;

    public int getId() {
        return id;
    }

    public String getStation() {
        return station;
    }

    public int getT() {
        return t;
    }

    public Punch(int id, String station, int t, char c) {
        this.id = id;
        this.station = station;
        this.t = t;
        this.c = c;
    }
    

    public char getC() {
        return c;
    }

    public int getPair() {
        return pair;
    }

    public void setPair(int pair) {
        this.pair = pair;
    }

}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t); obj.checkOut(id,stationName,t); double param_3
 * = obj.getAverageTime(startStation,endStation);
 */