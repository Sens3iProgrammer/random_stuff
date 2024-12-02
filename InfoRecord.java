/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inforecord;

import java.util.*;
import java.util.ArrayList;

public class InfoRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String restart;
        
        //For whole program
        do{
            ArrayList<String> nameList = new ArrayList<>();
            ArrayList<Integer> ageList = new ArrayList<>();
            ArrayList<String> genderList = new ArrayList<>();
            int choice;
            
            //For menu
            do{
                System.out.println("\n====== Information Recorder =====");
                System.out.println("1 - Create Profile");
                System.out.println("2 - View Profile");
                System.out.println("3 - Edit Profile");
                System.out.println("4 - Delete Profile");
                System.out.println("5 - Cancel");
                choice = sc.nextInt();
                sc.nextLine();
                
                switch (choice){
                    //Create Profile
                    case 1:
                        System.out.print("Enter first name: ");
                    String fname = sc.nextLine();
                    System.out.print("Enter last name: ");
                    String lname = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter gender (M - Male, F - Female): ");
                    String gender = sc.nextLine();
                    
                    if (gender.equalsIgnoreCase("M")){
                        gender = "Male";
                    }else if(gender.equalsIgnoreCase("F")){
                        gender = "Female";
                        
                    }else{
                        System.out.println("M or F only");
                    }
                //Output
                    System.out.println("Full Name: " + fname + " " + lname);
                    System.out.println("Age: " + age);
                    System.out.println("Gender: " + gender);
                    
                //Collecting info
                    nameList.add(fname +" "+ lname);
                    ageList.add(age);
                    genderList.add(gender);
                    break;
                    
                    //View Profile
                    case 2:
                        System.out.println("\n===== View Profile =====");
                        if (nameList.isEmpty()){
                            System.out.println("The list is empty. ");
                        } else{
                            System.out.println("Pick a name to view the full profile: ");
                            for (int i = 0; i < nameList.size(); i++){
                                System.out.println((i + 1) + ". " + nameList.get(i));
                            }
                            int viewProfile = sc.nextInt() - 1;
                            sc.nextLine();
                            //Show Profile
                            System.out.println("Full Name: " + nameList.get(viewProfile) );
                            System.out.println("Age: " + ageList.get(viewProfile));
                            System.out.println("Gender: " + genderList.get(viewProfile));
                            
                            break;
                        }
                    
                    //Edit Profile
                    case 3:
                        System.out.println("===== Edit Profile =====");
                        if (nameList.isEmpty()){
                            System.out.println("The list is empty. ");
                        } else{
                            System.out.println("Pick a name to edit profile: ");
                            for (int i = 0; i < nameList.size(); i++){
                                System.out.println((i + 1) + ". " + nameList.get(i));
                            }
                            int editProfile = sc.nextInt() - 1;
                            sc.nextLine();
                            
                            System.out.print("Enter first name: ");
                        String editFname = sc.nextLine();
                        System.out.print("Enter last name: ");
                        String editLname = sc.nextLine();
                        System.out.print("Enter age: ");
                        int editAge = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter gender (M - Male, F - Female): ");
                        String editGender = sc.nextLine();

                        if (editGender.equalsIgnoreCase("M")){
                            gender = "Male";
                        }else if(editGender.equalsIgnoreCase("F")){
                            gender = "Female";

                        }else{
                            System.out.println("M or F only");
                        }
                    //Output
                        System.out.println("Full Name: " + editFname + " " + editLname);
                        System.out.println("Age: " + editAge);
                        System.out.println("Gender: " + editGender);
                        
                        //Editing Profile
                        nameList.set(editProfile, editFname + " " + editLname);
                        ageList.set(editProfile, editAge);
                        genderList.set(editProfile, editGender);
                            
                        }
                        break;
                        
                    // Delete Profile   
                    case 4:
                        if (nameList.isEmpty()){
                            System.out.println("The list is empty. ");
                        } else{
                            System.out.println("Pick a name to edit profile: ");
                            for (int i = 0; i < nameList.size(); i++){
                                System.out.println((i + 1) + ". " + nameList.get(i));
                            }
                            int deleteProfile = sc.nextInt() - 1;
                            sc.nextLine();
                            
                            //Deleting Profile
                            nameList.remove(deleteProfile);
                            ageList.remove(deleteProfile);
                            genderList.remove(deleteProfile);
                            System.out.println("Profile Deleted");
                            
                            break;
                        }   
                    
                    //Cancel
                    case 5:
                        break;
                   
                    default:
                        System.out.println("1 - 5 only. ");
                        
                }
                
            }while (choice != 5);
           
            System.out.println("Are you sure do you want to close the program? (y/n)");
            restart = sc.nextLine();
            
            
        }while(restart.equalsIgnoreCase("y"));
        System.out.println("Thank you!");
    }
}
