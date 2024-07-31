package p085eh;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kg.C9264b;
import p066dg.C6958s;
import p066dg.EnumC6944e;
import p066dg.InterfaceC6959t;

/* renamed from: eh.e */
/* loaded from: classes2.dex */
public class C7193e {

    /* renamed from: f */
    private static final b f16098f = new b();

    /* renamed from: a */
    private final C9264b f16099a;

    /* renamed from: c */
    private boolean f16101c;

    /* renamed from: e */
    private final InterfaceC6959t f16103e;

    /* renamed from: b */
    private final List<C7192d> f16100b = new ArrayList();

    /* renamed from: d */
    private final int[] f16102d = new int[5];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eh.e$b */
    /* loaded from: classes2.dex */
    public static final class b implements Comparator<C7192d>, Serializable {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C7192d c7192d, C7192d c7192d2) {
            return Float.compare(c7192d.m21419i(), c7192d2.m21419i());
        }
    }

    public C7193e(C9264b c9264b, InterfaceC6959t interfaceC6959t) {
        this.f16099a = c9264b;
        this.f16103e = interfaceC6959t;
    }

    /* renamed from: a */
    private static float m21420a(int[] iArr, int i10) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    /* renamed from: b */
    private boolean m21421b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int[] m21429k = m21429k();
        int i15 = 0;
        while (i10 >= i15 && i11 >= i15 && this.f16099a.m27603g(i11 - i15, i10 - i15)) {
            m21429k[2] = m21429k[2] + 1;
            i15++;
        }
        if (m21429k[2] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && !this.f16099a.m27603g(i11 - i15, i10 - i15)) {
            m21429k[1] = m21429k[1] + 1;
            i15++;
        }
        if (m21429k[1] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && this.f16099a.m27603g(i11 - i15, i10 - i15)) {
            m21429k[0] = m21429k[0] + 1;
            i15++;
        }
        if (m21429k[0] == 0) {
            return false;
        }
        int m27606j = this.f16099a.m27606j();
        int m27609m = this.f16099a.m27609m();
        int i16 = 1;
        while (true) {
            int i17 = i10 + i16;
            if (i17 >= m27606j || (i14 = i11 + i16) >= m27609m || !this.f16099a.m27603g(i14, i17)) {
                break;
            }
            m21429k[2] = m21429k[2] + 1;
            i16++;
        }
        while (true) {
            int i18 = i10 + i16;
            if (i18 >= m27606j || (i13 = i11 + i16) >= m27609m || this.f16099a.m27603g(i13, i18)) {
                break;
            }
            m21429k[3] = m21429k[3] + 1;
            i16++;
        }
        if (m21429k[3] == 0) {
            return false;
        }
        while (true) {
            int i19 = i10 + i16;
            if (i19 >= m27606j || (i12 = i11 + i16) >= m27609m || !this.f16099a.m27603g(i12, i19)) {
                break;
            }
            m21429k[4] = m21429k[4] + 1;
            i16++;
        }
        if (m21429k[4] == 0) {
            return false;
        }
        return m21428j(m21429k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0082, code lost:
    
        if (r2[3] < r13) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0086, code lost:
    
        if (r11 >= r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008c, code lost:
    
        if (r0.m27603g(r11, r12) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008e, code lost:
    
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0090, code lost:
    
        if (r9 >= r13) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0099, code lost:
    
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009b, code lost:
    
        if (r12 < r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x009d, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b1, code lost:
    
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < r14) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b3, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b8, code lost:
    
        if (m21427i(r2) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00be, code lost:
    
        return m21420a(r2, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return Float.NaN;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float m21422c(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            kg.b r0 = r10.f16099a
            int r1 = r0.m27609m()
            int[] r2 = r10.m21429k()
            r3 = r11
        Lb:
            r4 = 2
            r5 = 1
            if (r3 < 0) goto L1d
            boolean r6 = r0.m27603g(r3, r12)
            if (r6 == 0) goto L1d
            r6 = r2[r4]
            int r6 = r6 + r5
            r2[r4] = r6
            int r3 = r3 + (-1)
            goto Lb
        L1d:
            r6 = 2143289344(0x7fc00000, float:NaN)
            if (r3 >= 0) goto L22
            return r6
        L22:
            if (r3 < 0) goto L35
            boolean r7 = r0.m27603g(r3, r12)
            if (r7 != 0) goto L35
            r7 = r2[r5]
            if (r7 > r13) goto L35
            int r7 = r7 + 1
            r2[r5] = r7
            int r3 = r3 + (-1)
            goto L22
        L35:
            if (r3 < 0) goto Lbe
            r7 = r2[r5]
            if (r7 <= r13) goto L3d
            goto Lbe
        L3d:
            r7 = 0
            if (r3 < 0) goto L51
            boolean r8 = r0.m27603g(r3, r12)
            if (r8 == 0) goto L51
            r8 = r2[r7]
            if (r8 > r13) goto L51
            int r8 = r8 + 1
            r2[r7] = r8
            int r3 = r3 + (-1)
            goto L3d
        L51:
            r3 = r2[r7]
            if (r3 <= r13) goto L56
            return r6
        L56:
            int r11 = r11 + r5
        L57:
            if (r11 >= r1) goto L67
            boolean r3 = r0.m27603g(r11, r12)
            if (r3 == 0) goto L67
            r3 = r2[r4]
            int r3 = r3 + r5
            r2[r4] = r3
            int r11 = r11 + 1
            goto L57
        L67:
            if (r11 != r1) goto L6a
            return r6
        L6a:
            r3 = 3
            if (r11 >= r1) goto L7e
            boolean r8 = r0.m27603g(r11, r12)
            if (r8 != 0) goto L7e
            r8 = r2[r3]
            if (r8 >= r13) goto L7e
            int r8 = r8 + 1
            r2[r3] = r8
            int r11 = r11 + 1
            goto L6a
        L7e:
            if (r11 == r1) goto Lbe
            r8 = r2[r3]
            if (r8 < r13) goto L85
            goto Lbe
        L85:
            r8 = 4
            if (r11 >= r1) goto L99
            boolean r9 = r0.m27603g(r11, r12)
            if (r9 == 0) goto L99
            r9 = r2[r8]
            if (r9 >= r13) goto L99
            int r9 = r9 + 1
            r2[r8] = r9
            int r11 = r11 + 1
            goto L85
        L99:
            r12 = r2[r8]
            if (r12 < r13) goto L9e
            return r6
        L9e:
            r13 = r2[r7]
            r0 = r2[r5]
            int r13 = r13 + r0
            r0 = r2[r4]
            int r13 = r13 + r0
            r0 = r2[r3]
            int r13 = r13 + r0
            int r13 = r13 + r12
            int r13 = r13 - r14
            int r12 = java.lang.Math.abs(r13)
            int r12 = r12 * 5
            if (r12 < r14) goto Lb4
            return r6
        Lb4:
            boolean r12 = m21427i(r2)
            if (r12 == 0) goto Lbe
            float r6 = m21420a(r2, r11)
        Lbe:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p085eh.C7193e.m21422c(int, int, int, int):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0082, code lost:
    
        if (r2[3] < r13) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0086, code lost:
    
        if (r11 >= r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008c, code lost:
    
        if (r0.m27603g(r12, r11) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008e, code lost:
    
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0090, code lost:
    
        if (r9 >= r13) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0099, code lost:
    
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009b, code lost:
    
        if (r12 < r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x009d, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b2, code lost:
    
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < (r14 * 2)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b4, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b9, code lost:
    
        if (m21427i(r2) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bf, code lost:
    
        return m21420a(r2, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return Float.NaN;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float m21423d(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            kg.b r0 = r10.f16099a
            int r1 = r0.m27606j()
            int[] r2 = r10.m21429k()
            r3 = r11
        Lb:
            r4 = 2
            r5 = 1
            if (r3 < 0) goto L1d
            boolean r6 = r0.m27603g(r12, r3)
            if (r6 == 0) goto L1d
            r6 = r2[r4]
            int r6 = r6 + r5
            r2[r4] = r6
            int r3 = r3 + (-1)
            goto Lb
        L1d:
            r6 = 2143289344(0x7fc00000, float:NaN)
            if (r3 >= 0) goto L22
            return r6
        L22:
            if (r3 < 0) goto L35
            boolean r7 = r0.m27603g(r12, r3)
            if (r7 != 0) goto L35
            r7 = r2[r5]
            if (r7 > r13) goto L35
            int r7 = r7 + 1
            r2[r5] = r7
            int r3 = r3 + (-1)
            goto L22
        L35:
            if (r3 < 0) goto Lbf
            r7 = r2[r5]
            if (r7 <= r13) goto L3d
            goto Lbf
        L3d:
            r7 = 0
            if (r3 < 0) goto L51
            boolean r8 = r0.m27603g(r12, r3)
            if (r8 == 0) goto L51
            r8 = r2[r7]
            if (r8 > r13) goto L51
            int r8 = r8 + 1
            r2[r7] = r8
            int r3 = r3 + (-1)
            goto L3d
        L51:
            r3 = r2[r7]
            if (r3 <= r13) goto L56
            return r6
        L56:
            int r11 = r11 + r5
        L57:
            if (r11 >= r1) goto L67
            boolean r3 = r0.m27603g(r12, r11)
            if (r3 == 0) goto L67
            r3 = r2[r4]
            int r3 = r3 + r5
            r2[r4] = r3
            int r11 = r11 + 1
            goto L57
        L67:
            if (r11 != r1) goto L6a
            return r6
        L6a:
            r3 = 3
            if (r11 >= r1) goto L7e
            boolean r8 = r0.m27603g(r12, r11)
            if (r8 != 0) goto L7e
            r8 = r2[r3]
            if (r8 >= r13) goto L7e
            int r8 = r8 + 1
            r2[r3] = r8
            int r11 = r11 + 1
            goto L6a
        L7e:
            if (r11 == r1) goto Lbf
            r8 = r2[r3]
            if (r8 < r13) goto L85
            goto Lbf
        L85:
            r8 = 4
            if (r11 >= r1) goto L99
            boolean r9 = r0.m27603g(r12, r11)
            if (r9 == 0) goto L99
            r9 = r2[r8]
            if (r9 >= r13) goto L99
            int r9 = r9 + 1
            r2[r8] = r9
            int r11 = r11 + 1
            goto L85
        L99:
            r12 = r2[r8]
            if (r12 < r13) goto L9e
            return r6
        L9e:
            r13 = r2[r7]
            r0 = r2[r5]
            int r13 = r13 + r0
            r0 = r2[r4]
            int r13 = r13 + r0
            r0 = r2[r3]
            int r13 = r13 + r0
            int r13 = r13 + r12
            int r13 = r13 - r14
            int r12 = java.lang.Math.abs(r13)
            int r12 = r12 * 5
            int r14 = r14 * r4
            if (r12 < r14) goto Lb5
            return r6
        Lb5:
            boolean r12 = m21427i(r2)
            if (r12 == 0) goto Lbf
            float r6 = m21420a(r2, r11)
        Lbf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p085eh.C7193e.m21423d(int, int, int, int):float");
    }

    /* renamed from: e */
    protected static void m21424e(int[] iArr) {
        Arrays.fill(iArr, 0);
    }

    /* renamed from: f */
    protected static void m21425f(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    /* renamed from: h */
    private int m21426h() {
        if (this.f16100b.size() <= 1) {
            return 0;
        }
        C7192d c7192d = null;
        for (C7192d c7192d2 : this.f16100b) {
            if (c7192d2.m21418h() >= 2) {
                if (c7192d != null) {
                    this.f16101c = true;
                    return ((int) (Math.abs(c7192d.m20119c() - c7192d2.m20119c()) - Math.abs(c7192d.m20120d() - c7192d2.m20120d()))) / 2;
                }
                c7192d = c7192d2;
            }
        }
        return 0;
    }

    /* renamed from: i */
    protected static boolean m21427i(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = f10 / 2.0f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    /* renamed from: j */
    protected static boolean m21428j(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = f10 / 1.333f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    /* renamed from: k */
    private int[] m21429k() {
        m21424e(this.f16102d);
        return this.f16102d;
    }

    /* renamed from: m */
    private boolean m21430m() {
        int size = this.f16100b.size();
        float f10 = 0.0f;
        int i10 = 0;
        float f11 = 0.0f;
        for (C7192d c7192d : this.f16100b) {
            if (c7192d.m21418h() >= 2) {
                i10++;
                f11 += c7192d.m21419i();
            }
        }
        if (i10 < 3) {
            return false;
        }
        float f12 = f11 / size;
        Iterator<C7192d> it = this.f16100b.iterator();
        while (it.hasNext()) {
            f10 += Math.abs(it.next().m21419i() - f12);
        }
        return f10 <= f11 * 0.05f;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6 A[SYNTHETIC] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p085eh.C7192d[] m21431n() {
        /*
            r26 = this;
            r0 = r26
            java.util.List<eh.d> r1 = r0.f16100b
            int r1 = r1.size()
            r2 = 3
            if (r1 < r2) goto Ld8
            java.util.List<eh.d> r1 = r0.f16100b
            eh.e$b r3 = p085eh.C7193e.f16098f
            r1.sort(r3)
            eh.d[] r1 = new p085eh.C7192d[r2]
            r2 = 0
            r5 = r2
            r6 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L1b:
            java.util.List<eh.d> r8 = r0.f16100b
            int r8 = r8.size()
            r9 = 2
            int r8 = r8 - r9
            if (r5 >= r8) goto Lc9
            java.util.List<eh.d> r8 = r0.f16100b
            java.lang.Object r8 = r8.get(r5)
            eh.d r8 = (p085eh.C7192d) r8
            float r10 = r8.m21419i()
            int r5 = r5 + 1
            r11 = r5
        L34:
            java.util.List<eh.d> r12 = r0.f16100b
            int r12 = r12.size()
            r13 = 1
            int r12 = r12 - r13
            if (r11 >= r12) goto L1b
            java.util.List<eh.d> r12 = r0.f16100b
            java.lang.Object r12 = r12.get(r11)
            eh.d r12 = (p085eh.C7192d) r12
            double r14 = m21432o(r8, r12)
            int r11 = r11 + 1
            r3 = r11
        L4d:
            java.util.List<eh.d> r4 = r0.f16100b
            int r4 = r4.size()
            if (r3 >= r4) goto L34
            java.util.List<eh.d> r4 = r0.f16100b
            java.lang.Object r4 = r4.get(r3)
            eh.d r4 = (p085eh.C7192d) r4
            float r16 = r4.m21419i()
            r17 = 1068708659(0x3fb33333, float:1.4)
            float r17 = r17 * r10
            int r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r16 <= 0) goto L6b
            goto Lc6
        L6b:
            double r16 = m21432o(r12, r4)
            double r18 = m21432o(r8, r4)
            int r20 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r20 >= 0) goto L8e
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 <= 0) goto L85
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 >= 0) goto L82
            r20 = r14
            goto La6
        L82:
            r20 = r18
            goto L9a
        L85:
            r20 = r14
            r24 = r16
            r16 = r18
            r18 = r24
            goto La6
        L8e:
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 >= 0) goto La0
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 >= 0) goto L9d
            r20 = r16
            r16 = r18
        L9a:
            r18 = r14
            goto La6
        L9d:
            r20 = r16
            goto La4
        La0:
            r20 = r18
            r18 = r16
        La4:
            r16 = r14
        La6:
            r22 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r18 = r18 * r22
            double r18 = r16 - r18
            double r18 = java.lang.Math.abs(r18)
            double r20 = r20 * r22
            double r16 = r16 - r20
            double r16 = java.lang.Math.abs(r16)
            double r18 = r18 + r16
            int r16 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r16 >= 0) goto Lc6
            r1[r2] = r8
            r1[r13] = r12
            r1[r9] = r4
            r6 = r18
        Lc6:
            int r3 = r3 + 1
            goto L4d
        Lc9:
            r3 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto Ld3
            return r1
        Ld3:
            dg.m r1 = p066dg.C6952m.m20106a()
            throw r1
        Ld8:
            dg.m r1 = p066dg.C6952m.m20106a()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p085eh.C7193e.m21431n():eh.d[]");
    }

    /* renamed from: o */
    private static double m21432o(C7192d c7192d, C7192d c7192d2) {
        double m20119c = c7192d.m20119c() - c7192d2.m20119c();
        double m20120d = c7192d.m20120d() - c7192d2.m20120d();
        return (m20119c * m20119c) + (m20120d * m20120d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final C7194f m21433g(Map<EnumC6944e, ?> map) {
        boolean z10 = map != null && map.containsKey(EnumC6944e.TRY_HARDER);
        int m27606j = this.f16099a.m27606j();
        int m27609m = this.f16099a.m27609m();
        int i10 = (m27606j * 3) / 388;
        if (i10 < 3 || z10) {
            i10 = 3;
        }
        int[] iArr = new int[5];
        int i11 = i10 - 1;
        boolean z11 = false;
        while (i11 < m27606j && !z11) {
            m21424e(iArr);
            int i12 = 0;
            int i13 = 0;
            while (i12 < m27609m) {
                if (this.f16099a.m27603g(i12, i11)) {
                    if ((i13 & 1) == 1) {
                        i13++;
                    }
                    iArr[i13] = iArr[i13] + 1;
                } else if ((i13 & 1) != 0) {
                    iArr[i13] = iArr[i13] + 1;
                } else if (i13 != 4) {
                    i13++;
                    iArr[i13] = iArr[i13] + 1;
                } else if (m21427i(iArr) && m21434l(iArr, i11, i12)) {
                    if (this.f16101c) {
                        z11 = m21430m();
                    } else {
                        int m21426h = m21426h();
                        int i14 = iArr[2];
                        if (m21426h > i14) {
                            i11 += (m21426h - i14) - 2;
                            i12 = m27609m - 1;
                        }
                    }
                    m21424e(iArr);
                    i10 = 2;
                    i13 = 0;
                } else {
                    m21425f(iArr);
                    i13 = 3;
                }
                i12++;
            }
            if (m21427i(iArr) && m21434l(iArr, i11, m27609m)) {
                i10 = iArr[0];
                if (this.f16101c) {
                    z11 = m21430m();
                }
            }
            i11 += i10;
        }
        C7192d[] m21431n = m21431n();
        C6958s.m20118e(m21431n);
        return new C7194f(m21431n);
    }

    /* renamed from: l */
    protected final boolean m21434l(int[] iArr, int i10, int i11) {
        boolean z10 = false;
        int i12 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int m21420a = (int) m21420a(iArr, i11);
        float m21423d = m21423d(i10, m21420a, iArr[2], i12);
        if (!Float.isNaN(m21423d)) {
            int i13 = (int) m21423d;
            float m21422c = m21422c(m21420a, i13, iArr[2], i12);
            if (!Float.isNaN(m21422c) && m21421b(i13, (int) m21422c)) {
                float f10 = i12 / 7.0f;
                int i14 = 0;
                while (true) {
                    if (i14 >= this.f16100b.size()) {
                        break;
                    }
                    C7192d c7192d = this.f16100b.get(i14);
                    if (c7192d.m21416f(f10, m21423d, m21422c)) {
                        this.f16100b.set(i14, c7192d.m21417g(m21423d, m21422c, f10));
                        z10 = true;
                        break;
                    }
                    i14++;
                }
                if (!z10) {
                    C7192d c7192d2 = new C7192d(m21422c, m21423d, f10);
                    this.f16100b.add(c7192d2);
                    InterfaceC6959t interfaceC6959t = this.f16103e;
                    if (interfaceC6959t != null) {
                        interfaceC6959t.mo20121a(c7192d2);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
