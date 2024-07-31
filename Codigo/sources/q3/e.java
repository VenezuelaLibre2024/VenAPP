package q3;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/* loaded from: classes.dex */
public final class e implements h3.j<ImageDecoder.Source, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final k3.d f23425a = new k3.e();

    @Override // h3.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public j3.v<Bitmap> b(ImageDecoder.Source source, int i10, int i11, h3.h hVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new p3.l(i10, i11, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new f(decodeBitmap, this.f23425a);
    }

    @Override // h3.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ImageDecoder.Source source, h3.h hVar) {
        return true;
    }
}
