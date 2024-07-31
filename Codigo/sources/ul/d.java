package ul;

import ck.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a */
    private final e f27814a;

    /* renamed from: b */
    private final String f27815b;

    /* renamed from: c */
    private boolean f27816c;

    /* renamed from: d */
    private a f27817d;

    /* renamed from: e */
    private final List<a> f27818e;

    /* renamed from: f */
    private boolean f27819f;

    public d(e taskRunner, String name) {
        n.e(taskRunner, "taskRunner");
        n.e(name, "name");
        this.f27814a = taskRunner;
        this.f27815b = name;
        this.f27818e = new ArrayList();
    }

    public static /* synthetic */ void j(d dVar, a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        dVar.i(aVar, j10);
    }

    public final void a() {
        if (rl.d.f25046h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f27814a) {
            if (b()) {
                h().h(this);
            }
            v vVar = v.f7137a;
        }
    }

    public final boolean b() {
        a aVar = this.f27817d;
        if (aVar != null) {
            n.b(aVar);
            if (aVar.a()) {
                this.f27819f = true;
            }
        }
        int size = this.f27818e.size() - 1;
        boolean z10 = false;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                if (this.f27818e.get(size).a()) {
                    a aVar2 = this.f27818e.get(size);
                    if (e.f27820h.a().isLoggable(Level.FINE)) {
                        b.c(aVar2, this, "canceled");
                    }
                    this.f27818e.remove(size);
                    z10 = true;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
        }
        return z10;
    }

    public final a c() {
        return this.f27817d;
    }

    public final boolean d() {
        return this.f27819f;
    }

    public final List<a> e() {
        return this.f27818e;
    }

    public final String f() {
        return this.f27815b;
    }

    public final boolean g() {
        return this.f27816c;
    }

    public final e h() {
        return this.f27814a;
    }

    public final void i(a task, long j10) {
        n.e(task, "task");
        synchronized (this.f27814a) {
            if (!g()) {
                if (k(task, j10, false)) {
                    h().h(this);
                }
                v vVar = v.f7137a;
            } else if (task.a()) {
                if (e.f27820h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.f27820h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(a task, long j10, boolean z10) {
        String b10;
        String str;
        n.e(task, "task");
        task.e(this);
        long c10 = this.f27814a.g().c();
        long j11 = c10 + j10;
        int indexOf = this.f27818e.indexOf(task);
        if (indexOf != -1) {
            if (task.c() <= j11) {
                if (e.f27820h.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "already scheduled");
                }
                return false;
            }
            this.f27818e.remove(indexOf);
        }
        task.g(j11);
        if (e.f27820h.a().isLoggable(Level.FINE)) {
            long j12 = j11 - c10;
            if (z10) {
                b10 = b.b(j12);
                str = "run again after ";
            } else {
                b10 = b.b(j12);
                str = "scheduled after ";
            }
            b.c(task, this, n.k(str, b10));
        }
        Iterator<a> it = this.f27818e.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (it.next().c() - c10 > j10) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            i10 = this.f27818e.size();
        }
        this.f27818e.add(i10, task);
        return i10 == 0;
    }

    public final void l(a aVar) {
        this.f27817d = aVar;
    }

    public final void m(boolean z10) {
        this.f27819f = z10;
    }

    public final void n(boolean z10) {
        this.f27816c = z10;
    }

    public final void o() {
        if (rl.d.f25046h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f27814a) {
            n(true);
            if (b()) {
                h().h(this);
            }
            v vVar = v.f7137a;
        }
    }

    public String toString() {
        return this.f27815b;
    }
}
