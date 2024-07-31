package q3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes.dex */
public class a0 implements h3.j<Uri, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final s3.j f23408a;

    /* renamed from: b, reason: collision with root package name */
    private final k3.d f23409b;

    public a0(s3.j jVar, k3.d dVar) {
        this.f23408a = jVar;
        this.f23409b = dVar;
    }

    @Override // h3.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public j3.v<Bitmap> b(Uri uri, int i10, int i11, h3.h hVar) {
        j3.v<Drawable> b10 = this.f23408a.b(uri, i10, i11, hVar);
        if (b10 == null) {
            return null;
        }
        return r.a(this.f23409b, b10.get(), i10, i11);
    }

    @Override // h3.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, h3.h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
