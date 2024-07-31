package com.google.common.util.concurrent;

import androidx.concurrent.futures.C0741b;
import com.google.android.gms.internal.ads.C5354k;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import p082eb.C7159o;
import p159ib.AbstractC7955a;
import p159ib.C7956b;
import sun.misc.Unsafe;

/* renamed from: com.google.common.util.concurrent.a */
/* loaded from: classes2.dex */
public abstract class AbstractC5915a<V> extends AbstractC7955a implements InterfaceFutureC5920f<V> {

    /* renamed from: d */
    static final boolean f12440d;

    /* renamed from: e */
    private static final Logger f12441e;

    /* renamed from: f */
    private static final b f12442f;

    /* renamed from: r */
    private static final Object f12443r;

    /* renamed from: a */
    private volatile Object f12444a;

    /* renamed from: b */
    private volatile e f12445b;

    /* renamed from: c */
    private volatile l f12446c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.util.concurrent.a$b */
    /* loaded from: classes2.dex */
    public static abstract class b {
        private b() {
        }

        /* renamed from: a */
        abstract boolean mo15165a(AbstractC5915a<?> abstractC5915a, e eVar, e eVar2);

        /* renamed from: b */
        abstract boolean mo15166b(AbstractC5915a<?> abstractC5915a, Object obj, Object obj2);

        /* renamed from: c */
        abstract boolean mo15167c(AbstractC5915a<?> abstractC5915a, l lVar, l lVar2);

        /* renamed from: d */
        abstract e mo15168d(AbstractC5915a<?> abstractC5915a, e eVar);

        /* renamed from: e */
        abstract l mo15169e(AbstractC5915a<?> abstractC5915a, l lVar);

        /* renamed from: f */
        abstract void mo15170f(l lVar, l lVar2);

