package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.u5 */
/* loaded from: classes2.dex */
public final class C5687u5<V> extends FutureTask<V> implements Comparable<C5687u5<V>> {

    /* renamed from: a */
    private final long f11868a;

    /* renamed from: b */
    final boolean f11869b;

    /* renamed from: c */
    private final String f11870c;

    /* renamed from: d */
    private final /* synthetic */ C5635q5 f11871d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5687u5(C5635q5 c5635q5, Runnable runnable, boolean z10, String str) {
        super(zzcl.zza().zza(runnable), null);
        AtomicLong atomicLong;
        this.f11871d = c5635q5;
        C5276s.m13324j(str);
        atomicLong = C5635q5.f11727l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f11868a = andIncrement;
        this.f11870c = str;
        this.f11869b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c5635q5.zzj().m14182B().m14218a("Tasks index overflow");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5687u5(C5635q5 c5635q5, Callable<V> callable, boolean z10, String str) {
        super(zzcl.zza().zza(callable));
        AtomicLong atomicLong;
        this.f11871d = c5635q5;
        C5276s.m13324j(str);
        atomicLong = C5635q5.f11727l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f11868a = andIncrement;
        this.f11870c = str;
        this.f11869b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c5635q5.zzj().m14182B().m14218a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        C5687u5 c5687u5 = (C5687u5) obj;
        boolean z10 = this.f11869b;
        if (z10 != c5687u5.f11869b) {
            return z10 ? -1 : 1;
        }
        long j10 = this.f11868a;
        long j11 = c5687u5.f11868a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f11871d.zzj().m14184D().m14219b("Two tasks share the same index. index", Long.valueOf(this.f11868a));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th2) {
        this.f11871d.zzj().m14182B().m14219b(this.f11870c, th2);
        super.setException(th2);
    }
}
