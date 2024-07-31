package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.C5101a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.crypto.tink.shaded.protobuf.i */
/* loaded from: classes2.dex */
public abstract class AbstractC5973i {

    /* renamed from: f */
    private static volatile int f12606f = 100;

    /* renamed from: a */
    int f12607a;

    /* renamed from: b */
    int f12608b;

    /* renamed from: c */
    int f12609c;

    /* renamed from: d */
    C5976j f12610d;

    /* renamed from: e */
    private boolean f12611e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5973i {

        /* renamed from: g */
        private final byte[] f12612g;

        /* renamed from: h */
        private final boolean f12613h;

        /* renamed from: i */
        private int f12614i;

        /* renamed from: j */
        private int f12615j;

        /* renamed from: k */
        private int f12616k;

        /* renamed from: l */
        private int f12617l;

        /* renamed from: m */
        private int f12618m;

        /* renamed from: n */
        private boolean f12619n;

        /* renamed from: o */
        private int f12620o;

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f12620o = C5101a.e.API_PRIORITY_OTHER;
            this.f12612g = bArr;
            this.f12614i = i11 + i10;
            this.f12616k = i10;
            this.f12617l = i10;
            this.f12613h = z10;
        }

        /* renamed from: M */
        private void m15553M() {
            int i10 = this.f12614i + this.f12615j;
            this.f12614i = i10;
            int i11 = i10 - this.f12617l;
            int i12 = this.f12620o;
            if (i11 <= i12) {
                this.f12615j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f12615j = i13;
            this.f12614i = i10 - i13;
        }

        /* renamed from: P */
        private void m15554P() {
            if (this.f12614i - this.f12616k >= 10) {
                m15555Q();
            } else {
                m15556R();
            }
        }

        /* renamed from: Q */
        private void m15555Q() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f12612g;
                int i11 = this.f12616k;
                this.f12616k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C5953b0.m15327f();
        }

