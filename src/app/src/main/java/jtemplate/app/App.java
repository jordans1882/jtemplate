/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jtemplate.app;

import jtemplate.list.LinkedList;

import static jtemplate.utilities.StringUtils.join;
import static jtemplate.utilities.StringUtils.split;
import static jtemplate.app.MessageUtils.getMessage;

// import org.apache.commons.text.WordUtils;

import javax.swing.JFrame;

public class App {
  public static void main(String[] args) {
    JFrame frame = new JFrame("MyApp");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // JFrame.EXIT_ON_CLOSE
    frame.setVisible(true);
    // LinkedList tokens;
    // tokens = split(getMessage());
    // String result = join(tokens);
    // System.out.println(WordUtils.capitalize(result));
  }
}