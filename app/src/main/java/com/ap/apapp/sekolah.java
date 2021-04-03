package com.ap.apapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class sekolah extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listpolisi = new String[] {"UIN Suska Riau", "Universitas Riau", "Universitas Islam Riau", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listpolisi));
    }

    protected void onListItemClick (ListView lv, View v, int position, long id){
        super.onListItemClick(lv, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try{
            Intent a = null;
            if (pilihan.equals("UIN Suska Riau")){
                a= new Intent(this, UINSuska.class);
            }
            else if(pilihan.equals("Universitas Riau")){
                a= new Intent(this, UNRI.class);
            }
            else if(pilihan.equals("Universitas Islam Riau")){
                a= new Intent(this, UIR.class);
            }
            else if(pilihan.equals("Exit")){
                a= new Intent(this, MainActivity.class);
            }
            startActivity(a);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
