package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.ads.internal.client.d5 */
/* loaded from: classes.dex */
public final class C4810d5 extends AbstractC7138a {
    public static final Parcelable.Creator<C4810d5> CREATOR = new C4817e5();

    /* renamed from: a */
    public final String f9726a;

    /* renamed from: b */
    public long f9727b;

    /* renamed from: c */
    public C4801c3 f9728c;

    /* renamed from: d */
    public final Bundle f9729d;

    /* renamed from: e */
    public final String f9730e;

    /* renamed from: f */
    public final String f9731f;

    /* renamed from: r */
    public final String f9732r;

    /* renamed from: s */
    public final String f9733s;

    public C4810d5(String str, long j10, C4801c3 c4801c3, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f9726a = str;
        this.f9727b = j10;
        this.f9728c = c4801c3;
        this.f9729d = bundle;
        this.f9730e = str2;
        this.f9731f = str3;
        this.f9732r = str4;
        this.f9733s = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f9726a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, str, false);
        C7140c.m21234z(parcel, 2, this.f9727b);
        C7140c.m21198E(parcel, 3, this.f9728c, i10, false);
        C7140c.m21218j(parcel, 4, this.f9729d, false);
        C7140c.m21200G(parcel, 5, this.f9730e, false);
        C7140c.m21200G(parcel, 6, this.f9731f, false);
        C7140c.m21200G(parcel, 7, this.f9732r, false);
        C7140c.m21200G(parcel, 8, this.f9733s, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
