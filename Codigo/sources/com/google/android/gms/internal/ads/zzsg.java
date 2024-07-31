package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzsg implements zzsr {
    private final MediaCodec zza;
    private final zzsm zzb;
    private final zzss zzc;
    private boolean zzd;
    private int zze = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzsg(MediaCodec mediaCodec, HandlerThread handlerThread, zzss zzssVar, zzsf zzsfVar) {
        this.zza = mediaCodec;
        this.zzb = new zzsm(handlerThread);
        this.zzc = zzssVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzd(int i10) {
        return zzr(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zze(int i10) {
        return zzr(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzsg zzsgVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        zzsgVar.zzb.zzf(zzsgVar.zza);
        int i11 = zzfy.zza;
        Trace.beginSection("configureCodec");
        zzsgVar.zza.configure(mediaFormat, surface, (MediaCrypto) null, i10);
        Trace.endSection();
        zzsgVar.zzc.zzh();
        Trace.beginSection("startCodec");
        zzsgVar.zza.start();
        Trace.endSection();
        zzsgVar.zze = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzr(int i10, String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            str2 = "Audio";
        } else if (i10 == 2) {
            str2 = "Video";
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            str2 = ")";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final ByteBuffer zzf(int i10) {
        return this.zza.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final ByteBuffer zzg(int i10) {
        return this.zza.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzi() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzj(int i10, int i11, int i12, long j10, int i13) {
        this.zzc.zzd(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzk(int i10, int i11, zzie zzieVar, long j10, int i12) {
        this.zzc.zze(i10, 0, zzieVar, j10, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzl() {
        try {
            if (this.zze == 1) {
                this.zzc.zzg();
                this.zzb.zzg();
            }
            this.zze = 2;
            if (this.zzd) {
                return;
            }
            this.zza.release();
            this.zzd = true;
        } catch (Throwable th2) {
            if (!this.zzd) {
                this.zza.release();
                this.zzd = true;
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzm(int i10, long j10) {
        this.zza.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzn(int i10, boolean z10) {
        this.zza.releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzo(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzp(Bundle bundle) {
        this.zzc.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzq(int i10) {
        this.zza.setVideoScalingMode(i10);
    }
}
