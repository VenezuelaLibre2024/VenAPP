package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
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
public interface zzo extends IInterface {
    @Deprecated
    Location zzd();

    @Deprecated
    l zze(e eVar, zzq zzqVar);

    @Deprecated
    LocationAvailability zzf(String str);

    void zzg(k kVar, PendingIntent pendingIntent, zzm zzmVar);

    void zzh(p pVar, zzs zzsVar, String str);

    void zzi(zzk zzkVar);

    @Deprecated
    void zzj(com.google.android.gms.location.l lVar, zzq zzqVar);

    void zzk(zzdb zzdbVar, LocationRequest locationRequest, h hVar);

    void zzl(PendingIntent pendingIntent, h hVar);

    void zzm(PendingIntent pendingIntent);

    void zzn(PendingIntent pendingIntent, zzm zzmVar, String str);

    void zzo(String[] strArr, zzm zzmVar, String str);

    void zzp(PendingIntent pendingIntent, h hVar);

    void zzq(d dVar, PendingIntent pendingIntent, h hVar);

    void zzr(long j10, boolean z10, PendingIntent pendingIntent);

    void zzs(g0 g0Var, PendingIntent pendingIntent, h hVar);

    void zzt(PendingIntent pendingIntent, v vVar, h hVar);

    @Deprecated
    void zzu(Location location);

    void zzv(Location location, h hVar);

    @Deprecated
    void zzw(boolean z10);

    void zzx(boolean z10, h hVar);

    void zzy(zzdb zzdbVar, h hVar);

    @Deprecated
    void zzz(zzdf zzdfVar);
}
