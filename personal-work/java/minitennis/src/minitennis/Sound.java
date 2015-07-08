/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitennis;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;


/**
 *
 * @author Chad
 */
public class Sound {
    public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://www.shockwave-sound.com/sound-effects/explosion-sounds/Arcade%20Explo%20A.wav");
		
		public static final AudioClip BALL = Applet.newAudioClip(url);
		
		BALL.play();
		
		Thread.sleep(1000);
               
		URL url2 = new URL("http://themushroomkingdom.net/sounds/wav/smb/smb_gameover.wav");
		
		public static final AudioClip GAMEOVER = Applet.newAudioClip(url2);
		
		GAMEOVER.play();
		
		Thread.sleep(1000);
                
                URL url3 = new URL("http://www.shockwave-sound.com/sound-effects/explosion-sounds/mortar%20cannon.wav");
		
		public static final AudioClip GAMEOVER = Applet.newAudioClip(url2);
		
		GAMEOVER.play();
		
		Thread.sleep(1000);
}}
