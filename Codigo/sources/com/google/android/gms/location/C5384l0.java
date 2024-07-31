package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.location.zzd;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.location.l0 */
/* loaded from: classes2.dex */
public final class C5384l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        WorkSource workSource = new WorkSource();
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 102;
        String str = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    j10 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 2:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 3:
                    i12 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 4:
                    j11 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 5:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 6:
                    workSource = (WorkSource) C7139b.m21183p(parcel, m21155E, WorkSource.CREATOR);
                    break;
                case 7:
                    i11 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 8:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 9:
                    zzdVar = (zzd) C7139b.m21183p(parcel, m21155E, zzd.CREATOR);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5369e(j10, i10, i12, j11, z10, i11, str, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5369e[i10];
    }
}
