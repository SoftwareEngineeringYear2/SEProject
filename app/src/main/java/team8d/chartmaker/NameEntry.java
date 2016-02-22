package team8d.chartmaker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import android.widget.Toast;

public class NameEntry extends AppCompatActivity {

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_entry);
        name = "";
    }

    //@Override
    //public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    //    getMenuInflater().inflate(R.menu.menu_name_entry, menu);
    //    return true;
    //}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void openMainMenu(View view) {
        //if( name.equals("")){

        //    Toast.makeText(getApplicationContext(), "A name is required.",
        //            Toast.LENGTH_SHORT).show();

        //}else{
            startActivity(new Intent(NameEntry.this,MainMenu.class));
        //}

    }

    //Bundle b = new Bundle();
    //b.putString("name",name);
    //name.putExtras()

    public void onEditorAction(TextView textView, int i, KeyEvent keyEvents) {
        if (i == EditorInfo.IME_ACTION_DONE) {
            name = textView.getText().toString();
        }

    }
}
