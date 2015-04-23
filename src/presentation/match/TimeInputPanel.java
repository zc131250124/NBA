package presentation.match;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import common.mydatastructure.MyDate;

public class TimeInputPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JComboBox<Integer> year;
	JComboBox<Integer> month;
	JComboBox<Integer> day;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public TimeInputPanel() {
		this.setOpaque(false);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		year = new JComboBox<Integer>();
		year.setModel(new DefaultComboBoxModel(getModel(2013, 2014)));
		this.add(year);

		month = new JComboBox();
		month.setModel(new DefaultComboBoxModel(getModel(1, 12)));
		this.add(month);

		day = new JComboBox();
		this.add(day);

		year.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				setDay(year, month, day);
			}

		});
		month.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				setDay(year, month, day);
			}
		});
		setDay(year, month, day);
		this.setVisible(true);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void setDay(JComboBox year, JComboBox month, JComboBox day) {
		int y = Integer.parseInt((String) year.getSelectedItem());
		int m = Integer.parseInt((String) month.getSelectedItem());
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, y);
		c.set(Calendar.MONTH, m - 1);
		int days = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		day.setModel(new DefaultComboBoxModel(getModel(1, days)));
	}

	private String[] getModel(int start, int end) {
		String[] m = new String[end - start + 1];
		for (int i = 0; i < m.length; i++) {
			m[i] = String.valueOf(i + start);
		}
		return m;
	}

	public MyDate getDate() {
		int y = Integer.parseInt((String) year.getSelectedItem()) % 100;
		int m = Integer.parseInt((String) month.getSelectedItem());
		int d = Integer.parseInt((String) day.getSelectedItem());
		MyDate date = new MyDate(y, m, d);
		return date;
	}
}
