package androidx.concurrent.futures;

import com.google.common.util.concurrent.InterfaceFutureC5920f;
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

/* renamed from: androidx.concurrent.futures.a */
/* loaded from: classes.dex */
public abstract class AbstractC0740a<V> implements InterfaceFutureC5920f<V> {

    /* renamed from: d */
    static final boolean f3227d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    private static final Logger f3228e = Logger.getLogger(AbstractC0740a.class.getName());

    /* renamed from: f */
    static final b f3229f;

    /* renamed from: r */
    private static final Object f3230r;

    /* renamed from: a */
    volatile Object f3231a;

    /* renamed from: b */
    volatile e f3232b;

    /* renamed from: c */
    volatile i f3233c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        /* renamed from: a */
        abstract boolean mo3744a(AbstractC0740a<?> abstractC0740a, e eVar, e eVar2);

        /* renamed from: b */
        abstract boolean mo3745b(AbstractC0740a<?> abstractC0740a, Object obj, Object obj2);

        /* renamed from: c */
        abstract boolean mo3746c(AbstractC0740a<?> abstractC0740a, i iVar, i iVar2);

        /* renamed from: d */
        abstract void mo3747d(i iVar, i iVar2);

        /* renamed from: e */
        abstract void mo3748e(i iVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c */
        static final c f3234c;

        /* renamed from: d */
        static final c f3235d;

        /* renamed from: a */
        final boolean f3236a;

        /* renamed from: b */
        final Throwable f3237b;

        static {
            if (AbstractC0740a.f3227d) {
                f3235d = null;
                f3234c = null;
            } else {
                f3235d = new c(false, null);
                f3234c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th2) {
            this.f3236a = z10;
            this.f3237b = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b */
        static final d f3238b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f3239a;

        /* renamed from: androidx.concurrent.futures.a$d$a */
        /* loaded from: classes.dex */
        class a extends Throwable {
            a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f3239a = (Throwable) AbstractC0740a.m3728l(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d */
        static final e f3240d = new e(null, null);

        /* renamed from: a */
        final Runnable f3241a;

        /* renamed from: b */
        final Executor f3242b;

        /* renamed from: c */
        e f3243c;

        e(Runnable runnable, Executor executor) {
            this.f3241a = runnable;
            this.f3242b = executor;
        }
    }

    /* renamed from: androidx.concurrent.futures.a$f */
    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<i, Thread> f3244a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<i, i> f3245b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<AbstractC0740a, i> f3246c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<AbstractC0740a, e> f3247d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<AbstractC0740a, Object> f3248e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC0740a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC0740a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC0740a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f3244a = atomicReferenceFieldUpdater;
            this.f3245b = atomicReferenceFieldUpdater2;
            this.f3246c = atomicReferenceFieldUpdater3;
            this.f3247d = atomicReferenceFieldUpdater4;
            this.f3248e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractC0740a.b
        /* renamed from: a */
        boolean mo3744a(AbstractC0740a<?> abstractC0740a, e eVar, e eVar2) {
            return C0741b.m3751a(this.f3247d, abstractC0740a, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC0740a.b
        /* renamed from: b */
        boolean mo3745b(AbstractC0740a<?> abstractC0740a, Object obj, Object obj2) {
            return C0741b.m3751a(this.f3248e, abstractC0740a, obj, obj2);
        }

        @Override // androidx.concurrent.futures.AbstractC0740a.b
        /* renamed from: c */
        boolean mo3746c(AbstractC0740a<?> abstractC0740a, i iVar, i iVar2) {
            return C0741b.m3751a(this.f3246c, abstractC0740a, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC0740a.b
        /* renamed from: d */
        void mo3747d(i iVar, i iVar2) {
            this.f3245b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC0740a.b
        /* renamed from: e */
        void mo3748e(i iVar, Thread thread) {
            this.f3244a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$g */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: a */
        final AbstractC0740a<V> f3249a;

        /* renamed from: b */
        final InterfaceFutureC5920f<? extends V> f3250b;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3249a.f3231a != this) {
                return;
            }
            if (AbstractC0740a.f3229f.mo3745b(this.f3249a, this, AbstractC0740a.m3733q(this.f3250b))) {
                AbstractC0740a.m3730n(this.f3249a);
            }
        }
    }

    /* renamed from: androidx.concurrent.futures.a$h */
    /* loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.AbstractC0740a.b
        /* renamed from: a */
        boolean mo3744a(AbstractC0740a<?> abstractC0740a, e eVar, e eVar2) {
            synchronized (abstractC0740a) {
                if (abstractC0740a.f3232b != eVar) {
                    return false;
                }
                abstractC0740a.f3232b = eVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractC0740a.b
        /* renamed from: b */
        boolean mo3745b(AbstractC0740a<?> abstractC0740a, Object obj, Object obj2) {
            synchronized (abstractC0740a) {
                if (abstractC0740a.f3231a != obj) {
                    return false;
                }
                abstractC0740a.f3231a = obj2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractC0740a.b
        /* renamed from: c */
        boolean mo3746c(AbstractC0740a<?> abstractC0740a, i iVar, i iVar2) {
            synchronized (abstractC0740a) {
                if (abstractC0740a.f3233c != iVar) {
                    return false;
                }
                abstractC0740a.f3233c = iVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractC0740a.b
        /* renamed from: d */
        void mo3747d(i iVar, i iVar2) {
            iVar.f3253b = iVar2;
        }

        @Override // androidx.concurrent.futures.AbstractC0740a.b
        /* renamed from: e */
        void mo3748e(i iVar, Thread thread) {
            iVar.f3252a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$i */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c */
        static final i f3251c = new i(false);

        /* renamed from: a */
        volatile Thread f3252a;

        /* renamed from: b */
        volatile i f3253b;

        i() {
            AbstractC0740a.f3229f.mo3748e(this, Thread.currentThread());
        }

        i(boolean z10) {
        }

        /* renamed from: a */
        void m3749a(i iVar) {
            AbstractC0740a.f3229f.mo3747d(this, iVar);
        }

        /* renamed from: b */
        void m3750b() {
            Thread thread = this.f3252a;
            if (thread != null) {
                this.f3252a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0740a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0740a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0740a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        f3229f = hVar;
        if (th != null) {
            f3228e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3230r = new Object();
    }

    /* renamed from: b */
    private void m3726b(StringBuilder sb2) {
        String str = "]";
        try {
            Object m3734r = m3734r(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(m3737y(m3734r));
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

    /* renamed from: i */
    private static CancellationException m3727i(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* renamed from: l */
    static <T> T m3728l(T t10) {
        t10.getClass();
        return t10;
    }

    /* renamed from: m */
    private e m3729m(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f3232b;
        } while (!f3229f.mo3744a(this, eVar2, e.f3240d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f3243c;
            eVar4.f3243c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* renamed from: n */
    static void m3730n(AbstractC0740a<?> abstractC0740a) {
        e eVar = null;
        while (true) {
            abstractC0740a.m3735u();
            abstractC0740a.mo3738h();
            e m3729m = abstractC0740a.m3729m(eVar);
            while (m3729m != null) {
                eVar = m3729m.f3243c;
                Runnable runnable = m3729m.f3241a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC0740a = gVar.f3249a;
                    if (abstractC0740a.f3231a == gVar) {
                        if (f3229f.mo3745b(abstractC0740a, gVar, m3733q(gVar.f3250b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m3731o(runnable, m3729m.f3242b);
                }
                m3729m = eVar;
            }
            return;
        }
    }

    /* renamed from: o */
    private static void m3731o(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f3228e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    private V m3732p(Object obj) {
        if (obj instanceof c) {
            throw m3727i("Task was cancelled.", ((c) obj).f3237b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f3239a);
        }
        if (obj == f3230r) {
            return null;
        }
        return obj;
    }

    /* renamed from: q */
    static Object m3733q(InterfaceFutureC5920f<?> interfaceFutureC5920f) {
        if (interfaceFutureC5920f instanceof AbstractC0740a) {
            Object obj = ((AbstractC0740a) interfaceFutureC5920f).f3231a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f3236a ? cVar.f3237b != null ? new c(false, cVar.f3237b) : c.f3235d : obj;
        }
        boolean isCancelled = interfaceFutureC5920f.isCancelled();
        if ((!f3227d) && isCancelled) {
            return c.f3235d;
        }
        try {
            Object m3734r = m3734r(interfaceFutureC5920f);
            return m3734r == null ? f3230r : m3734r;
        } catch (CancellationException e10) {
            if (isCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC5920f, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    /* renamed from: r */
    static <V> V m3734r(Future<V> future) {
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

    /* renamed from: u */
    private void m3735u() {
        i iVar;
        do {
            iVar = this.f3233c;
        } while (!f3229f.mo3746c(this, iVar, i.f3251c));
        while (iVar != null) {
            iVar.m3750b();
            iVar = iVar.f3253b;
        }
    }

    /* renamed from: v */
    private void m3736v(i iVar) {
        iVar.f3252a = null;
        while (true) {
            i iVar2 = this.f3233c;
            if (iVar2 == i.f3251c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f3253b;
                if (iVar2.f3252a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f3253b = iVar4;
                    if (iVar3.f3252a == null) {
                        break;
                    }
                } else if (!f3229f.mo3746c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* renamed from: y */
    private String m3737y(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC5920f
    public final void addListener(Runnable runnable, Executor executor) {
        m3728l(runnable);
        m3728l(executor);
        e eVar = this.f3232b;
        if (eVar != e.f3240d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f3243c = eVar;
                if (f3229f.mo3744a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f3232b;
                }
            } while (eVar != e.f3240d);
        }
        m3731o(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f3231a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f3227d ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f3234c : c.f3235d;
        AbstractC0740a<V> abstractC0740a = this;
        boolean z11 = false;
        while (true) {
            if (f3229f.mo3745b(abstractC0740a, obj, cVar)) {
                if (z10) {
                    abstractC0740a.m3739s();
                }
                m3730n(abstractC0740a);
                if (!(obj instanceof g)) {
                    return true;
                }
                InterfaceFutureC5920f<? extends V> interfaceFutureC5920f = ((g) obj).f3250b;
                if (!(interfaceFutureC5920f instanceof AbstractC0740a)) {
                    interfaceFutureC5920f.cancel(z10);
                    return true;
                }
                abstractC0740a = (AbstractC0740a) interfaceFutureC5920f;
                obj = abstractC0740a.f3231a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = abstractC0740a.f3231a;
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
        Object obj2 = this.f3231a;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return m3732p(obj2);
        }
        i iVar = this.f3233c;
        if (iVar != i.f3251c) {
            i iVar2 = new i();
            do {
                iVar2.m3749a(iVar);
                if (f3229f.mo3746c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m3736v(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f3231a;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return m3732p(obj);
                }
                iVar = this.f3233c;
            } while (iVar != i.f3251c);
        }
        return m3732p(this.f3231a);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3231a;
        if ((obj != null) && (!(obj instanceof g))) {
            return m3732p(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f3233c;
            if (iVar != i.f3251c) {
                i iVar2 = new i();
                do {
                    iVar2.m3749a(iVar);
                    if (f3229f.mo3746c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m3736v(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3231a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m3732p(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m3736v(iVar2);
                    } else {
                        iVar = this.f3233c;
                    }
                } while (iVar != i.f3251c);
            }
            return m3732p(this.f3231a);
        }
        while (nanos > 0) {
            Object obj3 = this.f3231a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return m3732p(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC0740a = toString();
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
        throw new TimeoutException(str + " for " + abstractC0740a);
    }

    /* renamed from: h */
    protected void mo3738h() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3231a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f3231a != null);
    }

    /* renamed from: s */
    protected void m3739s() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    protected String mo3740t() {
        Object obj = this.f3231a;
        if (obj instanceof g) {
            return "setFuture=[" + m3737y(((g) obj).f3250b) + "]";
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
                    str = mo3740t();
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
            m3726b(sb2);
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append(str2);
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public boolean mo3741w(V v10) {
        if (v10 == null) {
            v10 = (V) f3230r;
        }
        if (!f3229f.mo3745b(this, null, v10)) {
            return false;
        }
        m3730n(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public boolean mo3742x(Throwable th2) {
        if (!f3229f.mo3745b(this, null, new d((Throwable) m3728l(th2)))) {
            return false;
        }
        m3730n(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean m3743z() {
        Object obj = this.f3231a;
        return (obj instanceof c) && ((c) obj).f3236a;
    }
}
