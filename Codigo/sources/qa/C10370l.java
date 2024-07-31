package qa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.C7140c;

/* renamed from: qa.l */
/* loaded from: classes.dex */
public class C10370l extends AbstractC10376n {
    public static final Parcelable.Creator<C10370l> CREATOR = new C10405w1();

    /* renamed from: a */
    private final C10397u f25888a;

    /* renamed from: b */
    private final Uri f25889b;

    /* renamed from: c */
    private final byte[] f25890c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10370l(C10397u c10397u, Uri uri, byte[] bArr) {
        this.f25888a = (C10397u) C5276s.m13324j(c10397u);
        m31150x1(uri);
        this.f25889b = uri;
        m31151y1(bArr);
        this.f25890c = bArr;
    }

    /* renamed from: x1 */
    private static Uri m31150x1(Uri uri) {
        C5276s.m13324j(uri);
        C5276s.m13316b(uri.getScheme() != null, "origin scheme must be non-empty");
        C5276s.m13316b(uri.getAuthority() != null, "origin authority must be non-empty");
        return uri;
    }

    /* renamed from: y1 */
    private static byte[] m31151y1(byte[] bArr) {
        boolean z10 = true;
        if (bArr != null && bArr.length != 32) {
            z10 = false;
        }
        C5276s.m13316b(z10, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10370l)) {
            return false;
        }
        C10370l c10370l = (C10370l) obj;
        return C5270q.m13304b(this.f25888a, c10370l.f25888a) && C5270q.m13304b(this.f25889b, c10370l.f25889b);
    }

    public int hashCode() {
        return C5270q.m13305c(this.f25888a, this.f25889b);
    }

    /* renamed from: u1 */
    public byte[] m31152u1() {
        return this.f25890c;
    }

    /* renamed from: v1 */
    public Uri m31153v1() {
        return this.f25889b;
    }

    /* renamed from: w1 */
    public C10397u m31154w1() {
        return this.f25888a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 2, m31154w1(), i10, false);
        C7140c.m21198E(parcel, 3, m31153v1(), i10, false);
        C7140c.m21220l(parcel, 4, m31152u1(), false);
        C7140c.m21210b(parcel, m21209a);
    }
}
