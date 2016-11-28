package com.example.frywj.navigationdrawerdemo;


import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
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
import com.example.frywj.navigationdrawerdemo.Region;
import com .example.frywj.navigationdrawerdemo.Nation;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener{

    private ImageView imageViewMap;
    public Button buttonRegion1;
    public Button buttonRegion2;
    public Button buttonRegion3;
    public Button buttonRegion4;
    public Button buttonRegion5;
    public Button buttonRegion6;
    private Button buttonAttack;
    private Button buttonMove;
    private Button buttonTrade;
    private TextView textViewTurnCounter;

    private ImageView imageViewRegion1;
    private ImageView imageViewRegion2;
    private ImageView imageViewRegion3;
    private ImageView imageViewRegion4;
    private ImageView imageViewRegion5;
    private ImageView imageViewRegion6;

    private int turnNumber = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //The FAB will act as our finish turn button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Advancing to next turn...", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
                turnNumber ++;
                textViewTurnCounter.setText("Turn: " + turnNumber);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        buttonRegion1 = (Button) findViewById(R.id.buttonRegion1);
        buttonRegion2 = (Button) findViewById(R.id.buttonRegion2);
        buttonRegion3 = (Button) findViewById(R.id.buttonRegion3);
        buttonRegion4 = (Button) findViewById(R.id.buttonRegion4);
        buttonRegion5 = (Button) findViewById(R.id.buttonRegion5);
        buttonRegion6 = (Button) findViewById(R.id.buttonRegion6);

        textViewTurnCounter = (TextView) findViewById(R.id.textViewTurnCounter);

        imageViewRegion1 = (ImageView) findViewById(R.id.imageViewRegion1);
        imageViewRegion2 = (ImageView) findViewById(R.id.imageViewRegion2);
        imageViewRegion3 = (ImageView) findViewById(R.id.imageViewRegion3);
        imageViewRegion4 = (ImageView) findViewById(R.id.imageViewRegion4);
        imageViewRegion5 = (ImageView) findViewById(R.id.imageViewRegion5);
        imageViewRegion6 = (ImageView) findViewById(R.id.imageViewRegion6);


        buttonAttack = (Button) findViewById(R.id.buttonAttack);
        buttonMove = (Button) findViewById(R.id.buttonMove);
        buttonTrade = (Button) findViewById(R.id.buttonTrade);

        buttonRegion1.setOnClickListener(this);
        buttonRegion2.setOnClickListener(this);
        buttonRegion3.setOnClickListener(this);
        buttonRegion4.setOnClickListener(this);
        buttonRegion5.setOnClickListener(this);
        buttonRegion6.setOnClickListener(this);


        //imageViewRegion1.setColorFilter(Color.BLUE);
        //imageViewRegion2.setColorFilter(Color.BLUE);


        Nation nationOne = new Nation();
        Nation nationTwo = new Nation();
        Region redRegion = new Region(10, 5);

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
        } else if (id == R.id.action_logout) {
            Intent intentLogin = new Intent(this, LoginActivity.class);
            this.startActivity(intentLogin);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_politics) {
            // Handle the politics action
        } else if (id == R.id.nav_Economics) {
            buttonTrade.setOnClickListener(this);
            buttonTrade.setVisibility(View.VISIBLE);
        } else if (id == R.id.nav_Military) {
            buttonAttack.setOnClickListener(this);
            buttonMove.setOnClickListener(this);
            buttonAttack.setVisibility(View.VISIBLE);
            buttonMove.setVisibility(View.VISIBLE);

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

        switch (v.getId()) {
            case R.id.buttonRegion1:
                imageViewRegion1.setColorFilter(Color.WHITE);
                Toast.makeText(this, "Yellow", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonRegion2:
                imageViewRegion2.setColorFilter(Color.WHITE);
                Toast.makeText(this, "Gray", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonRegion3:
                imageViewRegion3.setColorFilter(Color.WHITE);
                Toast.makeText(this, "Maroon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonRegion4:
                imageViewRegion4.setColorFilter(Color.WHITE);
                Toast.makeText(this, "Light Blue", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonRegion5:
                imageViewRegion5.setColorFilter(Color.WHITE);
                Toast.makeText(this, "Dark Blue", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonRegion6:
                imageViewRegion6.setColorFilter(Color.WHITE);
                Toast.makeText(this, "Red", Toast.LENGTH_SHORT).show();
                break;


            case R.id.buttonAttack:
                Toast.makeText(this, "Attack!!", Toast.LENGTH_SHORT).show();
                buttonAttack.setVisibility(View.GONE);
                buttonMove.setVisibility(View.GONE);
                break;
            case R.id.buttonMove:
                Toast.makeText(this, "Move Out!!", Toast.LENGTH_SHORT).show();
                buttonAttack.setVisibility(View.GONE);
                buttonMove.setVisibility(View.GONE);
                break;
            case R.id.buttonTrade:
                Toast.makeText(this, "Buy and Sell!!", Toast.LENGTH_SHORT).show();
                buttonTrade.setVisibility(View.GONE);
                break;
        }
    }
}
