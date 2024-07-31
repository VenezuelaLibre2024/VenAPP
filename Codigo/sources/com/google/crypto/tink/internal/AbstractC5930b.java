package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.InterfaceC5945q;
import p179jb.AbstractC9015g;
import p179jb.C9033y;
import p441xb.C12413a;

/* renamed from: com.google.crypto.tink.internal.b */
/* loaded from: classes2.dex */
public abstract class AbstractC5930b<SerializationT extends InterfaceC5945q> {

    /* renamed from: a */
    private final C12413a f12489a;

    /* renamed from: b */
    private final Class<SerializationT> f12490b;

    /* renamed from: com.google.crypto.tink.internal.b$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5930b<SerializationT> {

        /* renamed from: c */
        final /* synthetic */ b f12491c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C12413a c12413a, Class cls, b bVar) {
            super(c12413a, cls, null);
            this.f12491c = bVar;
        }

        @Override // com.google.crypto.tink.internal.AbstractC5930b
        /* renamed from: d */
        public AbstractC9015g mo15198d(SerializationT serializationt, C9033y c9033y) {
            return this.f12491c.mo15199a(serializationt, c9033y);
        }
    }

    /* renamed from: com.google.crypto.tink.internal.b$b */
    /* loaded from: classes2.dex */
    public interface b<SerializationT extends InterfaceC5945q> {
        /* renamed from: a */
        AbstractC9015g mo15199a(SerializationT serializationt, C9033y c9033y);
    }

    private AbstractC5930b(C12413a c12413a, Class<SerializationT> cls) {
        this.f12489a = c12413a;
        this.f12490b = cls;
    }

    /* synthetic */ AbstractC5930b(C12413a c12413a, Class cls, a aVar) {
        this(c12413a, cls);
    }

    /* renamed from: a */
    public static <SerializationT extends InterfaceC5945q> AbstractC5930b<SerializationT> m15195a(b<SerializationT> bVar, C12413a c12413a, Class<SerializationT> cls) {
        return new a(c12413a, cls, bVar);
    }

    /* renamed from: b */
    public final C12413a m15196b() {
        return this.f12489a;
    }

    /* renamed from: c */
    public final Class<SerializationT> m15197c() {
        return this.f12490b;
    }

    /* renamed from: d */
    public abstract AbstractC9015g mo15198d(SerializationT serializationt, C9033y c9033y);
}
