package services;

import java.util.ArrayList;
import java.util.Objects;

import models.MusicItem;
import ui.Message;

public class MusicLibrary{
    private ArrayList<MusicItem> items;
    private MusicItem track;


    public ArrayList<MusicItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MusicItem> items) {
        this.items = items;
    }

    public MusicItem getTrack() {
        return track;
    }

    public void setTrack(MusicItem track) {
        this.track = track;
    }

    public void addItem(MusicItem item){
        items.add(item);
    }

    public void removeItem(int id){

        for(MusicItem item:items){
            if (item.getId()==id){
                items.remove(item);
            }
        }

    }

    public void listAllItems(){
        for(MusicItem item:items){
            Message.send(item.toString());
        }

    }

    public void playItem(int id){


    }

    public void pauseItem(){
        track.pause();

    }

    public void stopItem(){
        track.stop();

    }

    public MusicItem search(int id){
        for (MusicItem item : items){
            if(item.getId()==id){
                    return item;
                }
            }
        return null;
    }

    public MusicItem search(String title, String artist){
        for (MusicItem item : items){
            if(Objects.equals(item.getCreator(), artist)){
                if(Objects.equals(item.getTitle(), title)){
                    return item;
                }
            }
        }
        return null;
    }

    public void load(String file){
        MusicLibraryFileHandler.loadLibrary(file);
    }

    public void save(String file){
        MusicLibraryFileHandler.saveLibrary(items,file);
    }

    public void clearAllItems(){
        items = null;
    }
}