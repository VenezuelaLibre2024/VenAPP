package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes2.dex */
public final class zzdw implements zzdt {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzdr zze;
    private zzdr zzf;
    private zzdr zzg;
    private zzdr zzh;
    private boolean zzi;
    private zzdv zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzdw() {
        zzdr zzdrVar = zzdr.zza;
        this.zze = zzdrVar;
        this.zzf = zzdrVar;
        this.zzg = zzdrVar;
        this.zzh = zzdrVar;
        ByteBuffer byteBuffer = zzdt.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final zzdr zza(zzdr zzdrVar) {
        if (zzdrVar.zzd != 2) {
            throw new zzds("Unhandled input format:", zzdrVar);
        }
        int i10 = this.zzb;
        if (i10 == -1) {
            i10 = zzdrVar.zzb;
        }
        this.zze = zzdrVar;
        zzdr zzdrVar2 = new zzdr(i10, zzdrVar.zzc, 2);
        this.zzf = zzdrVar2;
        this.zzi = true;
        return zzdrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final ByteBuffer zzb() {
        int zza;
        zzdv zzdvVar = this.zzj;
        if (zzdvVar != null && (zza = zzdvVar.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzdvVar.zzd(this.zzl);
            this.zzo += zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzdt.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzc() {
        if (zzg()) {
            zzdr zzdrVar = this.zze;
            this.zzg = zzdrVar;
            zzdr zzdrVar2 = this.zzf;
            this.zzh = zzdrVar2;
            if (this.zzi) {
                this.zzj = new zzdv(zzdrVar.zzb, zzdrVar.zzc, this.zzc, this.zzd, zzdrVar2.zzb);
            } else {
                zzdv zzdvVar = this.zzj;
                if (zzdvVar != null) {
                    zzdvVar.zzc();
                }
            }
        }
        this.zzm = zzdt.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzd() {
        zzdv zzdvVar = this.zzj;
        if (zzdvVar != null) {
            zzdvVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzdv zzdvVar = this.zzj;
            zzdvVar.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += remaining;
            zzdvVar.zzf(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzdr zzdrVar = zzdr.zza;
        this.zze = zzdrVar;
        this.zzf = zzdrVar;
        this.zzg = zzdrVar;
        this.zzh = zzdrVar;
        ByteBuffer byteBuffer = zzdt.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzg() {
        if (this.zzf.zzb == -1) {
            return false;
        }
        if (Math.abs(this.zzc - 1.0f) >= 1.0E-4f || Math.abs(this.zzd - 1.0f) >= 1.0E-4f) {
            return true;
        }
        return this.zzf.zzb != this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzh() {
        if (!this.zzp) {
            return false;
        }
        zzdv zzdvVar = this.zzj;
        return zzdvVar == null || zzdvVar.zza() == 0;
    }

    public final long zzi(long j10) {
        long j11 = this.zzo;
        if (j11 < 1024) {
            return (long) (this.zzc * j10);
        }
        long j12 = this.zzn;
        this.zzj.getClass();
        long zzb = j12 - r3.zzb();
        int i10 = this.zzh.zzb;
        int i11 = this.zzg.zzb;
        return i10 == i11 ? zzfy.zzs(j10, zzb, j11, RoundingMode.FLOOR) : zzfy.zzs(j10, zzb * i10, j11 * i11, RoundingMode.FLOOR);
    }

    public final void zzj(float f10) {
        if (this.zzd != f10) {
            this.zzd = f10;
            this.zzi = true;
        }
    }

    public final void zzk(float f10) {
        if (this.zzc != f10) {
            this.zzc = f10;
            this.zzi = true;
        }
    }
}
