package v3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import h3.h;
import j3.v;

/* loaded from: classes.dex */
public final class c implements e<Drawable, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final k3.d f27899a;

    /* renamed from: b, reason: collision with root package name */
    private final e<Bitmap, byte[]> f27900b;

    /* renamed from: c, reason: collision with root package name */
    private final e<u3.c, byte[]> f27901c;

    public c(k3.d dVar, e<Bitmap, byte[]> eVar, e<u3.c, byte[]> eVar2) {
        this.f27899a = dVar;
        this.f27900b = eVar;
        this.f27901c = eVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static v<u3.c> b(v<Drawable> vVar) {
        return vVar;
    }

    @Override // v3.e
    public v<byte[]> a(v<Drawable> vVar, h hVar) {
        Drawable drawable = vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f27900b.a(q3.f.b(((BitmapDrawable) drawable).getBitmap(), this.f27899a), hVar);
        }
        if (drawable instanceof u3.c) {
            return this.f27901c.a(b(vVar), hVar);
        }
        return null;
    }
}
