package ba;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: ba.d */
/* loaded from: classes.dex */
public final class C1691d implements Parcelable.Creator<C1685a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1685a createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            if (C7139b.m21190w(m21155E) != 1) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                intent = (Intent) C7139b.m21183p(parcel, m21155E, Intent.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C1685a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C1685a[] newArray(int i10) {
        return new C1685a[i10];
    }
}
