package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;
import p418wa.C12101e;

/* renamed from: com.google.android.gms.measurement.internal.d0 */
/* loaded from: classes2.dex */
public final class C5461d0 extends AbstractC7138a {
    public static final Parcelable.Creator<C5461d0> CREATOR = new C12101e();

    /* renamed from: a */
    public final String f11174a;

    /* renamed from: b */
    public final C5742z f11175b;

    /* renamed from: c */
    public final String f11176c;

    /* renamed from: d */
    public final long f11177d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5461d0(C5461d0 c5461d0, long j10) {
        C5276s.m13324j(c5461d0);
        this.f11174a = c5461d0.f11174a;
        this.f11175b = c5461d0.f11175b;
        this.f11176c = c5461d0.f11176c;
        this.f11177d = j10;
    }

    public C5461d0(String str, C5742z c5742z, String str2, long j10) {
        this.f11174a = str;
        this.f11175b = c5742z;
        this.f11176c = str2;
        this.f11177d = j10;
    }

    public final String toString() {
        return "origin=" + this.f11176c + ",name=" + this.f11174a + ",params=" + String.valueOf(this.f11175b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, this.f11174a, false);
        C7140c.m21198E(parcel, 3, this.f11175b, i10, false);
        C7140c.m21200G(parcel, 4, this.f11176c, false);
        C7140c.m21234z(parcel, 5, this.f11177d);
        C7140c.m21210b(parcel, m21209a);
    }
}
