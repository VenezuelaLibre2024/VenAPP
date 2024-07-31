package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.d;
import com.google.android.gms.location.e;
import com.google.android.gms.location.g0;
import com.google.android.gms.location.k;
import com.google.android.gms.location.p;
import com.google.android.gms.location.v;

/* loaded from: classes2.dex */
public final class zzn extends zza implements zzo {
    public zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final Location zzd() {
        Parcel zzb = zzb(7, zza());
        Location location = (Location) zzc.zza(zzb, Location.CREATOR);
        zzb.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final l zze(e eVar, zzq zzqVar) {
        Parcel zza = zza();
        zzc.zzd(zza, eVar);
        zzc.zze(zza, zzqVar);
        Parcel zzb = zzb(87, zza);
        l f22 = l.a.f2(zzb.readStrongBinder());
        zzb.recycle();
        return f22;
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final LocationAvailability zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzb = zzb(34, zza);
        LocationAvailability locationAvailability = (LocationAvailability) zzc.zza(zzb, LocationAvailability.CREATOR);
        zzb.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzg(k kVar, PendingIntent pendingIntent, zzm zzmVar) {
        Parcel zza = zza();
        zzc.zzd(zza, kVar);
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, zzmVar);
        zzc(57, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzh(p pVar, zzs zzsVar, String str) {
        Parcel zza = zza();
        zzc.zzd(zza, pVar);
        zzc.zze(zza, zzsVar);
        zza.writeString(null);
        zzc(63, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzi(zzk zzkVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzkVar);
        zzc(67, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzj(com.google.android.gms.location.l lVar, zzq zzqVar) {
        Parcel zza = zza();
        zzc.zzd(zza, lVar);
        zzc.zze(zza, zzqVar);
        zzc(82, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzk(zzdb zzdbVar, LocationRequest locationRequest, h hVar) {
        Parcel zza = zza();
        zzc.zzd(zza, zzdbVar);
        zzc.zzd(zza, locationRequest);
        zzc.zze(zza, hVar);
        zzc(88, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzl(PendingIntent pendingIntent, h hVar) {
        Parcel zza = zza();
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, hVar);
        zzc(73, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzm(PendingIntent pendingIntent) {
        Parcel zza = zza();
        zzc.zzd(zza, pendingIntent);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzn(PendingIntent pendingIntent, zzm zzmVar, String str) {
        Parcel zza = zza();
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, zzmVar);
        zza.writeString(str);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzo(String[] strArr, zzm zzmVar, String str) {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zzc.zze(zza, zzmVar);
        zza.writeString(str);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzp(PendingIntent pendingIntent, h hVar) {
        Parcel zza = zza();
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, hVar);
        zzc(69, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzq(d dVar, PendingIntent pendingIntent, h hVar) {
        Parcel zza = zza();
        zzc.zzd(zza, dVar);
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, hVar);
        zzc(72, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzr(long j10, boolean z10, PendingIntent pendingIntent) {
        Parcel zza = zza();
        zza.writeLong(j10);
        zzc.zzc(zza, true);
        zzc.zzd(zza, pendingIntent);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzs(g0 g0Var, PendingIntent pendingIntent, h hVar) {
        Parcel zza = zza();
        zzc.zzd(zza, g0Var);
        zzc.zzd(zza, pendingIntent);
        zzc.zze(zza, hVar);
        zzc(70, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzt(PendingIntent pendingIntent, v vVar, h hVar) {
        Parcel zza = zza();
        zzc.zzd(zza, pendingIntent);
        zzc.zzd(zza, vVar);
        zzc.zze(zza, hVar);
        zzc(79, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzu(Location location) {
        Parcel zza = zza();
        zzc.zzd(zza, location);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzv(Location location, h hVar) {
        Parcel zza = zza();
        zzc.zzd(zza, location);
        zzc.zze(zza, hVar);
        zzc(85, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzw(boolean z10) {
        Parcel zza = zza();
        zzc.zzc(zza, z10);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzx(boolean z10, h hVar) {
        Parcel zza = zza();
        zzc.zzc(zza, z10);
        zzc.zze(zza, hVar);
        zzc(84, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzy(zzdb zzdbVar, h hVar) {
        Parcel zza = zza();
        zzc.zzd(zza, zzdbVar);
        zzc.zze(zza, hVar);
        zzc(89, zza);
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzz(zzdf zzdfVar) {
        Parcel zza = zza();
        zzc.zzd(zza, zzdfVar);
        zzc(59, zza);
    }
}
