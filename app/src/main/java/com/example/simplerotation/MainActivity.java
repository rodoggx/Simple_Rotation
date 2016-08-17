package com.example.simplerotation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String SUM_KEY_BUNDLE = "Key Bundle: ";
//    private static final String TAG = "MainActivityTAG_";

    private TextView mTextView;
    private EditText mEditText;

    private int mSum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.mTxt);
        mEditText = (EditText) findViewById(R.id.mEdt);

        // String mNumber = getIntent().getStringExtra("mainText");

       // sum = (TextView) findViewById(R.id.mTxt);
        //String mNumber = getIntent().getStringExtra("mainText");
      // total += Integer.parseInt(mNumber);
        //sum.setText(String.valueOf(n1 + n2));

    }

    public void doMagic(View view) {

        int valueText = Integer.parseInt(mTextView.getText().toString());
        int valueEdit = Integer.parseInt(mTextView.getText().toString());

        mSum = valueEdit + valueText;
        mTextView.setText(String.valueOf(mSum));

       // cont = number.getText().toString();

//        int n2 = Integer.parseInt(cont);

  //      sum.setText(String.valueOf(n1 + n2));

  //      Log.d(TAG, "Number: " + number.getText());

           /*Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("mainText", number.getText().toString());
            startActivity(intent);
*/
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        //create memeber variable
        outState.putInt(SUM_KEY_BUNDLE, mSum);

        //call the parent method on method
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mSum = savedInstanceState.getInt(SUM_KEY_BUNDLE, 0);
        mTextView.setText(String.valueOf(mSum));

    }
}

