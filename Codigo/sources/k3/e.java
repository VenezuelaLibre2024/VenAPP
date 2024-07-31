package k3;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class e implements d {
    @Override // k3.d
    public void a(int i10) {
    }

    @Override // k3.d
    public void b() {
    }

    @Override // k3.d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // k3.d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // k3.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return d(i10, i11, config);
    }
}
