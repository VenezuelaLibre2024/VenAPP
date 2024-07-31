package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.common.internal.o1 */
/* loaded from: classes.dex */
public final class C5266o1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        C5282u c5282u = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    c5282u = (C5282u) C7139b.m21183p(parcel, m21155E, C5282u.CREATOR);
                    break;
                case 2:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 3:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 4:
                    iArr = C7139b.m21178k(parcel, m21155E);
                    break;
                case 5:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 6:
                    iArr2 = C7139b.m21178k(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5237f(c5282u, z10, z11, iArr, i10, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5237f[i10];
    }
}
