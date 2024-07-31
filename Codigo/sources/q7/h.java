package q7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.common.collect.w;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import t8.d0;
import t8.e0;
import t8.r0;
import t8.s;

/* loaded from: classes.dex */
public final class h extends l7.g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f23578b = new a() { // from class: q7.g
        @Override // q7.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            boolean A;
            A = h.A(i10, i11, i12, i13, i14);
            return A;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final a f23579a;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f23580a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f23581b;

        /* renamed from: c, reason: collision with root package name */
        private final int f23582c;

        public b(int i10, boolean z10, int i11) {
            this.f23580a = i10;
            this.f23581b = z10;
            this.f23582c = i11;
        }
    }

    public h() {
        this(null);
    }

    public h(a aVar) {
        this.f23579a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean A(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static int B(e0 e0Var, int i10) {
        byte[] e10 = e0Var.e();
        int f10 = e0Var.f();
        int i11 = f10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= f10 + i10) {
                return i10;
            }
            if ((e10[i11] & 255) == 255 && e10[i12] == 0) {
                System.arraycopy(e10, i11 + 2, e10, i12, (i10 - (i11 - f10)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if ((r10 & 1) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0086, code lost:
    
        if ((r10 & com.google.android.libraries.barhopper.RecognitionOptions.ITF) != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean C(t8.e0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.f()
        L8:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.q()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.J()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.N()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.K()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.K()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.U(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.U(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = r4
            goto L74
        L73:
            r3 = r6
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L79
            goto L8b
        L79:
            r4 = r6
            goto L8b
        L7b:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L79
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L98
            r1.U(r2)
            return r6
        L98:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.U(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.V(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.U(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.U(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.h.C(t8.e0, int, int, boolean):boolean");
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? r0.f26749f : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static q7.a f(e0 e0Var, int i10, int i11) {
        int z10;
        String str;
        int H = e0Var.H();
        Charset w10 = w(H);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        e0Var.l(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + eb.c.e(new String(bArr, 0, 3, eb.e.f14595b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            z10 = 2;
        } else {
            z10 = z(bArr, 0);
            String e10 = eb.c.e(new String(bArr, 0, z10, eb.e.f14595b));
            if (e10.indexOf(47) == -1) {
                str = "image/" + e10;
            } else {
                str = e10;
            }
        }
        int i13 = bArr[z10 + 1] & 255;
        int i14 = z10 + 2;
        int y10 = y(bArr, i14, H);
        return new q7.a(str, new String(bArr, i14, y10 - i14, w10), i13, d(bArr, y10 + v(H), i12));
    }

    private static q7.b g(e0 e0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        e0Var.l(bArr, 0, i10);
        return new q7.b(str, bArr);
    }

    private static c h(e0 e0Var, int i10, int i11, boolean z10, int i12, a aVar) {
        int f10 = e0Var.f();
        int z11 = z(e0Var.e(), f10);
        String str = new String(e0Var.e(), f10, z11 - f10, eb.e.f14595b);
        e0Var.U(z11 + 1);
        int q10 = e0Var.q();
        int q11 = e0Var.q();
        long J = e0Var.J();
        long j10 = J == KeyboardMap.kValueMask ? -1L : J;
        long J2 = e0Var.J();
        long j11 = J2 == KeyboardMap.kValueMask ? -1L : J2;
        ArrayList arrayList = new ArrayList();
        int i13 = f10 + i10;
        while (e0Var.f() < i13) {
            i k10 = k(i11, e0Var, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new c(str, q10, q11, j10, j11, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(e0 e0Var, int i10, int i11, boolean z10, int i12, a aVar) {
        int f10 = e0Var.f();
        int z11 = z(e0Var.e(), f10);
        String str = new String(e0Var.e(), f10, z11 - f10, eb.e.f14595b);
        e0Var.U(z11 + 1);
        int H = e0Var.H();
        boolean z12 = (H & 2) != 0;
        boolean z13 = (H & 1) != 0;
        int H2 = e0Var.H();
        String[] strArr = new String[H2];
        for (int i13 = 0; i13 < H2; i13++) {
            int f11 = e0Var.f();
            int z14 = z(e0Var.e(), f11);
            strArr[i13] = new String(e0Var.e(), f11, z14 - f11, eb.e.f14595b);
            e0Var.U(z14 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = f10 + i10;
        while (e0Var.f() < i14) {
            i k10 = k(i11, e0Var, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new d(str, z12, z13, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(e0 e0Var, int i10) {
        if (i10 < 4) {
            return null;
        }
        int H = e0Var.H();
        Charset w10 = w(H);
        byte[] bArr = new byte[3];
        e0Var.l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        e0Var.l(bArr2, 0, i11);
        int y10 = y(bArr2, 0, H);
        String str2 = new String(bArr2, 0, y10, w10);
        int v10 = y10 + v(H);
        return new e(str, str2, p(bArr2, v10, y(bArr2, v10, H), w10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0190, code lost:
    
        if (r13 == 67) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static q7.i k(int r19, t8.e0 r20, boolean r21, int r22, q7.h.a r23) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.h.k(int, t8.e0, boolean, int, q7.h$a):q7.i");
    }

    private static f l(e0 e0Var, int i10) {
        int H = e0Var.H();
        Charset w10 = w(H);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        e0Var.l(bArr, 0, i11);
        int z10 = z(bArr, 0);
        String str = new String(bArr, 0, z10, eb.e.f14595b);
        int i12 = z10 + 1;
        int y10 = y(bArr, i12, H);
        String p10 = p(bArr, i12, y10, w10);
        int v10 = y10 + v(H);
        int y11 = y(bArr, v10, H);
        return new f(str, p10, p(bArr, v10, y11, w10), d(bArr, y11 + v(H), i11));
    }

    private static b m(e0 e0Var) {
        StringBuilder sb2;
        String str;
        if (e0Var.a() < 10) {
            str = "Data too short to be an ID3 tag";
        } else {
            int K = e0Var.K();
            boolean z10 = false;
            if (K == 4801587) {
                int H = e0Var.H();
                e0Var.V(1);
                int H2 = e0Var.H();
                int G = e0Var.G();
                if (H == 2) {
                    if ((H2 & 64) != 0) {
                        str = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (H == 3) {
                    if ((H2 & 64) != 0) {
                        int q10 = e0Var.q();
                        e0Var.V(q10);
                        G -= q10 + 4;
                    }
                } else if (H == 4) {
                    if ((H2 & 64) != 0) {
                        int G2 = e0Var.G();
                        e0Var.V(G2 - 4);
                        G -= G2;
                    }
                    if ((H2 & 16) != 0) {
                        G -= 10;
                    }
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("Skipped ID3 tag with unsupported majorVersion=");
                    sb2.append(H);
                }
                if (H < 4 && (H2 & RecognitionOptions.ITF) != 0) {
                    z10 = true;
                }
                return new b(H, z10, G);
            }
            sb2 = new StringBuilder();
            sb2.append("Unexpected first three bytes of ID3 tag header: 0x");
            sb2.append(String.format("%06X", Integer.valueOf(K)));
            str = sb2.toString();
        }
        s.i("Id3Decoder", str);
        return null;
    }

    private static k n(e0 e0Var, int i10) {
        int N = e0Var.N();
        int K = e0Var.K();
        int K2 = e0Var.K();
        int H = e0Var.H();
        int H2 = e0Var.H();
        d0 d0Var = new d0();
        d0Var.m(e0Var);
        int i11 = ((i10 - 10) * 8) / (H + H2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int h10 = d0Var.h(H);
            int h11 = d0Var.h(H2);
            iArr[i12] = h10;
            iArr2[i12] = h11;
        }
        return new k(N, K, K2, iArr, iArr2);
    }

    private static l o(e0 e0Var, int i10) {
        byte[] bArr = new byte[i10];
        e0Var.l(bArr, 0, i10);
        int z10 = z(bArr, 0);
        return new l(new String(bArr, 0, z10, eb.e.f14595b), d(bArr, z10 + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    private static m q(e0 e0Var, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int H = e0Var.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        e0Var.l(bArr, 0, i11);
        return new m(str, null, r(bArr, H, 0));
    }

    private static w<String> r(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return w.w("");
        }
        w.a p10 = w.p();
        while (true) {
            int y10 = y(bArr, i11, i10);
            if (i11 >= y10) {
                break;
            }
            p10.a(new String(bArr, i11, y10 - i11, w(i10)));
            i11 = v(i10) + y10;
        }
        w<String> k10 = p10.k();
        return k10.isEmpty() ? w.w("") : k10;
    }

    private static m s(e0 e0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int H = e0Var.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        e0Var.l(bArr, 0, i11);
        int y10 = y(bArr, 0, H);
        return new m("TXXX", new String(bArr, 0, y10, w(H)), r(bArr, H, y10 + v(H)));
    }

    private static n t(e0 e0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        e0Var.l(bArr, 0, i10);
        return new n(str, null, new String(bArr, 0, z(bArr, 0), eb.e.f14595b));
    }

    private static n u(e0 e0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int H = e0Var.H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        e0Var.l(bArr, 0, i11);
        int y10 = y(bArr, 0, H);
        String str = new String(bArr, 0, y10, w(H));
        int v10 = y10 + v(H);
        return new n("WXXX", str, p(bArr, v10, z(bArr, v10), eb.e.f14595b));
    }

    private static int v(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static Charset w(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? eb.e.f14595b : eb.e.f14596c : eb.e.f14597d : eb.e.f14599f;
    }

    private static String x(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int y(byte[] bArr, int i10, int i11) {
        int z10 = z(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return z10;
        }
        while (z10 < bArr.length - 1) {
            if ((z10 - i10) % 2 == 0 && bArr[z10 + 1] == 0) {
                return z10;
            }
            z10 = z(bArr, z10 + 1);
        }
        return bArr.length;
    }

    private static int z(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    @Override // l7.g
    protected l7.a b(l7.d dVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public l7.a e(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        e0 e0Var = new e0(bArr, i10);
        b m10 = m(e0Var);
        if (m10 == null) {
            return null;
        }
        int f10 = e0Var.f();
        int i11 = m10.f23580a == 2 ? 6 : 10;
        int i12 = m10.f23582c;
        if (m10.f23581b) {
            i12 = B(e0Var, m10.f23582c);
        }
        e0Var.T(f10 + i12);
        boolean z10 = false;
        if (!C(e0Var, m10.f23580a, i11, false)) {
            if (m10.f23580a != 4 || !C(e0Var, 4, i11, true)) {
                s.i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m10.f23580a);
                return null;
            }
            z10 = true;
        }
        while (e0Var.a() >= i11) {
            i k10 = k(m10.f23580a, e0Var, z10, i11, this.f23579a);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new l7.a(arrayList);
    }
}
