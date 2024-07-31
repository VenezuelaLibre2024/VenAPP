package p308q9;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: q9.e */
/* loaded from: classes.dex */
public final class C10325e implements Parcelable.Creator<C10324d> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C10324d createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w != 2) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                str2 = C7139b.m21184q(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C10324d(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10324d[] newArray(int i10) {
        return new C10324d[i10];
    }
}
