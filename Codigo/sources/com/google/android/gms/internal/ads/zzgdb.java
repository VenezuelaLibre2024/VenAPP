package com.google.android.gms.internal.ads;

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
public abstract class zzgdb<V> extends zzgfq implements com.google.common.util.concurrent.f<V> {
    private static final Object zzaZ;
    private static final zza zzbc;
    static final boolean zzd;
    static final zzgex zze;
    private volatile zzd listeners;
    private volatile Object value;
    private volatile zzk waiters;

    /* loaded from: classes2.dex */
    public abstract class zza {
        /* synthetic */ zza(zzgda zzgdaVar) {
        }

        abstract zzd zza(zzgdb zzgdbVar, zzd zzdVar);

        abstract zzk zzb(zzgdb zzgdbVar, zzk zzkVar);

        abstract void zzc(zzk zzkVar, zzk zzkVar2);

        abstract void zzd(zzk zzkVar, Thread thread);

        abstract boolean zze(zzgdb zzgdbVar, zzd zzdVar, zzd zzdVar2);

        abstract boolean zzf(zzgdb zzgdbVar, Object obj, Object obj2);

        abstract boolean zzg(zzgdb zzgdbVar, zzk zzkVar, zzk zzkVar2);
    }

    /* loaded from: classes2.dex */
    public final class zzb {
        static final zzb zza;
        static final zzb zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzgdb.zzd) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzb(false, null);
                zza = new zzb(true, null);
            }
        }

        zzb(boolean z10, Throwable th2) {
            this.zzc = z10;
            this.zzd = th2;
        }
    }

    /* loaded from: classes2.dex */
    public final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzgdb.zzc.1
            AnonymousClass1(String str) {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        /* renamed from: com.google.android.gms.internal.ads.zzgdb$zzc$1 */
        /* loaded from: classes2.dex */
        class AnonymousClass1 extends Throwable {
            AnonymousClass1(String str) {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        zzc(Throwable th2) {
            th2.getClass();
            this.zzb = th2;
        }
    }

    /* loaded from: classes2.dex */
    public final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* loaded from: classes2.dex */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<zzgdb, zzk> zzc;
        final AtomicReferenceFieldUpdater<zzgdb, zzd> zzd;
        final AtomicReferenceFieldUpdater<zzgdb, Object> zze;

        zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final zzd zza(zzgdb zzgdbVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzgdbVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final zzk zzb(zzgdb zzgdbVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzgdbVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final void zzc(zzk zzkVar, zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zze(zzgdb zzgdbVar, zzd zzdVar, zzd zzdVar2) {
            return zzgdc.zza(this.zzd, zzgdbVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zzf(zzgdb zzgdbVar, Object obj, Object obj2) {
            return zzgdc.zza(this.zze, zzgdbVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zzg(zzgdb zzgdbVar, zzk zzkVar, zzk zzkVar2) {
            return zzgdc.zza(this.zzc, zzgdbVar, zzkVar, zzkVar2);
        }
    }

    /* loaded from: classes2.dex */
    public final class zzf<V> implements Runnable {
        final zzgdb<V> zza;
        final com.google.common.util.concurrent.f<? extends V> zzb;

        zzf(zzgdb zzgdbVar, com.google.common.util.concurrent.f fVar) {
            this.zza = zzgdbVar;
            this.zzb = fVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzgdb) this.zza).value != this) {
                return;
            }
            com.google.common.util.concurrent.f<? extends V> fVar = this.zzb;
            if (zzgdb.zzbc.zzf(this.zza, this, zzgdb.zze(fVar))) {
                zzgdb.zzx(this.zza, false);
            }
        }
    }

    /* loaded from: classes2.dex */
    final class zzg extends zza {
        private zzg() {
            super(null);
        }

        /* synthetic */ zzg(zzgdd zzgddVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final zzd zza(zzgdb zzgdbVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzgdbVar) {
                zzdVar2 = zzgdbVar.listeners;
                if (zzdVar2 != zzdVar) {
                    zzgdbVar.listeners = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final zzk zzb(zzgdb zzgdbVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzgdbVar) {
                zzkVar2 = zzgdbVar.waiters;
                if (zzkVar2 != zzkVar) {
                    zzgdbVar.waiters = zzkVar;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final void zzc(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zze(zzgdb zzgdbVar, zzd zzdVar, zzd zzdVar2) {
            synchronized (zzgdbVar) {
                if (zzgdbVar.listeners != zzdVar) {
                    return false;
                }
                zzgdbVar.listeners = zzdVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zzf(zzgdb zzgdbVar, Object obj, Object obj2) {
            synchronized (zzgdbVar) {
                if (zzgdbVar.value != obj) {
                    return false;
                }
                zzgdbVar.value = obj2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zzg(zzgdb zzgdbVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zzgdbVar) {
                if (zzgdbVar.waiters != zzkVar) {
                    return false;
                }
                zzgdbVar.waiters = zzkVar2;
                return true;
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface zzh<V> extends com.google.common.util.concurrent.f<V> {
        @Override // com.google.common.util.concurrent.f
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    /* loaded from: classes2.dex */
    public abstract class zzi<V> extends zzgdb<V> implements zzh<V> {
    }

    /* loaded from: classes2.dex */
    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        /* renamed from: com.google.android.gms.internal.ads.zzgdb$zzj$1 */
        /* loaded from: classes2.dex */
        class AnonymousClass1 implements PrivilegedExceptionAction<Unsafe> {
            AnonymousClass1() {
            }

            @Override // java.security.PrivilegedExceptionAction
            public final /* bridge */ /* synthetic */ Unsafe run() {
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
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzgdb.zzj.1
                        AnonymousClass1() {
                        }

                        @Override // java.security.PrivilegedExceptionAction
                        public final /* bridge */ /* synthetic */ Unsafe run() {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzgdb.class.getDeclaredField("waiters"));
                    zzb = unsafe.objectFieldOffset(zzgdb.class.getDeclaredField("listeners"));
                    zzd = unsafe.objectFieldOffset(zzgdb.class.getDeclaredField("value"));
                    zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (PrivilegedActionException e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
            }
        }

        private zzj() {
            super(null);
        }

        /* synthetic */ zzj(zzgdf zzgdfVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final zzd zza(zzgdb zzgdbVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzgdbVar.listeners;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzgdbVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final zzk zzb(zzgdb zzgdbVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzgdbVar.waiters;
                if (zzkVar == zzkVar2) {
                    break;
                }
            } while (!zzg(zzgdbVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final void zzc(zzk zzkVar, zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zze(zzgdb zzgdbVar, zzd zzdVar, zzd zzdVar2) {
            return zzgde.zza(zza, zzgdbVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zzf(zzgdb zzgdbVar, Object obj, Object obj2) {
            return zzgde.zza(zza, zzgdbVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgdb.zza
        final boolean zzg(zzgdb zzgdbVar, zzk zzkVar, zzk zzkVar2) {
            return zzgde.zza(zza, zzgdbVar, zzc, zzkVar, zzkVar2);
        }
    }

    /* loaded from: classes2.dex */
    public final class zzk {
        static final zzk zza = new zzk(false);
        volatile zzk next;
        volatile Thread thread;

        zzk() {
            zzgdb.zzbc.zzd(this, Thread.currentThread());
        }

        zzk(boolean z10) {
        }
    }

    static {
        boolean z10;
        Throwable th2;
        Throwable th3;
        zza zzgVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        zzd = z10;
        zze = new zzgex(zzgdb.class);
        try {
            zzgVar = new zzj(null);
            th3 = null;
            th2 = null;
        } catch (Error | Exception e10) {
            try {
                th2 = null;
                th3 = e10;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzgdb.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzgdb.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzgdb.class, Object.class, "value"));
            } catch (Error | Exception e11) {
                th2 = e11;
                th3 = e10;
                zzgVar = new zzg(null);
            }
        }
        zzbc = zzgVar;
        if (th2 != null) {
            zzgex zzgexVar = zze;
            Logger zza2 = zzgexVar.zza();
            Level level = Level.SEVERE;
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            zzgexVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        zzaZ = new Object();
    }

    private static final Object zzA(Object obj) {
        if (obj instanceof zzb) {
            Throwable th2 = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzaZ) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object zze(com.google.common.util.concurrent.f fVar) {
        Throwable zzl;
        if (fVar instanceof zzh) {
            Object obj = ((zzgdb) fVar).value;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (zzbVar.zzc) {
                    Throwable th2 = zzbVar.zzd;
                    obj = th2 != null ? new zzb(false, th2) : zzb.zzb;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((fVar instanceof zzgfq) && (zzl = ((zzgfq) fVar).zzl()) != null) {
            return new zzc(zzl);
        }
        boolean isCancelled = fVar.isCancelled();
        if ((!zzd) && isCancelled) {
            zzb zzbVar2 = zzb.zzb;
            Objects.requireNonNull(zzbVar2);
            return zzbVar2;
        }
        try {
            Object zzf2 = zzf(fVar);
            if (!isCancelled) {
                return zzf2 == null ? zzaZ : zzf2;
            }
            return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(fVar)));
        } catch (Error e10) {
            e = e10;
            return new zzc(e);
        } catch (CancellationException e11) {
            return !isCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(fVar)), e11)) : new zzb(false, e11);
        } catch (ExecutionException e12) {
            return isCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(fVar)), e12)) : new zzc(e12.getCause());
        } catch (Exception e13) {
            e = e13;
            return new zzc(e);
        }
    }

    private static Object zzf(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
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
        return obj;
    }

    private final void zzu(StringBuilder sb2) {
        String hexString;
        String str = "]";
        try {
            Object zzf2 = zzf(this);
            sb2.append("SUCCESS, result=[");
            if (zzf2 == null) {
                hexString = "null";
            } else if (zzf2 == this) {
                hexString = "this future";
            } else {
                sb2.append(zzf2.getClass().getName());
                sb2.append("@");
                hexString = Integer.toHexString(System.identityHashCode(zzf2));
            }
            sb2.append(hexString);
            sb2.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb2.append(str);
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append(str);
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            str = " thrown from get()]";
            sb2.append(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzv(java.lang.StringBuilder r5) {
        /*
            r4 = this;
            int r0 = r5.length()
            java.lang.String r1 = "PENDING"
            r5.append(r1)
            java.lang.Object r1 = r4.value
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzgdb.zzf
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r5.append(r2)
            com.google.android.gms.internal.ads.zzgdb$zzf r1 = (com.google.android.gms.internal.ads.zzgdb.zzf) r1
            com.google.common.util.concurrent.f<? extends V> r1 = r1.zzb
            r4.zzw(r5, r1)
        L1d:
            r5.append(r3)
            goto L46
        L21:
            java.lang.String r1 = r4.zza()     // Catch: java.lang.StackOverflowError -> L2a java.lang.Exception -> L2c
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfxt.zza(r1)     // Catch: java.lang.StackOverflowError -> L2a java.lang.Exception -> L2c
            goto L3b
        L2a:
            r1 = move-exception
            goto L2d
        L2c:
            r1 = move-exception
        L2d:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Exception thrown from implementation: "
            java.lang.String r1 = r2.concat(r1)
        L3b:
            if (r1 == 0) goto L46
            java.lang.String r2 = ", info=["
            r5.append(r2)
            r5.append(r1)
            goto L1d
        L46:
            boolean r1 = r4.isDone()
            if (r1 == 0) goto L56
            int r1 = r5.length()
            r5.delete(r0, r1)
            r4.zzu(r5)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdb.zzv(java.lang.StringBuilder):void");
    }

    private final void zzw(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (Exception | StackOverflowError e10) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e10.getClass());
        }
    }

    public static void zzx(zzgdb zzgdbVar, boolean z10) {
        zzd zzdVar = null;
        while (true) {
            for (zzk zzb2 = zzbc.zzb(zzgdbVar, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z10) {
                zzgdbVar.zzq();
            }
            zzgdbVar.zzb();
            zzd zzdVar2 = zzdVar;
            zzd zza2 = zzbc.zza(zzgdbVar, zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zza2 != null) {
                zzd zzdVar4 = zza2.next;
                zza2.next = zzdVar3;
                zzdVar3 = zza2;
                zza2 = zzdVar4;
            }
            while (zzdVar3 != null) {
                zzdVar = zzdVar3.next;
                Runnable runnable = zzdVar3.zzb;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzf) {
                    zzf zzfVar = (zzf) runnable2;
                    zzgdbVar = zzfVar.zza;
                    if (zzgdbVar.value == zzfVar) {
                        if (zzbc.zzf(zzgdbVar, zzfVar, zze(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzy(runnable2, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z10 = false;
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            zze.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    private final void zzz(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                            break;
                        }
                    } else if (!zzbc.zzg(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // com.google.common.util.concurrent.f
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzfxe.zzc(runnable, "Runnable was null.");
        zzfxe.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzbc.zze(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listeners;
                }
            } while (zzdVar != zzd.zza);
        }
        zzy(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgdb.zzf
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.google.android.gms.internal.ads.zzgdb.zzd
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.zzgdb$zzb r1 = new com.google.android.gms.internal.ads.zzgdb$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.zzgdb$zzb r1 = com.google.android.gms.internal.ads.zzgdb.zzb.zza
            goto L26
        L24:
            com.google.android.gms.internal.ads.zzgdb$zzb r1 = com.google.android.gms.internal.ads.zzgdb.zzb.zzb
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.android.gms.internal.ads.zzgdb$zza r6 = com.google.android.gms.internal.ads.zzgdb.zzbc
            boolean r6 = r6.zzf(r4, r0, r1)
            if (r6 == 0) goto L58
            zzx(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgdb.zzf
            if (r4 == 0) goto L56
            com.google.android.gms.internal.ads.zzgdb$zzf r0 = (com.google.android.gms.internal.ads.zzgdb.zzf) r0
            com.google.common.util.concurrent.f<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgdb.zzh
            if (r4 == 0) goto L53
            r4 = r0
            com.google.android.gms.internal.ads.zzgdb r4 = (com.google.android.gms.internal.ads.zzgdb) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzgdb.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L56
            r5 = r3
            goto L2b
        L53:
            r0.cancel(r8)
        L56:
            r2 = r3
            goto L5f
        L58:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzgdb.zzf
            if (r6 != 0) goto L2b
            r2 = r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdb.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof zzf))) {
            return zzA(obj2);
        }
        zzk zzkVar = this.waiters;
        if (zzkVar != zzk.zza) {
            zzk zzkVar2 = new zzk();
            do {
                zza zzaVar = zzbc;
                zzaVar.zzc(zzkVar2, zzkVar);
                if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzz(zzkVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof zzf))));
                    return zzA(obj);
                }
                zzkVar = this.waiters;
            } while (zzkVar != zzk.zza);
        }
        Object obj3 = this.value;
        Objects.requireNonNull(obj3);
        return zzA(obj3);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z10 = true;
        if ((obj != null) && (!(obj instanceof zzf))) {
            return zzA(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zzk zzkVar = this.waiters;
            if (zzkVar != zzk.zza) {
                zzk zzkVar2 = new zzk();
                do {
                    zza zzaVar = zzbc;
                    zzaVar.zzc(zzkVar2, zzkVar);
                    if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zzz(zzkVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                                return zzA(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zzz(zzkVar2);
                    } else {
                        zzkVar = this.waiters;
                    }
                } while (zzkVar != zzk.zza);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return zzA(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof zzf))) {
                return zzA(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String zzgdbVar = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j11 = -nanos;
            long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(convert);
            if (convert != 0 && nanos2 <= 1000) {
                z10 = false;
            }
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z10) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z10) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + zzgdbVar);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (this.value != null) & (!(r0 instanceof zzf));
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
            zzu(sb2);
        } else {
            zzv(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zza() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected void zzb() {
    }

    public boolean zzc(Object obj) {
        if (obj == null) {
            obj = zzaZ;
        }
        if (!zzbc.zzf(this, null, obj)) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    public boolean zzd(Throwable th2) {
        th2.getClass();
        if (!zzbc.zzf(this, null, new zzc(th2))) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final Throwable zzl() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    protected void zzq() {
    }

    public final void zzr(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzt());
        }
    }

    public final boolean zzs(com.google.common.util.concurrent.f fVar) {
        zzc zzcVar;
        fVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (fVar.isDone()) {
                if (!zzbc.zzf(this, null, zze(fVar))) {
                    return false;
                }
                zzx(this, false);
                return true;
            }
            zzf zzfVar = new zzf(this, fVar);
            if (zzbc.zzf(this, null, zzfVar)) {
                try {
                    fVar.addListener(zzfVar, zzgeb.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        zzcVar = new zzc(th2);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzbc.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            fVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    public final boolean zzt() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }
}
