package w;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: c, reason: collision with root package name */
    public static final y f29576c = new y(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final y f29577d = new y(1, 8);

    /* renamed from: e, reason: collision with root package name */
    public static final y f29578e = new y(2, 10);

    /* renamed from: f, reason: collision with root package name */
    public static final y f29579f = new y(3, 10);

    /* renamed from: g, reason: collision with root package name */
    public static final y f29580g = new y(4, 10);

    /* renamed from: h, reason: collision with root package name */
    public static final y f29581h = new y(5, 10);

    /* renamed from: i, reason: collision with root package name */
    public static final y f29582i = new y(6, 10);

    /* renamed from: j, reason: collision with root package name */
    public static final y f29583j = new y(6, 8);

    /* renamed from: a, reason: collision with root package name */
    private final int f29584a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29585b;

    public y(int i10, int i11) {
        this.f29584a = i10;
        this.f29585b = i11;
    }

    private static String c(int i10) {
        switch (i10) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public int a() {
        return this.f29585b;
    }

    public int b() {
        return this.f29584a;
    }

    public boolean d() {
        return e() && b() != 1 && a() == 10;
    }

    public boolean e() {
        return (b() == 0 || b() == 2 || a() == 0) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f29584a == yVar.b() && this.f29585b == yVar.a();
    }

    public int hashCode() {
        return ((this.f29584a ^ 1000003) * 1000003) ^ this.f29585b;
    }

    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + c(this.f29584a) + ", bitDepth=" + this.f29585b + "}";
    }
}
