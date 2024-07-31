package y3;

import android.graphics.drawable.Drawable;
import j3.q;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class g<R> implements d<R>, h<R> {

    /* renamed from: v, reason: collision with root package name */
    private static final a f31601v = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f31602a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31603b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31604c;

    /* renamed from: d, reason: collision with root package name */
    private final a f31605d;

    /* renamed from: e, reason: collision with root package name */
    private R f31606e;

    /* renamed from: f, reason: collision with root package name */
    private e f31607f;

    /* renamed from: r, reason: collision with root package name */
    private boolean f31608r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f31609s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f31610t;

    /* renamed from: u, reason: collision with root package name */
    private q f31611u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        a() {
        }

        void a(Object obj) {
            obj.notifyAll();
        }

        void b(Object obj, long j10) {
            obj.wait(j10);
        }
    }

    public g(int i10, int i11) {
        this(i10, i11, true, f31601v);
    }

    g(int i10, int i11, boolean z10, a aVar) {
        this.f31602a = i10;
        this.f31603b = i11;
        this.f31604c = z10;
        this.f31605d = aVar;
    }

    private synchronized R k(Long l10) {
        if (this.f31604c && !isDone()) {
            c4.l.a();
        }
        if (this.f31608r) {
            throw new CancellationException();
        }
        if (this.f31610t) {
            throw new ExecutionException(this.f31611u);
        }
        if (this.f31609s) {
            return this.f31606e;
        }
        if (l10 == null) {
            this.f31605d.b(this, 0L);
        } else if (l10.longValue() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = l10.longValue() + currentTimeMillis;
            while (!isDone() && currentTimeMillis < longValue) {
                this.f31605d.b(this, longValue - currentTimeMillis);
                currentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.f31610t) {
            throw new ExecutionException(this.f31611u);
        }
        if (this.f31608r) {
            throw new CancellationException();
        }
        if (!this.f31609s) {
            throw new TimeoutException();
        }
        return this.f31606e;
    }

    @Override // z3.d
    public void a(z3.c cVar) {
    }

    @Override // z3.d
    public synchronized void b(R r10, a4.b<? super R> bVar) {
    }

    @Override // y3.h
    public synchronized boolean c(R r10, Object obj, z3.d<R> dVar, h3.a aVar, boolean z10) {
        this.f31609s = true;
        this.f31606e = r10;
        this.f31605d.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f31608r = true;
            this.f31605d.a(this);
            e eVar = null;
            if (z10) {
                e eVar2 = this.f31607f;
                this.f31607f = null;
                eVar = eVar2;
            }
            if (eVar != null) {
                eVar.clear();
            }
            return true;
        }
    }

    @Override // y3.h
    public synchronized boolean d(q qVar, Object obj, z3.d<R> dVar, boolean z10) {
        this.f31610t = true;
        this.f31611u = qVar;
        this.f31605d.a(this);
        return false;
    }

    @Override // z3.d
    public void e(Drawable drawable) {
    }

    @Override // z3.d
    public synchronized e f() {
        return this.f31607f;
    }

    @Override // z3.d
    public void g(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public R get() {
        try {
            return k(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // java.util.concurrent.Future
    public R get(long j10, TimeUnit timeUnit) {
        return k(Long.valueOf(timeUnit.toMillis(j10)));
    }

    @Override // z3.d
    public synchronized void h(e eVar) {
        this.f31607f = eVar;
    }

    @Override // z3.d
    public void i(z3.c cVar) {
        cVar.d(this.f31602a, this.f31603b);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f31608r;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z10;
        if (!this.f31608r && !this.f31609s) {
            z10 = this.f31610t;
        }
        return z10;
    }

    @Override // z3.d
    public synchronized void j(Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.m
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.m
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.m
    public void onStop() {
    }

    public String toString() {
        e eVar;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            eVar = null;
            if (this.f31608r) {
                str = "CANCELLED";
            } else if (this.f31610t) {
                str = "FAILURE";
            } else if (this.f31609s) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                eVar = this.f31607f;
            }
        }
        if (eVar == null) {
            return str2 + str + "]";
        }
        return str2 + str + ", request=[" + eVar + "]]";
    }
}
