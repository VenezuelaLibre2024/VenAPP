package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;

/* loaded from: classes2.dex */
public final class zzea {
    private CharSequence zza;
    private Bitmap zzb;
    private Layout.Alignment zzc;
    private Layout.Alignment zzd;
    private float zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;
    private float zzo;

    public zzea() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = -3.4028235E38f;
        this.zzf = Integer.MIN_VALUE;
        this.zzg = Integer.MIN_VALUE;
        this.zzh = -3.4028235E38f;
        this.zzi = Integer.MIN_VALUE;
        this.zzj = Integer.MIN_VALUE;
        this.zzk = -3.4028235E38f;
        this.zzl = -3.4028235E38f;
        this.zzm = -3.4028235E38f;
        this.zzn = Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzea(zzec zzecVar, zzdz zzdzVar) {
        this.zza = zzecVar.zzc;
        this.zzb = zzecVar.zzf;
        this.zzc = zzecVar.zzd;
        this.zzd = zzecVar.zze;
        this.zze = zzecVar.zzg;
        this.zzf = zzecVar.zzh;
        this.zzg = zzecVar.zzi;
        this.zzh = zzecVar.zzj;
        this.zzi = zzecVar.zzk;
        this.zzj = zzecVar.zzn;
        this.zzk = zzecVar.zzo;
        this.zzl = zzecVar.zzl;
        this.zzm = zzecVar.zzm;
        this.zzn = zzecVar.zzp;
        this.zzo = zzecVar.zzq;
    }

    public final int zza() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zzi;
    }

    public final zzea zzc(Bitmap bitmap) {
        this.zzb = bitmap;
        return this;
    }

    public final zzea zzd(float f10) {
        this.zzm = f10;
        return this;
    }

    public final zzea zze(float f10, int i10) {
        this.zze = f10;
        this.zzf = i10;
        return this;
    }

    public final zzea zzf(int i10) {
        this.zzg = i10;
        return this;
    }

    public final zzea zzg(Layout.Alignment alignment) {
        this.zzd = alignment;
        return this;
    }

    public final zzea zzh(float f10) {
        this.zzh = f10;
        return this;
    }

    public final zzea zzi(int i10) {
        this.zzi = i10;
        return this;
    }

    public final zzea zzj(float f10) {
        this.zzo = f10;
        return this;
    }

    public final zzea zzk(float f10) {
        this.zzl = f10;
        return this;
    }

    public final zzea zzl(CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzea zzm(Layout.Alignment alignment) {
        this.zzc = alignment;
        return this;
    }

    public final zzea zzn(float f10, int i10) {
        this.zzk = f10;
        this.zzj = i10;
        return this;
    }

    public final zzea zzo(int i10) {
        this.zzn = i10;
        return this;
    }

    public final zzec zzp() {
        return new zzec(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, false, -16777216, this.zzn, this.zzo, null);
    }

    public final CharSequence zzq() {
        return this.zza;
    }
}