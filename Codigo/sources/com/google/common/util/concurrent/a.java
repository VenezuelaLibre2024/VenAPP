package com.google.common.util.concurrent;

import eb.o;
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
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class a<V> extends ib.a implements com.google.common.util.concurrent.f<V> {

    /* renamed from: d */
    static final boolean f11225d;

    /* renamed from: e */
    private static final Logger f11226e;

    /* renamed from: f */
    private static final b f11227f;

    /* renamed from: r */
    private static final Object f11228r;

    /* renamed from: a */
    private volatile Object f11229a;

    /* renamed from: b */
    private volatile e f11230b;

    /* renamed from: c */
    private volatile l f11231c;

    /* loaded from: classes2.dex */
    public static abstract class b {
        private b() {
        }

        /* synthetic */ b(C0166a c0166a) {
            this();
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, l lVar, l lVar2);

        abstract e d(a<?> aVar, e eVar);

        abstract l e(a<?> aVar, l lVar);

        abstract void f(l lVar, l lVar2);

        abstract void g(l lVar, Thread thread);
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: c */
        static final c f11232c;

        /* renamed from: d */
        static final c f11233d;

        /* renamed from: a */
        final boolean f11234a;

        /* renamed from: b */
        final Throwable f11235b;

        static {
            if (a.f11225d) {
                f11233d = null;
                f11232c = null;
            } else {
                f11233d = new c(false, null);
                f11232c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th2) {
            this.f11234a = z10;
            this.f11235b = th2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: b */
        static final d f11236b = new d(new C0167a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f11237a;

        /* renamed from: com.google.common.util.concurrent.a$d$a */
        /* loaded from: classes2.dex */
        class C0167a extends Throwable {
            C0167a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f11237a = (Throwable) o.o(th2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: d */
        static final e f11238d = new e();

        /* renamed from: a */
        final Runnable f11239a;

        /* renamed from: b */
        final Executor f11240b;

        /* renamed from: c */
        e f11241c;

        e() {
            this.f11239a = null;
            this.f11240b = null;
        }

        e(Runnable runnable, Executor executor) {
            this.f11239a = runnable;
            this.f11240b = executor;
        }
    }

    /* loaded from: classes2.dex */
    private static final class f extends b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<l, Thread> f11242a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<l, l> f11243b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<a, l> f11244c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<a, e> f11245d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<a, Object> f11246e;

        f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f11242a = atomicReferenceFieldUpdater;
            this.f11243b = atomicReferenceFieldUpdater2;
            this.f11244c = atomicReferenceFieldUpdater3;
            this.f11245d = atomicReferenceFieldUpdater4;
            this.f11246e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f11245d, aVar, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f11246e, aVar, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            return androidx.concurrent.futures.b.a(this.f11244c, aVar, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a<?> aVar, e eVar) {
            return this.f11245d.getAndSet(aVar, eVar);
        }

        @Override // com.google.common.util.concurrent.a.b
        l e(a<?> aVar, l lVar) {
            return this.f11244c.getAndSet(aVar, lVar);
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(l lVar, l lVar2) {
            this.f11243b.lazySet(lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(l lVar, Thread thread) {
            this.f11242a.lazySet(lVar, thread);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: a */
        final a<V> f11247a;

        /* renamed from: b */
        final com.google.common.util.concurrent.f<? extends V> f11248b;

        @Override // java.lang.Runnable
        public void run() {
            if (((a) this.f11247a).f11229a != this) {
                return;
            }
            if (a.f11227f.b(this.f11247a, this, a.u(this.f11248b))) {
                a.r(this.f11247a, false);
            }
        }
    }

    /* loaded from: classes2.dex */
    private static final class h extends b {
        private h() {
            super();
        }

        /* synthetic */ h(C0166a c0166a) {
            this();
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (((a) aVar).f11230b != eVar) {
                    return false;
                }
                ((a) aVar).f11230b = eVar2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (((a) aVar).f11229a != obj) {
                    return false;
                }
                ((a) aVar).f11229a = obj2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            synchronized (aVar) {
                if (((a) aVar).f11231c != lVar) {
                    return false;
                }
                ((a) aVar).f11231c = lVar2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a<?> aVar, e eVar) {
            e eVar2;
            synchronized (aVar) {
                eVar2 = ((a) aVar).f11230b;
                if (eVar2 != eVar) {
                    ((a) aVar).f11230b = eVar;
                }
            }
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        l e(a<?> aVar, l lVar) {
            l lVar2;
            synchronized (aVar) {
                lVar2 = ((a) aVar).f11231c;
                if (lVar2 != lVar) {
                    ((a) aVar).f11231c = lVar;
                }
            }
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(l lVar, l lVar2) {
            lVar.f11257b = lVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(l lVar, Thread thread) {
            lVar.f11256a = thread;
        }
    }

    /* loaded from: classes2.dex */
    public interface i<V> extends com.google.common.util.concurrent.f<V> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class j<V> extends a<V> implements i<V> {
        @Override // com.google.common.util.concurrent.a, com.google.common.util.concurrent.f
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final V get() {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) {
            return (V) super.get(j10, timeUnit);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    /* loaded from: classes2.dex */
    private static final class k extends b {

        /* renamed from: a */
        static final Unsafe f11249a;

        /* renamed from: b */
        static final long f11250b;

        /* renamed from: c */
        static final long f11251c;

        /* renamed from: d */
        static final long f11252d;

        /* renamed from: e */
        static final long f11253e;

        /* renamed from: f */
        static final long f11254f;

        /* renamed from: com.google.common.util.concurrent.a$k$a */
        /* loaded from: classes2.dex */
        class C0168a implements PrivilegedExceptionAction<Unsafe> {
            C0168a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a */
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
                    unsafe = (Unsafe) AccessController.doPrivileged(new C0168a());
                }
                try {
                    f11251c = unsafe.objectFieldOffset(a.class.getDeclaredField("c"));
                    f11250b = unsafe.objectFieldOffset(a.class.getDeclaredField("b"));
                    f11252d = unsafe.objectFieldOffset(a.class.getDeclaredField("a"));
                    f11253e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                    f11254f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                    f11249a = unsafe;
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

        /* synthetic */ k(C0166a c0166a) {
            this();
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return com.google.android.gms.internal.ads.k.a(f11249a, aVar, f11250b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return com.google.android.gms.internal.ads.k.a(f11249a, aVar, f11252d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            return com.google.android.gms.internal.ads.k.a(f11249a, aVar, f11251c, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a<?> aVar, e eVar) {
            e eVar2;
            do {
                eVar2 = ((a) aVar).f11230b;
                if (eVar == eVar2) {
                    return eVar2;
                }
            } while (!a(aVar, eVar2, eVar));
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        l e(a<?> aVar, l lVar) {
            l lVar2;
            do {
                lVar2 = ((a) aVar).f11231c;
                if (lVar == lVar2) {
                    return lVar2;
                }
            } while (!c(aVar, lVar2, lVar));
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(l lVar, l lVar2) {
            f11249a.putObject(lVar, f11254f, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(l lVar, Thread thread) {
            f11249a.putObject(lVar, f11253e, thread);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l {

        /* renamed from: c */
        static final l f11255c = new l(false);

        /* renamed from: a */
        volatile Thread f11256a;

        /* renamed from: b */
        volatile l f11257b;

        l() {
            a.f11227f.g(this, Thread.currentThread());
        }

        l(boolean z10) {
        }

        void a(l lVar) {
            a.f11227f.f(this, lVar);
        }

        void b() {
            Thread thread = this.f11256a;
            if (thread != null) {
                this.f11256a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        boolean z10;
        b hVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f11225d = z10;
        f11226e = Logger.getLogger(a.class.getName());
        Throwable th2 = null;
        try {
            hVar = new k();
            e = null;
        } catch (Error | RuntimeException e10) {
            e = e10;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, l.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            } catch (Error | RuntimeException e11) {
                hVar = new h();
                th2 = e11;
            }
        }
        f11227f = hVar;
        if (th2 != null) {
            Logger logger = f11226e;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", e);
            logger.log(level, "SafeAtomicHelper is broken!", th2);
        }
        f11228r = new Object();
    }

    private void k(StringBuilder sb2) {
        String str = "]";
        try {
            Object v10 = v(this);
            sb2.append("SUCCESS, result=[");
            n(sb2, v10);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void l(java.lang.StringBuilder r6) {
        /*
            r5 = this;
            int r0 = r6.length()
            java.lang.String r1 = "PENDING"
            r6.append(r1)
            java.lang.Object r1 = r5.f11229a
            boolean r2 = r1 instanceof com.google.common.util.concurrent.a.g
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r6.append(r2)
            com.google.common.util.concurrent.a$g r1 = (com.google.common.util.concurrent.a.g) r1
            com.google.common.util.concurrent.f<? extends V> r1 = r1.f11248b
            r5.o(r6, r1)
        L1d:
            r6.append(r3)
            goto L4d
        L21:
            java.lang.String r1 = r5.x()     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            java.lang.String r1 = eb.u.a(r1)     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
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
            r5.k(r6)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.a.l(java.lang.StringBuilder):void");
    }

    private void n(StringBuilder sb2, Object obj) {
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

    private void o(StringBuilder sb2, Object obj) {
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

    private static CancellationException p(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    private e q(e eVar) {
        e eVar2 = eVar;
        e d10 = f11227f.d(this, e.f11238d);
        while (d10 != null) {
            e eVar3 = d10.f11241c;
            d10.f11241c = eVar2;
            eVar2 = d10;
            d10 = eVar3;
        }
        return eVar2;
    }

    public static void r(a<?> aVar, boolean z10) {
        e eVar = null;
        while (true) {
            aVar.y();
            if (z10) {
                aVar.w();
                z10 = false;
            }
            aVar.m();
            e q10 = aVar.q(eVar);
            while (q10 != null) {
                eVar = q10.f11241c;
                Runnable runnable = q10.f11239a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    aVar = gVar.f11247a;
                    if (((a) aVar).f11229a == gVar) {
                        if (f11227f.b(aVar, gVar, u(gVar.f11248b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = q10.f11240b;
                    Objects.requireNonNull(executor);
                    s(runnable2, executor);
                }
                q10 = eVar;
            }
            return;
        }
    }

    private static void s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f11226e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V t(Object obj) {
        if (obj instanceof c) {
            throw p("Task was cancelled.", ((c) obj).f11235b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f11237a);
        }
        return obj == f11228r ? (V) com.google.common.util.concurrent.h.a() : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object u(com.google.common.util.concurrent.f<?> fVar) {
        Throwable a10;
        if (fVar instanceof i) {
            Object obj = ((a) fVar).f11229a;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f11234a) {
                    obj = cVar.f11235b != null ? new c(false, cVar.f11235b) : c.f11233d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((fVar instanceof ib.a) && (a10 = ib.b.a((ib.a) fVar)) != null) {
            return new d(a10);
        }
        boolean isCancelled = fVar.isCancelled();
        if ((!f11225d) && isCancelled) {
            c cVar2 = c.f11233d;
            Objects.requireNonNull(cVar2);
            return cVar2;
        }
        try {
            Object v10 = v(fVar);
            if (!isCancelled) {
                return v10 == null ? f11228r : v10;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + fVar));
        } catch (Error e10) {
            e = e10;
            return new d(e);
        } catch (CancellationException e11) {
            if (isCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + fVar, e11));
        } catch (RuntimeException e12) {
            e = e12;
            return new d(e);
        } catch (ExecutionException e13) {
            if (!isCancelled) {
                return new d(e13.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + fVar, e13));
        }
    }

    private static <V> V v(Future<V> future) {
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

    private void y() {
        for (l e10 = f11227f.e(this, l.f11255c); e10 != null; e10 = e10.f11257b) {
            e10.b();
        }
    }

    private void z(l lVar) {
        lVar.f11256a = null;
        while (true) {
            l lVar2 = this.f11231c;
            if (lVar2 == l.f11255c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f11257b;
                if (lVar2.f11256a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f11257b = lVar4;
                    if (lVar3.f11256a == null) {
                        break;
                    }
                } else if (!f11227f.c(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    public boolean A(V v10) {
        if (v10 == null) {
            v10 = (V) f11228r;
        }
        if (!f11227f.b(this, null, v10)) {
            return false;
        }
        r(this, false);
        return true;
    }

    public boolean B(Throwable th2) {
        if (!f11227f.b(this, null, new d((Throwable) o.o(th2)))) {
            return false;
        }
        r(this, false);
        return true;
    }

    @Override // ib.a
    public final Throwable a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f11229a;
        if (obj instanceof d) {
            return ((d) obj).f11237a;
        }
        return null;
    }

    @Override // com.google.common.util.concurrent.f
    public void addListener(Runnable runnable, Executor executor) {
        e eVar;
        o.p(runnable, "Runnable was null.");
        o.p(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f11230b) != e.f11238d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f11241c = eVar;
                if (f11227f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f11230b;
                }
            } while (eVar != e.f11238d);
        }
        s(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f11229a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f11225d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f11232c : c.f11233d;
            Objects.requireNonNull(cVar);
        }
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f11227f.b(aVar, obj, cVar)) {
                r(aVar, z10);
                if (!(obj instanceof g)) {
                    return true;
                }
                com.google.common.util.concurrent.f<? extends V> fVar = ((g) obj).f11248b;
                if (!(fVar instanceof i)) {
                    fVar.cancel(z10);
                    return true;
                }
                aVar = (a) fVar;
                obj = aVar.f11229a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = aVar.f11229a;
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
        Object obj2 = this.f11229a;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return t(obj2);
        }
        l lVar = this.f11231c;
        if (lVar != l.f11255c) {
            l lVar2 = new l();
            do {
                lVar2.a(lVar);
                if (f11227f.c(this, lVar, lVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            z(lVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f11229a;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return t(obj);
                }
                lVar = this.f11231c;
            } while (lVar != l.f11255c);
        }
        Object obj3 = this.f11229a;
        Objects.requireNonNull(obj3);
        return t(obj3);
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f11229a;
        if ((obj != null) && (!(obj instanceof g))) {
            return t(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f11231c;
            if (lVar != l.f11255c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f11227f.c(this, lVar, lVar2)) {
                        do {
                            com.google.common.util.concurrent.i.a(this, nanos);
                            if (Thread.interrupted()) {
                                z(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f11229a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return t(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        z(lVar2);
                    } else {
                        lVar = this.f11231c;
                    }
                } while (lVar != l.f11255c);
            }
            Object obj3 = this.f11229a;
            Objects.requireNonNull(obj3);
            return t(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f11229a;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return t(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
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
        throw new TimeoutException(str + " for " + aVar);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f11229a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof g)) & (this.f11229a != null);
    }

    protected void m() {
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
            k(sb2);
        } else {
            l(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected void w() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String x() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }
}
