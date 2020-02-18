package com.example.lawagency.ui.specialists;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SpecialistsViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public SpecialistsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is specialists fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
