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

/* renamed from: com.google.android.play.integrity.internal.d */
/* loaded from: classes2.dex */
public final class C5821d {

    /* renamed from: o */
    private static final Map f12210o = new HashMap();

    /* renamed from: a */
    private final Context f12211a;

    /* renamed from: b */
    private final C5820c0 f12212b;

    /* renamed from: c */
    private final String f12213c;

    /* renamed from: g */
    private boolean f12217g;

    /* renamed from: h */
    private final Intent f12218h;

    /* renamed from: i */
    private final InterfaceC5834j0 f12219i;

    /* renamed from: m */
    private ServiceConnection f12223m;

    /* renamed from: n */
    private IInterface f12224n;

    /* renamed from: d */
    private final List f12214d = new ArrayList();

    /* renamed from: e */
    private final Set f12215e = new HashSet();

    /* renamed from: f */
    private final Object f12216f = new Object();

    /* renamed from: k */
    private final IBinder.DeathRecipient f12221k = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.f0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C5821d.m14668k(C5821d.this);
        }
    };

    /* renamed from: l */
    private final AtomicInteger f12222l = new AtomicInteger(0);

    /* renamed from: j */
    private final WeakReference f12220j = new WeakReference(null);

    public C5821d(Context context, C5820c0 c5820c0, String str, Intent intent, InterfaceC5834j0 interfaceC5834j0, InterfaceC5832i0 interfaceC5832i0) {
        this.f12211a = context;
        this.f12212b = c5820c0;
        this.f12213c = str;
        this.f12218h = intent;
        this.f12219i = interfaceC5834j0;
    }

    /* renamed from: k */
    public static /* synthetic */ void m14668k(C5821d c5821d) {
        c5821d.f12212b.m14658c("reportBinderDeath", new Object[0]);
        InterfaceC5832i0 interfaceC5832i0 = (InterfaceC5832i0) c5821d.f12220j.get();
        if (interfaceC5832i0 != null) {
            c5821d.f12212b.m14658c("calling onBinderDied", new Object[0]);
            interfaceC5832i0.m14689a();
        } else {
            c5821d.f12212b.m14658c("%s : Binder has died.", c5821d.f12213c);
            Iterator it = c5821d.f12214d.iterator();
            while (it.hasNext()) {
                ((AbstractRunnableC5822d0) it.next()).mo14616a(c5821d.m14677w());
            }
            c5821d.f12214d.clear();
        }
        synchronized (c5821d.f12216f) {
            c5821d.m14678x();
        }
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m14672o(C5821d c5821d, final TaskCompletionSource taskCompletionSource) {
        c5821d.f12215e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.e0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C5821d.this.m14682u(taskCompletionSource, task);
            }
        });
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m14674q(C5821d c5821d, AbstractRunnableC5822d0 abstractRunnableC5822d0) {
        if (c5821d.f12224n != null || c5821d.f12217g) {
            if (!c5821d.f12217g) {
                abstractRunnableC5822d0.run();
                return;
            } else {
                c5821d.f12212b.m14658c("Waiting to bind to the service.", new Object[0]);
                c5821d.f12214d.add(abstractRunnableC5822d0);
                return;
            }
        }
        c5821d.f12212b.m14658c("Initiate binding to the service.", new Object[0]);
        c5821d.f12214d.add(abstractRunnableC5822d0);
        ServiceConnectionC5819c serviceConnectionC5819c = new ServiceConnectionC5819c(c5821d, null);
        c5821d.f12223m = serviceConnectionC5819c;
        c5821d.f12217g = true;
        if (c5821d.f12211a.bindService(c5821d.f12218h, serviceConnectionC5819c, 1)) {
            return;
        }
        c5821d.f12212b.m14658c("Failed to bind to the service.", new Object[0]);
        c5821d.f12217g = false;
        Iterator it = c5821d.f12214d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC5822d0) it.next()).mo14616a(new C5823e());
        }
        c5821d.f12214d.clear();
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m14675r(C5821d c5821d) {
        c5821d.f12212b.m14658c("linkToDeath", new Object[0]);
        try {
            c5821d.f12224n.asBinder().linkToDeath(c5821d.f12221k, 0);
        } catch (RemoteException e10) {
            c5821d.f12212b.m14657b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: s */
    public static /* bridge */ /* synthetic */ void m14676s(C5821d c5821d) {
        c5821d.f12212b.m14658c("unlinkToDeath", new Object[0]);
        c5821d.f12224n.asBinder().unlinkToDeath(c5821d.f12221k, 0);
    }

    /* renamed from: w */
    private final RemoteException m14677w() {
        return new RemoteException(String.valueOf(this.f12213c).concat(" : Binder has died."));
    }

    /* renamed from: x */
    public final void m14678x() {
        Iterator it = this.f12215e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(m14677w());
        }
        this.f12215e.clear();
    }

    /* renamed from: c */
    public final Handler m14679c() {
        Handler handler;
        Map map = f12210o;
        synchronized (map) {
            if (!map.containsKey(this.f12213c)) {
                HandlerThread handlerThread = new HandlerThread(this.f12213c, 10);
                handlerThread.start();
                map.put(this.f12213c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f12213c);
        }
        return handler;
    }

    /* renamed from: e */
    public final IInterface m14680e() {
        return this.f12224n;
    }

    /* renamed from: t */
    public final void m14681t(AbstractRunnableC5822d0 abstractRunnableC5822d0, TaskCompletionSource taskCompletionSource) {
        m14679c().post(new C5828g0(this, abstractRunnableC5822d0.m14684c(), taskCompletionSource, abstractRunnableC5822d0));
    }

    /* renamed from: u */
    public final /* synthetic */ void m14682u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f12216f) {
            this.f12215e.remove(taskCompletionSource);
        }
    }

    /* renamed from: v */
    public final void m14683v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f12216f) {
            this.f12215e.remove(taskCompletionSource);
        }
        m14679c().post(new C5830h0(this));
    }
}
