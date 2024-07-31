package p308q9;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: q9.g */
/* loaded from: classes.dex */
public final class C10327g implements Parcelable.Creator<C10326f> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C10326f createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w != 2) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                i10 = C7139b.m21157G(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C10326f(str, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10326f[] newArray(int i10) {
        return new C10326f[i10];
    }
}
