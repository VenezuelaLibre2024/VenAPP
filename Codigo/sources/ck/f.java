package ck;

/* loaded from: classes3.dex */
public final class f implements Comparable<f> {

    /* renamed from: e, reason: collision with root package name */
    public static final a f7117e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final f f7118f = g.a();

    /* renamed from: a, reason: collision with root package name */
    private final int f7119a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7120b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7121c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7122d;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public f(int i10, int i11, int i12) {
        this.f7119a = i10;
        this.f7120b = i11;
        this.f7121c = i12;
        this.f7122d = h(i10, i11, i12);
    }

    private final int h(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new uk.f(0, 255).m(i10) && new uk.f(0, 255).m(i11) && new uk.f(0, 255).m(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(f other) {
        kotlin.jvm.internal.n.e(other, "other");
        return this.f7122d - other.f7122d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        f fVar = obj instanceof f ? (f) obj : null;
        return fVar != null && this.f7122d == fVar.f7122d;
    }

    public int hashCode() {
        return this.f7122d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7119a);
        sb2.append('.');
        sb2.append(this.f7120b);
        sb2.append('.');
        sb2.append(this.f7121c);
        return sb2.toString();
    }
}
