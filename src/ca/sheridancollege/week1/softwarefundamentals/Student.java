/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 * A class to model Student Objects
 * each student has: a name (first an last name)
 * each student can: say their name (getName)
 * 
 * @author dancye May 7, 2018
 */

public class Student 
{
    private String name;

    /**
     * @return the name
     * @ishu ne git ke leye modify keya
     * chl gui ke sath delkhte hai 
     * 
     * yeh netBeans mei change ha aur humchahte hn github pe bhi ho
     * phle commit kro.->local pe aega
     * phir push kro to see on github.
     * 


     AB GITHUB PE CHANGE KEYA HA DEKHTE HAI NEAT BEANS MEIN





     FETCH -> ke leye change kr rhei hai.
     */
    public String getName() {
        return name;
    }

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }
    
    
}
