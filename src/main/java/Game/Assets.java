package Game;

import java.awt.image.BufferedImage;

public class Assets {
   public static BufferedImage Arkaplan;
   public static BufferedImage GozlukluSirin;
   public static BufferedImage Sirine;
    public static void init(){
        Arkaplan = ImageLoader.loadImage("/Arkaplan.png");
        Sirine = ImageLoader.loadImage("/Sirine.png");
        GozlukluSirin = ImageLoader.loadImage("/GozlukluSirin.png");
    }
}
