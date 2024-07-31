package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ca.C1894b;
import com.google.android.gms.common.internal.InterfaceC5252k;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.common.internal.u0 */
/* loaded from: classes.dex */
public final class C5283u0 extends AbstractC7138a {
    public static final Parcelable.Creator<C5283u0> CREATOR = new C5286v0();

    /* renamed from: a */
    final int f10766a;

    /* renamed from: b */
    final IBinder f10767b;

    /* renamed from: c */
    private final C1894b f10768c;

    /* renamed from: d */
    private final boolean f10769d;

    /* renamed from: e */
    private final boolean f10770e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5283u0(int i10, IBinder iBinder, C1894b c1894b, boolean z10, boolean z11) {
        this.f10766a = i10;
        this.f10767b = iBinder;
        this.f10768c = c1894b;
        this.f10769d = z10;
        this.f10770e = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5283u0)) {
            return false;
        }
        C5283u0 c5283u0 = (C5283u0) obj;
        return this.f10768c.equals(c5283u0.f10768c) && C5270q.m13304b(m13350v1(), c5283u0.m13350v1());
    }

    /* renamed from: u1 */
    public final C1894b m13349u1() {
        return this.f10768c;
    }

    /* renamed from: v1 */
    public final InterfaceC5252k m13350v1() {
        IBinder iBinder = this.f10767b;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC5252k.a.m13292f2(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f10766a);
        C7140c.m21228t(parcel, 2, this.f10767b, false);
        C7140c.m21198E(parcel, 3, this.f10768c, i10, false);
        C7140c.m21215g(parcel, 4, this.f10769d);
        C7140c.m21215g(parcel, 5, this.f10770e);
        C7140c.m21210b(parcel, m21209a);
    }
}
