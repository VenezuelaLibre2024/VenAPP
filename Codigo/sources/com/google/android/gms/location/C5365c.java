package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.location.c */
/* loaded from: classes2.dex */
public class C5365c extends AbstractC7138a {
    public static final Parcelable.Creator<C5365c> CREATOR = new C5378i0();

    /* renamed from: a */
    private final int f10913a;

    /* renamed from: b */
    private final int f10914b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5365c(int i10, int i11) {
        this.f10913a = i10;
        this.f10914b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5365c)) {
            return false;
        }
        C5365c c5365c = (C5365c) obj;
        return this.f10913a == c5365c.f10913a && this.f10914b == c5365c.f10914b;
    }

    public int hashCode() {
        return C5270q.m13305c(Integer.valueOf(this.f10913a), Integer.valueOf(this.f10914b));
    }

    public String toString() {
        return "ActivityTransition [mActivityType=" + this.f10913a + ", mTransitionType=" + this.f10914b + "]";
    }

    /* renamed from: u1 */
    public int m13508u1() {
        return this.f10913a;
    }

    /* renamed from: v1 */
    public int m13509v1() {
        return this.f10914b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C5276s.m13324j(parcel);
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, m13508u1());
        C7140c.m21229u(parcel, 2, m13509v1());
        C7140c.m21210b(parcel, m21209a);
    }
}
