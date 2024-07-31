package p406vl;

import ck.C2037v;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.C10520a;
import p319ql.C10529e0;
import p341rl.C10727d;
import p388ul.AbstractC11586a;
import p388ul.C11589d;
import p388ul.C11590e;
import p406vl.C11978e;
import p495zl.C13148j;

/* renamed from: vl.g */
/* loaded from: classes3.dex */
public final class C11980g {

    /* renamed from: f */
    public static final a f31824f = new a(null);

    /* renamed from: a */
    private final int f31825a;

    /* renamed from: b */
    private final long f31826b;

    /* renamed from: c */
    private final C11589d f31827c;

    /* renamed from: d */
    private final b f31828d;

    /* renamed from: e */
    private final ConcurrentLinkedQueue<C11979f> f31829e;

    /* renamed from: vl.g$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: vl.g$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC11586a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // p388ul.AbstractC11586a
        /* renamed from: f */
        public long mo36308f() {
            return C11980g.this.m38498b(System.nanoTime());
        }
    }

    public C11980g(C11590e taskRunner, int i10, long j10, TimeUnit timeUnit) {
        C9322n.m27781e(taskRunner, "taskRunner");
        C9322n.m27781e(timeUnit, "timeUnit");
        this.f31825a = i10;
        this.f31826b = timeUnit.toNanos(j10);
        this.f31827c = taskRunner.m36337i();
        this.f31828d = new b(C9322n.m27787k(C10727d.f27166i, " ConnectionPool"));
        this.f31829e = new ConcurrentLinkedQueue<>();
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(C9322n.m27787k("keepAliveDuration <= 0: ", Long.valueOf(j10)).toString());
        }
    }

    /* renamed from: d */
    private final int m38496d(C11979f c11979f, long j10) {
        if (C10727d.f27165h && !Thread.holdsLock(c11979f)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + c11979f);
        }
        List<Reference<C11978e>> m38481n = c11979f.m38481n();
        int i10 = 0;
        while (i10 < m38481n.size()) {
            Reference<C11978e> reference = m38481n.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                C13148j.f35535a.m43385g().mo43348l("A connection to " + c11979f.m38493z().m31716a().m31599l() + " was leaked. Did you forget to close a response body?", ((C11978e.b) reference).m38460a());
                m38481n.remove(i10);
                c11979f.m38473C(true);
                if (m38481n.isEmpty()) {
                    c11979f.m38472B(j10 - this.f31826b);
                    return 0;
                }
            }
        }
        return m38481n.size();
    }

    /* renamed from: a */
    public final boolean m38497a(C10520a address, C11978e call, List<C10529e0> list, boolean z10) {
        C9322n.m27781e(address, "address");
        C9322n.m27781e(call, "call");
        Iterator<C11979f> it = this.f31829e.iterator();
        while (it.hasNext()) {
            C11979f connection = it.next();
            C9322n.m27780d(connection, "connection");
            synchronized (connection) {
                if (z10) {
                    if (!connection.m38489v()) {
                        C2037v c2037v = C2037v.f8089a;
                    }
                }
                if (connection.m38487t(address, list)) {
                    call.m38438c(connection);
                    return true;
                }
                C2037v c2037v2 = C2037v.f8089a;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final long m38498b(long j10) {
        Iterator<C11979f> it = this.f31829e.iterator();
        int i10 = 0;
        long j11 = Long.MIN_VALUE;
        C11979f c11979f = null;
        int i11 = 0;
        while (it.hasNext()) {
            C11979f connection = it.next();
            C9322n.m27780d(connection, "connection");
            synchronized (connection) {
                if (m38496d(connection, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long m38482o = j10 - connection.m38482o();
                    if (m38482o > j11) {
                        c11979f = connection;
                        j11 = m38482o;
                    }
                    C2037v c2037v = C2037v.f8089a;
                }
            }
        }
        long j12 = this.f31826b;
        if (j11 < j12 && i10 <= this.f31825a) {
            if (i10 > 0) {
                return j12 - j11;
            }
            if (i11 > 0) {
                return j12;
            }
            return -1L;
        }
        C9322n.m27778b(c11979f);
        synchronized (c11979f) {
            if (!c11979f.m38481n().isEmpty()) {
                return 0L;
            }
            if (c11979f.m38482o() + j11 != j10) {
                return 0L;
            }
            c11979f.m38473C(true);
            this.f31829e.remove(c11979f);
            C10727d.m32654n(c11979f.m38474D());
            if (this.f31829e.isEmpty()) {
                this.f31827c.m36314a();
            }
            return 0L;
        }
    }

    /* renamed from: c */
    public final boolean m38499c(C11979f connection) {
        C9322n.m27781e(connection, "connection");
        if (C10727d.f27165h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
        }
        if (!connection.m38483p() && this.f31825a != 0) {
            C11589d.m36313j(this.f31827c, this.f31828d, 0L, 2, null);
            return false;
        }
        connection.m38473C(true);
        this.f31829e.remove(connection);
        if (this.f31829e.isEmpty()) {
            this.f31827c.m36314a();
        }
        return true;
    }

    /* renamed from: e */
    public final void m38500e(C11979f connection) {
        C9322n.m27781e(connection, "connection");
        if (!C10727d.f27165h || Thread.holdsLock(connection)) {
            this.f31829e.add(connection);
            C11589d.m36313j(this.f31827c, this.f31828d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
    }
}
