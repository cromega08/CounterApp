package com.example.counterapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/*
    <Counter App: A counter application for Android build with Java.>
    Copyright (C) <2022>  <Cromega>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.

* */

public class MainActivity extends AppCompatActivity {

    TextView countView, titleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countView = findViewById(R.id.count);
        titleView = findViewById(R.id.title);
    }

    public void increase(View view) {
        int newValue = Integer.parseInt(countView.getText().toString()) + 1;
        display(newValue, 'i');
    }

    public void decrease(View view) {
        int newValue = Integer.parseInt(countView.getText().toString()) - 1;
        display(newValue, 'd');
    }

    @SuppressLint("DefaultLocale")
    private void display(int newValue, char action) {
        String newTitle = action == 'i'? "Increased":"Decreased";
        titleView.setText(newTitle);
        countView.setText(String.format("%d", newValue));
    }
}