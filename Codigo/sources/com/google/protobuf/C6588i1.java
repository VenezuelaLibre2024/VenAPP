package com.google.protobuf;

import com.google.protobuf.C6619t;
import com.google.protobuf.C6633z;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.i1 */
/* loaded from: classes2.dex */
final class C6588i1 {

    /* renamed from: a */
    private static final Class<?> f14505a = m18649B();

    /* renamed from: b */
    private static final AbstractC6603n1<?, ?> f14506b = m18650C(false);

    /* renamed from: c */
    private static final AbstractC6603n1<?, ?> f14507c = m18650C(true);

    /* renamed from: d */
    private static final AbstractC6603n1<?, ?> f14508d = new C6609p1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static <UT, UB> UB m18648A(Object obj, int i10, List<Integer> list, C6633z.e eVar, UB ub2, AbstractC6603n1<UT, UB> abstractC6603n1) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (eVar.mo19359a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) m18659L(obj, i10, intValue, ub2, abstractC6603n1);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.mo19359a(intValue2)) {
                    ub2 = (UB) m18659L(obj, i10, intValue2, ub2, abstractC6603n1);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    /* renamed from: B */
    private static Class<?> m18649B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    private static AbstractC6603n1<?, ?> m18650C(boolean z10) {
        try {
            Class<?> m18651D = m18651D();
            if (m18651D == null) {
                return null;
            }
            return (AbstractC6603n1) m18651D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    private static Class<?> m18651D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static <T, FT extends C6619t.b<FT>> void m18652E(AbstractC6607p<FT> abstractC6607p, T t10, T t11) {
        C6619t<FT> mo18998c = abstractC6607p.mo18998c(t11);
        if (mo18998c.m19169n()) {
            return;
        }
        abstractC6607p.mo18999d(t10).m19174v(mo18998c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static <T> void m18653F(InterfaceC6599m0 interfaceC6599m0, T t10, T t11, long j10) {
        C6615r1.m19056R(t10, j10, interfaceC6599m0.mo18939a(C6615r1.m19041C(t10, j10), C6615r1.m19041C(t11, j10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static <T, UT, UB> void m18654G(AbstractC6603n1<UT, UB> abstractC6603n1, T t10, T t11) {
        abstractC6603n1.mo18968p(t10, abstractC6603n1.mo18963k(abstractC6603n1.mo18959g(t10), abstractC6603n1.mo18959g(t11)));
    }

    /* renamed from: H */
    public static AbstractC6603n1<?, ?> m18655H() {
        return f14506b;
    }

    /* renamed from: I */
    public static AbstractC6603n1<?, ?> m18656I() {
        return f14507c;
    }

    /* renamed from: J */
    public static void m18657J(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC6629x.class.isAssignableFrom(cls) && (cls2 = f14505a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static boolean m18658K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static <UT, UB> UB m18659L(Object obj, int i10, int i11, UB ub2, AbstractC6603n1<UT, UB> abstractC6603n1) {
        if (ub2 == null) {
            ub2 = abstractC6603n1.mo18958f(obj);
        }
        abstractC6603n1.mo18957e(ub2, i10, i11);
        return ub2;
    }

    /* renamed from: M */
    public static AbstractC6603n1<?, ?> m18660M() {
        return f14508d;
    }

    /* renamed from: N */
    public static void m18661N(int i10, List<Boolean> list, InterfaceC6624u1 interfaceC6624u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18864A(i10, list, z10);
    }

    /* renamed from: O */
    public static void m18662O(int i10, List<AbstractC6580g> list, InterfaceC6624u1 interfaceC6624u1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18872I(i10, list);
    }

    /* renamed from: P */
    public static void m18663P(int i10, List<Double> list, InterfaceC6624u1 interfaceC6624u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18870G(i10, list, z10);
    }

    /* renamed from: Q */
    public static void m18664Q(int i10, List<Integer> list, InterfaceC6624u1 interfaceC6624u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18892n(i10, list, z10);
    }

    /* renamed from: R */
    public static void m18665R(int i10, List<Integer> list, InterfaceC6624u1 interfaceC6624u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18888j(i10, list, z10);
    }

    /* renamed from: S */
    public static void m18666S(int i10, List<Long> list, InterfaceC6624u1 interfaceC6624u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18903y(i10, list, z10);
    }

    /* renamed from: T */
    public static void m18667T(int i10, List<Float> list, InterfaceC6624u1 interfaceC6624u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18879a(i10, list, z10);
    }

    /* renamed from: U */
    public static void m18668U(int i10, List<?> list, InterfaceC6624u1 interfaceC6624u1, InterfaceC6582g1 interfaceC6582g1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18876M(i10, list, interfaceC6582g1);
    }

    /* renamed from: V */
    public static void m18669V(int i10, List<Integer> list, InterfaceC6624u1 interfaceC6624u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18885g(i10, list, z10);
    }

    /* renamed from: W */
    public static void m18670W(int i10, List<Long> list, InterfaceC6624u1 interfaceC6624u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18869F(i10, list, z10);
    }

    /* renamed from: X */
    public static void m18671X(int i10, List<?> list, InterfaceC6624u1 interfaceC6624u1, InterfaceC6582g1 interfaceC6582g1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18873J(i10, list, interfaceC6582g1);
    }

    /* renamed from: Y */
    public static void m18672Y(int i10, List<Integer> list, InterfaceC6624u1 interfaceC6624u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18904z(i10, list, z10);
    }

    /* renamed from: Z */
    public static void m18673Z(int i10, List<Long> list, InterfaceC6624u1 interfaceC6624u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18895q(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m18674a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC6589j.m18725U(i10) + AbstractC6589j.m18707C(size) : size * AbstractC6589j.m18733d(i10, true);
    }

    /* renamed from: a0 */
    public static void m18675a0(int i10, List<Integer> list, InterfaceC6624u1 interfaceC6624u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18867D(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m18676b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m18677b0(int i10, List<Long> list, InterfaceC6624u1 interfaceC6624u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18890l(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m18678c(int i10, List<AbstractC6580g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m18725U = size * AbstractC6589j.m18725U(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            m18725U += AbstractC6589j.m18740h(list.get(i11));
        }
        return m18725U;
    }

    /* renamed from: c0 */
    public static void m18679c0(int i10, List<String> list, InterfaceC6624u1 interfaceC6624u1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18882d(i10, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m18680d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m18682e = m18682e(list);
        int m18725U = AbstractC6589j.m18725U(i10);
        return z10 ? m18725U + AbstractC6589j.m18707C(m18682e) : m18682e + (size * m18725U);
    }

    /* renamed from: d0 */
    public static void m18681d0(int i10, List<Integer> list, InterfaceC6624u1 interfaceC6624u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18889k(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m18682e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6631y) {
            C6631y c6631y = (C6631y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC6589j.m18744l(c6631y.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC6589j.m18744l(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: e0 */
    public static void m18683e0(int i10, List<Long> list, InterfaceC6624u1 interfaceC6624u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6624u1.mo18896r(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m18684f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC6589j.m18725U(i10) + AbstractC6589j.m18707C(size * 4) : size * AbstractC6589j.m18745m(i10, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m18685g(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m18686h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC6589j.m18725U(i10) + AbstractC6589j.m18707C(size * 8) : size * AbstractC6589j.m18747o(i10, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m18687i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m18688j(int i10, List<InterfaceC6614r0> list, InterfaceC6582g1 interfaceC6582g1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC6589j.m18751s(i10, list.get(i12), interfaceC6582g1);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m18689k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m18690l = m18690l(list);
        int m18725U = AbstractC6589j.m18725U(i10);
        return z10 ? m18725U + AbstractC6589j.m18707C(m18690l) : m18690l + (size * m18725U);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m18690l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6631y) {
            C6631y c6631y = (C6631y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC6589j.m18755w(c6631y.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC6589j.m18755w(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m18691m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int m18692n = m18692n(list);
        return z10 ? AbstractC6589j.m18725U(i10) + AbstractC6589j.m18707C(m18692n) : m18692n + (list.size() * AbstractC6589j.m18725U(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static int m18692n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6587i0) {
            C6587i0 c6587i0 = (C6587i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC6589j.m18757y(c6587i0.m18643n(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC6589j.m18757y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static int m18693o(int i10, Object obj, InterfaceC6582g1 interfaceC6582g1) {
        return obj instanceof C6575e0 ? AbstractC6589j.m18705A(i10, (C6575e0) obj) : AbstractC6589j.m18710F(i10, (InterfaceC6614r0) obj, interfaceC6582g1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static int m18694p(int i10, List<?> list, InterfaceC6582g1 interfaceC6582g1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m18725U = AbstractC6589j.m18725U(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            m18725U += obj instanceof C6575e0 ? AbstractC6589j.m18706B((C6575e0) obj) : AbstractC6589j.m18712H((InterfaceC6614r0) obj, interfaceC6582g1);
        }
        return m18725U;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static int m18695q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m18696r = m18696r(list);
        int m18725U = AbstractC6589j.m18725U(i10);
        return z10 ? m18725U + AbstractC6589j.m18707C(m18696r) : m18696r + (size * m18725U);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static int m18696r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6631y) {
            C6631y c6631y = (C6631y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC6589j.m18720P(c6631y.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC6589j.m18720P(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static int m18697s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m18698t = m18698t(list);
        int m18725U = AbstractC6589j.m18725U(i10);
        return z10 ? m18725U + AbstractC6589j.m18707C(m18698t) : m18698t + (size * m18725U);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static int m18698t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6587i0) {
            C6587i0 c6587i0 = (C6587i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC6589j.m18722R(c6587i0.m18643n(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC6589j.m18722R(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static int m18699u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int m18725U = AbstractC6589j.m18725U(i10) * size;
        if (list instanceof InterfaceC6581g0) {
            InterfaceC6581g0 interfaceC6581g0 = (InterfaceC6581g0) list;
            while (i11 < size) {
                Object mo18461j = interfaceC6581g0.mo18461j(i11);
                m18725U += mo18461j instanceof AbstractC6580g ? AbstractC6589j.m18740h((AbstractC6580g) mo18461j) : AbstractC6589j.m18724T((String) mo18461j);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                m18725U += obj instanceof AbstractC6580g ? AbstractC6589j.m18740h((AbstractC6580g) obj) : AbstractC6589j.m18724T((String) obj);
                i11++;
            }
        }
        return m18725U;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static int m18700v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m18701w = m18701w(list);
        int m18725U = AbstractC6589j.m18725U(i10);
        return z10 ? m18725U + AbstractC6589j.m18707C(m18701w) : m18701w + (size * m18725U);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static int m18701w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6631y) {
            C6631y c6631y = (C6631y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC6589j.m18727W(c6631y.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC6589j.m18727W(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static int m18702x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m18703y = m18703y(list);
        int m18725U = AbstractC6589j.m18725U(i10);
        return z10 ? m18725U + AbstractC6589j.m18707C(m18703y) : m18703y + (size * m18725U);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static int m18703y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6587i0) {
            C6587i0 c6587i0 = (C6587i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC6589j.m18729Y(c6587i0.m18643n(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC6589j.m18729Y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static <UT, UB> UB m18704z(Object obj, int i10, List<Integer> list, C6633z.d<?> dVar, UB ub2, AbstractC6603n1<UT, UB> abstractC6603n1) {
        if (dVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (dVar.mo19358a(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) m18659L(obj, i10, intValue, ub2, abstractC6603n1);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.mo19358a(intValue2) == null) {
                    ub2 = (UB) m18659L(obj, i10, intValue2, ub2, abstractC6603n1);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
