package com.movies.book.ui.main;

import android.support.v4.app.FragmentManager;

import com.movies.book.Base.Classes.BaseFragment;
import com.movies.book.adapter.PageFragmentAdapter;

import java.util.List;

public class MovieAdapter extends PageFragmentAdapter {

    public MovieAdapter(FragmentManager fm, List<BaseFragment> fragments, List<String> pageTitles) {
        super(fm, fragments, pageTitles);
    }
}
