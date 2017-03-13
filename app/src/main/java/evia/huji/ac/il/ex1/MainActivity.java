package evia.huji.ac.il.ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    Button btnSend;
    ArrayList<String> messages = new ArrayList<String>();
    EditText txtMessage;
    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend = (Button)findViewById(R.id.btnSend);
        txtMessage = (EditText)findViewById(R.id.txtMessage);
        list = (ListView)findViewById(R.id.list);

        btnSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String currentMessage = txtMessage.getText().toString();

                if (currentMessage != null && !currentMessage.trim().equals("")) {

                    messages.add("Me: " + currentMessage);
                    ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, messages);
                    list.setAdapter(listAdapter);
                    txtMessage.setText("");

                }
            }
        });
    }


}
