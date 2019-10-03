public class songDriver
{
    public static void main(String args[])
    {
        //1. Create a Song, or more
        song firework = new song("Fireworks", "Katy Perry", true, 234, 6.94);
        song overture = new song("Overture", "Petyr Ilych Tchaviosky", false, 1093, 4.56);
        song deadlochs = new song("Deadlochs", "Blue face", true, 1750, 3.97);
        song happySong = new song("Moi", "The Happy Song", true);

        deadlochs.setLength(-5);
        System.out.println(deadlochs);

//        firework.title = "Happy Song";
//        System.out.println(firework);

        //System.out.println(firework.getTitle());
        //System.out.println(firework.getArtist());
        //System.out.println(firework.getHasLyrics());

        //System.out.println("In minutes: " + overture.toMinSec());
        //System.out.println(happySong);

    //2. Print it out
//        System.out.println(firework);
//        firework.setTitle("Lala");
//        firework.setArtist("A singer");
//        System.out.println(firework);
    }

}// end class songDriver
