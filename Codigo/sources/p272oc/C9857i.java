package p272oc;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: oc.i */
/* loaded from: classes.dex */
public final class C9857i implements Parcelable.Creator<C9848f> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9848f createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                j10 = C7139b.m21160J(parcel, m21155E);
            } else if (m21190w != 2) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                j11 = C7139b.m21160J(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C9848f(j10, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9848f[] newArray(int i10) {
        return new C9848f[i10];
    }
}
