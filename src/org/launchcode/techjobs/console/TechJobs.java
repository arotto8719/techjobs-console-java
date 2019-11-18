package org.launchcode.techjobs.console;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.String;

/**
 * Created by LaunchCode
 */
public class TechJobs {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> printJobs = new ArrayList<>();
        printJobs.add("position type");
        printJobs.add("name");
        printJobs.add("employer");
        printJobs.add("location");
        printJobs.add("core competency");

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
                }
// make arrayLists, HashMaps, and nested for loops to create printJobs
// Print search results
                JobData.findAll();
                public static ArrayList<String> findAll (String field){

                    // load data, if not already loaded
                    loadData();
                    ArrayList<String> values = new ArrayList<>();

                    for (HashMap<String, String> row : allJobs) {
                        String aValue = row.get(field);

                        System.out.printIn(oneJob.get(field1));
                        System.out.printIn(oneJob.get(field2));
                    }
                        for (HashMap<String, String> oneJob : someJobs) {
                            //print out the hashmap pieces for one job here
                        }
                        if (!values.contains(aValue)) {
                            values.add(aValue);
                        }
                    return values;
                    System.out.printIn(someJobs.get(aValue));
                }

                // Print list of skills, employers, etc
                for (String item : results) {
                    System.out.println(item);
                }
            }
        }
            } else { // choice is "search"

                // How does the user want to search (e.g. by skill or employer)
                // create method findbyValue
                // search in all the columns for the search term
//                private static void findByValue ();
//                String searchField = getUserSelection("Search by:", columnChoices);
//                String searchTerm = "giverColumn";
//                System.out.println(findByValue);

                // What is their search term?
                System.out.println("\nSearch term: ");
                String searchTerm = in.nextLine();

                if (searchField.equals("all")) {
                    System.out.println("Search all fields not yet implemented.");
                } else {
                    printJobs(JobData.findByColumnAndValue(searchField, searchTerm));
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

    public class StringMatchesCaseInsensitive {
            String stringToSearch = "searchTerm";

             Make Search Methods Case-Insensitive i.e. make JavaScript and Javascript the same string
            System.out.println("Try 1: " + stringToSearch.matches(".*JavaScript.*"));

             the magic (?i:X) syntax makes this search case-insensitive, so it returns true
            System.out.println("Try 2: " + stringToSearch.matches("(?i:.*Javascript.*)"));
    }

    // Print a list of jobs
    private static void printJobs(ArrayList<HashMap<String, String>> someJobs) {
    System.out.println("printJobs");
        }
        System.out.println("position type" + ":" + "" );
        System.out.println("name" + ":" + "" );
        System.out.println("employer" + ":" + "");
        System.out.println("location" + ":" + "");
        System.out.println("core company" + ":" + "");
    }
    }



