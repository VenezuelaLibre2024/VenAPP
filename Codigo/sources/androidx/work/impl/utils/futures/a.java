package androidx.work.impl.utils.futures;

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
    static final boolean f5917d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f5918e = Logger.getLogger(a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    static final b f5919f;

    /* renamed from: r, reason: collision with root package name */
    private static final Object f5920r;

    /* renamed from: a, reason: collision with root package name */
    volatile Object f5921a;

    /* renamed from: b, reason: collision with root package name */
    volatile e f5922b;

    /* renamed from: c, reason: collision with root package name */
    volatile i f5923c;

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
        static final c f5924c;

        /* renamed from: d, reason: collision with root package name */
        static final c f5925d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f5926a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f5927b;

        static {
            if (a.f5917d) {
                f5925d = null;
                f5924c = null;
            } else {
                f5925d = new c(false, null);
                f5924c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th2) {
            this.f5926a = z10;
            this.f5927b = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f5928b = new d(new C0098a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f5929a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0098a extends Throwable {
            C0098a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f5929a = (Throwable) a.d(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f5930d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f5931a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f5932b;

        /* renamed from: c, reason: collision with root package name */
        e f5933c;

        e(Runnable runnable, Executor executor) {
            this.f5931a = runnable;
            this.f5932b = executor;
        }
    }

    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f5934a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f5935b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f5936c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f5937d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f5938e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f5934a = atomicReferenceFieldUpdater;
            this.f5935b = atomicReferenceFieldUpdater2;
            this.f5936c = atomicReferenceFieldUpdater3;
            this.f5937d = atomicReferenceFieldUpdater4;
            this.f5938e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f5937d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f5938e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f5936c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f5935b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f5934a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final a<V> f5939a;

        /* renamed from: b, reason: collision with root package name */
        final com.google.common.util.concurrent.f<? extends V> f5940b;

        g(a<V> aVar, com.google.common.util.concurrent.f<? extends V> fVar) {
            this.f5939a = aVar;
            this.f5940b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f5939a.f5921a != this) {
                return;
            }
            if (a.f5919f.b(this.f5939a, this, a.i(this.f5940b))) {
                a.f(this.f5939a);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f5922b != eVar) {
                    return false;
                }
                aVar.f5922b = eVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f5921a != obj) {
                    return false;
                }
                aVar.f5921a = obj2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f5923c != iVar) {
                    return false;
                }
                aVar.f5923c = iVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f5943b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f5942a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f5941c = new i(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f5942a;

        /* renamed from: b, reason: collision with root package name */
        volatile i f5943b;

        i() {
            a.f5919f.e(this, Thread.currentThread());
        }

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f5919f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f5942a;
            if (thread != null) {
                this.f5942a = null;
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
        f5919f = hVar;
        if (th != null) {
            f5918e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f5920r = new Object();
    }

    private void a(StringBuilder sb2) {
        String str = "]";
        try {
            Object j10 = j(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(r(j10));
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

    private static CancellationException c(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    static <T> T d(T t10) {
        t10.getClass();
        return t10;
    }

    private e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f5922b;
        } while (!f5919f.a(this, eVar2, e.f5930d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f5933c;
            eVar4.f5933c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void f(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.m();
            aVar.b();
            e e10 = aVar.e(eVar);
            while (e10 != null) {
                eVar = e10.f5933c;
                Runnable runnable = e10.f5931a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f5939a;
                    if (aVar.f5921a == gVar) {
                        if (f5919f.b(aVar, gVar, i(gVar.f5940b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, e10.f5932b);
                }
                e10 = eVar;
            }
            return;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f5918e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V h(Object obj) {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f5927b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f5929a);
        }
        if (obj == f5920r) {
            return null;
        }
        return obj;
    }

    static Object i(com.google.common.util.concurrent.f<?> fVar) {
        if (fVar instanceof a) {
            Object obj = ((a) fVar).f5921a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f5926a ? cVar.f5927b != null ? new c(false, cVar.f5927b) : c.f5925d : obj;
        }
        boolean isCancelled = fVar.isCancelled();
        if ((!f5917d) && isCancelled) {
            return c.f5925d;
        }
        try {
            Object j10 = j(fVar);
            return j10 == null ? f5920r : j10;
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

    private static <V> V j(Future<V> future) {
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

    private void m() {
        i iVar;
        do {
            iVar = this.f5923c;
        } while (!f5919f.c(this, iVar, i.f5941c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f5943b;
        }
    }

    private void n(i iVar) {
        iVar.f5942a = null;
        while (true) {
            i iVar2 = this.f5923c;
            if (iVar2 == i.f5941c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f5943b;
                if (iVar2.f5942a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f5943b = iVar4;
                    if (iVar3.f5942a == null) {
                        break;
                    }
                } else if (!f5919f.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String r(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.f
    public final void addListener(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f5922b;
        if (eVar != e.f5930d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f5933c = eVar;
                if (f5919f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f5922b;
                }
            } while (eVar != e.f5930d);
        }
        g(runnable, executor);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f5921a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f5917d ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f5924c : c.f5925d;
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f5919f.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.k();
                }
                f(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                com.google.common.util.concurrent.f<? extends V> fVar = ((g) obj).f5940b;
                if (!(fVar instanceof a)) {
                    fVar.cancel(z10);
                    return true;
                }
                aVar = (a) fVar;
                obj = aVar.f5921a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = aVar.f5921a;
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
        Object obj2 = this.f5921a;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return h(obj2);
        }
        i iVar = this.f5923c;
        if (iVar != i.f5941c) {
            i iVar2 = new i();
            do {
                iVar2.a(iVar);
                if (f5919f.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            n(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f5921a;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return h(obj);
                }
                iVar = this.f5923c;
            } while (iVar != i.f5941c);
        }
        return h(this.f5921a);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f5921a;
        if ((obj != null) && (!(obj instanceof g))) {
            return h(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f5923c;
            if (iVar != i.f5941c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f5919f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                n(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f5921a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return h(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        n(iVar2);
                    } else {
                        iVar = this.f5923c;
                    }
                } while (iVar != i.f5941c);
            }
            return h(this.f5921a);
        }
        while (nanos > 0) {
            Object obj3 = this.f5921a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return h(obj3);
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5921a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f5921a != null);
    }

    protected void k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String l() {
        Object obj = this.f5921a;
        if (obj instanceof g) {
            return "setFuture=[" + r(((g) obj).f5940b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean o(V v10) {
        if (v10 == null) {
            v10 = (V) f5920r;
        }
        if (!f5919f.b(this, null, v10)) {
            return false;
        }
        f(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p(Throwable th2) {
        if (!f5919f.b(this, null, new d((Throwable) d(th2)))) {
            return false;
        }
        f(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(com.google.common.util.concurrent.f<? extends V> fVar) {
        d dVar;
        d(fVar);
        Object obj = this.f5921a;
        if (obj == null) {
            if (fVar.isDone()) {
                if (!f5919f.b(this, null, i(fVar))) {
                    return false;
                }
                f(this);
                return true;
            }
            g gVar = new g(this, fVar);
            if (f5919f.b(this, null, gVar)) {
                try {
                    fVar.addListener(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Throwable unused) {
                        dVar = d.f5928b;
                    }
                    f5919f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f5921a;
        }
        if (obj instanceof c) {
            fVar.cancel(((c) obj).f5926a);
        }
        return false;
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
                    str = l();
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
            a(sb2);
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append(str2);
        sb2.append("]");
        return sb2.toString();
    }
}
