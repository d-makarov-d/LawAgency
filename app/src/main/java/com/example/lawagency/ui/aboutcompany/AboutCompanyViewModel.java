package com.example.lawagency.ui.aboutcompany;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutCompanyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AboutCompanyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is about company fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}