package com.exterro.Jettyserver_Project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
			String url_open = "File_Upload.html";
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
			

		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