        /* renamed from: R */
        private void m15556R() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (m15557F() >= 0) {
                    return;
                }
            }
            throw C5953b0.m15327f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: A */
        public String mo15529A() {
            int m15561J = m15561J();
            if (m15561J > 0) {
                int i10 = this.f12614i;
                int i11 = this.f12616k;
                if (m15561J <= i10 - i11) {
                    String m16048e = C6005s1.m16048e(this.f12612g, i11, m15561J);
                    this.f12616k += m15561J;
                    return m16048e;
                }
            }
            if (m15561J == 0) {
                return "";
            }
            if (m15561J <= 0) {
                throw C5953b0.m15328g();
            }
            throw C5953b0.m15332m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: B */
        public int mo15530B() {
            if (mo15536e()) {
                this.f12618m = 0;
                return 0;
            }
            int m15561J = m15561J();
            this.f12618m = m15561J;
            if (C6008t1.m16092a(m15561J) != 0) {
                return this.f12618m;
            }
            throw C5953b0.m15324c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: C */
        public int mo15531C() {
            return m15561J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: D */
        public long mo15532D() {
            return m15562K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: E */
        public boolean mo15533E(int i10) {
            int m16093b = C6008t1.m16093b(i10);
            if (m16093b == 0) {
                m15554P();
                return true;
            }
            if (m16093b == 1) {
                m15565O(8);
                return true;
            }
            if (m16093b == 2) {
                m15565O(m15561J());
                return true;
            }
            if (m16093b == 3) {
                m15564N();
                mo15534a(C6008t1.m16094c(C6008t1.m16092a(i10), 4));
                return true;
            }
            if (m16093b == 4) {
                return false;
            }
            if (m16093b != 5) {
                throw C5953b0.m15326e();
            }
            m15565O(4);
            return true;
        }

        /* renamed from: F */
        public byte m15557F() {
            int i10 = this.f12616k;
            if (i10 == this.f12614i) {
                throw C5953b0.m15332m();
            }
            byte[] bArr = this.f12612g;
            this.f12616k = i10 + 1;
            return bArr[i10];
        }

        /* renamed from: G */
        public byte[] m15558G(int i10) {
            if (i10 > 0) {
                int i11 = this.f12614i;
                int i12 = this.f12616k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f12616k = i13;
                    return Arrays.copyOfRange(this.f12612g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw C5953b0.m15332m();
            }
            if (i10 == 0) {
                return C5950a0.f12552d;
            }
            throw C5953b0.m15328g();
        }

        /* renamed from: H */
        public int m15559H() {
            int i10 = this.f12616k;
            if (this.f12614i - i10 < 4) {
                throw C5953b0.m15332m();
            }
            byte[] bArr = this.f12612g;
            this.f12616k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        /* renamed from: I */
        public long m15560I() {
            int i10 = this.f12616k;
            if (this.f12614i - i10 < 8) {
                throw C5953b0.m15332m();
            }
            byte[] bArr = this.f12612g;
            this.f12616k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /* renamed from: J */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m15561J() {
            /*
                r5 = this;
                int r0 = r5.f12616k
                int r1 = r5.f12614i
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f12612g
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f12616k = r3
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
                long r0 = r5.m15563L()
                int r0 = (int) r0
                return r0
            L70:
                r5.f12616k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.AbstractC5973i.b.m15561J():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /* renamed from: K */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long m15562K() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.AbstractC5973i.b.m15562K():long");
        }

        /* renamed from: L */
        long m15563L() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((m15557F() & 128) == 0) {
                    return j10;
                }
            }
            throw C5953b0.m15327f();
        }

        /* renamed from: N */
        public void m15564N() {
            int mo15530B;
            do {
                mo15530B = mo15530B();
                if (mo15530B == 0) {
                    return;
                }
            } while (mo15533E(mo15530B));
        }

        /* renamed from: O */
        public void m15565O(int i10) {
            if (i10 >= 0) {
                int i11 = this.f12614i;
                int i12 = this.f12616k;
                if (i10 <= i11 - i12) {
                    this.f12616k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw C5953b0.m15332m();
            }
            throw C5953b0.m15328g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: a */
        public void mo15534a(int i10) {
            if (this.f12618m != i10) {
                throw C5953b0.m15323b();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: d */
        public int mo15535d() {
            return this.f12616k - this.f12617l;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: e */
        public boolean mo15536e() {
            return this.f12616k == this.f12614i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: k */
        public void mo15537k(int i10) {
            this.f12620o = i10;
            m15553M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: l */
        public int mo15538l(int i10) {
            if (i10 < 0) {
                throw C5953b0.m15328g();
            }
            int mo15535d = i10 + mo15535d();
            if (mo15535d < 0) {
                throw C5953b0.m15329h();
            }
            int i11 = this.f12620o;
            if (mo15535d > i11) {
                throw C5953b0.m15332m();
            }
            this.f12620o = mo15535d;
            m15553M();
            return i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: m */
        public boolean mo15539m() {
            return m15562K() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: n */
        public AbstractC5970h mo15540n() {
            int m15561J = m15561J();
            if (m15561J > 0) {
                int i10 = this.f12614i;
                int i11 = this.f12616k;
                if (m15561J <= i10 - i11) {
                    AbstractC5970h m15482E = (this.f12613h && this.f12619n) ? AbstractC5970h.m15482E(this.f12612g, i11, m15561J) : AbstractC5970h.m15487l(this.f12612g, i11, m15561J);
                    this.f12616k += m15561J;
                    return m15482E;
                }
            }
            return m15561J == 0 ? AbstractC5970h.f12591b : AbstractC5970h.m15481D(m15558G(m15561J));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: o */
        public double mo15541o() {
            return Double.longBitsToDouble(m15560I());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: p */
        public int mo15542p() {
            return m15561J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: q */
        public int mo15543q() {
            return m15559H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: r */
        public long mo15544r() {
            return m15560I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: s */
        public float mo15545s() {
            return Float.intBitsToFloat(m15559H());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: t */
        public int mo15546t() {
            return m15561J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: u */
        public long mo15547u() {
            return m15562K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: v */
        public int mo15548v() {
            return m15559H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: w */
        public long mo15549w() {
            return m15560I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: x */
        public int mo15550x() {
            return AbstractC5973i.m15522b(m15561J());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: y */
        public long mo15551y() {
            return AbstractC5973i.m15523c(m15562K());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: z */
        public String mo15552z() {
            int m15561J = m15561J();
            if (m15561J > 0) {
                int i10 = this.f12614i;
                int i11 = this.f12616k;
                if (m15561J <= i10 - i11) {
                    String str = new String(this.f12612g, i11, m15561J, C5950a0.f12550b);
                    this.f12616k += m15561J;
                    return str;
                }
            }
            if (m15561J == 0) {
                return "";
            }
            if (m15561J < 0) {
                throw C5953b0.m15328g();
            }
            throw C5953b0.m15332m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5973i {

        /* renamed from: g */
        private final InputStream f12621g;

        /* renamed from: h */
        private final byte[] f12622h;

        /* renamed from: i */
        private int f12623i;

        /* renamed from: j */
        private int f12624j;

        /* renamed from: k */
        private int f12625k;

        /* renamed from: l */
        private int f12626l;

        /* renamed from: m */
        private int f12627m;

        /* renamed from: n */
        private int f12628n;

        private c(InputStream inputStream, int i10) {
            super();
            this.f12628n = C5101a.e.API_PRIORITY_OTHER;
            C5950a0.m15303b(inputStream, "input");
            this.f12621g = inputStream;
            this.f12622h = new byte[i10];
            this.f12623i = 0;
            this.f12625k = 0;
            this.f12627m = 0;
        }

        /* renamed from: F */
        private static int m15566F(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (C5953b0 e10) {
                e10.m15334j();
                throw e10;
            }
        }

        /* renamed from: G */
        private static int m15567G(InputStream inputStream, byte[] bArr, int i10, int i11) {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (C5953b0 e10) {
                e10.m15334j();
                throw e10;
            }
        }

        /* renamed from: H */
        private AbstractC5970h m15568H(int i10) {
            byte[] m15570K = m15570K(i10);
            if (m15570K != null) {
                return AbstractC5970h.m15486k(m15570K);
            }
            int i11 = this.f12625k;
            int i12 = this.f12623i;
            int i13 = i12 - i11;
            this.f12627m += i12;
            this.f12625k = 0;
            this.f12623i = 0;
            List<byte[]> m15571L = m15571L(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f12622h, i11, bArr, 0, i13);
            for (byte[] bArr2 : m15571L) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return AbstractC5970h.m15481D(bArr);
        }

        /* renamed from: J */
        private byte[] m15569J(int i10, boolean z10) {
            byte[] m15570K = m15570K(i10);
            if (m15570K != null) {
                return z10 ? (byte[]) m15570K.clone() : m15570K;
            }
            int i11 = this.f12625k;
            int i12 = this.f12623i;
            int i13 = i12 - i11;
            this.f12627m += i12;
            this.f12625k = 0;
            this.f12623i = 0;
            List<byte[]> m15571L = m15571L(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f12622h, i11, bArr, 0, i13);
            for (byte[] bArr2 : m15571L) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: K */
        private byte[] m15570K(int i10) {
            if (i10 == 0) {
                return C5950a0.f12552d;
            }
            if (i10 < 0) {
                throw C5953b0.m15328g();
            }
            int i11 = this.f12627m;
            int i12 = this.f12625k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f12609c > 0) {
                throw C5953b0.m15331l();
            }
            int i14 = this.f12628n;
            if (i13 > i14) {
                m15587V((i14 - i11) - i12);
                throw C5953b0.m15332m();
            }
            int i15 = this.f12623i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > m15566F(this.f12621g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f12622h, this.f12625k, bArr, 0, i15);
            this.f12627m += this.f12623i;
            this.f12625k = 0;
            this.f12623i = 0;
            while (i15 < i10) {
                int m15567G = m15567G(this.f12621g, bArr, i15, i10 - i15);
                if (m15567G == -1) {
                    throw C5953b0.m15332m();
                }
                this.f12627m += m15567G;
                i15 += m15567G;
            }
            return bArr;
        }

        /* renamed from: L */
        private List<byte[]> m15571L(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, RecognitionOptions.AZTEC);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f12621g.read(bArr, i11, min - i11);
                    if (read == -1) {
                        throw C5953b0.m15332m();
                    }
                    this.f12627m += read;
                    i11 += read;
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: R */
        private void m15572R() {
            int i10 = this.f12623i + this.f12624j;
            this.f12623i = i10;
            int i11 = this.f12627m + i10;
            int i12 = this.f12628n;
            if (i11 <= i12) {
                this.f12624j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f12624j = i13;
            this.f12623i = i10 - i13;
        }

        /* renamed from: S */
        private void m15573S(int i10) {
            if (m15579a0(i10)) {
                return;
            }
            if (i10 <= (this.f12609c - this.f12627m) - this.f12625k) {
                throw C5953b0.m15332m();
            }
            throw C5953b0.m15331l();
        }

        /* renamed from: T */
        private static long m15574T(InputStream inputStream, long j10) {
            try {
                return inputStream.skip(j10);
            } catch (C5953b0 e10) {
                e10.m15334j();
                throw e10;
            }
        }

        /* renamed from: W */
        private void m15575W(int i10) {
            if (i10 < 0) {
                throw C5953b0.m15328g();
            }
            int i11 = this.f12627m;
            int i12 = this.f12625k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f12628n;
            if (i13 > i14) {
                m15587V((i14 - i11) - i12);
                throw C5953b0.m15332m();
            }
            this.f12627m = i11 + i12;
            int i15 = this.f12623i - i12;
            this.f12623i = 0;
            this.f12625k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long m15574T = m15574T(this.f12621g, j10);
                    if (m15574T < 0 || m15574T > j10) {
                        throw new IllegalStateException(this.f12621g.getClass() + "#skip returned invalid result: " + m15574T + "\nThe InputStream implementation is buggy.");
                    }
                    if (m15574T == 0) {
                        break;
                    } else {
                        i15 += (int) m15574T;
                    }
                } finally {
                    this.f12627m += i15;
                    m15572R();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f12623i;
            int i17 = i16 - this.f12625k;
            this.f12625k = i16;
            while (true) {
                m15573S(1);
                int i18 = i10 - i17;
                int i19 = this.f12623i;
                if (i18 <= i19) {
                    this.f12625k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f12625k = i19;
                }
            }
        }

        /* renamed from: X */
        private void m15576X() {
            if (this.f12623i - this.f12625k >= 10) {
                m15577Y();
            } else {
                m15578Z();
            }
        }

        /* renamed from: Y */
        private void m15577Y() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f12622h;
                int i11 = this.f12625k;
                this.f12625k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C5953b0.m15327f();
        }

        /* renamed from: Z */
        private void m15578Z() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (m15580I() >= 0) {
                    return;
                }
            }
            throw C5953b0.m15327f();
        }

        /* renamed from: a0 */
        private boolean m15579a0(int i10) {
            int i11 = this.f12625k;
            int i12 = i11 + i10;
            int i13 = this.f12623i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f12609c;
            int i15 = this.f12627m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f12628n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f12622h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f12627m += i11;
                this.f12623i -= i11;
                this.f12625k = 0;
            }
            InputStream inputStream = this.f12621g;
            byte[] bArr2 = this.f12622h;
            int i16 = this.f12623i;
            int m15567G = m15567G(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f12609c - this.f12627m) - i16));
            if (m15567G == 0 || m15567G < -1 || m15567G > this.f12622h.length) {
                throw new IllegalStateException(this.f12621g.getClass() + "#read(byte[]) returned invalid result: " + m15567G + "\nThe InputStream implementation is buggy.");
            }
            if (m15567G <= 0) {
                return false;
            }
            this.f12623i += m15567G;
            m15572R();
            if (this.f12623i >= i10) {
                return true;
            }
            return m15579a0(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: A */
        public String mo15529A() {
            byte[] m15569J;
            int i10;
            int m15583O = m15583O();
            int i11 = this.f12625k;
            int i12 = this.f12623i;
            if (m15583O <= i12 - i11 && m15583O > 0) {
                m15569J = this.f12622h;
                i10 = i11 + m15583O;
            } else {
                if (m15583O == 0) {
                    return "";
                }
                i11 = 0;
                if (m15583O > i12) {
                    m15569J = m15569J(m15583O, false);
                    return C6005s1.m16048e(m15569J, i11, m15583O);
                }
                m15573S(m15583O);
                m15569J = this.f12622h;
                i10 = m15583O + 0;
            }
            this.f12625k = i10;
            return C6005s1.m16048e(m15569J, i11, m15583O);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: B */
        public int mo15530B() {
            if (mo15536e()) {
                this.f12626l = 0;
                return 0;
            }
            int m15583O = m15583O();
            this.f12626l = m15583O;
            if (C6008t1.m16092a(m15583O) != 0) {
                return this.f12626l;
            }
            throw C5953b0.m15324c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: C */
        public int mo15531C() {
            return m15583O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: D */
        public long mo15532D() {
            return m15584P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: E */
        public boolean mo15533E(int i10) {
            int m16093b = C6008t1.m16093b(i10);
            if (m16093b == 0) {
                m15576X();
                return true;
            }
            if (m16093b == 1) {
                m15587V(8);
                return true;
            }
            if (m16093b == 2) {
                m15587V(m15583O());
                return true;
            }
            if (m16093b == 3) {
                m15586U();
                mo15534a(C6008t1.m16094c(C6008t1.m16092a(i10), 4));
                return true;
            }
            if (m16093b == 4) {
                return false;
            }
            if (m16093b != 5) {
                throw C5953b0.m15326e();
            }
            m15587V(4);
            return true;
        }

        /* renamed from: I */
        public byte m15580I() {
            if (this.f12625k == this.f12623i) {
                m15573S(1);
            }
            byte[] bArr = this.f12622h;
            int i10 = this.f12625k;
            this.f12625k = i10 + 1;
            return bArr[i10];
        }

        /* renamed from: M */
        public int m15581M() {
            int i10 = this.f12625k;
            if (this.f12623i - i10 < 4) {
                m15573S(4);
                i10 = this.f12625k;
            }
            byte[] bArr = this.f12622h;
            this.f12625k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        /* renamed from: N */
        public long m15582N() {
            int i10 = this.f12625k;
            if (this.f12623i - i10 < 8) {
                m15573S(8);
                i10 = this.f12625k;
            }
            byte[] bArr = this.f12622h;
            this.f12625k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /* renamed from: O */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m15583O() {
            /*
                r5 = this;
                int r0 = r5.f12625k
                int r1 = r5.f12623i
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f12622h
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f12625k = r3
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
                long r0 = r5.m15585Q()
                int r0 = (int) r0
                return r0
            L70:
                r5.f12625k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.AbstractC5973i.c.m15583O():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /* renamed from: P */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long m15584P() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.AbstractC5973i.c.m15584P():long");
        }

        /* renamed from: Q */
        long m15585Q() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((m15580I() & 128) == 0) {
                    return j10;
                }
            }
            throw C5953b0.m15327f();
        }

        /* renamed from: U */
        public void m15586U() {
            int mo15530B;
            do {
                mo15530B = mo15530B();
                if (mo15530B == 0) {
                    return;
                }
            } while (mo15533E(mo15530B));
        }

        /* renamed from: V */
        public void m15587V(int i10) {
            int i11 = this.f12623i;
            int i12 = this.f12625k;
            if (i10 > i11 - i12 || i10 < 0) {
                m15575W(i10);
            } else {
                this.f12625k = i12 + i10;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: a */
        public void mo15534a(int i10) {
            if (this.f12626l != i10) {
                throw C5953b0.m15323b();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: d */
        public int mo15535d() {
            return this.f12627m + this.f12625k;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: e */
        public boolean mo15536e() {
            return this.f12625k == this.f12623i && !m15579a0(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: k */
        public void mo15537k(int i10) {
            this.f12628n = i10;
            m15572R();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: l */
        public int mo15538l(int i10) {
            if (i10 < 0) {
                throw C5953b0.m15328g();
            }
            int i11 = i10 + this.f12627m + this.f12625k;
            int i12 = this.f12628n;
            if (i11 > i12) {
                throw C5953b0.m15332m();
            }
            this.f12628n = i11;
            m15572R();
            return i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: m */
        public boolean mo15539m() {
            return m15584P() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: n */
        public AbstractC5970h mo15540n() {
            int m15583O = m15583O();
            int i10 = this.f12623i;
            int i11 = this.f12625k;
            if (m15583O > i10 - i11 || m15583O <= 0) {
                return m15583O == 0 ? AbstractC5970h.f12591b : m15568H(m15583O);
            }
            AbstractC5970h m15487l = AbstractC5970h.m15487l(this.f12622h, i11, m15583O);
            this.f12625k += m15583O;
            return m15487l;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: o */
        public double mo15541o() {
            return Double.longBitsToDouble(m15582N());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: p */
        public int mo15542p() {
            return m15583O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: q */
        public int mo15543q() {
            return m15581M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: r */
        public long mo15544r() {
            return m15582N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: s */
        public float mo15545s() {
            return Float.intBitsToFloat(m15581M());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: t */
        public int mo15546t() {
            return m15583O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: u */
        public long mo15547u() {
            return m15584P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: v */
        public int mo15548v() {
            return m15581M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: w */
        public long mo15549w() {
            return m15582N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: x */
        public int mo15550x() {
            return AbstractC5973i.m15522b(m15583O());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: y */
        public long mo15551y() {
            return AbstractC5973i.m15523c(m15584P());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5973i
        /* renamed from: z */
        public String mo15552z() {
            int m15583O = m15583O();
            if (m15583O > 0) {
                int i10 = this.f12623i;
                int i11 = this.f12625k;
                if (m15583O <= i10 - i11) {
                    String str = new String(this.f12622h, i11, m15583O, C5950a0.f12550b);
                    this.f12625k += m15583O;
                    return str;
                }
            }
            if (m15583O == 0) {
                return "";
            }
            if (m15583O > this.f12623i) {
                return new String(m15569J(m15583O, false), C5950a0.f12550b);
            }
            m15573S(m15583O);
            String str2 = new String(this.f12622h, this.f12625k, m15583O, C5950a0.f12550b);
            this.f12625k += m15583O;
            return str2;
        }
    }

    private AbstractC5973i() {
        this.f12608b = f12606f;
        this.f12609c = C5101a.e.API_PRIORITY_OTHER;
        this.f12611e = false;
    }

    /* renamed from: b */
    public static int m15522b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    /* renamed from: c */
    public static long m15523c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    /* renamed from: f */
    public static AbstractC5973i m15524f(InputStream inputStream) {
        return m15525g(inputStream, RecognitionOptions.AZTEC);
    }

    /* renamed from: g */
    public static AbstractC5973i m15525g(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? m15526h(C5950a0.f12552d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    /* renamed from: h */
    public static AbstractC5973i m15526h(byte[] bArr) {
        return m15527i(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static AbstractC5973i m15527i(byte[] bArr, int i10, int i11) {
        return m15528j(bArr, i10, i11, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static AbstractC5973i m15528j(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.mo15538l(i11);
            return bVar;
        } catch (C5953b0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: A */
    public abstract String mo15529A();

    /* renamed from: B */
    public abstract int mo15530B();

    /* renamed from: C */
    public abstract int mo15531C();

    /* renamed from: D */
    public abstract long mo15532D();

    /* renamed from: E */
    public abstract boolean mo15533E(int i10);

    /* renamed from: a */
    public abstract void mo15534a(int i10);

    /* renamed from: d */
    public abstract int mo15535d();

    /* renamed from: e */
    public abstract boolean mo15536e();

    /* renamed from: k */
    public abstract void mo15537k(int i10);

    /* renamed from: l */
    public abstract int mo15538l(int i10);

    /* renamed from: m */
    public abstract boolean mo15539m();

    /* renamed from: n */
    public abstract AbstractC5970h mo15540n();

    /* renamed from: o */
    public abstract double mo15541o();

    /* renamed from: p */
    public abstract int mo15542p();

    /* renamed from: q */
    public abstract int mo15543q();

    /* renamed from: r */
    public abstract long mo15544r();

    /* renamed from: s */
    public abstract float mo15545s();

    /* renamed from: t */
    public abstract int mo15546t();

    /* renamed from: u */
    public abstract long mo15547u();

    /* renamed from: v */
    public abstract int mo15548v();

    /* renamed from: w */
    public abstract long mo15549w();

    /* renamed from: x */
    public abstract int mo15550x();

    /* renamed from: y */
    public abstract long mo15551y();

    /* renamed from: z */
    public abstract String mo15552z();
}
