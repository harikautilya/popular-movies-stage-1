package com.movies.book.ui.main;

import android.content.Context;
import android.os.Bundle;

import com.movies.book.Base.Classes.BaseViewModel;
import com.movies.book.Base.DataManager;
import com.movies.book.Base.rx.SchedulerProvider;
import com.movies.book.storage.BaseDataPackage;

public class MainViewModel extends BaseViewModel<MainNavigator> {

    public MainViewModel(DataManager dataManager, SchedulerProvider schedulerProvider, BaseDataPackage baseDataPackage) {
        super(dataManager, schedulerProvider, baseDataPackage);
    }

    @Override
    public void init(Bundle savedInstanceState, Context context) {

    }
}
