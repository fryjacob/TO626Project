package com.example.frywj.navigationdrawerdemo;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener{

    private ImageView imageViewMap;
    private Button buttonYellow;
    private Button buttonGray;
    private Button buttonRed;
    private Button buttonMaroon;
    private Button buttonLightBlue;
    private Button buttonDarkBlue;
    private TextView textViewTurnCounter;

    private int turnNumber = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Advancing to next turn...", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        buttonYellow = (Button) findViewById(R.id.buttonYellow);
        buttonGray = (Button) findViewById(R.id.buttonGray);
        buttonRed = (Button) findViewById(R.id.buttonRed);
        buttonMaroon = (Button) findViewById(R.id.buttonMaroon);
        buttonLightBlue = (Button) findViewById(R.id.buttonLightBlue);
        buttonDarkBlue = (Button) findViewById(R.id.buttonDarkBlue);
        textViewTurnCounter = (TextView) findViewById(R.id.textViewTurnCounter);


        buttonYellow.setOnClickListener(this);
        buttonGray.setOnClickListener(this);
        buttonRed.setOnClickListener(this);
        buttonMaroon.setOnClickListener(this);
        buttonLightBlue.setOnClickListener(this);
        buttonDarkBlue.setOnClickListener(this);

        textViewTurnCounter.setText("Turn: " + turnNumber);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_politics) {
            // Handle the camera action
        } else if (id == R.id.nav_Economics) {

        } else if (id == R.id.nav_Military) {

        } else if (id == R.id.nav_health) {

        } else if (id == R.id.nav_roll) {

        } else if (id == R.id.nav_skip) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {

        Intent intentLogin = new Intent(this, LoginActivity.class);

        switch (v.getId()) {
            case R.id.buttonYellow:
                //Toast.makeText(this, "Yellow", Toast.LENGTH_SHORT).show();
                this.startActivity(intentLogin);
                break;
            case R.id.buttonGray:
                Toast.makeText(this, "Gray", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonRed:
                Toast.makeText(this, "Red", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonMaroon:
                Toast.makeText(this, "Maroon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonLightBlue:
                Toast.makeText(this, "Light Blue", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonDarkBlue:
                Toast.makeText(this, "Dark Blue", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
