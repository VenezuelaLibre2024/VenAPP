package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5950a0;
import com.google.crypto.tink.shaded.protobuf.C6009u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.i1 */
/* loaded from: classes2.dex */
public final class C5975i1 {

    /* renamed from: a */
    private static final Class<?> f12632a = m15601B();

    /* renamed from: b */
    private static final AbstractC5990n1<?, ?> f12633b = m15602C(false);

    /* renamed from: c */
    private static final AbstractC5990n1<?, ?> f12634c = m15602C(true);

    /* renamed from: d */
    private static final AbstractC5990n1<?, ?> f12635d = new C5996p1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static <UT, UB> UB m15600A(Object obj, int i10, List<Integer> list, C5950a0.e eVar, UB ub2, AbstractC5990n1<UT, UB> abstractC5990n1) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (eVar.m15314a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) m15611L(obj, i10, intValue, ub2, abstractC5990n1);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.m15314a(intValue2)) {
                    ub2 = (UB) m15611L(obj, i10, intValue2, ub2, abstractC5990n1);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    /* renamed from: B */
    private static Class<?> m15601B() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    private static AbstractC5990n1<?, ?> m15602C(boolean z10) {
        try {
            Class<?> m15603D = m15603D();
            if (m15603D == null) {
                return null;
            }
            return (AbstractC5990n1) m15603D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    private static Class<?> m15603D() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static <T, FT extends C6009u.b<FT>> void m15604E(AbstractC5997q<FT> abstractC5997q, T t10, T t11) {
        C6009u<FT> mo15952c = abstractC5997q.mo15952c(t11);
        if (mo15952c.m16114m()) {
            return;
        }
        abstractC5997q.mo15953d(t10).m16119u(mo15952c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static <T> void m15605F(InterfaceC5986m0 interfaceC5986m0, T t10, T t11, long j10) {
        C6002r1.m15991R(t10, j10, interfaceC5986m0.mo15877a(C6002r1.m15976C(t10, j10), C6002r1.m15976C(t11, j10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static <T, UT, UB> void m15606G(AbstractC5990n1<UT, UB> abstractC5990n1, T t10, T t11) {
        abstractC5990n1.mo15903p(t10, abstractC5990n1.mo15898k(abstractC5990n1.mo15894g(t10), abstractC5990n1.mo15894g(t11)));
    }

    /* renamed from: H */
    public static AbstractC5990n1<?, ?> m15607H() {
        return f12633b;
    }

    /* renamed from: I */
    public static AbstractC5990n1<?, ?> m15608I() {
        return f12634c;
    }

    /* renamed from: J */
    public static void m15609J(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC6018y.class.isAssignableFrom(cls) && (cls2 = f12632a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static boolean m15610K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static <UT, UB> UB m15611L(Object obj, int i10, int i11, UB ub2, AbstractC5990n1<UT, UB> abstractC5990n1) {
        if (ub2 == null) {
            ub2 = abstractC5990n1.mo15893f(obj);
        }
        abstractC5990n1.mo15892e(ub2, i10, i11);
        return ub2;
    }

    /* renamed from: M */
    public static AbstractC5990n1<?, ?> m15612M() {
        return f12635d;
    }

    /* renamed from: N */
    public static void m15613N(int i10, List<Boolean> list, InterfaceC6011u1 interfaceC6011u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15809A(i10, list, z10);
    }

    /* renamed from: O */
    public static void m15614O(int i10, List<AbstractC5970h> list, InterfaceC6011u1 interfaceC6011u1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15817I(i10, list);
    }

    /* renamed from: P */
    public static void m15615P(int i10, List<Double> list, InterfaceC6011u1 interfaceC6011u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15815G(i10, list, z10);
    }

    /* renamed from: Q */
    public static void m15616Q(int i10, List<Integer> list, InterfaceC6011u1 interfaceC6011u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15837n(i10, list, z10);
    }

    /* renamed from: R */
    public static void m15617R(int i10, List<Integer> list, InterfaceC6011u1 interfaceC6011u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15833j(i10, list, z10);
    }

    /* renamed from: S */
    public static void m15618S(int i10, List<Long> list, InterfaceC6011u1 interfaceC6011u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15848y(i10, list, z10);
    }

    /* renamed from: T */
    public static void m15619T(int i10, List<Float> list, InterfaceC6011u1 interfaceC6011u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15824a(i10, list, z10);
    }

    /* renamed from: U */
    public static void m15620U(int i10, List<?> list, InterfaceC6011u1 interfaceC6011u1, InterfaceC5969g1 interfaceC5969g1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15823O(i10, list, interfaceC5969g1);
    }

    /* renamed from: V */
    public static void m15621V(int i10, List<Integer> list, InterfaceC6011u1 interfaceC6011u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15830g(i10, list, z10);
    }

    /* renamed from: W */
    public static void m15622W(int i10, List<Long> list, InterfaceC6011u1 interfaceC6011u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15814F(i10, list, z10);
    }

    /* renamed from: X */
    public static void m15623X(int i10, List<?> list, InterfaceC6011u1 interfaceC6011u1, InterfaceC5969g1 interfaceC5969g1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15820L(i10, list, interfaceC5969g1);
    }

    /* renamed from: Y */
    public static void m15624Y(int i10, List<Integer> list, InterfaceC6011u1 interfaceC6011u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15849z(i10, list, z10);
    }

    /* renamed from: Z */
    public static void m15625Z(int i10, List<Long> list, InterfaceC6011u1 interfaceC6011u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15840q(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m15626a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC5979k.m15721T(i10) + AbstractC5979k.m15704C(size) : size * AbstractC5979k.m15730d(i10, true);
    }

    /* renamed from: a0 */
    public static void m15627a0(int i10, List<Integer> list, InterfaceC6011u1 interfaceC6011u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15812D(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m15628b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m15629b0(int i10, List<Long> list, InterfaceC6011u1 interfaceC6011u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15835l(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m15630c(int i10, List<AbstractC5970h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m15721T = size * AbstractC5979k.m15721T(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            m15721T += AbstractC5979k.m15735h(list.get(i11));
        }
        return m15721T;
    }

    /* renamed from: c0 */
    public static void m15631c0(int i10, List<String> list, InterfaceC6011u1 interfaceC6011u1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15827d(i10, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m15632d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m15634e = m15634e(list);
        int m15721T = AbstractC5979k.m15721T(i10);
        return z10 ? m15721T + AbstractC5979k.m15704C(m15634e) : m15634e + (size * m15721T);
    }

    /* renamed from: d0 */
    public static void m15633d0(int i10, List<Integer> list, InterfaceC6011u1 interfaceC6011u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15834k(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m15634e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6020z) {
            C6020z c6020z = (C6020z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5979k.m15739l(c6020z.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5979k.m15739l(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: e0 */
    public static void m15635e0(int i10, List<Long> list, InterfaceC6011u1 interfaceC6011u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC6011u1.mo15841r(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m15636f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC5979k.m15721T(i10) + AbstractC5979k.m15704C(size * 4) : size * AbstractC5979k.m15740m(i10, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m15637g(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m15638h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC5979k.m15721T(i10) + AbstractC5979k.m15704C(size * 8) : size * AbstractC5979k.m15742o(i10, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m15639i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m15640j(int i10, List<InterfaceC6001r0> list, InterfaceC5969g1 interfaceC5969g1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC5979k.m15746s(i10, list.get(i12), interfaceC5969g1);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m15641k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m15642l = m15642l(list);
        int m15721T = AbstractC5979k.m15721T(i10);
        return z10 ? m15721T + AbstractC5979k.m15704C(m15642l) : m15642l + (size * m15721T);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m15642l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6020z) {
            C6020z c6020z = (C6020z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5979k.m15750w(c6020z.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5979k.m15750w(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m15643m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int m15644n = m15644n(list);
        return z10 ? AbstractC5979k.m15721T(i10) + AbstractC5979k.m15704C(m15644n) : m15644n + (list.size() * AbstractC5979k.m15721T(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static int m15644n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5974i0) {
            C5974i0 c5974i0 = (C5974i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5979k.m15752y(c5974i0.m15595n(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5979k.m15752y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static int m15645o(int i10, Object obj, InterfaceC5969g1 interfaceC5969g1) {
        return obj instanceof C5962e0 ? AbstractC5979k.m15702A(i10, (C5962e0) obj) : AbstractC5979k.m15707F(i10, (InterfaceC6001r0) obj, interfaceC5969g1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static int m15646p(int i10, List<?> list, InterfaceC5969g1 interfaceC5969g1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m15721T = AbstractC5979k.m15721T(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            m15721T += obj instanceof C5962e0 ? AbstractC5979k.m15703B((C5962e0) obj) : AbstractC5979k.m15709H((InterfaceC6001r0) obj, interfaceC5969g1);
        }
        return m15721T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static int m15647q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m15648r = m15648r(list);
        int m15721T = AbstractC5979k.m15721T(i10);
        return z10 ? m15721T + AbstractC5979k.m15704C(m15648r) : m15648r + (size * m15721T);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static int m15648r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6020z) {
            C6020z c6020z = (C6020z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5979k.m15716O(c6020z.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5979k.m15716O(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static int m15649s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m15650t = m15650t(list);
        int m15721T = AbstractC5979k.m15721T(i10);
        return z10 ? m15721T + AbstractC5979k.m15704C(m15650t) : m15650t + (size * m15721T);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static int m15650t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5974i0) {
            C5974i0 c5974i0 = (C5974i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5979k.m15718Q(c5974i0.m15595n(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5979k.m15718Q(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static int m15651u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int m15721T = AbstractC5979k.m15721T(i10) * size;
        if (list instanceof InterfaceC5968g0) {
            InterfaceC5968g0 interfaceC5968g0 = (InterfaceC5968g0) list;
            while (i11 < size) {
                Object mo15422j = interfaceC5968g0.mo15422j(i11);
                m15721T += mo15422j instanceof AbstractC5970h ? AbstractC5979k.m15735h((AbstractC5970h) mo15422j) : AbstractC5979k.m15720S((String) mo15422j);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                m15721T += obj instanceof AbstractC5970h ? AbstractC5979k.m15735h((AbstractC5970h) obj) : AbstractC5979k.m15720S((String) obj);
                i11++;
            }
        }
        return m15721T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static int m15652v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m15653w = m15653w(list);
        int m15721T = AbstractC5979k.m15721T(i10);
        return z10 ? m15721T + AbstractC5979k.m15704C(m15653w) : m15653w + (size * m15721T);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static int m15653w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6020z) {
            C6020z c6020z = (C6020z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5979k.m15723V(c6020z.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5979k.m15723V(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static int m15654x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m15655y = m15655y(list);
        int m15721T = AbstractC5979k.m15721T(i10);
        return z10 ? m15721T + AbstractC5979k.m15704C(m15655y) : m15655y + (size * m15721T);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static int m15655y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5974i0) {
            C5974i0 c5974i0 = (C5974i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5979k.m15725X(c5974i0.m15595n(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5979k.m15725X(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static <UT, UB> UB m15656z(Object obj, int i10, List<Integer> list, C5950a0.d<?> dVar, UB ub2, AbstractC5990n1<UT, UB> abstractC5990n1) {
        if (dVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (dVar.mo15313a(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) m15611L(obj, i10, intValue, ub2, abstractC5990n1);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.mo15313a(intValue2) == null) {
                    ub2 = (UB) m15611L(obj, i10, intValue2, ub2, abstractC5990n1);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
