package com.aashanvit.iiitd.assign1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView prime;
    int curr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prime = (TextView) findViewById(R.id.prime);
        curr = RandomGenerate();
        prime.setText(Integer.toString(curr));
        checkprime(curr);


    }

    protected int RandomGenerate(){
        int randomNum = 0 + (int)(Math.random() * 1000);
        return randomNum;
    }

    public void OnClickNextPrime(View v){
        curr = RandomGenerate();
        prime.setText(Integer.toString(curr));
        checkprime(curr);
    }

    public void OnClickYes(View v){
        if(checkprime(curr) == 1){
            Toast.makeText(this,"You are Correct",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"You are wrong",Toast.LENGTH_SHORT).show();
        }


    }
    public void OnClickNo(View v){
        if(checkprime(curr) == 1){
            Toast.makeText(this,"You are wrong",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"You are Correct",Toast.LENGTH_SHORT).show();
        }


    }

    public int checkprime(int n){
        int i = 0;
        for (i = 2; i < n;i++){
            if(n%i == 0){
                return 0;
            }
        }
        return 1;
    }

}
