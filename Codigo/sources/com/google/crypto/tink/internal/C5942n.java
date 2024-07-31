package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p179jb.AbstractC9015g;
import p179jb.C9030v;
import p179jb.InterfaceC9031w;

/* renamed from: com.google.crypto.tink.internal.n */
/* loaded from: classes2.dex */
public class C5942n {

    /* renamed from: a */
    private final Map<c, AbstractC5940l<?, ?>> f12523a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC9031w<?, ?>> f12524b;

    /* renamed from: com.google.crypto.tink.internal.n$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private final Map<c, AbstractC5940l<?, ?>> f12525a;

        /* renamed from: b */
        private final Map<Class<?>, InterfaceC9031w<?, ?>> f12526b;

        public b() {
            this.f12525a = new HashMap();
            this.f12526b = new HashMap();
        }

        public b(C5942n c5942n) {
            this.f12525a = new HashMap(c5942n.f12523a);
            this.f12526b = new HashMap(c5942n.f12524b);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public C5942n m15261c() {
            return new C5942n(this);
        }

        /* renamed from: d */
        public <KeyT extends AbstractC9015g, PrimitiveT> b m15262d(AbstractC5940l<KeyT, PrimitiveT> abstractC5940l) {
            if (abstractC5940l == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            c cVar = new c(abstractC5940l.m15249c(), abstractC5940l.m15250d());
            if (this.f12525a.containsKey(cVar)) {
                AbstractC5940l<?, ?> abstractC5940l2 = this.f12525a.get(cVar);
                if (!abstractC5940l2.equals(abstractC5940l) || !abstractC5940l.equals(abstractC5940l2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + cVar);
                }
            } else {
                this.f12525a.put(cVar, abstractC5940l);
            }
            return this;
        }

        /* renamed from: e */
        public <InputPrimitiveT, WrapperPrimitiveT> b m15263e(InterfaceC9031w<InputPrimitiveT, WrapperPrimitiveT> interfaceC9031w) {
            if (interfaceC9031w == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class<WrapperPrimitiveT> mo26523c = interfaceC9031w.mo26523c();
            if (this.f12526b.containsKey(mo26523c)) {
                InterfaceC9031w<?, ?> interfaceC9031w2 = this.f12526b.get(mo26523c);
                if (!interfaceC9031w2.equals(interfaceC9031w) || !interfaceC9031w.equals(interfaceC9031w2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + mo26523c);
                }
            } else {
                this.f12526b.put(mo26523c, interfaceC9031w);
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.internal.n$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a */
        private final Class<?> f12527a;

        /* renamed from: b */
        private final Class<?> f12528b;

        private c(Class<?> cls, Class<?> cls2) {
            this.f12527a = cls;
            this.f12528b = cls2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f12527a.equals(this.f12527a) && cVar.f12528b.equals(this.f12528b);
        }

        public int hashCode() {
            return Objects.hash(this.f12527a, this.f12528b);
        }

        public String toString() {
            return this.f12527a.getSimpleName() + " with primitive type: " + this.f12528b.getSimpleName();
        }
    }

    private C5942n(b bVar) {
        this.f12523a = new HashMap(bVar.f12525a);
        this.f12524b = new HashMap(bVar.f12526b);
    }

    /* renamed from: c */
    public Class<?> m15256c(Class<?> cls) {
        if (this.f12524b.containsKey(cls)) {
            return this.f12524b.get(cls).mo26522b();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    /* renamed from: d */
    public <KeyT extends AbstractC9015g, PrimitiveT> PrimitiveT m15257d(KeyT keyt, Class<PrimitiveT> cls) {
        c cVar = new c(keyt.getClass(), cls);
        if (this.f12523a.containsKey(cVar)) {
            return (PrimitiveT) this.f12523a.get(cVar).mo15248a(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + cVar + " available");
    }

    /* renamed from: e */
    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT m15258e(C9030v<InputPrimitiveT> c9030v, Class<WrapperPrimitiveT> cls) {
        if (!this.f12524b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + cls);
        }
        InterfaceC9031w<?, ?> interfaceC9031w = this.f12524b.get(cls);
        if (c9030v.m26504g().equals(interfaceC9031w.mo26522b()) && interfaceC9031w.mo26522b().equals(c9030v.m26504g())) {
            return (WrapperPrimitiveT) interfaceC9031w.mo26521a(c9030v);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
