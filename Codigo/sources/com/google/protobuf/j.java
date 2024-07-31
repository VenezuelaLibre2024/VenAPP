package com.google.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.s1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class j extends f {

    /* renamed from: c */
    private static final Logger f13235c = Logger.getLogger(j.class.getName());

    /* renamed from: d */
    private static final boolean f13236d = r1.E();

    /* renamed from: a */
    k f13237a;

    /* renamed from: b */
    private boolean f13238b;

    /* loaded from: classes2.dex */
    public static abstract class b extends j {

        /* renamed from: e */
        final byte[] f13239e;

        /* renamed from: f */
        final int f13240f;

        /* renamed from: g */
        int f13241g;

        /* renamed from: h */
        int f13242h;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f13239e = bArr;
            this.f13240f = bArr.length;
        }

        final void a1(byte b10) {
            byte[] bArr = this.f13239e;
            int i10 = this.f13241g;
            this.f13241g = i10 + 1;
            bArr[i10] = b10;
            this.f13242h++;
        }

        final void b1(int i10) {
            byte[] bArr = this.f13239e;
            int i11 = this.f13241g;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f13241g = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f13242h += 4;
        }

        final void c1(long j10) {
            byte[] bArr = this.f13239e;
            int i10 = this.f13241g;
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
            this.f13241g = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f13242h += 8;
        }

        final void d1(int i10) {
            if (i10 >= 0) {
                f1(i10);
            } else {
                g1(i10);
            }
        }

        final void e1(int i10, int i11) {
            f1(t1.c(i10, i11));
        }

        final void f1(int i10) {
            if (!j.f13236d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f13239e;
                    int i11 = this.f13241g;
                    this.f13241g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | RecognitionOptions.ITF);
                    this.f13242h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f13239e;
                int i12 = this.f13241g;
                this.f13241g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f13242h++;
                return;
            }
            long j10 = this.f13241g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f13239e;
                int i13 = this.f13241g;
                this.f13241g = i13 + 1;
                r1.K(bArr3, i13, (byte) ((i10 & 127) | RecognitionOptions.ITF));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f13239e;
            int i14 = this.f13241g;
            this.f13241g = i14 + 1;
            r1.K(bArr4, i14, (byte) i10);
            this.f13242h += (int) (this.f13241g - j10);
        }

        final void g1(long j10) {
            if (!j.f13236d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f13239e;
                    int i10 = this.f13241g;
                    this.f13241g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | RecognitionOptions.ITF);
                    this.f13242h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f13239e;
                int i11 = this.f13241g;
                this.f13241g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f13242h++;
                return;
            }
            long j11 = this.f13241g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f13239e;
                int i12 = this.f13241g;
                this.f13241g = i12 + 1;
                r1.K(bArr3, i12, (byte) ((((int) j10) & 127) | RecognitionOptions.ITF));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f13239e;
            int i13 = this.f13241g;
            this.f13241g = i13 + 1;
            r1.K(bArr4, i13, (byte) j10);
            this.f13242h += (int) (this.f13241g - j11);
        }

        @Override // com.google.protobuf.j
        public final int h0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends j {

        /* renamed from: e */
        private final byte[] f13243e;

        /* renamed from: f */
        private final int f13244f;

        /* renamed from: g */
        private final int f13245g;

        /* renamed from: h */
        private int f13246h;

        c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f13243e = bArr;
            this.f13244f = i10;
            this.f13246h = i10;
            this.f13245g = i12;
        }

        @Override // com.google.protobuf.j
        public final void D0(int i10, int i11) {
            V0(i10, 0);
            E0(i11);
        }

        @Override // com.google.protobuf.j
        public final void E0(int i10) {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Z0(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.protobuf.j
        public final void H0(int i10, r0 r0Var, g1 g1Var) {
            V0(i10, 2);
            X0(((com.google.protobuf.a) r0Var).r(g1Var));
            g1Var.h(r0Var, this.f13237a);
        }

        @Override // com.google.protobuf.j
        public final void I0(r0 r0Var) {
            X0(r0Var.c());
            r0Var.l(this);
        }

        @Override // com.google.protobuf.j
        public final void J0(int i10, r0 r0Var) {
            V0(1, 3);
            W0(2, i10);
            b1(3, r0Var);
            V0(1, 4);
        }

        @Override // com.google.protobuf.j
        public final void K0(int i10, g gVar) {
            V0(1, 3);
            W0(2, i10);
            n0(3, gVar);
            V0(1, 4);
        }

        @Override // com.google.protobuf.j
        public final void T0(int i10, String str) {
            V0(i10, 2);
            U0(str);
        }

        @Override // com.google.protobuf.j
        public final void U0(String str) {
            int f10;
            int i10 = this.f13246h;
            try {
                int W = j.W(str.length() * 3);
                int W2 = j.W(str.length());
                if (W2 == W) {
                    int i11 = i10 + W2;
                    this.f13246h = i11;
                    f10 = s1.f(str, this.f13243e, i11, h0());
                    this.f13246h = i10;
                    X0((f10 - i10) - W2);
                } else {
                    X0(s1.g(str));
                    f10 = s1.f(str, this.f13243e, this.f13246h, h0());
                }
                this.f13246h = f10;
            } catch (s1.d e10) {
                this.f13246h = i10;
                c0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        @Override // com.google.protobuf.j
        public final void V0(int i10, int i11) {
            X0(t1.c(i10, i11));
        }

        @Override // com.google.protobuf.j
        public final void W0(int i10, int i11) {
            V0(i10, 0);
            X0(i11);
        }

        @Override // com.google.protobuf.j
        public final void X0(int i10) {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f13243e;
                    int i11 = this.f13246h;
                    this.f13246h = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | RecognitionOptions.ITF);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13246h), Integer.valueOf(this.f13245g), 1), e10);
                }
            }
            byte[] bArr2 = this.f13243e;
            int i12 = this.f13246h;
            this.f13246h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.protobuf.j
        public final void Y0(int i10, long j10) {
            V0(i10, 0);
            Z0(j10);
        }

        @Override // com.google.protobuf.j
        public final void Z0(long j10) {
            if (j.f13236d && h0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f13243e;
                    int i10 = this.f13246h;
                    this.f13246h = i10 + 1;
                    r1.K(bArr, i10, (byte) ((((int) j10) & 127) | RecognitionOptions.ITF));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f13243e;
                int i11 = this.f13246h;
                this.f13246h = i11 + 1;
                r1.K(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f13243e;
                    int i12 = this.f13246h;
                    this.f13246h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | RecognitionOptions.ITF);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13246h), Integer.valueOf(this.f13245g), 1), e10);
                }
            }
            byte[] bArr4 = this.f13243e;
            int i13 = this.f13246h;
            this.f13246h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.google.protobuf.j, com.google.protobuf.f
        public final void a(byte[] bArr, int i10, int i11) {
            a1(bArr, i10, i11);
        }

        public final void a1(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f13243e, this.f13246h, i11);
                this.f13246h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13246h), Integer.valueOf(this.f13245g), Integer.valueOf(i11)), e10);
            }
        }

        @Override // com.google.protobuf.j
        public void b0() {
        }

        public final void b1(int i10, r0 r0Var) {
            V0(i10, 2);
            I0(r0Var);
        }

        @Override // com.google.protobuf.j
        public final int h0() {
            return this.f13245g - this.f13246h;
        }

        @Override // com.google.protobuf.j
        public final void i0(byte b10) {
            try {
                byte[] bArr = this.f13243e;
                int i10 = this.f13246h;
                this.f13246h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13246h), Integer.valueOf(this.f13245g), 1), e10);
            }
        }

        @Override // com.google.protobuf.j
        public final void j0(int i10, boolean z10) {
            V0(i10, 0);
            i0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.j
        public final void m0(byte[] bArr, int i10, int i11) {
            X0(i11);
            a1(bArr, i10, i11);
        }

        @Override // com.google.protobuf.j
        public final void n0(int i10, g gVar) {
            V0(i10, 2);
            o0(gVar);
        }

        @Override // com.google.protobuf.j
        public final void o0(g gVar) {
            X0(gVar.size());
            gVar.F(this);
        }

        @Override // com.google.protobuf.j
        public final void t0(int i10, int i11) {
            V0(i10, 5);
            u0(i11);
        }

        @Override // com.google.protobuf.j
        public final void u0(int i10) {
            try {
                byte[] bArr = this.f13243e;
                int i11 = this.f13246h;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f13246h = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13246h), Integer.valueOf(this.f13245g), 1), e10);
            }
        }

        @Override // com.google.protobuf.j
        public final void v0(int i10, long j10) {
            V0(i10, 1);
            w0(j10);
        }

        @Override // com.google.protobuf.j
        public final void w0(long j10) {
            try {
                byte[] bArr = this.f13243e;
                int i10 = this.f13246h;
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
                this.f13246h = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13246h), Integer.valueOf(this.f13245g), 1), e10);
            }
        }
    }

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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class e extends b {

        /* renamed from: i */
        private final OutputStream f13247i;

        e(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f13247i = outputStream;
        }

        private void h1() {
            this.f13247i.write(this.f13239e, 0, this.f13241g);
            this.f13241g = 0;
        }

        private void i1(int i10) {
            if (this.f13240f - this.f13241g < i10) {
                h1();
            }
        }

        @Override // com.google.protobuf.j
        public void D0(int i10, int i11) {
            i1(20);
            e1(i10, 0);
            d1(i11);
        }

        @Override // com.google.protobuf.j
        public void E0(int i10) {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Z0(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.protobuf.j
        public void H0(int i10, r0 r0Var, g1 g1Var) {
            V0(i10, 2);
            l1(r0Var, g1Var);
        }

        @Override // com.google.protobuf.j
        public void I0(r0 r0Var) {
            X0(r0Var.c());
            r0Var.l(this);
        }

        @Override // com.google.protobuf.j
        public void J0(int i10, r0 r0Var) {
            V0(1, 3);
            W0(2, i10);
            k1(3, r0Var);
            V0(1, 4);
        }

        @Override // com.google.protobuf.j
        public void K0(int i10, g gVar) {
            V0(1, 3);
            W0(2, i10);
            n0(3, gVar);
            V0(1, 4);
        }

        @Override // com.google.protobuf.j
        public void T0(int i10, String str) {
            V0(i10, 2);
            U0(str);
        }

        @Override // com.google.protobuf.j
        public void U0(String str) {
            int g10;
            try {
                int length = str.length() * 3;
                int W = j.W(length);
                int i10 = W + length;
                int i11 = this.f13240f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int f10 = s1.f(str, bArr, 0, length);
                    X0(f10);
                    a(bArr, 0, f10);
                    return;
                }
                if (i10 > i11 - this.f13241g) {
                    h1();
                }
                int W2 = j.W(str.length());
                int i12 = this.f13241g;
                try {
                    if (W2 == W) {
                        int i13 = i12 + W2;
                        this.f13241g = i13;
                        int f11 = s1.f(str, this.f13239e, i13, this.f13240f - i13);
                        this.f13241g = i12;
                        g10 = (f11 - i12) - W2;
                        f1(g10);
                        this.f13241g = f11;
                    } else {
                        g10 = s1.g(str);
                        f1(g10);
                        this.f13241g = s1.f(str, this.f13239e, this.f13241g, g10);
                    }
                    this.f13242h += g10;
                } catch (s1.d e10) {
                    this.f13242h -= this.f13241g - i12;
                    this.f13241g = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new d(e11);
                }
            } catch (s1.d e12) {
                c0(str, e12);
            }
        }

        @Override // com.google.protobuf.j
        public void V0(int i10, int i11) {
            X0(t1.c(i10, i11));
        }

        @Override // com.google.protobuf.j
        public void W0(int i10, int i11) {
            i1(20);
            e1(i10, 0);
            f1(i11);
        }

        @Override // com.google.protobuf.j
        public void X0(int i10) {
            i1(5);
            f1(i10);
        }

        @Override // com.google.protobuf.j
        public void Y0(int i10, long j10) {
            i1(20);
            e1(i10, 0);
            g1(j10);
        }

        @Override // com.google.protobuf.j
        public void Z0(long j10) {
            i1(10);
            g1(j10);
        }

        @Override // com.google.protobuf.j, com.google.protobuf.f
        public void a(byte[] bArr, int i10, int i11) {
            j1(bArr, i10, i11);
        }

        @Override // com.google.protobuf.j
        public void b0() {
            if (this.f13241g > 0) {
                h1();
            }
        }

        @Override // com.google.protobuf.j
        public void i0(byte b10) {
            if (this.f13241g == this.f13240f) {
                h1();
            }
            a1(b10);
        }

        @Override // com.google.protobuf.j
        public void j0(int i10, boolean z10) {
            i1(11);
            e1(i10, 0);
            a1(z10 ? (byte) 1 : (byte) 0);
        }

        public void j1(byte[] bArr, int i10, int i11) {
            int i12 = this.f13240f;
            int i13 = this.f13241g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f13239e, i13, i11);
                this.f13241g += i11;
            } else {
                int i14 = i12 - i13;
                System.arraycopy(bArr, i10, this.f13239e, i13, i14);
                int i15 = i10 + i14;
                i11 -= i14;
                this.f13241g = this.f13240f;
                this.f13242h += i14;
                h1();
                if (i11 <= this.f13240f) {
                    System.arraycopy(bArr, i15, this.f13239e, 0, i11);
                    this.f13241g = i11;
                } else {
                    this.f13247i.write(bArr, i15, i11);
                }
            }
            this.f13242h += i11;
        }

        public void k1(int i10, r0 r0Var) {
            V0(i10, 2);
            I0(r0Var);
        }

        void l1(r0 r0Var, g1 g1Var) {
            X0(((com.google.protobuf.a) r0Var).r(g1Var));
            g1Var.h(r0Var, this.f13237a);
        }

        @Override // com.google.protobuf.j
        public void m0(byte[] bArr, int i10, int i11) {
            X0(i11);
            j1(bArr, i10, i11);
        }

        @Override // com.google.protobuf.j
        public void n0(int i10, g gVar) {
            V0(i10, 2);
            o0(gVar);
        }

        @Override // com.google.protobuf.j
        public void o0(g gVar) {
            X0(gVar.size());
            gVar.F(this);
        }

        @Override // com.google.protobuf.j
        public void t0(int i10, int i11) {
            i1(14);
            e1(i10, 5);
            b1(i11);
        }

        @Override // com.google.protobuf.j
        public void u0(int i10) {
            i1(4);
            b1(i10);
        }

        @Override // com.google.protobuf.j
        public void v0(int i10, long j10) {
            i1(18);
            e1(i10, 1);
            c1(j10);
        }

        @Override // com.google.protobuf.j
        public void w0(long j10) {
            i1(8);
            c1(j10);
        }
    }

    private j() {
    }

    /* synthetic */ j(a aVar) {
        this();
    }

    public static int A(int i10, e0 e0Var) {
        return U(i10) + B(e0Var);
    }

    public static int B(e0 e0Var) {
        return C(e0Var.b());
    }

    public static int C(int i10) {
        return W(i10) + i10;
    }

    public static int D(int i10, r0 r0Var) {
        return (U(1) * 2) + V(2, i10) + E(3, r0Var);
    }

    public static int E(int i10, r0 r0Var) {
        return U(i10) + G(r0Var);
    }

    public static int F(int i10, r0 r0Var, g1 g1Var) {
        return U(i10) + H(r0Var, g1Var);
    }

    public static int G(r0 r0Var) {
        return C(r0Var.c());
    }

    public static int H(r0 r0Var, g1 g1Var) {
        return C(((com.google.protobuf.a) r0Var).r(g1Var));
    }

    public static int I(int i10) {
        return i10 > 4096 ? RecognitionOptions.AZTEC : i10;
    }

    public static int J(int i10, g gVar) {
        return (U(1) * 2) + V(2, i10) + g(3, gVar);
    }

    public static int K(int i10, int i11) {
        return U(i10) + L(i11);
    }

    public static int L(int i10) {
        return 4;
    }

    public static int M(int i10, long j10) {
        return U(i10) + N(j10);
    }

    public static int N(long j10) {
        return 8;
    }

    public static int O(int i10, int i11) {
        return U(i10) + P(i11);
    }

    public static int P(int i10) {
        return W(Z(i10));
    }

    public static int Q(int i10, long j10) {
        return U(i10) + R(j10);
    }

    public static int R(long j10) {
        return Y(a0(j10));
    }

    public static int S(int i10, String str) {
        return U(i10) + T(str);
    }

    public static int T(String str) {
        int length;
        try {
            length = s1.g(str);
        } catch (s1.d unused) {
            length = str.getBytes(z.f13399b).length;
        }
        return C(length);
    }

    public static int U(int i10) {
        return W(t1.c(i10, 0));
    }

    public static int V(int i10, int i11) {
        return U(i10) + W(i11);
    }

    public static int W(int i10) {
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

    public static int X(int i10, long j10) {
        return U(i10) + Y(j10);
    }

    public static int Y(long j10) {
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

    public static int Z(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long a0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int d(int i10, boolean z10) {
        return U(i10) + e(z10);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static j e0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static j f0(byte[] bArr) {
        return g0(bArr, 0, bArr.length);
    }

    public static int g(int i10, g gVar) {
        return U(i10) + h(gVar);
    }

    public static j g0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int h(g gVar) {
        return C(gVar.size());
    }

    public static int i(int i10, double d10) {
        return U(i10) + j(d10);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int k(int i10, int i11) {
        return U(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return U(i10) + n(i11);
    }

    public static int n(int i10) {
        return 4;
    }

    public static int o(int i10, long j10) {
        return U(i10) + p(j10);
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(int i10, float f10) {
        return U(i10) + r(f10);
    }

    public static int r(float f10) {
        return 4;
    }

    @Deprecated
    public static int s(int i10, r0 r0Var, g1 g1Var) {
        return (U(i10) * 2) + u(r0Var, g1Var);
    }

    @Deprecated
    public static int t(r0 r0Var) {
        return r0Var.c();
    }

    @Deprecated
    static int u(r0 r0Var, g1 g1Var) {
        return ((com.google.protobuf.a) r0Var).r(g1Var);
    }

    public static int v(int i10, int i11) {
        return U(i10) + w(i11);
    }

    public static int w(int i10) {
        if (i10 >= 0) {
            return W(i10);
        }
        return 10;
    }

    public static int x(int i10, long j10) {
        return U(i10) + y(j10);
    }

    public static int y(long j10) {
        return Y(j10);
    }

    public static int z(int i10, e0 e0Var) {
        return (U(1) * 2) + V(2, i10) + A(3, e0Var);
    }

    @Deprecated
    public final void A0(int i10, r0 r0Var, g1 g1Var) {
        V0(i10, 3);
        C0(r0Var, g1Var);
        V0(i10, 4);
    }

    @Deprecated
    public final void B0(r0 r0Var) {
        r0Var.l(this);
    }

    @Deprecated
    final void C0(r0 r0Var, g1 g1Var) {
        g1Var.h(r0Var, this.f13237a);
    }

    public abstract void D0(int i10, int i11);

    public abstract void E0(int i10);

    public final void F0(int i10, long j10) {
        Y0(i10, j10);
    }

    public final void G0(long j10) {
        Z0(j10);
    }

    public abstract void H0(int i10, r0 r0Var, g1 g1Var);

    public abstract void I0(r0 r0Var);

    public abstract void J0(int i10, r0 r0Var);

    public abstract void K0(int i10, g gVar);

    public final void L0(int i10, int i11) {
        t0(i10, i11);
    }

    public final void M0(int i10) {
        u0(i10);
    }

    public final void N0(int i10, long j10) {
        v0(i10, j10);
    }

    public final void O0(long j10) {
        w0(j10);
    }

    public final void P0(int i10, int i11) {
        W0(i10, Z(i11));
    }

    public final void Q0(int i10) {
        X0(Z(i10));
    }

    public final void R0(int i10, long j10) {
        Y0(i10, a0(j10));
    }

    public final void S0(long j10) {
        Z0(a0(j10));
    }

    public abstract void T0(int i10, String str);

    public abstract void U0(String str);

    public abstract void V0(int i10, int i11);

    public abstract void W0(int i10, int i11);

    public abstract void X0(int i10);

    public abstract void Y0(int i10, long j10);

    public abstract void Z0(long j10);

    @Override // com.google.protobuf.f
    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void b0();

    public final void c() {
        if (h0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void c0(String str, s1.d dVar) {
        f13235c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(z.f13399b);
        try {
            X0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new d(e10);
        }
    }

    public boolean d0() {
        return this.f13238b;
    }

    public abstract int h0();

    public abstract void i0(byte b10);

    public abstract void j0(int i10, boolean z10);

    public final void k0(boolean z10) {
        i0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void l0(byte[] bArr) {
        m0(bArr, 0, bArr.length);
    }

    abstract void m0(byte[] bArr, int i10, int i11);

    public abstract void n0(int i10, g gVar);

    public abstract void o0(g gVar);

    public final void p0(int i10, double d10) {
        v0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void q0(double d10) {
        w0(Double.doubleToRawLongBits(d10));
    }

    public final void r0(int i10, int i11) {
        D0(i10, i11);
    }

    public final void s0(int i10) {
        E0(i10);
    }

    public abstract void t0(int i10, int i11);

    public abstract void u0(int i10);

    public abstract void v0(int i10, long j10);

    public abstract void w0(long j10);

    public final void x0(int i10, float f10) {
        t0(i10, Float.floatToRawIntBits(f10));
    }

    public final void y0(float f10) {
        u0(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void z0(int i10, r0 r0Var) {
        V0(i10, 3);
        B0(r0Var);
        V0(i10, 4);
    }
}
