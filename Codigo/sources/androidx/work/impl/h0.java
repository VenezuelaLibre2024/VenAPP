package androidx.work.impl;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import f2.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class h0 implements Runnable {
    static final String D = f2.j.i("WorkerWrapper");
    private volatile boolean C;

    /* renamed from: a, reason: collision with root package name */
    Context f5849a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5850b;

    /* renamed from: c, reason: collision with root package name */
    private List<t> f5851c;

    /* renamed from: d, reason: collision with root package name */
    private WorkerParameters.a f5852d;

    /* renamed from: e, reason: collision with root package name */
    k2.u f5853e;

    /* renamed from: f, reason: collision with root package name */
    androidx.work.c f5854f;

    /* renamed from: r, reason: collision with root package name */
    m2.b f5855r;

    /* renamed from: t, reason: collision with root package name */
    private androidx.work.a f5857t;

    /* renamed from: u, reason: collision with root package name */
    private androidx.work.impl.foreground.a f5858u;

    /* renamed from: v, reason: collision with root package name */
    private WorkDatabase f5859v;

    /* renamed from: w, reason: collision with root package name */
    private k2.v f5860w;

    /* renamed from: x, reason: collision with root package name */
    private k2.b f5861x;

    /* renamed from: y, reason: collision with root package name */
    private List<String> f5862y;

    /* renamed from: z, reason: collision with root package name */
    private String f5863z;

    /* renamed from: s, reason: collision with root package name */
    c.a f5856s = c.a.a();
    androidx.work.impl.utils.futures.c<Boolean> A = androidx.work.impl.utils.futures.c.s();
    final androidx.work.impl.utils.futures.c<c.a> B = androidx.work.impl.utils.futures.c.s();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.f f5864a;

        a(com.google.common.util.concurrent.f fVar) {
            this.f5864a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h0.this.B.isCancelled()) {
                return;
            }
            try {
                this.f5864a.get();
                f2.j.e().a(h0.D, "Starting work for " + h0.this.f5853e.f20225c);
                h0 h0Var = h0.this;
                h0Var.B.q(h0Var.f5854f.startWork());
            } catch (Throwable th2) {
                h0.this.B.p(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5866a;

        b(String str) {
            this.f5866a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    c.a aVar = h0.this.B.get();
                    if (aVar == null) {
                        f2.j.e().c(h0.D, h0.this.f5853e.f20225c + " returned a null result. Treating it as a failure.");
                    } else {
                        f2.j.e().a(h0.D, h0.this.f5853e.f20225c + " returned a " + aVar + ".");
                        h0.this.f5856s = aVar;
                    }
                } catch (InterruptedException e10) {
                    e = e10;
                    f2.j.e().d(h0.D, this.f5866a + " failed because it threw an exception/error", e);
                } catch (CancellationException e11) {
                    f2.j.e().g(h0.D, this.f5866a + " was cancelled", e11);
                } catch (ExecutionException e12) {
                    e = e12;
                    f2.j.e().d(h0.D, this.f5866a + " failed because it threw an exception/error", e);
                }
            } finally {
                h0.this.j();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        Context f5868a;

        /* renamed from: b, reason: collision with root package name */
        androidx.work.c f5869b;

        /* renamed from: c, reason: collision with root package name */
        androidx.work.impl.foreground.a f5870c;

        /* renamed from: d, reason: collision with root package name */
        m2.b f5871d;

        /* renamed from: e, reason: collision with root package name */
        androidx.work.a f5872e;

        /* renamed from: f, reason: collision with root package name */
        WorkDatabase f5873f;

        /* renamed from: g, reason: collision with root package name */
        k2.u f5874g;

        /* renamed from: h, reason: collision with root package name */
        List<t> f5875h;

        /* renamed from: i, reason: collision with root package name */
        private final List<String> f5876i;

        /* renamed from: j, reason: collision with root package name */
        WorkerParameters.a f5877j = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, m2.b bVar, androidx.work.impl.foreground.a aVar2, WorkDatabase workDatabase, k2.u uVar, List<String> list) {
            this.f5868a = context.getApplicationContext();
            this.f5871d = bVar;
            this.f5870c = aVar2;
            this.f5872e = aVar;
            this.f5873f = workDatabase;
            this.f5874g = uVar;
            this.f5876i = list;
        }

        public h0 b() {
            return new h0(this);
        }

        public c c(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f5877j = aVar;
            }
            return this;
        }

        public c d(List<t> list) {
            this.f5875h = list;
            return this;
        }
    }

    h0(c cVar) {
        this.f5849a = cVar.f5868a;
        this.f5855r = cVar.f5871d;
        this.f5858u = cVar.f5870c;
        k2.u uVar = cVar.f5874g;
        this.f5853e = uVar;
        this.f5850b = uVar.f20223a;
        this.f5851c = cVar.f5875h;
        this.f5852d = cVar.f5877j;
        this.f5854f = cVar.f5869b;
        this.f5857t = cVar.f5872e;
        WorkDatabase workDatabase = cVar.f5873f;
        this.f5859v = workDatabase;
        this.f5860w = workDatabase.J();
        this.f5861x = this.f5859v.E();
        this.f5862y = cVar.f5876i;
    }

    private String b(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f5850b);
        sb2.append(", tags={ ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    private void f(c.a aVar) {
        if (aVar instanceof c.a.C0094c) {
            f2.j.e().f(D, "Worker result SUCCESS for " + this.f5863z);
            if (!this.f5853e.j()) {
                q();
                return;
            }
        } else {
            if (aVar instanceof c.a.b) {
                f2.j.e().f(D, "Worker result RETRY for " + this.f5863z);
                k();
                return;
            }
            f2.j.e().f(D, "Worker result FAILURE for " + this.f5863z);
            if (!this.f5853e.j()) {
                p();
                return;
            }
        }
        l();
    }

    private void h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f5860w.g(str2) != s.a.CANCELLED) {
                this.f5860w.w(s.a.FAILED, str2);
            }
            linkedList.addAll(this.f5861x.a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(com.google.common.util.concurrent.f fVar) {
        if (this.B.isCancelled()) {
            fVar.cancel(true);
        }
    }

    private void k() {
        this.f5859v.e();
        try {
            this.f5860w.w(s.a.ENQUEUED, this.f5850b);
            this.f5860w.i(this.f5850b, System.currentTimeMillis());
            this.f5860w.n(this.f5850b, -1L);
            this.f5859v.B();
        } finally {
            this.f5859v.i();
            m(true);
        }
    }

    private void l() {
        this.f5859v.e();
        try {
            this.f5860w.i(this.f5850b, System.currentTimeMillis());
            this.f5860w.w(s.a.ENQUEUED, this.f5850b);
            this.f5860w.u(this.f5850b);
            this.f5860w.c(this.f5850b);
            this.f5860w.n(this.f5850b, -1L);
            this.f5859v.B();
        } finally {
            this.f5859v.i();
            m(false);
        }
    }

    private void m(boolean z10) {
        this.f5859v.e();
        try {
            if (!this.f5859v.J().t()) {
                l2.q.a(this.f5849a, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f5860w.w(s.a.ENQUEUED, this.f5850b);
                this.f5860w.n(this.f5850b, -1L);
            }
            if (this.f5853e != null && this.f5854f != null && this.f5858u.b(this.f5850b)) {
                this.f5858u.a(this.f5850b);
            }
            this.f5859v.B();
            this.f5859v.i();
            this.A.o(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            this.f5859v.i();
            throw th2;
        }
    }

    private void n() {
        boolean z10;
        s.a g10 = this.f5860w.g(this.f5850b);
        if (g10 == s.a.RUNNING) {
            f2.j.e().a(D, "Status for " + this.f5850b + " is RUNNING; not doing any work and rescheduling for later execution");
            z10 = true;
        } else {
            f2.j.e().a(D, "Status for " + this.f5850b + " is " + g10 + " ; not doing any work");
            z10 = false;
        }
        m(z10);
    }

    private void o() {
        androidx.work.b b10;
        if (r()) {
            return;
        }
        this.f5859v.e();
        try {
            k2.u uVar = this.f5853e;
            if (uVar.f20224b != s.a.ENQUEUED) {
                n();
                this.f5859v.B();
                f2.j.e().a(D, this.f5853e.f20225c + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if ((uVar.j() || this.f5853e.i()) && System.currentTimeMillis() < this.f5853e.c()) {
                f2.j.e().a(D, String.format("Delaying execution for %s because it is being executed before schedule.", this.f5853e.f20225c));
                m(true);
                this.f5859v.B();
                return;
            }
            this.f5859v.B();
            this.f5859v.i();
            if (this.f5853e.j()) {
                b10 = this.f5853e.f20227e;
            } else {
                f2.g b11 = this.f5857t.f().b(this.f5853e.f20226d);
                if (b11 == null) {
                    f2.j.e().c(D, "Could not create Input Merger " + this.f5853e.f20226d);
                    p();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f5853e.f20227e);
                arrayList.addAll(this.f5860w.k(this.f5850b));
                b10 = b11.b(arrayList);
            }
            androidx.work.b bVar = b10;
            UUID fromString = UUID.fromString(this.f5850b);
            List<String> list = this.f5862y;
            WorkerParameters.a aVar = this.f5852d;
            k2.u uVar2 = this.f5853e;
            WorkerParameters workerParameters = new WorkerParameters(fromString, bVar, list, aVar, uVar2.f20233k, uVar2.f(), this.f5857t.d(), this.f5855r, this.f5857t.n(), new l2.d0(this.f5859v, this.f5855r), new l2.c0(this.f5859v, this.f5858u, this.f5855r));
            if (this.f5854f == null) {
                this.f5854f = this.f5857t.n().b(this.f5849a, this.f5853e.f20225c, workerParameters);
            }
            androidx.work.c cVar = this.f5854f;
            if (cVar == null) {
                f2.j.e().c(D, "Could not create Worker " + this.f5853e.f20225c);
                p();
                return;
            }
            if (cVar.isUsed()) {
                f2.j.e().c(D, "Received an already-used Worker " + this.f5853e.f20225c + "; Worker Factory should return new instances");
                p();
                return;
            }
            this.f5854f.setUsed();
            if (!s()) {
                n();
                return;
            }
            if (r()) {
                return;
            }
            l2.b0 b0Var = new l2.b0(this.f5849a, this.f5853e, this.f5854f, workerParameters.b(), this.f5855r);
            this.f5855r.a().execute(b0Var);
            final com.google.common.util.concurrent.f<Void> b12 = b0Var.b();
            this.B.addListener(new Runnable() { // from class: androidx.work.impl.g0
                @Override // java.lang.Runnable
                public final void run() {
                    h0.this.i(b12);
                }
            }, new l2.x());
            b12.addListener(new a(b12), this.f5855r.a());
            this.B.addListener(new b(this.f5863z), this.f5855r.b());
        } finally {
            this.f5859v.i();
        }
    }

    private void q() {
        this.f5859v.e();
        try {
            this.f5860w.w(s.a.SUCCEEDED, this.f5850b);
            this.f5860w.q(this.f5850b, ((c.a.C0094c) this.f5856s).f());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f5861x.a(this.f5850b)) {
                if (this.f5860w.g(str) == s.a.BLOCKED && this.f5861x.b(str)) {
                    f2.j.e().f(D, "Setting status to enqueued for " + str);
                    this.f5860w.w(s.a.ENQUEUED, str);
                    this.f5860w.i(str, currentTimeMillis);
                }
            }
            this.f5859v.B();
        } finally {
            this.f5859v.i();
            m(false);
        }
    }

    private boolean r() {
        if (!this.C) {
            return false;
        }
        f2.j.e().a(D, "Work interrupted for " + this.f5863z);
        if (this.f5860w.g(this.f5850b) == null) {
            m(false);
        } else {
            m(!r0.h());
        }
        return true;
    }

    private boolean s() {
        boolean z10;
        this.f5859v.e();
        try {
            if (this.f5860w.g(this.f5850b) == s.a.ENQUEUED) {
                this.f5860w.w(s.a.RUNNING, this.f5850b);
                this.f5860w.x(this.f5850b);
                z10 = true;
            } else {
                z10 = false;
            }
            this.f5859v.B();
            return z10;
        } finally {
            this.f5859v.i();
        }
    }

    public com.google.common.util.concurrent.f<Boolean> c() {
        return this.A;
    }

    public k2.m d() {
        return k2.x.a(this.f5853e);
    }

    public k2.u e() {
        return this.f5853e;
    }

    public void g() {
        this.C = true;
        r();
        this.B.cancel(true);
        if (this.f5854f != null && this.B.isCancelled()) {
            this.f5854f.stop();
            return;
        }
        f2.j.e().a(D, "WorkSpec " + this.f5853e + " is already done. Not interrupting.");
    }

    void j() {
        if (!r()) {
            this.f5859v.e();
            try {
                s.a g10 = this.f5860w.g(this.f5850b);
                this.f5859v.I().a(this.f5850b);
                if (g10 == null) {
                    m(false);
                } else if (g10 == s.a.RUNNING) {
                    f(this.f5856s);
                } else if (!g10.h()) {
                    k();
                }
                this.f5859v.B();
            } finally {
                this.f5859v.i();
            }
        }
        List<t> list = this.f5851c;
        if (list != null) {
            Iterator<t> it = list.iterator();
            while (it.hasNext()) {
                it.next().c(this.f5850b);
            }
            u.b(this.f5857t, this.f5859v, this.f5851c);
        }
    }

    void p() {
        this.f5859v.e();
        try {
            h(this.f5850b);
            this.f5860w.q(this.f5850b, ((c.a.C0093a) this.f5856s).f());
            this.f5859v.B();
        } finally {
            this.f5859v.i();
            m(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5863z = b(this.f5862y);
        o();
    }
}
