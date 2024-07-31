package p407w;

/* renamed from: w.y */
/* loaded from: classes.dex */
public final class C12048y {

    /* renamed from: c */
    public static final C12048y f32039c = new C12048y(0, 0);

    /* renamed from: d */
    public static final C12048y f32040d = new C12048y(1, 8);

    /* renamed from: e */
    public static final C12048y f32041e = new C12048y(2, 10);

    /* renamed from: f */
    public static final C12048y f32042f = new C12048y(3, 10);

    /* renamed from: g */
    public static final C12048y f32043g = new C12048y(4, 10);

    /* renamed from: h */
    public static final C12048y f32044h = new C12048y(5, 10);

    /* renamed from: i */
    public static final C12048y f32045i = new C12048y(6, 10);

    /* renamed from: j */
    public static final C12048y f32046j = new C12048y(6, 8);

    /* renamed from: a */
    private final int f32047a;

    /* renamed from: b */
    private final int f32048b;

    public C12048y(int i10, int i11) {
        this.f32047a = i10;
        this.f32048b = i11;
    }

    /* renamed from: c */
    private static String m38699c(int i10) {
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

    /* renamed from: a */
    public int m38700a() {
        return this.f32048b;
    }

    /* renamed from: b */
    public int m38701b() {
        return this.f32047a;
    }

    /* renamed from: d */
    public boolean m38702d() {
        return m38703e() && m38701b() != 1 && m38700a() == 10;
    }

    /* renamed from: e */
    public boolean m38703e() {
        return (m38701b() == 0 || m38701b() == 2 || m38700a() == 0) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12048y)) {
            return false;
        }
        C12048y c12048y = (C12048y) obj;
        return this.f32047a == c12048y.m38701b() && this.f32048b == c12048y.m38700a();
    }

    public int hashCode() {
        return ((this.f32047a ^ 1000003) * 1000003) ^ this.f32048b;
    }

    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + m38699c(this.f32047a) + ", bitDepth=" + this.f32048b + "}";
    }
}
