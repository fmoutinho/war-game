package br.uff.model;

public class PlayerUser extends PlayerAbstract {

    public PlayerUser(String name, String img) {
    	this.setId(Data.players.size()+1);
        this.setName(name);
        this.setImg(img);
        this.setIa(false);
    }

    @Override
    public void play() {

    }
}
