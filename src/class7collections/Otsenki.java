package class7collections;

import class5oop.Hero;

import java.util.*;


import static java.util.Arrays.asList;


/**
 * Created by user on 11.02.2019.
 */
public class Otsenki {
    public static void main(String[] args) {
        int i;
        List<Integer> otsenki = new ArrayList<Integer>();
        //System.out.println(i);
        for (int k = 0; k < 10; k++) {
            i = (int) Math.round(Math.random() * 10);
            System.out.println(i);
            otsenki.add(i);
        }
        for (int k = 0; k < 7; k++) {
            otsenki.removeIf(n -> (n <= 3));
        }

        System.out.println(otsenki);

        System.out.println("countUnique = " + countUnique(otsenki));
        System.out.println(" test " + new HashSet<>(otsenki).size());
        System.out.println("countaloneelements = " + countAloneElements(otsenki));

    }

    public static int countUnique(List<Integer> lst) {
        int res = 0;
        if (lst.size() != 0) {
            Collections.sort(lst);

            for (int k = 1; k < lst.size(); k++) {
                if (lst.get(k) == lst.get(k - 1)) {
                    res++;

                }

            }
            res = lst.size() - res;
        }

        return res;
    }

    public static int countAloneElements(List<Integer> li) {
        Map<Integer, Integer> map = new HashMap<>();

        Set<Integer> integers = map.keySet();
        Collection<Integer> values = map.values();
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for(Map.Entry<Integer, Integer> entry : entries){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
        }
        int res = 0;

        for (Integer elem : li) {
            if (!map.containsKey(elem)) {
                map.put(elem, 1);
            } else {
                map.put(elem, map.get(elem) + 1);
            }
        }
        System.out.println(map.values().toString());
/*
            for (int k = 0; k < map.size(); k++) {
                if (map.).containsKey(li.get(k)) {
                    map.put(li.get(k),1);
                } else {
                    map.put(li.get(k), map.get(li.get(k))+1);
                }

            }*/


        return res;

    }
}