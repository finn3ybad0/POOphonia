package models;

import ui.Message;

public abstract class MusicItem {
  
  private int id;

  private String title;

  private int releaseYear;

  private boolean isPlaying = false;

  private boolean isPaused = false;

  public MusicItem(int id,String title,int releaseYear){
    
    this.id = id;
    this.title = title;
    this.releaseYear = releaseYear;
  }

  public MusicItem() {

  }

  public int getId(){
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle(){
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public abstract String getCreator();

  public int getReleaseYear(){
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }

  public boolean getIsPlaying(){
    return isPlaying;
  }

  public void setIsPlaying(boolean playing) {
    this.isPlaying = playing;
  }

  public boolean getIsPaused(){
    return isPaused;
  }


  public void setIsPaused(boolean paused) {
    this.isPaused = paused;
  }


  public void play(){
    setIsPlaying(true);
  }

  public void pause(){
    setIsPaused(true);
  }
  public void stop(){
    setIsPlaying(false);
    if (getIsPaused()){
      setIsPaused(false);
    }
  }
  @Override
  public String toString(){
    return String.format("MusicItem{id=%d, title='%s', releaseYear='%s', isPlaying=%b, isPaused=%b}",getId(),getTitle(),getReleaseYear(),getIsPlaying(),getIsPaused());
  };

  public abstract String getInfo();
  public abstract String toCSV();


  
}
