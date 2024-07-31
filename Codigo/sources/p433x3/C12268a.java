package p433x3;

import java.util.ArrayList;
import java.util.List;
import p129h3.InterfaceC7620d;

/* renamed from: x3.a */
/* loaded from: classes.dex */
public class C12268a {

    /* renamed from: a */
    private final List<a<?>> f32878a = new ArrayList();

    /* renamed from: x3.a$a */
    /* loaded from: classes.dex */
    private static final class a<T> {

        /* renamed from: a */
        private final Class<T> f32879a;

        /* renamed from: b */
        final InterfaceC7620d<T> f32880b;

        a(Class<T> cls, InterfaceC7620d<T> interfaceC7620d) {
            this.f32879a = cls;
            this.f32880b = interfaceC7620d;
        }

        /* renamed from: a */
        boolean m39501a(Class<?> cls) {
            return this.f32879a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> void m39499a(Class<T> cls, InterfaceC7620d<T> interfaceC7620d) {
        this.f32878a.add(new a<>(cls, interfaceC7620d));
    }

    /* renamed from: b */
    public synchronized <T> InterfaceC7620d<T> m39500b(Class<T> cls) {
        for (a<?> aVar : this.f32878a) {
            if (aVar.m39501a(cls)) {
                return (InterfaceC7620d<T>) aVar.f32880b;
            }
        }
        return null;
    }
}
