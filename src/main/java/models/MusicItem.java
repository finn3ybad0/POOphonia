package models

public abstract class MusicItem {
  
  private int id;

  private String title;

  private int releaseYear;

  private boolean isPlaying = false;

  private boolean isPaused = false;

  public MusicItem(int id,String title,int releaseYear,boolean isPlaying){
    
    this.id = id;
    this.title = title;
    this.releaseYear = releaseYear;
    this.isPlaying = isPlaying;
  }

  public int getId(){
    return this.id;
  }

  public String getTitle(){
    return this.title;
  }

  public int getReleaseYear(){
    return this.releaseYear;
  }

  public boolean getIsPlaying(){
    return this.isPlaying;
  }

  public void setIsPlaying(boolean newStatus){
    this.isPlaying = newStatus;
  }

  public boolean getIsPaused(){
    return this.isPaused;
  }

  public void setIsPaused(boolean newStatus){
    this.isPaused = newStatus;
  }

  public abstract play();

  public abstract pause();

  public abstract stop();

  public abstract toString();


  
}
