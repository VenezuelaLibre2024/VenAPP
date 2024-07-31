package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.InterfaceC5945q;
import p441xb.C12413a;

/* renamed from: com.google.crypto.tink.internal.j */
/* loaded from: classes2.dex */
public abstract class AbstractC5938j<SerializationT extends InterfaceC5945q> {

    /* renamed from: a */
    private final C12413a f12513a;

    /* renamed from: b */
    private final Class<SerializationT> f12514b;

    /* renamed from: com.google.crypto.tink.internal.j$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5938j<SerializationT> {

        /* renamed from: c */
        final /* synthetic */ b f12515c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C12413a c12413a, Class cls, b bVar) {
            super(c12413a, cls, null);
            this.f12515c = bVar;
        }
    }

    /* renamed from: com.google.crypto.tink.internal.j$b */
    /* loaded from: classes2.dex */
    public interface b<SerializationT extends InterfaceC5945q> {
    }

    private AbstractC5938j(C12413a c12413a, Class<SerializationT> cls) {
        this.f12513a = c12413a;
        this.f12514b = cls;
    }

    /* synthetic */ AbstractC5938j(C12413a c12413a, Class cls, a aVar) {
        this(c12413a, cls);
    }

    /* renamed from: a */
    public static <SerializationT extends InterfaceC5945q> AbstractC5938j<SerializationT> m15241a(b<SerializationT> bVar, C12413a c12413a, Class<SerializationT> cls) {
        return new a(c12413a, cls, bVar);
    }

    /* renamed from: b */
    public final C12413a m15242b() {
        return this.f12513a;
    }

    /* renamed from: c */
    public final Class<SerializationT> m15243c() {
        return this.f12514b;
    }
}
