package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;
import p438x8.C12356c0;

/* renamed from: com.google.android.gms.ads.internal.client.n4 */
/* loaded from: classes.dex */
public final class C4875n4 extends AbstractC7138a {
    public static final Parcelable.Creator<C4875n4> CREATOR = new C4881o4();

    /* renamed from: a */
    public final boolean f9789a;

    /* renamed from: b */
    public final boolean f9790b;

    /* renamed from: c */
    public final boolean f9791c;

    public C4875n4(C12356c0 c12356c0) {
        this(c12356c0.m39963c(), c12356c0.m39962b(), c12356c0.m39961a());
    }

    public C4875n4(boolean z10, boolean z11, boolean z12) {
        this.f9789a = z10;
        this.f9790b = z11;
        this.f9791c = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f9789a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21215g(parcel, 2, z10);
        C7140c.m21215g(parcel, 3, this.f9790b);
        C7140c.m21215g(parcel, 4, this.f9791c);
        C7140c.m21210b(parcel, m21209a);
    }
}
