package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzrb {
    final /* synthetic */ zzrd zza;
    private final Handler zzb = new Handler(Looper.myLooper());
    private final AudioTrack.StreamEventCallback zzc;

    public zzrb(zzrd zzrdVar) {
        this.zza = zzrdVar;
        this.zzc = new zzra(this, zzrdVar);
    }

    public final void zza(AudioTrack audioTrack) {
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.zzqz
            public final /* synthetic */ Handler zza;

            public /* synthetic */ zzqz(Handler handler2) {
                r1 = handler2;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                r1.post(runnable);
            }
        }, this.zzc);
    }

    public final void zzb(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}
