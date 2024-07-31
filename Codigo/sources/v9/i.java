package v9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i extends ea.a {
    public static final Parcelable.Creator<i> CREATOR = new z();

    /* renamed from: a, reason: collision with root package name */
    private final String f28723a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28724b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28725c;

    /* renamed from: d, reason: collision with root package name */
    private final String f28726d;

    /* renamed from: e, reason: collision with root package name */
    private final Uri f28727e;

    /* renamed from: f, reason: collision with root package name */
    private final String f28728f;

    /* renamed from: r, reason: collision with root package name */
    private final String f28729r;

    /* renamed from: s, reason: collision with root package name */
    private final String f28730s;

    /* renamed from: t, reason: collision with root package name */
    private final qa.t f28731t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, qa.t tVar) {
        this.f28723a = com.google.android.gms.common.internal.s.f(str);
        this.f28724b = str2;
        this.f28725c = str3;
        this.f28726d = str4;
        this.f28727e = uri;
        this.f28728f = str5;
        this.f28729r = str6;
        this.f28730s = str7;
        this.f28731t = tVar;
    }

    public qa.t A1() {
        return this.f28731t;
    }

    @Deprecated
    public String E() {
        return this.f28730s;
    }

    public String R() {
        return this.f28724b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return com.google.android.gms.common.internal.q.b(this.f28723a, iVar.f28723a) && com.google.android.gms.common.internal.q.b(this.f28724b, iVar.f28724b) && com.google.android.gms.common.internal.q.b(this.f28725c, iVar.f28725c) && com.google.android.gms.common.internal.q.b(this.f28726d, iVar.f28726d) && com.google.android.gms.common.internal.q.b(this.f28727e, iVar.f28727e) && com.google.android.gms.common.internal.q.b(this.f28728f, iVar.f28728f) && com.google.android.gms.common.internal.q.b(this.f28729r, iVar.f28729r) && com.google.android.gms.common.internal.q.b(this.f28730s, iVar.f28730s) && com.google.android.gms.common.internal.q.b(this.f28731t, iVar.f28731t);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f28723a, this.f28724b, this.f28725c, this.f28726d, this.f28727e, this.f28728f, this.f28729r, this.f28730s, this.f28731t);
    }

    public String u1() {
        return this.f28726d;
    }

    public String v1() {
        return this.f28725c;
    }

    public String w1() {
        return this.f28729r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, x1(), false);
        ea.c.G(parcel, 2, R(), false);
        ea.c.G(parcel, 3, v1(), false);
        ea.c.G(parcel, 4, u1(), false);
        ea.c.E(parcel, 5, z1(), i10, false);
        ea.c.G(parcel, 6, y1(), false);
        ea.c.G(parcel, 7, w1(), false);
        ea.c.G(parcel, 8, E(), false);
        ea.c.E(parcel, 9, A1(), i10, false);
        ea.c.b(parcel, a10);
    }

    public String x1() {
        return this.f28723a;
    }

    public String y1() {
        return this.f28728f;
    }

    public Uri z1() {
        return this.f28727e;
    }
}
