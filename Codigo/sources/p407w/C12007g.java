package p407w;

import android.view.Surface;
import p407w.C12015i1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.g */
/* loaded from: classes.dex */
public final class C12007g extends C12015i1.g {

    /* renamed from: a */
    private final int f31924a;

    /* renamed from: b */
    private final Surface f31925b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12007g(int i10, Surface surface) {
        this.f31924a = i10;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f31925b = surface;
    }

    @Override // p407w.C12015i1.g
    /* renamed from: a */
    public int mo38584a() {
        return this.f31924a;
    }

    @Override // p407w.C12015i1.g
    /* renamed from: b */
    public Surface mo38585b() {
        return this.f31925b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12015i1.g)) {
            return false;
        }
        C12015i1.g gVar = (C12015i1.g) obj;
        return this.f31924a == gVar.mo38584a() && this.f31925b.equals(gVar.mo38585b());
    }

    public int hashCode() {
        return ((this.f31924a ^ 1000003) * 1000003) ^ this.f31925b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f31924a + ", surface=" + this.f31925b + "}";
    }
}
