package t8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import t8.l;

/* loaded from: classes.dex */
public final class r<T> {

    /* renamed from: a, reason: collision with root package name */
    private final d f26731a;

    /* renamed from: b, reason: collision with root package name */
    private final o f26732b;

    /* renamed from: c, reason: collision with root package name */
    private final b<T> f26733c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f26734d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f26735e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f26736f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f26737g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26738h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f26739i;

    /* loaded from: classes.dex */
    public interface a<T> {
        void invoke(T t10);
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(T t10, l lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f26740a;

        /* renamed from: b, reason: collision with root package name */
        private l.b f26741b = new l.b();

        /* renamed from: c, reason: collision with root package name */
        private boolean f26742c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f26743d;

        public c(T t10) {
            this.f26740a = t10;
        }

        public void a(int i10, a<T> aVar) {
            if (this.f26743d) {
                return;
            }
            if (i10 != -1) {
                this.f26741b.a(i10);
            }
            this.f26742c = true;
            aVar.invoke(this.f26740a);
        }

        public void b(b<T> bVar) {
            if (this.f26743d || !this.f26742c) {
                return;
            }
            l e10 = this.f26741b.e();
            this.f26741b = new l.b();
            this.f26742c = false;
            bVar.a(this.f26740a, e10);
        }

        public void c(b<T> bVar) {
            this.f26743d = true;
            if (this.f26742c) {
                this.f26742c = false;
                bVar.a(this.f26740a, this.f26741b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f26740a.equals(((c) obj).f26740a);
        }

        public int hashCode() {
            return this.f26740a.hashCode();
        }
    }

    public r(Looper looper, d dVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar);
    }

    private r(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, d dVar, b<T> bVar) {
        this.f26731a = dVar;
        this.f26734d = copyOnWriteArraySet;
        this.f26733c = bVar;
        this.f26737g = new Object();
        this.f26735e = new ArrayDeque<>();
        this.f26736f = new ArrayDeque<>();
        this.f26732b = dVar.c(looper, new Handler.Callback() { // from class: t8.p
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean g10;
                g10 = r.this.g(message);
                return g10;
            }
        });
        this.f26739i = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator<c<T>> it = this.f26734d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f26733c);
            if (this.f26732b.b(0)) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    private void m() {
        if (this.f26739i) {
            t8.a.g(Thread.currentThread() == this.f26732b.f().getThread());
        }
    }

    public void c(T t10) {
        t8.a.e(t10);
        synchronized (this.f26737g) {
            if (this.f26738h) {
                return;
            }
            this.f26734d.add(new c<>(t10));
        }
    }

    public r<T> d(Looper looper, d dVar, b<T> bVar) {
        return new r<>(this.f26734d, looper, dVar, bVar);
    }

    public r<T> e(Looper looper, b<T> bVar) {
        return d(looper, this.f26731a, bVar);
    }

    public void f() {
        m();
        if (this.f26736f.isEmpty()) {
            return;
        }
        if (!this.f26732b.b(0)) {
            o oVar = this.f26732b;
            oVar.k(oVar.a(0));
        }
        boolean z10 = !this.f26735e.isEmpty();
        this.f26735e.addAll(this.f26736f);
        this.f26736f.clear();
        if (z10) {
            return;
        }
        while (!this.f26735e.isEmpty()) {
            this.f26735e.peekFirst().run();
            this.f26735e.removeFirst();
        }
    }

    public void i(final int i10, final a<T> aVar) {
        m();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f26734d);
        this.f26736f.add(new Runnable() { // from class: t8.q
            @Override // java.lang.Runnable
            public final void run() {
                r.h(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void j() {
        m();
        synchronized (this.f26737g) {
            this.f26738h = true;
        }
        Iterator<c<T>> it = this.f26734d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f26733c);
        }
        this.f26734d.clear();
    }

    public void k(T t10) {
        m();
        Iterator<c<T>> it = this.f26734d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f26740a.equals(t10)) {
                next.c(this.f26733c);
                this.f26734d.remove(next);
            }
        }
    }

    public void l(int i10, a<T> aVar) {
        i(i10, aVar);
        f();
    }
}
