package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class k extends g {

    /* renamed from: c */
    private static final Logger f4193c = Logger.getLogger(k.class.getName());

    /* renamed from: d */
    private static final boolean f4194d = r1.C();

    /* renamed from: a */
    l f4195a;

    /* renamed from: b */
    private boolean f4196b;

    /* loaded from: classes.dex */
    public static abstract class b extends k {

        /* renamed from: e */
        final byte[] f4197e;

        /* renamed from: f */
        final int f4198f;

        /* renamed from: g */
        int f4199g;

        /* renamed from: h */
        int f4200h;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f4197e = bArr;
            this.f4198f = bArr.length;
        }

        final void b1(byte b10) {
            byte[] bArr = this.f4197e;
            int i10 = this.f4199g;
            this.f4199g = i10 + 1;
            bArr[i10] = b10;
            this.f4200h++;
        }

        final void c1(int i10) {
            byte[] bArr = this.f4197e;
            int i11 = this.f4199g;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f4199g = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f4200h += 4;
        }

        final void d1(long j10) {
            byte[] bArr = this.f4197e;
            int i10 = this.f4199g;
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
            this.f4199g = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f4200h += 8;
        }

        final void e1(int i10) {
            if (i10 >= 0) {
                g1(i10);
            } else {
                h1(i10);
            }
        }

        final void f1(int i10, int i11) {
            g1(t1.c(i10, i11));
        }

        final void g1(int i10) {
            if (!k.f4194d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f4197e;
                    int i11 = this.f4199g;
                    this.f4199g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | RecognitionOptions.ITF);
                    this.f4200h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f4197e;
                int i12 = this.f4199g;
                this.f4199g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f4200h++;
                return;
            }
            long j10 = this.f4199g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f4197e;
                int i13 = this.f4199g;
                this.f4199g = i13 + 1;
                r1.H(bArr3, i13, (byte) ((i10 & 127) | RecognitionOptions.ITF));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f4197e;
            int i14 = this.f4199g;
            this.f4199g = i14 + 1;
            r1.H(bArr4, i14, (byte) i10);
            this.f4200h += (int) (this.f4199g - j10);
        }

        final void h1(long j10) {
            if (!k.f4194d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f4197e;
                    int i10 = this.f4199g;
                    this.f4199g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | RecognitionOptions.ITF);
                    this.f4200h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f4197e;
                int i11 = this.f4199g;
                this.f4199g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f4200h++;
                return;
            }
            long j11 = this.f4199g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f4197e;
                int i12 = this.f4199g;
                this.f4199g = i12 + 1;
                r1.H(bArr3, i12, (byte) ((((int) j10) & 127) | RecognitionOptions.ITF));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f4197e;
            int i13 = this.f4199g;
            this.f4199g = i13 + 1;
            r1.H(bArr4, i13, (byte) j10);
            this.f4200h += (int) (this.f4199g - j11);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int i0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* loaded from: classes.dex */
    public static class c extends k {

        /* renamed from: e */
        private final byte[] f4201e;

        /* renamed from: f */
        private final int f4202f;

        /* renamed from: g */
        private final int f4203g;

        /* renamed from: h */
        private int f4204h;

        c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f4201e = bArr;
            this.f4202f = i10;
            this.f4204h = i10;
            this.f4203g = i12;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void E0(int i10, int i11) {
            W0(i10, 0);
            F0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void F0(int i10) {
            if (i10 >= 0) {
                Y0(i10);
            } else {
                a1(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.datastore.preferences.protobuf.k
        public final void I0(int i10, r0 r0Var, g1 g1Var) {
            W0(i10, 2);
            Y0(((androidx.datastore.preferences.protobuf.a) r0Var).k(g1Var));
            g1Var.i(r0Var, this.f4195a);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void J0(r0 r0Var) {
            Y0(r0Var.c());
            r0Var.h(this);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void K0(int i10, r0 r0Var) {
            W0(1, 3);
            X0(2, i10);
            c1(3, r0Var);
            W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void L0(int i10, h hVar) {
            W0(1, 3);
            X0(2, i10);
            o0(3, hVar);
            W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void U0(int i10, String str) {
            W0(i10, 2);
            V0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void V0(String str) {
            int f10;
            int i10 = this.f4204h;
            try {
                int X = k.X(str.length() * 3);
                int X2 = k.X(str.length());
                if (X2 == X) {
                    int i11 = i10 + X2;
                    this.f4204h = i11;
                    f10 = s1.f(str, this.f4201e, i11, i0());
                    this.f4204h = i10;
                    Y0((f10 - i10) - X2);
                } else {
                    Y0(s1.g(str));
                    f10 = s1.f(str, this.f4201e, this.f4204h, i0());
                }
                this.f4204h = f10;
            } catch (s1.d e10) {
                this.f4204h = i10;
                d0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void W0(int i10, int i11) {
            Y0(t1.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void X0(int i10, int i11) {
            W0(i10, 0);
            Y0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void Y0(int i10) {
            if (!k.f4194d || androidx.datastore.preferences.protobuf.d.c() || i0() < 5) {
                while ((i10 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f4201e;
                        int i11 = this.f4204h;
                        this.f4204h = i11 + 1;
                        bArr[i11] = (byte) ((i10 & 127) | RecognitionOptions.ITF);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4204h), Integer.valueOf(this.f4203g), 1), e10);
                    }
                }
                byte[] bArr2 = this.f4201e;
                int i12 = this.f4204h;
                this.f4204h = i12 + 1;
                bArr2[i12] = (byte) i10;
                return;
            }
            if ((i10 & (-128)) == 0) {
                byte[] bArr3 = this.f4201e;
                int i13 = this.f4204h;
                this.f4204h = i13 + 1;
                r1.H(bArr3, i13, (byte) i10);
                return;
            }
            byte[] bArr4 = this.f4201e;
            int i14 = this.f4204h;
            this.f4204h = i14 + 1;
            r1.H(bArr4, i14, (byte) (i10 | RecognitionOptions.ITF));
            int i15 = i10 >>> 7;
            if ((i15 & (-128)) == 0) {
                byte[] bArr5 = this.f4201e;
                int i16 = this.f4204h;
                this.f4204h = i16 + 1;
                r1.H(bArr5, i16, (byte) i15);
                return;
            }
            byte[] bArr6 = this.f4201e;
            int i17 = this.f4204h;
            this.f4204h = i17 + 1;
            r1.H(bArr6, i17, (byte) (i15 | RecognitionOptions.ITF));
            int i18 = i15 >>> 7;
            if ((i18 & (-128)) == 0) {
                byte[] bArr7 = this.f4201e;
                int i19 = this.f4204h;
                this.f4204h = i19 + 1;
                r1.H(bArr7, i19, (byte) i18);
                return;
            }
            byte[] bArr8 = this.f4201e;
            int i20 = this.f4204h;
            this.f4204h = i20 + 1;
            r1.H(bArr8, i20, (byte) (i18 | RecognitionOptions.ITF));
            int i21 = i18 >>> 7;
            if ((i21 & (-128)) == 0) {
                byte[] bArr9 = this.f4201e;
                int i22 = this.f4204h;
                this.f4204h = i22 + 1;
                r1.H(bArr9, i22, (byte) i21);
                return;
            }
            byte[] bArr10 = this.f4201e;
            int i23 = this.f4204h;
            this.f4204h = i23 + 1;
            r1.H(bArr10, i23, (byte) (i21 | RecognitionOptions.ITF));
            byte[] bArr11 = this.f4201e;
            int i24 = this.f4204h;
            this.f4204h = i24 + 1;
            r1.H(bArr11, i24, (byte) (i21 >>> 7));
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void Z0(int i10, long j10) {
            W0(i10, 0);
            a1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.k, androidx.datastore.preferences.protobuf.g
        public final void a(byte[] bArr, int i10, int i11) {
            b1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void a1(long j10) {
            if (k.f4194d && i0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f4201e;
                    int i10 = this.f4204h;
                    this.f4204h = i10 + 1;
                    r1.H(bArr, i10, (byte) ((((int) j10) & 127) | RecognitionOptions.ITF));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f4201e;
                int i11 = this.f4204h;
                this.f4204h = i11 + 1;
                r1.H(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f4201e;
                    int i12 = this.f4204h;
                    this.f4204h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | RecognitionOptions.ITF);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4204h), Integer.valueOf(this.f4203g), 1), e10);
                }
            }
            byte[] bArr4 = this.f4201e;
            int i13 = this.f4204h;
            this.f4204h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void b1(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f4201e, this.f4204h, i11);
                this.f4204h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4204h), Integer.valueOf(this.f4203g), Integer.valueOf(i11)), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void c0() {
        }

        public final void c1(int i10, r0 r0Var) {
            W0(i10, 2);
            J0(r0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int i0() {
            return this.f4203g - this.f4204h;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void j0(byte b10) {
            try {
                byte[] bArr = this.f4201e;
                int i10 = this.f4204h;
                this.f4204h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4204h), Integer.valueOf(this.f4203g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void k0(int i10, boolean z10) {
            W0(i10, 0);
            j0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void n0(byte[] bArr, int i10, int i11) {
            Y0(i11);
            b1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void o0(int i10, h hVar) {
            W0(i10, 2);
            p0(hVar);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void p0(h hVar) {
            Y0(hVar.size());
            hVar.E(this);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void u0(int i10, int i11) {
            W0(i10, 5);
            v0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void v0(int i10) {
            try {
                byte[] bArr = this.f4201e;
                int i11 = this.f4204h;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f4204h = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4204h), Integer.valueOf(this.f4203g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void w0(int i10, long j10) {
            W0(i10, 1);
            x0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void x0(long j10) {
            try {
                byte[] bArr = this.f4201e;
                int i10 = this.f4204h;
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
                this.f4204h = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4204h), Integer.valueOf(this.f4203g), 1), e10);
            }
        }
    }

    /* loaded from: classes.dex */
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
    /* loaded from: classes.dex */
    public static final class e extends b {

        /* renamed from: i */
        private final OutputStream f4205i;

        e(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f4205i = outputStream;
        }

        private void i1() {
            this.f4205i.write(this.f4197e, 0, this.f4199g);
            this.f4199g = 0;
        }

        private void j1(int i10) {
            if (this.f4198f - this.f4199g < i10) {
                i1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void E0(int i10, int i11) {
            j1(20);
            f1(i10, 0);
            e1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void F0(int i10) {
            if (i10 >= 0) {
                Y0(i10);
            } else {
                a1(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.datastore.preferences.protobuf.k
        public void I0(int i10, r0 r0Var, g1 g1Var) {
            W0(i10, 2);
            m1(r0Var, g1Var);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void J0(r0 r0Var) {
            Y0(r0Var.c());
            r0Var.h(this);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void K0(int i10, r0 r0Var) {
            W0(1, 3);
            X0(2, i10);
            l1(3, r0Var);
            W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void L0(int i10, h hVar) {
            W0(1, 3);
            X0(2, i10);
            o0(3, hVar);
            W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void U0(int i10, String str) {
            W0(i10, 2);
            V0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void V0(String str) {
            int g10;
            try {
                int length = str.length() * 3;
                int X = k.X(length);
                int i10 = X + length;
                int i11 = this.f4198f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int f10 = s1.f(str, bArr, 0, length);
                    Y0(f10);
                    a(bArr, 0, f10);
                    return;
                }
                if (i10 > i11 - this.f4199g) {
                    i1();
                }
                int X2 = k.X(str.length());
                int i12 = this.f4199g;
                try {
                    if (X2 == X) {
                        int i13 = i12 + X2;
                        this.f4199g = i13;
                        int f11 = s1.f(str, this.f4197e, i13, this.f4198f - i13);
                        this.f4199g = i12;
                        g10 = (f11 - i12) - X2;
                        g1(g10);
                        this.f4199g = f11;
                    } else {
                        g10 = s1.g(str);
                        g1(g10);
                        this.f4199g = s1.f(str, this.f4197e, this.f4199g, g10);
                    }
                    this.f4200h += g10;
                } catch (s1.d e10) {
                    this.f4200h -= this.f4199g - i12;
                    this.f4199g = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new d(e11);
                }
            } catch (s1.d e12) {
                d0(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void W0(int i10, int i11) {
            Y0(t1.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void X0(int i10, int i11) {
            j1(20);
            f1(i10, 0);
            g1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void Y0(int i10) {
            j1(5);
            g1(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void Z0(int i10, long j10) {
            j1(20);
            f1(i10, 0);
            h1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.k, androidx.datastore.preferences.protobuf.g
        public void a(byte[] bArr, int i10, int i11) {
            k1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void a1(long j10) {
            j1(10);
            h1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void c0() {
            if (this.f4199g > 0) {
                i1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void j0(byte b10) {
            if (this.f4199g == this.f4198f) {
                i1();
            }
            b1(b10);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void k0(int i10, boolean z10) {
            j1(11);
            f1(i10, 0);
            b1(z10 ? (byte) 1 : (byte) 0);
        }

        public void k1(byte[] bArr, int i10, int i11) {
            int i12 = this.f4198f;
            int i13 = this.f4199g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f4197e, i13, i11);
                this.f4199g += i11;
            } else {
                int i14 = i12 - i13;
                System.arraycopy(bArr, i10, this.f4197e, i13, i14);
                int i15 = i10 + i14;
                i11 -= i14;
                this.f4199g = this.f4198f;
                this.f4200h += i14;
                i1();
                if (i11 <= this.f4198f) {
                    System.arraycopy(bArr, i15, this.f4197e, 0, i11);
                    this.f4199g = i11;
                } else {
                    this.f4205i.write(bArr, i15, i11);
                }
            }
            this.f4200h += i11;
        }

        public void l1(int i10, r0 r0Var) {
            W0(i10, 2);
            J0(r0Var);
        }

        void m1(r0 r0Var, g1 g1Var) {
            Y0(((androidx.datastore.preferences.protobuf.a) r0Var).k(g1Var));
            g1Var.i(r0Var, this.f4195a);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void n0(byte[] bArr, int i10, int i11) {
            Y0(i11);
            k1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void o0(int i10, h hVar) {
            W0(i10, 2);
            p0(hVar);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void p0(h hVar) {
            Y0(hVar.size());
            hVar.E(this);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void u0(int i10, int i11) {
            j1(14);
            f1(i10, 5);
            c1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void v0(int i10) {
            j1(4);
            c1(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void w0(int i10, long j10) {
            j1(18);
            f1(i10, 1);
            d1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public void x0(long j10) {
            j1(8);
            d1(j10);
        }
    }

    private k() {
    }

    /* synthetic */ k(a aVar) {
        this();
    }

    public static int A(int i10, e0 e0Var) {
        return V(i10) + B(e0Var);
    }

    public static int B(e0 e0Var) {
        return C(e0Var.b());
    }

    public static int C(int i10) {
        return X(i10) + i10;
    }

    public static int D(int i10, r0 r0Var) {
        return (V(1) * 2) + W(2, i10) + E(3, r0Var);
    }

    public static int E(int i10, r0 r0Var) {
        return V(i10) + G(r0Var);
    }

    public static int F(int i10, r0 r0Var, g1 g1Var) {
        return V(i10) + H(r0Var, g1Var);
    }

    public static int G(r0 r0Var) {
        return C(r0Var.c());
    }

    public static int H(r0 r0Var, g1 g1Var) {
        return C(((androidx.datastore.preferences.protobuf.a) r0Var).k(g1Var));
    }

    public static int I(int i10) {
        return i10 > 4096 ? RecognitionOptions.AZTEC : i10;
    }

    public static int J(int i10, h hVar) {
        return (V(1) * 2) + W(2, i10) + g(3, hVar);
    }

    @Deprecated
    public static int K(int i10) {
        return X(i10);
    }

    public static int L(int i10, int i11) {
        return V(i10) + M(i11);
    }

    public static int M(int i10) {
        return 4;
    }

    public static int N(int i10, long j10) {
        return V(i10) + O(j10);
    }

    public static int O(long j10) {
        return 8;
    }

    public static int P(int i10, int i11) {
        return V(i10) + Q(i11);
    }

    public static int Q(int i10) {
        return X(a0(i10));
    }

    public static int R(int i10, long j10) {
        return V(i10) + S(j10);
    }

    public static int S(long j10) {
        return Z(b0(j10));
    }

    public static int T(int i10, String str) {
        return V(i10) + U(str);
    }

    public static int U(String str) {
        int length;
        try {
            length = s1.g(str);
        } catch (s1.d unused) {
            length = str.getBytes(a0.f4078a).length;
        }
        return C(length);
    }

    public static int V(int i10) {
        return X(t1.c(i10, 0));
    }

    public static int W(int i10, int i11) {
        return V(i10) + X(i11);
    }

    public static int X(int i10) {
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

    public static int Y(int i10, long j10) {
        return V(i10) + Z(j10);
    }

    public static int Z(long j10) {
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

    public static int a0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long b0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int d(int i10, boolean z10) {
        return V(i10) + e(z10);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static k f0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    public static int g(int i10, h hVar) {
        return V(i10) + h(hVar);
    }

    public static k g0(byte[] bArr) {
        return h0(bArr, 0, bArr.length);
    }

    public static int h(h hVar) {
        return C(hVar.size());
    }

    public static k h0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int i(int i10, double d10) {
        return V(i10) + j(d10);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int k(int i10, int i11) {
        return V(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return V(i10) + n(i11);
    }

    public static int n(int i10) {
        return 4;
    }

    public static int o(int i10, long j10) {
        return V(i10) + p(j10);
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(int i10, float f10) {
        return V(i10) + r(f10);
    }

    public static int r(float f10) {
        return 4;
    }

    @Deprecated
    public static int s(int i10, r0 r0Var, g1 g1Var) {
        return (V(i10) * 2) + u(r0Var, g1Var);
    }

    @Deprecated
    public static int t(r0 r0Var) {
        return r0Var.c();
    }

    @Deprecated
    static int u(r0 r0Var, g1 g1Var) {
        return ((androidx.datastore.preferences.protobuf.a) r0Var).k(g1Var);
    }

    public static int v(int i10, int i11) {
        return V(i10) + w(i11);
    }

    public static int w(int i10) {
        if (i10 >= 0) {
            return X(i10);
        }
        return 10;
    }

    public static int x(int i10, long j10) {
        return V(i10) + y(j10);
    }

    public static int y(long j10) {
        return Z(j10);
    }

    public static int z(int i10, e0 e0Var) {
        return (V(1) * 2) + W(2, i10) + A(3, e0Var);
    }

    @Deprecated
    public final void A0(int i10, r0 r0Var) {
        W0(i10, 3);
        C0(r0Var);
        W0(i10, 4);
    }

    @Deprecated
    public final void B0(int i10, r0 r0Var, g1 g1Var) {
        W0(i10, 3);
        D0(r0Var, g1Var);
        W0(i10, 4);
    }

    @Deprecated
    public final void C0(r0 r0Var) {
        r0Var.h(this);
    }

    @Deprecated
    final void D0(r0 r0Var, g1 g1Var) {
        g1Var.i(r0Var, this.f4195a);
    }

    public abstract void E0(int i10, int i11);

    public abstract void F0(int i10);

    public final void G0(int i10, long j10) {
        Z0(i10, j10);
    }

    public final void H0(long j10) {
        a1(j10);
    }

    public abstract void I0(int i10, r0 r0Var, g1 g1Var);

    public abstract void J0(r0 r0Var);

    public abstract void K0(int i10, r0 r0Var);

    public abstract void L0(int i10, h hVar);

    public final void M0(int i10, int i11) {
        u0(i10, i11);
    }

    public final void N0(int i10) {
        v0(i10);
    }

    public final void O0(int i10, long j10) {
        w0(i10, j10);
    }

    public final void P0(long j10) {
        x0(j10);
    }

    public final void Q0(int i10, int i11) {
        X0(i10, a0(i11));
    }

    public final void R0(int i10) {
        Y0(a0(i10));
    }

    public final void S0(int i10, long j10) {
        Z0(i10, b0(j10));
    }

    public final void T0(long j10) {
        a1(b0(j10));
    }

    public abstract void U0(int i10, String str);

    public abstract void V0(String str);

    public abstract void W0(int i10, int i11);

    public abstract void X0(int i10, int i11);

    public abstract void Y0(int i10);

    public abstract void Z0(int i10, long j10);

    @Override // androidx.datastore.preferences.protobuf.g
    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void a1(long j10);

    public final void c() {
        if (i0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void c0();

    final void d0(String str, s1.d dVar) {
        f4193c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(a0.f4078a);
        try {
            Y0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (d e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new d(e11);
        }
    }

    public boolean e0() {
        return this.f4196b;
    }

    public abstract int i0();

    public abstract void j0(byte b10);

    public abstract void k0(int i10, boolean z10);

    public final void l0(boolean z10) {
        j0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void m0(byte[] bArr) {
        n0(bArr, 0, bArr.length);
    }

    abstract void n0(byte[] bArr, int i10, int i11);

    public abstract void o0(int i10, h hVar);

    public abstract void p0(h hVar);

    public final void q0(int i10, double d10) {
        w0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void r0(double d10) {
        x0(Double.doubleToRawLongBits(d10));
    }

    public final void s0(int i10, int i11) {
        E0(i10, i11);
    }

    public final void t0(int i10) {
        F0(i10);
    }

    public abstract void u0(int i10, int i11);

    public abstract void v0(int i10);

    public abstract void w0(int i10, long j10);

    public abstract void x0(long j10);

    public final void y0(int i10, float f10) {
        u0(i10, Float.floatToRawIntBits(f10));
    }

    public final void z0(float f10) {
        v0(Float.floatToRawIntBits(f10));
    }
}
