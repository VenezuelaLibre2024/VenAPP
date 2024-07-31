package p439x9;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: x9.e */
/* loaded from: classes.dex */
public final class C12393e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                i11 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 2) {
                pendingIntent = (PendingIntent) C7139b.m21183p(parcel, m21155E, PendingIntent.CREATOR);
            } else if (m21190w == 3) {
                i12 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 4) {
                bundle = C7139b.m21173f(parcel, m21155E);
            } else if (m21190w == 5) {
                bArr = C7139b.m21174g(parcel, m21155E);
            } else if (m21190w != 1000) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                i10 = C7139b.m21157G(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C12391c(i10, i11, pendingIntent, i12, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C12391c[i10];
    }
}
