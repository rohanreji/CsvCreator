package com.hpe.csv.csvcreator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.net.ssl.SSLContext;

import au.com.bytecode.opencsv.CSVWriter;

public class MainActivity extends Activity {

    EditText name,college,department,phone,email,six,seven,eight;
    ImageView nameImg,collegeImg,deptImg,phoneImg,emailImg,sixImg,sevenImg,eightImg;
    SharedPreferences sharedPref;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sharedPref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


        setContentView(R.layout.content_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        name = (EditText) findViewById(R.id.nameText);
        college = (EditText) findViewById(R.id.collegeText);
        department = (EditText) findViewById(R.id.deptText);
        phone = (EditText) findViewById(R.id.phoneText);
        email = (EditText) findViewById(R.id.emailText);
        six = (EditText) findViewById(R.id.sixthText);
        seven = (EditText) findViewById(R.id.seventhText);
        eight = (EditText) findViewById(R.id.eightText);


        nameImg = (ImageView) findViewById(R.id.nameImgView);
        collegeImg = (ImageView) findViewById(R.id.colImgView);
        deptImg = (ImageView) findViewById(R.id.deptImgView);
        phoneImg = (ImageView) findViewById(R.id.phoneImgView);
        emailImg = (ImageView) findViewById(R.id.emailImgView);
        sixImg = (ImageView) findViewById(R.id.sixthImgView);
        sevenImg = (ImageView) findViewById(R.id.seventhImgView);
        eightImg = (ImageView) findViewById(R.id.eigthImgView);

        name.addTextChangedListener(new TextWatcher(){
            public void afterTextChanged(Editable s) {
                System.out.println(s.length());
                if(s.length()>0)
                nameImg.setImageResource(R.drawable.data_entered);
                else
                    nameImg.setImageResource(R.drawable.empty_field);
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after){}
            public void onTextChanged(CharSequence s, int start, int before, int count){}
        });

        college.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                System.out.println(s.length());
                if (s.length() > 0)
                    collegeImg.setImageResource(R.drawable.data_entered);
                else
                    collegeImg.setImageResource(R.drawable.empty_field);
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });


        department.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                System.out.println(s.length());
                if (s.length() > 0)
                    deptImg.setImageResource(R.drawable.data_entered);
                else
                    deptImg.setImageResource(R.drawable.empty_field);
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        phone.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                System.out.println(s.length());
                if (s.length() > 0)
                    phoneImg.setImageResource(R.drawable.data_entered);
                else
                    phoneImg.setImageResource(R.drawable.empty_field);
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        email.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                System.out.println(s.length());
                if (s.length() > 0)
                    emailImg.setImageResource(R.drawable.data_entered);
                else
                    emailImg.setImageResource(R.drawable.empty_field);
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        six.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                System.out.println(s.length());
                if (s.length() > 0)
                    sixImg.setImageResource(R.drawable.data_entered);
                else
                    sixImg.setImageResource(R.drawable.empty_field);
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });


        seven.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                System.out.println(s.length());
                if (s.length() > 0)
                    sevenImg.setImageResource(R.drawable.data_entered);
                else
                    sevenImg.setImageResource(R.drawable.empty_field);
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        eight.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                System.out.println(s.length());
                if (s.length() > 0)
                    eightImg.setImageResource(R.drawable.data_entered);
                else
                    eightImg.setImageResource(R.drawable.empty_field);
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });





//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//
//                FileWriter mFileWriter;
//                String baseDir = android.os.Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "CSV Writer";
//                File csvDirectory = new File(baseDir);
//                csvDirectory.mkdir();
//                String fileName = "StudentData.csv";
//                String filePath = baseDir + File.separator + fileName;
//                File f = new File(filePath);
//                CSVWriter writer;
//                try {
//                    if (f.exists() && !f.isDirectory()) {
//                        mFileWriter = new FileWriter(filePath, true);
//                        writer = new CSVWriter(mFileWriter);
//                    } else {
//                        writer = new CSVWriter(new FileWriter(filePath));
//                        String[] header = {sharedPref.getString("first_head", "Name"), sharedPref.getString("second_head","College"), sharedPref.getString("third_head", "Department"),sharedPref.getString("fourth_head", "Phone Number"),sharedPref.getString("fifth_head", "Email")};
//                        writer.writeNext(header);
//                    }
//                    String[] data = {name.getText().toString(), college.getText().toString(), department.getText().toString(), phone.getText().toString(), email.getText().toString()};
//                    writer.writeNext(data);
//                    writer.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        });


    }

    public void saveData(View v){

        FileWriter mFileWriter;
                String baseDir = android.os.Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "CSV Writer";
                File csvDirectory = new File(baseDir);
                csvDirectory.mkdir();
                String fileName = "StudentData.csv";
                String filePath = baseDir + File.separator + fileName;
                File f = new File(filePath);
                CSVWriter writer;
                try {
                    if (f.exists() && !f.isDirectory()) {
                        mFileWriter = new FileWriter(filePath, true);
                        writer = new CSVWriter(mFileWriter);
                    } else {
                        writer = new CSVWriter(new FileWriter(filePath));
                        String[] header = {"Student Name", "College",  "Roll Number", "Year of Graduation","Email", "Phone", "Department", "Comments"};
                        writer.writeNext(header);
                    }
                    String[] data = {name.getText().toString(), college.getText().toString(), department.getText().toString(), phone.getText().toString(), email.getText().toString(),six.getText().toString(),seven.getText().toString(),eight.getText().toString()};
                    writer.writeNext(data);
                    writer.close();
                    name.setText("");
                    phone.setText("");
                    department.setText("");
                    email.setText("");
                    college.setText("");
                    six.setText("");
                    seven.setText("");
                    eight.setText("");
                    Intent i =new Intent(this.getApplicationContext(),SecondActivity.class);
                    startActivity(i);
                } catch (IOException e) {
                    e.printStackTrace();
                }

    }
    public void cancelData(View v){

        name.setText("");
        phone.setText("");
        department.setText("");
        email.setText("");
        college.setText("");
        six.setText("");
        seven.setText("");
        eight.setText("");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
