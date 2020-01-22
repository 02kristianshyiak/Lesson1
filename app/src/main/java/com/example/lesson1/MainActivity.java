package com.example.lesson1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lesson1.R;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int numberOfCoffees = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     This method is called when the plus is clicked.
     */
    public void increment(View view) {
        numberOfCoffees = numberOfCoffees + 1;
        display(numberOfCoffees);
    }

    /**
     This method is called when the plus is clicked.
     */
    public void decrement(View view) {
        numberOfCoffees = numberOfCoffees - 1;
        display(numberOfCoffees);
    }

    /**

     This method is called when the order is clicked.
     */
    public void submitOrder(View view) {
        display(numberOfCoffees);
        displayPrice(numberOfCoffees * 5);
    }
    /**

     This method displays the given quantity value on screen.
     */
    private void display(int number) {
        TextView zeroTextView = (TextView) findViewById(R.id.zero_text_view);
        zeroTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView PriceTextView = (TextView) findViewById(R.id.Price_text_view);
        PriceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
