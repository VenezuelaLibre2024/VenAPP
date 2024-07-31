package androidx.work.impl.utils.futures;

import androidx.concurrent.futures.C0741b;
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

/* renamed from: androidx.work.impl.utils.futures.a */
/* loaded from: classes.dex */
public abstract class AbstractC1581a<V> implements InterfaceFutureC5920f<V> {

    /* renamed from: d */
    static final boolean f6772d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    private static final Logger f6773e = Logger.getLogger(AbstractC1581a.class.getName());

    /* renamed from: f */
    static final b f6774f;

    /* renamed from: r */
    private static final Object f6775r;

    /* renamed from: a */
    volatile Object f6776a;

    /* renamed from: b */
    volatile e f6777b;

    /* renamed from: c */
    volatile i f6778c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.work.impl.utils.futures.a$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        /* renamed from: a */
        abstract boolean mo8793a(AbstractC1581a<?> abstractC1581a, e eVar, e eVar2);

        /* renamed from: b */
        abstract boolean mo8794b(AbstractC1581a<?> abstractC1581a, Object obj, Object obj2);

        /* renamed from: c */
        abstract boolean mo8795c(AbstractC1581a<?> abstractC1581a, i iVar, i iVar2);

        /* renamed from: d */
        abstract void mo8796d(i iVar, i iVar2);

