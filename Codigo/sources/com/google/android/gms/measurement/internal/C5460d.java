package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.measurement.internal.d */
/* loaded from: classes2.dex */
public final class C5460d extends AbstractC7138a {
    public static final Parcelable.Creator<C5460d> CREATOR = new C5499g();

    /* renamed from: a */
    public String f11163a;

    /* renamed from: b */
    public String f11164b;

    /* renamed from: c */
    public C5524hb f11165c;

    /* renamed from: d */
    public long f11166d;

    /* renamed from: e */
    public boolean f11167e;

    /* renamed from: f */
    public String f11168f;

    /* renamed from: r */
    public C5461d0 f11169r;

    /* renamed from: s */
    public long f11170s;

    /* renamed from: t */
    public C5461d0 f11171t;

    /* renamed from: u */
    public long f11172u;

    /* renamed from: v */
    public C5461d0 f11173v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5460d(C5460d c5460d) {
        C5276s.m13324j(c5460d);
        this.f11163a = c5460d.f11163a;
        this.f11164b = c5460d.f11164b;
        this.f11165c = c5460d.f11165c;
        this.f11166d = c5460d.f11166d;
        this.f11167e = c5460d.f11167e;
        this.f11168f = c5460d.f11168f;
        this.f11169r = c5460d.f11169r;
        this.f11170s = c5460d.f11170s;
        this.f11171t = c5460d.f11171t;
        this.f11172u = c5460d.f11172u;
        this.f11173v = c5460d.f11173v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5460d(String str, String str2, C5524hb c5524hb, long j10, boolean z10, String str3, C5461d0 c5461d0, long j11, C5461d0 c5461d02, long j12, C5461d0 c5461d03) {
        this.f11163a = str;
        this.f11164b = str2;
        this.f11165c = c5524hb;
        this.f11166d = j10;
        this.f11167e = z10;
        this.f11168f = str3;
        this.f11169r = c5461d0;
        this.f11170s = j11;
        this.f11171t = c5461d02;
        this.f11172u = j12;
        this.f11173v = c5461d03;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, this.f11163a, false);
        C7140c.m21200G(parcel, 3, this.f11164b, false);
        C7140c.m21198E(parcel, 4, this.f11165c, i10, false);
        C7140c.m21234z(parcel, 5, this.f11166d);
        C7140c.m21215g(parcel, 6, this.f11167e);
        C7140c.m21200G(parcel, 7, this.f11168f, false);
        C7140c.m21198E(parcel, 8, this.f11169r, i10, false);
        C7140c.m21234z(parcel, 9, this.f11170s);
        C7140c.m21198E(parcel, 10, this.f11171t, i10, false);
        C7140c.m21234z(parcel, 11, this.f11172u);
        C7140c.m21198E(parcel, 12, this.f11173v, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
