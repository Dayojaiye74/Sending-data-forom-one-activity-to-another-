package com.dev_app.sendingdatatootheractivites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    /*Declare the Button and EditText by giving it a variable name of your choice. Here i will call
    make the variable name of button to be called btn and for EditText editText*/
    Button btn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Call the Button and EditText from the XML layout
        btn = findViewById(R.id.button);
        editText = findViewById(R.id.editText);


    }

    /*Create a class for the button to perform an action..
    the reason for the if statement is to ensure that
    the editText is not left empty by the user,if that
    occurs the error message we stated below will display. */

    //Create a class for the button to perform an action.
    public void onClick (View view){
        String msg = editText.getText().toString();

        if (msg.length()==0){
            editText.setError("You must enter a message here");
        }
        else {

            //Telling the Intent what to do
            Intent activity2 = new Intent(MainActivity.this,Main2Activity.class);

            //This will send the message you input in the EditText to Activity 2 when the button is clicked
            activity2.putExtra("text", msg);

            //The new activity wil start
            startActivity(activity2);
        }
    }

}
