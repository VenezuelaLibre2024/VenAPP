package androidx.concurrent.futures;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class a<V> implements com.google.common.util.concurrent.f<V> {

    /* renamed from: d, reason: collision with root package name */
    static final boolean f2882d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f2883e = Logger.getLogger(a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    static final b f2884f;

    /* renamed from: r, reason: collision with root package name */
    private static final Object f2885r;

    /* renamed from: a, reason: collision with root package name */
    volatile Object f2886a;

    /* renamed from: b, reason: collision with root package name */
    volatile e f2887b;

    /* renamed from: c, reason: collision with root package name */
    volatile i f2888c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f2889c;

        /* renamed from: d, reason: collision with root package name */
        static final c f2890d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f2891a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f2892b;

        static {
            if (a.f2882d) {
                f2890d = null;
                f2889c = null;
            } else {
                f2890d = new c(false, null);
                f2889c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th2) {
            this.f2891a = z10;
            this.f2892b = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f2893b = new d(new C0031a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f2894a;

        /* renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0031a extends Throwable {
            C0031a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f2894a = (Throwable) a.l(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f2895d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f2896a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f2897b;

        /* renamed from: c, reason: collision with root package name */
        e f2898c;

        e(Runnable runnable, Executor executor) {
            this.f2896a = runnable;
            this.f2897b = executor;
        }
    }

    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f2899a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f2900b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f2901c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f2902d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f2903e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f2899a = atomicReferenceFieldUpdater;
            this.f2900b = atomicReferenceFieldUpdater2;
            this.f2901c = atomicReferenceFieldUpdater3;
            this.f2902d = atomicReferenceFieldUpdater4;
            this.f2903e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f2902d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f2903e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f2901c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            this.f2900b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            this.f2899a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final a<V> f2904a;

        /* renamed from: b, reason: collision with root package name */
        final com.google.common.util.concurrent.f<? extends V> f2905b;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2904a.f2886a != this) {
                return;
            }
            if (a.f2884f.b(this.f2904a, this, a.q(this.f2905b))) {
                a.n(this.f2904a);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f2887b != eVar) {
                    return false;
                }
                aVar.f2887b = eVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f2886a != obj) {
                    return false;
                }
                aVar.f2886a = obj2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f2888c != iVar) {
                    return false;
                }
                aVar.f2888c = iVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f2908b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f2907a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f2906c = new i(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f2907a;

        /* renamed from: b, reason: collision with root package name */
        volatile i f2908b;

        i() {
            a.f2884f.e(this, Thread.currentThread());
        }

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f2884f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f2907a;
            if (thread != null) {
                this.f2907a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        f2884f = hVar;
        if (th != null) {
            f2883e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2885r = new Object();
    }

    private void b(StringBuilder sb2) {
        String str = "]";
        try {
            Object r10 = r(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(y(r10));
            sb2.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb2.append(str);
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            str = " thrown from get()]";
            sb2.append(str);
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append(str);
        }
    }

    private static CancellationException i(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    static <T> T l(T t10) {
        t10.getClass();
        return t10;
    }

    private e m(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f2887b;
        } while (!f2884f.a(this, eVar2, e.f2895d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f2898c;
            eVar4.f2898c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void n(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.u();
            aVar.h();
            e m10 = aVar.m(eVar);
            while (m10 != null) {
                eVar = m10.f2898c;
                Runnable runnable = m10.f2896a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f2904a;
                    if (aVar.f2886a == gVar) {
                        if (f2884f.b(aVar, gVar, q(gVar.f2905b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    o(runnable, m10.f2897b);
                }
                m10 = eVar;
            }
            return;
        }
    }

    private static void o(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f2883e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V p(Object obj) {
        if (obj instanceof c) {
            throw i("Task was cancelled.", ((c) obj).f2892b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f2894a);
        }
        if (obj == f2885r) {
            return null;
        }
        return obj;
    }

    static Object q(com.google.common.util.concurrent.f<?> fVar) {
        if (fVar instanceof a) {
            Object obj = ((a) fVar).f2886a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f2891a ? cVar.f2892b != null ? new c(false, cVar.f2892b) : c.f2890d : obj;
        }
        boolean isCancelled = fVar.isCancelled();
        if ((!f2882d) && isCancelled) {
            return c.f2890d;
        }
        try {
            Object r10 = r(fVar);
            return r10 == null ? f2885r : r10;
        } catch (CancellationException e10) {
            if (isCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + fVar, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    static <V> V r(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    private void u() {
        i iVar;
        do {
            iVar = this.f2888c;
        } while (!f2884f.c(this, iVar, i.f2906c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f2908b;
        }
    }

    private void v(i iVar) {
        iVar.f2907a = null;
        while (true) {
            i iVar2 = this.f2888c;
            if (iVar2 == i.f2906c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f2908b;
                if (iVar2.f2907a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f2908b = iVar4;
                    if (iVar3.f2907a == null) {
                        break;
                    }
                } else if (!f2884f.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String y(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.f
    public final void addListener(Runnable runnable, Executor executor) {
        l(runnable);
        l(executor);
        e eVar = this.f2887b;
        if (eVar != e.f2895d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f2898c = eVar;
                if (f2884f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f2887b;
                }
            } while (eVar != e.f2895d);
        }
        o(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f2886a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f2882d ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f2889c : c.f2890d;
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f2884f.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.s();
                }
                n(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                com.google.common.util.concurrent.f<? extends V> fVar = ((g) obj).f2905b;
                if (!(fVar instanceof a)) {
                    fVar.cancel(z10);
                    return true;
                }
                aVar = (a) fVar;
                obj = aVar.f2886a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = aVar.f2886a;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f2886a;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return p(obj2);
        }
        i iVar = this.f2888c;
        if (iVar != i.f2906c) {
            i iVar2 = new i();
            do {
                iVar2.a(iVar);
                if (f2884f.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            v(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f2886a;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return p(obj);
                }
                iVar = this.f2888c;
            } while (iVar != i.f2906c);
        }
        return p(this.f2886a);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f2886a;
        if ((obj != null) && (!(obj instanceof g))) {
            return p(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f2888c;
            if (iVar != i.f2906c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f2884f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                v(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f2886a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return p(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        v(iVar2);
                    } else {
                        iVar = this.f2888c;
                    }
                } while (iVar != i.f2906c);
            }
            return p(this.f2886a);
        }
        while (nanos > 0) {
            Object obj3 = this.f2886a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return p(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(convert);
            boolean z10 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + aVar);
    }

    protected void h() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2886a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f2886a != null);
    }

    protected void s() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String t() {
        Object obj = this.f2886a;
        if (obj instanceof g) {
            return "setFuture=[" + y(((g) obj).f2905b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (!isCancelled()) {
            if (!isDone()) {
                try {
                    str = t();
                } catch (RuntimeException e10) {
                    str = "Exception thrown from implementation: " + e10.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb2.append("PENDING, info=[");
                    sb2.append(str);
                    sb2.append("]");
                    sb2.append("]");
                    return sb2.toString();
                }
                str2 = isDone() ? "CANCELLED" : "PENDING";
            }
            b(sb2);
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append(str2);
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean w(V v10) {
        if (v10 == null) {
            v10 = (V) f2885r;
        }
        if (!f2884f.b(this, null, v10)) {
            return false;
        }
        n(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean x(Throwable th2) {
        if (!f2884f.b(this, null, new d((Throwable) l(th2)))) {
            return false;
        }
        n(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean z() {
        Object obj = this.f2886a;
        return (obj instanceof c) && ((c) obj).f2891a;
    }
}
