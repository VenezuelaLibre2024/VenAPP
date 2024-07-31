package androidx.camera.core.impl;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public interface n0 {

    /* loaded from: classes.dex */
    public static abstract class a<T> {
        public static <T> a<T> a(String str, Class<?> cls) {
            return b(str, cls, null);
        }

        public static <T> a<T> b(String str, Class<?> cls, Object obj) {
            return new d(str, cls, obj);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class<T> e();
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(a<?> aVar);
    }

    /* loaded from: classes.dex */
    public enum c {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    static void D(m1 m1Var, n0 n0Var, n0 n0Var2, a<?> aVar) {
        if (!Objects.equals(aVar, f1.f2470p)) {
            m1Var.p(aVar, n0Var2.h(aVar), n0Var2.a(aVar));
            return;
        }
        h0.c cVar = (h0.c) n0Var2.g(aVar, null);
        m1Var.p(aVar, n0Var2.h(aVar), androidx.camera.core.impl.utils.p.a((h0.c) n0Var.g(aVar, null), cVar));
    }

    static n0 O(n0 n0Var, n0 n0Var2) {
        if (n0Var == null && n0Var2 == null) {
            return p1.X();
        }
        m1 b02 = n0Var2 != null ? m1.b0(n0Var2) : m1.a0();
        if (n0Var != null) {
            Iterator<a<?>> it = n0Var.e().iterator();
            while (it.hasNext()) {
                D(b02, n0Var2, n0Var, it.next());
            }
        }
        return p1.Y(b02);
    }

    static boolean z(c cVar, c cVar2) {
        c cVar3 = c.ALWAYS_OVERRIDE;
        if (cVar == cVar3 && cVar2 == cVar3) {
            return true;
        }
        c cVar4 = c.REQUIRED;
        return cVar == cVar4 && cVar2 == cVar4;
    }

    <ValueT> ValueT a(a<ValueT> aVar);

    boolean b(a<?> aVar);

    void c(String str, b bVar);

    <ValueT> ValueT d(a<ValueT> aVar, c cVar);

    Set<a<?>> e();

    Set<c> f(a<?> aVar);

    <ValueT> ValueT g(a<ValueT> aVar, ValueT valuet);

    c h(a<?> aVar);
}
