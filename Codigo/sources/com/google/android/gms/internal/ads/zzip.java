package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzip {
    private final AudioManager zza;
    private final zzin zzb;
    private zzio zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzip(Context context, Handler handler, zzio zzioVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.zza = audioManager;
        this.zzc = zzioVar;
        this.zzb = new zzin(this, handler);
        this.zzd = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(zzip zzipVar, int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2) {
                zzipVar.zzg(3);
                return;
            } else {
                zzipVar.zzf(0);
                zzipVar.zzg(2);
                return;
            }
        }
        if (i10 == -1) {
            zzipVar.zzf(-1);
            zzipVar.zze();
        } else if (i10 == 1) {
            zzipVar.zzg(1);
            zzipVar.zzf(1);
        } else {
            zzff.zzf("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzfy.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzg(0);
    }

    private final void zzf(int i10) {
        int zzX;
        zzio zzioVar = this.zzc;
        if (zzioVar != null) {
            zzkk zzkkVar = (zzkk) zzioVar;
            boolean zzv = zzkkVar.zza.zzv();
            zzX = zzko.zzX(zzv, i10);
            zzkkVar.zza.zzak(zzv, i10, zzX);
        }
    }

    private final void zzg(int i10) {
        if (this.zzd == i10) {
            return;
        }
        this.zzd = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.zze != f10) {
            this.zze = f10;
            zzio zzioVar = this.zzc;
            if (zzioVar != null) {
                ((zzkk) zzioVar).zza.zzah();
            }
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z10, int i10) {
        zze();
        return z10 ? 1 : -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }
}
