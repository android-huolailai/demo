package cn.duc.actionbardemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {
  private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,getAndroidOSVersion()+"", Toast.LENGTH_SHORT).show();//19  系统版本4.4


       ChangeStatueBarColor.setColor(this, R.color.white);
/*
    toolbar=(Toolbar)findViewById(R.id.toorbar);
    //    toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
           @Override
           public boolean onMenuItemClick(MenuItem item) {

               switch (item.getItemId()) {
                   case R.id.action_share:
                       Toast.makeText(MainActivity.this, "fenxiang", Toast.LENGTH_SHORT).show();
                       Log.i("===========", "==============");
                       break;
               }
               return true;
           }
       });*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

        }

        if(id==R.id.action_share){
            Toast.makeText(MainActivity.this, "dddddd", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * 得到系统的sdk
     * @return
     */
    public static int getAndroidOSVersion()
    {
        int osVersion;
        try
        {
            osVersion = Integer.valueOf(android.os.Build.VERSION.SDK);
        }
        catch (NumberFormatException e)
        {
            osVersion = 0;
        }

        return osVersion;
    }
}
