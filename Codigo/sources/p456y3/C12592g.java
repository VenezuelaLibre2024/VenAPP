package p456y3;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p006a4.InterfaceC0031b;
import p036c4.C1871l;
import p129h3.EnumC7617a;
import p171j3.C8970q;
import p478z3.InterfaceC12797c;
import p478z3.InterfaceC12798d;

/* renamed from: y3.g */
/* loaded from: classes.dex */
public class C12592g<R> implements InterfaceFutureC12589d<R>, InterfaceC12593h<R> {

    /* renamed from: v */
    private static final a f34132v = new a();

    /* renamed from: a */
    private final int f34133a;

    /* renamed from: b */
    private final int f34134b;

    /* renamed from: c */
    private final boolean f34135c;

    /* renamed from: d */
    private final a f34136d;

    /* renamed from: e */
    private R f34137e;

    /* renamed from: f */
    private InterfaceC12590e f34138f;

    /* renamed from: r */
    private boolean f34139r;

    /* renamed from: s */
    private boolean f34140s;

    /* renamed from: t */
    private boolean f34141t;

    /* renamed from: u */
    private C8970q f34142u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y3.g$a */
    /* loaded from: classes.dex */
    public static class a {
        a() {
        }

        /* renamed from: a */
        void m41400a(Object obj) {
            obj.notifyAll();
        }

        /* renamed from: b */
        void m41401b(Object obj, long j10) {
            obj.wait(j10);
        }
    }

    public C12592g(int i10, int i11) {
        this(i10, i11, true, f34132v);
    }

    C12592g(int i10, int i11, boolean z10, a aVar) {
        this.f34133a = i10;
        this.f34134b = i11;
        this.f34135c = z10;
        this.f34136d = aVar;
    }

    /* renamed from: k */
    private synchronized R m41394k(Long l10) {
        if (this.f34135c && !isDone()) {
            C1871l.m9952a();
        }
        if (this.f34139r) {
            throw new CancellationException();
        }
        if (this.f34141t) {
            throw new ExecutionException(this.f34142u);
        }
        if (this.f34140s) {
            return this.f34137e;
        }
        if (l10 == null) {
            this.f34136d.m41401b(this, 0L);
        } else if (l10.longValue() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = l10.longValue() + currentTimeMillis;
            while (!isDone() && currentTimeMillis < longValue) {
                this.f34136d.m41401b(this, longValue - currentTimeMillis);
                currentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.f34141t) {
            throw new ExecutionException(this.f34142u);
        }
        if (this.f34139r) {
            throw new CancellationException();
        }
        if (!this.f34140s) {
            throw new TimeoutException();
        }
        return this.f34137e;
    }

    @Override // p478z3.InterfaceC12798d
    /* renamed from: a */
    public void mo41395a(InterfaceC12797c interfaceC12797c) {
    }

    @Override // p478z3.InterfaceC12798d
    /* renamed from: b */
    public synchronized void mo35350b(R r10, InterfaceC0031b<? super R> interfaceC0031b) {
    }

    @Override // p456y3.InterfaceC12593h
    /* renamed from: c */
    public synchronized boolean mo36135c(R r10, Object obj, InterfaceC12798d<R> interfaceC12798d, EnumC7617a enumC7617a, boolean z10) {
        this.f34140s = true;
        this.f34137e = r10;
        this.f34136d.m41400a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f34139r = true;
            this.f34136d.m41400a(this);
            InterfaceC12590e interfaceC12590e = null;
            if (z10) {
                InterfaceC12590e interfaceC12590e2 = this.f34138f;
                this.f34138f = null;
                interfaceC12590e = interfaceC12590e2;
            }
            if (interfaceC12590e != null) {
                interfaceC12590e.clear();
            }
            return true;
        }
    }

    @Override // p456y3.InterfaceC12593h
    /* renamed from: d */
    public synchronized boolean mo36136d(C8970q c8970q, Object obj, InterfaceC12798d<R> interfaceC12798d, boolean z10) {
        this.f34141t = true;
        this.f34142u = c8970q;
        this.f34136d.m41400a(this);
        return false;
    }

    @Override // p478z3.InterfaceC12798d
    /* renamed from: e */
    public void mo41396e(Drawable drawable) {
    }

    @Override // p478z3.InterfaceC12798d
    /* renamed from: f */
    public synchronized InterfaceC12590e mo41397f() {
        return this.f34138f;
    }

    @Override // p478z3.InterfaceC12798d
    /* renamed from: g */
    public void mo35353g(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public R get() {
        try {
            return m41394k(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // java.util.concurrent.Future
    public R get(long j10, TimeUnit timeUnit) {
        return m41394k(Long.valueOf(timeUnit.toMillis(j10)));
    }

    @Override // p478z3.InterfaceC12798d
    /* renamed from: h */
    public synchronized void mo41398h(InterfaceC12590e interfaceC12590e) {
        this.f34138f = interfaceC12590e;
    }

    @Override // p478z3.InterfaceC12798d
    /* renamed from: i */
    public void mo41399i(InterfaceC12797c interfaceC12797c) {
        interfaceC12797c.mo41427d(this.f34133a, this.f34134b);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f34139r;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z10;
        if (!this.f34139r && !this.f34140s) {
            z10 = this.f34141t;
        }
        return z10;
    }

    @Override // p478z3.InterfaceC12798d
    /* renamed from: j */
    public synchronized void mo36109j(Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.InterfaceC2156m
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC2156m
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC2156m
    public void onStop() {
    }

    public String toString() {
        InterfaceC12590e interfaceC12590e;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            interfaceC12590e = null;
            if (this.f34139r) {
                str = "CANCELLED";
            } else if (this.f34141t) {
                str = "FAILURE";
            } else if (this.f34140s) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                interfaceC12590e = this.f34138f;
            }
        }
        if (interfaceC12590e == null) {
            return str2 + str + "]";
        }
        return str2 + str + ", request=[" + interfaceC12590e + "]]";
    }
}
