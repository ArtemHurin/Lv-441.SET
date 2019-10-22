package com.academy.max.N7_Regex.hw7_3_UserName_Verification;

import java.util.regex.*;

class Username {
    private String username;

    public Username(String name) {
        this.username = name;
    }

    public void checkForValidity() {
        boolean check;

        Pattern p = Pattern.compile("[a-zA-Z0-9_]{3,15}");
        Matcher m = p.matcher(username);

        if (m.matches()) {
            System.out.println("    Valid Username: " + username);
        } else {
            System.out.println("NOT Valid Username: " + username);
        }
    }
}

