package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzafw implements zzbx {
    public static final Parcelable.Creator<zzafw> CREATOR = new zzafv();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzafw(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafw(Parcel parcel) {
        this.zza = parcel.readInt();
        String readString = parcel.readString();
        int i10 = zzfy.zza;
        this.zzb = readString;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }

    public static zzafw zzb(zzfp zzfpVar) {
        int zzg = zzfpVar.zzg();
        String zze = zzcb.zze(zzfpVar.zzA(zzfpVar.zzg(), zzfwq.zza));
        String zzA = zzfpVar.zzA(zzfpVar.zzg(), zzfwq.zzc);
        int zzg2 = zzfpVar.zzg();
        int zzg3 = zzfpVar.zzg();
        int zzg4 = zzfpVar.zzg();
        int zzg5 = zzfpVar.zzg();
        int zzg6 = zzfpVar.zzg();
        byte[] bArr = new byte[zzg6];
        zzfpVar.zzG(bArr, 0, zzg6);
        return new zzafw(zzg, zze, zzA, zzg2, zzg3, zzg4, zzg5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafw.class == obj.getClass()) {
            zzafw zzafwVar = (zzafw) obj;
            if (this.zza == zzafwVar.zza && this.zzb.equals(zzafwVar.zzb) && this.zzc.equals(zzafwVar.zzc) && this.zzd == zzafwVar.zzd && this.zze == zzafwVar.zze && this.zzf == zzafwVar.zzf && this.zzg == zzafwVar.zzg && Arrays.equals(this.zzh, zzafwVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final void zza(zzbt zzbtVar) {
        zzbtVar.zza(this.zzh, this.zza);
    }
}