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
                System.out.println("====== Information Recorder =====");
                System.out.println("1 - Create Profile");
                System.out.println("2 - View Profile");
                System.out.println("3 - Edit Profile");
                System.out.println("4 - Delete Profile");
                System.out.println("5 - Close");
                choice = sc.nextInt();
                sc.nextLine();
                
                switch (choice){
                    //Create Profile
                    case 1:
                    System.out.println("====== Create Profile ======");
                    System.out.print("Enter first name: ");
                    String fname = sc.nextLine();
                    System.out.print("Enter last name: ");
                    String lname = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    
                    String gender;
                    while (true){
                        System.out.print("Enter gender (M - Male, F - Female): ");
                        gender = sc.nextLine();
                        if (gender.equalsIgnoreCase("M")){
                        gender = "Male";
                        break;
                        
                        }else if(gender.equalsIgnoreCase("F")){
                        gender = "Female";
                        break;
                        
                        }else{
                        System.out.println("M or F only");
                        }
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
                        System.out.println("===== View Profile =====");
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
                            System.out.println("");
                        }
                        break;
                    
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
                            
                            //Picking edit
                            System.out.println("What do you want to edit?");
                            System.out.println("1 - Full Name");
                            System.out.println("2 - Age");
                            System.out.println("3 - Gender");
                            
                            int editChoice = sc.nextInt();
                            sc.nextLine();
                            
                            switch (editChoice){
                            //Full Name Edit
                                case 1: 
                                    System.out.print("Enter first name: ");
                                    String editFname = sc.nextLine();
                                    System.out.println("Enter last name: ");
                                    String editLname = sc.nextLine();
                                    //Output
                                    System.out.println("Full Name: " + editFname + " " + editLname);
                                    
                                    
                                    nameList.set(editProfile, editFname + " " + editLname);
                                    
                                    break;
                                    
                             //Age Edit
                                case 2: 
                                    System.out.println("Enter age: ");
                                    int editAge = sc.nextInt();
                                    sc.nextLine();
                                    //Output
                                    System.out.println("Age: " + editAge);
                                    
                                    ageList.set(editProfile, editAge);
                                    break;
                                   
                              //Gender Edit
                                case 3:
                                    String editGender;
                                    while (true){
                                        System.out.println("Enter Gender (M - Male, F - Female): ");
                                        editGender = sc.nextLine();
                                        
                                       if (editGender.equalsIgnoreCase("M")){
                                       editGender = "Male";
                                       break;
                                       }else if(editGender.equalsIgnoreCase("F")){
                                       editGender = "Female";
                                       break;
                                       } else{
                                       System.out.println("M or F only");
                                       }
                                    }
                                    //Output
                                    System.out.println("Gender: " + editGender );
                                    
                                    genderList.set(editProfile, editGender);
                                    break;
                                default:
                                    System.out.println("1 - 3 only");
                                    
                            }
                        }break;
                        
                    // Delete Profile   
                    case 4:
                        while (true){
                        System.out.println("===== Delete Profile =====");
                        if (nameList.isEmpty()){
                            System.out.println("The list is empty. ");
                        } else{
                            System.out.println("Pick a name to delete profile: ");
                            for (int i = 0; i < nameList.size(); i++){
                                System.out.println((i + 1) + ". " + nameList.get(i));
                            }
                            int deleteProfile = sc.nextInt() - 1;
                            sc.nextLine();
                            
                            //Confirmation
                            String removeProf;
                            
                                System.out.println("Are you sure you want to delete? (y/n)");
                                removeProf = sc.nextLine();
                                
                                if (removeProf.equalsIgnoreCase("y")){
                                    nameList.remove(deleteProfile);
                                    ageList.remove(deleteProfile);
                                    genderList.remove(deleteProfile);
                                    System.out.println("Profile Deleted.");
                                    break;
                                } else if(removeProf.equalsIgnoreCase("n")){
                                    continue;
                                } else{
                                    System.out.println("Y or N only.");
                                    continue;
                                }    
                                
                            }
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
                
            
        }while(!restart.equalsIgnoreCase("y"));
        System.out.println("Thank you!");
    }
}
