package u3;

import android.content.Context;
import android.graphics.Bitmap;
import c4.k;
import h3.l;
import j3.v;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class f implements l<c> {

    /* renamed from: b, reason: collision with root package name */
    private final l<Bitmap> f27043b;

    public f(l<Bitmap> lVar) {
        this.f27043b = (l) k.d(lVar);
    }

    @Override // h3.l
    public v<c> a(Context context, v<c> vVar, int i10, int i11) {
        c cVar = vVar.get();
        v<Bitmap> fVar = new q3.f(cVar.e(), com.bumptech.glide.b.d(context).g());
        v<Bitmap> a10 = this.f27043b.a(context, fVar, i10, i11);
        if (!fVar.equals(a10)) {
            fVar.q();
        }
        cVar.m(this.f27043b, a10.get());
        return vVar;
    }

    @Override // h3.f
    public void b(MessageDigest messageDigest) {
        this.f27043b.b(messageDigest);
    }

    @Override // h3.f
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f27043b.equals(((f) obj).f27043b);
        }
        return false;
    }

    @Override // h3.f
    public int hashCode() {
        return this.f27043b.hashCode();
    }
}
