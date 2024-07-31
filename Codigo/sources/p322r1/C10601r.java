package p322r1;

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
import kotlin.jvm.internal.C9322n;
import p322r1.C10598o;
import p322r1.C10601r;
import p322r1.InterfaceC10593j;
import p322r1.InterfaceC10594k;

/* renamed from: r1.r */
/* loaded from: classes.dex */
public final class C10601r {

    /* renamed from: a */
    private final String f26732a;

    /* renamed from: b */
    private final C10598o f26733b;

    /* renamed from: c */
    private final Executor f26734c;

    /* renamed from: d */
    private final Context f26735d;

    /* renamed from: e */
    private int f26736e;

    /* renamed from: f */
    public C10598o.c f26737f;

    /* renamed from: g */
    private InterfaceC10594k f26738g;

    /* renamed from: h */
    private final InterfaceC10593j f26739h;

    /* renamed from: i */
    private final AtomicBoolean f26740i;

    /* renamed from: j */
    private final ServiceConnection f26741j;

    /* renamed from: k */
    private final Runnable f26742k;

    /* renamed from: l */
    private final Runnable f26743l;

    /* renamed from: r1.r$a */
    /* loaded from: classes.dex */
    public static final class a extends C10598o.c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // p322r1.C10598o.c
        /* renamed from: b */
        public boolean mo32219b() {
            return true;
        }

        @Override // p322r1.C10598o.c
        /* renamed from: c */
        public void mo32108c(Set<String> tables) {
            C9322n.m27781e(tables, "tables");
            if (C10601r.this.m32235j().get()) {
                return;
            }
            try {
                InterfaceC10594k m32233h = C10601r.this.m32233h();
                if (m32233h != null) {
                    int m32228c = C10601r.this.m32228c();
                    Object[] array = tables.toArray(new String[0]);
                    C9322n.m27779c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    m32233h.mo8110o0(m32228c, (String[]) array);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    /* renamed from: r1.r$b */
    /* loaded from: classes.dex */
    public static final class b extends InterfaceC10593j.a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h2 */
        public static final void m32239h2(C10601r this$0, String[] tables) {
            C9322n.m27781e(this$0, "this$0");
            C9322n.m27781e(tables, "$tables");
            this$0.m32230e().m32204l((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // p322r1.InterfaceC10593j
        /* renamed from: q */
        public void mo32182q(final String[] tables) {
            C9322n.m27781e(tables, "tables");
            Executor m32229d = C10601r.this.m32229d();
            final C10601r c10601r = C10601r.this;
            m32229d.execute(new Runnable() { // from class: r1.s
                @Override // java.lang.Runnable
                public final void run() {
                    C10601r.b.m32239h2(C10601r.this, tables);
                }
            });
        }
    }

    /* renamed from: r1.r$c */
    /* loaded from: classes.dex */
    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            C9322n.m27781e(name, "name");
            C9322n.m27781e(service, "service");
            C10601r.this.m32237m(InterfaceC10594k.a.m32184f2(service));
            C10601r.this.m32229d().execute(C10601r.this.m32234i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            C9322n.m27781e(name, "name");
            C10601r.this.m32229d().execute(C10601r.this.m32232g());
            C10601r.this.m32237m(null);
        }
    }

    public C10601r(Context context, String name, Intent serviceIntent, C10598o invalidationTracker, Executor executor) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(name, "name");
        C9322n.m27781e(serviceIntent, "serviceIntent");
        C9322n.m27781e(invalidationTracker, "invalidationTracker");
        C9322n.m27781e(executor, "executor");
        this.f26732a = name;
        this.f26733b = invalidationTracker;
        this.f26734c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f26735d = applicationContext;
        this.f26739h = new b();
        this.f26740i = new AtomicBoolean(false);
        c cVar = new c();
        this.f26741j = cVar;
        this.f26742k = new Runnable() { // from class: r1.p
            @Override // java.lang.Runnable
            public final void run() {
                C10601r.m32227n(C10601r.this);
            }
        };
        this.f26743l = new Runnable() { // from class: r1.q
            @Override // java.lang.Runnable
            public final void run() {
                C10601r.m32226k(C10601r.this);
            }
        };
        Object[] array = invalidationTracker.m32202j().keySet().toArray(new String[0]);
        C9322n.m27779c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        m32236l(new a((String[]) array));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m32226k(C10601r this$0) {
        C9322n.m27781e(this$0, "this$0");
        this$0.f26733b.m32207o(this$0.m32231f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m32227n(C10601r this$0) {
        C9322n.m27781e(this$0, "this$0");
        try {
            InterfaceC10594k interfaceC10594k = this$0.f26738g;
            if (interfaceC10594k != null) {
                this$0.f26736e = interfaceC10594k.mo8108M0(this$0.f26739h, this$0.f26732a);
                this$0.f26733b.m32194b(this$0.m32231f());
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    /* renamed from: c */
    public final int m32228c() {
        return this.f26736e;
    }

    /* renamed from: d */
    public final Executor m32229d() {
        return this.f26734c;
    }

    /* renamed from: e */
    public final C10598o m32230e() {
        return this.f26733b;
    }

    /* renamed from: f */
    public final C10598o.c m32231f() {
        C10598o.c cVar = this.f26737f;
        if (cVar != null) {
            return cVar;
        }
        C9322n.m27792p("observer");
        return null;
    }

    /* renamed from: g */
    public final Runnable m32232g() {
        return this.f26743l;
    }

    /* renamed from: h */
    public final InterfaceC10594k m32233h() {
        return this.f26738g;
    }

    /* renamed from: i */
    public final Runnable m32234i() {
        return this.f26742k;
    }

    /* renamed from: j */
    public final AtomicBoolean m32235j() {
        return this.f26740i;
    }

    /* renamed from: l */
    public final void m32236l(C10598o.c cVar) {
        C9322n.m27781e(cVar, "<set-?>");
        this.f26737f = cVar;
    }

    /* renamed from: m */
    public final void m32237m(InterfaceC10594k interfaceC10594k) {
        this.f26738g = interfaceC10594k;
    }
}
