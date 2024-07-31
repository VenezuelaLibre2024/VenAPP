package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1202s1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.k */
/* loaded from: classes.dex */
public abstract class AbstractC1176k extends AbstractC1164g {

    /* renamed from: c */
    private static final Logger f4904c = Logger.getLogger(AbstractC1176k.class.getName());

    /* renamed from: d */
    private static final boolean f4905d = C1199r1.m6316C();

    /* renamed from: a */
    C1179l f4906a;

    /* renamed from: b */
    private boolean f4907b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.k$b */
    /* loaded from: classes.dex */
    public static abstract class b extends AbstractC1176k {

        /* renamed from: e */
        final byte[] f4908e;

        /* renamed from: f */
        final int f4909f;

        /* renamed from: g */
        int f4910g;

        /* renamed from: h */
        int f4911h;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f4908e = bArr;
            this.f4909f = bArr.length;
        }

        /* renamed from: b1 */
        final void m6122b1(byte b10) {
            byte[] bArr = this.f4908e;
            int i10 = this.f4910g;
            this.f4910g = i10 + 1;
            bArr[i10] = b10;
            this.f4911h++;
        }

        /* renamed from: c1 */
        final void m6123c1(int i10) {
            byte[] bArr = this.f4908e;
            int i11 = this.f4910g;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f4910g = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f4911h += 4;
        }

        /* renamed from: d1 */
        final void m6124d1(long j10) {
            byte[] bArr = this.f4908e;
            int i10 = this.f4910g;
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
            this.f4910g = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f4911h += 8;
        }

        /* renamed from: e1 */
        final void m6125e1(int i10) {
            if (i10 >= 0) {
                m6127g1(i10);
            } else {
                m6128h1(i10);
            }
        }

        /* renamed from: f1 */
        final void m6126f1(int i10, int i11) {
            m6127g1(C1205t1.m6428c(i10, i11));
        }

