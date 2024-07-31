package y;

import android.graphics.Bitmap;
import y.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends h.a {

    /* renamed from: a */
    private final g0.c0<Bitmap> f31451a;

    /* renamed from: b */
    private final int f31452b;

    public a(g0.c0<Bitmap> c0Var, int i10) {
        if (c0Var == null) {
            throw new NullPointerException("Null packet");
        }
        this.f31451a = c0Var;
        this.f31452b = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.h.a
    public int a() {
        return this.f31452b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.h.a
    public g0.c0<Bitmap> b() {
        return this.f31451a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h.a)) {
            return false;
        }
        h.a aVar = (h.a) obj;
        return this.f31451a.equals(aVar.b()) && this.f31452b == aVar.a();
    }

    public int hashCode() {
        return ((this.f31451a.hashCode() ^ 1000003) * 1000003) ^ this.f31452b;
    }

    public String toString() {
        return "In{packet=" + this.f31451a + ", jpegQuality=" + this.f31452b + "}";
    }
}
