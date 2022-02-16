package com.example.studentdetails;

import android.content.Context;

import java.util.ArrayList;

public class Student {
    private static Student student;
    private ArrayList<StudentItem> studentItems;

    private Student(Context context){
        studentItems = new ArrayList<>();
        CreateList();
    }

    public static Student get(Context context){
        if(student == null){
            student = new Student(context);
        }
        return student;
    }

    public void CreateList(){
        String namelist[] = {"Shreya Goel", "Atul Rawat", "Kapil Bhargava", "Akhil Mahajan", "Pradeep Kumar", "Shivam Sharma", "Purudewa Pawar", "Shradha Sabhlok", "Roshan S", "Ashi Sahu", "Prerna Sharma", "Vishesh Goel", "Sakshi Saini", "Sakshi Chaudhary", "Rahul Gupta", "Anjali Singh", "Chetan Saraf", "Shivam Mittal", "Shobhit Nautiyal", "Vivek Kothari", "Jaswanth Naidu", "Yashesh Dagar", "Palak Tiwari", "Harshal Dev", "Nishkarsh Saxena", "Shubham Sharma", "Anshu Kumar", "Vibhor Kumar", "Shivam Joshi", "Srishti Sahni"};
        String rolllist[] = {"MT20101", "MT20102", "MT20103", "MT20104", "MT20105", "MT20106", "MT20107", "MT20108", "MT20109", "MT20110", "MT20111", "MT20112", "MT20113", "MT20114", "MT20115", "MT20116", "MT20117", "MT20118", "MT20119", "MT20120", "MT20121", "MT20122", "MT20123", "MT20124", "MT20125", "MT20126", "MT20127", "MT20128", "MT20129", "MT20130"};
        String emaillist[] = {"shreya20101@iiitd.ac.in", "atul20102@iiitd.ac.in", "kapil20103@iiitd.ac.in", "akhil20104@iiitd.ac.in", "pradeep20105@iiitd.ac.in", "shivam20106@iiitd.ac.in", "purudewa20107@iiitd.ac.in", "shradha20108@iiitd.ac.in", "roshan20109@iiitd.ac.in", "ashi20110@iiitd.ac.in", "prerna20111@iiitd.ac.in", "vishesh20112@iiitd.ac.in", "sakshi20113@iiitd.ac.in", "saksho20114@iiitd.ac.in", "rahul20115@iiitd.ac.in", "anjali20116@iitd.ac.in", "chetan20117@iiitd.ac.in", "shivam20118@iiitd.ac.in", "shobhit20119@iiitd.ac.in", "vivek20120@iiitd.ac.in", "jaswanth20121@iiitd.ac.in", "yashesh20122@iiitd.ac.in", "palak20123@iiitd.ac.in", "harshal20124@iiitd.ac.in", "nishkarsh20125@iiitd.ac.in", "shubham20126@iiitd.ac.in", "anshu20127@iiitd.ac.in", "vivek20128@iiitd.ac.in", "shivam20129@iiitd.ac.in", "srishti20130@iiitd.ac.in"};
        String departmentlist[] = {"CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE" };
        for(int i=0; i<30; i++){
            studentItems.add(new StudentItem(i+1, namelist[i], rolllist[i], emaillist[i], departmentlist[i]));
        }
    }

    public ArrayList<StudentItem> getlist(){
        return studentItems;
    }

    public StudentItem getsingle(int id){
        for(StudentItem s : studentItems){
            if (s.getId() == id){
                return s;
            }
        }
        return null;
    }

}
