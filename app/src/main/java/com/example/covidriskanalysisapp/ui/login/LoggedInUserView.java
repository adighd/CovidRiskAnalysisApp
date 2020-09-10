package com.example.covidriskanalysisapp.ui.login;

/**
 * Class exposing authenticated user details to the UI.
 */

//test 
class LoggedInUserView {
    private String displayName;
    //... other data fields that may be accessible to the UI
    //branch test
    LoggedInUserView(String displayName) {
        this.displayName = displayName;
    }

    String getDisplayName() {
        return displayName;
    }
}