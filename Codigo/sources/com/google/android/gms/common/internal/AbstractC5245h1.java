package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.h1 */
/* loaded from: classes.dex */
public abstract class AbstractC5245h1 {

    /* renamed from: a */
    private Object f10696a;

    /* renamed from: b */
    private boolean f10697b = false;

    /* renamed from: c */
    final /* synthetic */ AbstractC5228c f10698c;

    public AbstractC5245h1(AbstractC5228c abstractC5228c, Object obj) {
        this.f10698c = abstractC5228c;
        this.f10696a = obj;
    }

    /* renamed from: a */
    protected abstract void mo13265a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo13266b();

    /* renamed from: c */
    public final void m13267c() {
        Object obj;
        synchronized (this) {
            obj = this.f10696a;
            if (this.f10697b) {
                Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                mo13265a(obj);
            } catch (RuntimeException e10) {
                throw e10;
            }
        }
        synchronized (this) {
            this.f10697b = true;
        }
        m13269e();
    }

    /* renamed from: d */
    public final void m13268d() {
        synchronized (this) {
            this.f10696a = null;
        }
    }

    /* renamed from: e */
    public final void m13269e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m13268d();
        arrayList = this.f10698c.zzt;
        synchronized (arrayList) {
            arrayList2 = this.f10698c.zzt;
            arrayList2.remove(this);
        }
    }
}
