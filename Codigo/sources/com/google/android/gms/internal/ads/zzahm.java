package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzahm implements zzbx {
    public static final Parcelable.Creator<zzahm> CREATOR = new zzahk();
    public final float zza;
    public final int zzb;

    public zzahm(float f10, int i10) {
        this.zza = f10;
        this.zzb = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzahm(Parcel parcel, zzahl zzahlVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahm.class == obj.getClass()) {
            zzahm zzahmVar = (zzahm) obj;
            if (this.zza == zzahmVar.zza && this.zzb == zzahmVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + this.zzb;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.zza + ", svcTemporalLayerCount=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
