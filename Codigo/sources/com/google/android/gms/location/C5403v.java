package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import java.util.List;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.location.v */
/* loaded from: classes2.dex */
public class C5403v extends AbstractC7138a {
    public static final Parcelable.Creator<C5403v> CREATOR = new C5366c0();

    /* renamed from: a */
    private final List f10998a;

    /* renamed from: b */
    private final int f10999b;

    public C5403v(List list, int i10) {
        this.f10998a = list;
        this.f10999b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5403v)) {
            return false;
        }
        C5403v c5403v = (C5403v) obj;
        return C5270q.m13304b(this.f10998a, c5403v.f10998a) && this.f10999b == c5403v.f10999b;
    }

    public int hashCode() {
        return C5270q.m13305c(this.f10998a, Integer.valueOf(this.f10999b));
    }

    /* renamed from: u1 */
    public int m13544u1() {
        return this.f10999b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C5276s.m13324j(parcel);
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21204K(parcel, 1, this.f10998a, false);
        C7140c.m21229u(parcel, 2, m13544u1());
        C7140c.m21210b(parcel, m21209a);
    }
}
