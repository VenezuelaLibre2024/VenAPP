package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.t1;
import com.google.android.gms.common.api.a;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class e implements f1 {

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4097a;

        static {
            int[] iArr = new int[t1.b.values().length];
            f4097a = iArr;
            try {
                iArr[t1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4097a[t1.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4097a[t1.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4097a[t1.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4097a[t1.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4097a[t1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4097a[t1.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4097a[t1.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4097a[t1.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4097a[t1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4097a[t1.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4097a[t1.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4097a[t1.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4097a[t1.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4097a[t1.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4097a[t1.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4097a[t1.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends e {

        /* renamed from: a */
        private final boolean f4098a;

        /* renamed from: b */
        private final byte[] f4099b;

        /* renamed from: c */
        private int f4100c;

        /* renamed from: d */
        private final int f4101d;

        /* renamed from: e */
        private int f4102e;

        /* renamed from: f */
        private int f4103f;

        /* renamed from: g */
        private int f4104g;

        public b(ByteBuffer byteBuffer, boolean z10) {
            super(null);
            this.f4098a = z10;
            this.f4099b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f4100c = arrayOffset;
            this.f4101d = arrayOffset;
            this.f4102e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean R() {
            return this.f4100c == this.f4102e;
        }

        private byte S() {
            int i10 = this.f4100c;
            if (i10 == this.f4102e) {
                throw b0.k();
            }
            byte[] bArr = this.f4099b;
            this.f4100c = i10 + 1;
            return bArr[i10];
        }

        private Object T(t1.b bVar, Class<?> cls, p pVar) {
            switch (a.f4097a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(e());
                case 2:
                    return o();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(k());
                case 5:
                    return Integer.valueOf(u());
                case 6:
                    return Long.valueOf(b());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(p());
                case 9:
                    return Long.valueOf(H());
                case 10:
                    return M(cls, pVar);
                case 11:
                    return Integer.valueOf(E());
                case 12:
                    return Long.valueOf(f());
                case 13:
                    return Integer.valueOf(l());
                case 14:
                    return Long.valueOf(y());
                case 15:
                    return I();
                case 16:
                    return Integer.valueOf(h());
                case 17:
                    return Long.valueOf(s());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private <T> T U(g1<T> g1Var, p pVar) {
            int i10 = this.f4104g;
            this.f4104g = t1.c(t1.a(this.f4103f), 4);
            try {
                T e10 = g1Var.e();
                g1Var.h(e10, this, pVar);
                g1Var.b(e10);
                if (this.f4103f == this.f4104g) {
                    return e10;
                }
                throw b0.g();
            } finally {
                this.f4104g = i10;
            }
        }

        private int V() {
            f0(4);
            return W();
        }

        private int W() {
            int i10 = this.f4100c;
            byte[] bArr = this.f4099b;
            this.f4100c = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        private long X() {
            f0(8);
            return Y();
        }

        private long Y() {
            int i10 = this.f4100c;
            byte[] bArr = this.f4099b;
            this.f4100c = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        private <T> T Z(g1<T> g1Var, p pVar) {
            int c02 = c0();
            f0(c02);
            int i10 = this.f4102e;
            int i11 = this.f4100c + c02;
            this.f4102e = i11;
            try {
                T e10 = g1Var.e();
                g1Var.h(e10, this, pVar);
                g1Var.b(e10);
                if (this.f4100c == i11) {
                    return e10;
                }
                throw b0.g();
            } finally {
                this.f4102e = i10;
            }
        }

        private int c0() {
            int i10;
            int i11 = this.f4100c;
            int i12 = this.f4102e;
            if (i12 == i11) {
                throw b0.k();
            }
            byte[] bArr = this.f4099b;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f4100c = i13;
                return b10;
            }
            if (i12 - i13 < 9) {
                return (int) e0();
            }
            int i14 = i13 + 1;
            int i15 = b10 ^ (bArr[i13] << 7);
            if (i15 < 0) {
                i10 = i15 ^ (-128);
            } else {
                int i16 = i14 + 1;
                int i17 = i15 ^ (bArr[i14] << 14);
                if (i17 >= 0) {
                    i10 = i17 ^ 16256;
                } else {
                    i14 = i16 + 1;
                    int i18 = i17 ^ (bArr[i16] << 21);
                    if (i18 < 0) {
                        i10 = i18 ^ (-2080896);
                    } else {
                        i16 = i14 + 1;
                        byte b11 = bArr[i14];
                        i10 = (i18 ^ (b11 << 28)) ^ 266354560;
                        if (b11 < 0) {
                            i14 = i16 + 1;
                            if (bArr[i16] < 0) {
                                i16 = i14 + 1;
                                if (bArr[i14] < 0) {
                                    i14 = i16 + 1;
                                    if (bArr[i16] < 0) {
                                        i16 = i14 + 1;
                                        if (bArr[i14] < 0) {
                                            i14 = i16 + 1;
                                            if (bArr[i16] < 0) {
                                                throw b0.e();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i14 = i16;
            }
            this.f4100c = i14;
            return i10;
        }

        private long e0() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((S() & 128) == 0) {
                    return j10;
                }
            }
            throw b0.e();
        }

        private void f0(int i10) {
            if (i10 < 0 || i10 > this.f4102e - this.f4100c) {
                throw b0.k();
            }
        }

        private void g0(int i10) {
            if (this.f4100c != i10) {
                throw b0.k();
            }
        }

        private void h0(int i10) {
            if (t1.b(this.f4103f) != i10) {
                throw b0.d();
            }
        }

        private void i0(int i10) {
            f0(i10);
            this.f4100c += i10;
        }

        private void j0() {
            int i10 = this.f4104g;
            this.f4104g = t1.c(t1.a(this.f4103f), 4);
            while (A() != Integer.MAX_VALUE && D()) {
            }
            if (this.f4103f != this.f4104g) {
                throw b0.g();
            }
            this.f4104g = i10;
        }

        private void k0() {
            int i10 = this.f4102e;
            int i11 = this.f4100c;
            if (i10 - i11 >= 10) {
                byte[] bArr = this.f4099b;
                int i12 = 0;
                while (i12 < 10) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        this.f4100c = i13;
                        return;
                    } else {
                        i12++;
                        i11 = i13;
                    }
                }
            }
            l0();
        }

        private void l0() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (S() >= 0) {
                    return;
                }
            }
            throw b0.e();
        }

        private void m0(int i10) {
            f0(i10);
            if ((i10 & 3) != 0) {
                throw b0.g();
            }
        }

        private void n0(int i10) {
            f0(i10);
            if ((i10 & 7) != 0) {
                throw b0.g();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public int A() {
            if (R()) {
                return a.e.API_PRIORITY_OTHER;
            }
            int c02 = c0();
            this.f4103f = c02;
            return c02 == this.f4104g ? a.e.API_PRIORITY_OTHER : t1.a(c02);
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void B(List<String> list) {
            b0(list, false);
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void C(List<Float> list) {
            int i10;
            int i11;
            if (!(list instanceof w)) {
                int b10 = t1.b(this.f4103f);
                if (b10 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i12 = this.f4100c + c02;
                    while (this.f4100c < i12) {
                        list.add(Float.valueOf(Float.intBitsToFloat(W())));
                    }
                    return;
                }
                if (b10 != 5) {
                    throw b0.d();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f4100c;
                    }
                } while (c0() == this.f4103f);
                this.f4100c = i10;
                return;
            }
            w wVar = (w) list;
            int b11 = t1.b(this.f4103f);
            if (b11 == 2) {
                int c03 = c0();
                m0(c03);
                int i13 = this.f4100c + c03;
                while (this.f4100c < i13) {
                    wVar.h(Float.intBitsToFloat(W()));
                }
                return;
            }
            if (b11 != 5) {
                throw b0.d();
            }
            do {
                wVar.h(readFloat());
                if (R()) {
                    return;
                } else {
                    i11 = this.f4100c;
                }
            } while (c0() == this.f4103f);
            this.f4100c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public boolean D() {
            int i10;
            int i11;
            if (R() || (i10 = this.f4103f) == this.f4104g) {
                return false;
            }
            int b10 = t1.b(i10);
            if (b10 == 0) {
                k0();
                return true;
            }
            if (b10 == 1) {
                i11 = 8;
            } else if (b10 == 2) {
                i11 = c0();
            } else {
                if (b10 == 3) {
                    j0();
                    return true;
                }
                if (b10 != 5) {
                    throw b0.d();
                }
                i11 = 4;
            }
            i0(i11);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public int E() {
            h0(5);
            return V();
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void F(List<h> list) {
            int i10;
            if (t1.b(this.f4103f) != 2) {
                throw b0.d();
            }
            do {
                list.add(o());
                if (R()) {
                    return;
                } else {
                    i10 = this.f4100c;
                }
            } while (c0() == this.f4103f);
            this.f4100c = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void G(List<Double> list) {
            int i10;
            int i11;
            if (!(list instanceof m)) {
                int b10 = t1.b(this.f4103f);
                if (b10 != 1) {
                    if (b10 != 2) {
                        throw b0.d();
                    }
                    int c02 = c0();
                    n0(c02);
                    int i12 = this.f4100c + c02;
                    while (this.f4100c < i12) {
                        list.add(Double.valueOf(Double.longBitsToDouble(Y())));
                    }
                    return;
                }
                do {
                    list.add(Double.valueOf(readDouble()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f4100c;
                    }
                } while (c0() == this.f4103f);
                this.f4100c = i10;
                return;
            }
            m mVar = (m) list;
            int b11 = t1.b(this.f4103f);
            if (b11 != 1) {
                if (b11 != 2) {
                    throw b0.d();
                }
                int c03 = c0();
                n0(c03);
                int i13 = this.f4100c + c03;
                while (this.f4100c < i13) {
                    mVar.h(Double.longBitsToDouble(Y()));
                }
                return;
            }
            do {
                mVar.h(readDouble());
                if (R()) {
                    return;
                } else {
                    i11 = this.f4100c;
                }
            } while (c0() == this.f4103f);
            this.f4100c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public long H() {
            h0(0);
            return d0();
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public String I() {
            return a0(true);
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public <T> T J(g1<T> g1Var, p pVar) {
            h0(2);
            return (T) Z(g1Var, pVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.f1
        public <T> void K(List<T> list, g1<T> g1Var, p pVar) {
            int i10;
            if (t1.b(this.f4103f) != 2) {
                throw b0.d();
            }
            int i11 = this.f4103f;
            do {
                list.add(Z(g1Var, pVar));
                if (R()) {
                    return;
                } else {
                    i10 = this.f4100c;
                }
            } while (c0() == i11);
            this.f4100c = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public <T> T L(g1<T> g1Var, p pVar) {
            h0(3);
            return (T) U(g1Var, pVar);
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public <T> T M(Class<T> cls, p pVar) {
            h0(2);
            return (T) Z(c1.a().d(cls), pVar);
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public <T> T N(Class<T> cls, p pVar) {
            h0(3);
            return (T) U(c1.a().d(cls), pVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.f1
        public <K, V> void O(Map<K, V> map, k0.a<K, V> aVar, p pVar) {
            h0(2);
            int c02 = c0();
            f0(c02);
            int i10 = this.f4102e;
            this.f4102e = this.f4100c + c02;
            try {
                Object obj = aVar.f4210b;
                Object obj2 = aVar.f4212d;
                while (true) {
                    int A = A();
                    if (A == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    }
                    if (A == 1) {
                        obj = T(aVar.f4209a, null, null);
                    } else if (A != 2) {
                        try {
                            if (!D()) {
                                throw new b0("Unable to parse map entry.");
                                break;
                            }
                        } catch (b0.a unused) {
                            if (!D()) {
                                throw new b0("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = T(aVar.f4211c, aVar.f4212d.getClass(), pVar);
                    }
                }
            } finally {
                this.f4102e = i10;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.f1
        public <T> void P(List<T> list, g1<T> g1Var, p pVar) {
            int i10;
            if (t1.b(this.f4103f) != 3) {
                throw b0.d();
            }
            int i11 = this.f4103f;
            do {
                list.add(U(g1Var, pVar));
                if (R()) {
                    return;
                } else {
                    i10 = this.f4100c;
                }
            } while (c0() == i11);
            this.f4100c = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public int a() {
            return this.f4103f;
        }

        public String a0(boolean z10) {
            h0(2);
            int c02 = c0();
            if (c02 == 0) {
                return "";
            }
            f0(c02);
            if (z10) {
                byte[] bArr = this.f4099b;
                int i10 = this.f4100c;
                if (!s1.n(bArr, i10, i10 + c02)) {
                    throw b0.c();
                }
            }
            String str = new String(this.f4099b, this.f4100c, c02, a0.f4078a);
            this.f4100c += c02;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public long b() {
            h0(1);
            return X();
        }

        public void b0(List<String> list, boolean z10) {
            int i10;
            int i11;
            if (t1.b(this.f4103f) != 2) {
                throw b0.d();
            }
            if (!(list instanceof g0) || z10) {
                do {
                    list.add(a0(z10));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f4100c;
                    }
                } while (c0() == this.f4103f);
                this.f4100c = i10;
                return;
            }
            g0 g0Var = (g0) list;
            do {
                g0Var.J0(o());
                if (R()) {
                    return;
                } else {
                    i11 = this.f4100c;
                }
            } while (c0() == this.f4103f);
            this.f4100c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void c(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof z)) {
                int b10 = t1.b(this.f4103f);
                if (b10 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i12 = this.f4100c + c02;
                    while (this.f4100c < i12) {
                        list.add(Integer.valueOf(W()));
                    }
                    return;
                }
                if (b10 != 5) {
                    throw b0.d();
                }
                do {
                    list.add(Integer.valueOf(E()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f4100c;
                    }
                } while (c0() == this.f4103f);
                this.f4100c = i10;
                return;
            }
            z zVar = (z) list;
            int b11 = t1.b(this.f4103f);
            if (b11 == 2) {
                int c03 = c0();
                m0(c03);
                int i13 = this.f4100c + c03;
                while (this.f4100c < i13) {
                    zVar.F0(W());
                }
                return;
            }
            if (b11 != 5) {
                throw b0.d();
            }
            do {
                zVar.F0(E());
                if (R()) {
                    return;
                } else {
                    i11 = this.f4100c;
                }
            } while (c0() == this.f4103f);
            this.f4100c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void d(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof i0)) {
                int b10 = t1.b(this.f4103f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw b0.d();
                    }
                    int c02 = this.f4100c + c0();
                    while (this.f4100c < c02) {
                        list.add(Long.valueOf(i.c(d0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(y()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f4100c;
                    }
                } while (c0() == this.f4103f);
                this.f4100c = i10;
                return;
            }
            i0 i0Var = (i0) list;
            int b11 = t1.b(this.f4103f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw b0.d();
                }
                int c03 = this.f4100c + c0();
                while (this.f4100c < c03) {
                    i0Var.k(i.c(d0()));
                }
                return;
            }
            do {
                i0Var.k(y());
                if (R()) {
                    return;
                } else {
                    i11 = this.f4100c;
                }
            } while (c0() == this.f4103f);
            this.f4100c = i11;
        }

        public long d0() {
            long j10;
            long j11;
            long j12;
            int i10;
            int i11 = this.f4100c;
            int i12 = this.f4102e;
            if (i12 == i11) {
                throw b0.k();
            }
            byte[] bArr = this.f4099b;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f4100c = i13;
                return b10;
            }
            if (i12 - i13 < 9) {
                return e0();
            }
            int i14 = i13 + 1;
            int i15 = b10 ^ (bArr[i13] << 7);
            if (i15 >= 0) {
                int i16 = i14 + 1;
                int i17 = i15 ^ (bArr[i14] << 14);
                if (i17 >= 0) {
                    i14 = i16;
                    j10 = i17 ^ 16256;
                } else {
                    i14 = i16 + 1;
                    int i18 = i17 ^ (bArr[i16] << 21);
                    if (i18 < 0) {
                        i10 = i18 ^ (-2080896);
                    } else {
                        long j13 = i18;
                        int i19 = i14 + 1;
                        long j14 = j13 ^ (bArr[i14] << 28);
                        if (j14 >= 0) {
                            j12 = 266354560;
                        } else {
                            i14 = i19 + 1;
                            long j15 = j14 ^ (bArr[i19] << 35);
                            if (j15 < 0) {
                                j11 = -34093383808L;
                            } else {
                                i19 = i14 + 1;
                                j14 = j15 ^ (bArr[i14] << 42);
                                if (j14 >= 0) {
                                    j12 = 4363953127296L;
                                } else {
                                    i14 = i19 + 1;
                                    j15 = j14 ^ (bArr[i19] << 49);
                                    if (j15 < 0) {
                                        j11 = -558586000294016L;
                                    } else {
                                        int i20 = i14 + 1;
                                        long j16 = (j15 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                        if (j16 < 0) {
                                            i14 = i20 + 1;
                                            if (bArr[i20] < 0) {
                                                throw b0.e();
                                            }
                                        } else {
                                            i14 = i20;
                                        }
                                        j10 = j16;
                                    }
                                }
                            }
                            j10 = j15 ^ j11;
                        }
                        j10 = j14 ^ j12;
                        i14 = i19;
                    }
                }
                this.f4100c = i14;
                return j10;
            }
            i10 = i15 ^ (-128);
            j10 = i10;
            this.f4100c = i14;
            return j10;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public boolean e() {
            h0(0);
            return c0() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public long f() {
            h0(1);
            return X();
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void g(List<Long> list) {
            int i10;
            int c02;
            int i11;
            if (!(list instanceof i0)) {
                int b10 = t1.b(this.f4103f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw b0.d();
                    }
                    c02 = this.f4100c + c0();
                    while (this.f4100c < c02) {
                        list.add(Long.valueOf(d0()));
                    }
                }
                do {
                    list.add(Long.valueOf(s()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f4100c;
                    }
                } while (c0() == this.f4103f);
                this.f4100c = i10;
                return;
            }
            i0 i0Var = (i0) list;
            int b11 = t1.b(this.f4103f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw b0.d();
                }
                c02 = this.f4100c + c0();
                while (this.f4100c < c02) {
                    i0Var.k(d0());
                }
            }
            do {
                i0Var.k(s());
                if (R()) {
                    return;
                } else {
                    i11 = this.f4100c;
                }
            } while (c0() == this.f4103f);
            this.f4100c = i11;
            return;
            g0(c02);
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public int h() {
            h0(0);
            return c0();
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void i(List<Long> list) {
            int i10;
            int c02;
            int i11;
            if (!(list instanceof i0)) {
                int b10 = t1.b(this.f4103f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw b0.d();
                    }
                    c02 = this.f4100c + c0();
                    while (this.f4100c < c02) {
                        list.add(Long.valueOf(d0()));
                    }
                }
                do {
                    list.add(Long.valueOf(H()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f4100c;
                    }
                } while (c0() == this.f4103f);
                this.f4100c = i10;
                return;
            }
            i0 i0Var = (i0) list;
            int b11 = t1.b(this.f4103f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw b0.d();
                }
                c02 = this.f4100c + c0();
                while (this.f4100c < c02) {
                    i0Var.k(d0());
                }
            }
            do {
                i0Var.k(H());
                if (R()) {
                    return;
                } else {
                    i11 = this.f4100c;
                }
            } while (c0() == this.f4103f);
            this.f4100c = i11;
            return;
            g0(c02);
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void j(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof z)) {
                int b10 = t1.b(this.f4103f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw b0.d();
                    }
                    int c02 = this.f4100c + c0();
                    while (this.f4100c < c02) {
                        list.add(Integer.valueOf(c0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(k()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f4100c;
                    }
                } while (c0() == this.f4103f);
                this.f4100c = i10;
                return;
            }
            z zVar = (z) list;
            int b11 = t1.b(this.f4103f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw b0.d();
                }
                int c03 = this.f4100c + c0();
                while (this.f4100c < c03) {
                    zVar.F0(c0());
                }
                return;
            }
            do {
                zVar.F0(k());
                if (R()) {
                    return;
                } else {
                    i11 = this.f4100c;
                }
            } while (c0() == this.f4103f);
            this.f4100c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public int k() {
            h0(0);
            return c0();
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public int l() {
            h0(0);
            return i.b(c0());
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void m(List<Boolean> list) {
            int i10;
            int c02;
            int i11;
            if (!(list instanceof f)) {
                int b10 = t1.b(this.f4103f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw b0.d();
                    }
                    c02 = this.f4100c + c0();
                    while (this.f4100c < c02) {
                        list.add(Boolean.valueOf(c0() != 0));
                    }
                }
                do {
                    list.add(Boolean.valueOf(e()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f4100c;
                    }
                } while (c0() == this.f4103f);
                this.f4100c = i10;
                return;
            }
            f fVar = (f) list;
            int b11 = t1.b(this.f4103f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw b0.d();
                }
                c02 = this.f4100c + c0();
                while (this.f4100c < c02) {
                    fVar.k(c0() != 0);
                }
            }
            do {
                fVar.k(e());
                if (R()) {
                    return;
                } else {
                    i11 = this.f4100c;
                }
            } while (c0() == this.f4103f);
            this.f4100c = i11;
            return;
            g0(c02);
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void n(List<String> list) {
            b0(list, true);
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public h o() {
            h0(2);
            int c02 = c0();
            if (c02 == 0) {
                return h.f4120b;
            }
            f0(c02);
            h D = this.f4098a ? h.D(this.f4099b, this.f4100c, c02) : h.l(this.f4099b, this.f4100c, c02);
            this.f4100c += c02;
            return D;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public int p() {
            h0(0);
            return c0();
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void q(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof i0)) {
                int b10 = t1.b(this.f4103f);
                if (b10 != 1) {
                    if (b10 != 2) {
                        throw b0.d();
                    }
                    int c02 = c0();
                    n0(c02);
                    int i12 = this.f4100c + c02;
                    while (this.f4100c < i12) {
                        list.add(Long.valueOf(Y()));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(b()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f4100c;
                    }
                } while (c0() == this.f4103f);
                this.f4100c = i10;
                return;
            }
            i0 i0Var = (i0) list;
            int b11 = t1.b(this.f4103f);
            if (b11 != 1) {
                if (b11 != 2) {
                    throw b0.d();
                }
                int c03 = c0();
                n0(c03);
                int i13 = this.f4100c + c03;
                while (this.f4100c < i13) {
                    i0Var.k(Y());
                }
                return;
            }
            do {
                i0Var.k(b());
                if (R()) {
                    return;
                } else {
                    i11 = this.f4100c;
                }
            } while (c0() == this.f4103f);
            this.f4100c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void r(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof z)) {
                int b10 = t1.b(this.f4103f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw b0.d();
                    }
                    int c02 = this.f4100c + c0();
                    while (this.f4100c < c02) {
                        list.add(Integer.valueOf(i.b(c0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(l()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f4100c;
                    }
                } while (c0() == this.f4103f);
                this.f4100c = i10;
                return;
            }
            z zVar = (z) list;
            int b11 = t1.b(this.f4103f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw b0.d();
                }
                int c03 = this.f4100c + c0();
                while (this.f4100c < c03) {
                    zVar.F0(i.b(c0()));
                }
                return;
            }
            do {
                zVar.F0(l());
                if (R()) {
                    return;
                } else {
                    i11 = this.f4100c;
                }
            } while (c0() == this.f4103f);
            this.f4100c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public double readDouble() {
            h0(1);
            return Double.longBitsToDouble(X());
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public float readFloat() {
            h0(5);
            return Float.intBitsToFloat(V());
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public long s() {
            h0(0);
            return d0();
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void t(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof z)) {
                int b10 = t1.b(this.f4103f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw b0.d();
                    }
                    int c02 = this.f4100c + c0();
                    while (this.f4100c < c02) {
                        list.add(Integer.valueOf(c0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(h()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f4100c;
                    }
                } while (c0() == this.f4103f);
                this.f4100c = i10;
                return;
            }
            z zVar = (z) list;
            int b11 = t1.b(this.f4103f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw b0.d();
                }
                int c03 = this.f4100c + c0();
                while (this.f4100c < c03) {
                    zVar.F0(c0());
                }
                return;
            }
            do {
                zVar.F0(h());
                if (R()) {
                    return;
                } else {
                    i11 = this.f4100c;
                }
            } while (c0() == this.f4103f);
            this.f4100c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public int u() {
            h0(5);
            return V();
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void v(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof i0)) {
                int b10 = t1.b(this.f4103f);
                if (b10 != 1) {
                    if (b10 != 2) {
                        throw b0.d();
                    }
                    int c02 = c0();
                    n0(c02);
                    int i12 = this.f4100c + c02;
                    while (this.f4100c < i12) {
                        list.add(Long.valueOf(Y()));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(f()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f4100c;
                    }
                } while (c0() == this.f4103f);
                this.f4100c = i10;
                return;
            }
            i0 i0Var = (i0) list;
            int b11 = t1.b(this.f4103f);
            if (b11 != 1) {
                if (b11 != 2) {
                    throw b0.d();
                }
                int c03 = c0();
                n0(c03);
                int i13 = this.f4100c + c03;
                while (this.f4100c < i13) {
                    i0Var.k(Y());
                }
                return;
            }
            do {
                i0Var.k(f());
                if (R()) {
                    return;
                } else {
                    i11 = this.f4100c;
                }
            } while (c0() == this.f4103f);
            this.f4100c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void w(List<Integer> list) {
            int i10;
            int c02;
            int i11;
            if (!(list instanceof z)) {
                int b10 = t1.b(this.f4103f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw b0.d();
                    }
                    c02 = this.f4100c + c0();
                    while (this.f4100c < c02) {
                        list.add(Integer.valueOf(c0()));
                    }
                }
                do {
                    list.add(Integer.valueOf(p()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f4100c;
                    }
                } while (c0() == this.f4103f);
                this.f4100c = i10;
                return;
            }
            z zVar = (z) list;
            int b11 = t1.b(this.f4103f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw b0.d();
                }
                c02 = this.f4100c + c0();
                while (this.f4100c < c02) {
                    zVar.F0(c0());
                }
            }
            do {
                zVar.F0(p());
                if (R()) {
                    return;
                } else {
                    i11 = this.f4100c;
                }
            } while (c0() == this.f4103f);
            this.f4100c = i11;
            return;
            g0(c02);
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public void x(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof z)) {
                int b10 = t1.b(this.f4103f);
                if (b10 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i12 = this.f4100c + c02;
                    while (this.f4100c < i12) {
                        list.add(Integer.valueOf(W()));
                    }
                    return;
                }
                if (b10 != 5) {
                    throw b0.d();
                }
                do {
                    list.add(Integer.valueOf(u()));
                    if (R()) {
                        return;
                    } else {
                        i10 = this.f4100c;
                    }
                } while (c0() == this.f4103f);
                this.f4100c = i10;
                return;
            }
            z zVar = (z) list;
            int b11 = t1.b(this.f4103f);
            if (b11 == 2) {
                int c03 = c0();
                m0(c03);
                int i13 = this.f4100c + c03;
                while (this.f4100c < i13) {
                    zVar.F0(W());
                }
                return;
            }
            if (b11 != 5) {
                throw b0.d();
            }
            do {
                zVar.F0(u());
                if (R()) {
                    return;
                } else {
                    i11 = this.f4100c;
                }
            } while (c0() == this.f4103f);
            this.f4100c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public long y() {
            h0(0);
            return i.c(d0());
        }

        @Override // androidx.datastore.preferences.protobuf.f1
        public String z() {
            return a0(false);
        }
    }

    private e() {
    }

    /* synthetic */ e(a aVar) {
        this();
    }

    public static e Q(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z10);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
