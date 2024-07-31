package p272oc;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: oc.b2 */
/* loaded from: classes.dex */
public final class C9838b2 implements Parcelable.Creator<C9907y1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9907y1 createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 2:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 3:
                    str5 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 4:
                    str4 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 5:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 6:
                    str6 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 7:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 8:
                    str7 = C7139b.m21184q(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C9907y1(str, str2, str3, str4, str5, str6, z10, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9907y1[] newArray(int i10) {
        return new C9907y1[i10];
    }
}
