package models

public class Song extends MusicItem {
    
  private String artist;

  private String genre;

  private int duration;

  public Song(int id,String title,int releaseYear,boolean isPlaying,String artist, String genre, int duration){
    
    super(id,title,releaseYear,isPlaying);
    this.artist = artist;
    this.genre = genre;
    this.duration = duration;
  }

  public String getArtist(){
    return this.artist;
  }

  public String getGenre(){
    return this.genre;
  }

  public int getDuration(){
    return this.duration;
  }

  public void play(){
    
    String message = "Song " 
  }

  public void stop(){
    String message = 
  }


  
}
