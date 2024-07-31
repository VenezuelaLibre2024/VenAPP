package u8;

import t8.e0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f27361a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27362b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27363c;

    private d(int i10, int i11, String str) {
        this.f27361a = i10;
        this.f27362b = i11;
        this.f27363c = str;
    }

    public static d a(e0 e0Var) {
        String str;
        e0Var.V(2);
        int H = e0Var.H();
        int i10 = H >> 1;
        int H2 = ((e0Var.H() >> 3) & 31) | ((H & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(H2 >= 10 ? "." : ".0");
        sb2.append(H2);
        return new d(i10, H2, sb2.toString());
    }
}
