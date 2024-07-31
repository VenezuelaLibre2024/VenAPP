package p121g9;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: g9.i */
/* loaded from: classes.dex */
public final class C7515i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        boolean z10 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 2:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 3:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 4:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 5:
                    str4 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 6:
                    str5 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 7:
                    str6 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 8:
                    str7 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 9:
                    intent = (Intent) C7139b.m21183p(parcel, m21155E, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = C7139b.m21156F(parcel, m21155E);
                    break;
                case 11:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C7516j(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7516j[i10];
    }
}
