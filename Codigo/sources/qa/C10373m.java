package qa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.C7140c;

/* renamed from: qa.m */
/* loaded from: classes.dex */
public class C10373m extends AbstractC10376n {
    public static final Parcelable.Creator<C10373m> CREATOR = new C10408x1();

    /* renamed from: a */
    private final C10406x f25891a;

    /* renamed from: b */
    private final Uri f25892b;

    /* renamed from: c */
    private final byte[] f25893c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10373m(C10406x c10406x, Uri uri, byte[] bArr) {
        this.f25891a = (C10406x) C5276s.m13324j(c10406x);
        m31155x1(uri);
        this.f25892b = uri;
        m31156y1(bArr);
        this.f25893c = bArr;
    }

    /* renamed from: x1 */
    private static Uri m31155x1(Uri uri) {
        C5276s.m13324j(uri);
        C5276s.m13316b(uri.getScheme() != null, "origin scheme must be non-empty");
        C5276s.m13316b(uri.getAuthority() != null, "origin authority must be non-empty");
        return uri;
    }

    /* renamed from: y1 */
    private static byte[] m31156y1(byte[] bArr) {
        boolean z10 = true;
        if (bArr != null && bArr.length != 32) {
            z10 = false;
        }
        C5276s.m13316b(z10, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10373m)) {
            return false;
        }
        C10373m c10373m = (C10373m) obj;
        return C5270q.m13304b(this.f25891a, c10373m.f25891a) && C5270q.m13304b(this.f25892b, c10373m.f25892b);
    }

    public int hashCode() {
        return C5270q.m13305c(this.f25891a, this.f25892b);
    }

    /* renamed from: u1 */
    public byte[] m31157u1() {
        return this.f25893c;
    }

    /* renamed from: v1 */
    public Uri m31158v1() {
        return this.f25892b;
    }

    /* renamed from: w1 */
    public C10406x m31159w1() {
        return this.f25891a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 2, m31159w1(), i10, false);
        C7140c.m21198E(parcel, 3, m31158v1(), i10, false);
        C7140c.m21220l(parcel, 4, m31157u1(), false);
        C7140c.m21210b(parcel, m21209a);
    }
}
