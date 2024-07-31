package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: o */
    private static final Map f10995o = new HashMap();

    /* renamed from: a */
    private final Context f10996a;

    /* renamed from: b */
    private final c0 f10997b;

    /* renamed from: c */
    private final String f10998c;

    /* renamed from: g */
    private boolean f11002g;

    /* renamed from: h */
    private final Intent f11003h;

    /* renamed from: i */
    private final j0 f11004i;

    /* renamed from: m */
    private ServiceConnection f11008m;

    /* renamed from: n */
    private IInterface f11009n;

    /* renamed from: d */
    private final List f10999d = new ArrayList();

    /* renamed from: e */
    private final Set f11000e = new HashSet();

    /* renamed from: f */
    private final Object f11001f = new Object();

    /* renamed from: k */
    private final IBinder.DeathRecipient f11006k = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.f0
        public /* synthetic */ f0() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            d.k(d.this);
        }
    };

    /* renamed from: l */
    private final AtomicInteger f11007l = new AtomicInteger(0);

    /* renamed from: j */
    private final WeakReference f11005j = new WeakReference(null);

    public d(Context context, c0 c0Var, String str, Intent intent, j0 j0Var, i0 i0Var) {
        this.f10996a = context;
        this.f10997b = c0Var;
        this.f10998c = str;
        this.f11003h = intent;
        this.f11004i = j0Var;
    }

    public static /* synthetic */ void k(d dVar) {
        dVar.f10997b.c("reportBinderDeath", new Object[0]);
        i0 i0Var = (i0) dVar.f11005j.get();
        if (i0Var != null) {
            dVar.f10997b.c("calling onBinderDied", new Object[0]);
            i0Var.a();
        } else {
            dVar.f10997b.c("%s : Binder has died.", dVar.f10998c);
            Iterator it = dVar.f10999d.iterator();
            while (it.hasNext()) {
                ((d0) it.next()).a(dVar.w());
            }
            dVar.f10999d.clear();
        }
        synchronized (dVar.f11001f) {
            dVar.x();
        }
    }

    public static /* bridge */ /* synthetic */ void o(d dVar, TaskCompletionSource taskCompletionSource) {
        dVar.f11000e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.e0

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f11012b;

            public /* synthetic */ e0(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                d.this.u(r2, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void q(d dVar, d0 d0Var) {
        if (dVar.f11009n != null || dVar.f11002g) {
            if (!dVar.f11002g) {
                d0Var.run();
                return;
            } else {
                dVar.f10997b.c("Waiting to bind to the service.", new Object[0]);
                dVar.f10999d.add(d0Var);
                return;
            }
        }
        dVar.f10997b.c("Initiate binding to the service.", new Object[0]);
        dVar.f10999d.add(d0Var);
        c cVar = new c(dVar, null);
        dVar.f11008m = cVar;
        dVar.f11002g = true;
        if (dVar.f10996a.bindService(dVar.f11003h, cVar, 1)) {
            return;
        }
        dVar.f10997b.c("Failed to bind to the service.", new Object[0]);
        dVar.f11002g = false;
        Iterator it = dVar.f10999d.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).a(new e());
        }
        dVar.f10999d.clear();
    }

    public static /* bridge */ /* synthetic */ void r(d dVar) {
        dVar.f10997b.c("linkToDeath", new Object[0]);
        try {
            dVar.f11009n.asBinder().linkToDeath(dVar.f11006k, 0);
        } catch (RemoteException e10) {
            dVar.f10997b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void s(d dVar) {
        dVar.f10997b.c("unlinkToDeath", new Object[0]);
        dVar.f11009n.asBinder().unlinkToDeath(dVar.f11006k, 0);
    }

    private final RemoteException w() {
        return new RemoteException(String.valueOf(this.f10998c).concat(" : Binder has died."));
    }

    public final void x() {
        Iterator it = this.f11000e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(w());
        }
        this.f11000e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f10995o;
        synchronized (map) {
            if (!map.containsKey(this.f10998c)) {
                HandlerThread handlerThread = new HandlerThread(this.f10998c, 10);
                handlerThread.start();
                map.put(this.f10998c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f10998c);
        }
        return handler;
    }

    public final IInterface e() {
        return this.f11009n;
    }

    public final void t(d0 d0Var, TaskCompletionSource taskCompletionSource) {
        c().post(new g0(this, d0Var.c(), taskCompletionSource, d0Var));
    }

    public final /* synthetic */ void u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f11001f) {
            this.f11000e.remove(taskCompletionSource);
        }
    }

    public final void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f11001f) {
            this.f11000e.remove(taskCompletionSource);
        }
        c().post(new h0(this));
    }
}
