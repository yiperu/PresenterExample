package com.example.everis.presenterexample;

/**
 * Created by everis on 23-11-17.
 */

public class MainActivityPresenter {

    MainActivity view;

    public MainActivityPresenter(MainActivity view) {
        this.view = view;
    }

    public void incrementValue(int value) {
        view.incrementNumber(value);
    }
}
