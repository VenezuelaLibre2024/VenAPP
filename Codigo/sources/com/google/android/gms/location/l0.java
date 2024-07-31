package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.location.zzd;

/* loaded from: classes2.dex */
public final class l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        WorkSource workSource = new WorkSource();
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 102;
        String str = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    j10 = ea.b.J(parcel, E);
                    break;
                case 2:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 3:
                    i12 = ea.b.G(parcel, E);
                    break;
                case 4:
                    j11 = ea.b.J(parcel, E);
                    break;
                case 5:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 6:
                    workSource = (WorkSource) ea.b.p(parcel, E, WorkSource.CREATOR);
                    break;
                case 7:
                    i11 = ea.b.G(parcel, E);
                    break;
                case 8:
                    str = ea.b.q(parcel, E);
                    break;
                case 9:
                    zzdVar = (zzd) ea.b.p(parcel, E, zzd.CREATOR);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new e(j10, i10, i12, j11, z10, i11, str, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
