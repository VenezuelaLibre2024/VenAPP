package qa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class m extends n {
    public static final Parcelable.Creator<m> CREATOR = new x1();

    /* renamed from: a, reason: collision with root package name */
    private final x f23849a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f23850b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f23851c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(x xVar, Uri uri, byte[] bArr) {
        this.f23849a = (x) com.google.android.gms.common.internal.s.j(xVar);
        x1(uri);
        this.f23850b = uri;
        y1(bArr);
        this.f23851c = bArr;
    }

    private static Uri x1(Uri uri) {
        com.google.android.gms.common.internal.s.j(uri);
        com.google.android.gms.common.internal.s.b(uri.getScheme() != null, "origin scheme must be non-empty");
        com.google.android.gms.common.internal.s.b(uri.getAuthority() != null, "origin authority must be non-empty");
        return uri;
    }

    private static byte[] y1(byte[] bArr) {
        boolean z10 = true;
        if (bArr != null && bArr.length != 32) {
            z10 = false;
        }
        com.google.android.gms.common.internal.s.b(z10, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return com.google.android.gms.common.internal.q.b(this.f23849a, mVar.f23849a) && com.google.android.gms.common.internal.q.b(this.f23850b, mVar.f23850b);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f23849a, this.f23850b);
    }

    public byte[] u1() {
        return this.f23851c;
    }

    public Uri v1() {
        return this.f23850b;
    }

    public x w1() {
        return this.f23849a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 2, w1(), i10, false);
        ea.c.E(parcel, 3, v1(), i10, false);
        ea.c.l(parcel, 4, u1(), false);
        ea.c.b(parcel, a10);
    }
}
