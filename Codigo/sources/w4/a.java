package w4;

import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f29622a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29623b;

    public a(String name, boolean z10) {
        n.e(name, "name");
        this.f29622a = name;
        this.f29623b = z10;
    }

    public final String a() {
        return this.f29622a;
    }

    public final boolean b() {
        return this.f29623b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.a(this.f29622a, aVar.f29622a) && this.f29623b == aVar.f29623b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f29622a.hashCode() * 31;
        boolean z10 = this.f29623b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "GateKeeper(name=" + this.f29622a + ", value=" + this.f29623b + ')';
    }
}
