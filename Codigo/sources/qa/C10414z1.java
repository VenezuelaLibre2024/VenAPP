package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import java.util.Arrays;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.z1 */
/* loaded from: classes.dex */
public final class C10414z1 extends AbstractC7138a {
    public static final Parcelable.Creator<C10414z1> CREATOR = new C10332a2();

    /* renamed from: a */
    private final long f25941a;

    /* renamed from: b */
    private final byte[] f25942b;

    /* renamed from: c */
    private final byte[] f25943c;

    /* renamed from: d */
    private final byte[] f25944d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10414z1(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f25941a = j10;
        this.f25942b = (byte[]) C5276s.m13324j(bArr);
        this.f25943c = (byte[]) C5276s.m13324j(bArr2);
        this.f25944d = (byte[]) C5276s.m13324j(bArr3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10414z1)) {
            return false;
        }
        C10414z1 c10414z1 = (C10414z1) obj;
        return this.f25941a == c10414z1.f25941a && Arrays.equals(this.f25942b, c10414z1.f25942b) && Arrays.equals(this.f25943c, c10414z1.f25943c) && Arrays.equals(this.f25944d, c10414z1.f25944d);
    }

    public final int hashCode() {
        return C5270q.m13305c(Long.valueOf(this.f25941a), this.f25942b, this.f25943c, this.f25944d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21234z(parcel, 1, this.f25941a);
        C7140c.m21220l(parcel, 2, this.f25942b, false);
        C7140c.m21220l(parcel, 3, this.f25943c, false);
        C7140c.m21220l(parcel, 4, this.f25944d, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
