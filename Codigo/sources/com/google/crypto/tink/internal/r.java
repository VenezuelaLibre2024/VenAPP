package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import jb.u;
import jb.y;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Map<d, com.google.crypto.tink.internal.c<?, ?>> f11321a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<c, com.google.crypto.tink.internal.b<?>> f11322b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<d, k<?, ?>> f11323c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<c, j<?>> f11324d;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map<d, com.google.crypto.tink.internal.c<?, ?>> f11325a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<c, com.google.crypto.tink.internal.b<?>> f11326b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<d, k<?, ?>> f11327c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<c, j<?>> f11328d;

        public b() {
            this.f11325a = new HashMap();
            this.f11326b = new HashMap();
            this.f11327c = new HashMap();
            this.f11328d = new HashMap();
        }

        public b(r rVar) {
            this.f11325a = new HashMap(rVar.f11321a);
            this.f11326b = new HashMap(rVar.f11322b);
            this.f11327c = new HashMap(rVar.f11323c);
            this.f11328d = new HashMap(rVar.f11324d);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public r e() {
            return new r(this);
        }

        public <SerializationT extends q> b f(com.google.crypto.tink.internal.b<SerializationT> bVar) {
            c cVar = new c(bVar.c(), bVar.b());
            if (this.f11326b.containsKey(cVar)) {
                com.google.crypto.tink.internal.b<?> bVar2 = this.f11326b.get(cVar);
                if (!bVar2.equals(bVar) || !bVar.equals(bVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f11326b.put(cVar, bVar);
            }
            return this;
        }

        public <KeyT extends jb.g, SerializationT extends q> b g(com.google.crypto.tink.internal.c<KeyT, SerializationT> cVar) {
            d dVar = new d(cVar.b(), cVar.c());
            if (this.f11325a.containsKey(dVar)) {
                com.google.crypto.tink.internal.c<?, ?> cVar2 = this.f11325a.get(dVar);
                if (!cVar2.equals(cVar) || !cVar.equals(cVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f11325a.put(dVar, cVar);
            }
            return this;
        }

        public <SerializationT extends q> b h(j<SerializationT> jVar) {
            c cVar = new c(jVar.c(), jVar.b());
            if (this.f11328d.containsKey(cVar)) {
                j<?> jVar2 = this.f11328d.get(cVar);
                if (!jVar2.equals(jVar) || !jVar.equals(jVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f11328d.put(cVar, jVar);
            }
            return this;
        }

        public <ParametersT extends u, SerializationT extends q> b i(k<ParametersT, SerializationT> kVar) {
            d dVar = new d(kVar.b(), kVar.c());
            if (this.f11327c.containsKey(dVar)) {
                k<?, ?> kVar2 = this.f11327c.get(dVar);
                if (!kVar2.equals(kVar) || !kVar.equals(kVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f11327c.put(dVar, kVar);
            }
            return this;
        }
    }

    /* loaded from: classes2.dex */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class<? extends q> f11329a;

        /* renamed from: b, reason: collision with root package name */
        private final xb.a f11330b;

        private c(Class<? extends q> cls, xb.a aVar) {
            this.f11329a = cls;
            this.f11330b = aVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f11329a.equals(this.f11329a) && cVar.f11330b.equals(this.f11330b);
        }

        public int hashCode() {
            return Objects.hash(this.f11329a, this.f11330b);
        }

        public String toString() {
            return this.f11329a.getSimpleName() + ", object identifier: " + this.f11330b;
        }
    }

    /* loaded from: classes2.dex */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private final Class<?> f11331a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<? extends q> f11332b;

        private d(Class<?> cls, Class<? extends q> cls2) {
            this.f11331a = cls;
            this.f11332b = cls2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f11331a.equals(this.f11331a) && dVar.f11332b.equals(this.f11332b);
        }

        public int hashCode() {
            return Objects.hash(this.f11331a, this.f11332b);
        }

        public String toString() {
            return this.f11331a.getSimpleName() + " with serialization type: " + this.f11332b.getSimpleName();
        }
    }

    private r(b bVar) {
        this.f11321a = new HashMap(bVar.f11325a);
        this.f11322b = new HashMap(bVar.f11326b);
        this.f11323c = new HashMap(bVar.f11327c);
        this.f11324d = new HashMap(bVar.f11328d);
    }

    public <SerializationT extends q> boolean e(SerializationT serializationt) {
        return this.f11322b.containsKey(new c(serializationt.getClass(), serializationt.a()));
    }

    public <SerializationT extends q> jb.g f(SerializationT serializationt, y yVar) {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.f11322b.containsKey(cVar)) {
            return this.f11322b.get(cVar).d(serializationt, yVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }
}
