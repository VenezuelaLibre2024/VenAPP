package p306q7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.common.collect.AbstractC5907w;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p082eb.C7147c;
import p082eb.C7149e;
import p216l7.AbstractC9406g;
import p216l7.C9400a;
import p216l7.C9403d;
import p363t8.C11144d0;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;

/* renamed from: q7.h */
/* loaded from: classes.dex */
public final class C10286h extends AbstractC9406g {

    /* renamed from: b */
    public static final a f25546b = new a() { // from class: q7.g
        @Override // p306q7.C10286h.a
        /* renamed from: a */
        public final boolean mo21894a(int i10, int i11, int i12, int i13, int i14) {
            boolean m30806A;
            m30806A = C10286h.m30806A(i10, i11, i12, i13, i14);
            return m30806A;
        }
    };

    /* renamed from: a */
    private final a f25547a;

    /* renamed from: q7.h$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean mo21894a(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q7.h$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final int f25548a;

        /* renamed from: b */
        private final boolean f25549b;

        /* renamed from: c */
        private final int f25550c;

        public b(int i10, boolean z10, int i11) {
            this.f25548a = i10;
            this.f25549b = z10;
            this.f25550c = i11;
        }
    }

    public C10286h() {
        this(null);
    }

    public C10286h(a aVar) {
        this.f25547a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static /* synthetic */ boolean m30806A(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    /* renamed from: B */
    private static int m30807B(C11146e0 c11146e0, int i10) {
        byte[] m34682e = c11146e0.m34682e();
        int m34683f = c11146e0.m34683f();
        int i11 = m34683f;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= m34683f + i10) {
                return i10;
            }
            if ((m34682e[i11] & 255) == 255 && m34682e[i12] == 0) {
                System.arraycopy(m34682e, i11 + 2, m34682e, i12, (i10 - (i11 - m34683f)) - 2);
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
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m30808C(p363t8.C11146e0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.m34683f()
        L8:
            int r3 = r18.m34679a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.m34692q()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.m34666J()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.m34670N()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.m34667K()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.m34667K()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.m34677U(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.m34677U(r2)
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
            r1.m34677U(r2)
            return r6
        L98:
            int r3 = r18.m34679a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.m34677U(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.m34678V(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.m34677U(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.m34677U(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p306q7.C10286h.m30808C(t8.e0, int, int, boolean):boolean");
    }

    /* renamed from: d */
    private static byte[] m30810d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? C11172r0.f29045f : Arrays.copyOfRange(bArr, i10, i11);
    }

    /* renamed from: f */
    private static C10279a m30811f(C11146e0 c11146e0, int i10, int i11) {
        int m30831z;
        String str;
        int m34664H = c11146e0.m34664H();
        Charset m30828w = m30828w(m34664H);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        c11146e0.m34688l(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + C7147c.m21253e(new String(bArr, 0, 3, C7149e.f16018b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            m30831z = 2;
        } else {
            m30831z = m30831z(bArr, 0);
            String m21253e = C7147c.m21253e(new String(bArr, 0, m30831z, C7149e.f16018b));
            if (m21253e.indexOf(47) == -1) {
                str = "image/" + m21253e;
            } else {
                str = m21253e;
            }
        }
        int i13 = bArr[m30831z + 1] & 255;
        int i14 = m30831z + 2;
        int m30830y = m30830y(bArr, i14, m34664H);
        return new C10279a(str, new String(bArr, i14, m30830y - i14, m30828w), i13, m30810d(bArr, m30830y + m30827v(m34664H), i12));
    }

    /* renamed from: g */
    private static C10280b m30812g(C11146e0 c11146e0, int i10, String str) {
        byte[] bArr = new byte[i10];
        c11146e0.m34688l(bArr, 0, i10);
        return new C10280b(str, bArr);
    }

    /* renamed from: h */
    private static C10281c m30813h(C11146e0 c11146e0, int i10, int i11, boolean z10, int i12, a aVar) {
        int m34683f = c11146e0.m34683f();
        int m30831z = m30831z(c11146e0.m34682e(), m34683f);
        String str = new String(c11146e0.m34682e(), m34683f, m30831z - m34683f, C7149e.f16018b);
        c11146e0.m34677U(m30831z + 1);
        int m34692q = c11146e0.m34692q();
        int m34692q2 = c11146e0.m34692q();
        long m34666J = c11146e0.m34666J();
        long j10 = m34666J == KeyboardMap.kValueMask ? -1L : m34666J;
        long m34666J2 = c11146e0.m34666J();
        long j11 = m34666J2 == KeyboardMap.kValueMask ? -1L : m34666J2;
        ArrayList arrayList = new ArrayList();
        int i13 = m34683f + i10;
        while (c11146e0.m34683f() < i13) {
            AbstractC10287i m30816k = m30816k(i11, c11146e0, z10, i12, aVar);
            if (m30816k != null) {
                arrayList.add(m30816k);
            }
        }
        return new C10281c(str, m34692q, m34692q2, j10, j11, (AbstractC10287i[]) arrayList.toArray(new AbstractC10287i[0]));
    }

    /* renamed from: i */
    private static C10282d m30814i(C11146e0 c11146e0, int i10, int i11, boolean z10, int i12, a aVar) {
        int m34683f = c11146e0.m34683f();
        int m30831z = m30831z(c11146e0.m34682e(), m34683f);
        String str = new String(c11146e0.m34682e(), m34683f, m30831z - m34683f, C7149e.f16018b);
        c11146e0.m34677U(m30831z + 1);
        int m34664H = c11146e0.m34664H();
        boolean z11 = (m34664H & 2) != 0;
        boolean z12 = (m34664H & 1) != 0;
        int m34664H2 = c11146e0.m34664H();
        String[] strArr = new String[m34664H2];
        for (int i13 = 0; i13 < m34664H2; i13++) {
            int m34683f2 = c11146e0.m34683f();
            int m30831z2 = m30831z(c11146e0.m34682e(), m34683f2);
            strArr[i13] = new String(c11146e0.m34682e(), m34683f2, m30831z2 - m34683f2, C7149e.f16018b);
            c11146e0.m34677U(m30831z2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = m34683f + i10;
        while (c11146e0.m34683f() < i14) {
            AbstractC10287i m30816k = m30816k(i11, c11146e0, z10, i12, aVar);
            if (m30816k != null) {
                arrayList.add(m30816k);
            }
        }
        return new C10282d(str, z11, z12, strArr, (AbstractC10287i[]) arrayList.toArray(new AbstractC10287i[0]));
    }

    /* renamed from: j */
    private static C10283e m30815j(C11146e0 c11146e0, int i10) {
        if (i10 < 4) {
            return null;
        }
        int m34664H = c11146e0.m34664H();
        Charset m30828w = m30828w(m34664H);
        byte[] bArr = new byte[3];
        c11146e0.m34688l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        c11146e0.m34688l(bArr2, 0, i11);
        int m30830y = m30830y(bArr2, 0, m34664H);
        String str2 = new String(bArr2, 0, m30830y, m30828w);
        int m30827v = m30830y + m30827v(m34664H);
        return new C10283e(str, str2, m30821p(bArr2, m30827v, m30830y(bArr2, m30827v, m34664H), m30828w));
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0190, code lost:
    
        if (r13 == 67) goto L132;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p306q7.AbstractC10287i m30816k(int r19, p363t8.C11146e0 r20, boolean r21, int r22, p306q7.C10286h.a r23) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p306q7.C10286h.m30816k(int, t8.e0, boolean, int, q7.h$a):q7.i");
    }

    /* renamed from: l */
    private static C10284f m30817l(C11146e0 c11146e0, int i10) {
        int m34664H = c11146e0.m34664H();
        Charset m30828w = m30828w(m34664H);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c11146e0.m34688l(bArr, 0, i11);
        int m30831z = m30831z(bArr, 0);
        String str = new String(bArr, 0, m30831z, C7149e.f16018b);
        int i12 = m30831z + 1;
        int m30830y = m30830y(bArr, i12, m34664H);
        String m30821p = m30821p(bArr, i12, m30830y, m30828w);
        int m30827v = m30830y + m30827v(m34664H);
        int m30830y2 = m30830y(bArr, m30827v, m34664H);
        return new C10284f(str, m30821p, m30821p(bArr, m30827v, m30830y2, m30828w), m30810d(bArr, m30830y2 + m30827v(m34664H), i11));
    }

    /* renamed from: m */
    private static b m30818m(C11146e0 c11146e0) {
        StringBuilder sb2;
        String str;
        if (c11146e0.m34679a() < 10) {
            str = "Data too short to be an ID3 tag";
        } else {
            int m34667K = c11146e0.m34667K();
            boolean z10 = false;
            if (m34667K == 4801587) {
                int m34664H = c11146e0.m34664H();
                c11146e0.m34678V(1);
                int m34664H2 = c11146e0.m34664H();
                int m34663G = c11146e0.m34663G();
                if (m34664H == 2) {
                    if ((m34664H2 & 64) != 0) {
                        str = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (m34664H == 3) {
                    if ((m34664H2 & 64) != 0) {
                        int m34692q = c11146e0.m34692q();
                        c11146e0.m34678V(m34692q);
                        m34663G -= m34692q + 4;
                    }
                } else if (m34664H == 4) {
                    if ((m34664H2 & 64) != 0) {
                        int m34663G2 = c11146e0.m34663G();
                        c11146e0.m34678V(m34663G2 - 4);
                        m34663G -= m34663G2;
                    }
                    if ((m34664H2 & 16) != 0) {
                        m34663G -= 10;
                    }
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("Skipped ID3 tag with unsupported majorVersion=");
                    sb2.append(m34664H);
                }
                if (m34664H < 4 && (m34664H2 & RecognitionOptions.ITF) != 0) {
                    z10 = true;
                }
                return new b(m34664H, z10, m34663G);
            }
            sb2 = new StringBuilder();
            sb2.append("Unexpected first three bytes of ID3 tag header: 0x");
            sb2.append(String.format("%06X", Integer.valueOf(m34667K)));
            str = sb2.toString();
        }
        C11173s.m34970i("Id3Decoder", str);
        return null;
    }

    /* renamed from: n */
    private static C10289k m30819n(C11146e0 c11146e0, int i10) {
        int m34670N = c11146e0.m34670N();
        int m34667K = c11146e0.m34667K();
        int m34667K2 = c11146e0.m34667K();
        int m34664H = c11146e0.m34664H();
        int m34664H2 = c11146e0.m34664H();
        C11144d0 c11144d0 = new C11144d0();
        c11144d0.m34637m(c11146e0);
        int i11 = ((i10 - 10) * 8) / (m34664H + m34664H2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int m34632h = c11144d0.m34632h(m34664H);
            int m34632h2 = c11144d0.m34632h(m34664H2);
            iArr[i12] = m34632h;
            iArr2[i12] = m34632h2;
        }
        return new C10289k(m34670N, m34667K, m34667K2, iArr, iArr2);
    }

    /* renamed from: o */
    private static C10290l m30820o(C11146e0 c11146e0, int i10) {
        byte[] bArr = new byte[i10];
        c11146e0.m34688l(bArr, 0, i10);
        int m30831z = m30831z(bArr, 0);
        return new C10290l(new String(bArr, 0, m30831z, C7149e.f16018b), m30810d(bArr, m30831z + 1, i10));
    }

    /* renamed from: p */
    private static String m30821p(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    /* renamed from: q */
    private static C10291m m30822q(C11146e0 c11146e0, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int m34664H = c11146e0.m34664H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c11146e0.m34688l(bArr, 0, i11);
        return new C10291m(str, null, m30823r(bArr, m34664H, 0));
    }

    /* renamed from: r */
    private static AbstractC5907w<String> m30823r(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return AbstractC5907w.m15082w("");
        }
        AbstractC5907w.a m15077p = AbstractC5907w.m15077p();
        while (true) {
            int m30830y = m30830y(bArr, i11, i10);
            if (i11 >= m30830y) {
                break;
            }
            m15077p.mo14724a(new String(bArr, i11, m30830y - i11, m30828w(i10)));
            i11 = m30827v(i10) + m30830y;
        }
        AbstractC5907w<String> m15094k = m15077p.m15094k();
        return m15094k.isEmpty() ? AbstractC5907w.m15082w("") : m15094k;
    }

    /* renamed from: s */
    private static C10291m m30824s(C11146e0 c11146e0, int i10) {
        if (i10 < 1) {
            return null;
        }
        int m34664H = c11146e0.m34664H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c11146e0.m34688l(bArr, 0, i11);
        int m30830y = m30830y(bArr, 0, m34664H);
        return new C10291m("TXXX", new String(bArr, 0, m30830y, m30828w(m34664H)), m30823r(bArr, m34664H, m30830y + m30827v(m34664H)));
    }

    /* renamed from: t */
    private static C10292n m30825t(C11146e0 c11146e0, int i10, String str) {
        byte[] bArr = new byte[i10];
        c11146e0.m34688l(bArr, 0, i10);
        return new C10292n(str, null, new String(bArr, 0, m30831z(bArr, 0), C7149e.f16018b));
    }

    /* renamed from: u */
    private static C10292n m30826u(C11146e0 c11146e0, int i10) {
        if (i10 < 1) {
            return null;
        }
        int m34664H = c11146e0.m34664H();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c11146e0.m34688l(bArr, 0, i11);
        int m30830y = m30830y(bArr, 0, m34664H);
        String str = new String(bArr, 0, m30830y, m30828w(m34664H));
        int m30827v = m30830y + m30827v(m34664H);
        return new C10292n("WXXX", str, m30821p(bArr, m30827v, m30831z(bArr, m30827v), C7149e.f16018b));
    }

    /* renamed from: v */
    private static int m30827v(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    /* renamed from: w */
    private static Charset m30828w(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? C7149e.f16018b : C7149e.f16019c : C7149e.f16020d : C7149e.f16022f;
    }

    /* renamed from: x */
    private static String m30829x(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    /* renamed from: y */
    private static int m30830y(byte[] bArr, int i10, int i11) {
        int m30831z = m30831z(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return m30831z;
        }
        while (m30831z < bArr.length - 1) {
            if ((m30831z - i10) % 2 == 0 && bArr[m30831z + 1] == 0) {
                return m30831z;
            }
            m30831z = m30831z(bArr, m30831z + 1);
        }
        return bArr.length;
    }

    /* renamed from: z */
    private static int m30831z(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    @Override // p216l7.AbstractC9406g
    /* renamed from: b */
    protected C9400a mo28014b(C9403d c9403d, ByteBuffer byteBuffer) {
        return m30832e(byteBuffer.array(), byteBuffer.limit());
    }

    /* renamed from: e */
    public C9400a m30832e(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        C11146e0 c11146e0 = new C11146e0(bArr, i10);
        b m30818m = m30818m(c11146e0);
        if (m30818m == null) {
            return null;
        }
        int m34683f = c11146e0.m34683f();
        int i11 = m30818m.f25548a == 2 ? 6 : 10;
        int i12 = m30818m.f25550c;
        if (m30818m.f25549b) {
            i12 = m30807B(c11146e0, m30818m.f25550c);
        }
        c11146e0.m34676T(m34683f + i12);
        boolean z10 = false;
        if (!m30808C(c11146e0, m30818m.f25548a, i11, false)) {
            if (m30818m.f25548a != 4 || !m30808C(c11146e0, 4, i11, true)) {
                C11173s.m34970i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m30818m.f25548a);
                return null;
            }
            z10 = true;
        }
        while (c11146e0.m34679a() >= i11) {
            AbstractC10287i m30816k = m30816k(m30818m.f25548a, c11146e0, z10, i11, this.f25547a);
            if (m30816k != null) {
                arrayList.add(m30816k);
            }
        }
        return new C9400a(arrayList);
    }
}
