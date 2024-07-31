package qa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class t extends ea.a {
    public static final Parcelable.Creator<t> CREATOR = new u0();

    /* renamed from: a */
    private final String f23862a;

    /* renamed from: b */
    private final String f23863b;

    /* renamed from: c */
    private final byte[] f23864c;

    /* renamed from: d */
    private final h f23865d;

    /* renamed from: e */
    private final g f23866e;

    /* renamed from: f */
    private final i f23867f;

    /* renamed from: r */
    private final e f23868r;

    /* renamed from: s */
    private final String f23869s;

    public t(String str, String str2, byte[] bArr, h hVar, g gVar, i iVar, e eVar, String str3) {
        boolean z10 = true;
        if ((hVar == null || gVar != null || iVar != null) && ((hVar != null || gVar == null || iVar != null) && (hVar != null || gVar != null || iVar == null))) {
            z10 = false;
        }
        com.google.android.gms.common.internal.s.a(z10);
        this.f23862a = str;
        this.f23863b = str2;
        this.f23864c = bArr;
        this.f23865d = hVar;
        this.f23866e = gVar;
        this.f23867f = iVar;
        this.f23868r = eVar;
        this.f23869s = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return com.google.android.gms.common.internal.q.b(this.f23862a, tVar.f23862a) && com.google.android.gms.common.internal.q.b(this.f23863b, tVar.f23863b) && Arrays.equals(this.f23864c, tVar.f23864c) && com.google.android.gms.common.internal.q.b(this.f23865d, tVar.f23865d) && com.google.android.gms.common.internal.q.b(this.f23866e, tVar.f23866e) && com.google.android.gms.common.internal.q.b(this.f23867f, tVar.f23867f) && com.google.android.gms.common.internal.q.b(this.f23868r, tVar.f23868r) && com.google.android.gms.common.internal.q.b(this.f23869s, tVar.f23869s);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f23862a, this.f23863b, this.f23864c, this.f23866e, this.f23865d, this.f23867f, this.f23868r, this.f23869s);
    }

    public String u1() {
        return this.f23869s;
    }

    public e v1() {
        return this.f23868r;
    }

    public String w1() {
        return this.f23862a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, w1(), false);
        ea.c.G(parcel, 2, y1(), false);
        ea.c.l(parcel, 3, x1(), false);
        ea.c.E(parcel, 4, this.f23865d, i10, false);
        ea.c.E(parcel, 5, this.f23866e, i10, false);
        ea.c.E(parcel, 6, this.f23867f, i10, false);
        ea.c.E(parcel, 7, v1(), i10, false);
        ea.c.G(parcel, 8, u1(), false);
        ea.c.b(parcel, a10);
    }

    public byte[] x1() {
        return this.f23864c;
    }

    public String y1() {
        return this.f23863b;
    }
}
