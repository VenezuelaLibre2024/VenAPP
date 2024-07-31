package gd;

import android.os.Parcel;
import android.os.Parcelable;
import gd.C7554j;
import p081ea.C7139b;
import p081ea.C7140c;

/* renamed from: gd.l */
/* loaded from: classes.dex */
public class C7556l implements Parcelable.Creator<C7554j.a> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m22936c(C7554j.a aVar, Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, aVar.getMessage(), false);
        C7140c.m21210b(parcel, m21209a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C7554j.a createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            if (C7139b.m21190w(m21155E) != 2) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                str = C7139b.m21184q(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C7554j.a(str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7554j.a[] newArray(int i10) {
        return new C7554j.a[i10];
    }
}
