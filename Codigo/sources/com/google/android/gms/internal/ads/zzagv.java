package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzagv extends zzagr {
    public static final Parcelable.Creator<zzagv> CREATOR = new zzagu();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzagv(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagv(Parcel parcel) {
        super("MLLT");
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i10 = zzfy.zza;
        this.zzd = createIntArray;
        this.zze = parcel.createIntArray();
    }

    @Override // com.google.android.gms.internal.ads.zzagr, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagv.class == obj.getClass()) {
            zzagv zzagvVar = (zzagv) obj;
            if (this.zza == zzagvVar.zza && this.zzb == zzagvVar.zzb && this.zzc == zzagvVar.zzc && Arrays.equals(this.zzd, zzagvVar.zzd) && Arrays.equals(this.zze, zzagvVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeIntArray(this.zzd);
        parcel.writeIntArray(this.zze);
    }
}
