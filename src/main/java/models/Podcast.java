package models;

import ui.Message;

public class Podcast extends MusicItem {

    private String host;

    private int episodeNumber;

    private String topic;


    public Podcast(int id,String title,int releaseYear,String host, int episodeNumber,String topic){

        super(id,title,releaseYear);
        this.host = host;
        this.topic = topic;
        this.episodeNumber = episodeNumber;
    }

    public Podcast (String[] parts) {
        super(  Integer.parseInt(parts[1]), parts[2], Integer.parseInt(parts[3]));
        this.host = parts[4];
        this.episodeNumber =  Integer.parseInt(parts[5]);
        this.topic = parts[6];
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }




//        String message = String.format("Playing Podcast of %d %s by %s",getReleaseYear(),getTitle(),getHost());
//        Message.send(message);

//        String message = String.format("Pausing Podcast of %d %s by %s",getReleaseYear(),getTitle(),getHost());
//        Message.send(message);

//        String message = String.format("Stopping Podcast of %d %s by %s",getReleaseYear(),getTitle(),getHost());
//        Message.send(message);

    @Override
    public String toString(){
        return String.format("Podcast{id=%d, title='%s', releaseYear=%d, host='%s', episodeNumber=%d, topic='%s'}",getId(),getTitle(),getReleaseYear(),getHost(),getEpisodeNumber(),getTopic(),getIsPlaying(),getIsPaused());
    }

    @Override
    public String getInfo() {
        return String.format("Info : [ Host=%s, Episode Number=%d, Topic=%s]",getHost(),getEpisodeNumber(),getTopic());
    }

    public String toCSV() {
        return String.format("podcast,%d,%s,%d,%s,%d,%s",getId(),getTitle(),getReleaseYear(),getHost(),getEpisodeNumber(),getTopic());
    }







}
