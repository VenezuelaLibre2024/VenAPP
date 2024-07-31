package qa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class l extends n {
    public static final Parcelable.Creator<l> CREATOR = new w1();

    /* renamed from: a, reason: collision with root package name */
    private final u f23846a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f23847b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f23848c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(u uVar, Uri uri, byte[] bArr) {
        this.f23846a = (u) com.google.android.gms.common.internal.s.j(uVar);
        x1(uri);
        this.f23847b = uri;
        y1(bArr);
        this.f23848c = bArr;
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
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return com.google.android.gms.common.internal.q.b(this.f23846a, lVar.f23846a) && com.google.android.gms.common.internal.q.b(this.f23847b, lVar.f23847b);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f23846a, this.f23847b);
    }

    public byte[] u1() {
        return this.f23848c;
    }

    public Uri v1() {
        return this.f23847b;
    }

    public u w1() {
        return this.f23846a;
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
