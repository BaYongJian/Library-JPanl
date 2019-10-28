package jjjs.byj;


import javax.swing.JFrame;

import jjjs.byj.view.Login;

/**
 * 主程序
 */
@SuppressWarnings("serial")
public class BookManage extends JFrame {
	

	public BookManage() {
		
		new Login();
	}
	
	
	public static void main(String[] args) {
		
		new BookManage();
		
	}

}
