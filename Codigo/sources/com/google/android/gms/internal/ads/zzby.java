package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzby implements Parcelable {
    public static final Parcelable.Creator<zzby> CREATOR = new zzbw();
    public final long zza;
    private final zzbx[] zzb;

    public zzby(long j10, zzbx... zzbxVarArr) {
        this.zza = j10;
        this.zzb = zzbxVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzby(Parcel parcel) {
        this.zzb = new zzbx[parcel.readInt()];
        int i10 = 0;
        while (true) {
            zzbx[] zzbxVarArr = this.zzb;
            if (i10 >= zzbxVarArr.length) {
                this.zza = parcel.readLong();
                return;
            } else {
                zzbxVarArr[i10] = (zzbx) parcel.readParcelable(zzbx.class.getClassLoader());
                i10++;
            }
        }
    }

    public zzby(List list) {
        this(-9223372036854775807L, (zzbx[]) list.toArray(new zzbx[0]));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzby.class == obj.getClass()) {
            zzby zzbyVar = (zzby) obj;
            if (Arrays.equals(this.zzb, zzbyVar.zzb) && this.zza == zzbyVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.zzb) * 31;
        long j10 = this.zza;
        return hashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        String str;
        long j10 = this.zza;
        String arrays = Arrays.toString(this.zzb);
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        return "entries=" + arrays + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zzb.length);
        for (zzbx zzbxVar : this.zzb) {
            parcel.writeParcelable(zzbxVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzbx zzb(int i10) {
        return this.zzb[i10];
    }

    public final zzby zzc(zzbx... zzbxVarArr) {
        int length = zzbxVarArr.length;
        if (length == 0) {
            return this;
        }
        long j10 = this.zza;
        zzbx[] zzbxVarArr2 = this.zzb;
        int i10 = zzfy.zza;
        int length2 = zzbxVarArr2.length;
        Object[] copyOf = Arrays.copyOf(zzbxVarArr2, length2 + length);
        System.arraycopy(zzbxVarArr, 0, copyOf, length2, length);
        return new zzby(j10, (zzbx[]) copyOf);
    }

    public final zzby zzd(zzby zzbyVar) {
        return zzbyVar == null ? this : zzc(zzbyVar.zzb);
    }
}
