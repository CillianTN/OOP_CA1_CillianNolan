package Assessment;


import jdk.nashorn.internal.scripts.JO;

import javax.sound.midi.Track;
import javax.swing.*;

public class TestAlbum {
    public static void main(String[] args) {
        String actualOutput;
        int shuffleQ;
        Song output;
        int trackCount, playTrack;


        //TESTING  output = "Test" + song1;

        // JOptionPane.showMessageDialog(null,output,"",JOptionPane.INFORMATION_MESSAGE);


        Album album1 = new Album("Now That's What I call Music 98", new String[+1], "Universal Music", 2016);
        actualOutput = "" + album1;


        Song track1 = new Song(" Sugar Baby Love", " Rubettes", " Pop", 136, 1977);
        Song track2 = new Song("Living on a Prayer", "Bon Jovi", "Rock", 184, 1985);
        Song track3 = new Song("Blue Suede Shoes", "Elvis Presley", "Pop", 157, 1963);
        Song track4 = new Song("Someone Like You", "Adele", "Pop", 223, 2013);
        Song track5 = new Song("House of Fun", "Madness", "Pop", 178, 1984);

        Song tracks[] = new Song[5];
        tracks[0] = track1;
        tracks[1] = track2;
        tracks[2] = track3;
        tracks[3] = track4;
        tracks[4] = track5;

        output = track5;
        JOptionPane.showMessageDialog(null, actualOutput + output, "", JOptionPane.INFORMATION_MESSAGE);

        playTrack = Integer.parseInt(JOptionPane.showInputDialog("Which track number would you like to play?"));
        if (playTrack > 5 || playTrack < 0)
            JOptionPane.showMessageDialog(null, "An invalid track number was entered", "Bad Track", JOptionPane.WARNING_MESSAGE);
        else if (playTrack == 1)
            JOptionPane.showMessageDialog(null, "Now playing - details are as follows" + track1);
        else if (playTrack == 2)
            JOptionPane.showMessageDialog(null, "Now playing - details are as follows" + track2);
        else if (playTrack == 3)
            JOptionPane.showMessageDialog(null, "Now playing - details are as follows" + track3);
        else if (playTrack == 4)
            JOptionPane.showMessageDialog(null, "Now playing - details are as follows" + track4);
        else if (playTrack == 5)
            JOptionPane.showMessageDialog(null, "Now playing - details are as follows" + track5);

        shuffleQ = JOptionPane.showConfirmDialog(null, "Do you wish to shuffle the tracks?", "Shuffle Playlist", JOptionPane.YES_NO_OPTION);

        //Album shuffle = new shuffleQ();
        if (shuffleQ == JOptionPane.YES_OPTION)

            JOptionPane.showMessageDialog(null, "Shuffled Playlist is as follows: " /*+ shuffle*/, "Shuffled Playlist", JOptionPane.INFORMATION_MESSAGE);
        else {
            System.exit(0);
            System.exit(0);
        }


    }}
