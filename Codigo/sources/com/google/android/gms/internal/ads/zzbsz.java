package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public final class zzbsz extends zzayg implements zzbtb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbsz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zze() {
        zzbm(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzf() {
        zzbm(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzg(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbm(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzh(c3 c3Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, c3Var);
        zzbm(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzi(int i10, String str) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeString(str);
        zzbm(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzj(int i10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzk(c3 c3Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, c3Var);
        zzbm(24, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzl(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbm(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzm() {
        zzbm(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzn() {
        zzbm(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzo() {
        zzbm(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzp() {
        zzbm(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzq(String str, String str2) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbm(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzr(zzbkg zzbkgVar, String str) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbkgVar);
        zza.writeString(str);
        zzbm(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzs(zzcag zzcagVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzt(zzcak zzcakVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzcakVar);
        zzbm(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzu() {
        zzbm(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzv() {
        zzbm(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzw() {
        zzbm(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzx() {
        zzbm(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzy() {
        zzbm(13, zza());
    }
}
