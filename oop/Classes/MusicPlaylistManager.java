package oop.Classes;

public class MusicPlaylistManager {
    public static class Song{
        String title;
        String artist;
        double duration;

        public Song(String title, String artist, double duration){
            this.title = title;
            this.artist = artist;
            this.duration = duration;
        }

        public void displaySong(){
            System.out.println(title + " by " + artist + " (" + duration + " min)");
        }
    }

    public static class Playlist{
        Song currentsong;

        public void addSong(Song song){
            this.currentsong = song;
        }

        public void play(){
            if (currentsong != null){
                System.out.println("Now playing: " + currentsong.title + " by " + currentsong.artist );
                System.out.println("2:21 ─〇───── 2:45");
                System.out.println("⇄ ◃◃ II ▹▹ ↻");
            } else{
                System.out.println("Playlist is empty.");
            }
        }

        public void showSong(){
            if (currentsong != null){
                currentsong.displaySong();
            } else {
                System.out.println("Playlist is empty.");
            }
        }
    }

    public static void main(String[] args){
        Song song = new Song("Nights", "Frank Ocean", 5.07);

        Playlist playlist = new Playlist();
        playlist.addSong(song);

        playlist.play();
    }
}
