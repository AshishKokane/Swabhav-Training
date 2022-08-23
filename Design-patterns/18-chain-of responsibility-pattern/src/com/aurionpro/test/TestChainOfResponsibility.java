package com.aurionpro.test;

import com.aurionpro.model.AudioFileHandler;
import com.aurionpro.model.DocFileHandler;
import com.aurionpro.model.ExcelFileHandler;
import com.aurionpro.model.File;
import com.aurionpro.model.Handler;
import com.aurionpro.model.ImageFileHandler;
import com.aurionpro.model.TextFileHandler;
import com.aurionpro.model.VideoFileHandler;

public class TestChainOfResponsibility {

	public static void main(String[] args) {
		File file = null;

		Handler textHandler = new TextFileHandler("Text Handler");
		Handler docHandler = new DocFileHandler("Doc Handler");
		Handler excelHandler = new ExcelFileHandler("Excel Handler");
		Handler audioHandler = new AudioFileHandler("Audio Handler");
		Handler videoHandler = new VideoFileHandler("Video Handler");
		Handler imageHandler = new ImageFileHandler("Image Handler");

		textHandler.setHandler(docHandler);
		docHandler.setHandler(excelHandler);
		excelHandler.setHandler(audioHandler);
		audioHandler.setHandler(videoHandler);
		videoHandler.setHandler(imageHandler);
	

		file = new File("Abc.mp3", "audio", "C:");
		textHandler.process(file);
		System.out.println();

		file = new File("Abc.bat", "bat", "C:");
		textHandler.process(file);

	}

}
