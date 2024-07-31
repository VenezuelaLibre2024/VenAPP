package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: f */
    private static volatile int f13197f = 100;

    /* renamed from: a */
    int f13198a;

    /* renamed from: b */
    int f13199b;

    /* renamed from: c */
    int f13200c;

    /* renamed from: d */
    i f13201d;

    /* renamed from: e */
    private boolean f13202e;

    /* loaded from: classes2.dex */
    public static final class b extends h {

        /* renamed from: g */
        private final byte[] f13203g;

        /* renamed from: h */
        private final boolean f13204h;

        /* renamed from: i */
        private int f13205i;

        /* renamed from: j */
        private int f13206j;

        /* renamed from: k */
        private int f13207k;

        /* renamed from: l */
        private int f13208l;

        /* renamed from: m */
        private int f13209m;

        /* renamed from: n */
        private boolean f13210n;

        /* renamed from: o */
        private int f13211o;

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f13211o = a.e.API_PRIORITY_OTHER;
            this.f13203g = bArr;
            this.f13205i = i11 + i10;
            this.f13207k = i10;
            this.f13208l = i10;
            this.f13204h = z10;
        }

        /* synthetic */ b(byte[] bArr, int i10, int i11, boolean z10, a aVar) {
            this(bArr, i10, i11, z10);
        }

        private void N() {
            int i10 = this.f13205i + this.f13206j;
            this.f13205i = i10;
            int i11 = i10 - this.f13208l;
            int i12 = this.f13211o;
            if (i11 <= i12) {
                this.f13206j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f13206j = i13;
            this.f13205i = i10 - i13;
        }

        private void Q() {
            if (this.f13205i - this.f13207k >= 10) {
                R();
            } else {
                S();
            }
        }

        private void R() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f13203g;
                int i11 = this.f13207k;
                this.f13207k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw b0.f();
        }

        private void S() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (G() >= 0) {
                    return;
                }
            }
            throw b0.f();
        }

        @Override // com.google.protobuf.h
        public String A() {
            int K = K();
            if (K > 0) {
                int i10 = this.f13205i;
                int i11 = this.f13207k;
                if (K <= i10 - i11) {
                    String e10 = s1.e(this.f13203g, i11, K);
                    this.f13207k += K;
                    return e10;
                }
            }
            if (K == 0) {
                return "";
            }
            if (K <= 0) {
                throw b0.g();
            }
            throw b0.m();
        }

        @Override // com.google.protobuf.h
        public int B() {
            if (e()) {
                this.f13209m = 0;
                return 0;
            }
            int K = K();
            this.f13209m = K;
            if (t1.a(K) != 0) {
                return this.f13209m;
            }
            throw b0.c();
        }

        @Override // com.google.protobuf.h
        public int C() {
            return K();
        }

        @Override // com.google.protobuf.h
        public long D() {
            return L();
        }

        @Override // com.google.protobuf.h
        public boolean F(int i10) {
            int b10 = t1.b(i10);
            if (b10 == 0) {
                Q();
                return true;
            }
            if (b10 == 1) {
                P(8);
                return true;
            }
            if (b10 == 2) {
                P(K());
                return true;
            }
            if (b10 == 3) {
                O();
                a(t1.c(t1.a(i10), 4));
                return true;
            }
            if (b10 == 4) {
                return false;
            }
            if (b10 != 5) {
                throw b0.e();
            }
            P(4);
            return true;
        }

        public byte G() {
            int i10 = this.f13207k;
            if (i10 == this.f13205i) {
                throw b0.m();
            }
            byte[] bArr = this.f13203g;
            this.f13207k = i10 + 1;
            return bArr[i10];
        }

        public byte[] H(int i10) {
            if (i10 > 0) {
                int i11 = this.f13205i;
                int i12 = this.f13207k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f13207k = i13;
                    return Arrays.copyOfRange(this.f13203g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw b0.m();
            }
            if (i10 == 0) {
                return z.f13401d;
            }
            throw b0.g();
        }

        public int I() {
            int i10 = this.f13207k;
            if (this.f13205i - i10 < 4) {
                throw b0.m();
            }
            byte[] bArr = this.f13203g;
            this.f13207k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long J() {
            int i10 = this.f13207k;
            if (this.f13205i - i10 < 8) {
                throw b0.m();
            }
            byte[] bArr = this.f13203g;
            this.f13207k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L72;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int K() {
            /*
                r5 = this;
                int r0 = r5.f13207k
                int r1 = r5.f13205i
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f13203g
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f13207k = r3
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
                long r0 = r5.M()
                int r0 = (int) r0
                return r0
            L70:
                r5.f13207k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.h.b.K():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L86;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long L() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.h.b.L():long");
        }

        long M() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((G() & 128) == 0) {
                    return j10;
                }
            }
            throw b0.f();
        }

        public void O() {
            int B;
            do {
                B = B();
                if (B == 0) {
                    return;
                }
            } while (F(B));
        }

        public void P(int i10) {
            if (i10 >= 0) {
                int i11 = this.f13205i;
                int i12 = this.f13207k;
                if (i10 <= i11 - i12) {
                    this.f13207k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw b0.m();
            }
            throw b0.g();
        }

        @Override // com.google.protobuf.h
        public void a(int i10) {
            if (this.f13209m != i10) {
                throw b0.b();
            }
        }

        @Override // com.google.protobuf.h
        public int d() {
            return this.f13207k - this.f13208l;
        }

        @Override // com.google.protobuf.h
        public boolean e() {
            return this.f13207k == this.f13205i;
        }

        @Override // com.google.protobuf.h
        public void k(int i10) {
            this.f13211o = i10;
            N();
        }

        @Override // com.google.protobuf.h
        public int l(int i10) {
            if (i10 < 0) {
                throw b0.g();
            }
            int d10 = i10 + d();
            if (d10 < 0) {
                throw b0.h();
            }
            int i11 = this.f13211o;
            if (d10 > i11) {
                throw b0.m();
            }
            this.f13211o = d10;
            N();
            return i11;
        }

        @Override // com.google.protobuf.h
        public boolean m() {
            return L() != 0;
        }

        @Override // com.google.protobuf.h
        public g n() {
            int K = K();
            if (K > 0) {
                int i10 = this.f13205i;
                int i11 = this.f13207k;
                if (K <= i10 - i11) {
                    g E = (this.f13204h && this.f13210n) ? g.E(this.f13203g, i11, K) : g.l(this.f13203g, i11, K);
                    this.f13207k += K;
                    return E;
                }
            }
            return K == 0 ? g.f13185b : g.D(H(K));
        }

        @Override // com.google.protobuf.h
        public double o() {
            return Double.longBitsToDouble(J());
        }

        @Override // com.google.protobuf.h
        public int p() {
            return K();
        }

        @Override // com.google.protobuf.h
        public int q() {
            return I();
        }

        @Override // com.google.protobuf.h
        public long r() {
            return J();
        }

        @Override // com.google.protobuf.h
        public float s() {
            return Float.intBitsToFloat(I());
        }

        @Override // com.google.protobuf.h
        public int t() {
            return K();
        }

        @Override // com.google.protobuf.h
        public long u() {
            return L();
        }

        @Override // com.google.protobuf.h
        public int v() {
            return I();
        }

        @Override // com.google.protobuf.h
        public long w() {
            return J();
        }

        @Override // com.google.protobuf.h
        public int x() {
            return h.b(K());
        }

        @Override // com.google.protobuf.h
        public long y() {
            return h.c(L());
        }

        @Override // com.google.protobuf.h
        public String z() {
            int K = K();
            if (K > 0) {
                int i10 = this.f13205i;
                int i11 = this.f13207k;
                if (K <= i10 - i11) {
                    String str = new String(this.f13203g, i11, K, z.f13399b);
                    this.f13207k += K;
                    return str;
                }
            }
            if (K == 0) {
                return "";
            }
            if (K < 0) {
                throw b0.g();
            }
            throw b0.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends h {

        /* renamed from: g */
        private final InputStream f13212g;

        /* renamed from: h */
        private final byte[] f13213h;

        /* renamed from: i */
        private int f13214i;

        /* renamed from: j */
        private int f13215j;

        /* renamed from: k */
        private int f13216k;

        /* renamed from: l */
        private int f13217l;

        /* renamed from: m */
        private int f13218m;

        /* renamed from: n */
        private int f13219n;

        private c(InputStream inputStream, int i10) {
            super();
            this.f13219n = a.e.API_PRIORITY_OTHER;
            z.b(inputStream, "input");
            this.f13212g = inputStream;
            this.f13213h = new byte[i10];
            this.f13214i = 0;
            this.f13216k = 0;
            this.f13218m = 0;
        }

        /* synthetic */ c(InputStream inputStream, int i10, a aVar) {
            this(inputStream, i10);
        }

        private static int G(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (b0 e10) {
                e10.j();
                throw e10;
            }
        }

        private static int H(InputStream inputStream, byte[] bArr, int i10, int i11) {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (b0 e10) {
                e10.j();
                throw e10;
            }
        }

        private g I(int i10) {
            byte[] L = L(i10);
            if (L != null) {
                return g.k(L);
            }
            int i11 = this.f13216k;
            int i12 = this.f13214i;
            int i13 = i12 - i11;
            this.f13218m += i12;
            this.f13216k = 0;
            this.f13214i = 0;
            List<byte[]> M = M(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f13213h, i11, bArr, 0, i13);
            for (byte[] bArr2 : M) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return g.D(bArr);
        }

        private byte[] K(int i10, boolean z10) {
            byte[] L = L(i10);
            if (L != null) {
                return z10 ? (byte[]) L.clone() : L;
            }
            int i11 = this.f13216k;
            int i12 = this.f13214i;
            int i13 = i12 - i11;
            this.f13218m += i12;
            this.f13216k = 0;
            this.f13214i = 0;
            List<byte[]> M = M(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f13213h, i11, bArr, 0, i13);
            for (byte[] bArr2 : M) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        private byte[] L(int i10) {
            if (i10 == 0) {
                return z.f13401d;
            }
            if (i10 < 0) {
                throw b0.g();
            }
            int i11 = this.f13218m;
            int i12 = this.f13216k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f13200c > 0) {
                throw b0.l();
            }
            int i14 = this.f13219n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw b0.m();
            }
            int i15 = this.f13214i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > G(this.f13212g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f13213h, this.f13216k, bArr, 0, i15);
            this.f13218m += this.f13214i;
            this.f13216k = 0;
            this.f13214i = 0;
            while (i15 < i10) {
                int H = H(this.f13212g, bArr, i15, i10 - i15);
                if (H == -1) {
                    throw b0.m();
                }
                this.f13218m += H;
                i15 += H;
            }
            return bArr;
        }

        private List<byte[]> M(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, RecognitionOptions.AZTEC);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f13212g.read(bArr, i11, min - i11);
                    if (read == -1) {
                        throw b0.m();
                    }
                    this.f13218m += read;
                    i11 += read;
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void S() {
            int i10 = this.f13214i + this.f13215j;
            this.f13214i = i10;
            int i11 = this.f13218m + i10;
            int i12 = this.f13219n;
            if (i11 <= i12) {
                this.f13215j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f13215j = i13;
            this.f13214i = i10 - i13;
        }

        private void T(int i10) {
            if (b0(i10)) {
                return;
            }
            if (i10 <= (this.f13200c - this.f13218m) - this.f13216k) {
                throw b0.m();
            }
            throw b0.l();
        }

        private static long U(InputStream inputStream, long j10) {
            try {
                return inputStream.skip(j10);
            } catch (b0 e10) {
                e10.j();
                throw e10;
            }
        }

        private void X(int i10) {
            if (i10 < 0) {
                throw b0.g();
            }
            int i11 = this.f13218m;
            int i12 = this.f13216k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f13219n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw b0.m();
            }
            this.f13218m = i11 + i12;
            int i15 = this.f13214i - i12;
            this.f13214i = 0;
            this.f13216k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long U = U(this.f13212g, j10);
                    if (U < 0 || U > j10) {
                        throw new IllegalStateException(this.f13212g.getClass() + "#skip returned invalid result: " + U + "\nThe InputStream implementation is buggy.");
                    }
                    if (U == 0) {
                        break;
                    } else {
                        i15 += (int) U;
                    }
                } finally {
                    this.f13218m += i15;
                    S();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f13214i;
            int i17 = i16 - this.f13216k;
            this.f13216k = i16;
            while (true) {
                T(1);
                int i18 = i10 - i17;
                int i19 = this.f13214i;
                if (i18 <= i19) {
                    this.f13216k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f13216k = i19;
                }
            }
        }

        private void Y() {
            if (this.f13214i - this.f13216k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f13213h;
                int i11 = this.f13216k;
                this.f13216k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw b0.f();
        }

        private void a0() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw b0.f();
        }

        private boolean b0(int i10) {
            int i11 = this.f13216k;
            int i12 = i11 + i10;
            int i13 = this.f13214i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f13200c;
            int i15 = this.f13218m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f13219n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f13213h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f13218m += i11;
                this.f13214i -= i11;
                this.f13216k = 0;
            }
            InputStream inputStream = this.f13212g;
            byte[] bArr2 = this.f13213h;
            int i16 = this.f13214i;
            int H = H(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f13200c - this.f13218m) - i16));
            if (H == 0 || H < -1 || H > this.f13213h.length) {
                throw new IllegalStateException(this.f13212g.getClass() + "#read(byte[]) returned invalid result: " + H + "\nThe InputStream implementation is buggy.");
            }
            if (H <= 0) {
                return false;
            }
            this.f13214i += H;
            S();
            if (this.f13214i >= i10) {
                return true;
            }
            return b0(i10);
        }

        @Override // com.google.protobuf.h
        public String A() {
            byte[] K;
            int i10;
            int P = P();
            int i11 = this.f13216k;
            int i12 = this.f13214i;
            if (P <= i12 - i11 && P > 0) {
                K = this.f13213h;
                i10 = i11 + P;
            } else {
                if (P == 0) {
                    return "";
                }
                i11 = 0;
                if (P > i12) {
                    K = K(P, false);
                    return s1.e(K, i11, P);
                }
                T(P);
                K = this.f13213h;
                i10 = P + 0;
            }
            this.f13216k = i10;
            return s1.e(K, i11, P);
        }

        @Override // com.google.protobuf.h
        public int B() {
            if (e()) {
                this.f13217l = 0;
                return 0;
            }
            int P = P();
            this.f13217l = P;
            if (t1.a(P) != 0) {
                return this.f13217l;
            }
            throw b0.c();
        }

        @Override // com.google.protobuf.h
        public int C() {
            return P();
        }

        @Override // com.google.protobuf.h
        public long D() {
            return Q();
        }

        @Override // com.google.protobuf.h
        public boolean F(int i10) {
            int b10 = t1.b(i10);
            if (b10 == 0) {
                Y();
                return true;
            }
            if (b10 == 1) {
                W(8);
                return true;
            }
            if (b10 == 2) {
                W(P());
                return true;
            }
            if (b10 == 3) {
                V();
                a(t1.c(t1.a(i10), 4));
                return true;
            }
            if (b10 == 4) {
                return false;
            }
            if (b10 != 5) {
                throw b0.e();
            }
            W(4);
            return true;
        }

        public byte J() {
            if (this.f13216k == this.f13214i) {
                T(1);
            }
            byte[] bArr = this.f13213h;
            int i10 = this.f13216k;
            this.f13216k = i10 + 1;
            return bArr[i10];
        }

        public int N() {
            int i10 = this.f13216k;
            if (this.f13214i - i10 < 4) {
                T(4);
                i10 = this.f13216k;
            }
            byte[] bArr = this.f13213h;
            this.f13216k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long O() {
            int i10 = this.f13216k;
            if (this.f13214i - i10 < 8) {
                T(8);
                i10 = this.f13216k;
            }
            byte[] bArr = this.f13213h;
            this.f13216k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L72;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int P() {
            /*
                r5 = this;
                int r0 = r5.f13216k
                int r1 = r5.f13214i
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f13213h
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f13216k = r3
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
                long r0 = r5.R()
                int r0 = (int) r0
                return r0
            L70:
                r5.f13216k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.h.c.P():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L86;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long Q() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.h.c.Q():long");
        }

        long R() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((J() & 128) == 0) {
                    return j10;
                }
            }
            throw b0.f();
        }

        public void V() {
            int B;
            do {
                B = B();
                if (B == 0) {
                    return;
                }
            } while (F(B));
        }

        public void W(int i10) {
            int i11 = this.f13214i;
            int i12 = this.f13216k;
            if (i10 > i11 - i12 || i10 < 0) {
                X(i10);
            } else {
                this.f13216k = i12 + i10;
            }
        }

        @Override // com.google.protobuf.h
        public void a(int i10) {
            if (this.f13217l != i10) {
                throw b0.b();
            }
        }

        @Override // com.google.protobuf.h
        public int d() {
            return this.f13218m + this.f13216k;
        }

        @Override // com.google.protobuf.h
        public boolean e() {
            return this.f13216k == this.f13214i && !b0(1);
        }

        @Override // com.google.protobuf.h
        public void k(int i10) {
            this.f13219n = i10;
            S();
        }

        @Override // com.google.protobuf.h
        public int l(int i10) {
            if (i10 < 0) {
                throw b0.g();
            }
            int i11 = i10 + this.f13218m + this.f13216k;
            int i12 = this.f13219n;
            if (i11 > i12) {
                throw b0.m();
            }
            this.f13219n = i11;
            S();
            return i12;
        }

        @Override // com.google.protobuf.h
        public boolean m() {
            return Q() != 0;
        }

        @Override // com.google.protobuf.h
        public g n() {
            int P = P();
            int i10 = this.f13214i;
            int i11 = this.f13216k;
            if (P > i10 - i11 || P <= 0) {
                return P == 0 ? g.f13185b : I(P);
            }
            g l10 = g.l(this.f13213h, i11, P);
            this.f13216k += P;
            return l10;
        }

        @Override // com.google.protobuf.h
        public double o() {
            return Double.longBitsToDouble(O());
        }

        @Override // com.google.protobuf.h
        public int p() {
            return P();
        }

        @Override // com.google.protobuf.h
        public int q() {
            return N();
        }

        @Override // com.google.protobuf.h
        public long r() {
            return O();
        }

        @Override // com.google.protobuf.h
        public float s() {
            return Float.intBitsToFloat(N());
        }

        @Override // com.google.protobuf.h
        public int t() {
            return P();
        }

        @Override // com.google.protobuf.h
        public long u() {
            return Q();
        }

        @Override // com.google.protobuf.h
        public int v() {
            return N();
        }

        @Override // com.google.protobuf.h
        public long w() {
            return O();
        }

        @Override // com.google.protobuf.h
        public int x() {
            return h.b(P());
        }

        @Override // com.google.protobuf.h
        public long y() {
            return h.c(Q());
        }

        @Override // com.google.protobuf.h
        public String z() {
            int P = P();
            if (P > 0) {
                int i10 = this.f13214i;
                int i11 = this.f13216k;
                if (P <= i10 - i11) {
                    String str = new String(this.f13213h, i11, P, z.f13399b);
                    this.f13216k += P;
                    return str;
                }
            }
            if (P == 0) {
                return "";
            }
            if (P > this.f13214i) {
                return new String(K(P, false), z.f13399b);
            }
            T(P);
            String str2 = new String(this.f13213h, this.f13216k, P, z.f13399b);
            this.f13216k += P;
            return str2;
        }
    }

    private h() {
        this.f13199b = f13197f;
        this.f13200c = a.e.API_PRIORITY_OTHER;
        this.f13202e = false;
    }

    /* synthetic */ h(a aVar) {
        this();
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static h f(InputStream inputStream) {
        return g(inputStream, RecognitionOptions.AZTEC);
    }

    public static h g(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? h(z.f13401d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static h h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static h i(byte[] bArr, int i10, int i11) {
        return j(bArr, i10, i11, false);
    }

    public static h j(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.l(i11);
            return bVar;
        } catch (b0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public final int E(int i10) {
        if (i10 >= 0) {
            int i11 = this.f13200c;
            this.f13200c = i10;
            return i11;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i10);
    }

    public abstract boolean F(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i10);

    public abstract int l(int i10);

    public abstract boolean m();

    public abstract g n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();
}
