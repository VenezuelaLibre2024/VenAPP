package t8;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f26670c = new h0(-1, -1);

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f26671d = new h0(0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final int f26672a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26673b;

    public h0(int i10, int i11) {
        a.a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f26672a = i10;
        this.f26673b = i11;
    }

    public int a() {
        return this.f26673b;
    }

    public int b() {
        return this.f26672a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f26672a == h0Var.f26672a && this.f26673b == h0Var.f26673b;
    }

    public int hashCode() {
        int i10 = this.f26673b;
        int i11 = this.f26672a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f26672a + "x" + this.f26673b;
    }
}
