package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.fido.zzau;
import com.google.android.gms.internal.fido.zzh;
import java.util.Arrays;
import java.util.List;
import p081ea.AbstractC7138a;
import p081ea.C7140c;
import qa.EnumC10412z;

/* renamed from: qa.v */
/* loaded from: classes.dex */
public class C10400v extends AbstractC7138a {

    /* renamed from: a */
    private final EnumC10412z f25924a;

    /* renamed from: b */
    private final byte[] f25925b;

    /* renamed from: c */
    private final List f25926c;

    /* renamed from: d */
    private static final zzau f25923d = zzau.zzi(zzh.zza, zzh.zzb);
    public static final Parcelable.Creator<C10400v> CREATOR = new C10401v0();

    public C10400v(String str, byte[] bArr, List<Transport> list) {
        C5276s.m13324j(str);
        try {
            this.f25924a = EnumC10412z.m31197b(str);
            this.f25925b = (byte[]) C5276s.m13324j(bArr);
            this.f25926c = list;
        } catch (EnumC10412z.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof C10400v)) {
            return false;
        }
        C10400v c10400v = (C10400v) obj;
        if (!this.f25924a.equals(c10400v.f25924a) || !Arrays.equals(this.f25925b, c10400v.f25925b)) {
            return false;
        }
        List list2 = this.f25926c;
        if (list2 == null && c10400v.f25926c == null) {
            return true;
        }
        return list2 != null && (list = c10400v.f25926c) != null && list2.containsAll(list) && c10400v.f25926c.containsAll(this.f25926c);
    }

    public int hashCode() {
        return C5270q.m13305c(this.f25924a, Integer.valueOf(Arrays.hashCode(this.f25925b)), this.f25926c);
    }

    /* renamed from: u1 */
    public byte[] m31182u1() {
        return this.f25925b;
    }

    /* renamed from: v1 */
    public List<Transport> m31183v1() {
        return this.f25926c;
    }

    /* renamed from: w1 */
    public String m31184w1() {
        return this.f25924a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, m31184w1(), false);
        C7140c.m21220l(parcel, 3, m31182u1(), false);
        C7140c.m21204K(parcel, 4, m31183v1(), false);
        C7140c.m21210b(parcel, m21209a);
    }
}
