package p388ul;

import ck.C2037v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.C9322n;
import p341rl.C10727d;

/* renamed from: ul.d */
/* loaded from: classes3.dex */
public final class C11589d {

    /* renamed from: a */
    private final C11590e f30137a;

    /* renamed from: b */
    private final String f30138b;

    /* renamed from: c */
    private boolean f30139c;

    /* renamed from: d */
    private AbstractC11586a f30140d;

    /* renamed from: e */
    private final List<AbstractC11586a> f30141e;

    /* renamed from: f */
    private boolean f30142f;

    public C11589d(C11590e taskRunner, String name) {
        C9322n.m27781e(taskRunner, "taskRunner");
        C9322n.m27781e(name, "name");
        this.f30137a = taskRunner;
        this.f30138b = name;
        this.f30141e = new ArrayList();
    }

    /* renamed from: j */
    public static /* synthetic */ void m36313j(C11589d c11589d, AbstractC11586a abstractC11586a, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c11589d.m36322i(abstractC11586a, j10);
    }

    /* renamed from: a */
    public final void m36314a() {
        if (C10727d.f27165h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f30137a) {
            if (m36315b()) {
                m36321h().m36336h(this);
            }
            C2037v c2037v = C2037v.f8089a;
        }
    }

    /* renamed from: b */
    public final boolean m36315b() {
        AbstractC11586a abstractC11586a = this.f30140d;
        if (abstractC11586a != null) {
            C9322n.m27778b(abstractC11586a);
            if (abstractC11586a.m36303a()) {
                this.f30142f = true;
            }
        }
        int size = this.f30141e.size() - 1;
        boolean z10 = false;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                if (this.f30141e.get(size).m36303a()) {
                    AbstractC11586a abstractC11586a2 = this.f30141e.get(size);
                    if (C11590e.f30143h.m36341a().isLoggable(Level.FINE)) {
                        C11587b.m36310a(abstractC11586a2, this, "canceled");
                    }
                    this.f30141e.remove(size);
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

    /* renamed from: c */
    public final AbstractC11586a m36316c() {
        return this.f30140d;
    }

    /* renamed from: d */
    public final boolean m36317d() {
        return this.f30142f;
    }

    /* renamed from: e */
    public final List<AbstractC11586a> m36318e() {
        return this.f30141e;
    }

    /* renamed from: f */
    public final String m36319f() {
        return this.f30138b;
    }

    /* renamed from: g */
    public final boolean m36320g() {
        return this.f30139c;
    }

    /* renamed from: h */
    public final C11590e m36321h() {
        return this.f30137a;
    }

    /* renamed from: i */
    public final void m36322i(AbstractC11586a task, long j10) {
        C9322n.m27781e(task, "task");
        synchronized (this.f30137a) {
            if (!m36320g()) {
                if (m36323k(task, j10, false)) {
                    m36321h().m36336h(this);
                }
                C2037v c2037v = C2037v.f8089a;
            } else if (task.m36303a()) {
                if (C11590e.f30143h.m36341a().isLoggable(Level.FINE)) {
                    C11587b.m36310a(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C11590e.f30143h.m36341a().isLoggable(Level.FINE)) {
                    C11587b.m36310a(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* renamed from: k */
    public final boolean m36323k(AbstractC11586a task, long j10, boolean z10) {
        String m36311b;
        String str;
        C9322n.m27781e(task, "task");
        task.m36307e(this);
        long mo36340c = this.f30137a.m36335g().mo36340c();
        long j11 = mo36340c + j10;
        int indexOf = this.f30141e.indexOf(task);
        if (indexOf != -1) {
            if (task.m36305c() <= j11) {
                if (C11590e.f30143h.m36341a().isLoggable(Level.FINE)) {
                    C11587b.m36310a(task, this, "already scheduled");
                }
                return false;
            }
            this.f30141e.remove(indexOf);
        }
        task.m36309g(j11);
        if (C11590e.f30143h.m36341a().isLoggable(Level.FINE)) {
            long j12 = j11 - mo36340c;
            if (z10) {
                m36311b = C11587b.m36311b(j12);
                str = "run again after ";
            } else {
                m36311b = C11587b.m36311b(j12);
                str = "scheduled after ";
            }
            C11587b.m36310a(task, this, C9322n.m27787k(str, m36311b));
        }
        Iterator<AbstractC11586a> it = this.f30141e.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (it.next().m36305c() - mo36340c > j10) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            i10 = this.f30141e.size();
        }
        this.f30141e.add(i10, task);
        return i10 == 0;
    }

    /* renamed from: l */
    public final void m36324l(AbstractC11586a abstractC11586a) {
        this.f30140d = abstractC11586a;
    }

    /* renamed from: m */
    public final void m36325m(boolean z10) {
        this.f30142f = z10;
    }

    /* renamed from: n */
    public final void m36326n(boolean z10) {
        this.f30139c = z10;
    }

    /* renamed from: o */
    public final void m36327o() {
        if (C10727d.f27165h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f30137a) {
            m36326n(true);
            if (m36315b()) {
                m36321h().m36336h(this);
            }
            C2037v c2037v = C2037v.f8089a;
        }
    }

    public String toString() {
        return this.f30138b;
    }
}
