package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1147a0;
import androidx.datastore.preferences.protobuf.C1206u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.i1 */
/* loaded from: classes.dex */
final class C1172i1 {

    /* renamed from: a */
    private static final Class<?> f4871a = m5918B();

    /* renamed from: b */
    private static final AbstractC1187n1<?, ?> f4872b = m5919C(false);

    /* renamed from: c */
    private static final AbstractC1187n1<?, ?> f4873c = m5919C(true);

    /* renamed from: d */
    private static final AbstractC1187n1<?, ?> f4874d = new C1193p1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static <UT, UB> UB m5917A(int i10, List<Integer> list, C1147a0.e eVar, UB ub2, AbstractC1187n1<UT, UB> abstractC1187n1) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (eVar.m5655a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) m5928L(i10, intValue, ub2, abstractC1187n1);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.m5655a(intValue2)) {
                    ub2 = (UB) m5928L(i10, intValue2, ub2, abstractC1187n1);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    /* renamed from: B */
    private static Class<?> m5918B() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    private static AbstractC1187n1<?, ?> m5919C(boolean z10) {
        try {
            Class<?> m5920D = m5920D();
            if (m5920D == null) {
                return null;
            }
            return (AbstractC1187n1) m5920D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    private static Class<?> m5920D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static <T, FT extends C1206u.b<FT>> void m5921E(AbstractC1194q<FT> abstractC1194q, T t10, T t11) {
        C1206u<FT> mo6293c = abstractC1194q.mo6293c(t11);
        if (mo6293c.m6451n()) {
            return;
        }
        abstractC1194q.mo6294d(t10).m6456u(mo6293c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static <T> void m5922F(InterfaceC1183m0 interfaceC1183m0, T t10, T t11, long j10) {
        C1199r1.m6328O(t10, j10, interfaceC1183m0.mo6218a(C1199r1.m6314A(t10, j10), C1199r1.m6314A(t11, j10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static <T, UT, UB> void m5923G(AbstractC1187n1<UT, UB> abstractC1187n1, T t10, T t11) {
        abstractC1187n1.mo6244p(t10, abstractC1187n1.mo6239k(abstractC1187n1.mo6235g(t10), abstractC1187n1.mo6235g(t11)));
    }

    /* renamed from: H */
    public static AbstractC1187n1<?, ?> m5924H() {
        return f4872b;
    }

    /* renamed from: I */
    public static AbstractC1187n1<?, ?> m5925I() {
        return f4873c;
    }

    /* renamed from: J */
    public static void m5926J(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC1215y.class.isAssignableFrom(cls) && (cls2 = f4871a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static boolean m5927K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static <UT, UB> UB m5928L(int i10, int i11, UB ub2, AbstractC1187n1<UT, UB> abstractC1187n1) {
        if (ub2 == null) {
            ub2 = abstractC1187n1.mo6242n();
        }
        abstractC1187n1.mo6233e(ub2, i10, i11);
        return ub2;
    }

    /* renamed from: M */
    public static AbstractC1187n1<?, ?> m5929M() {
        return f4874d;
    }

    /* renamed from: N */
    public static void m5930N(int i10, List<Boolean> list, InterfaceC1208u1 interfaceC1208u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6150A(i10, list, z10);
    }

    /* renamed from: O */
    public static void m5931O(int i10, List<AbstractC1167h> list, InterfaceC1208u1 interfaceC1208u1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6158I(i10, list);
    }

    /* renamed from: P */
    public static void m5932P(int i10, List<Double> list, InterfaceC1208u1 interfaceC1208u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6156G(i10, list, z10);
    }

    /* renamed from: Q */
    public static void m5933Q(int i10, List<Integer> list, InterfaceC1208u1 interfaceC1208u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6178n(i10, list, z10);
    }

    /* renamed from: R */
    public static void m5934R(int i10, List<Integer> list, InterfaceC1208u1 interfaceC1208u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6174j(i10, list, z10);
    }

    /* renamed from: S */
    public static void m5935S(int i10, List<Long> list, InterfaceC1208u1 interfaceC1208u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6189y(i10, list, z10);
    }

    /* renamed from: T */
    public static void m5936T(int i10, List<Float> list, InterfaceC1208u1 interfaceC1208u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6165a(i10, list, z10);
    }

    /* renamed from: U */
    public static void m5937U(int i10, List<?> list, InterfaceC1208u1 interfaceC1208u1, InterfaceC1166g1 interfaceC1166g1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6159J(i10, list, interfaceC1166g1);
    }

    /* renamed from: V */
    public static void m5938V(int i10, List<Integer> list, InterfaceC1208u1 interfaceC1208u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6171g(i10, list, z10);
    }

    /* renamed from: W */
    public static void m5939W(int i10, List<Long> list, InterfaceC1208u1 interfaceC1208u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6155F(i10, list, z10);
    }

    /* renamed from: X */
    public static void m5940X(int i10, List<?> list, InterfaceC1208u1 interfaceC1208u1, InterfaceC1166g1 interfaceC1166g1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6164O(i10, list, interfaceC1166g1);
    }

    /* renamed from: Y */
    public static void m5941Y(int i10, List<Integer> list, InterfaceC1208u1 interfaceC1208u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6190z(i10, list, z10);
    }

    /* renamed from: Z */
    public static void m5942Z(int i10, List<Long> list, InterfaceC1208u1 interfaceC1208u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6181q(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m5943a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC1176k.m6039V(i10) + AbstractC1176k.m6020C(size) : size * AbstractC1176k.m6047d(i10, true);
    }

    /* renamed from: a0 */
    public static void m5944a0(int i10, List<Integer> list, InterfaceC1208u1 interfaceC1208u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6153D(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m5945b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m5946b0(int i10, List<Long> list, InterfaceC1208u1 interfaceC1208u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6176l(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m5947c(int i10, List<AbstractC1167h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m6039V = size * AbstractC1176k.m6039V(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            m6039V += AbstractC1176k.m6053h(list.get(i11));
        }
        return m6039V;
    }

    /* renamed from: c0 */
    public static void m5948c0(int i10, List<String> list, InterfaceC1208u1 interfaceC1208u1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6168d(i10, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m5949d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m5951e = m5951e(list);
        int m6039V = AbstractC1176k.m6039V(i10);
        return z10 ? m6039V + AbstractC1176k.m6020C(m5951e) : m5951e + (size * m6039V);
    }

    /* renamed from: d0 */
    public static void m5950d0(int i10, List<Integer> list, InterfaceC1208u1 interfaceC1208u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6175k(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m5951e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1217z) {
            C1217z c1217z = (C1217z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1176k.m6058l(c1217z.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1176k.m6058l(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: e0 */
    public static void m5952e0(int i10, List<Long> list, InterfaceC1208u1 interfaceC1208u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC1208u1.mo6182r(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m5953f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC1176k.m6039V(i10) + AbstractC1176k.m6020C(size * 4) : size * AbstractC1176k.m6059m(i10, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m5954g(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m5955h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC1176k.m6039V(i10) + AbstractC1176k.m6020C(size * 8) : size * AbstractC1176k.m6061o(i10, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m5956i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m5957j(int i10, List<InterfaceC1198r0> list, InterfaceC1166g1 interfaceC1166g1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC1176k.m6065s(i10, list.get(i12), interfaceC1166g1);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m5958k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m5959l = m5959l(list);
        int m6039V = AbstractC1176k.m6039V(i10);
        return z10 ? m6039V + AbstractC1176k.m6020C(m5959l) : m5959l + (size * m6039V);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m5959l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1217z) {
            C1217z c1217z = (C1217z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1176k.m6069w(c1217z.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1176k.m6069w(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m5960m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int m5961n = m5961n(list);
        return z10 ? AbstractC1176k.m6039V(i10) + AbstractC1176k.m6020C(m5961n) : m5961n + (list.size() * AbstractC1176k.m6039V(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static int m5961n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1171i0) {
            C1171i0 c1171i0 = (C1171i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1176k.m6071y(c1171i0.m5912n(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1176k.m6071y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static int m5962o(int i10, Object obj, InterfaceC1166g1 interfaceC1166g1) {
        return obj instanceof C1159e0 ? AbstractC1176k.m6018A(i10, (C1159e0) obj) : AbstractC1176k.m6023F(i10, (InterfaceC1198r0) obj, interfaceC1166g1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static int m5963p(int i10, List<?> list, InterfaceC1166g1 interfaceC1166g1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m6039V = AbstractC1176k.m6039V(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            m6039V += obj instanceof C1159e0 ? AbstractC1176k.m6019B((C1159e0) obj) : AbstractC1176k.m6025H((InterfaceC1198r0) obj, interfaceC1166g1);
        }
        return m6039V;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static int m5964q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m5965r = m5965r(list);
        int m6039V = AbstractC1176k.m6039V(i10);
        return z10 ? m6039V + AbstractC1176k.m6020C(m5965r) : m5965r + (size * m6039V);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static int m5965r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1217z) {
            C1217z c1217z = (C1217z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1176k.m6034Q(c1217z.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1176k.m6034Q(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static int m5966s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m5967t = m5967t(list);
        int m6039V = AbstractC1176k.m6039V(i10);
        return z10 ? m6039V + AbstractC1176k.m6020C(m5967t) : m5967t + (size * m6039V);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static int m5967t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1171i0) {
            C1171i0 c1171i0 = (C1171i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1176k.m6036S(c1171i0.m5912n(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1176k.m6036S(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static int m5968u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int m6039V = AbstractC1176k.m6039V(i10) * size;
        if (list instanceof InterfaceC1165g0) {
            InterfaceC1165g0 interfaceC1165g0 = (InterfaceC1165g0) list;
            while (i11 < size) {
                Object mo5787j = interfaceC1165g0.mo5787j(i11);
                m6039V += mo5787j instanceof AbstractC1167h ? AbstractC1176k.m6053h((AbstractC1167h) mo5787j) : AbstractC1176k.m6038U((String) mo5787j);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                m6039V += obj instanceof AbstractC1167h ? AbstractC1176k.m6053h((AbstractC1167h) obj) : AbstractC1176k.m6038U((String) obj);
                i11++;
            }
        }
        return m6039V;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static int m5969v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m5970w = m5970w(list);
        int m6039V = AbstractC1176k.m6039V(i10);
        return z10 ? m6039V + AbstractC1176k.m6020C(m5970w) : m5970w + (size * m6039V);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static int m5970w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1217z) {
            C1217z c1217z = (C1217z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1176k.m6041X(c1217z.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1176k.m6041X(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static int m5971x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m5972y = m5972y(list);
        int m6039V = AbstractC1176k.m6039V(i10);
        return z10 ? m6039V + AbstractC1176k.m6020C(m5972y) : m5972y + (size * m6039V);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static int m5972y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1171i0) {
            C1171i0 c1171i0 = (C1171i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1176k.m6043Z(c1171i0.m5912n(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1176k.m6043Z(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static <UT, UB> UB m5973z(int i10, List<Integer> list, C1147a0.d<?> dVar, UB ub2, AbstractC1187n1<UT, UB> abstractC1187n1) {
        if (dVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (dVar.m5654a(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) m5928L(i10, intValue, ub2, abstractC1187n1);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.m5654a(intValue2) == null) {
                    ub2 = (UB) m5928L(i10, intValue2, ub2, abstractC1187n1);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
