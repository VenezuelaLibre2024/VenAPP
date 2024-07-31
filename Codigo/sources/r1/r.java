package r1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import r1.j;
import r1.k;
import r1.o;
import r1.r;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a */
    private final String f24618a;

    /* renamed from: b */
    private final o f24619b;

    /* renamed from: c */
    private final Executor f24620c;

    /* renamed from: d */
    private final Context f24621d;

    /* renamed from: e */
    private int f24622e;

    /* renamed from: f */
    public o.c f24623f;

    /* renamed from: g */
    private k f24624g;

    /* renamed from: h */
    private final j f24625h;

    /* renamed from: i */
    private final AtomicBoolean f24626i;

    /* renamed from: j */
    private final ServiceConnection f24627j;

    /* renamed from: k */
    private final Runnable f24628k;

    /* renamed from: l */
    private final Runnable f24629l;

    /* loaded from: classes.dex */
    public static final class a extends o.c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // r1.o.c
        public boolean b() {
            return true;
        }

        @Override // r1.o.c
        public void c(Set<String> tables) {
            kotlin.jvm.internal.n.e(tables, "tables");
            if (r.this.j().get()) {
                return;
            }
            try {
                k h10 = r.this.h();
                if (h10 != null) {
                    int c10 = r.this.c();
                    Object[] array = tables.toArray(new String[0]);
                    kotlin.jvm.internal.n.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    h10.o0(c10, (String[]) array);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j.a {
        b() {
        }

        public static final void h2(r this$0, String[] tables) {
            kotlin.jvm.internal.n.e(this$0, "this$0");
            kotlin.jvm.internal.n.e(tables, "$tables");
            this$0.e().l((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // r1.j
        public void q(String[] tables) {
            kotlin.jvm.internal.n.e(tables, "tables");
            r.this.d().execute(new Runnable() { // from class: r1.s

                /* renamed from: b */
                public final /* synthetic */ String[] f24634b;

                public /* synthetic */ s(String[] tables2) {
                    r2 = tables2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    r.b.h2(r.this, r2);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            kotlin.jvm.internal.n.e(name, "name");
            kotlin.jvm.internal.n.e(service, "service");
            r.this.m(k.a.f2(service));
            r.this.d().execute(r.this.i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            kotlin.jvm.internal.n.e(name, "name");
            r.this.d().execute(r.this.g());
            r.this.m(null);
        }
    }

    public r(Context context, String name, Intent serviceIntent, o invalidationTracker, Executor executor) {
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(name, "name");
        kotlin.jvm.internal.n.e(serviceIntent, "serviceIntent");
        kotlin.jvm.internal.n.e(invalidationTracker, "invalidationTracker");
        kotlin.jvm.internal.n.e(executor, "executor");
        this.f24618a = name;
        this.f24619b = invalidationTracker;
        this.f24620c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f24621d = applicationContext;
        this.f24625h = new b();
        this.f24626i = new AtomicBoolean(false);
        c cVar = new c();
        this.f24627j = cVar;
        this.f24628k = new Runnable() { // from class: r1.p
            public /* synthetic */ p() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                r.n(r.this);
            }
        };
        this.f24629l = new Runnable() { // from class: r1.q
            public /* synthetic */ q() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                r.k(r.this);
            }
        };
        Object[] array = invalidationTracker.j().keySet().toArray(new String[0]);
        kotlin.jvm.internal.n.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        l(new a((String[]) array));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    public static final void k(r this$0) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        this$0.f24619b.o(this$0.f());
    }

    public static final void n(r this$0) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        try {
            k kVar = this$0.f24624g;
            if (kVar != null) {
                this$0.f24622e = kVar.M0(this$0.f24625h, this$0.f24618a);
                this$0.f24619b.b(this$0.f());
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    public final int c() {
        return this.f24622e;
    }

    public final Executor d() {
        return this.f24620c;
    }

    public final o e() {
        return this.f24619b;
    }

    public final o.c f() {
        o.c cVar = this.f24623f;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.n.p("observer");
        return null;
    }

    public final Runnable g() {
        return this.f24629l;
    }

    public final k h() {
        return this.f24624g;
    }

    public final Runnable i() {
        return this.f24628k;
    }

    public final AtomicBoolean j() {
        return this.f24626i;
    }

    public final void l(o.c cVar) {
        kotlin.jvm.internal.n.e(cVar, "<set-?>");
        this.f24623f = cVar;
    }

    public final void m(k kVar) {
        this.f24624g = kVar;
    }
}
