package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PlayListCollection {
	
	//存放播放列表的集合
	private Map playListMap;
	
	
	public PlayListCollection() {
		
	}

	public PlayListCollection(Map playListMap) {
		this.playListMap = playListMap;
	}

	public Map getPlayListMap() {
		return playListMap;
	}
	
	public void setPlayListMap(Map playListMap) {
		this.playListMap = playListMap;
	}
	//添加播放列表
	public void addPlayList(Map<String,PlayList> playListMap) {
		
	}
	
	//删除播放列表
	public void deletePlayList(Map<String,PlayList> playListMap) {
		
	}
	
	//通过名字查询
	public void searchPlayListByName(Map<String,PlayList> playListMap) {
		
	}
	//显示所有播放列表名称
	public void displayPlayListName(Map<String,PlayList> playListMap) {
		
	}
}
