package com.company;

import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("testData_Apartments.txt"));
            String line;
            HashMap<String, ArrayList<Apartment>> apartmentMap = new HashMap<>();

            while ((line = reader.readLine()) != null) {
                Apartment apartment = new Apartment(apartment.city, apartment.rooms, apartment.kvadratura, apartment.price, apartment.phonenumber);

                if (!apartmentMap.containsKey(apartment.kvadratura >= 100)) {
                    apartmentMap.put(apartment.city, new ArrayList<Apartment>());
                }
                apartmentMap.get(apartment.kvadratura).add(apartment);
            }
            reader.close();

            List<Map.Entry<String, ArrayList<Apartment>>> sortedApartments = new ArrayList<>(apartmentMap.entrySet());
            sortedApartments.sort((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()));

            sortedApartments = sortedApartments.subList(0, Math.min(5, sortedApartments.size()));
            int count=1;
            Set<Map.Entry<String, String>> set = new HashSet<>();

            for (Map.Entry<String, ArrayList<Apartment>> entry : sortedApartments) {
                ArrayList<Apartment> list = entry.getValue();

                for(int i=0; i<list.size(); i++) {
                    set.add(new AbstractMap.SimpleEntry<>(list.get(i).kvadratura+" "+list.get(i).city+" "+list.get(i).phonenumber));
                }
                System.out.println(set.size());
                list.sort((a, b) -> {
                    if (a.kvadratura>=b.kvadratura) {
                        return Integer.parseInt(a.phonenumber);
                    } else {
                        return Integer.parseInt(b.phonenumber);
                    }
                });
                BufferedWriter writer = new BufferedWriter(new FileWriter("outputApartments.txt"));
                int index = 1;
                for(Map.Entry<String, ArrayList<Apartment>> entry : sortedApartments) {
                    writer.write(entry.getKey() + " " + entry.hashCode());
                    index++;
                }
                writer.close();
            }
        }catch (IOException e) {
                e.printStackTrace();
            }
    }
}
