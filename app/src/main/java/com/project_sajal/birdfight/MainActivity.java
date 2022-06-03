package com.project_sajal.birdfight;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean iswinner = false;
    int image_clicked = -1;
    int player = 1;
    int[][] winningStates = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};
    int[] gameState = {-1, -1, -1, -1, -1, -1, -1, -1, -1};

    

    public void restart(View view) {
        GridLayout gridLayout = findViewById(R.id.gridLayout);
        int tot_images = gridLayout.getChildCount();
        for (int i = 0; i < tot_images; i++) {
            ImageView v = (ImageView) gridLayout.getChildAt(i);
            v.setImageDrawable(null);
        }
        iswinner = false;
        image_clicked = -1;
        for (int i = 0; i < gameState.length; i++) {
            gameState[i] = -1;
        }
        player = 1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}