        /* renamed from: g */
        abstract void mo15171g(l lVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.util.concurrent.a$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: c */
        static final c f12447c;

        /* renamed from: d */
        static final c f12448d;

        /* renamed from: a */
        final boolean f12449a;

        /* renamed from: b */
        final Throwable f12450b;

        static {
            if (AbstractC5915a.f12440d) {
                f12448d = null;
                f12447c = null;
            } else {
                f12448d = new c(false, null);
                f12447c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th2) {
            this.f12449a = z10;
            this.f12450b = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.util.concurrent.a$d */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: b */
        static final d f12451b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f12452a;

        /* renamed from: com.google.common.util.concurrent.a$d$a */
        /* loaded from: classes2.dex */
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
            this.f12452a = (Throwable) C7159o.m21312o(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.util.concurrent.a$e */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: d */
        static final e f12453d = new e();

        /* renamed from: a */
        final Runnable f12454a;

        /* renamed from: b */
        final Executor f12455b;

        /* renamed from: c */
        e f12456c;

        e() {
            this.f12454a = null;
            this.f12455b = null;
        }

        e(Runnable runnable, Executor executor) {
            this.f12454a = runnable;
            this.f12455b = executor;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$f */
    /* loaded from: classes2.dex */
    private static final class f extends b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<l, Thread> f12457a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<l, l> f12458b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<AbstractC5915a, l> f12459c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<AbstractC5915a, e> f12460d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<AbstractC5915a, Object> f12461e;

        f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC5915a, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC5915a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC5915a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f12457a = atomicReferenceFieldUpdater;
            this.f12458b = atomicReferenceFieldUpdater2;
            this.f12459c = atomicReferenceFieldUpdater3;
            this.f12460d = atomicReferenceFieldUpdater4;
            this.f12461e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: a */
        boolean mo15165a(AbstractC5915a<?> abstractC5915a, e eVar, e eVar2) {
            return C0741b.m3751a(this.f12460d, abstractC5915a, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: b */
        boolean mo15166b(AbstractC5915a<?> abstractC5915a, Object obj, Object obj2) {
            return C0741b.m3751a(this.f12461e, abstractC5915a, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: c */
        boolean mo15167c(AbstractC5915a<?> abstractC5915a, l lVar, l lVar2) {
            return C0741b.m3751a(this.f12459c, abstractC5915a, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: d */
        e mo15168d(AbstractC5915a<?> abstractC5915a, e eVar) {
            return this.f12460d.getAndSet(abstractC5915a, eVar);
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: e */
        l mo15169e(AbstractC5915a<?> abstractC5915a, l lVar) {
            return this.f12459c.getAndSet(abstractC5915a, lVar);
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: f */
        void mo15170f(l lVar, l lVar2) {
            this.f12458b.lazySet(lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: g */
        void mo15171g(l lVar, Thread thread) {
            this.f12457a.lazySet(lVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.util.concurrent.a$g */
    /* loaded from: classes2.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: a */
        final AbstractC5915a<V> f12462a;

        /* renamed from: b */
        final InterfaceFutureC5920f<? extends V> f12463b;

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC5915a) this.f12462a).f12444a != this) {
                return;
            }
            if (AbstractC5915a.f12442f.mo15166b(this.f12462a, this, AbstractC5915a.m15159u(this.f12463b))) {
                AbstractC5915a.m15156r(this.f12462a, false);
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$h */
    /* loaded from: classes2.dex */
    private static final class h extends b {
        private h() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: a */
        boolean mo15165a(AbstractC5915a<?> abstractC5915a, e eVar, e eVar2) {
            synchronized (abstractC5915a) {
                if (((AbstractC5915a) abstractC5915a).f12445b != eVar) {
                    return false;
                }
                ((AbstractC5915a) abstractC5915a).f12445b = eVar2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: b */
        boolean mo15166b(AbstractC5915a<?> abstractC5915a, Object obj, Object obj2) {
            synchronized (abstractC5915a) {
                if (((AbstractC5915a) abstractC5915a).f12444a != obj) {
                    return false;
                }
                ((AbstractC5915a) abstractC5915a).f12444a = obj2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: c */
        boolean mo15167c(AbstractC5915a<?> abstractC5915a, l lVar, l lVar2) {
            synchronized (abstractC5915a) {
                if (((AbstractC5915a) abstractC5915a).f12446c != lVar) {
                    return false;
                }
                ((AbstractC5915a) abstractC5915a).f12446c = lVar2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: d */
        e mo15168d(AbstractC5915a<?> abstractC5915a, e eVar) {
            e eVar2;
            synchronized (abstractC5915a) {
                eVar2 = ((AbstractC5915a) abstractC5915a).f12445b;
                if (eVar2 != eVar) {
                    ((AbstractC5915a) abstractC5915a).f12445b = eVar;
                }
            }
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: e */
        l mo15169e(AbstractC5915a<?> abstractC5915a, l lVar) {
            l lVar2;
            synchronized (abstractC5915a) {
                lVar2 = ((AbstractC5915a) abstractC5915a).f12446c;
                if (lVar2 != lVar) {
                    ((AbstractC5915a) abstractC5915a).f12446c = lVar;
                }
            }
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: f */
        void mo15170f(l lVar, l lVar2) {
            lVar.f12472b = lVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: g */
        void mo15171g(l lVar, Thread thread) {
            lVar.f12471a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.util.concurrent.a$i */
    /* loaded from: classes2.dex */
    public interface i<V> extends InterfaceFutureC5920f<V> {
    }

    /* renamed from: com.google.common.util.concurrent.a$j */
    /* loaded from: classes2.dex */
    static abstract class j<V> extends AbstractC5915a<V> implements i<V> {
        @Override // com.google.common.util.concurrent.AbstractC5915a, com.google.common.util.concurrent.InterfaceFutureC5920f
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a, java.util.concurrent.Future
        public final V get() {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) {
            return (V) super.get(j10, timeUnit);
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$k */
    /* loaded from: classes2.dex */
    private static final class k extends b {

        /* renamed from: a */
        static final Unsafe f12464a;

        /* renamed from: b */
        static final long f12465b;

        /* renamed from: c */
        static final long f12466c;

        /* renamed from: d */
        static final long f12467d;

        /* renamed from: e */
        static final long f12468e;

        /* renamed from: f */
        static final long f12469f;

        /* renamed from: com.google.common.util.concurrent.a$k$a */
        /* loaded from: classes2.dex */
        class a implements PrivilegedExceptionAction<Unsafe> {
            a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new a());
                }
                try {
                    f12466c = unsafe.objectFieldOffset(AbstractC5915a.class.getDeclaredField("c"));
                    f12465b = unsafe.objectFieldOffset(AbstractC5915a.class.getDeclaredField("b"));
                    f12467d = unsafe.objectFieldOffset(AbstractC5915a.class.getDeclaredField("a"));
                    f12468e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                    f12469f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                    f12464a = unsafe;
                } catch (NoSuchFieldException e10) {
                    throw new RuntimeException(e10);
                } catch (RuntimeException e11) {
                    throw e11;
                }
            } catch (PrivilegedActionException e12) {
                throw new RuntimeException("Could not initialize intrinsics", e12.getCause());
            }
        }

        private k() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: a */
        boolean mo15165a(AbstractC5915a<?> abstractC5915a, e eVar, e eVar2) {
            return C5354k.m13464a(f12464a, abstractC5915a, f12465b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: b */
        boolean mo15166b(AbstractC5915a<?> abstractC5915a, Object obj, Object obj2) {
            return C5354k.m13464a(f12464a, abstractC5915a, f12467d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: c */
        boolean mo15167c(AbstractC5915a<?> abstractC5915a, l lVar, l lVar2) {
            return C5354k.m13464a(f12464a, abstractC5915a, f12466c, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: d */
        e mo15168d(AbstractC5915a<?> abstractC5915a, e eVar) {
            e eVar2;
            do {
                eVar2 = ((AbstractC5915a) abstractC5915a).f12445b;
                if (eVar == eVar2) {
                    return eVar2;
                }
            } while (!mo15165a(abstractC5915a, eVar2, eVar));
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: e */
        l mo15169e(AbstractC5915a<?> abstractC5915a, l lVar) {
            l lVar2;
            do {
                lVar2 = ((AbstractC5915a) abstractC5915a).f12446c;
                if (lVar == lVar2) {
                    return lVar2;
                }
            } while (!mo15167c(abstractC5915a, lVar2, lVar));
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: f */
        void mo15170f(l lVar, l lVar2) {
            f12464a.putObject(lVar, f12469f, lVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a.b
        /* renamed from: g */
        void mo15171g(l lVar, Thread thread) {
            f12464a.putObject(lVar, f12468e, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.util.concurrent.a$l */
    /* loaded from: classes2.dex */
    public static final class l {

        /* renamed from: c */
        static final l f12470c = new l(false);

        /* renamed from: a */
        volatile Thread f12471a;

        /* renamed from: b */
        volatile l f12472b;

        l() {
            AbstractC5915a.f12442f.mo15171g(this, Thread.currentThread());
        }

        l(boolean z10) {
        }

        /* renamed from: a */
        void m15173a(l lVar) {
            AbstractC5915a.f12442f.mo15170f(this, lVar);
        }

        /* renamed from: b */
        void m15174b() {
            Thread thread = this.f12471a;
            if (thread != null) {
                this.f12471a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.common.util.concurrent.a$f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.common.util.concurrent.a$a] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.common.util.concurrent.a$k] */
    static {
        boolean z10;
        h hVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f12440d = z10;
        f12441e = Logger.getLogger(AbstractC5915a.class.getName());
        ?? r22 = 0;
        r22 = 0;
        try {
            hVar = new k();
            e = null;
        } catch (Error | RuntimeException e10) {
            e = e10;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5915a.class, l.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5915a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5915a.class, Object.class, "a"));
            } catch (Error | RuntimeException e11) {
                hVar = new h();
                r22 = e11;
            }
        }
        f12442f = hVar;
        if (r22 != 0) {
            ?? r02 = f12441e;
            Level level = Level.SEVERE;
            r02.log(level, "UnsafeAtomicHelper is broken!", e);
            r02.log(level, "SafeAtomicHelper is broken!", r22);
        }
        f12443r = new Object();
    }

    /* renamed from: k */
    private void m15150k(StringBuilder sb2) {
        String str = "]";
        try {
            Object m15160v = m15160v(this);
            sb2.append("SUCCESS, result=[");
            m15152n(sb2, m15160v);
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

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m15151l(java.lang.StringBuilder r6) {
        /*
            r5 = this;
            int r0 = r6.length()
            java.lang.String r1 = "PENDING"
            r6.append(r1)
            java.lang.Object r1 = r5.f12444a
            boolean r2 = r1 instanceof com.google.common.util.concurrent.AbstractC5915a.g
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r6.append(r2)
            com.google.common.util.concurrent.a$g r1 = (com.google.common.util.concurrent.AbstractC5915a.g) r1
            com.google.common.util.concurrent.f<? extends V> r1 = r1.f12463b
            r5.m15153o(r6, r1)
        L1d:
            r6.append(r3)
            goto L4d
        L21:
            java.lang.String r1 = r5.mo592x()     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            java.lang.String r1 = p082eb.C7165u.m21348a(r1)     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            goto L42
        L2a:
            r1 = move-exception
            goto L2d
        L2c:
            r1 = move-exception
        L2d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Exception thrown from implementation: "
            r2.append(r4)
            java.lang.Class r1 = r1.getClass()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L42:
            if (r1 == 0) goto L4d
            java.lang.String r2 = ", info=["
            r6.append(r2)
            r6.append(r1)
            goto L1d
        L4d:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L5d
            int r1 = r6.length()
            r6.delete(r0, r1)
            r5.m15150k(r6)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractC5915a.m15151l(java.lang.StringBuilder):void");
    }

    /* renamed from: n */
    private void m15152n(StringBuilder sb2, Object obj) {
        String hexString;
        if (obj == null) {
            hexString = "null";
        } else if (obj == this) {
            hexString = "this future";
        } else {
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb2.append(hexString);
    }

    /* renamed from: o */
    private void m15153o(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e10) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e10.getClass());
        }
    }

    /* renamed from: p */
    private static CancellationException m15154p(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* renamed from: q */
    private e m15155q(e eVar) {
        e eVar2 = eVar;
        e mo15168d = f12442f.mo15168d(this, e.f12453d);
        while (mo15168d != null) {
            e eVar3 = mo15168d.f12456c;
            mo15168d.f12456c = eVar2;
            eVar2 = mo15168d;
            mo15168d = eVar3;
        }
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static void m15156r(AbstractC5915a<?> abstractC5915a, boolean z10) {
        e eVar = null;
        while (true) {
            abstractC5915a.m15161y();
            if (z10) {
                abstractC5915a.mo591w();
                z10 = false;
            }
            abstractC5915a.m15164m();
            e m15155q = abstractC5915a.m15155q(eVar);
            while (m15155q != null) {
                eVar = m15155q.f12456c;
                Runnable runnable = m15155q.f12454a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    abstractC5915a = gVar.f12462a;
                    if (((AbstractC5915a) abstractC5915a).f12444a == gVar) {
                        if (f12442f.mo15166b(abstractC5915a, gVar, m15159u(gVar.f12463b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = m15155q.f12455b;
                    Objects.requireNonNull(executor);
                    m15157s(runnable2, executor);
                }
                m15155q = eVar;
            }
            return;
        }
    }

    /* renamed from: s */
    private static void m15157s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f12441e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    private V m15158t(Object obj) {
        if (obj instanceof c) {
            throw m15154p("Task was cancelled.", ((c) obj).f12450b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f12452a);
        }
        return obj == f12443r ? (V) C5922h.m15179a() : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public static Object m15159u(InterfaceFutureC5920f<?> interfaceFutureC5920f) {
        Throwable m24441a;
        if (interfaceFutureC5920f instanceof i) {
            Object obj = ((AbstractC5915a) interfaceFutureC5920f).f12444a;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f12449a) {
                    obj = cVar.f12450b != null ? new c(false, cVar.f12450b) : c.f12448d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((interfaceFutureC5920f instanceof AbstractC7955a) && (m24441a = C7956b.m24441a((AbstractC7955a) interfaceFutureC5920f)) != null) {
            return new d(m24441a);
        }
        boolean isCancelled = interfaceFutureC5920f.isCancelled();
        if ((!f12440d) && isCancelled) {
            c cVar2 = c.f12448d;
            Objects.requireNonNull(cVar2);
            return cVar2;
        }
        try {
            Object m15160v = m15160v(interfaceFutureC5920f);
            if (!isCancelled) {
                return m15160v == null ? f12443r : m15160v;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC5920f));
        } catch (Error e10) {
            e = e10;
            return new d(e);
        } catch (CancellationException e11) {
            if (isCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC5920f, e11));
        } catch (RuntimeException e12) {
            e = e12;
            return new d(e);
        } catch (ExecutionException e13) {
            if (!isCancelled) {
                return new d(e13.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC5920f, e13));
        }
    }

    /* renamed from: v */
    private static <V> V m15160v(Future<V> future) {
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

    /* renamed from: y */
    private void m15161y() {
        for (l mo15169e = f12442f.mo15169e(this, l.f12470c); mo15169e != null; mo15169e = mo15169e.f12472b) {
            mo15169e.m15174b();
        }
    }

    /* renamed from: z */
    private void m15162z(l lVar) {
        lVar.f12471a = null;
        while (true) {
            l lVar2 = this.f12446c;
            if (lVar2 == l.f12470c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f12472b;
                if (lVar2.f12471a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f12472b = lVar4;
                    if (lVar3.f12471a == null) {
                        break;
                    }
                } else if (!f12442f.mo15167c(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo589A(V v10) {
        if (v10 == null) {
            v10 = (V) f12443r;
        }
        if (!f12442f.mo15166b(this, null, v10)) {
            return false;
        }
        m15156r(this, false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo590B(Throwable th2) {
        if (!f12442f.mo15166b(this, null, new d((Throwable) C7159o.m21312o(th2)))) {
            return false;
        }
        m15156r(this, false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p159ib.AbstractC7955a
    /* renamed from: a */
    public final Throwable mo15163a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f12444a;
        if (obj instanceof d) {
            return ((d) obj).f12452a;
        }
        return null;
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC5920f
    public void addListener(Runnable runnable, Executor executor) {
        e eVar;
        C7159o.m21313p(runnable, "Runnable was null.");
        C7159o.m21313p(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f12445b) != e.f12453d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f12456c = eVar;
                if (f12442f.mo15165a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f12445b;
                }
            } while (eVar != e.f12453d);
        }
        m15157s(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f12444a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f12440d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f12447c : c.f12448d;
            Objects.requireNonNull(cVar);
        }
        AbstractC5915a<V> abstractC5915a = this;
        boolean z11 = false;
        while (true) {
            if (f12442f.mo15166b(abstractC5915a, obj, cVar)) {
                m15156r(abstractC5915a, z10);
                if (!(obj instanceof g)) {
                    return true;
                }
                InterfaceFutureC5920f<? extends V> interfaceFutureC5920f = ((g) obj).f12463b;
                if (!(interfaceFutureC5920f instanceof i)) {
                    interfaceFutureC5920f.cancel(z10);
                    return true;
                }
                abstractC5915a = (AbstractC5915a) interfaceFutureC5920f;
                obj = abstractC5915a.f12444a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = abstractC5915a.f12444a;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f12444a;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return m15158t(obj2);
        }
        l lVar = this.f12446c;
        if (lVar != l.f12470c) {
            l lVar2 = new l();
            do {
                lVar2.m15173a(lVar);
                if (f12442f.mo15167c(this, lVar, lVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m15162z(lVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f12444a;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return m15158t(obj);
                }
                lVar = this.f12446c;
            } while (lVar != l.f12470c);
        }
        Object obj3 = this.f12444a;
        Objects.requireNonNull(obj3);
        return m15158t(obj3);
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f12444a;
        if ((obj != null) && (!(obj instanceof g))) {
            return m15158t(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f12446c;
            if (lVar != l.f12470c) {
                l lVar2 = new l();
                do {
                    lVar2.m15173a(lVar);
                    if (f12442f.mo15167c(this, lVar, lVar2)) {
                        do {
                            C5923i.m15180a(this, nanos);
                            if (Thread.interrupted()) {
                                m15162z(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f12444a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m15158t(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m15162z(lVar2);
                    } else {
                        lVar = this.f12446c;
                    }
                } while (lVar != l.f12470c);
            }
            Object obj3 = this.f12444a;
            Objects.requireNonNull(obj3);
            return m15158t(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f12444a;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return m15158t(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC5915a = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
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
        throw new TimeoutException(str + " for " + abstractC5915a);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f12444a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof g)) & (this.f12444a != null);
    }

    /* renamed from: m */
    protected void m15164m() {
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m15150k(sb2);
        } else {
            m15151l(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: w */
    protected void mo591w() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    protected String mo592x() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }
}
