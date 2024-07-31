package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1167h;
import androidx.datastore.preferences.protobuf.C1147a0;
import androidx.datastore.preferences.protobuf.C1177k0;
import androidx.datastore.preferences.protobuf.C1205t1;
import androidx.datastore.preferences.protobuf.InterfaceC1208u1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: androidx.datastore.preferences.protobuf.u0 */
/* loaded from: classes.dex */
final class C1207u0<T> implements InterfaceC1166g1<T> {

    /* renamed from: r */
    private static final int[] f4999r = new int[0];

    /* renamed from: s */
    private static final Unsafe f5000s = C1199r1.m6315B();

    /* renamed from: a */
    private final int[] f5001a;

    /* renamed from: b */
    private final Object[] f5002b;

    /* renamed from: c */
    private final int f5003c;

    /* renamed from: d */
    private final int f5004d;

    /* renamed from: e */
    private final InterfaceC1198r0 f5005e;

    /* renamed from: f */
    private final boolean f5006f;

    /* renamed from: g */
    private final boolean f5007g;

    /* renamed from: h */
    private final boolean f5008h;

    /* renamed from: i */
    private final boolean f5009i;

    /* renamed from: j */
    private final int[] f5010j;

    /* renamed from: k */
    private final int f5011k;

    /* renamed from: l */
    private final int f5012l;

    /* renamed from: m */
    private final InterfaceC1212w0 f5013m;

    /* renamed from: n */
    private final AbstractC1168h0 f5014n;

    /* renamed from: o */
    private final AbstractC1187n1<?, ?> f5015o;

    /* renamed from: p */
    private final AbstractC1194q<?> f5016p;

    /* renamed from: q */
    private final InterfaceC1183m0 f5017q;

