package test;

import model.PlayList;
import model.PlayListCollection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import model.Song;

public class TestDemo {
	//测试歌曲类
	public void testSong() {
		
	}
	//测试播放列表类
	public void testPlayList() {
		
	}
	//测试播放器类
	public void testPlayListCollection() {
		
	}
	//主菜单
	public static void mainMenu() {
		
	}

	// 播放列表管理菜单
	public static void playListMenu(Map<String, PlayList> playListMap,PlayListCollection plc) {
		boolean flag = true;
		label: while (flag) {
			System.out.println("*************************************");
			System.out.println("           **播放列表管理**");
			System.out.println("           1--将歌曲添加到主播放列表");
			System.out.println("           2--将歌曲添加到普通播放列表");
			System.out.println("           3--通过歌曲id查询播放列表中的歌曲");
			System.out.println("           4--通过歌曲名称查询播放列表中的歌曲");
			System.out.println("           5--修改播放列表中的歌曲");
			System.out.println("           6--删除播放列表中的歌曲");
			System.out.println("           7--显示播放列表中的所有歌曲");
			System.out.println("           8--导出歌单");
			System.out.println("           9--返回上一级菜单");
			System.out.println("*************************************");
			System.out.println("请输入对应的数字对播放列表进行管理：");
			Scanner sc = new Scanner(System.in);
			int n = 0;
			System.out.println("请输入对应数字进行操作:");
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("输入有误！");
				continue;
			}
			switch (n) {
			case 1:
				int n1 = 0;
				Scanner sc1 = new Scanner(System.in);
				while (true) {
					System.out.println("将歌曲添加到主播放列表");
					System.out.println("请输入要添加的歌曲数量：");
					try {
						n1 = sc.nextInt();
						break;
					} catch (InputMismatchException e) {
						// TODO: handle exception
						System.out.println("输入错误！");
						sc= new Scanner(System.in);
						continue;
					}
				}

				for (int i = 0; i < n1; i++) {
					System.out.println("请输入第" + (i + 1) + "首歌曲：");
					System.out.println("请输入歌曲的id：");
					String s11 = sc.next();
					System.out.println("请输入歌曲的名称：");
					String s12 = sc.next();
					System.out.println("请输入演唱者：");
					String s13 = sc.next();
					Song song = new Song(s11, s12, s13);
					playListMap.get("mainList").getMusicList().add(song);
				}
				break;
			case 2:
				System.out.println("将歌曲添加到普通播放列表\n请输入要添加播放列表的名称：");
				String s2 = sc.next();
				PlayList pc2 = null;
				Song sc2 =null;
				Set<String> keySet = playListMap.keySet();
				for (String key : keySet) {
					if (s2.equals(key)) {
						pc2 = playListMap.get(key);
						int n2 = 0;
						while (true) {

							System.out.println("请输入要添加的歌曲数量：");
							try {
								n2 = sc.nextInt();
								break;
							} catch (InputMismatchException e) {
								// TODO: handle exception
								System.out.println("输入错误！");
								sc = new Scanner(System.in);
								continue;
							}
						}

						for (int i = 0; i < n2; i++) {
							System.out.println("请输入第" + (i + 1) + "首歌曲：");
							System.out.println("请输入歌曲的id：");
							sc =new Scanner(System.in);
							String s21 = sc.next();
							for (int ml2 = 0; ml2 < playListMap.get("mainList").getMusicList().size(); ml2++) {
								sc2 =null;
								if (((Song) (playListMap.get("mainList").getMusicList().get(ml2))).getId().equals(s21)) {
									playListMap.get(s2).getMusicList().add(((Song) (playListMap.get("mainList").getMusicList().get(ml2))));
									sc2 = ((Song) (playListMap.get("mainList").getMusicList().get(ml2)));
									break;
								} 
							}
							if (sc2 == null) {
								System.out.println("该歌曲在主播放列表中不存在，继续输入歌曲的其他信息！");
								System.out.println("请输入歌曲的名称：");
								String s22 = sc.next();
								System.out.println("请输入演唱者：");
								String s23 = sc.next();
								Song song2 = new Song(s21, s22, s23);
								playListMap.get(s2).getMusicList().add(song2);
								playListMap.get("mainList").getMusicList().add(song2);
							}
						}
//						System.out.println("mainList：");
//						System.out.println("播放列表中的歌曲为：");
//						for (int j = 0; j < playListMap.get("mainList").getMusicList().size(); j++) {
//							System.out.println(((Song) (playListMap.get(s2).getMusicList().get(j))));
//						}
//						System.out.println("普通播放列表：");
//						System.out.println("播放列表中的歌曲为：");
//						for (int k = 0; k < playListMap.get(s2).getMusicList().size(); k++) {
//							System.out.println(((Song) (playListMap.get(s2).getMusicList().get(k))));
//						}
					} 
				}
				if(pc2==null) {
					System.out.println("该播放列表不存在，请先将播放列表添加到播放器中！");
				}
				break;
			case 3:
				System.out.println("通过歌曲id查询播放列表中的歌曲\n请输入要查询的播放列表的名称");
				String s3 = sc.next();
				Song song3 = null;
				PlayList pc3 = null;
				Set<String> keySet1 = playListMap.keySet();
				for (String key : keySet1) {
					if (s3.equals(key)) {
						pc3 = playListMap.get(s3);
						System.out.println("请输入要查询的歌曲id：");
						String s31 = sc.next();
						for (int n3 = 0; n3 < playListMap.get(s3).getMusicList().size(); n3++) {
							if (((Song) (playListMap.get(s3).getMusicList().get(n3))).getId().equals(s31)) {
								System.out.println("该歌曲的信息为："+((Song) (playListMap.get(s3).getMusicList().get(n3))));
								song3 = ((Song) (playListMap.get(s3).getMusicList().get(n3)));
								break;
							}
							
						}
						if(song3 == null) {
							System.out.println("歌曲在播放列表"+s3+"中不存在！");
						}
					}
				}
				if (pc3 == null) {

					System.out.println("该播放列表不存在，请先将播放列表添加到播放器中！");
				}
				break;
			case 4:
				System.out.println("通过歌曲名称查询播放列表中的歌曲\n请输入要查询的播放列表的名称");
				String s4 = sc.next();
				Song song4 = null;
				PlayList pc4 = null;
				Set<String> keySet4 = playListMap.keySet();
				for (String key : keySet4) {
					if (s4.equals(key)) {
						pc4 = playListMap.get(s4);
						System.out.println("请输入要查询的歌曲名字：");
						String s41 = sc.next();
						for (int n4 = 0; n4 < playListMap.get(s4).getMusicList().size(); n4++) {
							if (s41.equals((((Song) playListMap.get(s4).getMusicList().get(n4)).getName()))) {
								System.out.println("该歌曲的信息为："+((Song)(playListMap.get(s4).getMusicList().get(n4))));
								song4 = ((Song) (playListMap.get(s4).getMusicList().get(n4)));
								break;
							}
				
						}
						if(song4 == null) {
							System.out.println("歌曲在播放列表"+s4+"中不存在！");
						}
					}
				}
				if (pc4 == null) {

					System.out.println("该播放列表不存在，请先将播放列表添加到播放器中！");
				}
				break;
			case 5:
				System.out.println("修改播放列表中的歌曲\n请输入要修改的id：");
				Song song5 = null;
				String s5 = sc.next();
				for (int n5 = 0; n5 < playListMap.get("mainList").getMusicList().size(); n5++) {
					if (((Song) (playListMap.get("mainList").getMusicList().get(n5))).getId().equals(s5)) {
						song5 = ((Song)(playListMap.get("mainList").getMusicList().get(n5)));
					}
				}
				if(song5 == null) {
					System.out.println("歌曲在主播放列表中不存在！");
				}
				System.out.println("请输入要修改后的名称：");
				String s51 = sc.next();
				song5.setName(s51);
				System.out.println("请输入修改后的演唱者：");
				String s52 = sc.next();
				song5.setSinger(s52);
				System.out.println("修改成功！");
				break;
			case 6:
				System.out.println("删除播放列表中的歌曲\n请输入要删除的歌曲id：");
				String s6 = sc.next();
				PlayList p6 =null;
				Iterator<String> it = playListMap.keySet().iterator();
				while (it.hasNext()) {
					p6 = playListMap.get(it.next());
					for (int n61 = 0; n61 < p6.getMusicList().size(); n61++) {
						if (((Song) (p6.getMusicList().get(n61))).getId().equals(s6)) {
							p6.getMusicList().remove(((Song) (p6.getMusicList().get(n61))));
						}
					}
				}

				System.out.println("删除成功！");
				break;
			case 7:
				PlayList pc7 = null;
				System.out.println("显示播放列表中的所有歌曲\n请输入要输入的播放列表的名称");
				String s7 = sc.next();
				Set<String> keySet7 = playListMap.keySet();
				for (String key : keySet7) {
					if (s7.equals(key)) {
						System.out.println("播放列表中的所有歌曲为：");
						pc7 = playListMap.get(key);
						for (int i = 0; i < playListMap.get(s7).getMusicList().size(); i++) {
							System.out.println(((Song) (playListMap.get(s7).getMusicList().get(i))));
							// System.out.println("主播放列表中的所有歌曲为：");
						}
					}
				}
				if (pc7 == null) {

					System.out.println("该播放列表不存在，请先将播放列表添加到播放器中！");
				}
				break;
			case 8:
				try {
					FileOutputStream fos = new FileOutputStream("song.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					System.out.println("导出歌单\n请输入要导出歌单的播放列表的名称：");
					PlayList p8 = null;
					String s8 = sc.next();
					Set<String> keySet8 =playListMap.keySet();
					for (String key : keySet8) {
						if (s8.equals(key)) {
							p8 = playListMap.get(s8);
							for(int i= 0;i<playListMap.get(s8).getMusicList().size();i++) {
								Song sss = ((Song) (playListMap.get(s8).getMusicList().get(i)));
								oos.writeObject(sss);
								oos.flush();
								fos.close();
								oos.close();
								System.out.println("歌单导出成功！");
							}
							
						}
					}
					if(p8==null) {
						System.out.println("该播放列表不存在，请先将播放列表添加到播放器中！");					
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
				break;
			case 9:
				break label;
			default:
				System.out.println("请输入正确数字!");
			}
		}
	}
	//播放器菜单
	public static void playerMenu(Map<String, PlayList> playListMap, PlayListCollection plc) {		
		boolean flag = true;
		label:
		while (flag) {
			System.out.println("*************************************");
			System.out.println("           **播放器管理**");
			System.out.println("           1--向播放器添加列表");
			System.out.println("           2--从播放器删除播放列表");
			System.out.println("           3--通过名字查询播放列表信息");
			System.out.println("           4--显示所有播放列表名称");
			System.out.println("           9--返回上一级菜单");
			System.out.println("*************************************");
			System.out.println("请输入对应的数字对播放列表进行管理：");
			Scanner sc = new Scanner(System.in);
			int n = 0;
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("输入有误！");
				continue;
			}
			switch (n) {
			case 1:
				System.out.println("向播放器添加播放列表\n输入要添加播放列表的名称：");
				String playListNameCreate = sc.next();
				List musicListCreate = new ArrayList();
				PlayList pl = new PlayList(playListNameCreate,musicListCreate);
				playListMap.put(playListNameCreate,pl);
				System.out.println("添加成功！");
				break;
			case 2:
				System.out.println("删除播放列表\n请输入要删除的操作列表的名字：");
				String strDelete = sc.next();
				playListMap.remove(strDelete);
				System.out.println("删除成功！");
				break;
			case 3:
				System.out.println("通过名字查询播放列表信息\n请输入要查询的播放列表的名称：");
				PlayList p1 = null;
				String splb = sc.next();
				Set<String> keySet = playListMap.keySet();
				for(String key:keySet) {
					if(splb.equals(key)) {
						System.out.println("该播放列表存在！\n该播放列表的名称为："+key);					
						p1 = playListMap.get(key);
						break;
//						System.out.println("播放列表中的所有歌曲为：");
//						Iterator it = playListMap.values().iterator();
//						while(it.hasNext()) {
//							System.out.println(it.next());
//						}
					}

				}
				if(p1==null) {
					System.out.println("播放列表不存在");
				}
				break;
			case 4:
				System.out.println("显示所有播放列表名称\n播放列表名称为：");
				Iterator<String> it = playListMap.keySet().iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				break;
			case 9:
				flag = false;
				break label;
			default: 
				System.out.println("请输入正确数字！");
				break;
			}
		}

	}
	//主流程实现
	public void test() {
		
	}

	public static void main(String[] args) {
		// 播放列表集合

		Map<String, PlayList> a = new HashMap<String, PlayList>();
		PlayListCollection plc1 = new PlayListCollection(a);
		// 主播放列表
		List c = new ArrayList();
		PlayList mainPlayList = new PlayList("mainList", c);
		a.put("mainList", mainPlayList);
		while (true) {
			System.out.println("*************************************");
			System.out.println("           **主菜单**");
			System.out.println("           1--播放列表管理");
			System.out.println("           2--播放器管理");
			System.out.println("           0--退出");
			System.out.println("*************************************");
			Scanner sc = new Scanner(System.in);
			int n = 0;
			System.out.println("请输入对应数字进行操作:");
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("输入有误！");
				continue;
			}
			switch (n) {
			case 2:
				playerMenu(a, plc1);
				break;
			case 1:
				playListMenu(a, plc1);
				break;
			case 0:
				System.exit(-1);
			default:
				System.out.println("输入有误！");
				break;

			}

		}

	}
}
