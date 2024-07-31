package xi;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final dm.e f31317d = dm.e.l(":status");

    /* renamed from: e, reason: collision with root package name */
    public static final dm.e f31318e = dm.e.l(":method");

    /* renamed from: f, reason: collision with root package name */
    public static final dm.e f31319f = dm.e.l(":path");

    /* renamed from: g, reason: collision with root package name */
    public static final dm.e f31320g = dm.e.l(":scheme");

    /* renamed from: h, reason: collision with root package name */
    public static final dm.e f31321h = dm.e.l(":authority");

    /* renamed from: i, reason: collision with root package name */
    public static final dm.e f31322i = dm.e.l(":host");

    /* renamed from: j, reason: collision with root package name */
    public static final dm.e f31323j = dm.e.l(":version");

    /* renamed from: a, reason: collision with root package name */
    public final dm.e f31324a;

    /* renamed from: b, reason: collision with root package name */
    public final dm.e f31325b;

    /* renamed from: c, reason: collision with root package name */
    final int f31326c;

    public d(dm.e eVar, dm.e eVar2) {
        this.f31324a = eVar;
        this.f31325b = eVar2;
        this.f31326c = eVar.B() + 32 + eVar2.B();
    }

    public d(dm.e eVar, String str) {
        this(eVar, dm.e.l(str));
    }

    public d(String str, String str2) {
        this(dm.e.l(str), dm.e.l(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f31324a.equals(dVar.f31324a) && this.f31325b.equals(dVar.f31325b);
    }

    public int hashCode() {
        return ((527 + this.f31324a.hashCode()) * 31) + this.f31325b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", this.f31324a.F(), this.f31325b.F());
    }
}
