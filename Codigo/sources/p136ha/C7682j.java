package p136ha;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: ha.j */
/* loaded from: classes.dex */
public final class C7682j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            if (C7139b.m21190w(m21155E) != 1) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                pendingIntent = (PendingIntent) C7139b.m21183p(parcel, m21155E, PendingIntent.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C7677e(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7677e[i10];
    }
}
