package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;
import p081ea.C7140c;

/* renamed from: com.google.firebase.messaging.s0 */
/* loaded from: classes.dex */
public class C6258s0 implements Parcelable.Creator<C6256r0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m17190c(C6256r0 c6256r0, Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21218j(parcel, 2, c6256r0.f13371a, false);
        C7140c.m21210b(parcel, m21209a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C6256r0 createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            if (C7139b.m21190w(m21155E) != 2) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                bundle = C7139b.m21173f(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C6256r0(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6256r0[] newArray(int i10) {
        return new C6256r0[i10];
    }
}
