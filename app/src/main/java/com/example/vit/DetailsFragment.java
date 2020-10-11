package com.example.vit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DetailsFragment extends Fragment {
    TextView text1, text2, text3, text4, text5, text6;
    EditText etext1, etext2, etext3, etext4, etext5, etext6;
    Button submitbtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_details,container,false);
        text1 = view.findViewById(R.id.text1);
        text2 = view.findViewById(R.id.text2);
        text3 = view.findViewById(R.id.text3);
        text4 = view.findViewById(R.id.text4);
        text5 = view.findViewById(R.id.text5);
        text6 = view.findViewById(R.id.text6);
        etext1 = view.findViewById(R.id.etext1);
        etext2 = view.findViewById(R.id.etext2);
        etext3 = view.findViewById(R.id.etext3);
        etext4 = view.findViewById(R.id.etext4);
        etext5 = view.findViewById(R.id.etext5);
        etext6 = view.findViewById(R.id.etext6);
        submitbtn = view.findViewById(R.id.submitbtn);

        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Your Response is Recorded", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
