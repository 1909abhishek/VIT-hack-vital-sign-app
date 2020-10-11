package com.example.vit;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {
    TextView name,mob,email,dob,gen, logoutbtn, contact, feedback;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  view =  inflater.inflate(R.layout.fragment_profile,container, false);
        name=view.findViewById(R.id.tvname);
        mob=view.findViewById(R.id.tvmob);
        email=view.findViewById(R.id.tvemail);
        dob=view.findViewById(R.id.tvdob);
        gen=view.findViewById(R.id.tvgender);
        logoutbtn=view.findViewById(R.id.logoutbtn);
        contact = view.findViewById(R.id.contact);
        feedback = view.findViewById(R.id.feedback);



        return view;
    }
}
