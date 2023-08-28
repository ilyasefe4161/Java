package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    //SCREEN SETTINGS
    final int originalTileSize = 16; //16x16 tile
    final int scale = 3;
    final int tileSize = originalTileSize * scale; //48x48 tile
    final int maxScreenCol = 16;
    final int getMaxScreenRow = 12;
    final int screenWdth = tileSize * maxScreenCol; // 768 pixels
    final int screenHeight = tileSize * getMaxScreenRow; // 576 pixels

    Thread gameThread;
    public  GamePanel(){
        this.setPreferredSize(new Dimension(screenWdth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

    }
}
