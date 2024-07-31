package com.google.android.play.integrity.internal;

/* loaded from: classes2.dex */
public final class i implements m {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f11019c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile m f11020a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f11021b = f11019c;

    private i(m mVar) {
        this.f11020a = mVar;
    }

    public static m b(m mVar) {
        return mVar instanceof i ? mVar : new i(mVar);
    }

    @Override // com.google.android.play.integrity.internal.m
    public final Object a() {
        Object obj = this.f11021b;
        Object obj2 = f11019c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f11021b;
                if (obj == obj2) {
                    obj = this.f11020a.a();
                    Object obj3 = this.f11021b;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f11021b = obj;
                    this.f11020a = null;
                }
            }
        }
        return obj;
    }
}
