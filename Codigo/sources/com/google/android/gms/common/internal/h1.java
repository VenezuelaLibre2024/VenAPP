package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class h1 {

    /* renamed from: a, reason: collision with root package name */
    private Object f9581a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9582b = false;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f9583c;

    public h1(c cVar, Object obj) {
        this.f9583c = cVar;
        this.f9581a = obj;
    }

    protected abstract void a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            obj = this.f9581a;
            if (this.f9582b) {
                Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                a(obj);
            } catch (RuntimeException e10) {
                throw e10;
            }
        }
        synchronized (this) {
            this.f9582b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f9581a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.f9583c.zzt;
        synchronized (arrayList) {
            arrayList2 = this.f9583c.zzt;
            arrayList2.remove(this);
        }
    }
}
