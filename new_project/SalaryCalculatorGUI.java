package new_project;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class SalaryCalculatorGUI {
    public static void main(String[] args) {
        JFrame pencere = new JFrame("çalışan maaş Hesaplama");
        pencere.setSize(500, 400);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] sutunlar = {"çalışan adı", "çalışma saati", "saatlik ücret", "toplam maaş"};

        Object[][] veriler = {{"Ahmet Yılmaz", "40", "250 TL", "10.000 TL"},
                {"Ayşe Demir", "45", "300 TL", "13.500 TL"}};

        DefaultTableModel model=new DefaultTableModel(veriler,sutunlar);
                                     JTable table=new JTable(model);
                                     JScrollPane kaydirmaPaneli=
                               new JScrollPane(table);
         pencere.add(kaydirmaPaneli);
         pencere.setVisible(true);

    }


}
