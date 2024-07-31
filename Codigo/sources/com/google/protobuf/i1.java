package com.google.protobuf;

import com.google.protobuf.t;
import com.google.protobuf.z;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i1 {

    /* renamed from: a */
    private static final Class<?> f13231a = B();

    /* renamed from: b */
    private static final n1<?, ?> f13232b = C(false);

    /* renamed from: c */
    private static final n1<?, ?> f13233c = C(true);

    /* renamed from: d */
    private static final n1<?, ?> f13234d = new p1();

    public static <UT, UB> UB A(Object obj, int i10, List<Integer> list, z.e eVar, UB ub2, n1<UT, UB> n1Var) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (eVar.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) L(obj, i10, intValue, ub2, n1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub2 = (UB) L(obj, i10, intValue2, ub2, n1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    private static Class<?> B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static n1<?, ?> C(boolean z10) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (n1) D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends t.b<FT>> void E(p<FT> pVar, T t10, T t11) {
        t<FT> c10 = pVar.c(t11);
        if (c10.n()) {
            return;
        }
        pVar.d(t10).v(c10);
    }

    public static <T> void F(m0 m0Var, T t10, T t11, long j10) {
        r1.R(t10, j10, m0Var.a(r1.C(t10, j10), r1.C(t11, j10)));
    }

    public static <T, UT, UB> void G(n1<UT, UB> n1Var, T t10, T t11) {
        n1Var.p(t10, n1Var.k(n1Var.g(t10), n1Var.g(t11)));
    }

    public static n1<?, ?> H() {
        return f13232b;
    }

    public static n1<?, ?> I() {
        return f13233c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!x.class.isAssignableFrom(cls) && (cls2 = f13231a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB L(Object obj, int i10, int i11, UB ub2, n1<UT, UB> n1Var) {
        if (ub2 == null) {
            ub2 = n1Var.f(obj);
        }
        n1Var.e(ub2, i10, i11);
        return ub2;
    }

    public static n1<?, ?> M() {
        return f13234d;
    }

    public static void N(int i10, List<Boolean> list, u1 u1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.A(i10, list, z10);
    }

    public static void O(int i10, List<g> list, u1 u1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.I(i10, list);
    }

    public static void P(int i10, List<Double> list, u1 u1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.G(i10, list, z10);
    }

    public static void Q(int i10, List<Integer> list, u1 u1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.n(i10, list, z10);
    }

    public static void R(int i10, List<Integer> list, u1 u1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.j(i10, list, z10);
    }

    public static void S(int i10, List<Long> list, u1 u1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.y(i10, list, z10);
    }

    public static void T(int i10, List<Float> list, u1 u1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.a(i10, list, z10);
    }

    public static void U(int i10, List<?> list, u1 u1Var, g1 g1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.M(i10, list, g1Var);
    }

    public static void V(int i10, List<Integer> list, u1 u1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.g(i10, list, z10);
    }

    public static void W(int i10, List<Long> list, u1 u1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.F(i10, list, z10);
    }

    public static void X(int i10, List<?> list, u1 u1Var, g1 g1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.J(i10, list, g1Var);
    }

    public static void Y(int i10, List<Integer> list, u1 u1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.z(i10, list, z10);
    }

    public static void Z(int i10, List<Long> list, u1 u1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.q(i10, list, z10);
    }

    public static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? j.U(i10) + j.C(size) : size * j.d(i10, true);
    }

    public static void a0(int i10, List<Integer> list, u1 u1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.D(i10, list, z10);
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<Long> list, u1 u1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.l(i10, list, z10);
    }

    public static int c(int i10, List<g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = size * j.U(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            U += j.h(list.get(i11));
        }
        return U;
    }

    public static void c0(int i10, List<String> list, u1 u1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.d(i10, list);
    }

    public static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        int U = j.U(i10);
        return z10 ? U + j.C(e10) : e10 + (size * U);
    }

    public static void d0(int i10, List<Integer> list, u1 u1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.k(i10, list, z10);
    }

    public static int e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += j.l(yVar.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += j.l(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void e0(int i10, List<Long> list, u1 u1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.r(i10, list, z10);
    }

    public static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? j.U(i10) + j.C(size * 4) : size * j.m(i10, 0);
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? j.U(i10) + j.C(size * 8) : size * j.o(i10, 0L);
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i10, List<r0> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += j.s(i10, list.get(i12), g1Var);
        }
        return i11;
    }

    public static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        int U = j.U(i10);
        return z10 ? U + j.C(l10) : l10 + (size * U);
    }

    public static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += j.w(yVar.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += j.w(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        return z10 ? j.U(i10) + j.C(n10) : n10 + (list.size() * j.U(i10));
    }

    public static int n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += j.y(i0Var.n(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += j.y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int o(int i10, Object obj, g1 g1Var) {
        return obj instanceof e0 ? j.A(i10, (e0) obj) : j.F(i10, (r0) obj, g1Var);
    }

    public static int p(int i10, List<?> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = j.U(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            U += obj instanceof e0 ? j.B((e0) obj) : j.H((r0) obj, g1Var);
        }
        return U;
    }

    public static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        int U = j.U(i10);
        return z10 ? U + j.C(r10) : r10 + (size * U);
    }

    public static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += j.P(yVar.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += j.P(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t10 = t(list);
        int U = j.U(i10);
        return z10 ? U + j.C(t10) : t10 + (size * U);
    }

    public static int t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += j.R(i0Var.n(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += j.R(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int U = j.U(i10) * size;
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            while (i11 < size) {
                Object j10 = g0Var.j(i11);
                U += j10 instanceof g ? j.h((g) j10) : j.T((String) j10);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                U += obj instanceof g ? j.h((g) obj) : j.T((String) obj);
                i11++;
            }
        }
        return U;
    }

    public static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        int U = j.U(i10);
        return z10 ? U + j.C(w10) : w10 + (size * U);
    }

    public static int w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += j.W(yVar.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += j.W(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        int U = j.U(i10);
        return z10 ? U + j.C(y10) : y10 + (size * U);
    }

    public static int y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += j.Y(i0Var.n(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += j.Y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static <UT, UB> UB z(Object obj, int i10, List<Integer> list, z.d<?> dVar, UB ub2, n1<UT, UB> n1Var) {
        if (dVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (dVar.a(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) L(obj, i10, intValue, ub2, n1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub2 = (UB) L(obj, i10, intValue2, ub2, n1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
