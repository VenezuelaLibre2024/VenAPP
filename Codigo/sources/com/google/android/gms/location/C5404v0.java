package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzd;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.location.v0 */
/* loaded from: classes2.dex */
public final class C5404v0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        long j10 = Long.MAX_VALUE;
        int i10 = 0;
        boolean z10 = false;
        String str = null;
        zzd zzdVar = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                j10 = C7139b.m21160J(parcel, m21155E);
            } else if (m21190w == 2) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 3) {
                z10 = C7139b.m21191x(parcel, m21155E);
            } else if (m21190w == 4) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w != 5) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                zzdVar = (zzd) C7139b.m21183p(parcel, m21155E, zzd.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5383l(j10, i10, z10, str, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5383l[i10];
    }
}
