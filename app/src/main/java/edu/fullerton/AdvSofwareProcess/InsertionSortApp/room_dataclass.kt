package edu.fullerton.AdvSofwareProcess.InsertionSortApp

import android.content.Context
import android.database.Cursor
import androidx.room.*


@Entity(tableName = "Records_Enity")

data class records( @PrimaryKey(autoGenerate = true) val _id : Int, @ColumnInfo(name = "input") var input: String?, @ColumnInfo(name = "result") var result:String?)



@Dao
interface RecordsDao {

    @Query("SELECT  * FROM Records_Enity as E ")
    fun getAll(): Cursor


    @Insert
    fun insertAll(record: records)

}


@Database(entities = arrayOf(records::class), version = 3, exportSchema = false)
 abstract class AppDatabase : RoomDatabase() {
    abstract fun RecordsDao(): RecordsDao


    companion object {
        private var INSTANCE: AppDatabase? = null
        fun getInstance(context: Context): AppDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "Records_DB"
                ).allowMainThreadQueries()
                    .build()
            }

            return INSTANCE as AppDatabase
        }
    }

}



