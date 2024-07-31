package p363t8;

/* renamed from: t8.h0 */
/* loaded from: classes.dex */
public final class C11152h0 {

    /* renamed from: c */
    public static final C11152h0 f28966c = new C11152h0(-1, -1);

    /* renamed from: d */
    public static final C11152h0 f28967d = new C11152h0(0, 0);

    /* renamed from: a */
    private final int f28968a;

    /* renamed from: b */
    private final int f28969b;

    public C11152h0(int i10, int i11) {
        C11137a.m34599a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f28968a = i10;
        this.f28969b = i11;
    }

    /* renamed from: a */
    public int m34724a() {
        return this.f28969b;
    }

    /* renamed from: b */
    public int m34725b() {
        return this.f28968a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11152h0)) {
            return false;
        }
        C11152h0 c11152h0 = (C11152h0) obj;
        return this.f28968a == c11152h0.f28968a && this.f28969b == c11152h0.f28969b;
    }

    public int hashCode() {
        int i10 = this.f28969b;
        int i11 = this.f28968a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f28968a + "x" + this.f28969b;
    }
}
