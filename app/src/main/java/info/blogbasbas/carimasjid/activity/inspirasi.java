package info.blogbasbas.carimasjid.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import info.blogbasbas.carimasjid.R;

public class inspirasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspirasi);

        TextView mTextView = findViewById(R.id.share);
        ImageView mImageView = findViewById(R.id.satu);

        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable myDrawable = mImageView.getDrawable();
                Bitmap bitmap = ((BitmapDrawable)myDrawable).getBitmap();


                try {
                    File file = new File(inspirasi.this.getExternalCacheDir(), "satu.jpg");
                    FileOutputStream fOut = new FileOutputStream(file);
                    bitmap.compress(Bitmap.CompressFormat.PNG, 80, fOut);
                    fOut.flush();
                    fOut.close();
                    file.setReadable(true, false);
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(file));
                    intent.setType("image/jpg");
                    startActivity(Intent.createChooser(intent, "Bagikan Gambar Lewat"));
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                    Toast.makeText(inspirasi.this, "File Tidak Ditemukan", Toast.LENGTH_SHORT).show();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        });
    }
}
