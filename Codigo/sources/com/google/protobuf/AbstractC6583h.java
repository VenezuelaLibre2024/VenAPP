package com.google.protobuf;

import com.google.android.gms.common.api.C5101a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.protobuf.h */
/* loaded from: classes2.dex */
public abstract class AbstractC6583h {

    /* renamed from: f */
    private static volatile int f14471f = 100;

    /* renamed from: a */
    int f14472a;

    /* renamed from: b */
    int f14473b;

    /* renamed from: c */
    int f14474c;

    /* renamed from: d */
    C6586i f14475d;

    /* renamed from: e */
    private boolean f14476e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.h$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC6583h {

        /* renamed from: g */
        private final byte[] f14477g;

        /* renamed from: h */
        private final boolean f14478h;

        /* renamed from: i */
        private int f14479i;

        /* renamed from: j */
        private int f14480j;

        /* renamed from: k */
        private int f14481k;

        /* renamed from: l */
        private int f14482l;

        /* renamed from: m */
        private int f14483m;

        /* renamed from: n */
        private boolean f14484n;

        /* renamed from: o */
        private int f14485o;

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f14485o = C5101a.e.API_PRIORITY_OTHER;
            this.f14477g = bArr;
            this.f14479i = i11 + i10;
            this.f14481k = i10;
            this.f14482l = i10;
            this.f14478h = z10;
        }

        /* renamed from: N */
        private void m18581N() {
            int i10 = this.f14479i + this.f14480j;
            this.f14479i = i10;
            int i11 = i10 - this.f14482l;
            int i12 = this.f14485o;
            if (i11 <= i12) {
                this.f14480j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f14480j = i13;
            this.f14479i = i10 - i13;
        }

        /* renamed from: Q */
        private void m18582Q() {
            if (this.f14479i - this.f14481k >= 10) {
                m18583R();
            } else {
                m18584S();
            }
        }

        /* renamed from: R */
        private void m18583R() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f14477g;
                int i11 = this.f14481k;
                this.f14481k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C6566b0.m18401f();
        }

