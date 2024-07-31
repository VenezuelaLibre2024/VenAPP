package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes2.dex */
public final class zzfor extends ContentObserver {
    private final Context zza;
    private final AudioManager zzb;
    private final zzfop zzc;
    private float zzd;
    private final zzfpc zze;

    public zzfor(Handler handler, Context context, zzfop zzfopVar, zzfpc zzfpcVar) {
        super(handler);
        this.zza = context;
        this.zzb = (AudioManager) context.getSystemService("audio");
        this.zzc = zzfopVar;
        this.zze = zzfpcVar;
    }

    private final float zzc() {
        AudioManager audioManager = this.zzb;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f10 = streamVolume / streamMaxVolume;
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    private final void zzd() {
        this.zze.zze(this.zzd);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float zzc = zzc();
        if (zzc != this.zzd) {
            this.zzd = zzc;
            zzd();
        }
    }

    public final void zza() {
        this.zzd = zzc();
        zzd();
        this.zza.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.zza.getContentResolver().unregisterContentObserver(this);
    }
}
