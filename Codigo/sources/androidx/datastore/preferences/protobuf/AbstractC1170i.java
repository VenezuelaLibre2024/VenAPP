package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.C5101a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.i */
/* loaded from: classes.dex */
public abstract class AbstractC1170i {

    /* renamed from: a */
    int f4846a;

    /* renamed from: b */
    int f4847b;

    /* renamed from: c */
    int f4848c;

    /* renamed from: d */
    C1173j f4849d;

    /* renamed from: e */
    private boolean f4850e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.i$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1170i {

        /* renamed from: f */
        private final byte[] f4851f;

        /* renamed from: g */
        private final boolean f4852g;

        /* renamed from: h */
        private int f4853h;

        /* renamed from: i */
        private int f4854i;

        /* renamed from: j */
        private int f4855j;

        /* renamed from: k */
        private int f4856k;

        /* renamed from: l */
        private int f4857l;

        /* renamed from: m */
        private boolean f4858m;

        /* renamed from: n */
        private int f4859n;

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f4859n = C5101a.e.API_PRIORITY_OTHER;
            this.f4851f = bArr;
            this.f4853h = i11 + i10;
            this.f4855j = i10;
            this.f4856k = i10;
            this.f4852g = z10;
        }

        /* renamed from: M */
        private void m5873M() {
            int i10 = this.f4853h + this.f4854i;
            this.f4853h = i10;
            int i11 = i10 - this.f4856k;
            int i12 = this.f4859n;
            if (i11 <= i12) {
                this.f4854i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f4854i = i13;
            this.f4853h = i10 - i13;
        }

        /* renamed from: P */
        private void m5874P() {
            if (this.f4853h - this.f4855j >= 10) {
                m5875Q();
            } else {
                m5876R();
            }
        }

        /* renamed from: Q */
        private void m5875Q() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f4851f;
                int i11 = this.f4855j;
                this.f4855j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C1150b0.m5668e();
        }