        /* renamed from: S */
        private void m18584S() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (m18585G() >= 0) {
                    return;
                }
            }
            throw C6566b0.m18401f();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: A */
        public String mo18556A() {
            int m18589K = m18589K();
            if (m18589K > 0) {
                int i10 = this.f14479i;
                int i11 = this.f14481k;
                if (m18589K <= i10 - i11) {
                    String m19110e = C6618s1.m19110e(this.f14477g, i11, m18589K);
                    this.f14481k += m18589K;
                    return m19110e;
                }
            }
            if (m18589K == 0) {
                return "";
            }
            if (m18589K <= 0) {
                throw C6566b0.m18402g();
            }
            throw C6566b0.m18406m();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: B */
        public int mo18557B() {
            if (mo18564e()) {
                this.f14483m = 0;
                return 0;
            }
            int m18589K = m18589K();
            this.f14483m = m18589K;
            if (C6621t1.m19188a(m18589K) != 0) {
                return this.f14483m;
            }
            throw C6566b0.m18398c();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: C */
        public int mo18558C() {
            return m18589K();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: D */
        public long mo18559D() {
            return m18590L();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: F */
        public boolean mo18561F(int i10) {
            int m19189b = C6621t1.m19189b(i10);
            if (m19189b == 0) {
                m18582Q();
                return true;
            }
            if (m19189b == 1) {
                m18593P(8);
                return true;
            }
            if (m19189b == 2) {
                m18593P(m18589K());
                return true;
            }
            if (m19189b == 3) {
                m18592O();
                mo18562a(C6621t1.m19190c(C6621t1.m19188a(i10), 4));
                return true;
            }
            if (m19189b == 4) {
                return false;
            }
            if (m19189b != 5) {
                throw C6566b0.m18400e();
            }
            m18593P(4);
            return true;
        }

        /* renamed from: G */
        public byte m18585G() {
            int i10 = this.f14481k;
            if (i10 == this.f14479i) {
                throw C6566b0.m18406m();
            }
            byte[] bArr = this.f14477g;
            this.f14481k = i10 + 1;
            return bArr[i10];
        }

        /* renamed from: H */
        public byte[] m18586H(int i10) {
            if (i10 > 0) {
                int i11 = this.f14479i;
                int i12 = this.f14481k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f14481k = i13;
                    return Arrays.copyOfRange(this.f14477g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw C6566b0.m18406m();
            }
            if (i10 == 0) {
                return C6633z.f14675d;
            }
            throw C6566b0.m18402g();
        }

        /* renamed from: I */
        public int m18587I() {
            int i10 = this.f14481k;
            if (this.f14479i - i10 < 4) {
                throw C6566b0.m18406m();
            }
            byte[] bArr = this.f14477g;
            this.f14481k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        /* renamed from: J */
        public long m18588J() {
            int i10 = this.f14481k;
            if (this.f14479i - i10 < 8) {
                throw C6566b0.m18406m();
            }
            byte[] bArr = this.f14477g;
            this.f14481k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /* renamed from: K */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m18589K() {
            /*
                r5 = this;
                int r0 = r5.f14481k
                int r1 = r5.f14479i
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f14477g
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f14481k = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.m18591M()
                int r0 = (int) r0
                return r0
            L70:
                r5.f14481k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC6583h.b.m18589K():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /* renamed from: L */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long m18590L() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC6583h.b.m18590L():long");
        }

        /* renamed from: M */
        long m18591M() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((m18585G() & 128) == 0) {
                    return j10;
                }
            }
            throw C6566b0.m18401f();
        }

        /* renamed from: O */
        public void m18592O() {
            int mo18557B;
            do {
                mo18557B = mo18557B();
                if (mo18557B == 0) {
                    return;
                }
            } while (mo18561F(mo18557B));
        }

        /* renamed from: P */
        public void m18593P(int i10) {
            if (i10 >= 0) {
                int i11 = this.f14479i;
                int i12 = this.f14481k;
                if (i10 <= i11 - i12) {
                    this.f14481k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw C6566b0.m18406m();
            }
            throw C6566b0.m18402g();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: a */
        public void mo18562a(int i10) {
            if (this.f14483m != i10) {
                throw C6566b0.m18397b();
            }
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: d */
        public int mo18563d() {
            return this.f14481k - this.f14482l;
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: e */
        public boolean mo18564e() {
            return this.f14481k == this.f14479i;
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: k */
        public void mo18565k(int i10) {
            this.f14485o = i10;
            m18581N();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: l */
        public int mo18566l(int i10) {
            if (i10 < 0) {
                throw C6566b0.m18402g();
            }
            int mo18563d = i10 + mo18563d();
            if (mo18563d < 0) {
                throw C6566b0.m18403h();
            }
            int i11 = this.f14485o;
            if (mo18563d > i11) {
                throw C6566b0.m18406m();
            }
            this.f14485o = mo18563d;
            m18581N();
            return i11;
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: m */
        public boolean mo18567m() {
            return m18590L() != 0;
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: n */
        public AbstractC6580g mo18568n() {
            int m18589K = m18589K();
            if (m18589K > 0) {
                int i10 = this.f14479i;
                int i11 = this.f14481k;
                if (m18589K <= i10 - i11) {
                    AbstractC6580g m18509E = (this.f14478h && this.f14484n) ? AbstractC6580g.m18509E(this.f14477g, i11, m18589K) : AbstractC6580g.m18514l(this.f14477g, i11, m18589K);
                    this.f14481k += m18589K;
                    return m18509E;
                }
            }
            return m18589K == 0 ? AbstractC6580g.f14459b : AbstractC6580g.m18508D(m18586H(m18589K));
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: o */
        public double mo18569o() {
            return Double.longBitsToDouble(m18588J());
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: p */
        public int mo18570p() {
            return m18589K();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: q */
        public int mo18571q() {
            return m18587I();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: r */
        public long mo18572r() {
            return m18588J();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: s */
        public float mo18573s() {
            return Float.intBitsToFloat(m18587I());
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: t */
        public int mo18574t() {
            return m18589K();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: u */
        public long mo18575u() {
            return m18590L();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: v */
        public int mo18576v() {
            return m18587I();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: w */
        public long mo18577w() {
            return m18588J();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: x */
        public int mo18578x() {
            return AbstractC6583h.m18549b(m18589K());
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: y */
        public long mo18579y() {
            return AbstractC6583h.m18550c(m18590L());
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: z */
        public String mo18580z() {
            int m18589K = m18589K();
            if (m18589K > 0) {
                int i10 = this.f14479i;
                int i11 = this.f14481k;
                if (m18589K <= i10 - i11) {
                    String str = new String(this.f14477g, i11, m18589K, C6633z.f14673b);
                    this.f14481k += m18589K;
                    return str;
                }
            }
            if (m18589K == 0) {
                return "";
            }
            if (m18589K < 0) {
                throw C6566b0.m18402g();
            }
            throw C6566b0.m18406m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.h$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC6583h {

        /* renamed from: g */
        private final InputStream f14486g;

        /* renamed from: h */
        private final byte[] f14487h;

        /* renamed from: i */
        private int f14488i;

        /* renamed from: j */
        private int f14489j;

        /* renamed from: k */
        private int f14490k;

        /* renamed from: l */
        private int f14491l;

        /* renamed from: m */
        private int f14492m;

        /* renamed from: n */
        private int f14493n;

        private c(InputStream inputStream, int i10) {
            super();
            this.f14493n = C5101a.e.API_PRIORITY_OTHER;
            C6633z.m19348b(inputStream, "input");
            this.f14486g = inputStream;
            this.f14487h = new byte[i10];
            this.f14488i = 0;
            this.f14490k = 0;
            this.f14492m = 0;
        }

        /* renamed from: G */
        private static int m18594G(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (C6566b0 e10) {
                e10.m18408j();
                throw e10;
            }
        }

        /* renamed from: H */
        private static int m18595H(InputStream inputStream, byte[] bArr, int i10, int i11) {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (C6566b0 e10) {
                e10.m18408j();
                throw e10;
            }
        }

        /* renamed from: I */
        private AbstractC6580g m18596I(int i10) {
            byte[] m18598L = m18598L(i10);
            if (m18598L != null) {
                return AbstractC6580g.m18513k(m18598L);
            }
            int i11 = this.f14490k;
            int i12 = this.f14488i;
            int i13 = i12 - i11;
            this.f14492m += i12;
            this.f14490k = 0;
            this.f14488i = 0;
            List<byte[]> m18599M = m18599M(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f14487h, i11, bArr, 0, i13);
            for (byte[] bArr2 : m18599M) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return AbstractC6580g.m18508D(bArr);
        }

        /* renamed from: K */
        private byte[] m18597K(int i10, boolean z10) {
            byte[] m18598L = m18598L(i10);
            if (m18598L != null) {
                return z10 ? (byte[]) m18598L.clone() : m18598L;
            }
            int i11 = this.f14490k;
            int i12 = this.f14488i;
            int i13 = i12 - i11;
            this.f14492m += i12;
            this.f14490k = 0;
            this.f14488i = 0;
            List<byte[]> m18599M = m18599M(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f14487h, i11, bArr, 0, i13);
            for (byte[] bArr2 : m18599M) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: L */
        private byte[] m18598L(int i10) {
            if (i10 == 0) {
                return C6633z.f14675d;
            }
            if (i10 < 0) {
                throw C6566b0.m18402g();
            }
            int i11 = this.f14492m;
            int i12 = this.f14490k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f14474c > 0) {
                throw C6566b0.m18405l();
            }
            int i14 = this.f14493n;
            if (i13 > i14) {
                m18615W((i14 - i11) - i12);
                throw C6566b0.m18406m();
            }
            int i15 = this.f14488i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > m18594G(this.f14486g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f14487h, this.f14490k, bArr, 0, i15);
            this.f14492m += this.f14488i;
            this.f14490k = 0;
            this.f14488i = 0;
            while (i15 < i10) {
                int m18595H = m18595H(this.f14486g, bArr, i15, i10 - i15);
                if (m18595H == -1) {
                    throw C6566b0.m18406m();
                }
                this.f14492m += m18595H;
                i15 += m18595H;
            }
            return bArr;
        }

        /* renamed from: M */
        private List<byte[]> m18599M(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, RecognitionOptions.AZTEC);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f14486g.read(bArr, i11, min - i11);
                    if (read == -1) {
                        throw C6566b0.m18406m();
                    }
                    this.f14492m += read;
                    i11 += read;
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: S */
        private void m18600S() {
            int i10 = this.f14488i + this.f14489j;
            this.f14488i = i10;
            int i11 = this.f14492m + i10;
            int i12 = this.f14493n;
            if (i11 <= i12) {
                this.f14489j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f14489j = i13;
            this.f14488i = i10 - i13;
        }

        /* renamed from: T */
        private void m18601T(int i10) {
            if (m18607b0(i10)) {
                return;
            }
            if (i10 <= (this.f14474c - this.f14492m) - this.f14490k) {
                throw C6566b0.m18406m();
            }
            throw C6566b0.m18405l();
        }

        /* renamed from: U */
        private static long m18602U(InputStream inputStream, long j10) {
            try {
                return inputStream.skip(j10);
            } catch (C6566b0 e10) {
                e10.m18408j();
                throw e10;
            }
        }

        /* renamed from: X */
        private void m18603X(int i10) {
            if (i10 < 0) {
                throw C6566b0.m18402g();
            }
            int i11 = this.f14492m;
            int i12 = this.f14490k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f14493n;
            if (i13 > i14) {
                m18615W((i14 - i11) - i12);
                throw C6566b0.m18406m();
            }
            this.f14492m = i11 + i12;
            int i15 = this.f14488i - i12;
            this.f14488i = 0;
            this.f14490k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long m18602U = m18602U(this.f14486g, j10);
                    if (m18602U < 0 || m18602U > j10) {
                        throw new IllegalStateException(this.f14486g.getClass() + "#skip returned invalid result: " + m18602U + "\nThe InputStream implementation is buggy.");
                    }
                    if (m18602U == 0) {
                        break;
                    } else {
                        i15 += (int) m18602U;
                    }
                } finally {
                    this.f14492m += i15;
                    m18600S();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f14488i;
            int i17 = i16 - this.f14490k;
            this.f14490k = i16;
            while (true) {
                m18601T(1);
                int i18 = i10 - i17;
                int i19 = this.f14488i;
                if (i18 <= i19) {
                    this.f14490k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f14490k = i19;
                }
            }
        }

        /* renamed from: Y */
        private void m18604Y() {
            if (this.f14488i - this.f14490k >= 10) {
                m18605Z();
            } else {
                m18606a0();
            }
        }

        /* renamed from: Z */
        private void m18605Z() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f14487h;
                int i11 = this.f14490k;
                this.f14490k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C6566b0.m18401f();
        }

        /* renamed from: a0 */
        private void m18606a0() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (m18608J() >= 0) {
                    return;
                }
            }
            throw C6566b0.m18401f();
        }

        /* renamed from: b0 */
        private boolean m18607b0(int i10) {
            int i11 = this.f14490k;
            int i12 = i11 + i10;
            int i13 = this.f14488i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f14474c;
            int i15 = this.f14492m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f14493n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f14487h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f14492m += i11;
                this.f14488i -= i11;
                this.f14490k = 0;
            }
            InputStream inputStream = this.f14486g;
            byte[] bArr2 = this.f14487h;
            int i16 = this.f14488i;
            int m18595H = m18595H(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f14474c - this.f14492m) - i16));
            if (m18595H == 0 || m18595H < -1 || m18595H > this.f14487h.length) {
                throw new IllegalStateException(this.f14486g.getClass() + "#read(byte[]) returned invalid result: " + m18595H + "\nThe InputStream implementation is buggy.");
            }
            if (m18595H <= 0) {
                return false;
            }
            this.f14488i += m18595H;
            m18600S();
            if (this.f14488i >= i10) {
                return true;
            }
            return m18607b0(i10);
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: A */
        public String mo18556A() {
            byte[] m18597K;
            int i10;
            int m18611P = m18611P();
            int i11 = this.f14490k;
            int i12 = this.f14488i;
            if (m18611P <= i12 - i11 && m18611P > 0) {
                m18597K = this.f14487h;
                i10 = i11 + m18611P;
            } else {
                if (m18611P == 0) {
                    return "";
                }
                i11 = 0;
                if (m18611P > i12) {
                    m18597K = m18597K(m18611P, false);
                    return C6618s1.m19110e(m18597K, i11, m18611P);
                }
                m18601T(m18611P);
                m18597K = this.f14487h;
                i10 = m18611P + 0;
            }
            this.f14490k = i10;
            return C6618s1.m19110e(m18597K, i11, m18611P);
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: B */
        public int mo18557B() {
            if (mo18564e()) {
                this.f14491l = 0;
                return 0;
            }
            int m18611P = m18611P();
            this.f14491l = m18611P;
            if (C6621t1.m19188a(m18611P) != 0) {
                return this.f14491l;
            }
            throw C6566b0.m18398c();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: C */
        public int mo18558C() {
            return m18611P();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: D */
        public long mo18559D() {
            return m18612Q();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: F */
        public boolean mo18561F(int i10) {
            int m19189b = C6621t1.m19189b(i10);
            if (m19189b == 0) {
                m18604Y();
                return true;
            }
            if (m19189b == 1) {
                m18615W(8);
                return true;
            }
            if (m19189b == 2) {
                m18615W(m18611P());
                return true;
            }
            if (m19189b == 3) {
                m18614V();
                mo18562a(C6621t1.m19190c(C6621t1.m19188a(i10), 4));
                return true;
            }
            if (m19189b == 4) {
                return false;
            }
            if (m19189b != 5) {
                throw C6566b0.m18400e();
            }
            m18615W(4);
            return true;
        }

        /* renamed from: J */
        public byte m18608J() {
            if (this.f14490k == this.f14488i) {
                m18601T(1);
            }
            byte[] bArr = this.f14487h;
            int i10 = this.f14490k;
            this.f14490k = i10 + 1;
            return bArr[i10];
        }

        /* renamed from: N */
        public int m18609N() {
            int i10 = this.f14490k;
            if (this.f14488i - i10 < 4) {
                m18601T(4);
                i10 = this.f14490k;
            }
            byte[] bArr = this.f14487h;
            this.f14490k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        /* renamed from: O */
        public long m18610O() {
            int i10 = this.f14490k;
            if (this.f14488i - i10 < 8) {
                m18601T(8);
                i10 = this.f14490k;
            }
            byte[] bArr = this.f14487h;
            this.f14490k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /* renamed from: P */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m18611P() {
            /*
                r5 = this;
                int r0 = r5.f14490k
                int r1 = r5.f14488i
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f14487h
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f14490k = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.m18613R()
                int r0 = (int) r0
                return r0
            L70:
                r5.f14490k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC6583h.c.m18611P():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /* renamed from: Q */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long m18612Q() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC6583h.c.m18612Q():long");
        }

        /* renamed from: R */
        long m18613R() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((m18608J() & 128) == 0) {
                    return j10;
                }
            }
            throw C6566b0.m18401f();
        }

        /* renamed from: V */
        public void m18614V() {
            int mo18557B;
            do {
                mo18557B = mo18557B();
                if (mo18557B == 0) {
                    return;
                }
            } while (mo18561F(mo18557B));
        }

        /* renamed from: W */
        public void m18615W(int i10) {
            int i11 = this.f14488i;
            int i12 = this.f14490k;
            if (i10 > i11 - i12 || i10 < 0) {
                m18603X(i10);
            } else {
                this.f14490k = i12 + i10;
            }
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: a */
        public void mo18562a(int i10) {
            if (this.f14491l != i10) {
                throw C6566b0.m18397b();
            }
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: d */
        public int mo18563d() {
            return this.f14492m + this.f14490k;
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: e */
        public boolean mo18564e() {
            return this.f14490k == this.f14488i && !m18607b0(1);
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: k */
        public void mo18565k(int i10) {
            this.f14493n = i10;
            m18600S();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: l */
        public int mo18566l(int i10) {
            if (i10 < 0) {
                throw C6566b0.m18402g();
            }
            int i11 = i10 + this.f14492m + this.f14490k;
            int i12 = this.f14493n;
            if (i11 > i12) {
                throw C6566b0.m18406m();
            }
            this.f14493n = i11;
            m18600S();
            return i12;
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: m */
        public boolean mo18567m() {
            return m18612Q() != 0;
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: n */
        public AbstractC6580g mo18568n() {
            int m18611P = m18611P();
            int i10 = this.f14488i;
            int i11 = this.f14490k;
            if (m18611P > i10 - i11 || m18611P <= 0) {
                return m18611P == 0 ? AbstractC6580g.f14459b : m18596I(m18611P);
            }
            AbstractC6580g m18514l = AbstractC6580g.m18514l(this.f14487h, i11, m18611P);
            this.f14490k += m18611P;
            return m18514l;
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: o */
        public double mo18569o() {
            return Double.longBitsToDouble(m18610O());
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: p */
        public int mo18570p() {
            return m18611P();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: q */
        public int mo18571q() {
            return m18609N();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: r */
        public long mo18572r() {
            return m18610O();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: s */
        public float mo18573s() {
            return Float.intBitsToFloat(m18609N());
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: t */
        public int mo18574t() {
            return m18611P();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: u */
        public long mo18575u() {
            return m18612Q();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: v */
        public int mo18576v() {
            return m18609N();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: w */
        public long mo18577w() {
            return m18610O();
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: x */
        public int mo18578x() {
            return AbstractC6583h.m18549b(m18611P());
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: y */
        public long mo18579y() {
            return AbstractC6583h.m18550c(m18612Q());
        }

        @Override // com.google.protobuf.AbstractC6583h
        /* renamed from: z */
        public String mo18580z() {
            int m18611P = m18611P();
            if (m18611P > 0) {
                int i10 = this.f14488i;
                int i11 = this.f14490k;
                if (m18611P <= i10 - i11) {
                    String str = new String(this.f14487h, i11, m18611P, C6633z.f14673b);
                    this.f14490k += m18611P;
                    return str;
                }
            }
            if (m18611P == 0) {
                return "";
            }
            if (m18611P > this.f14488i) {
                return new String(m18597K(m18611P, false), C6633z.f14673b);
            }
            m18601T(m18611P);
            String str2 = new String(this.f14487h, this.f14490k, m18611P, C6633z.f14673b);
            this.f14490k += m18611P;
            return str2;
        }
    }

    private AbstractC6583h() {
        this.f14473b = f14471f;
        this.f14474c = C5101a.e.API_PRIORITY_OTHER;
        this.f14476e = false;
    }

    /* renamed from: b */
    public static int m18549b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    /* renamed from: c */
    public static long m18550c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    /* renamed from: f */
    public static AbstractC6583h m18551f(InputStream inputStream) {
        return m18552g(inputStream, RecognitionOptions.AZTEC);
    }

    /* renamed from: g */
    public static AbstractC6583h m18552g(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? m18553h(C6633z.f14675d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    /* renamed from: h */
    public static AbstractC6583h m18553h(byte[] bArr) {
        return m18554i(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static AbstractC6583h m18554i(byte[] bArr, int i10, int i11) {
        return m18555j(bArr, i10, i11, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static AbstractC6583h m18555j(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.mo18566l(i11);
            return bVar;
        } catch (C6566b0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: A */
    public abstract String mo18556A();

    /* renamed from: B */
    public abstract int mo18557B();

    /* renamed from: C */
    public abstract int mo18558C();

    /* renamed from: D */
    public abstract long mo18559D();

    /* renamed from: E */
    public final int m18560E(int i10) {
        if (i10 >= 0) {
            int i11 = this.f14474c;
            this.f14474c = i10;
            return i11;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i10);
    }

    /* renamed from: F */
    public abstract boolean mo18561F(int i10);

    /* renamed from: a */
    public abstract void mo18562a(int i10);

    /* renamed from: d */
    public abstract int mo18563d();

    /* renamed from: e */
    public abstract boolean mo18564e();

    /* renamed from: k */
    public abstract void mo18565k(int i10);

    /* renamed from: l */
    public abstract int mo18566l(int i10);

    /* renamed from: m */
    public abstract boolean mo18567m();

    /* renamed from: n */
    public abstract AbstractC6580g mo18568n();

    /* renamed from: o */
    public abstract double mo18569o();

    /* renamed from: p */
    public abstract int mo18570p();

    /* renamed from: q */
    public abstract int mo18571q();

    /* renamed from: r */
    public abstract long mo18572r();

    /* renamed from: s */
    public abstract float mo18573s();

    /* renamed from: t */
    public abstract int mo18574t();

    /* renamed from: u */
    public abstract long mo18575u();

    /* renamed from: v */
    public abstract int mo18576v();

    /* renamed from: w */
    public abstract long mo18577w();

    /* renamed from: x */
    public abstract int mo18578x();

    /* renamed from: y */
    public abstract long mo18579y();

    /* renamed from: z */
    public abstract String mo18580z();
}
