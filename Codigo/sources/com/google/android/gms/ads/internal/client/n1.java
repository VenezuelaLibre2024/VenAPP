package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbsv;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n1 extends zzayg implements p1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final float zze() {
        Parcel zzbl = zzbl(7, zza());
        float readFloat = zzbl.readFloat();
        zzbl.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final List zzg() {
        Parcel zzbl = zzbl(13, zza());
        ArrayList createTypedArrayList = zzbl.createTypedArrayList(zzbpd.CREATOR);
        zzbl.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzi() {
        zzbm(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzk() {
        zzbm(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzl(String str, com.google.android.gms.dynamic.b bVar) {
        Parcel zza = zza();
        zza.writeString(null);
        zzayi.zzf(zza, bVar);
        zzbm(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzm(c2 c2Var) {
        Parcel zza = zza();
        zzayi.zzf(zza, c2Var);
        zzbm(16, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzn(com.google.android.gms.dynamic.b bVar, String str) {
        Parcel zza = zza();
        zzayi.zzf(zza, bVar);
        zza.writeString(str);
        zzbm(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzo(zzbsv zzbsvVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbsvVar);
        zzbm(11, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzp(boolean z10) {
        Parcel zza = zza();
        int i10 = zzayi.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbm(4, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzq(float f10) {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzs(zzbpk zzbpkVar) {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbpkVar);
        zzbm(12, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzt(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbm(18, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzu(i4 i4Var) {
        Parcel zza = zza();
        zzayi.zzd(zza, i4Var);
        zzbm(14, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final boolean zzv() {
        Parcel zzbl = zzbl(8, zza());
        boolean zzg = zzayi.zzg(zzbl);
        zzbl.recycle();
        return zzg;
    }
}
