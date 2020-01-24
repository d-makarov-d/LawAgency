package com.example.lawagency.ui.ask_question;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lawagency.R;
import com.example.lawagency.ui.make_an_appointment.AppointmentViewModel;

public class QuestionFragment extends Fragment {

    private QuestionViewModel questionViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        questionViewModel = ViewModelProviders.of(this).get(QuestionViewModel.class);
        View root = inflater.inflate(R.layout.fragment_question, container, false);
        final TextView textView = root.findViewById(R.id.text_question);
        questionViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
