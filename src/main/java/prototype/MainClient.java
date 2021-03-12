package prototype;

import java.util.Random;

/**
 * 原型模式：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * （不通过new关键字来产生一个对象，而是通过对象复制来实现的模式）
 */
public class MainClient {
	private static int MAX_COUNT = 6;
	public static void main(String[] args){
		int i=0;
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("xx银行版权所有");
		while (i<MAX_COUNT){
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRandString(5)+"先生（女士）");
			cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8));
			sendMail(cloneMail);
			i++;
		}
	}
	public static void sendMail(Mail mail){
		System.out.println("标题："+mail.getSubject()+"\t收件人："+mail.getReceiver()+"\t...发送成功");
	}

	public static String  getRandString(int num){
       String source="asdfghjklqwertyuiopzxcvbnm";
       StringBuffer sb  = new StringBuffer();
		Random rand = new Random();
		for(int i=0;i<num;i++){
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		return sb.toString();
	}
}
