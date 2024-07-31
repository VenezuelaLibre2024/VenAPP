package w5;

import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f29651a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29652b;

    public f(String key, boolean z10) {
        n.e(key, "key");
        this.f29651a = key;
        this.f29652b = z10;
    }

    public final String a() {
        return this.f29651a + ' ' + (this.f29652b ? "asc" : "desc");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return n.a(this.f29651a, fVar.f29651a) && this.f29652b == fVar.f29652b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f29651a.hashCode() * 31;
        boolean z10 = this.f29652b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "OrderByCond(key=" + this.f29651a + ", asc=" + this.f29652b + ')';
    }
}
