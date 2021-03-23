package Game.Karakterler;

import Game.Game;

import java.awt.*;

public class Oyuncu extends Karakter{

    private Game game;
    public static int sira,sutun;

    public Oyuncu(Game game, float x, float y, int sira,int sutun,int ID, String Ad, String Tur) {
        super(x, y,Karakter.DEFAULT_CHARACTER_WIDTH,Karakter.DEFAULT_CHARACTER_HEIGHT,ID,Ad,Tur);
        this.game = game;
        this.sira = sira;
        this.sutun = sutun;
    }

    public void move(){
        x += xMove;
        y += yMove;
    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {

    }
}
