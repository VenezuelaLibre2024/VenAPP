package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.location.zzd;

/* loaded from: classes2.dex */
public final class x0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        WorkSource workSource = new WorkSource();
        int i10 = 102;
        long j10 = 3600000;
        long j11 = 600000;
        long j12 = 0;
        long j13 = Long.MAX_VALUE;
        long j14 = Long.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        float f10 = 0.0f;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        long j15 = -1;
        String str = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 2:
                    j10 = ea.b.J(parcel, E);
                    break;
                case 3:
                    j11 = ea.b.J(parcel, E);
                    break;
                case 4:
                default:
                    ea.b.N(parcel, E);
                    break;
                case 5:
                    j13 = ea.b.J(parcel, E);
                    break;
                case 6:
                    i11 = ea.b.G(parcel, E);
                    break;
                case 7:
                    f10 = ea.b.C(parcel, E);
                    break;
                case 8:
                    j12 = ea.b.J(parcel, E);
                    break;
                case 9:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 10:
                    j14 = ea.b.J(parcel, E);
                    break;
                case 11:
                    j15 = ea.b.J(parcel, E);
                    break;
                case 12:
                    i12 = ea.b.G(parcel, E);
                    break;
                case 13:
                    i13 = ea.b.G(parcel, E);
                    break;
                case 14:
                    str = ea.b.q(parcel, E);
                    break;
                case 15:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 16:
                    workSource = (WorkSource) ea.b.p(parcel, E, WorkSource.CREATOR);
                    break;
                case 17:
                    zzdVar = (zzd) ea.b.p(parcel, E, zzd.CREATOR);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new LocationRequest(i10, j10, j11, j12, j13, j14, i11, f10, z10, j15, i12, i13, str, z11, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
