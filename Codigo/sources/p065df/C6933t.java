package p065df;

import kotlin.jvm.internal.C9322n;

/* renamed from: df.t */
/* loaded from: classes2.dex */
public final class C6933t {

    /* renamed from: a */
    private final String f15434a;

    /* renamed from: b */
    private final int f15435b;

    /* renamed from: c */
    private final int f15436c;

    /* renamed from: d */
    private final boolean f15437d;

    public C6933t(String processName, int i10, int i11, boolean z10) {
        C9322n.m27781e(processName, "processName");
        this.f15434a = processName;
        this.f15435b = i10;
        this.f15436c = i11;
        this.f15437d = z10;
    }

    /* renamed from: a */
    public final int m20044a() {
        return this.f15436c;
    }

    /* renamed from: b */
    public final int m20045b() {
        return this.f15435b;
    }

    /* renamed from: c */
    public final String m20046c() {
        return this.f15434a;
    }

    /* renamed from: d */
    public final boolean m20047d() {
        return this.f15437d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6933t)) {
            return false;
        }
        C6933t c6933t = (C6933t) obj;
        return C9322n.m27777a(this.f15434a, c6933t.f15434a) && this.f15435b == c6933t.f15435b && this.f15436c == c6933t.f15436c && this.f15437d == c6933t.f15437d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f15434a.hashCode() * 31) + Integer.hashCode(this.f15435b)) * 31) + Integer.hashCode(this.f15436c)) * 31;
        boolean z10 = this.f15437d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f15434a + ", pid=" + this.f15435b + ", importance=" + this.f15436c + ", isDefaultProcess=" + this.f15437d + ')';
    }
}
