package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class zzin implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzip zza;
    private final Handler zzb;

    public zzin(zzip zzipVar, Handler handler) {
        this.zza = zzipVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzim
            public final /* synthetic */ int zzb;

            public /* synthetic */ zzim(int i102) {
                r2 = i102;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzip.zzc(zzin.this.zza, r2);
            }
        });
    }
}
