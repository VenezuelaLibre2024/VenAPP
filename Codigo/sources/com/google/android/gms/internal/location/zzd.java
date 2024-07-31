package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import ea.a;
import ea.c;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzd extends a {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();
    private final int zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;
    private final int zze;
    private final String zzf;
    private final zzd zzg;
    private final List zzh;

    static {
        Process.myUid();
        Process.myPid();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(int i10, int i11, String str, String str2, String str3, int i12, List list, zzd zzdVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = str3;
        this.zze = i12;
        this.zzh = zzds.zzj(list);
        this.zzg = zzdVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzd) {
            zzd zzdVar = (zzd) obj;
            if (this.zza == zzdVar.zza && this.zzb == zzdVar.zzb && this.zze == zzdVar.zze && this.zzc.equals(zzdVar.zzc) && zzdl.zza(this.zzd, zzdVar.zzd) && zzdl.zza(this.zzf, zzdVar.zzf) && zzdl.zza(this.zzg, zzdVar.zzg) && this.zzh.equals(zzdVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzc, this.zzd, this.zzf});
    }

    public final String toString() {
        int length = this.zzc.length() + 18;
        String str = this.zzd;
        if (str != null) {
            length += str.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.zza);
        sb2.append("/");
        sb2.append(this.zzc);
        if (this.zzd != null) {
            sb2.append("[");
            if (this.zzd.startsWith(this.zzc)) {
                sb2.append((CharSequence) this.zzd, this.zzc.length(), this.zzd.length());
            } else {
                sb2.append(this.zzd);
            }
            sb2.append("]");
        }
        if (this.zzf != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(this.zzf.hashCode()));
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.zza);
        c.u(parcel, 2, this.zzb);
        c.G(parcel, 3, this.zzc, false);
        c.G(parcel, 4, this.zzd, false);
        c.u(parcel, 5, this.zze);
        c.G(parcel, 6, this.zzf, false);
        c.E(parcel, 7, this.zzg, i10, false);
        c.K(parcel, 8, this.zzh, false);
        c.b(parcel, a10);
    }
}
