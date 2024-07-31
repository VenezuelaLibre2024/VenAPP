package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f13029b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static i f13030c;

    /* renamed from: a, reason: collision with root package name */
    private pc.n f13031a;

    private i() {
    }

    public static i c() {
        i iVar;
        synchronized (f13029b) {
            com.google.android.gms.common.internal.s.o(f13030c != null, "MlKitContext has not been initialized");
            iVar = (i) com.google.android.gms.common.internal.s.j(f13030c);
        }
        return iVar;
    }

    public static i d(Context context) {
        i iVar;
        synchronized (f13029b) {
            com.google.android.gms.common.internal.s.o(f13030c == null, "MlKitContext is already initialized");
            i iVar2 = new i();
            f13030c = iVar2;
            Context e10 = e(context);
            pc.n e11 = pc.n.l(TaskExecutors.MAIN_THREAD).d(pc.f.c(e10, MlKitComponentDiscoveryService.class).b()).b(pc.c.s(e10, Context.class, new Class[0])).b(pc.c.s(iVar2, i.class, new Class[0])).e();
            iVar2.f13031a = e11;
            e11.o(true);
            iVar = f13030c;
        }
        return iVar;
    }

    private static Context e(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public <T> T a(Class<T> cls) {
        com.google.android.gms.common.internal.s.o(f13030c == this, "MlKitContext has been deleted");
        com.google.android.gms.common.internal.s.j(this.f13031a);
        return (T) this.f13031a.get(cls);
    }

    public Context b() {
        return (Context) a(Context.class);
    }
}
