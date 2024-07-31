package u8;

import java.util.Collections;
import java.util.List;
import t6.b3;
import t8.e0;
import t8.x;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f27378a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27379b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27380c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27381d;

    /* renamed from: e, reason: collision with root package name */
    public final float f27382e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27383f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27384g;

    /* renamed from: h, reason: collision with root package name */
    public final int f27385h;

    /* renamed from: i, reason: collision with root package name */
    public final String f27386i;

    private f(List<byte[]> list, int i10, int i11, int i12, float f10, String str, int i13, int i14, int i15) {
        this.f27378a = list;
        this.f27379b = i10;
        this.f27380c = i11;
        this.f27381d = i12;
        this.f27382e = f10;
        this.f27386i = str;
        this.f27383f = i13;
        this.f27384g = i14;
        this.f27385h = i15;
    }

    public static f a(e0 e0Var) {
        int i10;
        int i11;
        try {
            e0Var.V(21);
            int H = e0Var.H() & 3;
            int H2 = e0Var.H();
            int f10 = e0Var.f();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < H2; i14++) {
                e0Var.V(1);
                int N = e0Var.N();
                for (int i15 = 0; i15 < N; i15++) {
                    int N2 = e0Var.N();
                    i13 += N2 + 4;
                    e0Var.V(N2);
                }
            }
            e0Var.U(f10);
            byte[] bArr = new byte[i13];
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            float f11 = 1.0f;
            String str = null;
            int i21 = 0;
            int i22 = 0;
            while (i21 < H2) {
                int H3 = e0Var.H() & 63;
                int N3 = e0Var.N();
                int i23 = i12;
                while (i23 < N3) {
                    int N4 = e0Var.N();
                    byte[] bArr2 = t8.x.f26773a;
                    int i24 = H2;
                    System.arraycopy(bArr2, i12, bArr, i22, bArr2.length);
                    int length = i22 + bArr2.length;
                    System.arraycopy(e0Var.e(), e0Var.f(), bArr, length, N4);
                    if (H3 == 33 && i23 == 0) {
                        x.a h10 = t8.x.h(bArr, length, length + N4);
                        int i25 = h10.f26784h;
                        i17 = h10.f26785i;
                        int i26 = h10.f26787k;
                        int i27 = h10.f26788l;
                        int i28 = h10.f26789m;
                        float f12 = h10.f26786j;
                        i10 = H3;
                        i11 = N3;
                        i16 = i25;
                        i20 = i28;
                        str = t8.e.c(h10.f26777a, h10.f26778b, h10.f26779c, h10.f26780d, h10.f26781e, h10.f26782f);
                        i19 = i27;
                        f11 = f12;
                        i18 = i26;
                    } else {
                        i10 = H3;
                        i11 = N3;
                    }
                    i22 = length + N4;
                    e0Var.V(N4);
                    i23++;
                    H2 = i24;
                    H3 = i10;
                    N3 = i11;
                    i12 = 0;
                }
                i21++;
                i12 = 0;
            }
            return new f(i13 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), H + 1, i16, i17, f11, str, i18, i19, i20);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw b3.a("Error parsing HEVC config", e10);
        }
    }
}
