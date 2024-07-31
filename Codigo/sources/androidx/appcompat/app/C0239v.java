package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.v */
/* loaded from: classes.dex */
class C0239v {

    /* renamed from: d */
    private static C0239v f1020d;

    /* renamed from: a */
    public long f1021a;

    /* renamed from: b */
    public long f1022b;

    /* renamed from: c */
    public int f1023c;

    C0239v() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C0239v m1121b() {
        if (f1020d == null) {
            f1020d = new C0239v();
        }
        return f1020d;
    }

    /* renamed from: a */
    public void m1122a(long j10, double d10, double d11) {
        double d12 = (0.01720197f * (((float) (j10 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d12) * 0.03341960161924362d) + d12 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = ((float) Math.round((r3 - 9.0E-4f) - r7)) + 9.0E-4f + ((-d11) / 360.0d) + (Math.sin(d12) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d13 = 0.01745329238474369d * d10;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d13) * Math.sin(asin))) / (Math.cos(d13) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f1023c = 1;
        } else {
            if (sin2 > -1.0d) {
                double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
                this.f1021a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
                long round2 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
                this.f1022b = round2;
                if (round2 >= j10 || this.f1021a <= j10) {
                    this.f1023c = 1;
                    return;
                } else {
                    this.f1023c = 0;
                    return;
                }
            }
            this.f1023c = 0;
        }
        this.f1021a = -1L;
        this.f1022b = -1L;
    }
}
