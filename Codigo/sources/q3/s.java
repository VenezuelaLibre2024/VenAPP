package q3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class s implements h3.l<Drawable> {

    /* renamed from: b, reason: collision with root package name */
    private final h3.l<Bitmap> f23470b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23471c;

    public s(h3.l<Bitmap> lVar, boolean z10) {
        this.f23470b = lVar;
        this.f23471c = z10;
    }

    private j3.v<Drawable> d(Context context, j3.v<Bitmap> vVar) {
        return x.b(context.getResources(), vVar);
    }

    @Override // h3.l
    public j3.v<Drawable> a(Context context, j3.v<Drawable> vVar, int i10, int i11) {
        k3.d g10 = com.bumptech.glide.b.d(context).g();
        Drawable drawable = vVar.get();
        j3.v<Bitmap> a10 = r.a(g10, drawable, i10, i11);
        if (a10 != null) {
            j3.v<Bitmap> a11 = this.f23470b.a(context, a10, i10, i11);
            if (!a11.equals(a10)) {
                return d(context, a11);
            }
            a11.q();
            return vVar;
        }
        if (!this.f23471c) {
            return vVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // h3.f
    public void b(MessageDigest messageDigest) {
        this.f23470b.b(messageDigest);
    }

    public h3.l<BitmapDrawable> c() {
        return this;
    }

    @Override // h3.f
    public boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f23470b.equals(((s) obj).f23470b);
        }
        return false;
    }

    @Override // h3.f
    public int hashCode() {
        return this.f23470b.hashCode();
    }
}
