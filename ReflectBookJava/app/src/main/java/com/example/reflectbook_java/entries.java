package com.example.reflectbook_java;

import java.util.List;

public class entries {

    private String uniqueid;
    private List ListofEntries;
    private String title;
    private enum mood {HAPPY,GOOD,SAD,WORSE};
    private String Entrytext;


    public entries(String unqiueID, String title, String entrytext){
        unqiueID = this.uniqueid;
        title = this.title;
        entrytext = this.Entrytext;
    }

    // TODO: 14/01/21 - random generated address
}
