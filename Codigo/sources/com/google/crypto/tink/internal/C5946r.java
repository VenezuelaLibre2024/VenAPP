package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p179jb.AbstractC9015g;
import p179jb.AbstractC9029u;
import p179jb.C9033y;
import p441xb.C12413a;

/* renamed from: com.google.crypto.tink.internal.r */
/* loaded from: classes2.dex */
public final class C5946r {

    /* renamed from: a */
    private final Map<d, AbstractC5931c<?, ?>> f12536a;

    /* renamed from: b */
    private final Map<c, AbstractC5930b<?>> f12537b;

    /* renamed from: c */
    private final Map<d, AbstractC5939k<?, ?>> f12538c;

    /* renamed from: d */
    private final Map<c, AbstractC5938j<?>> f12539d;

    /* renamed from: com.google.crypto.tink.internal.r$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private final Map<d, AbstractC5931c<?, ?>> f12540a;

        /* renamed from: b */
        private final Map<c, AbstractC5930b<?>> f12541b;

        /* renamed from: c */
        private final Map<d, AbstractC5939k<?, ?>> f12542c;

        /* renamed from: d */
        private final Map<c, AbstractC5938j<?>> f12543d;

        public b() {
            this.f12540a = new HashMap();
            this.f12541b = new HashMap();
            this.f12542c = new HashMap();
            this.f12543d = new HashMap();
        }

        public b(C5946r c5946r) {
            this.f12540a = new HashMap(c5946r.f12536a);
            this.f12541b = new HashMap(c5946r.f12537b);
            this.f12542c = new HashMap(c5946r.f12538c);
            this.f12543d = new HashMap(c5946r.f12539d);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public C5946r m15281e() {
            return new C5946r(this);
        }

        /* renamed from: f */
        public <SerializationT extends InterfaceC5945q> b m15282f(AbstractC5930b<SerializationT> abstractC5930b) {
            c cVar = new c(abstractC5930b.m15197c(), abstractC5930b.m15196b());
            if (this.f12541b.containsKey(cVar)) {
                AbstractC5930b<?> abstractC5930b2 = this.f12541b.get(cVar);
                if (!abstractC5930b2.equals(abstractC5930b) || !abstractC5930b.equals(abstractC5930b2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f12541b.put(cVar, abstractC5930b);
            }
            return this;
        }

        /* renamed from: g */
        public <KeyT extends AbstractC9015g, SerializationT extends InterfaceC5945q> b m15283g(AbstractC5931c<KeyT, SerializationT> abstractC5931c) {
            d dVar = new d(abstractC5931c.m15201b(), abstractC5931c.m15202c());
            if (this.f12540a.containsKey(dVar)) {
                AbstractC5931c<?, ?> abstractC5931c2 = this.f12540a.get(dVar);
                if (!abstractC5931c2.equals(abstractC5931c) || !abstractC5931c.equals(abstractC5931c2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f12540a.put(dVar, abstractC5931c);
            }
            return this;
        }

        /* renamed from: h */
        public <SerializationT extends InterfaceC5945q> b m15284h(AbstractC5938j<SerializationT> abstractC5938j) {
            c cVar = new c(abstractC5938j.m15243c(), abstractC5938j.m15242b());
            if (this.f12543d.containsKey(cVar)) {
                AbstractC5938j<?> abstractC5938j2 = this.f12543d.get(cVar);
                if (!abstractC5938j2.equals(abstractC5938j) || !abstractC5938j.equals(abstractC5938j2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f12543d.put(cVar, abstractC5938j);
            }
            return this;
        }

        /* renamed from: i */
        public <ParametersT extends AbstractC9029u, SerializationT extends InterfaceC5945q> b m15285i(AbstractC5939k<ParametersT, SerializationT> abstractC5939k) {
            d dVar = new d(abstractC5939k.m15245b(), abstractC5939k.m15246c());
            if (this.f12542c.containsKey(dVar)) {
                AbstractC5939k<?, ?> abstractC5939k2 = this.f12542c.get(dVar);
                if (!abstractC5939k2.equals(abstractC5939k) || !abstractC5939k.equals(abstractC5939k2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f12542c.put(dVar, abstractC5939k);
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.internal.r$c */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a */
        private final Class<? extends InterfaceC5945q> f12544a;

        /* renamed from: b */
        private final C12413a f12545b;

        private c(Class<? extends InterfaceC5945q> cls, C12413a c12413a) {
            this.f12544a = cls;
            this.f12545b = c12413a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f12544a.equals(this.f12544a) && cVar.f12545b.equals(this.f12545b);
        }

        public int hashCode() {
            return Objects.hash(this.f12544a, this.f12545b);
        }

        public String toString() {
            return this.f12544a.getSimpleName() + ", object identifier: " + this.f12545b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.internal.r$d */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a */
        private final Class<?> f12546a;

        /* renamed from: b */
        private final Class<? extends InterfaceC5945q> f12547b;

        private d(Class<?> cls, Class<? extends InterfaceC5945q> cls2) {
            this.f12546a = cls;
            this.f12547b = cls2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f12546a.equals(this.f12546a) && dVar.f12547b.equals(this.f12547b);
        }

        public int hashCode() {
            return Objects.hash(this.f12546a, this.f12547b);
        }

        public String toString() {
            return this.f12546a.getSimpleName() + " with serialization type: " + this.f12547b.getSimpleName();
        }
    }

    private C5946r(b bVar) {
        this.f12536a = new HashMap(bVar.f12540a);
        this.f12537b = new HashMap(bVar.f12541b);
        this.f12538c = new HashMap(bVar.f12542c);
        this.f12539d = new HashMap(bVar.f12543d);
    }

    /* renamed from: e */
    public <SerializationT extends InterfaceC5945q> boolean m15275e(SerializationT serializationt) {
        return this.f12537b.containsKey(new c(serializationt.getClass(), serializationt.mo15265a()));
    }

    /* renamed from: f */
    public <SerializationT extends InterfaceC5945q> AbstractC9015g m15276f(SerializationT serializationt, C9033y c9033y) {
        c cVar = new c(serializationt.getClass(), serializationt.mo15265a());
        if (this.f12537b.containsKey(cVar)) {
            return this.f12537b.get(cVar).mo15198d(serializationt, c9033y);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }
}
