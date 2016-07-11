package com.example.android.portfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void showToast(Context ctx, int message) {
        if (toast != null) {
            toast.cancel();
        }

        toast = Toast.makeText(ctx, getString(message), Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     * Methods below display Toast on button click
     **/
    public void popularMoviesClicked(View view) {
        showToast(this, R.string.popular_movies_toast);
    }

    public void stockHawkClicked(View view) {
        showToast(this, R.string.stock_hawk_toast);
    }

    public void buildItBiggerClicked(View view) {
        showToast(this, R.string.build_it_bigger_toast);
    }

    public void appMaterialClicked(View view) {
        showToast(this, R.string.app_material_toast);
    }

    public void ubiquitousClicked(View view) {
        showToast(this, R.string.ubiquitous_toast);
    }

    public void capstoneClicked(View view) {
        showToast(this, R.string.capstone_toast);
    }

}
