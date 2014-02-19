/*
 * http://zydor.pl
 * https://github.com/zydor/JStockChart
 * This is a Stock Chart component to render rich and configurable Charts.
 */
package JStockChart;

import java.awt.Frame;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class JStockChartDemo {

    private static void exemplaryChartFrame(){
        JFrame ChartFrame =  new JFrame();
        ChartFrame.setExtendedState(Frame.NORMAL);
        ChartFrame.setSize(800, 700);
        ChartFrame.setLocationRelativeTo(null);
//        PlotGrid pg = new PlotGrid();
//        ChartFrame.add(pg);
        
        ChartFrame.setVisible(true);
    }
            
    public static void main(String[] args) {
         javax.swing.SwingUtilities.invokeLater(new Runnable() {
             public void run() {
                 exemplaryChartFrame();
             }
         });
    }
}
