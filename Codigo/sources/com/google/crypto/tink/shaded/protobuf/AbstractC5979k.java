package com.google.crypto.tink.shaded.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.crypto.tink.shaded.protobuf.C6005s1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.shaded.protobuf.k */
/* loaded from: classes2.dex */
public abstract class AbstractC5979k extends AbstractC5967g {

    /* renamed from: c */
    private static final Logger f12664c = Logger.getLogger(AbstractC5979k.class.getName());

    /* renamed from: d */
    private static final boolean f12665d = C6002r1.m15978E();

    /* renamed from: a */
    C5982l f12666a;

    /* renamed from: b */
    private boolean f12667b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.k$b */
    /* loaded from: classes2.dex */
    public static class b extends AbstractC5979k {

        /* renamed from: e */
        private final byte[] f12668e;

        /* renamed from: f */
        private final int f12669f;

        /* renamed from: g */
        private final int f12670g;

        /* renamed from: h */
        private int f12671h;

        b(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f12668e = bArr;
            this.f12669f = i10;
            this.f12671h = i10;
            this.f12670g = i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: A0 */
        public final void mo15754A0(int i10, InterfaceC6001r0 interfaceC6001r0) {
            mo15765L0(1, 3);
            mo15766M0(2, i10);
            m15797S0(3, interfaceC6001r0);
            mo15765L0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: B0 */
        public final void mo15755B0(int i10, AbstractC5970h abstractC5970h) {
            mo15765L0(1, 3);
            mo15766M0(2, i10);
            mo15777i0(3, abstractC5970h);
            mo15765L0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: K0 */
        public final void mo15764K0(int i10, String str) {
            mo15765L0(i10, 2);
            m15799U0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: L0 */
        public final void mo15765L0(int i10, int i11) {
            mo15767N0(C6008t1.m16094c(i10, i11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: M0 */
        public final void mo15766M0(int i10, int i11) {
            mo15765L0(i10, 0);
            mo15767N0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: N0 */
        public final void mo15767N0(int i10) {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f12668e;
                    int i11 = this.f12671h;
                    this.f12671h = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | RecognitionOptions.ITF);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12671h), Integer.valueOf(this.f12670g), 1), e10);
                }
            }
            byte[] bArr2 = this.f12668e;
            int i12 = this.f12671h;
            this.f12671h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: O0 */
        public final void mo15768O0(int i10, long j10) {
            mo15765L0(i10, 0);
            mo15769P0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: P0 */
        public final void mo15769P0(long j10) {
            if (AbstractC5979k.f12665d && mo15773e0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f12668e;
                    int i10 = this.f12671h;
                    this.f12671h = i10 + 1;
                    C6002r1.m15984K(bArr, i10, (byte) ((((int) j10) & 127) | RecognitionOptions.ITF));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f12668e;
                int i11 = this.f12671h;
                this.f12671h = i11 + 1;
                C6002r1.m15984K(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f12668e;
                    int i12 = this.f12671h;
                    this.f12671h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | RecognitionOptions.ITF);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12671h), Integer.valueOf(this.f12670g), 1), e10);
                }
            }
            byte[] bArr4 = this.f12668e;
            int i13 = this.f12671h;
            this.f12671h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        /* renamed from: Q0 */
        public final void m15795Q0(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f12668e, this.f12671h, i11);
                this.f12671h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12671h), Integer.valueOf(this.f12670g), Integer.valueOf(i11)), e10);
            }
        }

        /* renamed from: R0 */
        public final void m15796R0(AbstractC5970h abstractC5970h) {
            mo15767N0(abstractC5970h.size());
            abstractC5970h.mo15492F(this);
        }

        /* renamed from: S0 */
        public final void m15797S0(int i10, InterfaceC6001r0 interfaceC6001r0) {
            mo15765L0(i10, 2);
            m15798T0(interfaceC6001r0);
        }

        /* renamed from: T0 */
        public final void m15798T0(InterfaceC6001r0 interfaceC6001r0) {
            mo15767N0(interfaceC6001r0.mo15968c());
            interfaceC6001r0.mo15971i(this);
        }

        /* renamed from: U0 */
        public final void m15799U0(String str) {
            int m16049f;
            int i10 = this.f12671h;
            try {
                int m15723V = AbstractC5979k.m15723V(str.length() * 3);
                int m15723V2 = AbstractC5979k.m15723V(str.length());
                if (m15723V2 == m15723V) {
                    int i11 = i10 + m15723V2;
                    this.f12671h = i11;
                    m16049f = C6005s1.m16049f(str, this.f12668e, i11, mo15773e0());
                    this.f12671h = i10;
                    mo15767N0((m16049f - i10) - m15723V2);
                } else {
                    mo15767N0(C6005s1.m16050g(str));
                    m16049f = C6005s1.m16049f(str, this.f12668e, this.f12671h, mo15773e0());
                }
                this.f12671h = m16049f;
            } catch (C6005s1.d e10) {
                this.f12671h = i10;
                m15770a0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new c(e11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k, com.google.crypto.tink.shaded.protobuf.AbstractC5967g
        /* renamed from: a */
        public final void mo15469a(byte[] bArr, int i10, int i11) {
            m15795Q0(bArr, i10, i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: e0 */
        public final int mo15773e0() {
            return this.f12670g - this.f12671h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: f0 */
        public final void mo15774f0(byte b10) {
            try {
                byte[] bArr = this.f12668e;
                int i10 = this.f12671h;
                this.f12671h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12671h), Integer.valueOf(this.f12670g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: g0 */
        public final void mo15775g0(int i10, boolean z10) {
            mo15765L0(i10, 0);
            mo15774f0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: i0 */
        public final void mo15777i0(int i10, AbstractC5970h abstractC5970h) {
            mo15765L0(i10, 2);
            m15796R0(abstractC5970h);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: n0 */
        public final void mo15782n0(int i10, int i11) {
            mo15765L0(i10, 5);
            mo15783o0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: o0 */
        public final void mo15783o0(int i10) {
            try {
                byte[] bArr = this.f12668e;
                int i11 = this.f12671h;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f12671h = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12671h), Integer.valueOf(this.f12670g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: p0 */
        public final void mo15784p0(int i10, long j10) {
            mo15765L0(i10, 1);
            mo15785q0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: q0 */
        public final void mo15785q0(long j10) {
            try {
                byte[] bArr = this.f12668e;
                int i10 = this.f12671h;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f12671h = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12671h), Integer.valueOf(this.f12670g), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: v0 */
        public final void mo15790v0(int i10, int i11) {
            mo15765L0(i10, 0);
            mo15791w0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: w0 */
        public final void mo15791w0(int i10) {
            if (i10 >= 0) {
                mo15767N0(i10);
            } else {
                mo15769P0(i10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5979k
        /* renamed from: z0 */
        final void mo15794z0(int i10, InterfaceC6001r0 interfaceC6001r0, InterfaceC5969g1 interfaceC5969g1) {
            mo15765L0(i10, 2);
            mo15767N0(((AbstractC5949a) interfaceC6001r0).mo15295k(interfaceC5969g1));
            interfaceC5969g1.mo15479j(interfaceC6001r0, this.f12666a);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.k$c */
    /* loaded from: classes2.dex */
    public static class c extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        c(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }

        c(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }
    }

    private AbstractC5979k() {
    }

    /* renamed from: A */
    public static int m15702A(int i10, C5962e0 c5962e0) {
        return m15721T(i10) + m15703B(c5962e0);
    }

    /* renamed from: B */
    public static int m15703B(C5962e0 c5962e0) {
        return m15704C(c5962e0.m15396b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static int m15704C(int i10) {
        return m15723V(i10) + i10;
    }

    /* renamed from: D */
    public static int m15705D(int i10, InterfaceC6001r0 interfaceC6001r0) {
        return (m15721T(1) * 2) + m15722U(2, i10) + m15706E(3, interfaceC6001r0);
    }

    /* renamed from: E */
    public static int m15706E(int i10, InterfaceC6001r0 interfaceC6001r0) {
        return m15721T(i10) + m15708G(interfaceC6001r0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static int m15707F(int i10, InterfaceC6001r0 interfaceC6001r0, InterfaceC5969g1 interfaceC5969g1) {
        return m15721T(i10) + m15709H(interfaceC6001r0, interfaceC5969g1);
    }

    /* renamed from: G */
    public static int m15708G(InterfaceC6001r0 interfaceC6001r0) {
        return m15704C(interfaceC6001r0.mo15968c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static int m15709H(InterfaceC6001r0 interfaceC6001r0, InterfaceC5969g1 interfaceC5969g1) {
        return m15704C(((AbstractC5949a) interfaceC6001r0).mo15295k(interfaceC5969g1));
    }

    /* renamed from: I */
    public static int m15710I(int i10, AbstractC5970h abstractC5970h) {
        return (m15721T(1) * 2) + m15722U(2, i10) + m15734g(3, abstractC5970h);
    }

    /* renamed from: J */
    public static int m15711J(int i10, int i11) {
        return m15721T(i10) + m15712K(i11);
    }

    /* renamed from: K */
    public static int m15712K(int i10) {
        return 4;
    }

    /* renamed from: L */
    public static int m15713L(int i10, long j10) {
        return m15721T(i10) + m15714M(j10);
    }

    /* renamed from: M */
    public static int m15714M(long j10) {
        return 8;
    }

    /* renamed from: N */
    public static int m15715N(int i10, int i11) {
        return m15721T(i10) + m15716O(i11);
    }

    /* renamed from: O */
    public static int m15716O(int i10) {
        return m15723V(m15726Y(i10));
    }

    /* renamed from: P */
    public static int m15717P(int i10, long j10) {
        return m15721T(i10) + m15718Q(j10);
    }

    /* renamed from: Q */
    public static int m15718Q(long j10) {
        return m15725X(m15727Z(j10));
    }

    /* renamed from: R */
    public static int m15719R(int i10, String str) {
        return m15721T(i10) + m15720S(str);
    }

    /* renamed from: S */
    public static int m15720S(String str) {
        int length;
        try {
            length = C6005s1.m16050g(str);
        } catch (C6005s1.d unused) {
            length = str.getBytes(C5950a0.f12550b).length;
        }
        return m15704C(length);
    }

    /* renamed from: T */
    public static int m15721T(int i10) {
        return m15723V(C6008t1.m16094c(i10, 0));
    }

    /* renamed from: U */
    public static int m15722U(int i10, int i11) {
        return m15721T(i10) + m15723V(i11);
    }

    /* renamed from: V */
    public static int m15723V(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: W */
    public static int m15724W(int i10, long j10) {
        return m15721T(i10) + m15725X(j10);
    }

    /* renamed from: X */
    public static int m15725X(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    /* renamed from: Y */
    public static int m15726Y(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    /* renamed from: Z */
    public static long m15727Z(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    /* renamed from: c0 */
    public static AbstractC5979k m15729c0(byte[] bArr) {
        return m15731d0(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public static int m15730d(int i10, boolean z10) {
        return m15721T(i10) + m15732e(z10);
    }

    /* renamed from: d0 */
    public static AbstractC5979k m15731d0(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    /* renamed from: e */
    public static int m15732e(boolean z10) {
        return 1;
    }

    /* renamed from: f */
    public static int m15733f(byte[] bArr) {
        return m15704C(bArr.length);
    }

    /* renamed from: g */
    public static int m15734g(int i10, AbstractC5970h abstractC5970h) {
        return m15721T(i10) + m15735h(abstractC5970h);
    }

    /* renamed from: h */
    public static int m15735h(AbstractC5970h abstractC5970h) {
        return m15704C(abstractC5970h.size());
    }

    /* renamed from: i */
    public static int m15736i(int i10, double d10) {
        return m15721T(i10) + m15737j(d10);
    }

    /* renamed from: j */
    public static int m15737j(double d10) {
        return 8;
    }

    /* renamed from: k */
    public static int m15738k(int i10, int i11) {
        return m15721T(i10) + m15739l(i11);
    }

    /* renamed from: l */
    public static int m15739l(int i10) {
        return m15750w(i10);
    }

    /* renamed from: m */
    public static int m15740m(int i10, int i11) {
        return m15721T(i10) + m15741n(i11);
    }

    /* renamed from: n */
    public static int m15741n(int i10) {
        return 4;
    }

    /* renamed from: o */
    public static int m15742o(int i10, long j10) {
        return m15721T(i10) + m15743p(j10);
    }

    /* renamed from: p */
    public static int m15743p(long j10) {
        return 8;
    }

    /* renamed from: q */
    public static int m15744q(int i10, float f10) {
        return m15721T(i10) + m15745r(f10);
    }

    /* renamed from: r */
    public static int m15745r(float f10) {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: s */
    public static int m15746s(int i10, InterfaceC6001r0 interfaceC6001r0, InterfaceC5969g1 interfaceC5969g1) {
        return (m15721T(i10) * 2) + m15748u(interfaceC6001r0, interfaceC5969g1);
    }

    @Deprecated
    /* renamed from: t */
    public static int m15747t(InterfaceC6001r0 interfaceC6001r0) {
        return interfaceC6001r0.mo15968c();
    }

    @Deprecated
    /* renamed from: u */
    static int m15748u(InterfaceC6001r0 interfaceC6001r0, InterfaceC5969g1 interfaceC5969g1) {
        return ((AbstractC5949a) interfaceC6001r0).mo15295k(interfaceC5969g1);
    }

    /* renamed from: v */
    public static int m15749v(int i10, int i11) {
        return m15721T(i10) + m15750w(i11);
    }

    /* renamed from: w */
    public static int m15750w(int i10) {
        if (i10 >= 0) {
            return m15723V(i10);
        }
        return 10;
    }

    /* renamed from: x */
    public static int m15751x(int i10, long j10) {
        return m15721T(i10) + m15752y(j10);
    }

    /* renamed from: y */
    public static int m15752y(long j10) {
        return m15725X(j10);
    }

    /* renamed from: z */
    public static int m15753z(int i10, C5962e0 c5962e0) {
        return (m15721T(1) * 2) + m15722U(2, i10) + m15702A(3, c5962e0);
    }

    /* renamed from: A0 */
    public abstract void mo15754A0(int i10, InterfaceC6001r0 interfaceC6001r0);

    /* renamed from: B0 */
    public abstract void mo15755B0(int i10, AbstractC5970h abstractC5970h);

    /* renamed from: C0 */
    public final void m15756C0(int i10, int i11) {
        mo15782n0(i10, i11);
    }

    /* renamed from: D0 */
    public final void m15757D0(int i10) {
        mo15783o0(i10);
    }

    /* renamed from: E0 */
    public final void m15758E0(int i10, long j10) {
        mo15784p0(i10, j10);
    }

    /* renamed from: F0 */
    public final void m15759F0(long j10) {
        mo15785q0(j10);
    }

    /* renamed from: G0 */
    public final void m15760G0(int i10, int i11) {
        mo15766M0(i10, m15726Y(i11));
    }

    /* renamed from: H0 */
    public final void m15761H0(int i10) {
        mo15767N0(m15726Y(i10));
    }

    /* renamed from: I0 */
    public final void m15762I0(int i10, long j10) {
        mo15768O0(i10, m15727Z(j10));
    }

    /* renamed from: J0 */
    public final void m15763J0(long j10) {
        mo15769P0(m15727Z(j10));
    }

    /* renamed from: K0 */
    public abstract void mo15764K0(int i10, String str);

    /* renamed from: L0 */
    public abstract void mo15765L0(int i10, int i11);

    /* renamed from: M0 */
    public abstract void mo15766M0(int i10, int i11);

    /* renamed from: N0 */
    public abstract void mo15767N0(int i10);

    /* renamed from: O0 */
    public abstract void mo15768O0(int i10, long j10);

    /* renamed from: P0 */
    public abstract void mo15769P0(long j10);

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5967g
    /* renamed from: a */
    public abstract void mo15469a(byte[] bArr, int i10, int i11);

    /* renamed from: a0 */
    final void m15770a0(String str, C6005s1.d dVar) {
        f12664c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C5950a0.f12550b);
        try {
            mo15767N0(bytes.length);
            mo15469a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public boolean m15771b0() {
        return this.f12667b;
    }

    /* renamed from: c */
    public final void m15772c() {
        if (mo15773e0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: e0 */
    public abstract int mo15773e0();

    /* renamed from: f0 */
    public abstract void mo15774f0(byte b10);

    /* renamed from: g0 */
    public abstract void mo15775g0(int i10, boolean z10);

    /* renamed from: h0 */
    public final void m15776h0(boolean z10) {
        mo15774f0(z10 ? (byte) 1 : (byte) 0);
    }

    /* renamed from: i0 */
    public abstract void mo15777i0(int i10, AbstractC5970h abstractC5970h);

    /* renamed from: j0 */
    public final void m15778j0(int i10, double d10) {
        mo15784p0(i10, Double.doubleToRawLongBits(d10));
    }

    /* renamed from: k0 */
    public final void m15779k0(double d10) {
        mo15785q0(Double.doubleToRawLongBits(d10));
    }

    /* renamed from: l0 */
    public final void m15780l0(int i10, int i11) {
        mo15790v0(i10, i11);
    }

    /* renamed from: m0 */
    public final void m15781m0(int i10) {
        mo15791w0(i10);
    }

    /* renamed from: n0 */
    public abstract void mo15782n0(int i10, int i11);

    /* renamed from: o0 */
    public abstract void mo15783o0(int i10);

    /* renamed from: p0 */
    public abstract void mo15784p0(int i10, long j10);

    /* renamed from: q0 */
    public abstract void mo15785q0(long j10);

    /* renamed from: r0 */
    public final void m15786r0(int i10, float f10) {
        mo15782n0(i10, Float.floatToRawIntBits(f10));
    }

    /* renamed from: s0 */
    public final void m15787s0(float f10) {
        mo15783o0(Float.floatToRawIntBits(f10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: t0 */
    public final void m15788t0(int i10, InterfaceC6001r0 interfaceC6001r0, InterfaceC5969g1 interfaceC5969g1) {
        mo15765L0(i10, 3);
        m15789u0(interfaceC6001r0, interfaceC5969g1);
        mo15765L0(i10, 4);
    }

    @Deprecated
    /* renamed from: u0 */
    final void m15789u0(InterfaceC6001r0 interfaceC6001r0, InterfaceC5969g1 interfaceC5969g1) {
        interfaceC5969g1.mo15479j(interfaceC6001r0, this.f12666a);
    }

    /* renamed from: v0 */
    public abstract void mo15790v0(int i10, int i11);

    /* renamed from: w0 */
    public abstract void mo15791w0(int i10);

    /* renamed from: x0 */
    public final void m15792x0(int i10, long j10) {
        mo15768O0(i10, j10);
    }

    /* renamed from: y0 */
    public final void m15793y0(long j10) {
        mo15769P0(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z0 */
    public abstract void mo15794z0(int i10, InterfaceC6001r0 interfaceC6001r0, InterfaceC5969g1 interfaceC5969g1);
}
