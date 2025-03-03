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

  public int getReleaseYear(){
    return this.releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }

  public boolean getIsPlaying(){
    return this.isPlaying;
  }

  public void setIsPlaying(boolean playing) {
    isPlaying = playing;
  }

  public boolean getIsPaused(){
    return this.isPaused;
  }

  public void setIsPaused(boolean paused) {
    isPaused = paused;
  }


  public void play(){

    this.setIsPlaying(true);
    String message = String.format("Playing Music Item of %d %s.",getReleaseYear(),getTitle());
    Message.send(message);
  }

  public void pause(){
    this.setIsPaused(true);
    String message = String.format("Pausing Music Item of %d %s.",getReleaseYear(),getTitle());

    Message.send(message);
  }
  public void stop(){
    this.setIsPlaying(false);
    if (this.getIsPaused()){
      this.setIsPaused(false);
    }

    String message = String.format("Stopping Music Item of %d %s.",getReleaseYear(),getTitle());

    Message.send(message);

  }

  public void toString(){};

  abstract String getInfo() {
        return null;
    }
  abstract String toCSV();


  
}
