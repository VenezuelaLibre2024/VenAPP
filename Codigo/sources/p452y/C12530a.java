package p452y;

import android.graphics.Bitmap;
import p112g0.AbstractC7392c0;
import p452y.C12544h;

/* renamed from: y.a */
/* loaded from: classes.dex */
final class C12530a extends C12544h.a {

    /* renamed from: a */
    private final AbstractC7392c0<Bitmap> f33971a;

    /* renamed from: b */
    private final int f33972b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12530a(AbstractC7392c0<Bitmap> abstractC7392c0, int i10) {
        if (abstractC7392c0 == null) {
            throw new NullPointerException("Null packet");
        }
        this.f33971a = abstractC7392c0;
        this.f33972b = i10;
    }

    @Override // p452y.C12544h.a
    /* renamed from: a */
    int mo41135a() {
        return this.f33972b;
    }

    @Override // p452y.C12544h.a
    /* renamed from: b */
    AbstractC7392c0<Bitmap> mo41136b() {
        return this.f33971a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12544h.a)) {
            return false;
        }
        C12544h.a aVar = (C12544h.a) obj;
        return this.f33971a.equals(aVar.mo41136b()) && this.f33972b == aVar.mo41135a();
    }

    public int hashCode() {
        return ((this.f33971a.hashCode() ^ 1000003) * 1000003) ^ this.f33972b;
    }

    public String toString() {
        return "In{packet=" + this.f33971a + ", jpegQuality=" + this.f33972b + "}";
    }
}
