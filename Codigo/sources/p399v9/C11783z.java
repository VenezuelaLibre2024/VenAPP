package p399v9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;
import qa.C10394t;

/* renamed from: v9.z */
/* loaded from: classes.dex */
public final class C11783z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        C10394t c10394t = null;
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
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 4:
                    str4 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 5:
                    uri = (Uri) C7139b.m21183p(parcel, m21155E, Uri.CREATOR);
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
                    c10394t = (C10394t) C7139b.m21183p(parcel, m21155E, C10394t.CREATOR);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C11766i(str, str2, str3, str4, uri, str5, str6, str7, c10394t);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11766i[i10];
    }
}
