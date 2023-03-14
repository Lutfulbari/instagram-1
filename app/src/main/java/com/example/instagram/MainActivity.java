package com.example.instagram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    DrawerLayout drawerLayout;
    MaterialToolbar materialToolbar;
    NavigationView navigationView;

    TextView headerTitle;
    View headerView;

    ImageView imgHeader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        drawerLayout = findViewById(R.id.drawerLayout);
        materialToolbar = findViewById(R.id.materialToolbar);
        navigationView = findViewById(R.id.navigationView);

        headerView = navigationView.getHeaderView(0);
        headerTitle = headerView.findViewById(R.id.headerTitle);
        imgHeader = headerView.findViewById(R.id.imgHeader);






        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                MainActivity.this, drawerLayout, materialToolbar, R.string.drawer_close, R.string.drawer_open);

        drawerLayout.addDrawerListener(toggle);


        materialToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId()==R.id.Plus){
                    Toast.makeText(MainActivity.this, "Plus", Toast.LENGTH_SHORT).show();
                }


                return false;
            }
        });



        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                if (item.getItemId() == R.id.SettingsAndPrivacy) {

                    //Toast.makeText(getApplicationContext(), "Settings and privacy", Toast.LENGTH_SHORT).show();

                    // setting.WEB_URL = "https://www.instagram.com/lutfulbarimusa/";


                    setting.WEB_URL = "https://www.instagram.com/accounts/edit/";

                    FragmentManager fManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new setting() );
                    fragmentTransaction.commit();





                    drawerLayout.closeDrawer(GravityCompat.START);
                    headerTitle.setText("ROBIN");
                }
                else if (item.getItemId() == R.id.YourActivity) {

                    setting.WEB_URL = "https://www.instagram.com/your_activity/interactions/likes/";

                    FragmentManager fManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new setting() );
                    fragmentTransaction.commit();


   //                 Toast.makeText(getApplicationContext(), "Your activity", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (item.getItemId() == R.id.Archive) {


                    setting.WEB_URL = "https://www.instagram.com/lutfulbarimusa/saved/";

                    FragmentManager fManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new setting() );
                    fragmentTransaction.commit();



         //           Toast.makeText(getApplicationContext(), "Archive", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (item.getItemId() == R.id.QRCode) {



                    setting.WEB_URL = "https://www.instagram.com/qr/";

                    FragmentManager fManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new setting() );
                    fragmentTransaction.commit();






                //    Toast.makeText(getApplicationContext(), "QR code", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (item.getItemId() == R.id.Saved) {

                    setting.WEB_URL = "https://www.instagram.com/lutfulbarimusa/saved/";

                    FragmentManager fManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new setting() );
                    fragmentTransaction.commit();


 //                   Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (item.getItemId() == R.id.OrderAndPayments) {


                    setting.WEB_URL = "https://accountscenter.instagram.com/payments/";

                    FragmentManager fManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new setting() );
                    fragmentTransaction.commit();



                   // Toast.makeText(getApplicationContext(), "Order and payments", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (item.getItemId() == R.id.DigitalCollectibles) {


                    setting.WEB_URL = "https://wallets.instagram.com/";

                    FragmentManager fManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new setting() );
                    fragmentTransaction.commit();

                   // Toast.makeText(getApplicationContext(), "Digital collectibles", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }

                else if (item.getItemId() == R.id.CloseFriends) {


                    setting.WEB_URL = "https://www.instagram.com/explore/";

                    FragmentManager fManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new setting() );
                    fragmentTransaction.commit();


//                    Toast.makeText(getApplicationContext(), "Close friends", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (item.getItemId() == R.id.Favourites) {


                    setting.WEB_URL = "https://accountscenter.instagram.com/profiles/";

                    FragmentManager fManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new setting() );
                    fragmentTransaction.commit();

 //                   Toast.makeText(getApplicationContext(), "Favourites", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }

                return true;
            }
        });



        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.getItemId();

                if (item.getItemId() == R.id.home) {


                    setting.WEB_URL = "https://www.instagram.com/lutfulbarimusa/";

                    FragmentManager fManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new setting() );
                    fragmentTransaction.commit();


                    drawerLayout.closeDrawer(GravityCompat.START);

                   // Toast.makeText(getApplicationContext(), "HOME", Toast.LENGTH_SHORT).show();
                }
                else if (item.getItemId() == R.id.search) {

                    setting.WEB_URL = "https://www.instagram.com/jubayerhossainbd/?hl=en";

                    FragmentManager fManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new setting() );
                    fragmentTransaction.commit();

                    //                   Toast.makeText(getApplicationContext(), "Favourites", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (item.getItemId() == R.id.Plus) {

                    setting.WEB_URL = "https://www.instagram.com/reels/Cl9KcViD94k/?hl=en";

                    FragmentManager fManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new setting() );
                    fragmentTransaction.commit();

                    //                   Toast.makeText(getApplicationContext(), "Favourites", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (item.getItemId() == R.id.reel) {

                    setting.WEB_URL = "https://www.instagram.com/reels/Cl9KcViD94k/?hl=en";

                    FragmentManager fManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new setting() );
                    fragmentTransaction.commit();

                    //                   Toast.makeText(getApplicationContext(), "Favourites", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else if (item.getItemId() == R.id.profile) {

                    setting.WEB_URL = "https://www.instagram.com/lutfulbarimusa/?hl=en";

                    FragmentManager fManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new setting() );
                    fragmentTransaction.commit();

                    //                   Toast.makeText(getApplicationContext(), "Favourites", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                return true;
            }
        });





    }
}


/*
                    FragmentManager fManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new setting() );
                    fragmentTransaction.commit();

 */