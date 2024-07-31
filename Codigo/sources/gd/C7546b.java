package gd;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;
import p081ea.C7140c;

/* renamed from: gd.b */
/* loaded from: classes.dex */
public class C7546b implements Parcelable.Creator<C7545a> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m22910c(C7545a c7545a, Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, c7545a.m22906w1(), false);
        C7140c.m21200G(parcel, 2, c7545a.m22905v1(), false);
        C7140c.m21229u(parcel, 3, c7545a.m22908y1());
        C7140c.m21234z(parcel, 4, c7545a.m22904u1());
        C7140c.m21218j(parcel, 5, c7545a.m22907x1(), false);
        C7140c.m21198E(parcel, 6, c7545a.m22909z1(), i10, false);
        C7140c.m21210b(parcel, m21209a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C7545a createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        Uri uri = null;
        int i10 = 0;
        long j10 = 0;
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
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 4:
                    j10 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 5:
                    bundle = C7139b.m21173f(parcel, m21155E);
                    break;
                case 6:
                    uri = (Uri) C7139b.m21183p(parcel, m21155E, Uri.CREATOR);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C7545a(str, str2, i10, j10, bundle, uri);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7545a[] newArray(int i10) {
        return new C7545a[i10];
    }
}
