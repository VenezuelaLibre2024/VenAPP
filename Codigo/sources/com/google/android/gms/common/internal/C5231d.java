package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.common.internal.d */
/* loaded from: classes.dex */
public class C5231d extends AbstractC7138a {
    public static final Parcelable.Creator<C5231d> CREATOR = new C5221a0();

    /* renamed from: a */
    public final int f10644a;

    /* renamed from: b */
    public final String f10645b;

    public C5231d(int i10, String str) {
        this.f10644a = i10;
        this.f10645b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5231d)) {
            return false;
        }
        C5231d c5231d = (C5231d) obj;
        return c5231d.f10644a == this.f10644a && C5270q.m13304b(c5231d.f10645b, this.f10645b);
    }

    public final int hashCode() {
        return this.f10644a;
    }

    public final String toString() {
        return this.f10644a + ":" + this.f10645b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f10644a);
        C7140c.m21200G(parcel, 2, this.f10645b, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
