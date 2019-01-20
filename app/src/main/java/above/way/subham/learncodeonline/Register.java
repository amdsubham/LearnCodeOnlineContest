package above.way.subham.learncodeonline;

import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_register );
        Typeface typeface = ResourcesCompat.getFont(this, R.font.blacklist);
        TextView appname= findViewById(R.id.appname);
        appname.setTypeface(typeface);
        YoYo.with(Techniques.Bounce)
                .duration(5000)
                .playOn(findViewById(R.id.logo));



    }
}
