 public void onClick(View v) {

                double h = new Double(height.getText().toString());
                double w = new Double(weight.getText().toString());
                bmi = w / (h * h / 10000);

                double final_resault = exchangeResault(bmi);
                if (bmi < 18.5) {

                    show.setText("体质指数：" + final_resault + "  " + "偏轻");
                } else if (bmi >= 18.5 && bmi < 24) {

                    show.setText("体质指数：" + final_resault + "  " + "正常");
                } else if (bmi >= 24 && bmi < 27) {

                    show.setText("体质指数：" + final_resault + "  " + "偏重");
                } else if (bmi >= 27 && bmi < 30) {

                    show.setText("体质指数：" + final_resault + "  " + "轻度肥胖");
                } else if (bmi >= 30 && bmi < 35) {

                    show.setText("体质指数：" + final_resault + "  " + "中度肥胖");
                } else if (bmi > 35) {

                    show.setText("体质指数：" + final_resault + "  " + "重度肥胖");
                }
            }