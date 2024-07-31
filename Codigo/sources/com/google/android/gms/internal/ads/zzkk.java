package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkk implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzabk, zzpu, zzwv, zztr, zzio, zzik {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzko zza;

    public /* synthetic */ zzkk(zzko zzkoVar, zzkj zzkjVar) {
        this.zza = zzkoVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzko.zzP(this.zza, surfaceTexture);
        this.zza.zzaf(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzai(null);
        this.zza.zzaf(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.zza.zzaf(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.zza.zzaf(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzaf(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zza(Exception exc) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzb(String str, long j10, long j11) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzw(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzc(String str) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzd(zzir zzirVar) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzy(zzirVar);
        this.zza.zzL = null;
        this.zza.zzR = null;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zze(zzir zzirVar) {
        zzmp zzmpVar;
        this.zza.zzR = zzirVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzz(zzirVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzf(zzam zzamVar, zzis zzisVar) {
        zzmp zzmpVar;
        this.zza.zzL = zzamVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzA(zzamVar, zzisVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzg(long j10) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzB(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzh(Exception exc) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzi(zzpv zzpvVar) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzD(zzpvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzj(zzpv zzpvVar) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzE(zzpvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzk(int i10, long j10, long j11) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzF(i10, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzl(int i10, long j10) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzG(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzm(Object obj, long j10) {
        zzmp zzmpVar;
        Object obj2;
        zzfc zzfcVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzH(obj, j10);
        zzko zzkoVar = this.zza;
        obj2 = zzkoVar.zzM;
        if (obj2 == obj) {
            zzfcVar = zzkoVar.zzl;
            zzfcVar.zzd(26, zzki.zza);
            zzfcVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzn(boolean z10) {
        boolean z11;
        zzfc zzfcVar;
        zzko zzkoVar = this.zza;
        z11 = zzkoVar.zzV;
        if (z11 == z10) {
            return;
        }
        zzkoVar.zzV = z10;
        zzfcVar = this.zza.zzl;
        zzfcVar.zzd(23, new zzez() { // from class: com.google.android.gms.internal.ads.zzkg
            public final /* synthetic */ boolean zza;

            public /* synthetic */ zzkg(boolean z102) {
                r1 = z102;
            }

            @Override // com.google.android.gms.internal.ads.zzez
            public final void zza(Object obj) {
                ((zzcl) obj).zzn(r1);
            }
        });
        zzfcVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzo(Exception exc) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzI(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzp(String str, long j10, long j11) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzJ(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzq(String str) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzK(str);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzr(zzir zzirVar) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzL(zzirVar);
        this.zza.zzK = null;
        this.zza.zzQ = null;
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzs(zzir zzirVar) {
        zzmp zzmpVar;
        this.zza.zzQ = zzirVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzM(zzirVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzt(long j10, int i10) {
        zzmp zzmpVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzN(j10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzu(zzam zzamVar, zzis zzisVar) {
        zzmp zzmpVar;
        this.zza.zzK = zzamVar;
        zzmpVar = this.zza.zzr;
        zzmpVar.zzO(zzamVar, zzisVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzv(zzdp zzdpVar) {
        zzfc zzfcVar;
        this.zza.zzaa = zzdpVar;
        zzfcVar = this.zza.zzl;
        zzfcVar.zzd(25, new zzez() { // from class: com.google.android.gms.internal.ads.zzkh
            public /* synthetic */ zzkh() {
            }

            @Override // com.google.android.gms.internal.ads.zzez
            public final void zza(Object obj) {
                ((zzcl) obj).zzr(zzdp.this);
            }
        });
        zzfcVar.zzc();
    }
}
