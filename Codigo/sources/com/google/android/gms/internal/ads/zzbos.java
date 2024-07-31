package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzbos extends ea.a {
    public static final Parcelable.Creator<zzbos> CREATOR = new zzbot();
    public final boolean zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;
    public final String[] zze;
    public final String[] zzf;
    public final boolean zzg;
    public final long zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbos(boolean z10, String str, int i10, byte[] bArr, String[] strArr, String[] strArr2, boolean z11, long j10) {
        this.zza = z10;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = bArr;
        this.zze = strArr;
        this.zzf = strArr2;
        this.zzg = z11;
        this.zzh = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.g(parcel, 1, z10);
        ea.c.G(parcel, 2, this.zzb, false);
        ea.c.u(parcel, 3, this.zzc);
        ea.c.l(parcel, 4, this.zzd, false);
        ea.c.H(parcel, 5, this.zze, false);
        ea.c.H(parcel, 6, this.zzf, false);
        ea.c.g(parcel, 7, this.zzg);
        ea.c.z(parcel, 8, this.zzh);
        ea.c.b(parcel, a10);
    }
}
