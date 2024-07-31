package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class g implements Handler.Callback {
    public static final Status C = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status D = new Status(4, "The user must be signed in to make this API call.");
    private static final Object E = new Object();
    private static g F;
    private final Handler A;
    private volatile boolean B;

    /* renamed from: e */
    private com.google.android.gms.common.internal.w f9357e;

    /* renamed from: f */
    private com.google.android.gms.common.internal.y f9358f;

    /* renamed from: r */
    private final Context f9359r;

    /* renamed from: s */
    private final ca.f f9360s;

    /* renamed from: t */
    private final com.google.android.gms.common.internal.l0 f9361t;

    /* renamed from: a */
    private long f9353a = 5000;

    /* renamed from: b */
    private long f9354b = 120000;

    /* renamed from: c */
    private long f9355c = 10000;

    /* renamed from: d */
    private boolean f9356d = false;

    /* renamed from: u */
    private final AtomicInteger f9362u = new AtomicInteger(1);

    /* renamed from: v */
    private final AtomicInteger f9363v = new AtomicInteger(0);

    /* renamed from: w */
    private final Map f9364w = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: x */
    private c0 f9365x = null;

    /* renamed from: y */
    private final Set f9366y = new androidx.collection.b();

    /* renamed from: z */
    private final Set f9367z = new androidx.collection.b();

    private g(Context context, Looper looper, ca.f fVar) {
        this.B = true;
        this.f9359r = context;
        zau zauVar = new zau(looper, this);
        this.A = zauVar;
        this.f9360s = fVar;
        this.f9361t = new com.google.android.gms.common.internal.l0(fVar);
        if (la.j.a(context)) {
            this.B = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (E) {
            g gVar = F;
            if (gVar != null) {
                gVar.f9363v.incrementAndGet();
                Handler handler = gVar.A;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    public static Status i(b bVar, ca.b bVar2) {
        return new Status(bVar2, "API: " + bVar.b() + " is not available on this device. Connection failed with: " + String.valueOf(bVar2));
    }

    private final l0 j(com.google.android.gms.common.api.e eVar) {
        b apiKey = eVar.getApiKey();
        l0 l0Var = (l0) this.f9364w.get(apiKey);
        if (l0Var == null) {
            l0Var = new l0(this, eVar);
            this.f9364w.put(apiKey, l0Var);
        }
        if (l0Var.M()) {
            this.f9367z.add(apiKey);
        }
        l0Var.B();
        return l0Var;
    }

    private final com.google.android.gms.common.internal.y k() {
        if (this.f9358f == null) {
            this.f9358f = com.google.android.gms.common.internal.x.a(this.f9359r);
        }
        return this.f9358f;
    }

    private final void l() {
        com.google.android.gms.common.internal.w wVar = this.f9357e;
        if (wVar != null) {
            if (wVar.u1() > 0 || g()) {
                k().a(wVar);
            }
            this.f9357e = null;
        }
    }

    private final void m(TaskCompletionSource taskCompletionSource, int i10, com.google.android.gms.common.api.e eVar) {
        w0 a10;
        if (i10 == 0 || (a10 = w0.a(this, i10, eVar.getApiKey())) == null) {
            return;
        }
        Task task = taskCompletionSource.getTask();
        Handler handler = this.A;
        handler.getClass();
        task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.f0

            /* renamed from: a */
            public final /* synthetic */ Handler f9352a;

            public /* synthetic */ f0(Handler handler2) {
                r1 = handler2;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                r1.post(runnable);
            }
        }, a10);
    }

    public static g y(Context context) {
        g gVar;
        synchronized (E) {
            if (F == null) {
                F = new g(context.getApplicationContext(), com.google.android.gms.common.internal.i.d().getLooper(), ca.f.n());
            }
            gVar = F;
        }
        return gVar;
    }

    public final Task A(com.google.android.gms.common.api.e eVar) {
        d0 d0Var = new d0(eVar.getApiKey());
        Handler handler = this.A;
        handler.sendMessage(handler.obtainMessage(14, d0Var));
        return d0Var.b().getTask();
    }

    public final Task B(com.google.android.gms.common.api.e eVar, p pVar, y yVar, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m(taskCompletionSource, pVar.e(), eVar);
        v1 v1Var = new v1(new b1(pVar, yVar, runnable), taskCompletionSource);
        Handler handler = this.A;
        handler.sendMessage(handler.obtainMessage(8, new a1(v1Var, this.f9363v.get(), eVar)));
        return taskCompletionSource.getTask();
    }

    public final Task C(com.google.android.gms.common.api.e eVar, k.a aVar, int i10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m(taskCompletionSource, i10, eVar);
        x1 x1Var = new x1(aVar, taskCompletionSource);
        Handler handler = this.A;
        handler.sendMessage(handler.obtainMessage(13, new a1(x1Var, this.f9363v.get(), eVar)));
        return taskCompletionSource.getTask();
    }

    public final void H(com.google.android.gms.common.api.e eVar, int i10, d dVar) {
        u1 u1Var = new u1(i10, dVar);
        Handler handler = this.A;
        handler.sendMessage(handler.obtainMessage(4, new a1(u1Var, this.f9363v.get(), eVar)));
    }

    public final void I(com.google.android.gms.common.api.e eVar, int i10, w wVar, TaskCompletionSource taskCompletionSource, u uVar) {
        m(taskCompletionSource, wVar.d(), eVar);
        w1 w1Var = new w1(i10, wVar, taskCompletionSource, uVar);
        Handler handler = this.A;
        handler.sendMessage(handler.obtainMessage(4, new a1(w1Var, this.f9363v.get(), eVar)));
    }

    public final void J(com.google.android.gms.common.internal.p pVar, int i10, long j10, int i11) {
        Handler handler = this.A;
        handler.sendMessage(handler.obtainMessage(18, new x0(pVar, i10, j10, i11)));
    }

    public final void K(ca.b bVar, int i10) {
        if (h(bVar, i10)) {
            return;
        }
        Handler handler = this.A;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, bVar));
    }

    public final void b() {
        Handler handler = this.A;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void c(com.google.android.gms.common.api.e eVar) {
        Handler handler = this.A;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void d(c0 c0Var) {
        synchronized (E) {
            if (this.f9365x != c0Var) {
                this.f9365x = c0Var;
                this.f9366y.clear();
            }
            this.f9366y.addAll(c0Var.i());
        }
    }

    public final void e(c0 c0Var) {
        synchronized (E) {
            if (this.f9365x == c0Var) {
                this.f9365x = null;
                this.f9366y.clear();
            }
        }
    }

    public final boolean g() {
        if (this.f9356d) {
            return false;
        }
        com.google.android.gms.common.internal.u a10 = com.google.android.gms.common.internal.t.b().a();
        if (a10 != null && !a10.w1()) {
            return false;
        }
        int a11 = this.f9361t.a(this.f9359r, 203400000);
        return a11 == -1 || a11 == 0;
    }

    public final boolean h(ca.b bVar, int i10) {
        return this.f9360s.x(this.f9359r, bVar, i10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        b bVar;
        boolean n10;
        TaskCompletionSource b10;
        Boolean valueOf;
        b bVar2;
        b bVar3;
        b bVar4;
        b bVar5;
        int i10 = message.what;
        l0 l0Var = null;
        switch (i10) {
            case 1:
                this.f9355c = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.A.removeMessages(12);
                for (b bVar6 : this.f9364w.keySet()) {
                    Handler handler = this.A;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar6), this.f9355c);
                }
                return true;
            case 2:
                z1 z1Var = (z1) message.obj;
                Iterator it = z1Var.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        b bVar7 = (b) it.next();
                        l0 l0Var2 = (l0) this.f9364w.get(bVar7);
                        if (l0Var2 == null) {
                            z1Var.b(bVar7, new ca.b(13), null);
                        } else if (l0Var2.L()) {
                            z1Var.b(bVar7, ca.b.f6941e, l0Var2.s().getEndpointPackageName());
                        } else {
                            ca.b q10 = l0Var2.q();
                            if (q10 != null) {
                                z1Var.b(bVar7, q10, null);
                            } else {
                                l0Var2.G(z1Var);
                                l0Var2.B();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (l0 l0Var3 : this.f9364w.values()) {
                    l0Var3.A();
                    l0Var3.B();
                }
                return true;
            case 4:
            case 8:
            case 13:
                a1 a1Var = (a1) message.obj;
                l0 l0Var4 = (l0) this.f9364w.get(a1Var.f9319c.getApiKey());
                if (l0Var4 == null) {
                    l0Var4 = j(a1Var.f9319c);
                }
                if (!l0Var4.M() || this.f9363v.get() == a1Var.f9318b) {
                    l0Var4.C(a1Var.f9317a);
                } else {
                    a1Var.f9317a.a(C);
                    l0Var4.I();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                ca.b bVar8 = (ca.b) message.obj;
                Iterator it2 = this.f9364w.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        l0 l0Var5 = (l0) it2.next();
                        if (l0Var5.o() == i11) {
                            l0Var = l0Var5;
                        }
                    }
                }
                if (l0Var == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (bVar8.u1() == 13) {
                    l0Var.d(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f9360s.e(bVar8.u1()) + ": " + bVar8.v1()));
                } else {
                    bVar = l0Var.f9402c;
                    l0Var.d(i(bVar, bVar8));
                }
                return true;
            case 6:
                if (this.f9359r.getApplicationContext() instanceof Application) {
                    c.c((Application) this.f9359r.getApplicationContext());
                    c.b().a(new g0(this));
                    if (!c.b().e(true)) {
                        this.f9355c = 300000L;
                    }
                }
                return true;
            case 7:
                j((com.google.android.gms.common.api.e) message.obj);
                return true;
            case 9:
                if (this.f9364w.containsKey(message.obj)) {
                    ((l0) this.f9364w.get(message.obj)).H();
                }
                return true;
            case 10:
                Iterator it3 = this.f9367z.iterator();
                while (it3.hasNext()) {
                    l0 l0Var6 = (l0) this.f9364w.remove((b) it3.next());
                    if (l0Var6 != null) {
                        l0Var6.I();
                    }
                }
                this.f9367z.clear();
                return true;
            case 11:
                if (this.f9364w.containsKey(message.obj)) {
                    ((l0) this.f9364w.get(message.obj)).J();
                }
                return true;
            case 12:
                if (this.f9364w.containsKey(message.obj)) {
                    ((l0) this.f9364w.get(message.obj)).a();
                }
                return true;
            case 14:
                d0 d0Var = (d0) message.obj;
                b a10 = d0Var.a();
                if (this.f9364w.containsKey(a10)) {
                    n10 = ((l0) this.f9364w.get(a10)).n(false);
                    b10 = d0Var.b();
                    valueOf = Boolean.valueOf(n10);
                } else {
                    b10 = d0Var.b();
                    valueOf = Boolean.FALSE;
                }
                b10.setResult(valueOf);
                return true;
            case 15:
                n0 n0Var = (n0) message.obj;
                Map map = this.f9364w;
                bVar2 = n0Var.f9432a;
                if (map.containsKey(bVar2)) {
                    Map map2 = this.f9364w;
                    bVar3 = n0Var.f9432a;
                    l0.y((l0) map2.get(bVar3), n0Var);
                }
                return true;
            case 16:
                n0 n0Var2 = (n0) message.obj;
                Map map3 = this.f9364w;
                bVar4 = n0Var2.f9432a;
                if (map3.containsKey(bVar4)) {
                    Map map4 = this.f9364w;
                    bVar5 = n0Var2.f9432a;
                    l0.z((l0) map4.get(bVar5), n0Var2);
                }
                return true;
            case 17:
                l();
                return true;
            case 18:
                x0 x0Var = (x0) message.obj;
                if (x0Var.f9496c == 0) {
                    k().a(new com.google.android.gms.common.internal.w(x0Var.f9495b, Arrays.asList(x0Var.f9494a)));
                } else {
                    com.google.android.gms.common.internal.w wVar = this.f9357e;
                    if (wVar != null) {
                        List v12 = wVar.v1();
                        if (wVar.u1() != x0Var.f9495b || (v12 != null && v12.size() >= x0Var.f9497d)) {
                            this.A.removeMessages(17);
                            l();
                        } else {
                            this.f9357e.w1(x0Var.f9494a);
                        }
                    }
                    if (this.f9357e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(x0Var.f9494a);
                        this.f9357e = new com.google.android.gms.common.internal.w(x0Var.f9495b, arrayList);
                        Handler handler2 = this.A;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), x0Var.f9496c);
                    }
                }
                return true;
            case 19:
                this.f9356d = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    public final int n() {
        return this.f9362u.getAndIncrement();
    }

    public final l0 x(b bVar) {
        return (l0) this.f9364w.get(bVar);
    }
}
