package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ca.C1898d;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.common.internal.m1 */
/* loaded from: classes.dex */
public final class C5260m1 extends AbstractC7138a {
    public static final Parcelable.Creator<C5260m1> CREATOR = new C5263n1();

    /* renamed from: a */
    Bundle f10717a;

    /* renamed from: b */
    C1898d[] f10718b;

    /* renamed from: c */
    int f10719c;

    /* renamed from: d */
    C5237f f10720d;

    public C5260m1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5260m1(Bundle bundle, C1898d[] c1898dArr, int i10, C5237f c5237f) {
        this.f10717a = bundle;
        this.f10718b = c1898dArr;
        this.f10719c = i10;
        this.f10720d = c5237f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21218j(parcel, 1, this.f10717a, false);
        C7140c.m21203J(parcel, 2, this.f10718b, i10, false);
        C7140c.m21229u(parcel, 3, this.f10719c);
        C7140c.m21198E(parcel, 4, this.f10720d, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
