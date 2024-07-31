package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.q0;
import com.google.android.gms.location.r0;
import com.google.android.gms.location.t0;
import com.google.android.gms.location.u0;
import ea.a;
import ea.c;

@Deprecated
/* loaded from: classes2.dex */
public final class zzdf extends a {
    public static final Parcelable.Creator<zzdf> CREATOR = new zzdg();
    private final int zza;
    private final zzdd zzb;
    private final u0 zzc;
    private final r0 zzd;
    private final PendingIntent zze;
    private final zzk zzf;
    private final String zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdf(int i10, zzdd zzddVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.zza = i10;
        this.zzb = zzddVar;
        zzk zzkVar = null;
        this.zzc = iBinder != null ? t0.zzb(iBinder) : null;
        this.zze = pendingIntent;
        this.zzd = iBinder2 != null ? q0.zzb(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzkVar = queryLocalInterface instanceof zzk ? (zzk) queryLocalInterface : new zzi(iBinder3);
        }
        this.zzf = zzkVar;
        this.zzg = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.zza);
        c.E(parcel, 2, this.zzb, i10, false);
        u0 u0Var = this.zzc;
        c.t(parcel, 3, u0Var == null ? null : u0Var.asBinder(), false);
        c.E(parcel, 4, this.zze, i10, false);
        r0 r0Var = this.zzd;
        c.t(parcel, 5, r0Var == null ? null : r0Var.asBinder(), false);
        zzk zzkVar = this.zzf;
        c.t(parcel, 6, zzkVar != null ? zzkVar.asBinder() : null, false);
        c.G(parcel, 8, this.zzg, false);
        c.b(parcel, a10);
    }
}
