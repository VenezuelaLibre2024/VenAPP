package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.r0;
import com.google.android.gms.location.u0;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzdb extends a {
    public static final Parcelable.Creator<zzdb> CREATOR = new zzdc();
    private final int zza;
    private final IBinder zzb;
    private final IBinder zzc;
    private final PendingIntent zzd;
    private final String zze;
    private final String zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdb(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.zza = i10;
        this.zzb = iBinder;
        this.zzc = iBinder2;
        this.zzd = pendingIntent;
        this.zze = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.zzf = str2;
    }

    public static zzdb zza(PendingIntent pendingIntent, String str, String str2) {
        return new zzdb(3, null, null, pendingIntent, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.location.r0, android.os.IBinder] */
    public static zzdb zzb(IInterface iInterface, r0 r0Var, String str, String str2) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzdb(2, iInterface, r0Var, null, null, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.location.u0, android.os.IBinder] */
    public static zzdb zzc(IInterface iInterface, u0 u0Var, String str, String str2) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzdb(1, iInterface, u0Var, null, null, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.zza);
        c.t(parcel, 2, this.zzb, false);
        c.t(parcel, 3, this.zzc, false);
        c.E(parcel, 4, this.zzd, i10, false);
        c.G(parcel, 5, this.zze, false);
        c.G(parcel, 6, this.zzf, false);
        c.b(parcel, a10);
    }
}
