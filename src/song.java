public class song {
    //1) Instance Variables
    private String artist; //can also be composer
    private String title;
    private Boolean hasLyrics;
    private int length; //in seconds
    private double fileSize; //in megabytes

    //2) Constructors
    public song()
    {
        title = null;
        artist = null;
        hasLyrics = false;
        length = 0;
        fileSize = 0.0;
    }//end zero arg-arg or default constructor

    public song(String newTitle, String newArtist, boolean newHasLyrics)
    {
        title = newTitle;
        artist = newArtist;
        hasLyrics = newHasLyrics;
        length = 0;
        fileSize = 0.0;
    }//end three-arg constructor

    public song(String newTitle, String newArtist, Boolean newHasLyrics, int newLength, double newFileSize)
    {
        title = newTitle;
        artist = newArtist;
        hasLyrics = newHasLyrics;
        length = checkLength(newLength);
        fileSize = newFileSize;
    }//end multi-arg constructor
    public String getTitle()
    {
        return title;
    }//end of string getTitle

    public String getArtist()
    {
        return artist;
    }//end of string getArtist

    public boolean getHasLyrics()
    {
        return hasLyrics;
    }//end of string hasLyrics

    public void setTitle(String newTitle)
    {
        title = newTitle;
    }//end Title setter

    public void setArtist(String newArtist)
    {
        artist = newArtist;
    }//end setArtist

    public void setLength(int newLength)
    {
        length = checkLength(newLength);
    }//end setLength

    public String toMinSec()
    {
        int minutes = length / 60;
        int seconds = length % 60;
        return minutes + " min " + seconds + " sec";
    }//end of double toMinSec

    /*
    checklength is a helper method. it is private because
    it helps the other public method by validating entry
    This is an example of method decomposition - each method does
    Just one thing
     */

    private int checkLength(int newLength)
    {
        int tempLength = newLength;
        if(tempLength < 0)
        {
            tempLength = 0;
        } //end if
        else if(tempLength > 1200)
        {
            tempLength = 1200;
        }//end else if
        return tempLength;
    }//end of private int checkLength

    public String toString()
    {
        String output = "";
        output += "\nTitle: " + title;
        output += "\nArtist: " + artist;
        output += "\nHas Lyrics: " +  hasLyrics;
        output += "\nLength: " + length;
        output += "\nFile Size: " + fileSize;

        return output;
    }//end toString

}//end class song
