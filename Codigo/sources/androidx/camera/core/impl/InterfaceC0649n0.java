package androidx.camera.core.impl;

import androidx.camera.core.impl.utils.C0687p;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p126h0.C7608c;

/* renamed from: androidx.camera.core.impl.n0 */
/* loaded from: classes.dex */
public interface InterfaceC0649n0 {

    /* renamed from: androidx.camera.core.impl.n0$a */
    /* loaded from: classes.dex */
    public static abstract class a<T> {
        /* renamed from: a */
        public static <T> a<T> m3199a(String str, Class<?> cls) {
            return m3200b(str, cls, null);
        }

        /* renamed from: b */
        public static <T> a<T> m3200b(String str, Class<?> cls, Object obj) {
            return new C0609d(str, cls, obj);
        }

        /* renamed from: c */
        public abstract String mo3015c();

        /* renamed from: d */
        public abstract Object mo3016d();

        /* renamed from: e */
        public abstract Class<T> mo3017e();
    }

    /* renamed from: androidx.camera.core.impl.n0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        boolean mo3201a(a<?> aVar);
    }

    /* renamed from: androidx.camera.core.impl.n0$c */
    /* loaded from: classes.dex */
    public enum c {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    /* renamed from: D */
    static void m3188D(C0647m1 c0647m1, InterfaceC0649n0 interfaceC0649n0, InterfaceC0649n0 interfaceC0649n02, a<?> aVar) {
        if (!Objects.equals(aVar, InterfaceC0619f1.f2808p)) {
            c0647m1.mo3177p(aVar, interfaceC0649n02.mo3198h(aVar), interfaceC0649n02.mo3191a(aVar));
            return;
        }
        C7608c c7608c = (C7608c) interfaceC0649n02.mo3197g(aVar, null);
        c0647m1.mo3177p(aVar, interfaceC0649n02.mo3198h(aVar), C0687p.m3338a((C7608c) interfaceC0649n0.mo3197g(aVar, null), c7608c));
    }

    /* renamed from: O */
    static InterfaceC0649n0 m3189O(InterfaceC0649n0 interfaceC0649n0, InterfaceC0649n0 interfaceC0649n02) {
        if (interfaceC0649n0 == null && interfaceC0649n02 == null) {
            return C0656p1.m3210X();
        }
        C0647m1 m3185b0 = interfaceC0649n02 != null ? C0647m1.m3185b0(interfaceC0649n02) : C0647m1.m3184a0();
        if (interfaceC0649n0 != null) {
            Iterator<a<?>> it = interfaceC0649n0.mo3195e().iterator();
            while (it.hasNext()) {
                m3188D(m3185b0, interfaceC0649n02, interfaceC0649n0, it.next());
            }
        }
        return C0656p1.m3211Y(m3185b0);
    }

    /* renamed from: z */
    static boolean m3190z(c cVar, c cVar2) {
        c cVar3 = c.ALWAYS_OVERRIDE;
        if (cVar == cVar3 && cVar2 == cVar3) {
            return true;
        }
        c cVar4 = c.REQUIRED;
        return cVar == cVar4 && cVar2 == cVar4;
    }

    /* renamed from: a */
    <ValueT> ValueT mo3191a(a<ValueT> aVar);

    /* renamed from: b */
    boolean mo3192b(a<?> aVar);

    /* renamed from: c */
    void mo3193c(String str, b bVar);

    /* renamed from: d */
    <ValueT> ValueT mo3194d(a<ValueT> aVar, c cVar);

    /* renamed from: e */
    Set<a<?>> mo3195e();

    /* renamed from: f */
    Set<c> mo3196f(a<?> aVar);

    /* renamed from: g */
    <ValueT> ValueT mo3197g(a<ValueT> aVar, ValueT valuet);

    /* renamed from: h */
    c mo3198h(a<?> aVar);
}
