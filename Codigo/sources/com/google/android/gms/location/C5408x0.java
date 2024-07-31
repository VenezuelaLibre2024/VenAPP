package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.location.zzd;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.location.x0 */
/* loaded from: classes2.dex */
public final class C5408x0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
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
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 2:
                    j10 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 3:
                    j11 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 4:
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
                case 5:
                    j13 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 6:
                    i11 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 7:
                    f10 = C7139b.m21153C(parcel, m21155E);
                    break;
                case 8:
                    j12 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 9:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 10:
                    j14 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 11:
                    j15 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 12:
                    i12 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 13:
                    i13 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 14:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 15:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 16:
                    workSource = (WorkSource) C7139b.m21183p(parcel, m21155E, WorkSource.CREATOR);
                    break;
                case 17:
                    zzdVar = (zzd) C7139b.m21183p(parcel, m21155E, zzd.CREATOR);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new LocationRequest(i10, j10, j11, j12, j13, j14, i11, f10, z10, j15, i12, i13, str, z11, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
