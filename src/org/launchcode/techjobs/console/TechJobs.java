package org.launchcode.techjobs.console;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by LaunchCode
 */
public class TechJobs {
    private String columnChoices;
    private String actionChoices;
    private String someJobs;
    private String allJobs;
    private String value;

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

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
                //             Make Search Methods Case-Insensitive i.e. make JavaScript and Javascript to match the same string

                // What is their search term?
                System.out.println("\nSearch term: ");
                String searchTerm = in.nextLine();
                searchTerm = searchTerm.toLowerCase();

                if (searchField.equals("all")) {
                    printJobs(JobData.findAll());
                } else {
                    printJobs(JobData.findByColumnAndValue(searchField, searchTerm));
                }
//                if(searchField.equals()) {
//                    printJobs(JobData.findByValue(searchTerm));
//                }
            }
        }
    }

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

        } while (!validChoice);

        return choiceKeys[choiceIdx];
    }

    // Print a list of jobs
    // make arrayLists, HashMaps, and nested for loops to create printJobs
// Print search results
    private static void printJobs(ArrayList<HashMap<String, String>> someJobs) {
        if(someJobs.size() == 0) {
            System.out.println("not found");
            return;
        }
//        private static void printJobs (ArrayList < HashMap < String, String >> new ArrayList<>() {
            System.out.println("*****");
        for (HashMap<String, String> results : someJobs) {
            for (HashMap.Entry<String, String> somethingElse : results.entrySet()) {
                System.out.println(somethingElse.getKey() + ":" +""+ " "+ somethingElse.getValue());
            }
            System.out.println("*****");
        }
    }
}


