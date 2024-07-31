package y;

import y.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends p.a {

    /* renamed from: a */
    private final g0.c0<androidx.camera.core.o> f31470a;

    /* renamed from: b */
    private final int f31471b;

    public d(g0.c0<androidx.camera.core.o> c0Var, int i10) {
        if (c0Var == null) {
            throw new NullPointerException("Null packet");
        }
        this.f31470a = c0Var;
        this.f31471b = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.p.a
    public int a() {
        return this.f31471b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y.p.a
    public g0.c0<androidx.camera.core.o> b() {
        return this.f31470a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p.a)) {
            return false;
        }
        p.a aVar = (p.a) obj;
        return this.f31470a.equals(aVar.b()) && this.f31471b == aVar.a();
    }

    public int hashCode() {
        return ((this.f31470a.hashCode() ^ 1000003) * 1000003) ^ this.f31471b;
    }

    public String toString() {
        return "In{packet=" + this.f31470a + ", jpegQuality=" + this.f31471b + "}";
    }
}
