package com.movies.book.storage.match;

import com.movies.book.storage.BaseDataPackage;

public class MatchRepo implements MatchData{

    private MatchData remoteData;
    private MatchData cloudData;

    public MatchRepo(MatchData remoteData, MatchData cloudData) {
        this.remoteData = remoteData;
        this.cloudData = cloudData;
    }


    @Override
    public void getMatchData() {

    }

    @Override
    public void createTable() {
        remoteData.createTable();
    }

    @Override
    public void destroyTable() {

    }
}