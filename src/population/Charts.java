package population;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class Charts extends JFrame{
	public Charts(ArrayList<WorldBankEntry> data) {
		PieDataset dataset = createDataset(data);
		JFreeChart ch = ChartFactory.createPieChart3D("Populate", dataset);
		ChartPanel chartPanel = new ChartPanel(ch);
		ch.removeLegend();
		chartPanel.setPreferredSize(new Dimension(500, 300));
		setContentPane(chartPanel);
		setVisible(true);
		pack();
	}

	private PieDataset createDataset(ArrayList<WorldBankEntry> data) {
		DefaultPieDataset chartData = new DefaultPieDataset();
		
		for (WorldBankEntry k : data) {
			
			chartData.setValue(k.getCountry(), k.getToPopulation());
		}
		return chartData;
	}
}
