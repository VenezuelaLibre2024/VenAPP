package q3;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class f implements j3.v<Bitmap>, j3.r {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f23426a;

    /* renamed from: b, reason: collision with root package name */
    private final k3.d f23427b;

    public f(Bitmap bitmap, k3.d dVar) {
        this.f23426a = (Bitmap) c4.k.e(bitmap, "Bitmap must not be null");
        this.f23427b = (k3.d) c4.k.e(dVar, "BitmapPool must not be null");
    }

    public static f b(Bitmap bitmap, k3.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new f(bitmap, dVar);
    }

    @Override // j3.v
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f23426a;
    }

    @Override // j3.r
    public void initialize() {
        this.f23426a.prepareToDraw();
    }

    @Override // j3.v
    public int p() {
        return c4.l.h(this.f23426a);
    }

    @Override // j3.v
    public void q() {
        this.f23427b.c(this.f23426a);
    }

    @Override // j3.v
    public Class<Bitmap> r() {
        return Bitmap.class;
    }
}
