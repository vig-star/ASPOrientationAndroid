package com.vigneshpranav.asporientation;

import android.content.Context;
import android.content.SharedPreferences; // import this to access SharedPreferences - storing data
import android.preference.PreferenceManager;

public class SharedPrefer {

    static SharedPreferences sharedPreferences;
    static SharedPreferences.Editor editor;

    public static void setNameValue(Context context, String value) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context); // returns a shared preference intent pointing to the file that contains the value of preferences
        editor = sharedPreferences.edit(); // retrive/write/save any data
        editor.putString("lock", value); //can use different data types - name is the key which we can use to retrieve the data
        editor.commit(); // apply changes
    }

    public static String getNameValue(Context context) { // Context is activity it is used - like MainActivity.this
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPreferences.getString("lock", null); // null because it is the by default value - if there is no name - returns null
    }

//    public static void setPasswordValue(Context context, String value) {
//        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context); // returns a shared preference intent pointing to the file that contains the value of preferences
//        editor = sharedPreferences.edit(); // retrieve/write/save any data
//        editor.putString("password", value); //can use different data types - name is the key which we can use to retrieve the data
//        editor.commit(); // apply changes
//    }
//
//    public static String getPasswordValue(Context context) { // Context is activity it is used - like MainActivity.this
//        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
//        return sharedPreferences.getString("password", null); // null because it is the by default value - if there is no name - returns null
//    }

    /*public static void removeData(Context context) {
        editor = sharedPreferences.edit();
        //editor.putString("name", null);
        //editor.clear();
        editor.remove("name");
        editor.commit();
    }*/

}