        /* renamed from: g1 */
        final void m6127g1(int i10) {
            if (!AbstractC1176k.f4905d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f4908e;
                    int i11 = this.f4910g;
                    this.f4910g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | RecognitionOptions.ITF);
                    this.f4911h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f4908e;
                int i12 = this.f4910g;
                this.f4910g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f4911h++;
                return;
            }
            long j10 = this.f4910g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f4908e;
                int i13 = this.f4910g;
                this.f4910g = i13 + 1;
                C1199r1.m6321H(bArr3, i13, (byte) ((i10 & 127) | RecognitionOptions.ITF));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f4908e;
            int i14 = this.f4910g;
            this.f4910g = i14 + 1;
            C1199r1.m6321H(bArr4, i14, (byte) i10);
            this.f4911h += (int) (this.f4910g - j10);
        }

        /* renamed from: h1 */
        final void m6128h1(long j10) {
            if (!AbstractC1176k.f4905d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f4908e;
                    int i10 = this.f4910g;
                    this.f4910g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | RecognitionOptions.ITF);
                    this.f4911h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f4908e;
                int i11 = this.f4910g;
                this.f4910g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f4911h++;
                return;
            }
            long j11 = this.f4910g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f4908e;
                int i12 = this.f4910g;
                this.f4910g = i12 + 1;
                C1199r1.m6321H(bArr3, i12, (byte) ((((int) j10) & 127) | RecognitionOptions.ITF));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f4908e;
            int i13 = this.f4910g;
            this.f4910g = i13 + 1;
            C1199r1.m6321H(bArr4, i13, (byte) j10);
            this.f4911h += (int) (this.f4910g - j11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: i0 */
        public final int mo6104i0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.k$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC1176k {

        /* renamed from: e */
        private final byte[] f4912e;

        /* renamed from: f */
        private final int f4913f;

        /* renamed from: g */
        private final int f4914g;

        /* renamed from: h */
        private int f4915h;

        c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f4912e = bArr;
            this.f4913f = i10;
            this.f4915h = i10;
            this.f4914g = i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: E0 */
        public final void mo6077E0(int i10, int i11) {
            mo6095W0(i10, 0);
            mo6078F0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: F0 */
        public final void mo6078F0(int i10) {
            if (i10 >= 0) {
                mo6097Y0(i10);
            } else {
                mo6099a1(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: I0 */
        final void mo6081I0(int i10, InterfaceC1198r0 interfaceC1198r0, InterfaceC1166g1 interfaceC1166g1) {
            mo6095W0(i10, 2);
            mo6097Y0(((AbstractC1146a) interfaceC1198r0).m5633k(interfaceC1166g1));
            interfaceC1166g1.mo5800i(interfaceC1198r0, this.f4906a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: J0 */
        public final void mo6082J0(InterfaceC1198r0 interfaceC1198r0) {
            mo6097Y0(interfaceC1198r0.mo6309c());
            interfaceC1198r0.mo6312h(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: K0 */
        public final void mo6083K0(int i10, InterfaceC1198r0 interfaceC1198r0) {
            mo6095W0(1, 3);
            mo6096X0(2, i10);
            m6130c1(3, interfaceC1198r0);
            mo6095W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: L0 */
        public final void mo6084L0(int i10, AbstractC1167h abstractC1167h) {
            mo6095W0(1, 3);
            mo6096X0(2, i10);
            mo6110o0(3, abstractC1167h);
            mo6095W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: U0 */
        public final void mo6093U0(int i10, String str) {
            mo6095W0(i10, 2);
            mo6094V0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: V0 */
        public final void mo6094V0(String str) {
            int m6384f;
            int i10 = this.f4915h;
            try {
                int m6041X = AbstractC1176k.m6041X(str.length() * 3);
                int m6041X2 = AbstractC1176k.m6041X(str.length());
                if (m6041X2 == m6041X) {
                    int i11 = i10 + m6041X2;
                    this.f4915h = i11;
                    m6384f = C1202s1.m6384f(str, this.f4912e, i11, mo6104i0());
                    this.f4915h = i10;
                    mo6097Y0((m6384f - i10) - m6041X2);
                } else {
                    mo6097Y0(C1202s1.m6385g(str));
                    m6384f = C1202s1.m6384f(str, this.f4912e, this.f4915h, mo6104i0());
                }
                this.f4915h = m6384f;
            } catch (C1202s1.d e10) {
                this.f4915h = i10;
                m6102d0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: W0 */
        public final void mo6095W0(int i10, int i11) {
            mo6097Y0(C1205t1.m6428c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: X0 */
        public final void mo6096X0(int i10, int i11) {
            mo6095W0(i10, 0);
            mo6097Y0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: Y0 */
        public final void mo6097Y0(int i10) {
            if (!AbstractC1176k.f4905d || C1155d.m5684c() || mo6104i0() < 5) {
                while ((i10 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f4912e;
                        int i11 = this.f4915h;
                        this.f4915h = i11 + 1;
                        bArr[i11] = (byte) ((i10 & 127) | RecognitionOptions.ITF);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4915h), Integer.valueOf(this.f4914g), 1), e10);
                    }
                }
                byte[] bArr2 = this.f4912e;
                int i12 = this.f4915h;
                this.f4915h = i12 + 1;
                bArr2[i12] = (byte) i10;
                return;
            }
            if ((i10 & (-128)) == 0) {
                byte[] bArr3 = this.f4912e;
                int i13 = this.f4915h;
                this.f4915h = i13 + 1;
                C1199r1.m6321H(bArr3, i13, (byte) i10);
                return;
            }
            byte[] bArr4 = this.f4912e;
            int i14 = this.f4915h;
            this.f4915h = i14 + 1;
            C1199r1.m6321H(bArr4, i14, (byte) (i10 | RecognitionOptions.ITF));
            int i15 = i10 >>> 7;
            if ((i15 & (-128)) == 0) {
                byte[] bArr5 = this.f4912e;
                int i16 = this.f4915h;
                this.f4915h = i16 + 1;
                C1199r1.m6321H(bArr5, i16, (byte) i15);
                return;
            }
            byte[] bArr6 = this.f4912e;
            int i17 = this.f4915h;
            this.f4915h = i17 + 1;
            C1199r1.m6321H(bArr6, i17, (byte) (i15 | RecognitionOptions.ITF));
            int i18 = i15 >>> 7;
            if ((i18 & (-128)) == 0) {
                byte[] bArr7 = this.f4912e;
                int i19 = this.f4915h;
                this.f4915h = i19 + 1;
                C1199r1.m6321H(bArr7, i19, (byte) i18);
                return;
            }
            byte[] bArr8 = this.f4912e;
            int i20 = this.f4915h;
            this.f4915h = i20 + 1;
            C1199r1.m6321H(bArr8, i20, (byte) (i18 | RecognitionOptions.ITF));
            int i21 = i18 >>> 7;
            if ((i21 & (-128)) == 0) {
                byte[] bArr9 = this.f4912e;
                int i22 = this.f4915h;
                this.f4915h = i22 + 1;
                C1199r1.m6321H(bArr9, i22, (byte) i21);
                return;
            }
            byte[] bArr10 = this.f4912e;
            int i23 = this.f4915h;
            this.f4915h = i23 + 1;
            C1199r1.m6321H(bArr10, i23, (byte) (i21 | RecognitionOptions.ITF));
            byte[] bArr11 = this.f4912e;
            int i24 = this.f4915h;
            this.f4915h = i24 + 1;
            C1199r1.m6321H(bArr11, i24, (byte) (i21 >>> 7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: Z0 */
        public final void mo6098Z0(int i10, long j10) {
            mo6095W0(i10, 0);
            mo6099a1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k, androidx.datastore.preferences.protobuf.AbstractC1164g
        /* renamed from: a */
        public final void mo5791a(byte[] bArr, int i10, int i11) {
            m6129b1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: a1 */
        public final void mo6099a1(long j10) {
            if (AbstractC1176k.f4905d && mo6104i0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f4912e;
                    int i10 = this.f4915h;
                    this.f4915h = i10 + 1;
                    C1199r1.m6321H(bArr, i10, (byte) ((((int) j10) & 127) | RecognitionOptions.ITF));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f4912e;
                int i11 = this.f4915h;
                this.f4915h = i11 + 1;
                C1199r1.m6321H(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f4912e;
                    int i12 = this.f4915h;
                    this.f4915h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | RecognitionOptions.ITF);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4915h), Integer.valueOf(this.f4914g), 1), e10);
                }
            }
            byte[] bArr4 = this.f4912e;
            int i13 = this.f4915h;
            this.f4915h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        /* renamed from: b1 */
        public final void m6129b1(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f4912e, this.f4915h, i11);
                this.f4915h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4915h), Integer.valueOf(this.f4914g), Integer.valueOf(i11)), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: c0 */
        public void mo6101c0() {
        }

        /* renamed from: c1 */
        public final void m6130c1(int i10, InterfaceC1198r0 interfaceC1198r0) {
            mo6095W0(i10, 2);
            mo6082J0(interfaceC1198r0);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: i0 */
        public final int mo6104i0() {
            return this.f4914g - this.f4915h;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: j0 */
        public final void mo6105j0(byte b10) {
            try {
                byte[] bArr = this.f4912e;
                int i10 = this.f4915h;
                this.f4915h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4915h), Integer.valueOf(this.f4914g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: k0 */
        public final void mo6106k0(int i10, boolean z10) {
            mo6095W0(i10, 0);
            mo6105j0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: n0 */
        public final void mo6109n0(byte[] bArr, int i10, int i11) {
            mo6097Y0(i11);
            m6129b1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: o0 */
        public final void mo6110o0(int i10, AbstractC1167h abstractC1167h) {
            mo6095W0(i10, 2);
            mo6111p0(abstractC1167h);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: p0 */
        public final void mo6111p0(AbstractC1167h abstractC1167h) {
            mo6097Y0(abstractC1167h.size());
            abstractC1167h.mo5812E(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: u0 */
        public final void mo6116u0(int i10, int i11) {
            mo6095W0(i10, 5);
            mo6117v0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: v0 */
        public final void mo6117v0(int i10) {
            try {
                byte[] bArr = this.f4912e;
                int i11 = this.f4915h;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f4915h = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4915h), Integer.valueOf(this.f4914g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: w0 */
        public final void mo6118w0(int i10, long j10) {
            mo6095W0(i10, 1);
            mo6119x0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: x0 */
        public final void mo6119x0(long j10) {
            try {
                byte[] bArr = this.f4912e;
                int i10 = this.f4915h;
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
                this.f4915h = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4915h), Integer.valueOf(this.f4914g), 1), e10);
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.k$d */
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

    /* renamed from: androidx.datastore.preferences.protobuf.k$e */
    /* loaded from: classes.dex */
    private static final class e extends b {

        /* renamed from: i */
        private final OutputStream f4916i;

        e(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f4916i = outputStream;
        }

        /* renamed from: i1 */
        private void m6131i1() {
            this.f4916i.write(this.f4908e, 0, this.f4910g);
            this.f4910g = 0;
        }

        /* renamed from: j1 */
        private void m6132j1(int i10) {
            if (this.f4909f - this.f4910g < i10) {
                m6131i1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: E0 */
        public void mo6077E0(int i10, int i11) {
            m6132j1(20);
            m6126f1(i10, 0);
            m6125e1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: F0 */
        public void mo6078F0(int i10) {
            if (i10 >= 0) {
                mo6097Y0(i10);
            } else {
                mo6099a1(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: I0 */
        void mo6081I0(int i10, InterfaceC1198r0 interfaceC1198r0, InterfaceC1166g1 interfaceC1166g1) {
            mo6095W0(i10, 2);
            m6135m1(interfaceC1198r0, interfaceC1166g1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: J0 */
        public void mo6082J0(InterfaceC1198r0 interfaceC1198r0) {
            mo6097Y0(interfaceC1198r0.mo6309c());
            interfaceC1198r0.mo6312h(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: K0 */
        public void mo6083K0(int i10, InterfaceC1198r0 interfaceC1198r0) {
            mo6095W0(1, 3);
            mo6096X0(2, i10);
            m6134l1(3, interfaceC1198r0);
            mo6095W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: L0 */
        public void mo6084L0(int i10, AbstractC1167h abstractC1167h) {
            mo6095W0(1, 3);
            mo6096X0(2, i10);
            mo6110o0(3, abstractC1167h);
            mo6095W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: U0 */
        public void mo6093U0(int i10, String str) {
            mo6095W0(i10, 2);
            mo6094V0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: V0 */
        public void mo6094V0(String str) {
            int m6385g;
            try {
                int length = str.length() * 3;
                int m6041X = AbstractC1176k.m6041X(length);
                int i10 = m6041X + length;
                int i11 = this.f4909f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int m6384f = C1202s1.m6384f(str, bArr, 0, length);
                    mo6097Y0(m6384f);
                    mo5791a(bArr, 0, m6384f);
                    return;
                }
                if (i10 > i11 - this.f4910g) {
                    m6131i1();
                }
                int m6041X2 = AbstractC1176k.m6041X(str.length());
                int i12 = this.f4910g;
                try {
                    if (m6041X2 == m6041X) {
                        int i13 = i12 + m6041X2;
                        this.f4910g = i13;
                        int m6384f2 = C1202s1.m6384f(str, this.f4908e, i13, this.f4909f - i13);
                        this.f4910g = i12;
                        m6385g = (m6384f2 - i12) - m6041X2;
                        m6127g1(m6385g);
                        this.f4910g = m6384f2;
                    } else {
                        m6385g = C1202s1.m6385g(str);
                        m6127g1(m6385g);
                        this.f4910g = C1202s1.m6384f(str, this.f4908e, this.f4910g, m6385g);
                    }
                    this.f4911h += m6385g;
                } catch (C1202s1.d e10) {
                    this.f4911h -= this.f4910g - i12;
                    this.f4910g = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new d(e11);
                }
            } catch (C1202s1.d e12) {
                m6102d0(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: W0 */
        public void mo6095W0(int i10, int i11) {
            mo6097Y0(C1205t1.m6428c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: X0 */
        public void mo6096X0(int i10, int i11) {
            m6132j1(20);
            m6126f1(i10, 0);
            m6127g1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: Y0 */
        public void mo6097Y0(int i10) {
            m6132j1(5);
            m6127g1(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: Z0 */
        public void mo6098Z0(int i10, long j10) {
            m6132j1(20);
            m6126f1(i10, 0);
            m6128h1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k, androidx.datastore.preferences.protobuf.AbstractC1164g
        /* renamed from: a */
        public void mo5791a(byte[] bArr, int i10, int i11) {
            m6133k1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: a1 */
        public void mo6099a1(long j10) {
            m6132j1(10);
            m6128h1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: c0 */
        public void mo6101c0() {
            if (this.f4910g > 0) {
                m6131i1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: j0 */
        public void mo6105j0(byte b10) {
            if (this.f4910g == this.f4909f) {
                m6131i1();
            }
            m6122b1(b10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: k0 */
        public void mo6106k0(int i10, boolean z10) {
            m6132j1(11);
            m6126f1(i10, 0);
            m6122b1(z10 ? (byte) 1 : (byte) 0);
        }

        /* renamed from: k1 */
        public void m6133k1(byte[] bArr, int i10, int i11) {
            int i12 = this.f4909f;
            int i13 = this.f4910g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f4908e, i13, i11);
                this.f4910g += i11;
            } else {
                int i14 = i12 - i13;
                System.arraycopy(bArr, i10, this.f4908e, i13, i14);
                int i15 = i10 + i14;
                i11 -= i14;
                this.f4910g = this.f4909f;
                this.f4911h += i14;
                m6131i1();
                if (i11 <= this.f4909f) {
                    System.arraycopy(bArr, i15, this.f4908e, 0, i11);
                    this.f4910g = i11;
                } else {
                    this.f4916i.write(bArr, i15, i11);
                }
            }
            this.f4911h += i11;
        }

        /* renamed from: l1 */
        public void m6134l1(int i10, InterfaceC1198r0 interfaceC1198r0) {
            mo6095W0(i10, 2);
            mo6082J0(interfaceC1198r0);
        }

        /* renamed from: m1 */
        void m6135m1(InterfaceC1198r0 interfaceC1198r0, InterfaceC1166g1 interfaceC1166g1) {
            mo6097Y0(((AbstractC1146a) interfaceC1198r0).m5633k(interfaceC1166g1));
            interfaceC1166g1.mo5800i(interfaceC1198r0, this.f4906a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: n0 */
        public void mo6109n0(byte[] bArr, int i10, int i11) {
            mo6097Y0(i11);
            m6133k1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: o0 */
        public void mo6110o0(int i10, AbstractC1167h abstractC1167h) {
            mo6095W0(i10, 2);
            mo6111p0(abstractC1167h);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: p0 */
        public void mo6111p0(AbstractC1167h abstractC1167h) {
            mo6097Y0(abstractC1167h.size());
            abstractC1167h.mo5812E(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: u0 */
        public void mo6116u0(int i10, int i11) {
            m6132j1(14);
            m6126f1(i10, 5);
            m6123c1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: v0 */
        public void mo6117v0(int i10) {
            m6132j1(4);
            m6123c1(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: w0 */
        public void mo6118w0(int i10, long j10) {
            m6132j1(18);
            m6126f1(i10, 1);
            m6124d1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1176k
        /* renamed from: x0 */
        public void mo6119x0(long j10) {
            m6132j1(8);
            m6124d1(j10);
        }
    }

    private AbstractC1176k() {
    }

    /* renamed from: A */
    public static int m6018A(int i10, C1159e0 c1159e0) {
        return m6039V(i10) + m6019B(c1159e0);
    }

    /* renamed from: B */
    public static int m6019B(C1159e0 c1159e0) {
        return m6020C(c1159e0.m5760b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static int m6020C(int i10) {
        return m6041X(i10) + i10;
    }

    /* renamed from: D */
    public static int m6021D(int i10, InterfaceC1198r0 interfaceC1198r0) {
        return (m6039V(1) * 2) + m6040W(2, i10) + m6022E(3, interfaceC1198r0);
    }

    /* renamed from: E */
    public static int m6022E(int i10, InterfaceC1198r0 interfaceC1198r0) {
        return m6039V(i10) + m6024G(interfaceC1198r0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static int m6023F(int i10, InterfaceC1198r0 interfaceC1198r0, InterfaceC1166g1 interfaceC1166g1) {
        return m6039V(i10) + m6025H(interfaceC1198r0, interfaceC1166g1);
    }

    /* renamed from: G */
    public static int m6024G(InterfaceC1198r0 interfaceC1198r0) {
        return m6020C(interfaceC1198r0.mo6309c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static int m6025H(InterfaceC1198r0 interfaceC1198r0, InterfaceC1166g1 interfaceC1166g1) {
        return m6020C(((AbstractC1146a) interfaceC1198r0).m5633k(interfaceC1166g1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static int m6026I(int i10) {
        return i10 > 4096 ? RecognitionOptions.AZTEC : i10;
    }

    /* renamed from: J */
    public static int m6027J(int i10, AbstractC1167h abstractC1167h) {
        return (m6039V(1) * 2) + m6040W(2, i10) + m6051g(3, abstractC1167h);
    }

    @Deprecated
    /* renamed from: K */
    public static int m6028K(int i10) {
        return m6041X(i10);
    }

    /* renamed from: L */
    public static int m6029L(int i10, int i11) {
        return m6039V(i10) + m6030M(i11);
    }

    /* renamed from: M */
    public static int m6030M(int i10) {
        return 4;
    }

    /* renamed from: N */
    public static int m6031N(int i10, long j10) {
        return m6039V(i10) + m6032O(j10);
    }

    /* renamed from: O */
    public static int m6032O(long j10) {
        return 8;
    }

    /* renamed from: P */
    public static int m6033P(int i10, int i11) {
        return m6039V(i10) + m6034Q(i11);
    }

    /* renamed from: Q */
    public static int m6034Q(int i10) {
        return m6041X(m6044a0(i10));
    }

    /* renamed from: R */
    public static int m6035R(int i10, long j10) {
        return m6039V(i10) + m6036S(j10);
    }

    /* renamed from: S */
    public static int m6036S(long j10) {
        return m6043Z(m6046b0(j10));
    }

    /* renamed from: T */
    public static int m6037T(int i10, String str) {
        return m6039V(i10) + m6038U(str);
    }

    /* renamed from: U */
    public static int m6038U(String str) {
        int length;
        try {
            length = C1202s1.m6385g(str);
        } catch (C1202s1.d unused) {
            length = str.getBytes(C1147a0.f4789a).length;
        }
        return m6020C(length);
    }

    /* renamed from: V */
    public static int m6039V(int i10) {
        return m6041X(C1205t1.m6428c(i10, 0));
    }

    /* renamed from: W */
    public static int m6040W(int i10, int i11) {
        return m6039V(i10) + m6041X(i11);
    }

    /* renamed from: X */
    public static int m6041X(int i10) {
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

    /* renamed from: Y */
    public static int m6042Y(int i10, long j10) {
        return m6039V(i10) + m6043Z(j10);
    }

    /* renamed from: Z */
    public static int m6043Z(long j10) {
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

    /* renamed from: a0 */
    public static int m6044a0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    /* renamed from: b0 */
    public static long m6046b0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    /* renamed from: d */
    public static int m6047d(int i10, boolean z10) {
        return m6039V(i10) + m6048e(z10);
    }

    /* renamed from: e */
    public static int m6048e(boolean z10) {
        return 1;
    }

    /* renamed from: f */
    public static int m6049f(byte[] bArr) {
        return m6020C(bArr.length);
    }

    /* renamed from: f0 */
    public static AbstractC1176k m6050f0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    /* renamed from: g */
    public static int m6051g(int i10, AbstractC1167h abstractC1167h) {
        return m6039V(i10) + m6053h(abstractC1167h);
    }

    /* renamed from: g0 */
    public static AbstractC1176k m6052g0(byte[] bArr) {
        return m6054h0(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public static int m6053h(AbstractC1167h abstractC1167h) {
        return m6020C(abstractC1167h.size());
    }

    /* renamed from: h0 */
    public static AbstractC1176k m6054h0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    /* renamed from: i */
    public static int m6055i(int i10, double d10) {
        return m6039V(i10) + m6056j(d10);
    }

    /* renamed from: j */
    public static int m6056j(double d10) {
        return 8;
    }

    /* renamed from: k */
    public static int m6057k(int i10, int i11) {
        return m6039V(i10) + m6058l(i11);
    }

    /* renamed from: l */
    public static int m6058l(int i10) {
        return m6069w(i10);
    }

    /* renamed from: m */
    public static int m6059m(int i10, int i11) {
        return m6039V(i10) + m6060n(i11);
    }

    /* renamed from: n */
    public static int m6060n(int i10) {
        return 4;
    }

    /* renamed from: o */
    public static int m6061o(int i10, long j10) {
        return m6039V(i10) + m6062p(j10);
    }

    /* renamed from: p */
    public static int m6062p(long j10) {
        return 8;
    }

    /* renamed from: q */
    public static int m6063q(int i10, float f10) {
        return m6039V(i10) + m6064r(f10);
    }

    /* renamed from: r */
    public static int m6064r(float f10) {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: s */
    public static int m6065s(int i10, InterfaceC1198r0 interfaceC1198r0, InterfaceC1166g1 interfaceC1166g1) {
        return (m6039V(i10) * 2) + m6067u(interfaceC1198r0, interfaceC1166g1);
    }

    @Deprecated
    /* renamed from: t */
    public static int m6066t(InterfaceC1198r0 interfaceC1198r0) {
        return interfaceC1198r0.mo6309c();
    }

    @Deprecated
    /* renamed from: u */
    static int m6067u(InterfaceC1198r0 interfaceC1198r0, InterfaceC1166g1 interfaceC1166g1) {
        return ((AbstractC1146a) interfaceC1198r0).m5633k(interfaceC1166g1);
    }

    /* renamed from: v */
    public static int m6068v(int i10, int i11) {
        return m6039V(i10) + m6069w(i11);
    }

    /* renamed from: w */
    public static int m6069w(int i10) {
        if (i10 >= 0) {
            return m6041X(i10);
        }
        return 10;
    }

    /* renamed from: x */
    public static int m6070x(int i10, long j10) {
        return m6039V(i10) + m6071y(j10);
    }

    /* renamed from: y */
    public static int m6071y(long j10) {
        return m6043Z(j10);
    }

    /* renamed from: z */
    public static int m6072z(int i10, C1159e0 c1159e0) {
        return (m6039V(1) * 2) + m6040W(2, i10) + m6018A(3, c1159e0);
    }

    @Deprecated
    /* renamed from: A0 */
    public final void m6073A0(int i10, InterfaceC1198r0 interfaceC1198r0) {
        mo6095W0(i10, 3);
        m6075C0(interfaceC1198r0);
        mo6095W0(i10, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: B0 */
    public final void m6074B0(int i10, InterfaceC1198r0 interfaceC1198r0, InterfaceC1166g1 interfaceC1166g1) {
        mo6095W0(i10, 3);
        m6076D0(interfaceC1198r0, interfaceC1166g1);
        mo6095W0(i10, 4);
    }

    @Deprecated
    /* renamed from: C0 */
    public final void m6075C0(InterfaceC1198r0 interfaceC1198r0) {
        interfaceC1198r0.mo6312h(this);
    }

    @Deprecated
    /* renamed from: D0 */
    final void m6076D0(InterfaceC1198r0 interfaceC1198r0, InterfaceC1166g1 interfaceC1166g1) {
        interfaceC1166g1.mo5800i(interfaceC1198r0, this.f4906a);
    }

    /* renamed from: E0 */
    public abstract void mo6077E0(int i10, int i11);

    /* renamed from: F0 */
    public abstract void mo6078F0(int i10);

    /* renamed from: G0 */
    public final void m6079G0(int i10, long j10) {
        mo6098Z0(i10, j10);
    }

    /* renamed from: H0 */
    public final void m6080H0(long j10) {
        mo6099a1(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I0 */
    public abstract void mo6081I0(int i10, InterfaceC1198r0 interfaceC1198r0, InterfaceC1166g1 interfaceC1166g1);

    /* renamed from: J0 */
    public abstract void mo6082J0(InterfaceC1198r0 interfaceC1198r0);

    /* renamed from: K0 */
    public abstract void mo6083K0(int i10, InterfaceC1198r0 interfaceC1198r0);

    /* renamed from: L0 */
    public abstract void mo6084L0(int i10, AbstractC1167h abstractC1167h);

    /* renamed from: M0 */
    public final void m6085M0(int i10, int i11) {
        mo6116u0(i10, i11);
    }

    /* renamed from: N0 */
    public final void m6086N0(int i10) {
        mo6117v0(i10);
    }

    /* renamed from: O0 */
    public final void m6087O0(int i10, long j10) {
        mo6118w0(i10, j10);
    }

    /* renamed from: P0 */
    public final void m6088P0(long j10) {
        mo6119x0(j10);
    }

    /* renamed from: Q0 */
    public final void m6089Q0(int i10, int i11) {
        mo6096X0(i10, m6044a0(i11));
    }

    /* renamed from: R0 */
    public final void m6090R0(int i10) {
        mo6097Y0(m6044a0(i10));
    }

    /* renamed from: S0 */
    public final void m6091S0(int i10, long j10) {
        mo6098Z0(i10, m6046b0(j10));
    }

    /* renamed from: T0 */
    public final void m6092T0(long j10) {
        mo6099a1(m6046b0(j10));
    }

    /* renamed from: U0 */
    public abstract void mo6093U0(int i10, String str);

    /* renamed from: V0 */
    public abstract void mo6094V0(String str);

    /* renamed from: W0 */
    public abstract void mo6095W0(int i10, int i11);

    /* renamed from: X0 */
    public abstract void mo6096X0(int i10, int i11);

    /* renamed from: Y0 */
    public abstract void mo6097Y0(int i10);

    /* renamed from: Z0 */
    public abstract void mo6098Z0(int i10, long j10);

    @Override // androidx.datastore.preferences.protobuf.AbstractC1164g
    /* renamed from: a */
    public abstract void mo5791a(byte[] bArr, int i10, int i11);

    /* renamed from: a1 */
    public abstract void mo6099a1(long j10);

    /* renamed from: c */
    public final void m6100c() {
        if (mo6104i0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: c0 */
    public abstract void mo6101c0();

    /* renamed from: d0 */
    final void m6102d0(String str, C1202s1.d dVar) {
        f4904c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C1147a0.f4789a);
        try {
            mo6097Y0(bytes.length);
            mo5791a(bytes, 0, bytes.length);
        } catch (d e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new d(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public boolean m6103e0() {
        return this.f4907b;
    }

    /* renamed from: i0 */
    public abstract int mo6104i0();

    /* renamed from: j0 */
    public abstract void mo6105j0(byte b10);

    /* renamed from: k0 */
    public abstract void mo6106k0(int i10, boolean z10);

    /* renamed from: l0 */
    public final void m6107l0(boolean z10) {
        mo6105j0(z10 ? (byte) 1 : (byte) 0);
    }

    /* renamed from: m0 */
    public final void m6108m0(byte[] bArr) {
        mo6109n0(bArr, 0, bArr.length);
    }

    /* renamed from: n0 */
    abstract void mo6109n0(byte[] bArr, int i10, int i11);

    /* renamed from: o0 */
    public abstract void mo6110o0(int i10, AbstractC1167h abstractC1167h);

    /* renamed from: p0 */
    public abstract void mo6111p0(AbstractC1167h abstractC1167h);

    /* renamed from: q0 */
    public final void m6112q0(int i10, double d10) {
        mo6118w0(i10, Double.doubleToRawLongBits(d10));
    }

    /* renamed from: r0 */
    public final void m6113r0(double d10) {
        mo6119x0(Double.doubleToRawLongBits(d10));
    }

    /* renamed from: s0 */
    public final void m6114s0(int i10, int i11) {
        mo6077E0(i10, i11);
    }

    /* renamed from: t0 */
    public final void m6115t0(int i10) {
        mo6078F0(i10);
    }

    /* renamed from: u0 */
    public abstract void mo6116u0(int i10, int i11);

    /* renamed from: v0 */
    public abstract void mo6117v0(int i10);

    /* renamed from: w0 */
    public abstract void mo6118w0(int i10, long j10);

    /* renamed from: x0 */
    public abstract void mo6119x0(long j10);

    /* renamed from: y0 */
    public final void m6120y0(int i10, float f10) {
        mo6116u0(i10, Float.floatToRawIntBits(f10));
    }

    /* renamed from: z0 */
    public final void m6121z0(float f10) {
        mo6117v0(Float.floatToRawIntBits(f10));
    }
}
