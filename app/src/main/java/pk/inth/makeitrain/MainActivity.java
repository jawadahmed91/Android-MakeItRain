package pk.inth.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private Button updateBalanceButton;
    private TextView currentBalanceView;

    private double makeMoney = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateBalanceButton = findViewById(R.id.update_balance);
        currentBalanceView = findViewById(R.id.current_balance);

//        updateBalanceButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("Update Balance Button", "onClick: Show Money");
//
//            }
//        });

    }

    public void clickOnUpdateBalanceButton(View v)
    {
        Log.d("Update Balance Button", "onClick: Show Money saperate method");
        Toast.makeText(getApplicationContext(), R.string.simple_message, Toast.LENGTH_LONG).show();
        makeMoney += 1;

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        Object result = numberFormat.format(makeMoney);

        if(makeMoney > 5)
        {
            currentBalanceView.setTextColor(getResources().getColor(R.color.purple_700));
        }else if(makeMoney > 10)
        {
            currentBalanceView.setTextColor(Color.CYAN);
        }

        // String.valueOf(0); This function convert any digit into String
        currentBalanceView.setText("$" + result);
        updateBalanceButton.setText("Hurray, It's Raining...");
    }
}