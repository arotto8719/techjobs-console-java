package org.launchcode.techjobs.console;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Created by LaunchCode
 */
public class TechJobs {

    private static Scanner in = new Scanner(System.in);

    public static void main (String[] args) {

        // Initialize our field map with key/name pairs
        HashMap<String, String> columnChoices = new HashMap<>();
        columnChoices.put("core competency", "Skill");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("position type", "Position Type");
        columnChoices.put("all", "All");

        // Top-level menu options
        HashMap<String, String> actionChoices = new HashMap<>();
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

        System.out.println("Welcome to LaunchCode's TechJobs App!");

        // Allow the user to search until they manually quit
        while (true) {

            String actionChoice = getUserSelection("View jobs by:", actionChoices);

            if (actionChoice.equals("list")) {

                String columnChoice = getUserSelection("List", columnChoices);

                if (columnChoice.equals("all")) {
                    printJobs(JobData.findAll());
                } else {

                    ArrayList<String> results = JobData.findAll(columnChoice);

                    System.out.println("\n*** All " + columnChoices.get(columnChoice) + " Values ***");

                    // Print list of skills, employers, etc
                    for (String item : results) {
                        System.out.println(item);
                    }
                }

            } else { // choice is "search"

                // How does the user want to search (e.g. by skill or employer)
                String searchField = getUserSelection("Search by:", columnChoices);

                // What is their search term?
                System.out.println("\nSearch term: ");
                String searchTerm = in.nextLine();

                if (searchField.equals("all")) {
                    System.out.println("Search all fields not yet implemented.");
                } else {
                    printJobs(JobData.findByColumnAndValue(searchField, searchTerm));
                }
            }
            break;
        }
        // create method findbyValue
        // search in all the columns for the search term
//        private static void findbyValue() {
//            String searchTerm = "giverColumn";
//            if("Web-Front End" && "Front end web dev" are the same) {
//                System.out.println(stop search);
//            }else{
//                System.out.print(resume search);
//            }
//        }
//            printJobs(findbyValue("searchField", "searchTerm");
//        }
//    }

    // ﻿Returns the key of the selected item from the choices Dictionary
    private static String getUserSelection(String menuHeader, HashMap<String, String> choices) {

        Integer choiceIdx;
        Boolean validChoice = false;
        String[] choiceKeys = new String[choices.size()];

        // Put the choices in an ordered structure so we can
        // associate an integer with each one
        Integer i = 0;
        for (String choiceKey : choices.keySet()) {
            choiceKeys[i] = choiceKey;
            i++;
        }

        do {

            System.out.println("\n" + menuHeader);

            // Print available choices
            for (Integer j = 0; j < choiceKeys.length; j++) {
                System.out.println("" + j + " - " + choices.get(choiceKeys[j]));
            }

            choiceIdx = in.nextInt();
            in.nextLine();

            // Validate user's input
            if (choiceIdx < 0 || choiceIdx >= choiceKeys.length) {
                System.out.println("Invalid choice. Try again.");
            } else {
                validChoice = true;
            }

        } while(!validChoice);

        return choiceKeys[choiceIdx];
    }

    // Print a list of jobs
// make arrayLists, HashMaps, and nested for loops to create printJobs
// Print search results
    public static void printJobs (String[] ArrayList) {
        /**
         * @param args
         */
        public static void main(String[] args) {
            // Setting up a HashMap
            HashMap<String, String> searchTerm = new HashMap<String, String>();
            searchTerm.put("positionType", "PositionType");
            searchTerm.put("name", "Name");
            searchTerm.put("employer", "Employer");
            searchTerm.put("location", "Location");
              searchTerm.put("coreCompetency", "CoreCompetency");
              searchTerm.put("all", "All");

        private static void printJobs (ArrayList < HashMap < String, String >> new ArrayList<>()){
            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> employer = new ArrayList<>();
            ArrayList<String> location = new ArrayList<>();
            ArrayList<String> positionType = new ArrayList<>();
            ArrayList<String> coreCompetency = new ArrayList<>();
            for (int i = 0; i <= new ArrayList i++){
                        System.out.println(i);
                        if (new ArrayList == searchTerm) {
                            System.out.printIn(searchField, searchTerm);
                        }
                        HashMap<String, name> searchTerm = new HashMap<>();
                        HashMap<String, employer> searchTerm = new HashMap<>();
                        HashMap<String, location> searchTerm = new HashMap<>();
                        HashMap<String, positionType> searchTerm = new HashMap<>();
                        HashMap<String, coreCompetency> searchTerm = new HashMap<>();
                        System.out.println("Looping over HashMap");
                        Set<HashMap.Entry<String, String>> valueSet = HashMap.entrySet();
                        valueSet.forEach((i)->System.out.println("Key is " + i.choiceKey() +
                                " Value is " + a.getValue()));
                        for (HashMap.Entry<String, String> searchField, searchTerm.entrySet()){
                            System.out.println("position type" + ":" + "" + "name" + ":" + "" + "employer" + ":" + "" + "location" + ":" + "" + "core company" + ":" + "");
                        }
                        if ("HashMap== true;") {
                            System.out.println("Found it!");
                        } else {
                            System.out.println("printJobs is not implemented yet");
                    }
              }
            }
        }
        }
}