package vl;

import ck.v;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.n;
import ql.e0;
import vl.e;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: f, reason: collision with root package name */
    public static final a f29386f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f29387a;

    /* renamed from: b, reason: collision with root package name */
    private final long f29388b;

    /* renamed from: c, reason: collision with root package name */
    private final ul.d f29389c;

    /* renamed from: d, reason: collision with root package name */
    private final b f29390d;

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentLinkedQueue<f> f29391e;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends ul.a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // ul.a
        public long f() {
            return g.this.b(System.nanoTime());
        }
    }

    public g(ul.e taskRunner, int i10, long j10, TimeUnit timeUnit) {
        n.e(taskRunner, "taskRunner");
        n.e(timeUnit, "timeUnit");
        this.f29387a = i10;
        this.f29388b = timeUnit.toNanos(j10);
        this.f29389c = taskRunner.i();
        this.f29390d = new b(n.k(rl.d.f25047i, " ConnectionPool"));
        this.f29391e = new ConcurrentLinkedQueue<>();
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(n.k("keepAliveDuration <= 0: ", Long.valueOf(j10)).toString());
        }
    }

    private final int d(f fVar, long j10) {
        if (rl.d.f25046h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + fVar);
        }
        List<Reference<e>> n10 = fVar.n();
        int i10 = 0;
        while (i10 < n10.size()) {
            Reference<e> reference = n10.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                zl.j.f32984a.g().l("A connection to " + fVar.z().a().l() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                n10.remove(i10);
                fVar.C(true);
                if (n10.isEmpty()) {
                    fVar.B(j10 - this.f29388b);
                    return 0;
                }
            }
        }
        return n10.size();
    }

    public final boolean a(ql.a address, e call, List<e0> list, boolean z10) {
        n.e(address, "address");
        n.e(call, "call");
        Iterator<f> it = this.f29391e.iterator();
        while (it.hasNext()) {
            f connection = it.next();
            n.d(connection, "connection");
            synchronized (connection) {
                if (z10) {
                    if (!connection.v()) {
                        v vVar = v.f7137a;
                    }
                }
                if (connection.t(address, list)) {
                    call.c(connection);
                    return true;
                }
                v vVar2 = v.f7137a;
            }
        }
        return false;
    }

    public final long b(long j10) {
        Iterator<f> it = this.f29391e.iterator();
        int i10 = 0;
        long j11 = Long.MIN_VALUE;
        f fVar = null;
        int i11 = 0;
        while (it.hasNext()) {
            f connection = it.next();
            n.d(connection, "connection");
            synchronized (connection) {
                if (d(connection, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long o10 = j10 - connection.o();
                    if (o10 > j11) {
                        fVar = connection;
                        j11 = o10;
                    }
                    v vVar = v.f7137a;
                }
            }
        }
        long j12 = this.f29388b;
        if (j11 < j12 && i10 <= this.f29387a) {
            if (i10 > 0) {
                return j12 - j11;
            }
            if (i11 > 0) {
                return j12;
            }
            return -1L;
        }
        n.b(fVar);
        synchronized (fVar) {
            if (!fVar.n().isEmpty()) {
                return 0L;
            }
            if (fVar.o() + j11 != j10) {
                return 0L;
            }
            fVar.C(true);
            this.f29391e.remove(fVar);
            rl.d.n(fVar.D());
            if (this.f29391e.isEmpty()) {
                this.f29389c.a();
            }
            return 0L;
        }
    }

    public final boolean c(f connection) {
        n.e(connection, "connection");
        if (rl.d.f25046h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
        }
        if (!connection.p() && this.f29387a != 0) {
            ul.d.j(this.f29389c, this.f29390d, 0L, 2, null);
            return false;
        }
        connection.C(true);
        this.f29391e.remove(connection);
        if (this.f29391e.isEmpty()) {
            this.f29389c.a();
        }
        return true;
    }

    public final void e(f connection) {
        n.e(connection, "connection");
        if (!rl.d.f25046h || Thread.holdsLock(connection)) {
            this.f29391e.add(connection);
            ul.d.j(this.f29389c, this.f29390d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
    }
}
