package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzgc implements zzbx {
    public static final Parcelable.Creator<zzgc> CREATOR = new zzga();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgc(Parcel parcel, zzgb zzgbVar) {
        String readString = parcel.readString();
        int i10 = zzfy.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }

    public zzgc(String str, byte[] bArr, int i10, int i11) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzgc.class == obj.getClass()) {
            zzgc zzgcVar = (zzgc) obj;
            if (this.zza.equals(zzgcVar.zza) && Arrays.equals(this.zzb, zzgcVar.zzb) && this.zzc == zzgcVar.zzc && this.zzd == zzgcVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final String toString() {
        String zzz;
        int i10 = this.zzd;
        if (i10 != 1) {
            if (i10 == 23) {
                byte[] bArr = this.zzb;
                int i11 = zzfy.zza;
                zzek.zzd(bArr.length == 4);
                zzz = String.valueOf(Float.intBitsToFloat((bArr[3] & 255) | ((bArr[1] & 255) << 16) | (bArr[0] << 24) | ((bArr[2] & 255) << 8)));
            } else if (i10 != 67) {
                byte[] bArr2 = this.zzb;
                int length = bArr2.length;
                StringBuilder sb2 = new StringBuilder(length + length);
                for (int i12 = 0; i12 < bArr2.length; i12++) {
                    sb2.append(Character.forDigit((bArr2[i12] >> 4) & 15, 16));
                    sb2.append(Character.forDigit(bArr2[i12] & 15, 16));
                }
                zzz = sb2.toString();
            } else {
                byte[] bArr3 = this.zzb;
                int i13 = zzfy.zza;
                zzek.zzd(bArr3.length == 4);
                zzz = String.valueOf(bArr3[3] | (bArr3[1] << 16) | (bArr3[0] << 24) | (bArr3[2] << 8));
            }
        } else {
            zzz = zzfy.zzz(this.zzb);
        }
        return "mdta: key=" + this.zza + ", value=" + zzz;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
