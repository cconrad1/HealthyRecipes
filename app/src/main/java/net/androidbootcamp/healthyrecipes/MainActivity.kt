package net.androidbootcamp.healthyrecipes

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Button button = (Button)findViewByld(R.id.btnRecipe);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                startactivity(new Intent(Mainactivity.this, Recipe.class));
            }
        });
}