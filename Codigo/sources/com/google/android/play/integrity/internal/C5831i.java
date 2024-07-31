package com.google.android.play.integrity.internal;

/* renamed from: com.google.android.play.integrity.internal.i */
/* loaded from: classes2.dex */
public final class C5831i implements InterfaceC5839m {

    /* renamed from: c */
    private static final Object f12234c = new Object();

    /* renamed from: a */
    private volatile InterfaceC5839m f12235a;

    /* renamed from: b */
    private volatile Object f12236b = f12234c;

    private C5831i(InterfaceC5839m interfaceC5839m) {
        this.f12235a = interfaceC5839m;
    }

    /* renamed from: b */
    public static InterfaceC5839m m14688b(InterfaceC5839m interfaceC5839m) {
        return interfaceC5839m instanceof C5831i ? interfaceC5839m : new C5831i(interfaceC5839m);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5839m
    /* renamed from: a */
    public final Object mo14622a() {
        Object obj = this.f12236b;
        Object obj2 = f12234c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f12236b;
                if (obj == obj2) {
                    obj = this.f12235a.mo14622a();
                    Object obj3 = this.f12236b;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f12236b = obj;
                    this.f12235a = null;
                }
            }
        }
        return obj;
    }
}
