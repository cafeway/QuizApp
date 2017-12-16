package com.mayhem.www.quizapp;

        import android.content.Context;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.Toast;

        import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {
    public int Score;
    //create variables to reference
    public RadioGroup QuestionOne;
    public CheckBox Answer2 ;
    public CheckBox Answer2B;
    public EditText Answer3;
    public CheckBox  Answer4A;
    public CheckBox Answer4B;
    public CheckBox  Answer4C;
    public RadioGroup QuestionFive;
    public RadioGroup QuestionSix;
    //increment functon
    public void increment_score(){
        Score++;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        QuestionOne =(RadioGroup) findViewById(R.id.question_one);
        Answer2 =(CheckBox)findViewById(R.id.twoA);
        Answer2B =(CheckBox)findViewById(R.id.twoB);
        Answer3  =(EditText)findViewById(R.id.threeA);
        Answer4A =(CheckBox)findViewById(R.id.fourA);
        Answer4B =(CheckBox)findViewById(R.id.fourB);
        Answer4C =(CheckBox)findViewById(R.id.fourC);
        QuestionFive=(RadioGroup)findViewById(R.id.question_five);
        QuestionSix= (RadioGroup)findViewById(R.id.question_six);
    }
    public void grade(View view){
        if (QuestionOne.getCheckedRadioButtonId() == R.id.one) {
            increment_score();
        }
        if (Answer2.isChecked()&& Answer2B.isChecked()){
            increment_score();
        }
        if (Answer3.getText().toString().equalsIgnoreCase("linear layout")){
            increment_score();
        }
        if(Answer4A.isChecked()&& Answer4B.isChecked() && Answer4B.isChecked()){
            increment_score();
        }
        if (QuestionFive.getCheckedRadioButtonId() == R.id.fiveA) {
            increment_score();
        }
        if (QuestionSix .getCheckedRadioButtonId() == R.id.sixA) {
            increment_score();
        }
        String message=String.valueOf(Score);
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();


    }


}
