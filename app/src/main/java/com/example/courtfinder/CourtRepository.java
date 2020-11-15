/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.courtfinder;

/**
 * This class holds the implementation code for the methods that interact with the database.
 * Using a repository allows us to group the implementation methods together,
 * and allows the WordViewModel to be a clean interface between the rest of the app
 * and the database.
 *
 * For insert, update and delete, and longer-running queries,
 * you must run the database interaction methods in the background.
 *
 * Typically, all you need to do to implement a database method
 * is to call it on the data access object (DAO), in the background if applicable.
 */
/**
public class CourtRepository {

    private CourtDao mWordDao;
    private LiveData<List<Court>> mAllWords;

    CourtRepository(Application application) {
        CourtRoomDatabase db = CourtRoomDatabase.getDatabase(application);
        mWordDao = db.courtDao();
        mAllWords = mWordDao.getAllWords();
    }

    LiveData<List<Court>> getAllWords() {
        return mAllWords;
    }

    public void insert(Court court) {
        new insertAsyncTask(mWordDao).execute(court);
    }

    public void update(Court court)  {
        new updateWordAsyncTask(mWordDao).execute(court);
    }

    public void deleteAll()  {
        new deleteAllWordsAsyncTask(mWordDao).execute();
    }

    // Must run off main thread
    public void deleteWord(Court court) {
        new deleteWordAsyncTask(mWordDao).execute(court);
    }

    // Static inner classes below here to run database interactions in the background.

    /**
     * Inserts a word into the database.

    private static class insertAsyncTask extends AsyncTask<Court, Void, Void> {

        private CourtDao mAsyncTaskDao;

        insertAsyncTask(CourtDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Court... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }

    /**
     * Deletes all words from the database (does not delete the table).

    private static class deleteAllWordsAsyncTask extends AsyncTask<Void, Void, Void> {
        private CourtDao mAsyncTaskDao;

        deleteAllWordsAsyncTask(CourtDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            mAsyncTaskDao.deleteAll();
            return null;
        }
    }

    /**
     *  Deletes a single word from the database.

    private static class deleteWordAsyncTask extends AsyncTask<Court, Void, Void> {
        private CourtDao mAsyncTaskDao;

        deleteWordAsyncTask(CourtDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Court... params) {
            mAsyncTaskDao.deleteWord(params[0]);
            return null;
        }
    }

    /**
     *  Updates a word in the database.

    private static class updateWordAsyncTask extends AsyncTask<Court, Void, Void> {
        private CourtDao mAsyncTaskDao;

        updateWordAsyncTask(CourtDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Court... params) {
            mAsyncTaskDao.update(params[0]);
            return null;
        }
    }
}
*/