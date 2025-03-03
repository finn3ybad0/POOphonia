package models;

import ui.Message;

public class Podcast extends MusicItem {

    private String host;

    private int episodeNumber;

    private String topic;


    public Podcast(int id,String title,int releaseYear,String host,  int episodeNumber,String topic){

        super(id,title,releaseYear);
        this.host = host;
        this.topic = topic;
        this.episodeNumber = episodeNumber;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    @Override
    public void play(){

        this.setIsPlaying(true);
        String message = String.format("Playing Podcast of %d %s by %s",getReleaseYear(),getTitle(),getHost());
        Message.send(message);
    }

    @Override
    public void pause(){
        this.setIsPaused(true);
        String message = String.format("Pausing Podcast of %d %s by %s",getReleaseYear(),getTitle(),getHost());

        Message.send(message);
    }
    @Override
    public void stop(){
        this.setIsPlaying(false);
        if (this.getIsPaused()){
            this.setIsPaused(false);
        }

        String message = String.format("Stopping Podcast of %d %s by %s",getReleaseYear(),getTitle(),getHost());

        Message.send(message);

    }

    public void toString(){
        System.out.printf("Podcast [ID=%d, Title=%s, Release Year=%d, Host=%s, Episode=%d, Topic=%s]",getId(),getTitle(),getReleaseYear(),getHost(),getEpisodeNumber(),getTopic());
    }

    @Override
    public String getInfo() {
        return String.format("");
    }

    @Override
    public String toCSV() {
        return String.format("%d,%s,%d,%s,%d,%s",getId(),getTitle(),getReleaseYear(),getHost(),getEpisodeNumber(),getTopic());
    }



}
