package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.measurement.internal.gb */
/* loaded from: classes2.dex */
public final class C5511gb implements Parcelable.Creator<C5524hb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5524hb createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 2:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 3:
                    j10 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 4:
                    l10 = C7139b.m21161K(parcel, m21155E);
                    break;
                case 5:
                    f10 = C7139b.m21154D(parcel, m21155E);
                    break;
                case 6:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 7:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 8:
                    d10 = C7139b.m21152B(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5524hb(i10, str, j10, l10, f10, str2, str3, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C5524hb[] newArray(int i10) {
        return new C5524hb[i10];
    }
}
