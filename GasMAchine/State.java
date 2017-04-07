import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class State here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface State 
{
 	public void insertCard();
	public void removeCard();
	public void next();
	public void reject();
	public void help();
	public void cancel();
	public void finishFueling();
	public void finishPrinting();   
}


