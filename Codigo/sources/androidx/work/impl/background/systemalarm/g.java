package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.r;
import androidx.work.impl.w;
import f2.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import k2.m;
import l2.e0;
import l2.y;

/* loaded from: classes.dex */
public class g implements androidx.work.impl.e {

    /* renamed from: v, reason: collision with root package name */
    static final String f5769v = j.i("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    final Context f5770a;

    /* renamed from: b, reason: collision with root package name */
    final m2.b f5771b;

    /* renamed from: c, reason: collision with root package name */
    private final e0 f5772c;

    /* renamed from: d, reason: collision with root package name */
    private final r f5773d;

    /* renamed from: e, reason: collision with root package name */
    private final androidx.work.impl.e0 f5774e;

    /* renamed from: f, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f5775f;

    /* renamed from: r, reason: collision with root package name */
    final List<Intent> f5776r;

    /* renamed from: s, reason: collision with root package name */
    Intent f5777s;

    /* renamed from: t, reason: collision with root package name */
    private c f5778t;

    /* renamed from: u, reason: collision with root package name */
    private w f5779u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor a10;
            d dVar;
            synchronized (g.this.f5776r) {
                g gVar = g.this;
                gVar.f5777s = gVar.f5776r.get(0);
            }
            Intent intent = g.this.f5777s;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = g.this.f5777s.getIntExtra("KEY_START_ID", 0);
                j e10 = j.e();
                String str = g.f5769v;
                e10.a(str, "Processing command " + g.this.f5777s + ", " + intExtra);
                PowerManager.WakeLock b10 = y.b(g.this.f5770a, action + " (" + intExtra + ")");
                try {
                    j.e().a(str, "Acquiring operation wake lock (" + action + ") " + b10);
                    b10.acquire();
                    g gVar2 = g.this;
                    gVar2.f5775f.o(gVar2.f5777s, intExtra, gVar2);
                    j.e().a(str, "Releasing operation wake lock (" + action + ") " + b10);
                    b10.release();
                    a10 = g.this.f5771b.a();
                    dVar = new d(g.this);
                } catch (Throwable th2) {
                    try {
                        j e11 = j.e();
                        String str2 = g.f5769v;
                        e11.d(str2, "Unexpected error in onHandleIntent", th2);
                        j.e().a(str2, "Releasing operation wake lock (" + action + ") " + b10);
                        b10.release();
                        a10 = g.this.f5771b.a();
                        dVar = new d(g.this);
                    } catch (Throwable th3) {
                        j.e().a(g.f5769v, "Releasing operation wake lock (" + action + ") " + b10);
                        b10.release();
                        g.this.f5771b.a().execute(new d(g.this));
                        throw th3;
                    }
                }
                a10.execute(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final g f5781a;

        /* renamed from: b, reason: collision with root package name */
        private final Intent f5782b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5783c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(g gVar, Intent intent, int i10) {
            this.f5781a = gVar;
            this.f5782b = intent;
            this.f5783c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5781a.a(this.f5782b, this.f5783c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        void b();
    }

    /* loaded from: classes.dex */
    static class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final g f5784a;

        d(g gVar) {
            this.f5784a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5784a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Context context) {
        this(context, null, null);
    }

    g(Context context, r rVar, androidx.work.impl.e0 e0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f5770a = applicationContext;
        this.f5779u = new w();
        this.f5775f = new androidx.work.impl.background.systemalarm.b(applicationContext, this.f5779u);
        e0Var = e0Var == null ? androidx.work.impl.e0.m(context) : e0Var;
        this.f5774e = e0Var;
        this.f5772c = new e0(e0Var.k().k());
        rVar = rVar == null ? e0Var.o() : rVar;
        this.f5773d = rVar;
        this.f5771b = e0Var.s();
        rVar.g(this);
        this.f5776r = new ArrayList();
        this.f5777s = null;
    }

    private void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.f5776r) {
            Iterator<Intent> it = this.f5776r.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void k() {
        b();
        PowerManager.WakeLock b10 = y.b(this.f5770a, "ProcessCommand");
        try {
            b10.acquire();
            this.f5774e.s().c(new a());
        } finally {
            b10.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        j e10 = j.e();
        String str = f5769v;
        e10.a(str, "Adding command " + intent + " (" + i10 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            j.e().k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f5776r) {
            boolean z10 = this.f5776r.isEmpty() ? false : true;
            this.f5776r.add(intent);
            if (!z10) {
                k();
            }
        }
        return true;
    }

    void c() {
        j e10 = j.e();
        String str = f5769v;
        e10.a(str, "Checking if commands are complete.");
        b();
        synchronized (this.f5776r) {
            if (this.f5777s != null) {
                j.e().a(str, "Removing command " + this.f5777s);
                if (!this.f5776r.remove(0).equals(this.f5777s)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.f5777s = null;
            }
            m2.a b10 = this.f5771b.b();
            if (!this.f5775f.n() && this.f5776r.isEmpty() && !b10.a0()) {
                j.e().a(str, "No more commands & intents.");
                c cVar = this.f5778t;
                if (cVar != null) {
                    cVar.b();
                }
            } else if (!this.f5776r.isEmpty()) {
                k();
            }
        }
    }

    @Override // androidx.work.impl.e
    /* renamed from: d */
    public void l(m mVar, boolean z10) {
        this.f5771b.a().execute(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f5770a, mVar, z10), 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r e() {
        return this.f5773d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m2.b f() {
        return this.f5771b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.work.impl.e0 g() {
        return this.f5774e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0 h() {
        return this.f5772c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        j.e().a(f5769v, "Destroying SystemAlarmDispatcher");
        this.f5773d.n(this);
        this.f5778t = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(c cVar) {
        if (this.f5778t != null) {
            j.e().c(f5769v, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f5778t = cVar;
        }
    }
}
