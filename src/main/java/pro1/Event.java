package pro1;

import com.google.gson.annotations.SerializedName;

public class Event
{
    @SerializedName("obsazeni")
    int personsCount;
    @SerializedName("nazev")
    String title;
}