        /* renamed from: R */
        private void m5876R() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (m5877F() >= 0) {
                    return;
                }
            }
            throw C1150b0.m5668e();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: A */
        public String mo5849A() {
            int m5881J = m5881J();
            if (m5881J > 0) {
                int i10 = this.f4853h;
                int i11 = this.f4855j;
                if (m5881J <= i10 - i11) {
                    String m6383e = C1202s1.m6383e(this.f4851f, i11, m5881J);
                    this.f4855j += m5881J;
                    return m6383e;
                }
            }
            if (m5881J == 0) {
                return "";
            }
            if (m5881J <= 0) {
                throw C1150b0.m5669f();
            }
            throw C1150b0.m5673k();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: B */
        public int mo5850B() {
            if (mo5856e()) {
                this.f4857l = 0;
                return 0;
            }
            int m5881J = m5881J();
            this.f4857l = m5881J;
            if (C1205t1.m6426a(m5881J) != 0) {
                return this.f4857l;
            }
            throw C1150b0.m5665b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: C */
        public int mo5851C() {
            return m5881J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: D */
        public long mo5852D() {
            return m5882K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: E */
        public boolean mo5853E(int i10) {
            int m6427b = C1205t1.m6427b(i10);
            if (m6427b == 0) {
                m5874P();
                return true;
            }
            if (m6427b == 1) {
                m5885O(8);
                return true;
            }
            if (m6427b == 2) {
                m5885O(m5881J());
                return true;
            }
            if (m6427b == 3) {
                m5884N();
                mo5854a(C1205t1.m6428c(C1205t1.m6426a(i10), 4));
                return true;
            }
            if (m6427b == 4) {
                return false;
            }
            if (m6427b != 5) {
                throw C1150b0.m5667d();
            }
            m5885O(4);
            return true;
        }

        /* renamed from: F */
        public byte m5877F() {
            int i10 = this.f4855j;
            if (i10 == this.f4853h) {
                throw C1150b0.m5673k();
            }
            byte[] bArr = this.f4851f;
            this.f4855j = i10 + 1;
            return bArr[i10];
        }

        /* renamed from: G */
        public byte[] m5878G(int i10) {
            if (i10 > 0) {
                int i11 = this.f4853h;
                int i12 = this.f4855j;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f4855j = i13;
                    return Arrays.copyOfRange(this.f4851f, i12, i13);
                }
            }
            if (i10 > 0) {
                throw C1150b0.m5673k();
            }
            if (i10 == 0) {
                return C1147a0.f4791c;
            }
            throw C1150b0.m5669f();
        }

        /* renamed from: H */
        public int m5879H() {
            int i10 = this.f4855j;
            if (this.f4853h - i10 < 4) {
                throw C1150b0.m5673k();
            }
            byte[] bArr = this.f4851f;
            this.f4855j = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        /* renamed from: I */
        public long m5880I() {
            int i10 = this.f4855j;
            if (this.f4853h - i10 < 8) {
                throw C1150b0.m5673k();
            }
            byte[] bArr = this.f4851f;
            this.f4855j = i10 + 8;
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
        public int m5881J() {
            /*
                r5 = this;
                int r0 = r5.f4855j
                int r1 = r5.f4853h
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f4851f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f4855j = r3
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
                long r0 = r5.m5883L()
                int r0 = (int) r0
                return r0
            L70:
                r5.f4855j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC1170i.b.m5881J():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /* renamed from: K */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long m5882K() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC1170i.b.m5882K():long");
        }

        /* renamed from: L */
        long m5883L() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((m5877F() & 128) == 0) {
                    return j10;
                }
            }
            throw C1150b0.m5668e();
        }

        /* renamed from: N */
        public void m5884N() {
            int mo5850B;
            do {
                mo5850B = mo5850B();
                if (mo5850B == 0) {
                    return;
                }
            } while (mo5853E(mo5850B));
        }

        /* renamed from: O */
        public void m5885O(int i10) {
            if (i10 >= 0) {
                int i11 = this.f4853h;
                int i12 = this.f4855j;
                if (i10 <= i11 - i12) {
                    this.f4855j = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw C1150b0.m5673k();
            }
            throw C1150b0.m5669f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: a */
        public void mo5854a(int i10) {
            if (this.f4857l != i10) {
                throw C1150b0.m5664a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: d */
        public int mo5855d() {
            return this.f4855j - this.f4856k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: e */
        public boolean mo5856e() {
            return this.f4855j == this.f4853h;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: k */
        public void mo5857k(int i10) {
            this.f4859n = i10;
            m5873M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: l */
        public int mo5858l(int i10) {
            if (i10 < 0) {
                throw C1150b0.m5669f();
            }
            int mo5855d = i10 + mo5855d();
            int i11 = this.f4859n;
            if (mo5855d > i11) {
                throw C1150b0.m5673k();
            }
            this.f4859n = mo5855d;
            m5873M();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: m */
        public boolean mo5859m() {
            return m5882K() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: n */
        public AbstractC1167h mo5860n() {
            int m5881J = m5881J();
            if (m5881J > 0) {
                int i10 = this.f4853h;
                int i11 = this.f4855j;
                if (m5881J <= i10 - i11) {
                    AbstractC1167h m5802D = (this.f4852g && this.f4858m) ? AbstractC1167h.m5802D(this.f4851f, i11, m5881J) : AbstractC1167h.m5807l(this.f4851f, i11, m5881J);
                    this.f4855j += m5881J;
                    return m5802D;
                }
            }
            return m5881J == 0 ? AbstractC1167h.f4831b : AbstractC1167h.m5801C(m5878G(m5881J));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: o */
        public double mo5861o() {
            return Double.longBitsToDouble(m5880I());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: p */
        public int mo5862p() {
            return m5881J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: q */
        public int mo5863q() {
            return m5879H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: r */
        public long mo5864r() {
            return m5880I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: s */
        public float mo5865s() {
            return Float.intBitsToFloat(m5879H());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: t */
        public int mo5866t() {
            return m5881J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: u */
        public long mo5867u() {
            return m5882K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: v */
        public int mo5868v() {
            return m5879H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: w */
        public long mo5869w() {
            return m5880I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: x */
        public int mo5870x() {
            return AbstractC1170i.m5842b(m5881J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: y */
        public long mo5871y() {
            return AbstractC1170i.m5843c(m5882K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: z */
        public String mo5872z() {
            int m5881J = m5881J();
            if (m5881J > 0) {
                int i10 = this.f4853h;
                int i11 = this.f4855j;
                if (m5881J <= i10 - i11) {
                    String str = new String(this.f4851f, i11, m5881J, C1147a0.f4789a);
                    this.f4855j += m5881J;
                    return str;
                }
            }
            if (m5881J == 0) {
                return "";
            }
            if (m5881J < 0) {
                throw C1150b0.m5669f();
            }
            throw C1150b0.m5673k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.i$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC1170i {

        /* renamed from: f */
        private final InputStream f4860f;

        /* renamed from: g */
        private final byte[] f4861g;

        /* renamed from: h */
        private int f4862h;

        /* renamed from: i */
        private int f4863i;

        /* renamed from: j */
        private int f4864j;

        /* renamed from: k */
        private int f4865k;

        /* renamed from: l */
        private int f4866l;

        /* renamed from: m */
        private int f4867m;

        private c(InputStream inputStream, int i10) {
            super();
            this.f4867m = C5101a.e.API_PRIORITY_OTHER;
            C1147a0.m5644b(inputStream, "input");
            this.f4860f = inputStream;
            this.f4861g = new byte[i10];
            this.f4862h = 0;
            this.f4864j = 0;
            this.f4866l = 0;
        }

        /* renamed from: F */
        private AbstractC1167h m5886F(int i10) {
            byte[] m5888I = m5888I(i10);
            if (m5888I != null) {
                return AbstractC1167h.m5806k(m5888I);
            }
            int i11 = this.f4864j;
            int i12 = this.f4862h;
            int i13 = i12 - i11;
            this.f4866l += i12;
            this.f4864j = 0;
            this.f4862h = 0;
            List<byte[]> m5889J = m5889J(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f4861g, i11, bArr, 0, i13);
            for (byte[] bArr2 : m5889J) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return AbstractC1167h.m5801C(bArr);
        }

        /* renamed from: H */
        private byte[] m5887H(int i10, boolean z10) {
            byte[] m5888I = m5888I(i10);
            if (m5888I != null) {
                return z10 ? (byte[]) m5888I.clone() : m5888I;
            }
            int i11 = this.f4864j;
            int i12 = this.f4862h;
            int i13 = i12 - i11;
            this.f4866l += i12;
            this.f4864j = 0;
            this.f4862h = 0;
            List<byte[]> m5889J = m5889J(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f4861g, i11, bArr, 0, i13);
            for (byte[] bArr2 : m5889J) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: I */
        private byte[] m5888I(int i10) {
            if (i10 == 0) {
                return C1147a0.f4791c;
            }
            if (i10 < 0) {
                throw C1150b0.m5669f();
            }
            int i11 = this.f4866l;
            int i12 = this.f4864j;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f4848c > 0) {
                throw C1150b0.m5672j();
            }
            int i14 = this.f4867m;
            if (i13 > i14) {
                m5904S((i14 - i11) - i12);
                throw C1150b0.m5673k();
            }
            int i15 = this.f4862h - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > this.f4860f.available()) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f4861g, this.f4864j, bArr, 0, i15);
            this.f4866l += this.f4862h;
            this.f4864j = 0;
            this.f4862h = 0;
            while (i15 < i10) {
                int read = this.f4860f.read(bArr, i15, i10 - i15);
                if (read == -1) {
                    throw C1150b0.m5673k();
                }
                this.f4866l += read;
                i15 += read;
            }
            return bArr;
        }

        /* renamed from: J */
        private List<byte[]> m5889J(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, RecognitionOptions.AZTEC);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f4860f.read(bArr, i11, min - i11);
                    if (read == -1) {
                        throw C1150b0.m5673k();
                    }
                    this.f4866l += read;
                    i11 += read;
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: P */
        private void m5890P() {
            int i10 = this.f4862h + this.f4863i;
            this.f4862h = i10;
            int i11 = this.f4866l + i10;
            int i12 = this.f4867m;
            if (i11 <= i12) {
                this.f4863i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f4863i = i13;
            this.f4862h = i10 - i13;
        }

        /* renamed from: Q */
        private void m5891Q(int i10) {
            if (m5896X(i10)) {
                return;
            }
            if (i10 <= (this.f4848c - this.f4866l) - this.f4864j) {
                throw C1150b0.m5673k();
            }
            throw C1150b0.m5672j();
        }

        /* renamed from: T */
        private void m5892T(int i10) {
            if (i10 < 0) {
                throw C1150b0.m5669f();
            }
            int i11 = this.f4866l;
            int i12 = this.f4864j;
            int i13 = i11 + i12 + i10;
            int i14 = this.f4867m;
            if (i13 > i14) {
                m5904S((i14 - i11) - i12);
                throw C1150b0.m5673k();
            }
            this.f4866l = i11 + i12;
            int i15 = this.f4862h - i12;
            this.f4862h = 0;
            this.f4864j = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long skip = this.f4860f.skip(j10);
                    if (skip < 0 || skip > j10) {
                        throw new IllegalStateException(this.f4860f.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i15 += (int) skip;
                    }
                } finally {
                    this.f4866l += i15;
                    m5890P();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f4862h;
            int i17 = i16 - this.f4864j;
            this.f4864j = i16;
            while (true) {
                m5891Q(1);
                int i18 = i10 - i17;
                int i19 = this.f4862h;
                if (i18 <= i19) {
                    this.f4864j = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f4864j = i19;
                }
            }
        }

        /* renamed from: U */
        private void m5893U() {
            if (this.f4862h - this.f4864j >= 10) {
                m5894V();
            } else {
                m5895W();
            }
        }

        /* renamed from: V */
        private void m5894V() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f4861g;
                int i11 = this.f4864j;
                this.f4864j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C1150b0.m5668e();
        }

        /* renamed from: W */
        private void m5895W() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (m5897G() >= 0) {
                    return;
                }
            }
            throw C1150b0.m5668e();
        }

        /* renamed from: X */
        private boolean m5896X(int i10) {
            int i11 = this.f4864j;
            int i12 = i11 + i10;
            int i13 = this.f4862h;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f4848c;
            int i15 = this.f4866l;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f4867m) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f4861g;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f4866l += i11;
                this.f4862h -= i11;
                this.f4864j = 0;
            }
            InputStream inputStream = this.f4860f;
            byte[] bArr2 = this.f4861g;
            int i16 = this.f4862h;
            int read = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f4848c - this.f4866l) - i16));
            if (read == 0 || read < -1 || read > this.f4861g.length) {
                throw new IllegalStateException(this.f4860f.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f4862h += read;
            m5890P();
            if (this.f4862h >= i10) {
                return true;
            }
            return m5896X(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: A */
        public String mo5849A() {
            byte[] m5887H;
            int i10;
            int m5900M = m5900M();
            int i11 = this.f4864j;
            int i12 = this.f4862h;
            if (m5900M <= i12 - i11 && m5900M > 0) {
                m5887H = this.f4861g;
                i10 = i11 + m5900M;
            } else {
                if (m5900M == 0) {
                    return "";
                }
                i11 = 0;
                if (m5900M > i12) {
                    m5887H = m5887H(m5900M, false);
                    return C1202s1.m6383e(m5887H, i11, m5900M);
                }
                m5891Q(m5900M);
                m5887H = this.f4861g;
                i10 = m5900M + 0;
            }
            this.f4864j = i10;
            return C1202s1.m6383e(m5887H, i11, m5900M);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: B */
        public int mo5850B() {
            if (mo5856e()) {
                this.f4865k = 0;
                return 0;
            }
            int m5900M = m5900M();
            this.f4865k = m5900M;
            if (C1205t1.m6426a(m5900M) != 0) {
                return this.f4865k;
            }
            throw C1150b0.m5665b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: C */
        public int mo5851C() {
            return m5900M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: D */
        public long mo5852D() {
            return m5901N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: E */
        public boolean mo5853E(int i10) {
            int m6427b = C1205t1.m6427b(i10);
            if (m6427b == 0) {
                m5893U();
                return true;
            }
            if (m6427b == 1) {
                m5904S(8);
                return true;
            }
            if (m6427b == 2) {
                m5904S(m5900M());
                return true;
            }
            if (m6427b == 3) {
                m5903R();
                mo5854a(C1205t1.m6428c(C1205t1.m6426a(i10), 4));
                return true;
            }
            if (m6427b == 4) {
                return false;
            }
            if (m6427b != 5) {
                throw C1150b0.m5667d();
            }
            m5904S(4);
            return true;
        }

        /* renamed from: G */
        public byte m5897G() {
            if (this.f4864j == this.f4862h) {
                m5891Q(1);
            }
            byte[] bArr = this.f4861g;
            int i10 = this.f4864j;
            this.f4864j = i10 + 1;
            return bArr[i10];
        }

        /* renamed from: K */
        public int m5898K() {
            int i10 = this.f4864j;
            if (this.f4862h - i10 < 4) {
                m5891Q(4);
                i10 = this.f4864j;
            }
            byte[] bArr = this.f4861g;
            this.f4864j = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        /* renamed from: L */
        public long m5899L() {
            int i10 = this.f4864j;
            if (this.f4862h - i10 < 8) {
                m5891Q(8);
                i10 = this.f4864j;
            }
            byte[] bArr = this.f4861g;
            this.f4864j = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /* renamed from: M */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m5900M() {
            /*
                r5 = this;
                int r0 = r5.f4864j
                int r1 = r5.f4862h
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f4861g
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f4864j = r3
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
                long r0 = r5.m5902O()
                int r0 = (int) r0
                return r0
            L70:
                r5.f4864j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC1170i.c.m5900M():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /* renamed from: N */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long m5901N() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC1170i.c.m5901N():long");
        }

        /* renamed from: O */
        long m5902O() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((m5897G() & 128) == 0) {
                    return j10;
                }
            }
            throw C1150b0.m5668e();
        }

        /* renamed from: R */
        public void m5903R() {
            int mo5850B;
            do {
                mo5850B = mo5850B();
                if (mo5850B == 0) {
                    return;
                }
            } while (mo5853E(mo5850B));
        }

        /* renamed from: S */
        public void m5904S(int i10) {
            int i11 = this.f4862h;
            int i12 = this.f4864j;
            if (i10 > i11 - i12 || i10 < 0) {
                m5892T(i10);
            } else {
                this.f4864j = i12 + i10;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: a */
        public void mo5854a(int i10) {
            if (this.f4865k != i10) {
                throw C1150b0.m5664a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: d */
        public int mo5855d() {
            return this.f4866l + this.f4864j;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: e */
        public boolean mo5856e() {
            return this.f4864j == this.f4862h && !m5896X(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: k */
        public void mo5857k(int i10) {
            this.f4867m = i10;
            m5890P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: l */
        public int mo5858l(int i10) {
            if (i10 < 0) {
                throw C1150b0.m5669f();
            }
            int i11 = i10 + this.f4866l + this.f4864j;
            int i12 = this.f4867m;
            if (i11 > i12) {
                throw C1150b0.m5673k();
            }
            this.f4867m = i11;
            m5890P();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: m */
        public boolean mo5859m() {
            return m5901N() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: n */
        public AbstractC1167h mo5860n() {
            int m5900M = m5900M();
            int i10 = this.f4862h;
            int i11 = this.f4864j;
            if (m5900M > i10 - i11 || m5900M <= 0) {
                return m5900M == 0 ? AbstractC1167h.f4831b : m5886F(m5900M);
            }
            AbstractC1167h m5807l = AbstractC1167h.m5807l(this.f4861g, i11, m5900M);
            this.f4864j += m5900M;
            return m5807l;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: o */
        public double mo5861o() {
            return Double.longBitsToDouble(m5899L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: p */
        public int mo5862p() {
            return m5900M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: q */
        public int mo5863q() {
            return m5898K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: r */
        public long mo5864r() {
            return m5899L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: s */
        public float mo5865s() {
            return Float.intBitsToFloat(m5898K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: t */
        public int mo5866t() {
            return m5900M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: u */
        public long mo5867u() {
            return m5901N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: v */
        public int mo5868v() {
            return m5898K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: w */
        public long mo5869w() {
            return m5899L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: x */
        public int mo5870x() {
            return AbstractC1170i.m5842b(m5900M());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: y */
        public long mo5871y() {
            return AbstractC1170i.m5843c(m5901N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1170i
        /* renamed from: z */
        public String mo5872z() {
            int m5900M = m5900M();
            if (m5900M > 0) {
                int i10 = this.f4862h;
                int i11 = this.f4864j;
                if (m5900M <= i10 - i11) {
                    String str = new String(this.f4861g, i11, m5900M, C1147a0.f4789a);
                    this.f4864j += m5900M;
                    return str;
                }
            }
            if (m5900M == 0) {
                return "";
            }
            if (m5900M > this.f4862h) {
                return new String(m5887H(m5900M, false), C1147a0.f4789a);
            }
            m5891Q(m5900M);
            String str2 = new String(this.f4861g, this.f4864j, m5900M, C1147a0.f4789a);
            this.f4864j += m5900M;
            return str2;
        }
    }

    private AbstractC1170i() {
        this.f4847b = 100;
        this.f4848c = C5101a.e.API_PRIORITY_OTHER;
        this.f4850e = false;
    }

    /* renamed from: b */
    public static int m5842b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    /* renamed from: c */
    public static long m5843c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    /* renamed from: f */
    public static AbstractC1170i m5844f(InputStream inputStream) {
        return m5845g(inputStream, RecognitionOptions.AZTEC);
    }

    /* renamed from: g */
    public static AbstractC1170i m5845g(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? m5846h(C1147a0.f4791c) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    /* renamed from: h */
    public static AbstractC1170i m5846h(byte[] bArr) {
        return m5847i(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static AbstractC1170i m5847i(byte[] bArr, int i10, int i11) {
        return m5848j(bArr, i10, i11, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static AbstractC1170i m5848j(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.mo5858l(i11);
            return bVar;
        } catch (C1150b0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: A */
    public abstract String mo5849A();

    /* renamed from: B */
    public abstract int mo5850B();

    /* renamed from: C */
    public abstract int mo5851C();

    /* renamed from: D */
    public abstract long mo5852D();

    /* renamed from: E */
    public abstract boolean mo5853E(int i10);

    /* renamed from: a */
    public abstract void mo5854a(int i10);

    /* renamed from: d */
    public abstract int mo5855d();

    /* renamed from: e */
    public abstract boolean mo5856e();

    /* renamed from: k */
    public abstract void mo5857k(int i10);

    /* renamed from: l */
    public abstract int mo5858l(int i10);

    /* renamed from: m */
    public abstract boolean mo5859m();

    /* renamed from: n */
    public abstract AbstractC1167h mo5860n();

    /* renamed from: o */
    public abstract double mo5861o();

    /* renamed from: p */
    public abstract int mo5862p();

    /* renamed from: q */
    public abstract int mo5863q();

    /* renamed from: r */
    public abstract long mo5864r();

    /* renamed from: s */
    public abstract float mo5865s();

    /* renamed from: t */
    public abstract int mo5866t();

    /* renamed from: u */
    public abstract long mo5867u();

    /* renamed from: v */
    public abstract int mo5868v();

    /* renamed from: w */
    public abstract long mo5869w();

    /* renamed from: x */
    public abstract int mo5870x();

    /* renamed from: y */
    public abstract long mo5871y();

    /* renamed from: z */
    public abstract String mo5872z();
}
