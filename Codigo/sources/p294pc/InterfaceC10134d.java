package p294pc;

import ee.InterfaceC7182a;
import ee.InterfaceC7183b;
import java.util.Set;

/* renamed from: pc.d */
/* loaded from: classes.dex */
public interface InterfaceC10134d {
    /* renamed from: a */
    <T> InterfaceC7182a<T> mo30294a(C10137e0<T> c10137e0);

    /* renamed from: b */
    <T> InterfaceC7183b<T> mo30295b(C10137e0<T> c10137e0);

    /* renamed from: c */
    default <T> Set<T> m30296c(Class<T> cls) {
        return mo30300g(C10137e0.m30307b(cls));
    }

    /* renamed from: d */
    <T> InterfaceC7183b<Set<T>> mo30297d(C10137e0<T> c10137e0);

    /* renamed from: e */
    default <T> T mo30298e(C10137e0<T> c10137e0) {
        InterfaceC7183b<T> mo30295b = mo30295b(c10137e0);
        if (mo30295b == null) {
            return null;
        }
        return mo30295b.get();
    }

    /* renamed from: f */
    default <T> InterfaceC7183b<T> mo30299f(Class<T> cls) {
        return mo30295b(C10137e0.m30307b(cls));
    }

    /* renamed from: g */
    default <T> Set<T> mo30300g(C10137e0<T> c10137e0) {
        return mo30297d(c10137e0).get();
    }

    default <T> T get(Class<T> cls) {
        return (T) mo30298e(C10137e0.m30307b(cls));
    }

    /* renamed from: h */
    default <T> InterfaceC7182a<T> mo30301h(Class<T> cls) {
        return mo30294a(C10137e0.m30307b(cls));
    }
}
