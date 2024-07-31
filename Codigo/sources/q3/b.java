package q3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* loaded from: classes.dex */
public class b implements h3.k<BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final k3.d f23410a;

    /* renamed from: b, reason: collision with root package name */
    private final h3.k<Bitmap> f23411b;

    public b(k3.d dVar, h3.k<Bitmap> kVar) {
        this.f23410a = dVar;
        this.f23411b = kVar;
    }

    @Override // h3.k
    public h3.c a(h3.h hVar) {
        return this.f23411b.a(hVar);
    }

    @Override // h3.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(j3.v<BitmapDrawable> vVar, File file, h3.h hVar) {
        return this.f23411b.b(new f(vVar.get().getBitmap(), this.f23410a), file, hVar);
    }
}
