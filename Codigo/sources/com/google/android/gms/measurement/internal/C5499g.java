package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.measurement.internal.g */
/* loaded from: classes2.dex */
public final class C5499g implements Parcelable.Creator<C5460d> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5460d createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        C5524hb c5524hb = null;
        String str3 = null;
        C5461d0 c5461d0 = null;
        C5461d0 c5461d02 = null;
        C5461d0 c5461d03 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 2:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 3:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 4:
                    c5524hb = (C5524hb) C7139b.m21183p(parcel, m21155E, C5524hb.CREATOR);
                    break;
                case 5:
                    j10 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 6:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 7:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 8:
                    c5461d0 = (C5461d0) C7139b.m21183p(parcel, m21155E, C5461d0.CREATOR);
                    break;
                case 9:
                    j11 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 10:
                    c5461d02 = (C5461d0) C7139b.m21183p(parcel, m21155E, C5461d0.CREATOR);
                    break;
                case 11:
                    j12 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 12:
                    c5461d03 = (C5461d0) C7139b.m21183p(parcel, m21155E, C5461d0.CREATOR);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5460d(str, str2, c5524hb, j10, z10, str3, c5461d0, j11, c5461d02, j12, c5461d03);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5460d[] newArray(int i10) {
        return new C5460d[i10];
    }
}
