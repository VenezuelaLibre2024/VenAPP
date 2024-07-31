package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import jb.v;
import jb.w;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final Map<c, l<?, ?>> f11308a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, w<?, ?>> f11309b;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map<c, l<?, ?>> f11310a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<Class<?>, w<?, ?>> f11311b;

        public b() {
            this.f11310a = new HashMap();
            this.f11311b = new HashMap();
        }

        public b(n nVar) {
            this.f11310a = new HashMap(nVar.f11308a);
            this.f11311b = new HashMap(nVar.f11309b);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public n c() {
            return new n(this);
        }

        public <KeyT extends jb.g, PrimitiveT> b d(l<KeyT, PrimitiveT> lVar) {
            if (lVar == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            c cVar = new c(lVar.c(), lVar.d());
            if (this.f11310a.containsKey(cVar)) {
                l<?, ?> lVar2 = this.f11310a.get(cVar);
                if (!lVar2.equals(lVar) || !lVar.equals(lVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + cVar);
                }
            } else {
                this.f11310a.put(cVar, lVar);
            }
            return this;
        }

        public <InputPrimitiveT, WrapperPrimitiveT> b e(w<InputPrimitiveT, WrapperPrimitiveT> wVar) {
            if (wVar == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class<WrapperPrimitiveT> c10 = wVar.c();
            if (this.f11311b.containsKey(c10)) {
                w<?, ?> wVar2 = this.f11311b.get(c10);
                if (!wVar2.equals(wVar) || !wVar.equals(wVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + c10);
                }
            } else {
                this.f11311b.put(c10, wVar);
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class<?> f11312a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<?> f11313b;

        private c(Class<?> cls, Class<?> cls2) {
            this.f11312a = cls;
            this.f11313b = cls2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f11312a.equals(this.f11312a) && cVar.f11313b.equals(this.f11313b);
        }

        public int hashCode() {
            return Objects.hash(this.f11312a, this.f11313b);
        }

        public String toString() {
            return this.f11312a.getSimpleName() + " with primitive type: " + this.f11313b.getSimpleName();
        }
    }

    private n(b bVar) {
        this.f11308a = new HashMap(bVar.f11310a);
        this.f11309b = new HashMap(bVar.f11311b);
    }

    public Class<?> c(Class<?> cls) {
        if (this.f11309b.containsKey(cls)) {
            return this.f11309b.get(cls).b();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public <KeyT extends jb.g, PrimitiveT> PrimitiveT d(KeyT keyt, Class<PrimitiveT> cls) {
        c cVar = new c(keyt.getClass(), cls);
        if (this.f11308a.containsKey(cVar)) {
            return (PrimitiveT) this.f11308a.get(cVar).a(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + cVar + " available");
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT e(v<InputPrimitiveT> vVar, Class<WrapperPrimitiveT> cls) {
        if (!this.f11309b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + cls);
        }
        w<?, ?> wVar = this.f11309b.get(cls);
        if (vVar.g().equals(wVar.b()) && wVar.b().equals(vVar.g())) {
            return (WrapperPrimitiveT) wVar.a(vVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
