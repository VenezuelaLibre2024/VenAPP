package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import p294pc.C10132c;
import p294pc.C10138f;
import p294pc.C10147n;

/* renamed from: com.google.mlkit.common.sdkinternal.i */
/* loaded from: classes2.dex */
public class C6524i {

    /* renamed from: b */
    private static final Object f14303b = new Object();

    /* renamed from: c */
    private static C6524i f14304c;

    /* renamed from: a */
    private C10147n f14305a;

    private C6524i() {
    }

    /* renamed from: c */
    public static C6524i m18312c() {
        C6524i c6524i;
        synchronized (f14303b) {
            C5276s.m13329o(f14304c != null, "MlKitContext has not been initialized");
            c6524i = (C6524i) C5276s.m13324j(f14304c);
        }
        return c6524i;
    }

    /* renamed from: d */
    public static C6524i m18313d(Context context) {
        C6524i c6524i;
        synchronized (f14303b) {
            C5276s.m13329o(f14304c == null, "MlKitContext is already initialized");
            C6524i c6524i2 = new C6524i();
            f14304c = c6524i2;
            Context m18314e = m18314e(context);
            C10147n m30336e = C10147n.m30319l(TaskExecutors.MAIN_THREAD).m30335d(C10138f.m30309c(m18314e, MlKitComponentDiscoveryService.class).m30312b()).m30333b(C10132c.m30265s(m18314e, Context.class, new Class[0])).m30333b(C10132c.m30265s(c6524i2, C6524i.class, new Class[0])).m30336e();
            c6524i2.f14305a = m30336e;
            m30336e.m30330o(true);
            c6524i = f14304c;
        }
        return c6524i;
    }

    /* renamed from: e */
    private static Context m18314e(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    /* renamed from: a */
    public <T> T m18315a(Class<T> cls) {
        C5276s.m13329o(f14304c == this, "MlKitContext has been deleted");
        C5276s.m13324j(this.f14305a);
        return (T) this.f14305a.get(cls);
    }

    /* renamed from: b */
    public Context m18316b() {
        return (Context) m18315a(Context.class);
    }
}
