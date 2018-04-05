package com.example.zoole.myapplication7;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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

        // A kilépés gomb megvalósítása felső sávon lévő jobb oldali gombra
        if (id == R.id.kilepes) {
            Button kilepes = (Button) findViewById(R.id.kilepes);
                    kilepes.setOnClickListener( new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            finish();
                            System.exit(0);
                        }
                    });
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.fooldal) {
            setTitle("Főoldal");
            Fooldal fooldal = new Fooldal();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, fooldal).commit();
        } else if (id == R.id.bevezeto) {
            setTitle("Bevezető");
            Bevezeto bevezeto = new Bevezeto();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, bevezeto).commit();
        } else if (id == R.id.kivezetesek) {
            setTitle("Kivezetések");
            Kivezetesek kivezetesek = new Kivezetesek();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, kivezetesek).commit();
        } else if (id == R.id.fesz_pin) {
            setTitle("Feszültség pinek");
            FeszPin feszPin = new FeszPin();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, feszPin).commit();
        } else if (id == R.id.kom_pin) {
            setTitle("Kommunikációs pinek");
            KomPin komPin = new KomPin();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, komPin).commit();

        }   else if (id == R.id.strukturalis_felepites) {
            setTitle("Strukturális felépítés");
            Felepites felepites = new Felepites();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, felepites).commit();

        }   else if (id == R.id.utasitasok) {
            setTitle("Az arduino utasításai");
            Utasitasok utasitasok = new Utasitasok();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, utasitasok).commit();

        }   else if (id == R.id.vez_utasit) {
            setTitle("Vezérlési utasítások");
            VezUtasitasok vezutasitasok = new VezUtasitasok();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, vezutasitasok).commit();

        } else if (id == R.id.irasjelek) {
            setTitle("Írásjelek");
            Irasjelek irasjelek = new Irasjelek();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, irasjelek).commit();

        } else if (id == R.id.valtozok) {
            setTitle("Változók");
            Valtozok valtozok = new Valtozok();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, valtozok).commit();

        } /*else if (id == R.id.nav_share) {
            setTitle("Funkciók");
            Funkciok funkciok = new Funkciok();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, funkciok).commit();

        }   */else if (id == R.id.dig_ki_bemenetek) {
            setTitle("Digitális ki- és bemenetek");
            DigKiBemenet digKiBemenet = new DigKiBemenet();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, digKiBemenet).commit();

        } else if (id == R.id.analog_utasitasok) {
            setTitle("Analóg utasítások");
            AnalogUtasitasok analogUtasitasok = new AnalogUtasitasok();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, analogUtasitasok).commit();

        } else if (id == R.id.pwm_pinek) {
            setTitle("Pwm pinek működése");
            PwmPinek pwmPinek = new PwmPinek();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, pwmPinek).commit();

        } else if (id == R.id.fejlett_kibe) {
            setTitle("Fejlett ki- és bemenetek");
            FejlettKibe fejlettKibe = new FejlettKibe();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, fejlettKibe).commit();

        } else if (id == R.id.idozitesek) {
            setTitle("Időzítések");
            Idozitesek idozitesek = new Idozitesek();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, idozitesek).commit();

        } else if (id == R.id.math) {
            setTitle("Matematikai függvények");
            Math math = new Math();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, math).commit();

        } else if (id == R.id.trig) {
            setTitle("Trigonometriai függvények");
            Trig trig = new Trig();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, trig).commit();

        } else if (id == R.id.veletlen) {
            setTitle("Véletlen számok");
            Veletlen veletlen = new Veletlen();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, veletlen).commit();

        } else if (id == R.id.bit) {
            setTitle("Bitek és bájtok");
            Bit bit = new Bit();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, bit).commit();

        } else if (id == R.id.kulso_megszakitasok) {
            setTitle("Külső megszakítások");
            Kulso_megszakitasok kulso_megszakitasok = new Kulso_megszakitasok();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, kulso_megszakitasok).commit();

        } else if (id == R.id.megszakitasok) {
            setTitle("Megszakítások");
            Megszakitasok megszakitasok = new Megszakitasok();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, megszakitasok).commit();

        } else if (id == R.id.comm) {
            setTitle("Kommunikáció");
            Comm comm = new Comm();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, comm).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
