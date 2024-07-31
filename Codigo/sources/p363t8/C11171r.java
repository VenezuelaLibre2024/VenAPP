package p363t8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p363t8.C11159l;

/* renamed from: t8.r */
/* loaded from: classes.dex */
public final class C11171r<T> {

    /* renamed from: a */
    private final InterfaceC11143d f29027a;

    /* renamed from: b */
    private final InterfaceC11165o f29028b;

    /* renamed from: c */
    private final b<T> f29029c;

    /* renamed from: d */
    private final CopyOnWriteArraySet<c<T>> f29030d;

    /* renamed from: e */
    private final ArrayDeque<Runnable> f29031e;

    /* renamed from: f */
    private final ArrayDeque<Runnable> f29032f;

    /* renamed from: g */
    private final Object f29033g;

    /* renamed from: h */
    private boolean f29034h;

    /* renamed from: i */
    private boolean f29035i;

    /* renamed from: t8.r$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        void invoke(T t10);
    }

    /* renamed from: t8.r$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        /* renamed from: a */
        void mo34318a(T t10, C11159l c11159l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t8.r$c */
    /* loaded from: classes.dex */
    public static final class c<T> {

        /* renamed from: a */
        public final T f29036a;

        /* renamed from: b */
        private C11159l.b f29037b = new C11159l.b();

        /* renamed from: c */
        private boolean f29038c;

        /* renamed from: d */
        private boolean f29039d;

        public c(T t10) {
            this.f29036a = t10;
        }

        /* renamed from: a */
        public void m34853a(int i10, a<T> aVar) {
            if (this.f29039d) {
                return;
            }
            if (i10 != -1) {
                this.f29037b.m34763a(i10);
            }
            this.f29038c = true;
            aVar.invoke(this.f29036a);
        }

        /* renamed from: b */
        public void m34854b(b<T> bVar) {
            if (this.f29039d || !this.f29038c) {
                return;
            }
            C11159l m34767e = this.f29037b.m34767e();
            this.f29037b = new C11159l.b();
            this.f29038c = false;
            bVar.mo34318a(this.f29036a, m34767e);
        }

        /* renamed from: c */
        public void m34855c(b<T> bVar) {
            this.f29039d = true;
            if (this.f29038c) {
                this.f29038c = false;
                bVar.mo34318a(this.f29036a, this.f29037b.m34767e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f29036a.equals(((c) obj).f29036a);
        }

        public int hashCode() {
            return this.f29036a.hashCode();
        }
    }

    public C11171r(Looper looper, InterfaceC11143d interfaceC11143d, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC11143d, bVar);
    }

    private C11171r(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, InterfaceC11143d interfaceC11143d, b<T> bVar) {
        this.f29027a = interfaceC11143d;
        this.f29030d = copyOnWriteArraySet;
        this.f29029c = bVar;
        this.f29033g = new Object();
        this.f29031e = new ArrayDeque<>();
        this.f29032f = new ArrayDeque<>();
        this.f29028b = interfaceC11143d.mo34623c(looper, new Handler.Callback() { // from class: t8.p
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m34842g;
                m34842g = C11171r.this.m34842g(message);
                return m34842g;
            }
        });
        this.f29035i = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m34842g(Message message) {
        Iterator<c<T>> it = this.f29030d.iterator();
        while (it.hasNext()) {
            it.next().m34854b(this.f29029c);
            if (this.f29028b.mo34772b(0)) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m34843h(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).m34853a(i10, aVar);
        }
    }

    /* renamed from: m */
    private void m34844m() {
        if (this.f29035i) {
            C11137a.m34605g(Thread.currentThread() == this.f29028b.mo34776f().getThread());
        }
    }

    /* renamed from: c */
    public void m34845c(T t10) {
        C11137a.m34603e(t10);
        synchronized (this.f29033g) {
            if (this.f29034h) {
                return;
            }
            this.f29030d.add(new c<>(t10));
        }
    }

    /* renamed from: d */
    public C11171r<T> m34846d(Looper looper, InterfaceC11143d interfaceC11143d, b<T> bVar) {
        return new C11171r<>(this.f29030d, looper, interfaceC11143d, bVar);
    }

    /* renamed from: e */
    public C11171r<T> m34847e(Looper looper, b<T> bVar) {
        return m34846d(looper, this.f29027a, bVar);
    }

    /* renamed from: f */
    public void m34848f() {
        m34844m();
        if (this.f29032f.isEmpty()) {
            return;
        }
        if (!this.f29028b.mo34772b(0)) {
            InterfaceC11165o interfaceC11165o = this.f29028b;
            interfaceC11165o.mo34781k(interfaceC11165o.mo34771a(0));
        }
        boolean z10 = !this.f29031e.isEmpty();
        this.f29031e.addAll(this.f29032f);
        this.f29032f.clear();
        if (z10) {
            return;
        }
        while (!this.f29031e.isEmpty()) {
            this.f29031e.peekFirst().run();
            this.f29031e.removeFirst();
        }
    }

    /* renamed from: i */
    public void m34849i(final int i10, final a<T> aVar) {
        m34844m();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f29030d);
        this.f29032f.add(new Runnable() { // from class: t8.q
            @Override // java.lang.Runnable
            public final void run() {
                C11171r.m34843h(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    /* renamed from: j */
    public void m34850j() {
        m34844m();
        synchronized (this.f29033g) {
            this.f29034h = true;
        }
        Iterator<c<T>> it = this.f29030d.iterator();
        while (it.hasNext()) {
            it.next().m34855c(this.f29029c);
        }
        this.f29030d.clear();
    }

    /* renamed from: k */
    public void m34851k(T t10) {
        m34844m();
        Iterator<c<T>> it = this.f29030d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f29036a.equals(t10)) {
                next.m34855c(this.f29029c);
                this.f29030d.remove(next);
            }
        }
    }

    /* renamed from: l */
    public void m34852l(int i10, a<T> aVar) {
        m34849i(i10, aVar);
        m34848f();
    }
}
