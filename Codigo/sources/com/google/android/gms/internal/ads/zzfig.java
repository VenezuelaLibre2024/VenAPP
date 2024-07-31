package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes2.dex */
public final class zzfig {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgey zzc;

    public zzfig(Callable callable, zzgey zzgeyVar) {
        this.zzb = callable;
        this.zzc = zzgeyVar;
    }

    public final synchronized com.google.common.util.concurrent.f zza() {
        zzc(1);
        return (com.google.common.util.concurrent.f) this.zza.poll();
    }

    public final synchronized void zzb(com.google.common.util.concurrent.f fVar) {
        this.zza.addFirst(fVar);
    }

    public final synchronized void zzc(int i10) {
        int size = i10 - this.zza.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
