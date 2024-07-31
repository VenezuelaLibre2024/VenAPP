package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzahj implements zzbx {
    public static final Parcelable.Creator<zzahj> CREATOR = new zzahf();
    public final List zza;

    public zzahj(List list) {
        this.zza = list;
        boolean z10 = false;
        if (!list.isEmpty()) {
            long j10 = ((zzahi) list.get(0)).zzc;
            int i10 = 1;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((zzahi) list.get(i10)).zzb < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((zzahi) list.get(i10)).zzc;
                    i10++;
                }
            }
        }
        zzek.zzd(!z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzahj.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzahj) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
