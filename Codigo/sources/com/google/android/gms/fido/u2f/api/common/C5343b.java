package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p081ea.C7139b;
import p331ra.C10657a;
import p331ra.C10661e;

/* renamed from: com.google.android.gms.fido.u2f.api.common.b */
/* loaded from: classes.dex */
public final class C5343b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        Integer num = null;
        Double d10 = null;
        Uri uri = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        C10657a c10657a = null;
        String str = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 2:
                    num = C7139b.m21158H(parcel, m21155E);
                    break;
                case 3:
                    d10 = C7139b.m21152B(parcel, m21155E);
                    break;
                case 4:
                    uri = (Uri) C7139b.m21183p(parcel, m21155E, Uri.CREATOR);
                    break;
                case 5:
                    bArr = C7139b.m21174g(parcel, m21155E);
                    break;
                case 6:
                    arrayList = C7139b.m21188u(parcel, m21155E, C10661e.CREATOR);
                    break;
                case 7:
                    c10657a = (C10657a) C7139b.m21183p(parcel, m21155E, C10657a.CREATOR);
                    break;
                case 8:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new SignRequestParams(num, d10, uri, bArr, arrayList, c10657a, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignRequestParams[i10];
    }
}
