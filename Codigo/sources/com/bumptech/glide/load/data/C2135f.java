package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC2134e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p036c4.C1870k;

/* renamed from: com.bumptech.glide.load.data.f */
/* loaded from: classes.dex */
public class C2135f {

    /* renamed from: b */
    private static final InterfaceC2134e.a<?> f8421b = new a();

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC2134e.a<?>> f8422a = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.f$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC2134e.a<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2134e.a
        /* renamed from: a */
        public Class<Object> mo10757a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2134e.a
        /* renamed from: b */
        public InterfaceC2134e<Object> mo10758b(Object obj) {
            return new b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.f$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC2134e<Object> {

        /* renamed from: a */
        private final Object f8423a;

        b(Object obj) {
            this.f8423a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2134e
        /* renamed from: a */
        public Object mo10754a() {
            return this.f8423a;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2134e
        /* renamed from: b */
        public void mo10755b() {
        }
    }

    /* renamed from: a */
    public synchronized <T> InterfaceC2134e<T> m10775a(T t10) {
        InterfaceC2134e.a<?> aVar;
        C1870k.m9950d(t10);
        aVar = this.f8422a.get(t10.getClass());
        if (aVar == null) {
            Iterator<InterfaceC2134e.a<?>> it = this.f8422a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC2134e.a<?> next = it.next();
                if (next.mo10757a().isAssignableFrom(t10.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f8421b;
        }
        return (InterfaceC2134e<T>) aVar.mo10758b(t10);
    }

    /* renamed from: b */
    public synchronized void m10776b(InterfaceC2134e.a<?> aVar) {
        this.f8422a.put(aVar.mo10757a(), aVar);
    }
}
