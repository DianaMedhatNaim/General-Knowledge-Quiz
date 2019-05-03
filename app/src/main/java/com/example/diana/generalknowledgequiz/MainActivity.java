package com.example.diana.generalknowledgequiz;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}
    public int findScore(boolean ansr1,boolean ansr2,boolean ansr3,boolean ansr4,boolean ansr5,String Question,Boolean president1,Boolean president2,Boolean president3,Boolean president4 ){
        int score=0;
        if(ansr1){score +=10;}
        if(ansr2){score +=10;}
        if(ansr3){score +=10;}
        if(ansr4){score +=10;}
        if(ansr5){score +=10;}
        if(president1&&president2&&!president3&&!president4 ){score +=10;}
        if(Question.equals("Mexico")){score +=10;}return score;}
    public void Message(int finalScore,String nameText){ if(finalScore==70) {
            Toast.makeText(this, "Congratulations "+nameText + " your Score is " + finalScore+"/70", Toast.LENGTH_LONG).show(); }else {
            Toast.makeText(this, nameText + " your Score is " + finalScore+"/70", Toast.LENGTH_LONG).show(); } }
    public void submit(View view){
        //first answer
        RadioButton radioButton=( RadioButton) findViewById(R.id.southern_radio_button);
        Boolean ans1=radioButton.isChecked();
        //second answer
        RadioButton radioButton2=( RadioButton) findViewById(R.id.bacterium_radio_button);
        Boolean ans2=radioButton2.isChecked();
        //the third answer
        RadioButton radioButton3=( RadioButton) findViewById(R.id.Graphite_radio_button);
        Boolean ans3=radioButton3.isChecked();
        //the fourth answer
        RadioButton radioButton4=( RadioButton) findViewById(R.id.bluewhale_radio_button);
        Boolean ans4=radioButton4.isChecked();
        //Fifth answer
        RadioButton radioButton5=( RadioButton) findViewById(R.id.polio_radio_button);
        Boolean ans5=radioButton5.isChecked();
        //your name
        EditText editText=(EditText) findViewById(R.id.name);
        String text=editText.getText().toString();
        //answer of the question number 7
        EditText questions=(EditText) findViewById(R.id.question);
        String textQuestion=questions.getText().toString();
        //two right answers of the checkbox
        CheckBox Barack  =(CheckBox) findViewById(R.id.Barack_Obama);
        Boolean BarackObama =Barack.isChecked();
        CheckBox Bill   =(CheckBox) findViewById(R.id.Bill_Clinton);
        Boolean BillClinton =Bill.isChecked();
        //two wrong answers of the checkbox
        CheckBox Ernesto  =(CheckBox) findViewById(R.id.Ernesto_Zedillo);
        Boolean ErnestoZedillo =Ernesto.isChecked();
        CheckBox Enrique    =(CheckBox) findViewById(R.id.Enrique_Peña_Nieto);
        Boolean EnriquePeñaNieto =Enrique.isChecked();
        int score= findScore(ans1,ans2,ans3,ans4,ans5,textQuestion,BarackObama,BillClinton,ErnestoZedillo,EnriquePeñaNieto);
        Message(score,text); }}
