package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcl;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u5<V> extends FutureTask<V> implements Comparable<u5<V>> {

    /* renamed from: a, reason: collision with root package name */
    private final long f10670a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f10671b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10672c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ q5 f10673d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(q5 q5Var, Runnable runnable, boolean z10, String str) {
        super(zzcl.zza().zza(runnable), null);
        AtomicLong atomicLong;
        this.f10673d = q5Var;
        com.google.android.gms.common.internal.s.j(str);
        atomicLong = q5.f10540l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f10670a = andIncrement;
        this.f10672c = str;
        this.f10671b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            q5Var.zzj().B().a("Tasks index overflow");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(q5 q5Var, Callable<V> callable, boolean z10, String str) {
        super(zzcl.zza().zza(callable));
        AtomicLong atomicLong;
        this.f10673d = q5Var;
        com.google.android.gms.common.internal.s.j(str);
        atomicLong = q5.f10540l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f10670a = andIncrement;
        this.f10672c = str;
        this.f10671b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            q5Var.zzj().B().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        u5 u5Var = (u5) obj;
        boolean z10 = this.f10671b;
        if (z10 != u5Var.f10671b) {
            return z10 ? -1 : 1;
        }
        long j10 = this.f10670a;
        long j11 = u5Var.f10670a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f10673d.zzj().D().b("Two tasks share the same index. index", Long.valueOf(this.f10670a));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th2) {
        this.f10673d.zzj().B().b(this.f10672c, th2);
        super.setException(th2);
    }
}
