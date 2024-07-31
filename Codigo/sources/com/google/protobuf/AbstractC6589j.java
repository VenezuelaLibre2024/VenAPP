package com.google.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.C6618s1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.j */
/* loaded from: classes2.dex */
public abstract class AbstractC6589j extends AbstractC6577f {

    /* renamed from: c */
    private static final Logger f14509c = Logger.getLogger(AbstractC6589j.class.getName());

    /* renamed from: d */
    private static final boolean f14510d = C6615r1.m19043E();

    /* renamed from: a */
    C6592k f14511a;

    /* renamed from: b */
    private boolean f14512b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.j$b */
    /* loaded from: classes2.dex */
    public static abstract class b extends AbstractC6589j {

        /* renamed from: e */
        final byte[] f14513e;

        /* renamed from: f */
        final int f14514f;

        /* renamed from: g */
        int f14515g;

        /* renamed from: h */
        int f14516h;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f14513e = bArr;
            this.f14514f = bArr.length;
        }

        /* renamed from: a1 */
        final void m18808a1(byte b10) {
            byte[] bArr = this.f14513e;
            int i10 = this.f14515g;
            this.f14515g = i10 + 1;
            bArr[i10] = b10;
            this.f14516h++;
        }

        /* renamed from: b1 */
        final void m18809b1(int i10) {
            byte[] bArr = this.f14513e;
            int i11 = this.f14515g;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f14515g = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f14516h += 4;
        }

        /* renamed from: c1 */
        final void m18810c1(long j10) {
            byte[] bArr = this.f14513e;
            int i10 = this.f14515g;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f14515g = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f14516h += 8;
        }

        /* renamed from: d1 */
        final void m18811d1(int i10) {
            if (i10 >= 0) {
                m18813f1(i10);
            } else {
                m18814g1(i10);
            }
        }

        /* renamed from: e1 */
        final void m18812e1(int i10, int i11) {
            m18813f1(C6621t1.m19190c(i10, i11));
        }

