package uk;

/* loaded from: classes3.dex */
public final class i extends g {

    /* renamed from: e, reason: collision with root package name */
    public static final a f27805e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final i f27806f = new i(1, 0);

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public i(long j10, long j11) {
        super(j10, j11, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (c() != iVar.c() || d() != iVar.d()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (c() ^ (c() >>> 32))) + (d() ^ (d() >>> 32)));
    }

    public boolean isEmpty() {
        return c() > d();
    }

    public boolean k(long j10) {
        return c() <= j10 && j10 <= d();
    }

    public String toString() {
        return c() + ".." + d();
    }
}
