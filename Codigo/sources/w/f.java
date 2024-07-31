package w;

import w.x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends x0.a {

    /* renamed from: a */
    private final int f29465a;

    /* renamed from: b */
    private final x0 f29466b;

    public f(int i10, x0 x0Var) {
        this.f29465a = i10;
        if (x0Var == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f29466b = x0Var;
    }

    @Override // w.x0.a
    public int a() {
        return this.f29465a;
    }

    @Override // w.x0.a
    public x0 b() {
        return this.f29466b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0.a)) {
            return false;
        }
        x0.a aVar = (x0.a) obj;
        return this.f29465a == aVar.a() && this.f29466b.equals(aVar.b());
    }

    public int hashCode() {
        return ((this.f29465a ^ 1000003) * 1000003) ^ this.f29466b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f29465a + ", surfaceOutput=" + this.f29466b + "}";
    }
}
