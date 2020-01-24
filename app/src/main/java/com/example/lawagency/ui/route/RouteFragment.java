package com.example.lawagency.ui.route;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.lawagency.R;

public class RouteFragment extends Fragment {

    private RouteViewModel routeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        routeViewModel =
                ViewModelProviders.of(this).get(RouteViewModel.class);
        View root = inflater.inflate(R.layout.fragment_route, container, false);
        final TextView textView = root.findViewById(R.id.text_route);
        routeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}