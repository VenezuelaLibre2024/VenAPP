package p319ql;

import ck.C2037v;
import com.google.android.gms.common.api.C5101a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9322n;
import p341rl.C10727d;
import p406vl.C11978e;

/* renamed from: ql.p */
/* loaded from: classes3.dex */
public final class C10541p {

    /* renamed from: c */
    private Runnable f26435c;

    /* renamed from: d */
    private ExecutorService f26436d;

    /* renamed from: a */
    private int f26433a = 64;

    /* renamed from: b */
    private int f26434b = 5;

    /* renamed from: e */
    private final ArrayDeque<C11978e.a> f26437e = new ArrayDeque<>();

    /* renamed from: f */
    private final ArrayDeque<C11978e.a> f26438f = new ArrayDeque<>();

    /* renamed from: g */
    private final ArrayDeque<C11978e> f26439g = new ArrayDeque<>();

    /* renamed from: e */
    private final C11978e.a m31793e(String str) {
        Iterator<C11978e.a> it = this.f26438f.iterator();
        while (it.hasNext()) {
            C11978e.a next = it.next();
            if (C9322n.m27777a(next.m38458d(), str)) {
                return next;
            }
        }
        Iterator<C11978e.a> it2 = this.f26437e.iterator();
        while (it2.hasNext()) {
            C11978e.a next2 = it2.next();
            if (C9322n.m27777a(next2.m38458d(), str)) {
                return next2;
            }
        }
        return null;
    }

    /* renamed from: f */
    private final <T> void m31794f(Deque<T> deque, T t10) {
        Runnable m31802i;
        synchronized (this) {
            if (!deque.remove(t10)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            m31802i = m31802i();
            C2037v c2037v = C2037v.f8089a;
        }
        if (m31795l() || m31802i == null) {
            return;
        }
        m31802i.run();
    }

    /* renamed from: l */
    private final boolean m31795l() {
        int i10;
        boolean z10;
        if (C10727d.f27165h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<C11978e.a> it = this.f26437e.iterator();
            C9322n.m27780d(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                C11978e.a asyncCall = it.next();
                if (this.f26438f.size() >= m31803j()) {
                    break;
                }
                if (asyncCall.m38457c().get() < m31804k()) {
                    it.remove();
                    asyncCall.m38457c().incrementAndGet();
                    C9322n.m27780d(asyncCall, "asyncCall");
                    arrayList.add(asyncCall);
                    this.f26438f.add(asyncCall);
                }
            }
            z10 = m31805m() > 0;
            C2037v c2037v = C2037v.f8089a;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((C11978e.a) arrayList.get(i10)).m38455a(m31799d());
        }
        return z10;
    }

    /* renamed from: a */
    public final synchronized void m31796a() {
        Iterator<C11978e.a> it = this.f26437e.iterator();
        while (it.hasNext()) {
            it.next().m38456b().cancel();
        }
        Iterator<C11978e.a> it2 = this.f26438f.iterator();
        while (it2.hasNext()) {
            it2.next().m38456b().cancel();
        }
        Iterator<C11978e> it3 = this.f26439g.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    /* renamed from: b */
    public final void m31797b(C11978e.a call) {
        C11978e.a m31793e;
        C9322n.m27781e(call, "call");
        synchronized (this) {
            this.f26437e.add(call);
            if (!call.m38456b().m38445p() && (m31793e = m31793e(call.m38458d())) != null) {
                call.m38459e(m31793e);
            }
            C2037v c2037v = C2037v.f8089a;
        }
        m31795l();
    }

    /* renamed from: c */
    public final synchronized void m31798c(C11978e call) {
        C9322n.m27781e(call, "call");
        this.f26439g.add(call);
    }

    /* renamed from: d */
    public final synchronized ExecutorService m31799d() {
        ExecutorService executorService;
        if (this.f26436d == null) {
            this.f26436d = new ThreadPoolExecutor(0, C5101a.e.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C10727d.m32627M(C9322n.m27787k(C10727d.f27166i, " Dispatcher"), false));
        }
        executorService = this.f26436d;
        C9322n.m27778b(executorService);
        return executorService;
    }

    /* renamed from: g */
    public final void m31800g(C11978e.a call) {
        C9322n.m27781e(call, "call");
        call.m38457c().decrementAndGet();
        m31794f(this.f26438f, call);
    }

    /* renamed from: h */
    public final void m31801h(C11978e call) {
        C9322n.m27781e(call, "call");
        m31794f(this.f26439g, call);
    }

    /* renamed from: i */
    public final synchronized Runnable m31802i() {
        return this.f26435c;
    }

    /* renamed from: j */
    public final synchronized int m31803j() {
        return this.f26433a;
    }

    /* renamed from: k */
    public final synchronized int m31804k() {
        return this.f26434b;
    }

    /* renamed from: m */
    public final synchronized int m31805m() {
        return this.f26438f.size() + this.f26439g.size();
    }
}
