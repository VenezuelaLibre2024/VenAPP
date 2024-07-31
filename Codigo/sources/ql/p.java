package ql;

import com.google.android.gms.common.api.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import vl.e;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    private Runnable f24341c;

    /* renamed from: d, reason: collision with root package name */
    private ExecutorService f24342d;

    /* renamed from: a, reason: collision with root package name */
    private int f24339a = 64;

    /* renamed from: b, reason: collision with root package name */
    private int f24340b = 5;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<e.a> f24343e = new ArrayDeque<>();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<e.a> f24344f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<vl.e> f24345g = new ArrayDeque<>();

    private final e.a e(String str) {
        Iterator<e.a> it = this.f24344f.iterator();
        while (it.hasNext()) {
            e.a next = it.next();
            if (kotlin.jvm.internal.n.a(next.d(), str)) {
                return next;
            }
        }
        Iterator<e.a> it2 = this.f24343e.iterator();
        while (it2.hasNext()) {
            e.a next2 = it2.next();
            if (kotlin.jvm.internal.n.a(next2.d(), str)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void f(Deque<T> deque, T t10) {
        Runnable i10;
        synchronized (this) {
            if (!deque.remove(t10)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            i10 = i();
            ck.v vVar = ck.v.f7137a;
        }
        if (l() || i10 == null) {
            return;
        }
        i10.run();
    }

    private final boolean l() {
        int i10;
        boolean z10;
        if (rl.d.f25046h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<e.a> it = this.f24343e.iterator();
            kotlin.jvm.internal.n.d(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                e.a asyncCall = it.next();
                if (this.f24344f.size() >= j()) {
                    break;
                }
                if (asyncCall.c().get() < k()) {
                    it.remove();
                    asyncCall.c().incrementAndGet();
                    kotlin.jvm.internal.n.d(asyncCall, "asyncCall");
                    arrayList.add(asyncCall);
                    this.f24344f.add(asyncCall);
                }
            }
            z10 = m() > 0;
            ck.v vVar = ck.v.f7137a;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((e.a) arrayList.get(i10)).a(d());
        }
        return z10;
    }

    public final synchronized void a() {
        Iterator<e.a> it = this.f24343e.iterator();
        while (it.hasNext()) {
            it.next().b().cancel();
        }
        Iterator<e.a> it2 = this.f24344f.iterator();
        while (it2.hasNext()) {
            it2.next().b().cancel();
        }
        Iterator<vl.e> it3 = this.f24345g.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public final void b(e.a call) {
        e.a e10;
        kotlin.jvm.internal.n.e(call, "call");
        synchronized (this) {
            this.f24343e.add(call);
            if (!call.b().p() && (e10 = e(call.d())) != null) {
                call.e(e10);
            }
            ck.v vVar = ck.v.f7137a;
        }
        l();
    }

    public final synchronized void c(vl.e call) {
        kotlin.jvm.internal.n.e(call, "call");
        this.f24345g.add(call);
    }

    public final synchronized ExecutorService d() {
        ExecutorService executorService;
        if (this.f24342d == null) {
            this.f24342d = new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), rl.d.M(kotlin.jvm.internal.n.k(rl.d.f25047i, " Dispatcher"), false));
        }
        executorService = this.f24342d;
        kotlin.jvm.internal.n.b(executorService);
        return executorService;
    }

    public final void g(e.a call) {
        kotlin.jvm.internal.n.e(call, "call");
        call.c().decrementAndGet();
        f(this.f24344f, call);
    }

    public final void h(vl.e call) {
        kotlin.jvm.internal.n.e(call, "call");
        f(this.f24345g, call);
    }

    public final synchronized Runnable i() {
        return this.f24341c;
    }

    public final synchronized int j() {
        return this.f24339a;
    }

    public final synchronized int k() {
        return this.f24340b;
    }

    public final synchronized int m() {
        return this.f24344f.size() + this.f24345g.size();
    }
}
