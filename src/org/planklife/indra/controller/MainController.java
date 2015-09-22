package org.planklife.indra.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.planklife.indra.bean.IndraNotification;

public class MainController {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the notification ID ");
		///CURDjpa
		int notificationIDTofind = sc.nextInt();
		EntityManagerFactory enMangerFactory = Persistence.createEntityManagerFactory("Config_JPA");
		EntityManager entityManager = enMangerFactory.createEntityManager();
		IndraNotification notification = entityManager.find(IndraNotification.class, notificationIDTofind);
		
		System.out.println("notification.getNotificationID()"+ notification.getNotificationID());
		System.out.println("notification.getDeviceID()"+ notification.getDeviceID());
		System.out.println("notification.getEventtype()"+ notification.getEventtype());
		System.out.println("notification.getNotificationID()"+ notification.getNotificationID());
		System.out.println("notification.getReading()"+ notification.getReading());
		System.out.println("notification.getTimeStrap()"+ notification.getTimeStrap());
		
		
		
		
	}
	
	

}
