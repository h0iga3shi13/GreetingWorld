import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Lang extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Lang frame = new Lang();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Lang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setLabelFor(lblNewLabel);
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(162, 108, 157, 100);
		contentPane.add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//				String string = (String) comboBox.getItemAt(0);
				int index = comboBox.getSelectedIndex();
				System.out.println(index);

				// 世界中の"こんにちは"をLabelに表示（並び順を lang と同じに）
				String[] greeting = { "こんにちは", "Hello", "你好", "Hallo", "Ciao", "Privet", "Olá", "Hola", "aloha" };
				lblNewLabel.setText(greeting[index]);
			}

		});
		comboBox.setBounds(197, 260, 91, 21);
		contentPane.add(comboBox);

		// conboBoxに表示したい言語はここに追加する
		String[] lang = { "日本語", "英語", "中国語", "ドイツ語", "イタリア語", "ロシア語", "ポルトガル語", "スペイン語", "ハワイ語" };
		for (String item : lang) {
			comboBox.addItem(item);
		}

	}
}