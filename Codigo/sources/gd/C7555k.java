package gd;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import gd.C7554j;
import java.util.ArrayList;
import p081ea.C7139b;
import p081ea.C7140c;

/* renamed from: gd.k */
/* loaded from: classes.dex */
public class C7555k implements Parcelable.Creator<C7554j> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m22933c(C7554j c7554j, Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 1, c7554j.mo22032i0(), i10, false);
        C7140c.m21198E(parcel, 2, c7554j.mo22030U(), i10, false);
        C7140c.m21204K(parcel, 3, c7554j.mo22031h0(), false);
        C7140c.m21210b(parcel, m21209a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C7554j createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                uri = (Uri) C7139b.m21183p(parcel, m21155E, Uri.CREATOR);
            } else if (m21190w == 2) {
                uri2 = (Uri) C7139b.m21183p(parcel, m21155E, Uri.CREATOR);
            } else if (m21190w != 3) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                arrayList = C7139b.m21188u(parcel, m21155E, C7554j.a.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C7554j(uri, uri2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7554j[] newArray(int i10) {
        return new C7554j[i10];
    }
}
