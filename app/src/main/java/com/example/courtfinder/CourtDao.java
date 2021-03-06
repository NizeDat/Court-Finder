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
 * Data Access Object (DAO) for a word.
 * Each method performs a database operation, such as inserting or deleting a word,
 * running a DB query, or deleting all words.
 */
/**
@Dao
public interface CourtDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Court court);

    @Query("DELETE FROM court_table")
    void deleteAll();

    @Delete
    void deleteWord(Court court);

    @Query("SELECT * from court_table LIMIT 1")
    Court[] getAnyWord();

    @Query("SELECT * from court_table ORDER BY court ASC")
    LiveData<List<Court>> getAllWords();

    @Update
    void update(Court... court);
}
*/