package ge.studio404.allison;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;

import java.lang.reflect.Type;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Layout
        RelativeLayout giosLayout = new RelativeLayout(this);
        giosLayout.setBackgroundColor(Color.parseColor("#3099c6"));

        /*
        * Button START
        * */
            Button redButton = new Button(this);
            redButton.setText("Log in");
            redButton.setBackgroundColor(Color.parseColor("#2b2b2b"));
            redButton.setTextColor(Color.parseColor("#ffffff"));

            // set id
            redButton.setId(1);

            // set button Details
            RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );

            // give rules to position widgits
            buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
            buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

            // get resources to make dp to px and set size of username field
            Resources r1 = getResources();
            int px1 = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 120,
                    r1.getDisplayMetrics());
            redButton.setWidth(px1);

            //add wigests to layout
            giosLayout.addView(redButton, buttonDetails);
        /*
        * Button END
        * */


        /*
        * User START
        * */
            EditText username = new EditText(this);

            // set ids
            username.setId(2);

            // set username Details
            RelativeLayout.LayoutParams usernameDeteils = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            // add rules
            usernameDeteils.addRule(RelativeLayout.ABOVE, redButton.getId());
            usernameDeteils.addRule(RelativeLayout.CENTER_HORIZONTAL);
            usernameDeteils.setMargins(0,0,0,50);

            // get resources to make dp to px and set size of username field
            Resources r2 = getResources();
            int px2 = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200,
                r2.getDisplayMetrics());
            username.setWidth(px2);

            // add widget to layout
            giosLayout.addView(username, usernameDeteils);
         /*
        * User END
        * */


        //set this activities content/display to this view
        setContentView(giosLayout);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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
}
