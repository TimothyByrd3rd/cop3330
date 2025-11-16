/*
COP3330 Fall 2025
Programming Assignment 5
Student Name: Timothy Byrd
File Name: HonorsStudent.java
NOTE: I hereby certify that this submission is my original work.
It was completed independently by me without unauthorized assistance.
I affirm that all sources consulted have been properly acknowledged.
No part of this work was copied or plagiarized from any other source/s.
*/

/* File Introduction:
This file creates an honors student class that is a child of the UndergraduateStudent class, adding a thesisTitle option, and a committee array.
*/

public class HonorsStudent extends UndergraduateStudent {
    private String thesisTitle; //A String storing the student’s thesis title. Initially empty.
    private String[] committee = new String[3]; //A fixed-size array of 3 Strings representing committee member names.
    private int committeeCount = 0; //Stores how many members are currently in the committee. It must be ≤ 3.

    public HonorsStudent(String name) //Creates a new honors student with the given name.
    {
        super(name);
    };
    public HonorsStudent(UndergraduateStudent ob) //Converts an existing undergraduate student into an honors student.
    {
        super(ob);
    };
    public HonorsStudent(HonorsStudent ob) //Creates a new HonorsStudent with the same information as ob (i.e., deep copy).
    {
        super(ob);
        this.setThesisTitle(ob.thesisTitle);
        this.committee = new String [ob.committee.length]; //copies committee array from reference to current committee
        for (int i = 0; i < this.committee.length; i++) {
            this.committee[i] = ob.committee[i];
        }
        this.committeeCount = ob.committeeCount;
    };
    public boolean addCommitteeMember(String name)//Adds a committee member by name, only if there is available space. Returns true if successful, or false otherwise.
    {
        if(committeeCount < committee.length){
            committee[committeeCount] = name;
            committeeCount++;
            return true;
        }
        else{
            return false;
        }
    };
    public String getThesisTitle()//Returns the student’s current thesis title.
    {
        return this.thesisTitle;
    };
    public void setThesisTitle(String title)//Updates the student’s thesis title.
    {
        this.thesisTitle = title;
    };
    public String[] getCommittee()//Returns a reference to the committee array.
    {
        return this.committee;
    };
    public int getCommitteeCount()//Returns how many committee members are currently stored.
    {
        return this.committeeCount;
    };
    public void printCommittee()//Prints each committee member name on its own line. Prints nothing if the committee is empty.
    {
        for (int i = 0; i < committeeCount; i++) {
            System.out.printf("%s\n", getCommittee()[i]);
        }
    };
    @Override
    public double getRate()//Overrides the parent version. Returns half of the rate defined for an UndergraduateStudent.
    {
        return super.getRate()/2;
    };
}