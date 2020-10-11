package com.example.vit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class PulseRate extends AppCompatActivity {
    private LineChart graph;
    CardView drcontact1, drcontact2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulse_rate);

        graph= findViewById(R.id.graph);
        drcontact1 = findViewById(R.id.drcontact1);
        drcontact2 = findViewById(R.id.drcontact2);


        graph.setDragEnabled(true);
        graph.setScaleEnabled(false);
        ArrayList<Entry> yvalues=new ArrayList<>();
        yvalues.add(new Entry(0,60f));
        yvalues.add(new Entry(1,50f));
        yvalues.add(new Entry(2,30f));
        yvalues.add(new Entry(3,50f));
        yvalues.add(new Entry(4,62f));
        yvalues.add(new Entry(5,69f));
        LineDataSet set=new LineDataSet(yvalues,"Pulse rate");
        set.setFillAlpha(110);
        set.setColor(Color.RED);
        set.setLineWidth(3);
        set.setValueTextSize(8);
        ArrayList<ILineDataSet> dataSets=new ArrayList<>();
        dataSets.add(set);
        LineData lineData=new LineData(dataSets);
        graph.setData(lineData);

        drcontact1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PulseRate.this, DoctorDescription.class);
                startActivity(intent);
            }
        });

        drcontact2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PulseRate.this, DoctorDescription.class);
                startActivity(intent);
            }
        });

    }
}