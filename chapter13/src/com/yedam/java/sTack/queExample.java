package com.yedam.java.sTack;

import java.util.LinkedList;
import java.util.Queue;

public class queExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();

		messageQueue.offer(new Message("sendMail", "정재엽"));
		messageQueue.offer(new Message("sendSMS", "서덕진"));
		messageQueue.offer(new Message("sendKakao", "박준우"));

		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();

			switch (message.command) {
			case "sendMail":
				System.out.println(message.to +"님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to +"님에게 SMS을 보냅니다.");
				break;
			case "sendKakao":
				System.out.println(message.to +"님에게 카카오톡을 보냅니다.");
				break;

			}
		}

	}

}
