package p413w5;

import kotlin.jvm.internal.C9322n;

/* renamed from: w5.f */
/* loaded from: classes.dex */
public final class C12075f {

    /* renamed from: a */
    private final String f32114a;

    /* renamed from: b */
    private final boolean f32115b;

    public C12075f(String key, boolean z10) {
        C9322n.m27781e(key, "key");
        this.f32114a = key;
        this.f32115b = z10;
    }

    /* renamed from: a */
    public final String m38788a() {
        return this.f32114a + ' ' + (this.f32115b ? "asc" : "desc");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12075f)) {
            return false;
        }
        C12075f c12075f = (C12075f) obj;
        return C9322n.m27777a(this.f32114a, c12075f.f32114a) && this.f32115b == c12075f.f32115b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f32114a.hashCode() * 31;
        boolean z10 = this.f32115b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "OrderByCond(key=" + this.f32114a + ", asc=" + this.f32115b + ')';
    }
}
