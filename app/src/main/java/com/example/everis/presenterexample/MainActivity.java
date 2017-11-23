package com.example.everis.presenterexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainActivityView{

    TextView textView;
    Button button;

    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenter(this);

        textView = (TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = Integer.parseInt(textView.getText().toString());
//                textView.setText(Integer.toString(count + 1));
                presenter.incrementValue(count);
            }
        });

    }

    @Override
    public void incrementNumber(int valor) {
        textView.setText(Integer.toString(valor + 1));
    }
}