        /* renamed from: e */
        abstract void mo8797e(i iVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.work.impl.utils.futures.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c */
        static final c f6779c;

        /* renamed from: d */
        static final c f6780d;

        /* renamed from: a */
        final boolean f6781a;

        /* renamed from: b */
        final Throwable f6782b;

        static {
            if (AbstractC1581a.f6772d) {
                f6780d = null;
                f6779c = null;
            } else {
                f6780d = new c(false, null);
                f6779c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th2) {
            this.f6781a = z10;
            this.f6782b = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.work.impl.utils.futures.a$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b */
        static final d f6783b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f6784a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a */
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
            this.f6784a = (Throwable) AbstractC1581a.m8777d(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.work.impl.utils.futures.a$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d */
        static final e f6785d = new e(null, null);

        /* renamed from: a */
        final Runnable f6786a;

        /* renamed from: b */
        final Executor f6787b;

        /* renamed from: c */
        e f6788c;

        e(Runnable runnable, Executor executor) {
            this.f6786a = runnable;
            this.f6787b = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$f */
    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<i, Thread> f6789a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<i, i> f6790b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<AbstractC1581a, i> f6791c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<AbstractC1581a, e> f6792d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<AbstractC1581a, Object> f6793e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC1581a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC1581a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC1581a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f6789a = atomicReferenceFieldUpdater;
            this.f6790b = atomicReferenceFieldUpdater2;
            this.f6791c = atomicReferenceFieldUpdater3;
            this.f6792d = atomicReferenceFieldUpdater4;
            this.f6793e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1581a.b
        /* renamed from: a */
        boolean mo8793a(AbstractC1581a<?> abstractC1581a, e eVar, e eVar2) {
            return C0741b.m3751a(this.f6792d, abstractC1581a, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1581a.b
        /* renamed from: b */
        boolean mo8794b(AbstractC1581a<?> abstractC1581a, Object obj, Object obj2) {
            return C0741b.m3751a(this.f6793e, abstractC1581a, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1581a.b
        /* renamed from: c */
        boolean mo8795c(AbstractC1581a<?> abstractC1581a, i iVar, i iVar2) {
            return C0741b.m3751a(this.f6791c, abstractC1581a, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1581a.b
        /* renamed from: d */
        void mo8796d(i iVar, i iVar2) {
            this.f6790b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1581a.b
        /* renamed from: e */
        void mo8797e(i iVar, Thread thread) {
            this.f6789a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.work.impl.utils.futures.a$g */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: a */
        final AbstractC1581a<V> f6794a;

        /* renamed from: b */
        final InterfaceFutureC5920f<? extends V> f6795b;

        g(AbstractC1581a<V> abstractC1581a, InterfaceFutureC5920f<? extends V> interfaceFutureC5920f) {
            this.f6794a = abstractC1581a;
            this.f6795b = interfaceFutureC5920f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6794a.f6776a != this) {
                return;
            }
            if (AbstractC1581a.f6774f.mo8794b(this.f6794a, this, AbstractC1581a.m8782i(this.f6795b))) {
                AbstractC1581a.m8779f(this.f6794a);
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$h */
    /* loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1581a.b
        /* renamed from: a */
        boolean mo8793a(AbstractC1581a<?> abstractC1581a, e eVar, e eVar2) {
            synchronized (abstractC1581a) {
                if (abstractC1581a.f6777b != eVar) {
                    return false;
                }
                abstractC1581a.f6777b = eVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1581a.b
        /* renamed from: b */
        boolean mo8794b(AbstractC1581a<?> abstractC1581a, Object obj, Object obj2) {
            synchronized (abstractC1581a) {
                if (abstractC1581a.f6776a != obj) {
                    return false;
                }
                abstractC1581a.f6776a = obj2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1581a.b
        /* renamed from: c */
        boolean mo8795c(AbstractC1581a<?> abstractC1581a, i iVar, i iVar2) {
            synchronized (abstractC1581a) {
                if (abstractC1581a.f6778c != iVar) {
                    return false;
                }
                abstractC1581a.f6778c = iVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1581a.b
        /* renamed from: d */
        void mo8796d(i iVar, i iVar2) {
            iVar.f6798b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractC1581a.b
        /* renamed from: e */
        void mo8797e(i iVar, Thread thread) {
            iVar.f6797a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.work.impl.utils.futures.a$i */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c */
        static final i f6796c = new i(false);

        /* renamed from: a */
        volatile Thread f6797a;

        /* renamed from: b */
        volatile i f6798b;

        i() {
            AbstractC1581a.f6774f.mo8797e(this, Thread.currentThread());
        }

        i(boolean z10) {
        }

        /* renamed from: a */
        void m8798a(i iVar) {
            AbstractC1581a.f6774f.mo8796d(this, iVar);
        }

        /* renamed from: b */
        void m8799b() {
            Thread thread = this.f6797a;
            if (thread != null) {
                this.f6797a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1581a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1581a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1581a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        f6774f = hVar;
        if (th != null) {
            f6773e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f6775r = new Object();
    }

    /* renamed from: a */
    private void m8775a(StringBuilder sb2) {
        String str = "]";
        try {
            Object m8783j = m8783j(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(m8786r(m8783j));
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

    /* renamed from: c */
    private static CancellationException m8776c(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* renamed from: d */
    static <T> T m8777d(T t10) {
        t10.getClass();
        return t10;
    }

    /* renamed from: e */
    private e m8778e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f6777b;
        } while (!f6774f.mo8793a(this, eVar2, e.f6785d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f6788c;
            eVar4.f6788c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* renamed from: f */
    static void m8779f(AbstractC1581a<?> abstractC1581a) {
        e eVar = null;
        while (true) {
            abstractC1581a.m8784m();
            abstractC1581a.m8787b();
            e m8778e = abstractC1581a.m8778e(eVar);
            while (m8778e != null) {
                eVar = m8778e.f6788c;
                Runnable runnable = m8778e.f6786a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC1581a = gVar.f6794a;
                    if (abstractC1581a.f6776a == gVar) {
                        if (f6774f.mo8794b(abstractC1581a, gVar, m8782i(gVar.f6795b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m8780g(runnable, m8778e.f6787b);
                }
                m8778e = eVar;
            }
            return;
        }
    }

    /* renamed from: g */
    private static void m8780g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f6773e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    private V m8781h(Object obj) {
        if (obj instanceof c) {
            throw m8776c("Task was cancelled.", ((c) obj).f6782b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f6784a);
        }
        if (obj == f6775r) {
            return null;
        }
        return obj;
    }

    /* renamed from: i */
    static Object m8782i(InterfaceFutureC5920f<?> interfaceFutureC5920f) {
        if (interfaceFutureC5920f instanceof AbstractC1581a) {
            Object obj = ((AbstractC1581a) interfaceFutureC5920f).f6776a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f6781a ? cVar.f6782b != null ? new c(false, cVar.f6782b) : c.f6780d : obj;
        }
        boolean isCancelled = interfaceFutureC5920f.isCancelled();
        if ((!f6772d) && isCancelled) {
            return c.f6780d;
        }
        try {
            Object m8783j = m8783j(interfaceFutureC5920f);
            return m8783j == null ? f6775r : m8783j;
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

    /* renamed from: j */
    private static <V> V m8783j(Future<V> future) {
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

    /* renamed from: m */
    private void m8784m() {
        i iVar;
        do {
            iVar = this.f6778c;
        } while (!f6774f.mo8795c(this, iVar, i.f6796c));
        while (iVar != null) {
            iVar.m8799b();
            iVar = iVar.f6798b;
        }
    }

    /* renamed from: n */
    private void m8785n(i iVar) {
        iVar.f6797a = null;
        while (true) {
            i iVar2 = this.f6778c;
            if (iVar2 == i.f6796c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f6798b;
                if (iVar2.f6797a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f6798b = iVar4;
                    if (iVar3.f6797a == null) {
                        break;
                    }
                } else if (!f6774f.mo8795c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* renamed from: r */
    private String m8786r(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC5920f
    public final void addListener(Runnable runnable, Executor executor) {
        m8777d(runnable);
        m8777d(executor);
        e eVar = this.f6777b;
        if (eVar != e.f6785d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f6788c = eVar;
                if (f6774f.mo8793a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f6777b;
                }
            } while (eVar != e.f6785d);
        }
        m8780g(runnable, executor);
    }

    /* renamed from: b */
    protected void m8787b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f6776a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f6772d ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f6779c : c.f6780d;
        AbstractC1581a<V> abstractC1581a = this;
        boolean z11 = false;
        while (true) {
            if (f6774f.mo8794b(abstractC1581a, obj, cVar)) {
                if (z10) {
                    abstractC1581a.m8788k();
                }
                m8779f(abstractC1581a);
                if (!(obj instanceof g)) {
                    return true;
                }
                InterfaceFutureC5920f<? extends V> interfaceFutureC5920f = ((g) obj).f6795b;
                if (!(interfaceFutureC5920f instanceof AbstractC1581a)) {
                    interfaceFutureC5920f.cancel(z10);
                    return true;
                }
                abstractC1581a = (AbstractC1581a) interfaceFutureC5920f;
                obj = abstractC1581a.f6776a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = abstractC1581a.f6776a;
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
        Object obj2 = this.f6776a;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return m8781h(obj2);
        }
        i iVar = this.f6778c;
        if (iVar != i.f6796c) {
            i iVar2 = new i();
            do {
                iVar2.m8798a(iVar);
                if (f6774f.mo8795c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m8785n(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f6776a;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return m8781h(obj);
                }
                iVar = this.f6778c;
            } while (iVar != i.f6796c);
        }
        return m8781h(this.f6776a);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f6776a;
        if ((obj != null) && (!(obj instanceof g))) {
            return m8781h(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f6778c;
            if (iVar != i.f6796c) {
                i iVar2 = new i();
                do {
                    iVar2.m8798a(iVar);
                    if (f6774f.mo8795c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m8785n(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f6776a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m8781h(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m8785n(iVar2);
                    } else {
                        iVar = this.f6778c;
                    }
                } while (iVar != i.f6796c);
            }
            return m8781h(this.f6776a);
        }
        while (nanos > 0) {
            Object obj3 = this.f6776a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return m8781h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC1581a = toString();
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
        throw new TimeoutException(str + " for " + abstractC1581a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6776a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f6776a != null);
    }

    /* renamed from: k */
    protected void m8788k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    protected String m8789l() {
        Object obj = this.f6776a;
        if (obj instanceof g) {
            return "setFuture=[" + m8786r(((g) obj).f6795b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo8790o(V v10) {
        if (v10 == null) {
            v10 = (V) f6775r;
        }
        if (!f6774f.mo8794b(this, null, v10)) {
            return false;
        }
        m8779f(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo8791p(Throwable th2) {
        if (!f6774f.mo8794b(this, null, new d((Throwable) m8777d(th2)))) {
            return false;
        }
        m8779f(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo8792q(InterfaceFutureC5920f<? extends V> interfaceFutureC5920f) {
        d dVar;
        m8777d(interfaceFutureC5920f);
        Object obj = this.f6776a;
        if (obj == null) {
            if (interfaceFutureC5920f.isDone()) {
                if (!f6774f.mo8794b(this, null, m8782i(interfaceFutureC5920f))) {
                    return false;
                }
                m8779f(this);
                return true;
            }
            g gVar = new g(this, interfaceFutureC5920f);
            if (f6774f.mo8794b(this, null, gVar)) {
                try {
                    interfaceFutureC5920f.addListener(gVar, EnumC1582b.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Throwable unused) {
                        dVar = d.f6783b;
                    }
                    f6774f.mo8794b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f6776a;
        }
        if (obj instanceof c) {
            interfaceFutureC5920f.cancel(((c) obj).f6781a);
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
                    str = m8789l();
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
            m8775a(sb2);
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append(str2);
        sb2.append("]");
        return sb2.toString();
    }
}
