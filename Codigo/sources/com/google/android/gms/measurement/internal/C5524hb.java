package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.measurement.internal.hb */
/* loaded from: classes2.dex */
public final class C5524hb extends AbstractC7138a {
    public static final Parcelable.Creator<C5524hb> CREATOR = new C5511gb();

    /* renamed from: a */
    private final int f11408a;

    /* renamed from: b */
    public final String f11409b;

    /* renamed from: c */
    public final long f11410c;

    /* renamed from: d */
    public final Long f11411d;

    /* renamed from: e */
    private final Float f11412e;

    /* renamed from: f */
    public final String f11413f;

    /* renamed from: r */
    public final String f11414r;

    /* renamed from: s */
    public final Double f11415s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5524hb(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f11408a = i10;
        this.f11409b = str;
        this.f11410c = j10;
        this.f11411d = l10;
        this.f11412e = null;
        if (i10 == 1) {
            this.f11415s = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f11415s = d10;
        }
        this.f11413f = str2;
        this.f11414r = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5524hb(C5550jb c5550jb) {
        this(c5550jb.f11492c, c5550jb.f11493d, c5550jb.f11494e, c5550jb.f11491b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5524hb(String str, long j10, Object obj, String str2) {
        C5276s.m13320f(str);
        this.f11408a = 2;
        this.f11409b = str;
        this.f11410c = j10;
        this.f11414r = str2;
        if (obj == null) {
            this.f11411d = null;
            this.f11412e = null;
            this.f11415s = null;
            this.f11413f = null;
            return;
        }
        if (obj instanceof Long) {
            this.f11411d = (Long) obj;
            this.f11412e = null;
            this.f11415s = null;
            this.f11413f = null;
            return;
        }
        if (obj instanceof String) {
            this.f11411d = null;
            this.f11412e = null;
            this.f11415s = null;
            this.f11413f = (String) obj;
            return;
        }
        if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
        this.f11411d = null;
        this.f11412e = null;
        this.f11415s = (Double) obj;
        this.f11413f = null;
    }

    /* renamed from: u1 */
    public final Object m13921u1() {
        Long l10 = this.f11411d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f11415s;
        if (d10 != null) {
            return d10;
        }
        String str = this.f11413f;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f11408a);
        C7140c.m21200G(parcel, 2, this.f11409b, false);
        C7140c.m21234z(parcel, 3, this.f11410c);
        C7140c.m21195B(parcel, 4, this.f11411d, false);
        C7140c.m21227s(parcel, 5, null, false);
        C7140c.m21200G(parcel, 6, this.f11413f, false);
        C7140c.m21200G(parcel, 7, this.f11414r, false);
        C7140c.m21224p(parcel, 8, this.f11415s, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
