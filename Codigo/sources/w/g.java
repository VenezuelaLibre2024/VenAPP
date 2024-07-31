package w;

import android.view.Surface;
import w.i1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g extends i1.g {

    /* renamed from: a, reason: collision with root package name */
    private final int f29469a;

    /* renamed from: b, reason: collision with root package name */
    private final Surface f29470b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i10, Surface surface) {
        this.f29469a = i10;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f29470b = surface;
    }

    @Override // w.i1.g
    public int a() {
        return this.f29469a;
    }

    @Override // w.i1.g
    public Surface b() {
        return this.f29470b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1.g)) {
            return false;
        }
        i1.g gVar = (i1.g) obj;
        return this.f29469a == gVar.a() && this.f29470b.equals(gVar.b());
    }

    public int hashCode() {
        return ((this.f29469a ^ 1000003) * 1000003) ^ this.f29470b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f29469a + ", surface=" + this.f29470b + "}";
    }
}
