 public void onClick(View v) {

                double h = new Double(height.getText().toString());
                double w = new Double(weight.getText().toString());
                bmi = w / (h * h / 10000);

                double final_resault = exchangeResault(bmi);
                if (bmi < 18.5) {

                    show.setText("����ָ����" + final_resault + "  " + "ƫ��");
                } else if (bmi >= 18.5 && bmi < 24) {

                    show.setText("����ָ����" + final_resault + "  " + "����");
                } else if (bmi >= 24 && bmi < 27) {

                    show.setText("����ָ����" + final_resault + "  " + "ƫ��");
                } else if (bmi >= 27 && bmi < 30) {

                    show.setText("����ָ����" + final_resault + "  " + "��ȷ���");
                } else if (bmi >= 30 && bmi < 35) {

                    show.setText("����ָ����" + final_resault + "  " + "�жȷ���");
                } else if (bmi > 35) {

                    show.setText("����ָ����" + final_resault + "  " + "�ضȷ���");
                }
            }