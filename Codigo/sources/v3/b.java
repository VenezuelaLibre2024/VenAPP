package v3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import c4.k;
import h3.h;
import j3.v;
import q3.x;

/* loaded from: classes.dex */
public class b implements e<Bitmap, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f27898a;

    public b(Resources resources) {
        this.f27898a = (Resources) k.d(resources);
    }

    @Override // v3.e
    public v<BitmapDrawable> a(v<Bitmap> vVar, h hVar) {
        return x.b(this.f27898a, vVar);
    }
}
