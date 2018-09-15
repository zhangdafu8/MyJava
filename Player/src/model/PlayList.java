package model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PlayList {
	//播放列表名称
	private String playListName;
	//播放列表中歌曲集合
	private List musicList;
	
	
	
	public PlayList() {
		
	}
	
	public PlayList(String playListName, List musicList) {
		this.playListName = playListName;
		this.musicList = musicList;
	}
	
	
	public String getPlayListName() {
		return playListName;
	}
	public void setPlayListName(String playListName) {
		this.playListName = playListName;
	}
	public List getMusicList() {
		return musicList;
	}
	public void setMusicList(List musicList) {
		this.musicList = musicList;
	}
	
	
	//歌曲添加到主播放列表
	public void addToPlayList(Map<String, PlayList> playListMap) {
	
	}
	//歌曲添加到普通播放列表
	public void addToSmallPlayList( Map<String, PlayList> playListMap) {
				
	}
	
	//通过id查询歌曲
	public void searchSongById(String id,PlayList playList) {

	}
	
	//通过名称查询歌曲
	public void searchSongByName() {
		
	}
	
	//修改歌曲
	public void updateSong() {

	}
	
	//从播放列表删除歌曲
	public void deleteSong() {
		
		
	}

	// 显示播放列表中的所有歌曲
	public void disPlaySong(Map<String, PlayList> playListMap) {
		
	}
	
	//导出歌单
	public void exportPlayList() {
		
	}
	
	
	//按歌曲名进行排序
	public void sortBySongName() {
		
	}
	
}
