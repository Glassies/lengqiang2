package com.example.ooo.text10;



        import android.app.Activity;
        import android.media.Image;
        import android.os.Bundle;
        import android.view.View;

        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.TextView;


public class MainActivity extends Activity{
    private EditText height = null;
    private EditText weight = null;
    private TextView show = null;
    private int[] image={R.mipmap.shilan1};

    private ImageView iv;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.JiSuan);
        iv=(ImageView)findViewById(R.id.shilan1);


        height = (EditText) findViewById(R.id.ShenGao);
        weight = (EditText) findViewById(R.id.TiZhong);
        show = (TextView) findViewById(R.id.show);


        button.setOnClickListener(new View.OnClickListener() {
            double bmi = 0;

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
        });
    }


    public double exchangeResault(double resault) {
        double first = resault * 100;
        double second = (int) first;

        double second_first = first - second;

        if (second_first > 0.5) {


            second++;
        }

        return (double) second / 100;

    }

}