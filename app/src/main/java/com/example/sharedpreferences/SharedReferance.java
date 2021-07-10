package com.example.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedReferance {

    SharedPreferences sharedReferance;
    public SharedReferance(Context context){
        sharedReferance=context.getSharedPreferences("myRef",context.MODE_PRIVATE);

    }
    public void saveData(String userName,String password){
    SharedPreferences.Editor editor=sharedReferance.edit();
    editor.putString("userName",userName);
    editor.putString("password",password);
    editor.commit();
    }
    public  String loadData(){
    String fileContent="UserName:"
            +sharedReferance.getString("userName",
            "no name");
        fileContent+=",Password:"
                +sharedReferance.getString("password",
                "no password");
        return  fileContent;
    }

}