    private C1207u0(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC1198r0 interfaceC1198r0, boolean z10, boolean z11, int[] iArr2, int i12, int i13, InterfaceC1212w0 interfaceC1212w0, AbstractC1168h0 abstractC1168h0, AbstractC1187n1<?, ?> abstractC1187n1, AbstractC1194q<?> abstractC1194q, InterfaceC1183m0 interfaceC1183m0) {
        this.f5001a = iArr;
        this.f5002b = objArr;
        this.f5003c = i10;
        this.f5004d = i11;
        this.f5007g = interfaceC1198r0 instanceof AbstractC1215y;
        this.f5008h = z10;
        this.f5006f = abstractC1194q != null && abstractC1194q.mo6295e(interfaceC1198r0);
        this.f5009i = z11;
        this.f5010j = iArr2;
        this.f5011k = i12;
        this.f5012l = i13;
        this.f5013m = interfaceC1212w0;
        this.f5014n = abstractC1168h0;
        this.f5015o = abstractC1187n1;
        this.f5016p = abstractC1194q;
        this.f5005e = interfaceC1198r0;
        this.f5017q = interfaceC1183m0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    private static boolean m6464A(Object obj, int i10, InterfaceC1166g1 interfaceC1166g1) {
        return interfaceC1166g1.mo5794c(C1199r1.m6314A(obj, m6481R(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    private <N> boolean m6465B(Object obj, int i10, int i11) {
        List list = (List) C1199r1.m6314A(obj, m6481R(i10));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC1166g1 m6514s = m6514s(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!m6514s.mo5794c(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.g1] */
    /* renamed from: C */
    private boolean m6466C(T t10, int i10, int i11) {
        Map<?, ?> mo6222e = this.f5017q.mo6222e(C1199r1.m6314A(t10, m6481R(i10)));
        if (mo6222e.isEmpty()) {
            return true;
        }
        if (this.f5017q.mo6219b(m6513r(i11)).f4922c.m6429b() != C1205t1.c.MESSAGE) {
            return true;
        }
        ?? r52 = 0;
        for (Object obj : mo6222e.values()) {
            r52 = r52;
            if (r52 == 0) {
                r52 = C1154c1.m5677a().m5680d(obj.getClass());
            }
            if (!r52.mo5794c(obj)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    private boolean m6467D(T t10, T t11, int i10) {
        long m6488Y = m6488Y(i10) & 1048575;
        return C1199r1.m6354x(t10, m6488Y) == C1199r1.m6354x(t11, m6488Y);
    }

    /* renamed from: E */
    private boolean m6468E(T t10, int i10, int i11) {
        return C1199r1.m6354x(t10, (long) (m6488Y(i11) & 1048575)) == i10;
    }

    /* renamed from: F */
    private static boolean m6469F(int i10) {
        return (i10 & 268435456) != 0;
    }

    /* renamed from: G */
    private static List<?> m6470G(Object obj, long j10) {
        return (List) C1199r1.m6314A(obj, j10);
    }

    /* renamed from: H */
    private static <T> long m6471H(T t10, long j10) {
        return C1199r1.m6355y(t10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0077, code lost:
    
        r0 = r16.f5011k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x007b, code lost:
    
        if (r0 >= r16.f5012l) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x007d, code lost:
    
        r13 = m6507n(r19, r16.f5010j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0088, code lost:
    
        if (r13 == null) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x008a, code lost:
    
        r17.mo6243o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x008d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:?, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0098. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.C1206u.b<ET>> void m6472I(androidx.datastore.preferences.protobuf.AbstractC1187n1<UT, UB> r17, androidx.datastore.preferences.protobuf.AbstractC1194q<ET> r18, T r19, androidx.datastore.preferences.protobuf.InterfaceC1163f1 r20, androidx.datastore.preferences.protobuf.C1191p r21) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1207u0.m6472I(androidx.datastore.preferences.protobuf.n1, androidx.datastore.preferences.protobuf.q, java.lang.Object, androidx.datastore.preferences.protobuf.f1, androidx.datastore.preferences.protobuf.p):void");
    }

    /* renamed from: J */
    private final <K, V> void m6473J(Object obj, int i10, Object obj2, C1191p c1191p, InterfaceC1163f1 interfaceC1163f1) {
        long m6481R = m6481R(m6498i0(i10));
        Object m6314A = C1199r1.m6314A(obj, m6481R);
        if (m6314A == null) {
            m6314A = this.f5017q.mo6221d(obj2);
            C1199r1.m6328O(obj, m6481R, m6314A);
        } else if (this.f5017q.mo6225h(m6314A)) {
            Object mo6221d = this.f5017q.mo6221d(obj2);
            this.f5017q.mo6218a(mo6221d, m6314A);
            C1199r1.m6328O(obj, m6481R, mo6221d);
            m6314A = mo6221d;
        }
        interfaceC1163f1.mo5728O(this.f5017q.mo6220c(m6314A), this.f5017q.mo6219b(obj2), c1191p);
    }

    /* renamed from: K */
    private void m6474K(T t10, T t11, int i10) {
        long m6481R = m6481R(m6498i0(i10));
        if (m6520y(t11, i10)) {
            Object m6314A = C1199r1.m6314A(t10, m6481R);
            Object m6314A2 = C1199r1.m6314A(t11, m6481R);
            if (m6314A != null && m6314A2 != null) {
                m6314A2 = C1147a0.m5650h(m6314A, m6314A2);
            } else if (m6314A2 == null) {
                return;
            }
            C1199r1.m6328O(t10, m6481R, m6314A2);
            m6494e0(t10, i10);
        }
    }

    /* renamed from: L */
    private void m6475L(T t10, T t11, int i10) {
        int m6498i0 = m6498i0(i10);
        int m6480Q = m6480Q(i10);
        long m6481R = m6481R(m6498i0);
        if (m6468E(t11, m6480Q, i10)) {
            Object m6314A = C1199r1.m6314A(t10, m6481R);
            Object m6314A2 = C1199r1.m6314A(t11, m6481R);
            if (m6314A != null && m6314A2 != null) {
                m6314A2 = C1147a0.m5650h(m6314A, m6314A2);
            } else if (m6314A2 == null) {
                return;
            }
            C1199r1.m6328O(t10, m6481R, m6314A2);
            m6495f0(t10, m6480Q, i10);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* renamed from: M */
    private void m6476M(T t10, T t11, int i10) {
        int m6498i0 = m6498i0(i10);
        long m6481R = m6481R(m6498i0);
        int m6480Q = m6480Q(i10);
        switch (m6497h0(m6498i0)) {
            case 0:
                if (m6520y(t11, i10)) {
                    C1199r1.m6324K(t10, m6481R, C1199r1.m6352v(t11, m6481R));
                    m6494e0(t10, i10);
                    return;
                }
                return;
            case 1:
                if (m6520y(t11, i10)) {
                    C1199r1.m6325L(t10, m6481R, C1199r1.m6353w(t11, m6481R));
                    m6494e0(t10, i10);
                    return;
                }
                return;
            case 2:
                if (!m6520y(t11, i10)) {
                    return;
                }
                C1199r1.m6327N(t10, m6481R, C1199r1.m6355y(t11, m6481R));
                m6494e0(t10, i10);
                return;
            case 3:
                if (!m6520y(t11, i10)) {
                    return;
                }
                C1199r1.m6327N(t10, m6481R, C1199r1.m6355y(t11, m6481R));
                m6494e0(t10, i10);
                return;
            case 4:
                if (!m6520y(t11, i10)) {
                    return;
                }
                C1199r1.m6326M(t10, m6481R, C1199r1.m6354x(t11, m6481R));
                m6494e0(t10, i10);
                return;
            case 5:
                if (!m6520y(t11, i10)) {
                    return;
                }
                C1199r1.m6327N(t10, m6481R, C1199r1.m6355y(t11, m6481R));
                m6494e0(t10, i10);
                return;
            case 6:
                if (!m6520y(t11, i10)) {
                    return;
                }
                C1199r1.m6326M(t10, m6481R, C1199r1.m6354x(t11, m6481R));
                m6494e0(t10, i10);
                return;
            case 7:
                if (m6520y(t11, i10)) {
                    C1199r1.m6318E(t10, m6481R, C1199r1.m6346p(t11, m6481R));
                    m6494e0(t10, i10);
                    return;
                }
                return;
            case 8:
                if (!m6520y(t11, i10)) {
                    return;
                }
                C1199r1.m6328O(t10, m6481R, C1199r1.m6314A(t11, m6481R));
                m6494e0(t10, i10);
                return;
            case 9:
            case 17:
                m6474K(t10, t11, i10);
                return;
            case 10:
                if (!m6520y(t11, i10)) {
                    return;
                }
                C1199r1.m6328O(t10, m6481R, C1199r1.m6314A(t11, m6481R));
                m6494e0(t10, i10);
                return;
            case 11:
                if (!m6520y(t11, i10)) {
                    return;
                }
                C1199r1.m6326M(t10, m6481R, C1199r1.m6354x(t11, m6481R));
                m6494e0(t10, i10);
                return;
            case 12:
                if (!m6520y(t11, i10)) {
                    return;
                }
                C1199r1.m6326M(t10, m6481R, C1199r1.m6354x(t11, m6481R));
                m6494e0(t10, i10);
                return;
            case 13:
                if (!m6520y(t11, i10)) {
                    return;
                }
                C1199r1.m6326M(t10, m6481R, C1199r1.m6354x(t11, m6481R));
                m6494e0(t10, i10);
                return;
            case 14:
                if (!m6520y(t11, i10)) {
                    return;
                }
                C1199r1.m6327N(t10, m6481R, C1199r1.m6355y(t11, m6481R));
                m6494e0(t10, i10);
                return;
            case 15:
                if (!m6520y(t11, i10)) {
                    return;
                }
                C1199r1.m6326M(t10, m6481R, C1199r1.m6354x(t11, m6481R));
                m6494e0(t10, i10);
                return;
            case 16:
                if (!m6520y(t11, i10)) {
                    return;
                }
                C1199r1.m6327N(t10, m6481R, C1199r1.m6355y(t11, m6481R));
                m6494e0(t10, i10);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f5014n.mo5836d(t10, t11, m6481R);
                return;
            case 50:
                C1172i1.m5922F(this.f5017q, t10, t11, m6481R);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (!m6468E(t11, m6480Q, i10)) {
                    return;
                }
                C1199r1.m6328O(t10, m6481R, C1199r1.m6314A(t11, m6481R));
                m6495f0(t10, m6480Q, i10);
                return;
            case 60:
            case 68:
                m6475L(t10, t11, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!m6468E(t11, m6480Q, i10)) {
                    return;
                }
                C1199r1.m6328O(t10, m6481R, C1199r1.m6314A(t11, m6481R));
                m6495f0(t10, m6480Q, i10);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static <T> C1207u0<T> m6477N(Class<T> cls, InterfaceC1192p0 interfaceC1192p0, InterfaceC1212w0 interfaceC1212w0, AbstractC1168h0 abstractC1168h0, AbstractC1187n1<?, ?> abstractC1187n1, AbstractC1194q<?> abstractC1194q, InterfaceC1183m0 interfaceC1183m0) {
        return interfaceC1192p0 instanceof C1160e1 ? m6479P((C1160e1) interfaceC1192p0, interfaceC1212w0, abstractC1168h0, abstractC1187n1, abstractC1194q, interfaceC1183m0) : m6478O((C1178k1) interfaceC1192p0, interfaceC1212w0, abstractC1168h0, abstractC1187n1, abstractC1194q, interfaceC1183m0);
    }

    /* renamed from: O */
    static <T> C1207u0<T> m6478O(C1178k1 c1178k1, InterfaceC1212w0 interfaceC1212w0, AbstractC1168h0 abstractC1168h0, AbstractC1187n1<?, ?> abstractC1187n1, AbstractC1194q<?> abstractC1194q, InterfaceC1183m0 interfaceC1183m0) {
        boolean z10 = c1178k1.mo5766c() == EnumC1151b1.PROTO3;
        C1203t[] m6142e = c1178k1.m6142e();
        if (m6142e.length != 0) {
            C1203t c1203t = m6142e[0];
            throw null;
        }
        int length = m6142e.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (m6142e.length > 0) {
            C1203t c1203t2 = m6142e[0];
            throw null;
        }
        int[] m6141d = c1178k1.m6141d();
        if (m6141d == null) {
            m6141d = f4999r;
        }
        if (m6142e.length > 0) {
            C1203t c1203t3 = m6142e[0];
            throw null;
        }
        int[] iArr2 = f4999r;
        int[] iArr3 = f4999r;
        int[] iArr4 = new int[m6141d.length + iArr2.length + iArr3.length];
        System.arraycopy(m6141d, 0, iArr4, 0, m6141d.length);
        System.arraycopy(iArr2, 0, iArr4, m6141d.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, m6141d.length + iArr2.length, iArr3.length);
        return new C1207u0<>(iArr, objArr, 0, 0, c1178k1.mo5765b(), z10, true, iArr4, m6141d.length, m6141d.length + iArr2.length, interfaceC1212w0, abstractC1168h0, abstractC1187n1, abstractC1194q, interfaceC1183m0);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027a  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> androidx.datastore.preferences.protobuf.C1207u0<T> m6479P(androidx.datastore.preferences.protobuf.C1160e1 r36, androidx.datastore.preferences.protobuf.InterfaceC1212w0 r37, androidx.datastore.preferences.protobuf.AbstractC1168h0 r38, androidx.datastore.preferences.protobuf.AbstractC1187n1<?, ?> r39, androidx.datastore.preferences.protobuf.AbstractC1194q<?> r40, androidx.datastore.preferences.protobuf.InterfaceC1183m0 r41) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1207u0.m6479P(androidx.datastore.preferences.protobuf.e1, androidx.datastore.preferences.protobuf.w0, androidx.datastore.preferences.protobuf.h0, androidx.datastore.preferences.protobuf.n1, androidx.datastore.preferences.protobuf.q, androidx.datastore.preferences.protobuf.m0):androidx.datastore.preferences.protobuf.u0");
    }

    /* renamed from: Q */
    private int m6480Q(int i10) {
        return this.f5001a[i10];
    }

    /* renamed from: R */
    private static long m6481R(int i10) {
        return i10 & 1048575;
    }

    /* renamed from: S */
    private static <T> boolean m6482S(T t10, long j10) {
        return ((Boolean) C1199r1.m6314A(t10, j10)).booleanValue();
    }

    /* renamed from: T */
    private static <T> double m6483T(T t10, long j10) {
        return ((Double) C1199r1.m6314A(t10, j10)).doubleValue();
    }

    /* renamed from: U */
    private static <T> float m6484U(T t10, long j10) {
        return ((Float) C1199r1.m6314A(t10, j10)).floatValue();
    }

    /* renamed from: V */
    private static <T> int m6485V(T t10, long j10) {
        return ((Integer) C1199r1.m6314A(t10, j10)).intValue();
    }

    /* renamed from: W */
    private static <T> long m6486W(T t10, long j10) {
        return ((Long) C1199r1.m6314A(t10, j10)).longValue();
    }

    /* renamed from: X */
    private int m6487X(int i10) {
        if (i10 < this.f5003c || i10 > this.f5004d) {
            return -1;
        }
        return m6496g0(i10, 0);
    }

    /* renamed from: Y */
    private int m6488Y(int i10) {
        return this.f5001a[i10 + 2];
    }

    /* renamed from: Z */
    private <E> void m6489Z(Object obj, long j10, InterfaceC1163f1 interfaceC1163f1, InterfaceC1166g1<E> interfaceC1166g1, C1191p c1191p) {
        interfaceC1163f1.mo5729P(this.f5014n.mo5837e(obj, j10), interfaceC1166g1, c1191p);
    }

    /* renamed from: a0 */
    private <E> void m6490a0(Object obj, int i10, InterfaceC1163f1 interfaceC1163f1, InterfaceC1166g1<E> interfaceC1166g1, C1191p c1191p) {
        interfaceC1163f1.mo5724K(this.f5014n.mo5837e(obj, m6481R(i10)), interfaceC1166g1, c1191p);
    }

    /* renamed from: b0 */
    private void m6491b0(Object obj, int i10, InterfaceC1163f1 interfaceC1163f1) {
        long m6481R;
        Object mo5747o;
        if (m6519x(i10)) {
            m6481R = m6481R(i10);
            mo5747o = interfaceC1163f1.mo5722I();
        } else if (this.f5007g) {
            m6481R = m6481R(i10);
            mo5747o = interfaceC1163f1.mo5758z();
        } else {
            m6481R = m6481R(i10);
            mo5747o = interfaceC1163f1.mo5747o();
        }
        C1199r1.m6328O(obj, m6481R, mo5747o);
    }

    /* renamed from: c0 */
    private void m6492c0(Object obj, int i10, InterfaceC1163f1 interfaceC1163f1) {
        if (m6519x(i10)) {
            interfaceC1163f1.mo5746n(this.f5014n.mo5837e(obj, m6481R(i10)));
        } else {
            interfaceC1163f1.mo5715B(this.f5014n.mo5837e(obj, m6481R(i10)));
        }
    }

    /* renamed from: d0 */
    private static Field m6493d0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: e0 */
    private void m6494e0(T t10, int i10) {
        if (this.f5008h) {
            return;
        }
        int m6488Y = m6488Y(i10);
        long j10 = m6488Y & 1048575;
        C1199r1.m6326M(t10, j10, C1199r1.m6354x(t10, j10) | (1 << (m6488Y >>> 20)));
    }

    /* renamed from: f0 */
    private void m6495f0(T t10, int i10, int i11) {
        C1199r1.m6326M(t10, m6488Y(i11) & 1048575, i10);
    }

    /* renamed from: g0 */
    private int m6496g0(int i10, int i11) {
        int length = (this.f5001a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int m6480Q = m6480Q(i13);
            if (i10 == m6480Q) {
                return i13;
            }
            if (i10 < m6480Q) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* renamed from: h0 */
    private static int m6497h0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* renamed from: i0 */
    private int m6498i0(int i10) {
        return this.f5001a[i10 + 1];
    }

    /* renamed from: j */
    private boolean m6499j(T t10, T t11, int i10) {
        return m6520y(t10, i10) == m6520y(t11, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m6500j0(T r18, androidx.datastore.preferences.protobuf.InterfaceC1208u1 r19) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1207u0.m6500j0(java.lang.Object, androidx.datastore.preferences.protobuf.u1):void");
    }

    /* renamed from: k */
    private static <T> boolean m6501k(T t10, long j10) {
        return C1199r1.m6346p(t10, j10);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0050. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m6502k0(T r13, androidx.datastore.preferences.protobuf.InterfaceC1208u1 r14) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1207u0.m6502k0(java.lang.Object, androidx.datastore.preferences.protobuf.u1):void");
    }

    /* renamed from: l */
    private static <T> double m6503l(T t10, long j10) {
        return C1199r1.m6352v(t10, j10);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0056. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:267:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m6504l0(T r11, androidx.datastore.preferences.protobuf.InterfaceC1208u1 r12) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1207u0.m6504l0(java.lang.Object, androidx.datastore.preferences.protobuf.u1):void");
    }

    /* renamed from: m */
    private boolean m6505m(T t10, T t11, int i10) {
        int m6498i0 = m6498i0(i10);
        long m6481R = m6481R(m6498i0);
        switch (m6497h0(m6498i0)) {
            case 0:
                return m6499j(t10, t11, i10) && Double.doubleToLongBits(C1199r1.m6352v(t10, m6481R)) == Double.doubleToLongBits(C1199r1.m6352v(t11, m6481R));
            case 1:
                return m6499j(t10, t11, i10) && Float.floatToIntBits(C1199r1.m6353w(t10, m6481R)) == Float.floatToIntBits(C1199r1.m6353w(t11, m6481R));
            case 2:
                return m6499j(t10, t11, i10) && C1199r1.m6355y(t10, m6481R) == C1199r1.m6355y(t11, m6481R);
            case 3:
                return m6499j(t10, t11, i10) && C1199r1.m6355y(t10, m6481R) == C1199r1.m6355y(t11, m6481R);
            case 4:
                return m6499j(t10, t11, i10) && C1199r1.m6354x(t10, m6481R) == C1199r1.m6354x(t11, m6481R);
            case 5:
                return m6499j(t10, t11, i10) && C1199r1.m6355y(t10, m6481R) == C1199r1.m6355y(t11, m6481R);
            case 6:
                return m6499j(t10, t11, i10) && C1199r1.m6354x(t10, m6481R) == C1199r1.m6354x(t11, m6481R);
            case 7:
                return m6499j(t10, t11, i10) && C1199r1.m6346p(t10, m6481R) == C1199r1.m6346p(t11, m6481R);
            case 8:
                return m6499j(t10, t11, i10) && C1172i1.m5927K(C1199r1.m6314A(t10, m6481R), C1199r1.m6314A(t11, m6481R));
            case 9:
                return m6499j(t10, t11, i10) && C1172i1.m5927K(C1199r1.m6314A(t10, m6481R), C1199r1.m6314A(t11, m6481R));
            case 10:
                return m6499j(t10, t11, i10) && C1172i1.m5927K(C1199r1.m6314A(t10, m6481R), C1199r1.m6314A(t11, m6481R));
            case 11:
                return m6499j(t10, t11, i10) && C1199r1.m6354x(t10, m6481R) == C1199r1.m6354x(t11, m6481R);
            case 12:
                return m6499j(t10, t11, i10) && C1199r1.m6354x(t10, m6481R) == C1199r1.m6354x(t11, m6481R);
            case 13:
                return m6499j(t10, t11, i10) && C1199r1.m6354x(t10, m6481R) == C1199r1.m6354x(t11, m6481R);
            case 14:
                return m6499j(t10, t11, i10) && C1199r1.m6355y(t10, m6481R) == C1199r1.m6355y(t11, m6481R);
            case 15:
                return m6499j(t10, t11, i10) && C1199r1.m6354x(t10, m6481R) == C1199r1.m6354x(t11, m6481R);
            case 16:
                return m6499j(t10, t11, i10) && C1199r1.m6355y(t10, m6481R) == C1199r1.m6355y(t11, m6481R);
            case 17:
                return m6499j(t10, t11, i10) && C1172i1.m5927K(C1199r1.m6314A(t10, m6481R), C1199r1.m6314A(t11, m6481R));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                return C1172i1.m5927K(C1199r1.m6314A(t10, m6481R), C1199r1.m6314A(t11, m6481R));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return m6467D(t10, t11, i10) && C1172i1.m5927K(C1199r1.m6314A(t10, m6481R), C1199r1.m6314A(t11, m6481R));
            default:
                return true;
        }
    }

    /* renamed from: m0 */
    private <K, V> void m6506m0(InterfaceC1208u1 interfaceC1208u1, int i10, Object obj, int i11) {
        if (obj != null) {
            interfaceC1208u1.mo6162M(i10, this.f5017q.mo6219b(m6513r(i11)), this.f5017q.mo6222e(obj));
        }
    }

    /* renamed from: n */
    private final <UT, UB> UB m6507n(Object obj, int i10, UB ub2, AbstractC1187n1<UT, UB> abstractC1187n1) {
        C1147a0.e m6512q;
        int m6480Q = m6480Q(i10);
        Object m6314A = C1199r1.m6314A(obj, m6481R(m6498i0(i10)));
        return (m6314A == null || (m6512q = m6512q(i10)) == null) ? ub2 : (UB) m6509o(i10, m6480Q, this.f5017q.mo6220c(m6314A), m6512q, ub2, abstractC1187n1);
    }

    /* renamed from: n0 */
    private void m6508n0(int i10, Object obj, InterfaceC1208u1 interfaceC1208u1) {
        if (obj instanceof String) {
            interfaceC1208u1.mo6169e(i10, (String) obj);
        } else {
            interfaceC1208u1.mo6160K(i10, (AbstractC1167h) obj);
        }
    }

    /* renamed from: o */
    private final <K, V, UT, UB> UB m6509o(int i10, int i11, Map<K, V> map, C1147a0.e eVar, UB ub2, AbstractC1187n1<UT, UB> abstractC1187n1) {
        C1177k0.a<?, ?> mo6219b = this.f5017q.mo6219b(m6513r(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.m5655a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = abstractC1187n1.mo6242n();
                }
                AbstractC1167h.h m5809r = AbstractC1167h.m5809r(C1177k0.m6136b(mo6219b, next.getKey(), next.getValue()));
                try {
                    C1177k0.m6138e(m5809r.m5831b(), mo6219b, next.getKey(), next.getValue());
                    abstractC1187n1.mo6232d(ub2, i11, m5809r.m5830a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    /* renamed from: o0 */
    private <UT, UB> void m6510o0(AbstractC1187n1<UT, UB> abstractC1187n1, T t10, InterfaceC1208u1 interfaceC1208u1) {
        abstractC1187n1.mo6248t(abstractC1187n1.mo6235g(t10), interfaceC1208u1);
    }

    /* renamed from: p */
    private static <T> float m6511p(T t10, long j10) {
        return C1199r1.m6353w(t10, j10);
    }

    /* renamed from: q */
    private C1147a0.e m6512q(int i10) {
        return (C1147a0.e) this.f5002b[((i10 / 3) * 2) + 1];
    }

    /* renamed from: r */
    private Object m6513r(int i10) {
        return this.f5002b[(i10 / 3) * 2];
    }

    /* renamed from: s */
    private InterfaceC1166g1 m6514s(int i10) {
        int i11 = (i10 / 3) * 2;
        InterfaceC1166g1 interfaceC1166g1 = (InterfaceC1166g1) this.f5002b[i11];
        if (interfaceC1166g1 != null) {
            return interfaceC1166g1;
        }
        InterfaceC1166g1<T> m5680d = C1154c1.m5677a().m5680d((Class) this.f5002b[i11 + 1]);
        this.f5002b[i11] = m5680d;
        return m5680d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ce, code lost:
    
        if (r17.f5009i != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e0, code lost:
    
        if (r17.f5009i != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f2, code lost:
    
        if (r17.f5009i != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0203, code lost:
    
        if (r17.f5009i != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0214, code lost:
    
        if (r17.f5009i != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0225, code lost:
    
        if (r17.f5009i != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0236, code lost:
    
        if (r17.f5009i != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0247, code lost:
    
        if (r17.f5009i != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0258, code lost:
    
        if (r17.f5009i != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
    
        if (m6468E(r18, r9, r5) != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0322, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC1176k.m6065s(r9, (androidx.datastore.preferences.protobuf.InterfaceC1198r0) r2.getObject(r18, r12), m6514s(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0320, code lost:
    
        if ((r7 & r14) != 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x034d, code lost:
    
        if ((r7 & r14) != 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0356, code lost:
    
        if ((r7 & r14) != 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x037b, code lost:
    
        if ((r7 & r14) != 0) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x038a, code lost:
    
        if ((r7 & r14) != 0) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03b7, code lost:
    
        if ((r7 & r14) != 0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
    
        if (m6468E(r18, r9, r5) != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x034f, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC1176k.m6031N(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        if (m6468E(r18, r9, r5) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0358, code lost:
    
        r4 = androidx.datastore.preferences.protobuf.AbstractC1176k.m6029L(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
    
        if (m6468E(r18, r9, r5) != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x037d, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC1176k.m6051g(r9, (androidx.datastore.preferences.protobuf.AbstractC1167h) r2.getObject(r18, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
    
        if (m6468E(r18, r9, r5) != false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x038c, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.C1172i1.m5962o(r9, r2.getObject(r18, r12), m6514s(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
    
        if (m6468E(r18, r9, r5) != false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x03b9, code lost:
    
        r3 = androidx.datastore.preferences.protobuf.AbstractC1176k.m6047d(r9, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0174, code lost:
    
        if (r17.f5009i != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x025e, code lost:
    
        r4 = (androidx.datastore.preferences.protobuf.AbstractC1176k.m6039V(r9) + androidx.datastore.preferences.protobuf.AbstractC1176k.m6041X(r3)) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x025a, code lost:
    
        r2.putInt(r18, r11, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0186, code lost:
    
        if (r17.f5009i != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0198, code lost:
    
        if (r17.f5009i != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01aa, code lost:
    
        if (r17.f5009i != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bc, code lost:
    
        if (r17.f5009i != false) goto L151;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0060. Please report as an issue. */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m6515t(T r18) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1207u0.m6515t(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x012a, code lost:
    
        if (r15.f5009i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0214, code lost:
    
        r6 = (androidx.datastore.preferences.protobuf.AbstractC1176k.m6039V(r8) + androidx.datastore.preferences.protobuf.AbstractC1176k.m6041X(r7)) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0210, code lost:
    
        r2.putInt(r16, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x013c, code lost:
    
        if (r15.f5009i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x014e, code lost:
    
        if (r15.f5009i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0160, code lost:
    
        if (r15.f5009i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0172, code lost:
    
        if (r15.f5009i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0184, code lost:
    
        if (r15.f5009i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0196, code lost:
    
        if (r15.f5009i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01a8, code lost:
    
        if (r15.f5009i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b9, code lost:
    
        if (r15.f5009i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01ca, code lost:
    
        if (r15.f5009i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01db, code lost:
    
        if (r15.f5009i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ec, code lost:
    
        if (r15.f5009i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01fd, code lost:
    
        if (r15.f5009i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x020e, code lost:
    
        if (r15.f5009i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0334, code lost:
    
        if ((r6 instanceof androidx.datastore.preferences.protobuf.AbstractC1167h) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a6, code lost:
    
        if ((r6 instanceof androidx.datastore.preferences.protobuf.AbstractC1167h) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00aa, code lost:
    
        r6 = androidx.datastore.preferences.protobuf.AbstractC1176k.m6037T(r8, (java.lang.String) r6);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003d. Please report as an issue. */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m6516u(T r16) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1207u0.m6516u(java.lang.Object):int");
    }

    /* renamed from: v */
    private <UT, UB> int m6517v(AbstractC1187n1<UT, UB> abstractC1187n1, T t10) {
        return abstractC1187n1.mo6236h(abstractC1187n1.mo6235g(t10));
    }

    /* renamed from: w */
    private static <T> int m6518w(T t10, long j10) {
        return C1199r1.m6354x(t10, j10);
    }

    /* renamed from: x */
    private static boolean m6519x(int i10) {
        return (i10 & 536870912) != 0;
    }

    /* renamed from: y */
    private boolean m6520y(T t10, int i10) {
        if (!this.f5008h) {
            int m6488Y = m6488Y(i10);
            return (C1199r1.m6354x(t10, (long) (m6488Y & 1048575)) & (1 << (m6488Y >>> 20))) != 0;
        }
        int m6498i0 = m6498i0(i10);
        long m6481R = m6481R(m6498i0);
        switch (m6497h0(m6498i0)) {
            case 0:
                return C1199r1.m6352v(t10, m6481R) != 0.0d;
            case 1:
                return C1199r1.m6353w(t10, m6481R) != 0.0f;
            case 2:
                return C1199r1.m6355y(t10, m6481R) != 0;
            case 3:
                return C1199r1.m6355y(t10, m6481R) != 0;
            case 4:
                return C1199r1.m6354x(t10, m6481R) != 0;
            case 5:
                return C1199r1.m6355y(t10, m6481R) != 0;
            case 6:
                return C1199r1.m6354x(t10, m6481R) != 0;
            case 7:
                return C1199r1.m6346p(t10, m6481R);
            case 8:
                Object m6314A = C1199r1.m6314A(t10, m6481R);
                if (m6314A instanceof String) {
                    return !((String) m6314A).isEmpty();
                }
                if (m6314A instanceof AbstractC1167h) {
                    return !AbstractC1167h.f4831b.equals(m6314A);
                }
                throw new IllegalArgumentException();
            case 9:
                return C1199r1.m6314A(t10, m6481R) != null;
            case 10:
                return !AbstractC1167h.f4831b.equals(C1199r1.m6314A(t10, m6481R));
            case 11:
                return C1199r1.m6354x(t10, m6481R) != 0;
            case 12:
                return C1199r1.m6354x(t10, m6481R) != 0;
            case 13:
                return C1199r1.m6354x(t10, m6481R) != 0;
            case 14:
                return C1199r1.m6355y(t10, m6481R) != 0;
            case 15:
                return C1199r1.m6354x(t10, m6481R) != 0;
            case 16:
                return C1199r1.m6355y(t10, m6481R) != 0;
            case 17:
                return C1199r1.m6314A(t10, m6481R) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: z */
    private boolean m6521z(T t10, int i10, int i11, int i12) {
        return this.f5008h ? m6520y(t10, i10) : (i11 & i12) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: a */
    public void mo5792a(T t10, T t11) {
        t11.getClass();
        for (int i10 = 0; i10 < this.f5001a.length; i10 += 3) {
            m6476M(t10, t11, i10);
        }
        if (this.f5008h) {
            return;
        }
        C1172i1.m5923G(this.f5015o, t10, t11);
        if (this.f5006f) {
            C1172i1.m5921E(this.f5016p, t10, t11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: b */
    public void mo5793b(T t10) {
        int i10;
        int i11 = this.f5011k;
        while (true) {
            i10 = this.f5012l;
            if (i11 >= i10) {
                break;
            }
            long m6481R = m6481R(m6498i0(this.f5010j[i11]));
            Object m6314A = C1199r1.m6314A(t10, m6481R);
            if (m6314A != null) {
                C1199r1.m6328O(t10, m6481R, this.f5017q.mo6223f(m6314A));
            }
            i11++;
        }
        int length = this.f5010j.length;
        while (i10 < length) {
            this.f5014n.mo5835c(t10, this.f5010j[i10]);
            i10++;
        }
        this.f5015o.mo6238j(t10);
        if (this.f5006f) {
            this.f5016p.mo6296f(t10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: c */
    public final boolean mo5794c(T t10) {
        int i10;
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f5011k; i13++) {
            int i14 = this.f5010j[i13];
            int m6480Q = m6480Q(i14);
            int m6498i0 = m6498i0(i14);
            if (this.f5008h) {
                i10 = 0;
            } else {
                int i15 = this.f5001a[i14 + 2];
                int i16 = 1048575 & i15;
                i10 = 1 << (i15 >>> 20);
                if (i16 != i11) {
                    i12 = f5000s.getInt(t10, i16);
                    i11 = i16;
                }
            }
            if (m6469F(m6498i0) && !m6521z(t10, i14, i12, i10)) {
                return false;
            }
            int m6497h0 = m6497h0(m6498i0);
            if (m6497h0 != 9 && m6497h0 != 17) {
                if (m6497h0 != 27) {
                    if (m6497h0 == 60 || m6497h0 == 68) {
                        if (m6468E(t10, m6480Q, i14) && !m6464A(t10, m6498i0, m6514s(i14))) {
                            return false;
                        }
                    } else if (m6497h0 != 49) {
                        if (m6497h0 == 50 && !m6466C(t10, m6498i0, i14)) {
                            return false;
                        }
                    }
                }
                if (!m6465B(t10, m6498i0, i14)) {
                    return false;
                }
            } else if (m6521z(t10, i14, i12, i10) && !m6464A(t10, m6498i0, m6514s(i14))) {
                return false;
            }
        }
        return !this.f5006f || this.f5016p.mo6293c(t10).m6453p();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: d */
    public int mo5795d(T t10) {
        return this.f5008h ? m6516u(t10) : m6515t(t10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: e */
    public T mo5796e() {
        return (T) this.f5013m.mo6540a(this.f5005e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cc, code lost:
    
        if (r3 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e4, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e0, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00de, code lost:
    
        if (r3 != null) goto L68;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo5797f(T r9) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1207u0.mo5797f(java.lang.Object):int");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: g */
    public boolean mo5798g(T t10, T t11) {
        int length = this.f5001a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!m6505m(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f5015o.mo6235g(t10).equals(this.f5015o.mo6235g(t11))) {
            return false;
        }
        if (this.f5006f) {
            return this.f5016p.mo6293c(t10).equals(this.f5016p.mo6293c(t11));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: h */
    public void mo5799h(T t10, InterfaceC1163f1 interfaceC1163f1, C1191p c1191p) {
        c1191p.getClass();
        m6472I(this.f5015o, this.f5016p, t10, interfaceC1163f1, c1191p);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: i */
    public void mo5800i(T t10, InterfaceC1208u1 interfaceC1208u1) {
        if (interfaceC1208u1.mo6184t() == InterfaceC1208u1.a.DESCENDING) {
            m6504l0(t10, interfaceC1208u1);
        } else if (this.f5008h) {
            m6502k0(t10, interfaceC1208u1);
        } else {
            m6500j0(t10, interfaceC1208u1);
        }
    }
}
