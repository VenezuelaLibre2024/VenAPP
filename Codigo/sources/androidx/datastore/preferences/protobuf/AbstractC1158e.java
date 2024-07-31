package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1150b0;
import androidx.datastore.preferences.protobuf.C1177k0;
import androidx.datastore.preferences.protobuf.C1205t1;
import com.google.android.gms.common.api.C5101a;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.e */
/* loaded from: classes.dex */
abstract class AbstractC1158e implements InterfaceC1163f1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.e$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4808a;

        static {
            int[] iArr = new int[C1205t1.b.values().length];
            f4808a = iArr;
            try {
                iArr[C1205t1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4808a[C1205t1.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4808a[C1205t1.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4808a[C1205t1.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4808a[C1205t1.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4808a[C1205t1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4808a[C1205t1.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4808a[C1205t1.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4808a[C1205t1.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4808a[C1205t1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4808a[C1205t1.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4808a[C1205t1.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4808a[C1205t1.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4808a[C1205t1.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4808a[C1205t1.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4808a[C1205t1.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4808a[C1205t1.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.e$b */
    /* loaded from: classes.dex */
    private static final class b extends AbstractC1158e {

        /* renamed from: a */
        private final boolean f4809a;

        /* renamed from: b */
        private final byte[] f4810b;

        /* renamed from: c */
        private int f4811c;

        /* renamed from: d */
        private final int f4812d;

        /* renamed from: e */
        private int f4813e;

        /* renamed from: f */
        private int f4814f;

        /* renamed from: g */
        private int f4815g;

        public b(ByteBuffer byteBuffer, boolean z10) {
            super(null);
            this.f4809a = z10;
            this.f4810b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f4811c = arrayOffset;
            this.f4812d = arrayOffset;
            this.f4813e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* renamed from: R */
        private boolean m5694R() {
            return this.f4811c == this.f4813e;
        }

        /* renamed from: S */
        private byte m5695S() {
            int i10 = this.f4811c;
            if (i10 == this.f4813e) {
                throw C1150b0.m5673k();
            }
            byte[] bArr = this.f4810b;
            this.f4811c = i10 + 1;
            return bArr[i10];
        }

        /* renamed from: T */
        private Object m5696T(C1205t1.b bVar, Class<?> cls, C1191p c1191p) {
            switch (a.f4808a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(mo5737e());
                case 2:
                    return mo5747o();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(mo5743k());
                case 5:
                    return Integer.valueOf(mo5753u());
                case 6:
                    return Long.valueOf(mo5732b());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(mo5748p());
                case 9:
                    return Long.valueOf(mo5721H());
                case 10:
                    return mo5726M(cls, c1191p);
                case 11:
                    return Integer.valueOf(mo5718E());
                case 12:
                    return Long.valueOf(mo5738f());
                case 13:
                    return Integer.valueOf(mo5744l());
                case 14:
                    return Long.valueOf(mo5757y());
                case 15:
                    return mo5722I();
                case 16:
                    return Integer.valueOf(mo5740h());
                case 17:
                    return Long.valueOf(mo5751s());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        /* renamed from: U */
        private <T> T m5697U(InterfaceC1166g1<T> interfaceC1166g1, C1191p c1191p) {
            int i10 = this.f4815g;
            this.f4815g = C1205t1.m6428c(C1205t1.m6426a(this.f4814f), 4);
            try {
                T mo5796e = interfaceC1166g1.mo5796e();
                interfaceC1166g1.mo5799h(mo5796e, this, c1191p);
                interfaceC1166g1.mo5793b(mo5796e);
                if (this.f4814f == this.f4815g) {
                    return mo5796e;
                }
                throw C1150b0.m5670g();
            } finally {
                this.f4815g = i10;
            }
        }

        /* renamed from: V */
        private int m5698V() {
            m5705f0(4);
            return m5699W();
        }

        /* renamed from: W */
        private int m5699W() {
            int i10 = this.f4811c;
            byte[] bArr = this.f4810b;
            this.f4811c = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        /* renamed from: X */
        private long m5700X() {
            m5705f0(8);
            return m5701Y();
        }

        /* renamed from: Y */
        private long m5701Y() {
            int i10 = this.f4811c;
            byte[] bArr = this.f4810b;
            this.f4811c = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* renamed from: Z */
        private <T> T m5702Z(InterfaceC1166g1<T> interfaceC1166g1, C1191p c1191p) {
            int m5703c0 = m5703c0();
            m5705f0(m5703c0);
            int i10 = this.f4813e;
            int i11 = this.f4811c + m5703c0;
            this.f4813e = i11;
            try {
                T mo5796e = interfaceC1166g1.mo5796e();
                interfaceC1166g1.mo5799h(mo5796e, this, c1191p);
                interfaceC1166g1.mo5793b(mo5796e);
                if (this.f4811c == i11) {
                    return mo5796e;
                }
                throw C1150b0.m5670g();
            } finally {
                this.f4813e = i10;
            }
        }

        /* renamed from: c0 */
        private int m5703c0() {
            int i10;
            int i11 = this.f4811c;
            int i12 = this.f4813e;
            if (i12 == i11) {
                throw C1150b0.m5673k();
            }
            byte[] bArr = this.f4810b;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f4811c = i13;
                return b10;
            }
            if (i12 - i13 < 9) {
                return (int) m5704e0();
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
                                                throw C1150b0.m5668e();
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
            this.f4811c = i14;
            return i10;
        }

        /* renamed from: e0 */
        private long m5704e0() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((m5695S() & 128) == 0) {
                    return j10;
                }
            }
            throw C1150b0.m5668e();
        }

        /* renamed from: f0 */
        private void m5705f0(int i10) {
            if (i10 < 0 || i10 > this.f4813e - this.f4811c) {
                throw C1150b0.m5673k();
            }
        }

        /* renamed from: g0 */
        private void m5706g0(int i10) {
            if (this.f4811c != i10) {
                throw C1150b0.m5673k();
            }
        }

        /* renamed from: h0 */
        private void m5707h0(int i10) {
            if (C1205t1.m6427b(this.f4814f) != i10) {
                throw C1150b0.m5667d();
            }
        }

        /* renamed from: i0 */
        private void m5708i0(int i10) {
            m5705f0(i10);
            this.f4811c += i10;
        }

        /* renamed from: j0 */
        private void m5709j0() {
            int i10 = this.f4815g;
            this.f4815g = C1205t1.m6428c(C1205t1.m6426a(this.f4814f), 4);
            while (mo5714A() != Integer.MAX_VALUE && mo5717D()) {
            }
            if (this.f4814f != this.f4815g) {
                throw C1150b0.m5670g();
            }
            this.f4815g = i10;
        }

        /* renamed from: k0 */
        private void m5710k0() {
            int i10 = this.f4813e;
            int i11 = this.f4811c;
            if (i10 - i11 >= 10) {
                byte[] bArr = this.f4810b;
                int i12 = 0;
                while (i12 < 10) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        this.f4811c = i13;
                        return;
                    } else {
                        i12++;
                        i11 = i13;
                    }
                }
            }
            m5711l0();
        }

        /* renamed from: l0 */
        private void m5711l0() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (m5695S() >= 0) {
                    return;
                }
            }
            throw C1150b0.m5668e();
        }

        /* renamed from: m0 */
        private void m5712m0(int i10) {
            m5705f0(i10);
            if ((i10 & 3) != 0) {
                throw C1150b0.m5670g();
            }
        }

        /* renamed from: n0 */
        private void m5713n0(int i10) {
            m5705f0(i10);
            if ((i10 & 7) != 0) {
                throw C1150b0.m5670g();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: A */
        public int mo5714A() {
            if (m5694R()) {
                return C5101a.e.API_PRIORITY_OTHER;
            }
            int m5703c0 = m5703c0();
            this.f4814f = m5703c0;
            return m5703c0 == this.f4815g ? C5101a.e.API_PRIORITY_OTHER : C1205t1.m6426a(m5703c0);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: B */
        public void mo5715B(List<String> list) {
            m5733b0(list, false);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: C */
        public void mo5716C(List<Float> list) {
            int i10;
            int i11;
            if (!(list instanceof C1211w)) {
                int m6427b = C1205t1.m6427b(this.f4814f);
                if (m6427b == 2) {
                    int m5703c0 = m5703c0();
                    m5712m0(m5703c0);
                    int i12 = this.f4811c + m5703c0;
                    while (this.f4811c < i12) {
                        list.add(Float.valueOf(Float.intBitsToFloat(m5699W())));
                    }
                    return;
                }
                if (m6427b != 5) {
                    throw C1150b0.m5667d();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (m5694R()) {
                        return;
                    } else {
                        i10 = this.f4811c;
                    }
                } while (m5703c0() == this.f4814f);
                this.f4811c = i10;
                return;
            }
            C1211w c1211w = (C1211w) list;
            int m6427b2 = C1205t1.m6427b(this.f4814f);
            if (m6427b2 == 2) {
                int m5703c02 = m5703c0();
                m5712m0(m5703c02);
                int i13 = this.f4811c + m5703c02;
                while (this.f4811c < i13) {
                    c1211w.m6533h(Float.intBitsToFloat(m5699W()));
                }
                return;
            }
            if (m6427b2 != 5) {
                throw C1150b0.m5667d();
            }
            do {
                c1211w.m6533h(readFloat());
                if (m5694R()) {
                    return;
                } else {
                    i11 = this.f4811c;
                }
            } while (m5703c0() == this.f4814f);
            this.f4811c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: D */
        public boolean mo5717D() {
            int i10;
            int i11;
            if (m5694R() || (i10 = this.f4814f) == this.f4815g) {
                return false;
            }
            int m6427b = C1205t1.m6427b(i10);
            if (m6427b == 0) {
                m5710k0();
                return true;
            }
            if (m6427b == 1) {
                i11 = 8;
            } else if (m6427b == 2) {
                i11 = m5703c0();
            } else {
                if (m6427b == 3) {
                    m5709j0();
                    return true;
                }
                if (m6427b != 5) {
                    throw C1150b0.m5667d();
                }
                i11 = 4;
            }
            m5708i0(i11);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: E */
        public int mo5718E() {
            m5707h0(5);
            return m5698V();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: F */
        public void mo5719F(List<AbstractC1167h> list) {
            int i10;
            if (C1205t1.m6427b(this.f4814f) != 2) {
                throw C1150b0.m5667d();
            }
            do {
                list.add(mo5747o());
                if (m5694R()) {
                    return;
                } else {
                    i10 = this.f4811c;
                }
            } while (m5703c0() == this.f4814f);
            this.f4811c = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: G */
        public void mo5720G(List<Double> list) {
            int i10;
            int i11;
            if (!(list instanceof C1182m)) {
                int m6427b = C1205t1.m6427b(this.f4814f);
                if (m6427b != 1) {
                    if (m6427b != 2) {
                        throw C1150b0.m5667d();
                    }
                    int m5703c0 = m5703c0();
                    m5713n0(m5703c0);
                    int i12 = this.f4811c + m5703c0;
                    while (this.f4811c < i12) {
                        list.add(Double.valueOf(Double.longBitsToDouble(m5701Y())));
                    }
                    return;
                }
                do {
                    list.add(Double.valueOf(readDouble()));
                    if (m5694R()) {
                        return;
                    } else {
                        i10 = this.f4811c;
                    }
                } while (m5703c0() == this.f4814f);
                this.f4811c = i10;
                return;
            }
            C1182m c1182m = (C1182m) list;
            int m6427b2 = C1205t1.m6427b(this.f4814f);
            if (m6427b2 != 1) {
                if (m6427b2 != 2) {
                    throw C1150b0.m5667d();
                }
                int m5703c02 = m5703c0();
                m5713n0(m5703c02);
                int i13 = this.f4811c + m5703c02;
                while (this.f4811c < i13) {
                    c1182m.m6211h(Double.longBitsToDouble(m5701Y()));
                }
                return;
            }
            do {
                c1182m.m6211h(readDouble());
                if (m5694R()) {
                    return;
                } else {
                    i11 = this.f4811c;
                }
            } while (m5703c0() == this.f4814f);
            this.f4811c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: H */
        public long mo5721H() {
            m5707h0(0);
            return m5736d0();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: I */
        public String mo5722I() {
            return m5731a0(true);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: J */
        public <T> T mo5723J(InterfaceC1166g1<T> interfaceC1166g1, C1191p c1191p) {
            m5707h0(2);
            return (T) m5702Z(interfaceC1166g1, c1191p);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: K */
        public <T> void mo5724K(List<T> list, InterfaceC1166g1<T> interfaceC1166g1, C1191p c1191p) {
            int i10;
            if (C1205t1.m6427b(this.f4814f) != 2) {
                throw C1150b0.m5667d();
            }
            int i11 = this.f4814f;
            do {
                list.add(m5702Z(interfaceC1166g1, c1191p));
                if (m5694R()) {
                    return;
                } else {
                    i10 = this.f4811c;
                }
            } while (m5703c0() == i11);
            this.f4811c = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: L */
        public <T> T mo5725L(InterfaceC1166g1<T> interfaceC1166g1, C1191p c1191p) {
            m5707h0(3);
            return (T) m5697U(interfaceC1166g1, c1191p);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: M */
        public <T> T mo5726M(Class<T> cls, C1191p c1191p) {
            m5707h0(2);
            return (T) m5702Z(C1154c1.m5677a().m5680d(cls), c1191p);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: N */
        public <T> T mo5727N(Class<T> cls, C1191p c1191p) {
            m5707h0(3);
            return (T) m5697U(C1154c1.m5677a().m5680d(cls), c1191p);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: O */
        public <K, V> void mo5728O(Map<K, V> map, C1177k0.a<K, V> aVar, C1191p c1191p) {
            m5707h0(2);
            int m5703c0 = m5703c0();
            m5705f0(m5703c0);
            int i10 = this.f4813e;
            this.f4813e = this.f4811c + m5703c0;
            try {
                Object obj = aVar.f4921b;
                Object obj2 = aVar.f4923d;
                while (true) {
                    int mo5714A = mo5714A();
                    if (mo5714A == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    }
                    if (mo5714A == 1) {
                        obj = m5696T(aVar.f4920a, null, null);
                    } else if (mo5714A != 2) {
                        try {
                            if (!mo5717D()) {
                                throw new C1150b0("Unable to parse map entry.");
                                break;
                            }
                        } catch (C1150b0.a unused) {
                            if (!mo5717D()) {
                                throw new C1150b0("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = m5696T(aVar.f4922c, aVar.f4923d.getClass(), c1191p);
                    }
                }
            } finally {
                this.f4813e = i10;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: P */
        public <T> void mo5729P(List<T> list, InterfaceC1166g1<T> interfaceC1166g1, C1191p c1191p) {
            int i10;
            if (C1205t1.m6427b(this.f4814f) != 3) {
                throw C1150b0.m5667d();
            }
            int i11 = this.f4814f;
            do {
                list.add(m5697U(interfaceC1166g1, c1191p));
                if (m5694R()) {
                    return;
                } else {
                    i10 = this.f4811c;
                }
            } while (m5703c0() == i11);
            this.f4811c = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: a */
        public int mo5730a() {
            return this.f4814f;
        }

        /* renamed from: a0 */
        public String m5731a0(boolean z10) {
            m5707h0(2);
            int m5703c0 = m5703c0();
            if (m5703c0 == 0) {
                return "";
            }
            m5705f0(m5703c0);
            if (z10) {
                byte[] bArr = this.f4810b;
                int i10 = this.f4811c;
                if (!C1202s1.m6392n(bArr, i10, i10 + m5703c0)) {
                    throw C1150b0.m5666c();
                }
            }
            String str = new String(this.f4810b, this.f4811c, m5703c0, C1147a0.f4789a);
            this.f4811c += m5703c0;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: b */
        public long mo5732b() {
            m5707h0(1);
            return m5700X();
        }

        /* renamed from: b0 */
        public void m5733b0(List<String> list, boolean z10) {
            int i10;
            int i11;
            if (C1205t1.m6427b(this.f4814f) != 2) {
                throw C1150b0.m5667d();
            }
            if (!(list instanceof InterfaceC1165g0) || z10) {
                do {
                    list.add(m5731a0(z10));
                    if (m5694R()) {
                        return;
                    } else {
                        i10 = this.f4811c;
                    }
                } while (m5703c0() == this.f4814f);
                this.f4811c = i10;
                return;
            }
            InterfaceC1165g0 interfaceC1165g0 = (InterfaceC1165g0) list;
            do {
                interfaceC1165g0.mo5782J0(mo5747o());
                if (m5694R()) {
                    return;
                } else {
                    i11 = this.f4811c;
                }
            } while (m5703c0() == this.f4814f);
            this.f4811c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: c */
        public void mo5734c(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof C1217z)) {
                int m6427b = C1205t1.m6427b(this.f4814f);
                if (m6427b == 2) {
                    int m5703c0 = m5703c0();
                    m5712m0(m5703c0);
                    int i12 = this.f4811c + m5703c0;
                    while (this.f4811c < i12) {
                        list.add(Integer.valueOf(m5699W()));
                    }
                    return;
                }
                if (m6427b != 5) {
                    throw C1150b0.m5667d();
                }
                do {
                    list.add(Integer.valueOf(mo5718E()));
                    if (m5694R()) {
                        return;
                    } else {
                        i10 = this.f4811c;
                    }
                } while (m5703c0() == this.f4814f);
                this.f4811c = i10;
                return;
            }
            C1217z c1217z = (C1217z) list;
            int m6427b2 = C1205t1.m6427b(this.f4814f);
            if (m6427b2 == 2) {
                int m5703c02 = m5703c0();
                m5712m0(m5703c02);
                int i13 = this.f4811c + m5703c02;
                while (this.f4811c < i13) {
                    c1217z.m6584F0(m5699W());
                }
                return;
            }
            if (m6427b2 != 5) {
                throw C1150b0.m5667d();
            }
            do {
                c1217z.m6584F0(mo5718E());
                if (m5694R()) {
                    return;
                } else {
                    i11 = this.f4811c;
                }
            } while (m5703c0() == this.f4814f);
            this.f4811c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: d */
        public void mo5735d(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof C1171i0)) {
                int m6427b = C1205t1.m6427b(this.f4814f);
                if (m6427b != 0) {
                    if (m6427b != 2) {
                        throw C1150b0.m5667d();
                    }
                    int m5703c0 = this.f4811c + m5703c0();
                    while (this.f4811c < m5703c0) {
                        list.add(Long.valueOf(AbstractC1170i.m5843c(m5736d0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(mo5757y()));
                    if (m5694R()) {
                        return;
                    } else {
                        i10 = this.f4811c;
                    }
                } while (m5703c0() == this.f4814f);
                this.f4811c = i10;
                return;
            }
            C1171i0 c1171i0 = (C1171i0) list;
            int m6427b2 = C1205t1.m6427b(this.f4814f);
            if (m6427b2 != 0) {
                if (m6427b2 != 2) {
                    throw C1150b0.m5667d();
                }
                int m5703c02 = this.f4811c + m5703c0();
                while (this.f4811c < m5703c02) {
                    c1171i0.m5910k(AbstractC1170i.m5843c(m5736d0()));
                }
                return;
            }
            do {
                c1171i0.m5910k(mo5757y());
                if (m5694R()) {
                    return;
                } else {
                    i11 = this.f4811c;
                }
            } while (m5703c0() == this.f4814f);
            this.f4811c = i11;
        }

        /* renamed from: d0 */
        public long m5736d0() {
            long j10;
            long j11;
            long j12;
            int i10;
            int i11 = this.f4811c;
            int i12 = this.f4813e;
            if (i12 == i11) {
                throw C1150b0.m5673k();
            }
            byte[] bArr = this.f4810b;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f4811c = i13;
                return b10;
            }
            if (i12 - i13 < 9) {
                return m5704e0();
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
                                                throw C1150b0.m5668e();
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
                this.f4811c = i14;
                return j10;
            }
            i10 = i15 ^ (-128);
            j10 = i10;
            this.f4811c = i14;
            return j10;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: e */
        public boolean mo5737e() {
            m5707h0(0);
            return m5703c0() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: f */
        public long mo5738f() {
            m5707h0(1);
            return m5700X();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: g */
        public void mo5739g(List<Long> list) {
            int i10;
            int m5703c0;
            int i11;
            if (!(list instanceof C1171i0)) {
                int m6427b = C1205t1.m6427b(this.f4814f);
                if (m6427b != 0) {
                    if (m6427b != 2) {
                        throw C1150b0.m5667d();
                    }
                    m5703c0 = this.f4811c + m5703c0();
                    while (this.f4811c < m5703c0) {
                        list.add(Long.valueOf(m5736d0()));
                    }
                }
                do {
                    list.add(Long.valueOf(mo5751s()));
                    if (m5694R()) {
                        return;
                    } else {
                        i10 = this.f4811c;
                    }
                } while (m5703c0() == this.f4814f);
                this.f4811c = i10;
                return;
            }
            C1171i0 c1171i0 = (C1171i0) list;
            int m6427b2 = C1205t1.m6427b(this.f4814f);
            if (m6427b2 != 0) {
                if (m6427b2 != 2) {
                    throw C1150b0.m5667d();
                }
                m5703c0 = this.f4811c + m5703c0();
                while (this.f4811c < m5703c0) {
                    c1171i0.m5910k(m5736d0());
                }
            }
            do {
                c1171i0.m5910k(mo5751s());
                if (m5694R()) {
                    return;
                } else {
                    i11 = this.f4811c;
                }
            } while (m5703c0() == this.f4814f);
            this.f4811c = i11;
            return;
            m5706g0(m5703c0);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: h */
        public int mo5740h() {
            m5707h0(0);
            return m5703c0();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: i */
        public void mo5741i(List<Long> list) {
            int i10;
            int m5703c0;
            int i11;
            if (!(list instanceof C1171i0)) {
                int m6427b = C1205t1.m6427b(this.f4814f);
                if (m6427b != 0) {
                    if (m6427b != 2) {
                        throw C1150b0.m5667d();
                    }
                    m5703c0 = this.f4811c + m5703c0();
                    while (this.f4811c < m5703c0) {
                        list.add(Long.valueOf(m5736d0()));
                    }
                }
                do {
                    list.add(Long.valueOf(mo5721H()));
                    if (m5694R()) {
                        return;
                    } else {
                        i10 = this.f4811c;
                    }
                } while (m5703c0() == this.f4814f);
                this.f4811c = i10;
                return;
            }
            C1171i0 c1171i0 = (C1171i0) list;
            int m6427b2 = C1205t1.m6427b(this.f4814f);
            if (m6427b2 != 0) {
                if (m6427b2 != 2) {
                    throw C1150b0.m5667d();
                }
                m5703c0 = this.f4811c + m5703c0();
                while (this.f4811c < m5703c0) {
                    c1171i0.m5910k(m5736d0());
                }
            }
            do {
                c1171i0.m5910k(mo5721H());
                if (m5694R()) {
                    return;
                } else {
                    i11 = this.f4811c;
                }
            } while (m5703c0() == this.f4814f);
            this.f4811c = i11;
            return;
            m5706g0(m5703c0);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: j */
        public void mo5742j(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof C1217z)) {
                int m6427b = C1205t1.m6427b(this.f4814f);
                if (m6427b != 0) {
                    if (m6427b != 2) {
                        throw C1150b0.m5667d();
                    }
                    int m5703c0 = this.f4811c + m5703c0();
                    while (this.f4811c < m5703c0) {
                        list.add(Integer.valueOf(m5703c0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo5743k()));
                    if (m5694R()) {
                        return;
                    } else {
                        i10 = this.f4811c;
                    }
                } while (m5703c0() == this.f4814f);
                this.f4811c = i10;
                return;
            }
            C1217z c1217z = (C1217z) list;
            int m6427b2 = C1205t1.m6427b(this.f4814f);
            if (m6427b2 != 0) {
                if (m6427b2 != 2) {
                    throw C1150b0.m5667d();
                }
                int m5703c02 = this.f4811c + m5703c0();
                while (this.f4811c < m5703c02) {
                    c1217z.m6584F0(m5703c0());
                }
                return;
            }
            do {
                c1217z.m6584F0(mo5743k());
                if (m5694R()) {
                    return;
                } else {
                    i11 = this.f4811c;
                }
            } while (m5703c0() == this.f4814f);
            this.f4811c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: k */
        public int mo5743k() {
            m5707h0(0);
            return m5703c0();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: l */
        public int mo5744l() {
            m5707h0(0);
            return AbstractC1170i.m5842b(m5703c0());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: m */
        public void mo5745m(List<Boolean> list) {
            int i10;
            int m5703c0;
            int i11;
            if (!(list instanceof C1161f)) {
                int m6427b = C1205t1.m6427b(this.f4814f);
                if (m6427b != 0) {
                    if (m6427b != 2) {
                        throw C1150b0.m5667d();
                    }
                    m5703c0 = this.f4811c + m5703c0();
                    while (this.f4811c < m5703c0) {
                        list.add(Boolean.valueOf(m5703c0() != 0));
                    }
                }
                do {
                    list.add(Boolean.valueOf(mo5737e()));
                    if (m5694R()) {
                        return;
                    } else {
                        i10 = this.f4811c;
                    }
                } while (m5703c0() == this.f4814f);
                this.f4811c = i10;
                return;
            }
            C1161f c1161f = (C1161f) list;
            int m6427b2 = C1205t1.m6427b(this.f4814f);
            if (m6427b2 != 0) {
                if (m6427b2 != 2) {
                    throw C1150b0.m5667d();
                }
                m5703c0 = this.f4811c + m5703c0();
                while (this.f4811c < m5703c0) {
                    c1161f.m5774k(m5703c0() != 0);
                }
            }
            do {
                c1161f.m5774k(mo5737e());
                if (m5694R()) {
                    return;
                } else {
                    i11 = this.f4811c;
                }
            } while (m5703c0() == this.f4814f);
            this.f4811c = i11;
            return;
            m5706g0(m5703c0);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: n */
        public void mo5746n(List<String> list) {
            m5733b0(list, true);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: o */
        public AbstractC1167h mo5747o() {
            m5707h0(2);
            int m5703c0 = m5703c0();
            if (m5703c0 == 0) {
                return AbstractC1167h.f4831b;
            }
            m5705f0(m5703c0);
            AbstractC1167h m5802D = this.f4809a ? AbstractC1167h.m5802D(this.f4810b, this.f4811c, m5703c0) : AbstractC1167h.m5807l(this.f4810b, this.f4811c, m5703c0);
            this.f4811c += m5703c0;
            return m5802D;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: p */
        public int mo5748p() {
            m5707h0(0);
            return m5703c0();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: q */
        public void mo5749q(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof C1171i0)) {
                int m6427b = C1205t1.m6427b(this.f4814f);
                if (m6427b != 1) {
                    if (m6427b != 2) {
                        throw C1150b0.m5667d();
                    }
                    int m5703c0 = m5703c0();
                    m5713n0(m5703c0);
                    int i12 = this.f4811c + m5703c0;
                    while (this.f4811c < i12) {
                        list.add(Long.valueOf(m5701Y()));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(mo5732b()));
                    if (m5694R()) {
                        return;
                    } else {
                        i10 = this.f4811c;
                    }
                } while (m5703c0() == this.f4814f);
                this.f4811c = i10;
                return;
            }
            C1171i0 c1171i0 = (C1171i0) list;
            int m6427b2 = C1205t1.m6427b(this.f4814f);
            if (m6427b2 != 1) {
                if (m6427b2 != 2) {
                    throw C1150b0.m5667d();
                }
                int m5703c02 = m5703c0();
                m5713n0(m5703c02);
                int i13 = this.f4811c + m5703c02;
                while (this.f4811c < i13) {
                    c1171i0.m5910k(m5701Y());
                }
                return;
            }
            do {
                c1171i0.m5910k(mo5732b());
                if (m5694R()) {
                    return;
                } else {
                    i11 = this.f4811c;
                }
            } while (m5703c0() == this.f4814f);
            this.f4811c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: r */
        public void mo5750r(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof C1217z)) {
                int m6427b = C1205t1.m6427b(this.f4814f);
                if (m6427b != 0) {
                    if (m6427b != 2) {
                        throw C1150b0.m5667d();
                    }
                    int m5703c0 = this.f4811c + m5703c0();
                    while (this.f4811c < m5703c0) {
                        list.add(Integer.valueOf(AbstractC1170i.m5842b(m5703c0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo5744l()));
                    if (m5694R()) {
                        return;
                    } else {
                        i10 = this.f4811c;
                    }
                } while (m5703c0() == this.f4814f);
                this.f4811c = i10;
                return;
            }
            C1217z c1217z = (C1217z) list;
            int m6427b2 = C1205t1.m6427b(this.f4814f);
            if (m6427b2 != 0) {
                if (m6427b2 != 2) {
                    throw C1150b0.m5667d();
                }
                int m5703c02 = this.f4811c + m5703c0();
                while (this.f4811c < m5703c02) {
                    c1217z.m6584F0(AbstractC1170i.m5842b(m5703c0()));
                }
                return;
            }
            do {
                c1217z.m6584F0(mo5744l());
                if (m5694R()) {
                    return;
                } else {
                    i11 = this.f4811c;
                }
            } while (m5703c0() == this.f4814f);
            this.f4811c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        public double readDouble() {
            m5707h0(1);
            return Double.longBitsToDouble(m5700X());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        public float readFloat() {
            m5707h0(5);
            return Float.intBitsToFloat(m5698V());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: s */
        public long mo5751s() {
            m5707h0(0);
            return m5736d0();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: t */
        public void mo5752t(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof C1217z)) {
                int m6427b = C1205t1.m6427b(this.f4814f);
                if (m6427b != 0) {
                    if (m6427b != 2) {
                        throw C1150b0.m5667d();
                    }
                    int m5703c0 = this.f4811c + m5703c0();
                    while (this.f4811c < m5703c0) {
                        list.add(Integer.valueOf(m5703c0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo5740h()));
                    if (m5694R()) {
                        return;
                    } else {
                        i10 = this.f4811c;
                    }
                } while (m5703c0() == this.f4814f);
                this.f4811c = i10;
                return;
            }
            C1217z c1217z = (C1217z) list;
            int m6427b2 = C1205t1.m6427b(this.f4814f);
            if (m6427b2 != 0) {
                if (m6427b2 != 2) {
                    throw C1150b0.m5667d();
                }
                int m5703c02 = this.f4811c + m5703c0();
                while (this.f4811c < m5703c02) {
                    c1217z.m6584F0(m5703c0());
                }
                return;
            }
            do {
                c1217z.m6584F0(mo5740h());
                if (m5694R()) {
                    return;
                } else {
                    i11 = this.f4811c;
                }
            } while (m5703c0() == this.f4814f);
            this.f4811c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: u */
        public int mo5753u() {
            m5707h0(5);
            return m5698V();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: v */
        public void mo5754v(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof C1171i0)) {
                int m6427b = C1205t1.m6427b(this.f4814f);
                if (m6427b != 1) {
                    if (m6427b != 2) {
                        throw C1150b0.m5667d();
                    }
                    int m5703c0 = m5703c0();
                    m5713n0(m5703c0);
                    int i12 = this.f4811c + m5703c0;
                    while (this.f4811c < i12) {
                        list.add(Long.valueOf(m5701Y()));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(mo5738f()));
                    if (m5694R()) {
                        return;
                    } else {
                        i10 = this.f4811c;
                    }
                } while (m5703c0() == this.f4814f);
                this.f4811c = i10;
                return;
            }
            C1171i0 c1171i0 = (C1171i0) list;
            int m6427b2 = C1205t1.m6427b(this.f4814f);
            if (m6427b2 != 1) {
                if (m6427b2 != 2) {
                    throw C1150b0.m5667d();
                }
                int m5703c02 = m5703c0();
                m5713n0(m5703c02);
                int i13 = this.f4811c + m5703c02;
                while (this.f4811c < i13) {
                    c1171i0.m5910k(m5701Y());
                }
                return;
            }
            do {
                c1171i0.m5910k(mo5738f());
                if (m5694R()) {
                    return;
                } else {
                    i11 = this.f4811c;
                }
            } while (m5703c0() == this.f4814f);
            this.f4811c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: w */
        public void mo5755w(List<Integer> list) {
            int i10;
            int m5703c0;
            int i11;
            if (!(list instanceof C1217z)) {
                int m6427b = C1205t1.m6427b(this.f4814f);
                if (m6427b != 0) {
                    if (m6427b != 2) {
                        throw C1150b0.m5667d();
                    }
                    m5703c0 = this.f4811c + m5703c0();
                    while (this.f4811c < m5703c0) {
                        list.add(Integer.valueOf(m5703c0()));
                    }
                }
                do {
                    list.add(Integer.valueOf(mo5748p()));
                    if (m5694R()) {
                        return;
                    } else {
                        i10 = this.f4811c;
                    }
                } while (m5703c0() == this.f4814f);
                this.f4811c = i10;
                return;
            }
            C1217z c1217z = (C1217z) list;
            int m6427b2 = C1205t1.m6427b(this.f4814f);
            if (m6427b2 != 0) {
                if (m6427b2 != 2) {
                    throw C1150b0.m5667d();
                }
                m5703c0 = this.f4811c + m5703c0();
                while (this.f4811c < m5703c0) {
                    c1217z.m6584F0(m5703c0());
                }
            }
            do {
                c1217z.m6584F0(mo5748p());
                if (m5694R()) {
                    return;
                } else {
                    i11 = this.f4811c;
                }
            } while (m5703c0() == this.f4814f);
            this.f4811c = i11;
            return;
            m5706g0(m5703c0);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: x */
        public void mo5756x(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof C1217z)) {
                int m6427b = C1205t1.m6427b(this.f4814f);
                if (m6427b == 2) {
                    int m5703c0 = m5703c0();
                    m5712m0(m5703c0);
                    int i12 = this.f4811c + m5703c0;
                    while (this.f4811c < i12) {
                        list.add(Integer.valueOf(m5699W()));
                    }
                    return;
                }
                if (m6427b != 5) {
                    throw C1150b0.m5667d();
                }
                do {
                    list.add(Integer.valueOf(mo5753u()));
                    if (m5694R()) {
                        return;
                    } else {
                        i10 = this.f4811c;
                    }
                } while (m5703c0() == this.f4814f);
                this.f4811c = i10;
                return;
            }
            C1217z c1217z = (C1217z) list;
            int m6427b2 = C1205t1.m6427b(this.f4814f);
            if (m6427b2 == 2) {
                int m5703c02 = m5703c0();
                m5712m0(m5703c02);
                int i13 = this.f4811c + m5703c02;
                while (this.f4811c < i13) {
                    c1217z.m6584F0(m5699W());
                }
                return;
            }
            if (m6427b2 != 5) {
                throw C1150b0.m5667d();
            }
            do {
                c1217z.m6584F0(mo5753u());
                if (m5694R()) {
                    return;
                } else {
                    i11 = this.f4811c;
                }
            } while (m5703c0() == this.f4814f);
            this.f4811c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: y */
        public long mo5757y() {
            m5707h0(0);
            return AbstractC1170i.m5843c(m5736d0());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
        /* renamed from: z */
        public String mo5758z() {
            return m5731a0(false);
        }
    }

    private AbstractC1158e() {
    }

    /* synthetic */ AbstractC1158e(a aVar) {
        this();
    }

    /* renamed from: Q */
    public static AbstractC1158e m5693Q(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z10);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
