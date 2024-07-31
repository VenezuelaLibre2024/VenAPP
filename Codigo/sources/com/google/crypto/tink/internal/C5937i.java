package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.C5946r;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import p179jb.AbstractC9015g;
import p179jb.AbstractC9029u;
import p179jb.C9033y;

/* renamed from: com.google.crypto.tink.internal.i */
/* loaded from: classes2.dex */
public final class C5937i {

    /* renamed from: b */
    private static final C5937i f12511b = new C5937i();

    /* renamed from: a */
    private final AtomicReference<C5946r> f12512a = new AtomicReference<>(new C5946r.b().m15281e());

    /* renamed from: a */
    public static C5937i m15233a() {
        return f12511b;
    }

    /* renamed from: b */
    public <SerializationT extends InterfaceC5945q> boolean m15234b(SerializationT serializationt) {
        return this.f12512a.get().m15275e(serializationt);
    }

    /* renamed from: c */
    public <SerializationT extends InterfaceC5945q> AbstractC9015g m15235c(SerializationT serializationt, C9033y c9033y) {
        return this.f12512a.get().m15276f(serializationt, c9033y);
    }

    /* renamed from: d */
    public AbstractC9015g m15236d(C5943o c5943o, C9033y c9033y) {
        if (c9033y == null) {
            throw new NullPointerException("access cannot be null");
        }
        if (m15234b(c5943o)) {
            return m15235c(c5943o, c9033y);
        }
        try {
            return new C5933e(c5943o, c9033y);
        } catch (GeneralSecurityException e10) {
            throw new C5947s("Creating a LegacyProtoKey failed", e10);
        }
    }

    /* renamed from: e */
    public synchronized <SerializationT extends InterfaceC5945q> void m15237e(AbstractC5930b<SerializationT> abstractC5930b) {
        this.f12512a.set(new C5946r.b(this.f12512a.get()).m15282f(abstractC5930b).m15281e());
    }

    /* renamed from: f */
    public synchronized <KeyT extends AbstractC9015g, SerializationT extends InterfaceC5945q> void m15238f(AbstractC5931c<KeyT, SerializationT> abstractC5931c) {
        this.f12512a.set(new C5946r.b(this.f12512a.get()).m15283g(abstractC5931c).m15281e());
    }

    /* renamed from: g */
    public synchronized <SerializationT extends InterfaceC5945q> void m15239g(AbstractC5938j<SerializationT> abstractC5938j) {
        this.f12512a.set(new C5946r.b(this.f12512a.get()).m15284h(abstractC5938j).m15281e());
    }

    /* renamed from: h */
    public synchronized <ParametersT extends AbstractC9029u, SerializationT extends InterfaceC5945q> void m15240h(AbstractC5939k<ParametersT, SerializationT> abstractC5939k) {
        this.f12512a.set(new C5946r.b(this.f12512a.get()).m15285i(abstractC5939k).m15281e());
    }
}
