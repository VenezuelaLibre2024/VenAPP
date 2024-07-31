package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzgen extends zzgep {
    /* JADX WARN: Multi-variable type inference failed */
    public static zzgem zza(Iterable iterable) {
        return new zzgem(false, zzgaa.zzj(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgem zzb(Iterable iterable) {
        int i10 = zzgaa.zzd;
        iterable.getClass();
        return new zzgem(true, zzgaa.zzj(iterable), null);
    }

    @SafeVarargs
    public static zzgem zzc(com.google.common.util.concurrent.f... fVarArr) {
        return new zzgem(true, zzgaa.zzk(fVarArr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.common.util.concurrent.f zzd(Iterable iterable) {
        return new zzgdv(zzgaa.zzj(iterable), true);
    }

    public static com.google.common.util.concurrent.f zze(com.google.common.util.concurrent.f fVar, Class cls, zzfws zzfwsVar, Executor executor) {
        zzgcy zzgcyVar = new zzgcy(fVar, cls, zzfwsVar);
        fVar.addListener(zzgcyVar, zzgfe.zzc(executor, zzgcyVar));
        return zzgcyVar;
    }

    public static com.google.common.util.concurrent.f zzf(com.google.common.util.concurrent.f fVar, Class cls, zzgdu zzgduVar, Executor executor) {
        zzgcx zzgcxVar = new zzgcx(fVar, cls, zzgduVar);
        fVar.addListener(zzgcxVar, zzgfe.zzc(executor, zzgcxVar));
        return zzgcxVar;
    }

    public static com.google.common.util.concurrent.f zzg(Throwable th2) {
        th2.getClass();
        return new zzgeq(th2);
    }

    public static com.google.common.util.concurrent.f zzh(Object obj) {
        return obj == null ? zzger.zza : new zzger(obj);
    }

    public static com.google.common.util.concurrent.f zzi() {
        return zzger.zza;
    }

    public static com.google.common.util.concurrent.f zzj(Callable callable, Executor executor) {
        zzgfn zzgfnVar = new zzgfn(callable);
        executor.execute(zzgfnVar);
        return zzgfnVar;
    }

    public static com.google.common.util.concurrent.f zzk(zzgdt zzgdtVar, Executor executor) {
        zzgfn zzgfnVar = new zzgfn(zzgdtVar);
        executor.execute(zzgfnVar);
        return zzgfnVar;
    }

    @SafeVarargs
    public static com.google.common.util.concurrent.f zzl(com.google.common.util.concurrent.f... fVarArr) {
        return new zzgdv(zzgaa.zzk(fVarArr), false);
    }

    public static com.google.common.util.concurrent.f zzm(com.google.common.util.concurrent.f fVar, zzfws zzfwsVar, Executor executor) {
        zzgdi zzgdiVar = new zzgdi(fVar, zzfwsVar);
        fVar.addListener(zzgdiVar, zzgfe.zzc(executor, zzgdiVar));
        return zzgdiVar;
    }

    public static com.google.common.util.concurrent.f zzn(com.google.common.util.concurrent.f fVar, zzgdu zzgduVar, Executor executor) {
        int i10 = zzgdj.zzc;
        executor.getClass();
        zzgdh zzgdhVar = new zzgdh(fVar, zzgduVar);
        fVar.addListener(zzgdhVar, zzgfe.zzc(executor, zzgdhVar));
        return zzgdhVar;
    }

    public static com.google.common.util.concurrent.f zzo(com.google.common.util.concurrent.f fVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return fVar.isDone() ? fVar : zzgfk.zzf(fVar, j10, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) {
        if (future.isDone()) {
            return zzgfp.zza(future);
        }
        throw new IllegalStateException(zzfxt.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgfp.zza(future);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof Error) {
                throw new zzgec((Error) cause);
            }
            throw new zzgfo(cause);
        }
    }

    public static void zzr(com.google.common.util.concurrent.f fVar, zzgej zzgejVar, Executor executor) {
        zzgejVar.getClass();
        fVar.addListener(new zzgek(fVar, zzgejVar), executor);
    }
}
