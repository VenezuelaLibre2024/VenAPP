package p484z9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: z9.d */
/* loaded from: classes.dex */
public final class C12831d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        Bundle bundle = null;
        int i11 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 2) {
                i11 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w != 3) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                bundle = C7139b.m21173f(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C12828a(i10, i11, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C12828a[i10];
    }
}
