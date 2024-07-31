package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.r;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import jb.u;
import jb.y;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    private static final i f11296b = new i();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<r> f11297a = new AtomicReference<>(new r.b().e());

    public static i a() {
        return f11296b;
    }

    public <SerializationT extends q> boolean b(SerializationT serializationt) {
        return this.f11297a.get().e(serializationt);
    }

    public <SerializationT extends q> jb.g c(SerializationT serializationt, y yVar) {
        return this.f11297a.get().f(serializationt, yVar);
    }

    public jb.g d(o oVar, y yVar) {
        if (yVar == null) {
            throw new NullPointerException("access cannot be null");
        }
        if (b(oVar)) {
            return c(oVar, yVar);
        }
        try {
            return new e(oVar, yVar);
        } catch (GeneralSecurityException e10) {
            throw new s("Creating a LegacyProtoKey failed", e10);
        }
    }

    public synchronized <SerializationT extends q> void e(b<SerializationT> bVar) {
        this.f11297a.set(new r.b(this.f11297a.get()).f(bVar).e());
    }

    public synchronized <KeyT extends jb.g, SerializationT extends q> void f(c<KeyT, SerializationT> cVar) {
        this.f11297a.set(new r.b(this.f11297a.get()).g(cVar).e());
    }

    public synchronized <SerializationT extends q> void g(j<SerializationT> jVar) {
        this.f11297a.set(new r.b(this.f11297a.get()).h(jVar).e());
    }

    public synchronized <ParametersT extends u, SerializationT extends q> void h(k<ParametersT, SerializationT> kVar) {
        this.f11297a.set(new r.b(this.f11297a.get()).i(kVar).e());
    }
}
