package com.example.lawagency.ui.specialists;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.lawagency.R;
import com.example.lawagency.RegistrationActivity;

public class SpecialistsFragment extends Fragment {

    private SpecialistsViewModel specialistsViewModel;

    private Button button_add_specialist;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        specialistsViewModel =
                ViewModelProviders.of(this).get(SpecialistsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_specialists, container, false);
        final TextView textView = root.findViewById(R.id.text_specialists);
        specialistsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        button_add_specialist = (Button)root.findViewById(R.id.button_add_specialist);
        button_add_specialist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), RegistrationActivity.class);
                startActivity(intent);
            }
        });

        return root;
    }
}
