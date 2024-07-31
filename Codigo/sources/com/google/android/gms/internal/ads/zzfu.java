package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfu implements zzew {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzfu(Handler handler) {
        this.zzb = handler;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzft zzftVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzftVar);
            }
        }
    }

    private static zzft zzm() {
        zzft zzftVar;
        List list = zza;
        synchronized (list) {
            zzftVar = list.isEmpty() ? new zzft(null) : (zzft) list.remove(list.size() - 1);
        }
        return zzftVar;
    }

    @Override // com.google.android.gms.internal.ads.zzew
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzew
    public final zzev zzb(int i10) {
        Handler handler = this.zzb;
        zzft zzm = zzm();
        zzm.zzb(handler.obtainMessage(i10), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzew
    public final zzev zzc(int i10, Object obj) {
        Handler handler = this.zzb;
        zzft zzm = zzm();
        zzm.zzb(handler.obtainMessage(i10, obj), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzew
    public final zzev zzd(int i10, int i11, int i12) {
        Handler handler = this.zzb;
        zzft zzm = zzm();
        zzm.zzb(handler.obtainMessage(1, i11, i12), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzew
    public final void zze(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzew
    public final void zzf(int i10) {
        this.zzb.removeMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzew
    public final boolean zzg(int i10) {
        return this.zzb.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzew
    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzew
    public final boolean zzi(int i10) {
        return this.zzb.sendEmptyMessage(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzew
    public final boolean zzj(int i10, long j10) {
        return this.zzb.sendEmptyMessageAtTime(2, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzew
    public final boolean zzk(zzev zzevVar) {
        return ((zzft) zzevVar).zzc(this.zzb);
    }
}
