/**
 * MainApp.java 
 *
 * Sunil Samuel CONFIDENTIAL
 *
 *  [2014] Sunil Samuel
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Sunil Samuel. The intellectual and technical
 * concepts contained herein are proprietary to Sunil Samuel
 * and may be covered by U.S. and Foreign Patents, patents in
 * process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this
 * material is strictly forbidden unless prior written permission
 * is obtained from Sunil Samuel.
 */

package com.sunilsamuel.optical.optimal;

import java.util.ResourceBundle;

import com.sunilsamuel.optical.optimal.controller.OpticalOptimalController;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {
	public static void main(String[] args) throws Exception {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		ResourceBundle bundle = ResourceBundle.getBundle("properties/messages");
		new OpticalOptimalController().handleIntroductionPage(stage, bundle);
	}
}
