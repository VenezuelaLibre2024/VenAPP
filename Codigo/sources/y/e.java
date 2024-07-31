package y;

import androidx.camera.core.n;
import y.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends t.a {

    /* renamed from: a, reason: collision with root package name */
    private final g0.c0<byte[]> f31474a;

    /* renamed from: b, reason: collision with root package name */
    private final n.g f31475b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(g0.c0<byte[]> c0Var, n.g gVar) {
        if (c0Var == null) {
            throw new NullPointerException("Null packet");
        }
        this.f31474a = c0Var;
        if (gVar == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.f31475b = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.t.a
    public n.g a() {
        return this.f31475b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.t.a
    public g0.c0<byte[]> b() {
        return this.f31474a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t.a)) {
            return false;
        }
        t.a aVar = (t.a) obj;
        return this.f31474a.equals(aVar.b()) && this.f31475b.equals(aVar.a());
    }

    public int hashCode() {
        return ((this.f31474a.hashCode() ^ 1000003) * 1000003) ^ this.f31475b.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.f31474a + ", outputFileOptions=" + this.f31475b + "}";
    }
}
