package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import x8.a0;

/* loaded from: classes2.dex */
public final class zzbvg extends ea.a {
    public static final Parcelable.Creator<zzbvg> CREATOR = new zzbvh();
    public final int zza;
    public final int zzb;
    public final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvg(int i10, int i11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzbvg zza(a0 a0Var) {
        return new zzbvg(a0Var.a(), a0Var.c(), a0Var.b());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbvg)) {
            zzbvg zzbvgVar = (zzbvg) obj;
            if (zzbvgVar.zzc == this.zzc && zzbvgVar.zzb == this.zzb && zzbvgVar.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        return this.zza + "." + this.zzb + "." + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, i11);
        ea.c.u(parcel, 2, this.zzb);
        ea.c.u(parcel, 3, this.zzc);
        ea.c.b(parcel, a10);
    }
}
