package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzgi implements zzbx {
    public static final Parcelable.Creator<zzgi> CREATOR = new zzgg();
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzgi(long j10, long j11, long j12) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgi(Parcel parcel, zzgh zzghVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgi)) {
            return false;
        }
        zzgi zzgiVar = (zzgi) obj;
        return this.zza == zzgiVar.zza && this.zzb == zzgiVar.zzb && this.zzc == zzgiVar.zzc;
    }

    public final int hashCode() {
        long j10 = this.zzc;
        long j11 = this.zza;
        int i10 = ((int) (j11 ^ (j11 >>> 32))) + 527;
        long j12 = j10 ^ (j10 >>> 32);
        long j13 = this.zzb;
        return (((i10 * 31) + ((int) ((j13 >>> 32) ^ j13))) * 31) + ((int) j12);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
