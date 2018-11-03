package cn.itcast.demo;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

/**
 * 了解监听器执行的过程
 * @author Administrator
 *
 */
public class MyFrame extends JFrame{
	
	public static void main(String[] args) {
		// 事件源对象（被监听的对象）
		MyFrame mf = new MyFrame();
		mf.setBounds(0, 0, 300, 300);
		mf.setName("电动车");
		// 绑定监听器对象
		mf.addWindowListener(new MyListener());
		mf.setVisible(true);
	}
}


/**
 * 监听器对象（监听mf）
 * @author Administrator
 *
 */
class MyListener implements WindowListener{
	
	/**
	 * 该窗口一关闭，该方法就执行了
	 */
	public void windowClosing(WindowEvent e) {
		MyFrame m = (MyFrame) e.getSource();
		System.out.println(m.getName());
		System.out.println("我被踢了...");
		System.exit(0);
	}


	public void windowOpened(WindowEvent e) {
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
