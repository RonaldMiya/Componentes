package rmiya.com.componentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ImageViewActivity extends AppCompatActivity {

    private int[] photos = {
            R.drawable.dendi,
            R.drawable.miracle,
            R.drawable.w33,
    };

    private int index = 0;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        imageView = (ImageView)findViewById(R.id.imageview);

    }

    public void previousImage(View view) {

        if(++index > photos.length-1)
            index = 0;
        imageView.setImageResource(photos[index]);

    }

    public void nextImage(View view) {

        if(--index < 0)
            index = photos.length-1;
        imageView.setImageResource(photos[index]);

    }
}
