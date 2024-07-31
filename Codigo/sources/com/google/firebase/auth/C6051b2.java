package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C6112q0;
import p081ea.C7139b;

/* renamed from: com.google.firebase.auth.b2 */
/* loaded from: classes.dex */
public final class C6051b2 implements Parcelable.Creator<C6112q0.a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6112q0.a createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            C7139b.m21190w(m21155E);
            C7139b.m21164N(parcel, m21155E);
        }
        C7139b.m21189v(parcel, m21165O);
        return new C6112q0.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C6112q0.a[] newArray(int i10) {
        return new C6112q0.a[i10];
    }
}
