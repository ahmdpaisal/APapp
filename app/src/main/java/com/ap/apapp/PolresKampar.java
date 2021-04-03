package com.ap.apapp;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PolresKampar extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listAct = new String[] {"Call Center","SMS Center", "Driving Direction", "Website",
                "Info di Google", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listAct));
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
            if (pilihan.equals("Call Center")){
                String nomortel = "tel:0762-20626";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));
            }
            else if(pilihan.equals("SMS Center")){
                String smstxt = "Ahmad Paisal / L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:081276220626"));
                a.putExtra("sms_body", smstxt);
            }
            else if(pilihan.equals("Driving Direction")){
                String lokasirs = "google.navigation:q=0.3376911300510834, 101.01203642664298";
                a= new Intent(Intent.ACTION_VIEW,Uri.parse(lokasirs));
            }
            else if(pilihan.equals("Website")){
                String website = "http://www.polreskampar.com/";
                a= new Intent(Intent.ACTION_VIEW,Uri.parse(website));
            }
            else if(pilihan.equals("Info di Google")){
                a= new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "Polres Kampar");
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
