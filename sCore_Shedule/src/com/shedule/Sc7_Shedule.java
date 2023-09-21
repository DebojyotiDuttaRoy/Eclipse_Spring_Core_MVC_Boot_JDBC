package com.shedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
/* import java.util.Timer;
	import java.util.TimerTask;
	
	class Schedular extends TimerTask{
		@Override
		public void run() {
				System.out.println("Hello!!");
		}
	}		*/
public class Sc7_Shedule {
	public static void main(String[] args) {
			//new Timer().schedule(new Schedular(),0,5000);
			@SuppressWarnings({ "unused", "resource" })
			AbstractApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);
	}
}