        /* renamed from: f1 */
        final void m18813f1(int i10) {
            if (!AbstractC6589j.f14510d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f14513e;
                    int i11 = this.f14515g;
                    this.f14515g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | RecognitionOptions.ITF);
                    this.f14516h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f14513e;
                int i12 = this.f14515g;
                this.f14515g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f14516h++;
                return;
            }
            long j10 = this.f14515g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f14513e;
                int i13 = this.f14515g;
                this.f14515g = i13 + 1;
                C6615r1.m19049K(bArr3, i13, (byte) ((i10 & 127) | RecognitionOptions.ITF));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f14513e;
            int i14 = this.f14515g;
            this.f14515g = i14 + 1;
            C6615r1.m19049K(bArr4, i14, (byte) i10);
            this.f14516h += (int) (this.f14515g - j10);
        }

        /* renamed from: g1 */
        final void m18814g1(long j10) {
            if (!AbstractC6589j.f14510d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f14513e;
                    int i10 = this.f14515g;
                    this.f14515g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | RecognitionOptions.ITF);
                    this.f14516h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f14513e;
                int i11 = this.f14515g;
                this.f14515g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f14516h++;
                return;
            }
            long j11 = this.f14515g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f14513e;
                int i12 = this.f14515g;
                this.f14515g = i12 + 1;
                C6615r1.m19049K(bArr3, i12, (byte) ((((int) j10) & 127) | RecognitionOptions.ITF));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f14513e;
            int i13 = this.f14515g;
            this.f14515g = i13 + 1;
            C6615r1.m19049K(bArr4, i13, (byte) j10);
            this.f14516h += (int) (this.f14515g - j11);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: h0 */
        public final int mo18789h0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.j$c */
    /* loaded from: classes2.dex */
    public static class c extends AbstractC6589j {

        /* renamed from: e */
        private final byte[] f14517e;

        /* renamed from: f */
        private final int f14518f;

        /* renamed from: g */
        private final int f14519g;

        /* renamed from: h */
        private int f14520h;

        c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f14517e = bArr;
            this.f14518f = i10;
            this.f14520h = i10;
            this.f14519g = i12;
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: D0 */
        public final void mo18762D0(int i10, int i11) {
            mo18780V0(i10, 0);
            mo18763E0(i11);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: E0 */
        public final void mo18763E0(int i10) {
            if (i10 >= 0) {
                mo18782X0(i10);
            } else {
                mo18784Z0(i10);
            }
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: H0 */
        final void mo18766H0(int i10, InterfaceC6614r0 interfaceC6614r0, InterfaceC6582g1 interfaceC6582g1) {
            mo18780V0(i10, 2);
            mo18782X0(((AbstractC6562a) interfaceC6614r0).mo18377r(interfaceC6582g1));
            interfaceC6582g1.mo18547h(interfaceC6614r0, this.f14511a);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: I0 */
        public final void mo18767I0(InterfaceC6614r0 interfaceC6614r0) {
            mo18782X0(interfaceC6614r0.mo19033c());
            interfaceC6614r0.mo19036l(this);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: J0 */
        public final void mo18768J0(int i10, InterfaceC6614r0 interfaceC6614r0) {
            mo18780V0(1, 3);
            mo18781W0(2, i10);
            m18816b1(3, interfaceC6614r0);
            mo18780V0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: K0 */
        public final void mo18769K0(int i10, AbstractC6580g abstractC6580g) {
            mo18780V0(1, 3);
            mo18781W0(2, i10);
            mo18795n0(3, abstractC6580g);
            mo18780V0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: T0 */
        public final void mo18778T0(int i10, String str) {
            mo18780V0(i10, 2);
            mo18779U0(str);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: U0 */
        public final void mo18779U0(String str) {
            int m19111f;
            int i10 = this.f14520h;
            try {
                int m18727W = AbstractC6589j.m18727W(str.length() * 3);
                int m18727W2 = AbstractC6589j.m18727W(str.length());
                if (m18727W2 == m18727W) {
                    int i11 = i10 + m18727W2;
                    this.f14520h = i11;
                    m19111f = C6618s1.m19111f(str, this.f14517e, i11, mo18789h0());
                    this.f14520h = i10;
                    mo18782X0((m19111f - i10) - m18727W2);
                } else {
                    mo18782X0(C6618s1.m19112g(str));
                    m19111f = C6618s1.m19111f(str, this.f14517e, this.f14520h, mo18789h0());
                }
                this.f14520h = m19111f;
            } catch (C6618s1.d e10) {
                this.f14520h = i10;
                m18787c0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: V0 */
        public final void mo18780V0(int i10, int i11) {
            mo18782X0(C6621t1.m19190c(i10, i11));
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: W0 */
        public final void mo18781W0(int i10, int i11) {
            mo18780V0(i10, 0);
            mo18782X0(i11);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: X0 */
        public final void mo18782X0(int i10) {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f14517e;
                    int i11 = this.f14520h;
                    this.f14520h = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | RecognitionOptions.ITF);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14520h), Integer.valueOf(this.f14519g), 1), e10);
                }
            }
            byte[] bArr2 = this.f14517e;
            int i12 = this.f14520h;
            this.f14520h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: Y0 */
        public final void mo18783Y0(int i10, long j10) {
            mo18780V0(i10, 0);
            mo18784Z0(j10);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: Z0 */
        public final void mo18784Z0(long j10) {
            if (AbstractC6589j.f14510d && mo18789h0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f14517e;
                    int i10 = this.f14520h;
                    this.f14520h = i10 + 1;
                    C6615r1.m19049K(bArr, i10, (byte) ((((int) j10) & 127) | RecognitionOptions.ITF));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f14517e;
                int i11 = this.f14520h;
                this.f14520h = i11 + 1;
                C6615r1.m19049K(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f14517e;
                    int i12 = this.f14520h;
                    this.f14520h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | RecognitionOptions.ITF);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14520h), Integer.valueOf(this.f14519g), 1), e10);
                }
            }
            byte[] bArr4 = this.f14517e;
            int i13 = this.f14520h;
            this.f14520h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.google.protobuf.AbstractC6589j, com.google.protobuf.AbstractC6577f
        /* renamed from: a */
        public final void mo18454a(byte[] bArr, int i10, int i11) {
            m18815a1(bArr, i10, i11);
        }

        /* renamed from: a1 */
        public final void m18815a1(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f14517e, this.f14520h, i11);
                this.f14520h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14520h), Integer.valueOf(this.f14519g), Integer.valueOf(i11)), e10);
            }
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: b0 */
        public void mo18785b0() {
        }

        /* renamed from: b1 */
        public final void m18816b1(int i10, InterfaceC6614r0 interfaceC6614r0) {
            mo18780V0(i10, 2);
            mo18767I0(interfaceC6614r0);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: h0 */
        public final int mo18789h0() {
            return this.f14519g - this.f14520h;
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: i0 */
        public final void mo18790i0(byte b10) {
            try {
                byte[] bArr = this.f14517e;
                int i10 = this.f14520h;
                this.f14520h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14520h), Integer.valueOf(this.f14519g), 1), e10);
            }
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: j0 */
        public final void mo18791j0(int i10, boolean z10) {
            mo18780V0(i10, 0);
            mo18790i0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: m0 */
        public final void mo18794m0(byte[] bArr, int i10, int i11) {
            mo18782X0(i11);
            m18815a1(bArr, i10, i11);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: n0 */
        public final void mo18795n0(int i10, AbstractC6580g abstractC6580g) {
            mo18780V0(i10, 2);
            mo18796o0(abstractC6580g);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: o0 */
        public final void mo18796o0(AbstractC6580g abstractC6580g) {
            mo18782X0(abstractC6580g.size());
            abstractC6580g.mo18519F(this);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: t0 */
        public final void mo18801t0(int i10, int i11) {
            mo18780V0(i10, 5);
            mo18802u0(i11);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: u0 */
        public final void mo18802u0(int i10) {
            try {
                byte[] bArr = this.f14517e;
                int i11 = this.f14520h;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f14520h = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14520h), Integer.valueOf(this.f14519g), 1), e10);
            }
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: v0 */
        public final void mo18803v0(int i10, long j10) {
            mo18780V0(i10, 1);
            mo18804w0(j10);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: w0 */
        public final void mo18804w0(long j10) {
            try {
                byte[] bArr = this.f14517e;
                int i10 = this.f14520h;
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
                this.f14520h = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14520h), Integer.valueOf(this.f14519g), 1), e10);
            }
        }
    }

    /* renamed from: com.google.protobuf.j$d */
    /* loaded from: classes2.dex */
    public static class d extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        d(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }

        d(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }
    }

    /* renamed from: com.google.protobuf.j$e */
    /* loaded from: classes2.dex */
    private static final class e extends b {

        /* renamed from: i */
        private final OutputStream f14521i;

        e(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f14521i = outputStream;
        }

        /* renamed from: h1 */
        private void m18817h1() {
            this.f14521i.write(this.f14513e, 0, this.f14515g);
            this.f14515g = 0;
        }

        /* renamed from: i1 */
        private void m18818i1(int i10) {
            if (this.f14514f - this.f14515g < i10) {
                m18817h1();
            }
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: D0 */
        public void mo18762D0(int i10, int i11) {
            m18818i1(20);
            m18812e1(i10, 0);
            m18811d1(i11);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: E0 */
        public void mo18763E0(int i10) {
            if (i10 >= 0) {
                mo18782X0(i10);
            } else {
                mo18784Z0(i10);
            }
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: H0 */
        void mo18766H0(int i10, InterfaceC6614r0 interfaceC6614r0, InterfaceC6582g1 interfaceC6582g1) {
            mo18780V0(i10, 2);
            m18821l1(interfaceC6614r0, interfaceC6582g1);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: I0 */
        public void mo18767I0(InterfaceC6614r0 interfaceC6614r0) {
            mo18782X0(interfaceC6614r0.mo19033c());
            interfaceC6614r0.mo19036l(this);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: J0 */
        public void mo18768J0(int i10, InterfaceC6614r0 interfaceC6614r0) {
            mo18780V0(1, 3);
            mo18781W0(2, i10);
            m18820k1(3, interfaceC6614r0);
            mo18780V0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: K0 */
        public void mo18769K0(int i10, AbstractC6580g abstractC6580g) {
            mo18780V0(1, 3);
            mo18781W0(2, i10);
            mo18795n0(3, abstractC6580g);
            mo18780V0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: T0 */
        public void mo18778T0(int i10, String str) {
            mo18780V0(i10, 2);
            mo18779U0(str);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: U0 */
        public void mo18779U0(String str) {
            int m19112g;
            try {
                int length = str.length() * 3;
                int m18727W = AbstractC6589j.m18727W(length);
                int i10 = m18727W + length;
                int i11 = this.f14514f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int m19111f = C6618s1.m19111f(str, bArr, 0, length);
                    mo18782X0(m19111f);
                    mo18454a(bArr, 0, m19111f);
                    return;
                }
                if (i10 > i11 - this.f14515g) {
                    m18817h1();
                }
                int m18727W2 = AbstractC6589j.m18727W(str.length());
                int i12 = this.f14515g;
                try {
                    if (m18727W2 == m18727W) {
                        int i13 = i12 + m18727W2;
                        this.f14515g = i13;
                        int m19111f2 = C6618s1.m19111f(str, this.f14513e, i13, this.f14514f - i13);
                        this.f14515g = i12;
                        m19112g = (m19111f2 - i12) - m18727W2;
                        m18813f1(m19112g);
                        this.f14515g = m19111f2;
                    } else {
                        m19112g = C6618s1.m19112g(str);
                        m18813f1(m19112g);
                        this.f14515g = C6618s1.m19111f(str, this.f14513e, this.f14515g, m19112g);
                    }
                    this.f14516h += m19112g;
                } catch (C6618s1.d e10) {
                    this.f14516h -= this.f14515g - i12;
                    this.f14515g = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new d(e11);
                }
            } catch (C6618s1.d e12) {
                m18787c0(str, e12);
            }
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: V0 */
        public void mo18780V0(int i10, int i11) {
            mo18782X0(C6621t1.m19190c(i10, i11));
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: W0 */
        public void mo18781W0(int i10, int i11) {
            m18818i1(20);
            m18812e1(i10, 0);
            m18813f1(i11);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: X0 */
        public void mo18782X0(int i10) {
            m18818i1(5);
            m18813f1(i10);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: Y0 */
        public void mo18783Y0(int i10, long j10) {
            m18818i1(20);
            m18812e1(i10, 0);
            m18814g1(j10);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: Z0 */
        public void mo18784Z0(long j10) {
            m18818i1(10);
            m18814g1(j10);
        }

        @Override // com.google.protobuf.AbstractC6589j, com.google.protobuf.AbstractC6577f
        /* renamed from: a */
        public void mo18454a(byte[] bArr, int i10, int i11) {
            m18819j1(bArr, i10, i11);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: b0 */
        public void mo18785b0() {
            if (this.f14515g > 0) {
                m18817h1();
            }
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: i0 */
        public void mo18790i0(byte b10) {
            if (this.f14515g == this.f14514f) {
                m18817h1();
            }
            m18808a1(b10);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: j0 */
        public void mo18791j0(int i10, boolean z10) {
            m18818i1(11);
            m18812e1(i10, 0);
            m18808a1(z10 ? (byte) 1 : (byte) 0);
        }

        /* renamed from: j1 */
        public void m18819j1(byte[] bArr, int i10, int i11) {
            int i12 = this.f14514f;
            int i13 = this.f14515g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f14513e, i13, i11);
                this.f14515g += i11;
            } else {
                int i14 = i12 - i13;
                System.arraycopy(bArr, i10, this.f14513e, i13, i14);
                int i15 = i10 + i14;
                i11 -= i14;
                this.f14515g = this.f14514f;
                this.f14516h += i14;
                m18817h1();
                if (i11 <= this.f14514f) {
                    System.arraycopy(bArr, i15, this.f14513e, 0, i11);
                    this.f14515g = i11;
                } else {
                    this.f14521i.write(bArr, i15, i11);
                }
            }
            this.f14516h += i11;
        }

        /* renamed from: k1 */
        public void m18820k1(int i10, InterfaceC6614r0 interfaceC6614r0) {
            mo18780V0(i10, 2);
            mo18767I0(interfaceC6614r0);
        }

        /* renamed from: l1 */
        void m18821l1(InterfaceC6614r0 interfaceC6614r0, InterfaceC6582g1 interfaceC6582g1) {
            mo18782X0(((AbstractC6562a) interfaceC6614r0).mo18377r(interfaceC6582g1));
            interfaceC6582g1.mo18547h(interfaceC6614r0, this.f14511a);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: m0 */
        public void mo18794m0(byte[] bArr, int i10, int i11) {
            mo18782X0(i11);
            m18819j1(bArr, i10, i11);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: n0 */
        public void mo18795n0(int i10, AbstractC6580g abstractC6580g) {
            mo18780V0(i10, 2);
            mo18796o0(abstractC6580g);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: o0 */
        public void mo18796o0(AbstractC6580g abstractC6580g) {
            mo18782X0(abstractC6580g.size());
            abstractC6580g.mo18519F(this);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: t0 */
        public void mo18801t0(int i10, int i11) {
            m18818i1(14);
            m18812e1(i10, 5);
            m18809b1(i11);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: u0 */
        public void mo18802u0(int i10) {
            m18818i1(4);
            m18809b1(i10);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: v0 */
        public void mo18803v0(int i10, long j10) {
            m18818i1(18);
            m18812e1(i10, 1);
            m18810c1(j10);
        }

        @Override // com.google.protobuf.AbstractC6589j
        /* renamed from: w0 */
        public void mo18804w0(long j10) {
            m18818i1(8);
            m18810c1(j10);
        }
    }

    private AbstractC6589j() {
    }

    /* renamed from: A */
    public static int m18705A(int i10, C6575e0 c6575e0) {
        return m18725U(i10) + m18706B(c6575e0);
    }

    /* renamed from: B */
    public static int m18706B(C6575e0 c6575e0) {
        return m18707C(c6575e0.m18445b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static int m18707C(int i10) {
        return m18727W(i10) + i10;
    }

    /* renamed from: D */
    public static int m18708D(int i10, InterfaceC6614r0 interfaceC6614r0) {
        return (m18725U(1) * 2) + m18726V(2, i10) + m18709E(3, interfaceC6614r0);
    }

    /* renamed from: E */
    public static int m18709E(int i10, InterfaceC6614r0 interfaceC6614r0) {
        return m18725U(i10) + m18711G(interfaceC6614r0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static int m18710F(int i10, InterfaceC6614r0 interfaceC6614r0, InterfaceC6582g1 interfaceC6582g1) {
        return m18725U(i10) + m18712H(interfaceC6614r0, interfaceC6582g1);
    }

    /* renamed from: G */
    public static int m18711G(InterfaceC6614r0 interfaceC6614r0) {
        return m18707C(interfaceC6614r0.mo19033c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static int m18712H(InterfaceC6614r0 interfaceC6614r0, InterfaceC6582g1 interfaceC6582g1) {
        return m18707C(((AbstractC6562a) interfaceC6614r0).mo18377r(interfaceC6582g1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static int m18713I(int i10) {
        return i10 > 4096 ? RecognitionOptions.AZTEC : i10;
    }

    /* renamed from: J */
    public static int m18714J(int i10, AbstractC6580g abstractC6580g) {
        return (m18725U(1) * 2) + m18726V(2, i10) + m18738g(3, abstractC6580g);
    }

    /* renamed from: K */
    public static int m18715K(int i10, int i11) {
        return m18725U(i10) + m18716L(i11);
    }

    /* renamed from: L */
    public static int m18716L(int i10) {
        return 4;
    }

    /* renamed from: M */
    public static int m18717M(int i10, long j10) {
        return m18725U(i10) + m18718N(j10);
    }

    /* renamed from: N */
    public static int m18718N(long j10) {
        return 8;
    }

    /* renamed from: O */
    public static int m18719O(int i10, int i11) {
        return m18725U(i10) + m18720P(i11);
    }

    /* renamed from: P */
    public static int m18720P(int i10) {
        return m18727W(m18730Z(i10));
    }

    /* renamed from: Q */
    public static int m18721Q(int i10, long j10) {
        return m18725U(i10) + m18722R(j10);
    }

    /* renamed from: R */
    public static int m18722R(long j10) {
        return m18729Y(m18731a0(j10));
    }

    /* renamed from: S */
    public static int m18723S(int i10, String str) {
        return m18725U(i10) + m18724T(str);
    }

    /* renamed from: T */
    public static int m18724T(String str) {
        int length;
        try {
            length = C6618s1.m19112g(str);
        } catch (C6618s1.d unused) {
            length = str.getBytes(C6633z.f14673b).length;
        }
        return m18707C(length);
    }

    /* renamed from: U */
    public static int m18725U(int i10) {
        return m18727W(C6621t1.m19190c(i10, 0));
    }

    /* renamed from: V */
    public static int m18726V(int i10, int i11) {
        return m18725U(i10) + m18727W(i11);
    }

    /* renamed from: W */
    public static int m18727W(int i10) {
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

    /* renamed from: X */
    public static int m18728X(int i10, long j10) {
        return m18725U(i10) + m18729Y(j10);
    }

    /* renamed from: Y */
    public static int m18729Y(long j10) {
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

    /* renamed from: Z */
    public static int m18730Z(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    /* renamed from: a0 */
    public static long m18731a0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    /* renamed from: d */
    public static int m18733d(int i10, boolean z10) {
        return m18725U(i10) + m18734e(z10);
    }

    /* renamed from: e */
    public static int m18734e(boolean z10) {
        return 1;
    }

    /* renamed from: e0 */
    public static AbstractC6589j m18735e0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    /* renamed from: f */
    public static int m18736f(byte[] bArr) {
        return m18707C(bArr.length);
    }

    /* renamed from: f0 */
    public static AbstractC6589j m18737f0(byte[] bArr) {
        return m18739g0(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public static int m18738g(int i10, AbstractC6580g abstractC6580g) {
        return m18725U(i10) + m18740h(abstractC6580g);
    }

    /* renamed from: g0 */
    public static AbstractC6589j m18739g0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    /* renamed from: h */
    public static int m18740h(AbstractC6580g abstractC6580g) {
        return m18707C(abstractC6580g.size());
    }

    /* renamed from: i */
    public static int m18741i(int i10, double d10) {
        return m18725U(i10) + m18742j(d10);
    }

    /* renamed from: j */
    public static int m18742j(double d10) {
        return 8;
    }

    /* renamed from: k */
    public static int m18743k(int i10, int i11) {
        return m18725U(i10) + m18744l(i11);
    }

    /* renamed from: l */
    public static int m18744l(int i10) {
        return m18755w(i10);
    }

    /* renamed from: m */
    public static int m18745m(int i10, int i11) {
        return m18725U(i10) + m18746n(i11);
    }

    /* renamed from: n */
    public static int m18746n(int i10) {
        return 4;
    }

    /* renamed from: o */
    public static int m18747o(int i10, long j10) {
        return m18725U(i10) + m18748p(j10);
    }

    /* renamed from: p */
    public static int m18748p(long j10) {
        return 8;
    }

    /* renamed from: q */
    public static int m18749q(int i10, float f10) {
        return m18725U(i10) + m18750r(f10);
    }

    /* renamed from: r */
    public static int m18750r(float f10) {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: s */
    public static int m18751s(int i10, InterfaceC6614r0 interfaceC6614r0, InterfaceC6582g1 interfaceC6582g1) {
        return (m18725U(i10) * 2) + m18753u(interfaceC6614r0, interfaceC6582g1);
    }

    @Deprecated
    /* renamed from: t */
    public static int m18752t(InterfaceC6614r0 interfaceC6614r0) {
        return interfaceC6614r0.mo19033c();
    }

    @Deprecated
    /* renamed from: u */
    static int m18753u(InterfaceC6614r0 interfaceC6614r0, InterfaceC6582g1 interfaceC6582g1) {
        return ((AbstractC6562a) interfaceC6614r0).mo18377r(interfaceC6582g1);
    }

    /* renamed from: v */
    public static int m18754v(int i10, int i11) {
        return m18725U(i10) + m18755w(i11);
    }

    /* renamed from: w */
    public static int m18755w(int i10) {
        if (i10 >= 0) {
            return m18727W(i10);
        }
        return 10;
    }

    /* renamed from: x */
    public static int m18756x(int i10, long j10) {
        return m18725U(i10) + m18757y(j10);
    }

    /* renamed from: y */
    public static int m18757y(long j10) {
        return m18729Y(j10);
    }

    /* renamed from: z */
    public static int m18758z(int i10, C6575e0 c6575e0) {
        return (m18725U(1) * 2) + m18726V(2, i10) + m18705A(3, c6575e0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: A0 */
    public final void m18759A0(int i10, InterfaceC6614r0 interfaceC6614r0, InterfaceC6582g1 interfaceC6582g1) {
        mo18780V0(i10, 3);
        m18761C0(interfaceC6614r0, interfaceC6582g1);
        mo18780V0(i10, 4);
    }

    @Deprecated
    /* renamed from: B0 */
    public final void m18760B0(InterfaceC6614r0 interfaceC6614r0) {
        interfaceC6614r0.mo19036l(this);
    }

    @Deprecated
    /* renamed from: C0 */
    final void m18761C0(InterfaceC6614r0 interfaceC6614r0, InterfaceC6582g1 interfaceC6582g1) {
        interfaceC6582g1.mo18547h(interfaceC6614r0, this.f14511a);
    }

    /* renamed from: D0 */
    public abstract void mo18762D0(int i10, int i11);

    /* renamed from: E0 */
    public abstract void mo18763E0(int i10);

    /* renamed from: F0 */
    public final void m18764F0(int i10, long j10) {
        mo18783Y0(i10, j10);
    }

    /* renamed from: G0 */
    public final void m18765G0(long j10) {
        mo18784Z0(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0 */
    public abstract void mo18766H0(int i10, InterfaceC6614r0 interfaceC6614r0, InterfaceC6582g1 interfaceC6582g1);

    /* renamed from: I0 */
    public abstract void mo18767I0(InterfaceC6614r0 interfaceC6614r0);

    /* renamed from: J0 */
    public abstract void mo18768J0(int i10, InterfaceC6614r0 interfaceC6614r0);

    /* renamed from: K0 */
    public abstract void mo18769K0(int i10, AbstractC6580g abstractC6580g);

    /* renamed from: L0 */
    public final void m18770L0(int i10, int i11) {
        mo18801t0(i10, i11);
    }

    /* renamed from: M0 */
    public final void m18771M0(int i10) {
        mo18802u0(i10);
    }

    /* renamed from: N0 */
    public final void m18772N0(int i10, long j10) {
        mo18803v0(i10, j10);
    }

    /* renamed from: O0 */
    public final void m18773O0(long j10) {
        mo18804w0(j10);
    }

    /* renamed from: P0 */
    public final void m18774P0(int i10, int i11) {
        mo18781W0(i10, m18730Z(i11));
    }

    /* renamed from: Q0 */
    public final void m18775Q0(int i10) {
        mo18782X0(m18730Z(i10));
    }

    /* renamed from: R0 */
    public final void m18776R0(int i10, long j10) {
        mo18783Y0(i10, m18731a0(j10));
    }

    /* renamed from: S0 */
    public final void m18777S0(long j10) {
        mo18784Z0(m18731a0(j10));
    }

    /* renamed from: T0 */
    public abstract void mo18778T0(int i10, String str);

    /* renamed from: U0 */
    public abstract void mo18779U0(String str);

    /* renamed from: V0 */
    public abstract void mo18780V0(int i10, int i11);

    /* renamed from: W0 */
    public abstract void mo18781W0(int i10, int i11);

    /* renamed from: X0 */
    public abstract void mo18782X0(int i10);

    /* renamed from: Y0 */
    public abstract void mo18783Y0(int i10, long j10);

    /* renamed from: Z0 */
    public abstract void mo18784Z0(long j10);

    @Override // com.google.protobuf.AbstractC6577f
    /* renamed from: a */
    public abstract void mo18454a(byte[] bArr, int i10, int i11);

    /* renamed from: b0 */
    public abstract void mo18785b0();

    /* renamed from: c */
    public final void m18786c() {
        if (mo18789h0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: c0 */
    final void m18787c0(String str, C6618s1.d dVar) {
        f14509c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C6633z.f14673b);
        try {
            mo18782X0(bytes.length);
            mo18454a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new d(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public boolean m18788d0() {
        return this.f14512b;
    }

    /* renamed from: h0 */
    public abstract int mo18789h0();

    /* renamed from: i0 */
    public abstract void mo18790i0(byte b10);

    /* renamed from: j0 */
    public abstract void mo18791j0(int i10, boolean z10);

    /* renamed from: k0 */
    public final void m18792k0(boolean z10) {
        mo18790i0(z10 ? (byte) 1 : (byte) 0);
    }

    /* renamed from: l0 */
    public final void m18793l0(byte[] bArr) {
        mo18794m0(bArr, 0, bArr.length);
    }

    /* renamed from: m0 */
    abstract void mo18794m0(byte[] bArr, int i10, int i11);

    /* renamed from: n0 */
    public abstract void mo18795n0(int i10, AbstractC6580g abstractC6580g);

    /* renamed from: o0 */
    public abstract void mo18796o0(AbstractC6580g abstractC6580g);

    /* renamed from: p0 */
    public final void m18797p0(int i10, double d10) {
        mo18803v0(i10, Double.doubleToRawLongBits(d10));
    }

    /* renamed from: q0 */
    public final void m18798q0(double d10) {
        mo18804w0(Double.doubleToRawLongBits(d10));
    }

    /* renamed from: r0 */
    public final void m18799r0(int i10, int i11) {
        mo18762D0(i10, i11);
    }

    /* renamed from: s0 */
    public final void m18800s0(int i10) {
        mo18763E0(i10);
    }

    /* renamed from: t0 */
    public abstract void mo18801t0(int i10, int i11);

    /* renamed from: u0 */
    public abstract void mo18802u0(int i10);

    /* renamed from: v0 */
    public abstract void mo18803v0(int i10, long j10);

    /* renamed from: w0 */
    public abstract void mo18804w0(long j10);

    /* renamed from: x0 */
    public final void m18805x0(int i10, float f10) {
        mo18801t0(i10, Float.floatToRawIntBits(f10));
    }

    /* renamed from: y0 */
    public final void m18806y0(float f10) {
        mo18802u0(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    /* renamed from: z0 */
    public final void m18807z0(int i10, InterfaceC6614r0 interfaceC6614r0) {
        mo18780V0(i10, 3);
        m18760B0(interfaceC6614r0);
        mo18780V0(i10, 4);
    }
}
