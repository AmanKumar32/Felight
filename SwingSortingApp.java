package swingbenchmarking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class SwingSortingApp extends JFrame implements ActionListener {

	private JFrame frmWelcomeToIndian;
	private JTextField textInput;
	JButton btnInsertionSort = new JButton("Inserstion Sort");
	JButton btnSelectionSort = new JButton("Selection Sort");
	JPanel panel = new JPanel(null);
	private JTextField textResult;
	private final JTextField textTimeInsertion = new JTextField();
	private final JTextField textTimeSelection = new JTextField();
	JButton btnClear = new JButton("Clear");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingSortingApp window = new SwingSortingApp();
					window.frmWelcomeToIndian.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingSortingApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textTimeSelection.setBounds(261, 241, 127, 20);
		textTimeSelection.setColumns(10);
		textTimeInsertion.setBounds(79, 241, 116, 20);
		textTimeInsertion.setColumns(10);
		frmWelcomeToIndian = new JFrame();
		frmWelcomeToIndian.setTitle("Welcome To Sorting Api");
		frmWelcomeToIndian.setBounds(200, 200, 450, 500);
		frmWelcomeToIndian.setResizable(false);
		frmWelcomeToIndian.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frmWelcomeToIndian.getContentPane().add(panel, BorderLayout.CENTER);

		JLabel lblSorting = new JLabel("Sorting on Just Click Of Button");
		lblSorting.setBounds(110, 25, 246, 14);
		panel.add(lblSorting);

		JLabel lblEnterNumbers = new JLabel("Enter Numbers To  Sort  :");
		lblEnterNumbers.setBounds(33, 76, 142, 14);
		panel.add(lblEnterNumbers);

		textInput = new JTextField();
		textInput.setToolTipText("enter numbers");
		textInput.setBounds(185, 73, 185, 20);
		panel.add(textInput);
		textInput.setColumns(10);

		btnInsertionSort.setBounds(68, 165, 127, 23);
		panel.add(btnInsertionSort);

		btnSelectionSort.setBounds(246, 165, 149, 23);
		panel.add(btnSelectionSort);

		textResult = new JTextField();
		textResult.setBounds(185, 112, 185, 20);
		panel.add(textResult);
		textResult.setColumns(10);

		JLabel lblListOfSorted = new JLabel("List Of Sorted Numbers :");
		lblListOfSorted.setBounds(33, 115, 142, 14);
		panel.add(lblListOfSorted);

		JLabel lblTimeTakenFor = new JLabel("Time Taken For Sorting");
		lblTimeTakenFor.setBounds(178, 216, 167, 14);
		panel.add(lblTimeTakenFor);

		panel.add(textTimeInsertion);

		panel.add(textTimeSelection);

		btnClear.setBounds(345, 39, 89, 23);
		panel.add(btnClear);

		btnInsertionSort.addActionListener((ActionListener) this);
		btnSelectionSort.addActionListener((ActionListener) this);
		btnClear.addActionListener((ActionListener) this);
		panel.setVisible(true);
	}

	public void actionPerformed(ActionEvent obj) {
		String str = textInput.getText();
		String delimiter = " ";
		String arr[] = str.split(delimiter);
		int[] source = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			source[i] = Integer.parseInt(arr[i]);
		}
		if (obj.getSource() == btnClear) {
			textInput.setText("");
			textResult.setText("");
			textTimeInsertion.setText("");
			textTimeSelection.setText("");
		}
		if (obj.getSource() == btnInsertionSort) {
			long timeStart, timeEnd;
			timeStart = System.currentTimeMillis();
			int[] result =InsertionSort.doInsertionSort(source);
			String arrresult = "";
			for (int i = 0; i < result.length; i++) {
				arrresult += " " + result[i];
			}
			textResult.setText(arrresult);
			timeEnd = (System.currentTimeMillis() - timeStart);
			textTimeInsertion.setText("" + timeEnd+"ms");
		}

		if (obj.getSource() == btnSelectionSort) {
			long timeStart, timeEnd;
			timeStart = System.currentTimeMillis();
			int[] result = SelectionSort.SelectionSearch(source);
			String arrresult = "";

			for (int i = 0; i < result.length; i++) {
				arrresult += " " + result[i];
			}
			textResult.setText(arrresult);
			timeEnd = (System.currentTimeMillis() - timeStart);
			textTimeSelection.setText("" + timeEnd+"ms");
		}

	}

	
	
}
