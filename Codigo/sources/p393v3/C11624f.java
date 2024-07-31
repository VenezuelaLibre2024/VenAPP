package p393v3;

import java.util.ArrayList;
import java.util.List;

/* renamed from: v3.f */
/* loaded from: classes.dex */
public class C11624f {

    /* renamed from: a */
    private final List<a<?, ?>> f30226a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v3.f$a */
    /* loaded from: classes.dex */
    public static final class a<Z, R> {

        /* renamed from: a */
        final Class<Z> f30227a;

        /* renamed from: b */
        final Class<R> f30228b;

        /* renamed from: c */
        final InterfaceC11623e<Z, R> f30229c;

        a(Class<Z> cls, Class<R> cls2, InterfaceC11623e<Z, R> interfaceC11623e) {
            this.f30227a = cls;
            this.f30228b = cls2;
            this.f30229c = interfaceC11623e;
        }

        /* renamed from: a */
        public boolean m36419a(Class<?> cls, Class<?> cls2) {
            return this.f30227a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f30228b);
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> InterfaceC11623e<Z, R> m36416a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C11625g.m36420b();
        }
        for (a<?, ?> aVar : this.f30226a) {
            if (aVar.m36419a(cls, cls2)) {
                return (InterfaceC11623e<Z, R>) aVar.f30229c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> m36417b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.f30226a) {
            if (aVar.m36419a(cls, cls2) && !arrayList.contains(aVar.f30228b)) {
                arrayList.add(aVar.f30228b);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized <Z, R> void m36418c(Class<Z> cls, Class<R> cls2, InterfaceC11623e<Z, R> interfaceC11623e) {
        this.f30226a.add(new a<>(cls, cls2, interfaceC11623e));
    }
}
