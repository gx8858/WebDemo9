package cn.itcast.demo;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

/**
 * �˽������ִ�еĹ���
 * @author Administrator
 *
 */
public class MyFrame extends JFrame{
	
	public static void main(String[] args) {
		// �¼�Դ���󣨱������Ķ���
		MyFrame mf = new MyFrame();
		mf.setBounds(0, 0, 300, 300);
		mf.setName("�綯��");
		// �󶨼���������
		mf.addWindowListener(new MyListener());
		mf.setVisible(true);
	}
}


/**
 * ���������󣨼���mf��
 * @author Administrator
 *
 */
class MyListener implements WindowListener{
	
	/**
	 * �ô���һ�رգ��÷�����ִ����
	 */
	public void windowClosing(WindowEvent e) {
		MyFrame m = (MyFrame) e.getSource();
		System.out.println(m.getName());
		System.out.println("�ұ�����...");
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
