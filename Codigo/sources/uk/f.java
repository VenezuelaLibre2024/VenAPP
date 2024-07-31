package uk;

/* loaded from: classes3.dex */
public final class f extends d {

    /* renamed from: e */
    public static final a f27795e = new a(null);

    /* renamed from: f */
    private static final f f27796f = new f(1, 0);

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final f a() {
            return f.f27796f;
        }
    }

    public f(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // uk.d
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (c() != fVar.c() || d() != fVar.d()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // uk.d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (c() * 31) + d();
    }

    @Override // uk.d
    public boolean isEmpty() {
        return c() > d();
    }

    public boolean m(int i10) {
        return c() <= i10 && i10 <= d();
    }

    public Integer n() {
        return Integer.valueOf(d());
    }

    public Integer o() {
        return Integer.valueOf(c());
    }

    @Override // uk.d
    public String toString() {
        return c() + ".." + d();
    }
}
