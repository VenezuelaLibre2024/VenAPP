package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.InterfaceC5945q;
import p179jb.AbstractC9015g;

/* renamed from: com.google.crypto.tink.internal.c */
/* loaded from: classes2.dex */
public abstract class AbstractC5931c<KeyT extends AbstractC9015g, SerializationT extends InterfaceC5945q> {

    /* renamed from: a */
    private final Class<KeyT> f12492a;

    /* renamed from: b */
    private final Class<SerializationT> f12493b;

    /* renamed from: com.google.crypto.tink.internal.c$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5931c<KeyT, SerializationT> {

        /* renamed from: c */
        final /* synthetic */ b f12494c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f12494c = bVar;
        }
    }

    /* renamed from: com.google.crypto.tink.internal.c$b */
    /* loaded from: classes2.dex */
    public interface b<KeyT extends AbstractC9015g, SerializationT extends InterfaceC5945q> {
    }

    private AbstractC5931c(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.f12492a = cls;
        this.f12493b = cls2;
    }

    /* synthetic */ AbstractC5931c(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    /* renamed from: a */
    public static <KeyT extends AbstractC9015g, SerializationT extends InterfaceC5945q> AbstractC5931c<KeyT, SerializationT> m15200a(b<KeyT, SerializationT> bVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    /* renamed from: b */
    public Class<KeyT> m15201b() {
        return this.f12492a;
    }

    /* renamed from: c */
    public Class<SerializationT> m15202c() {
        return this.f12493b;
    }
}
