package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.fido.zzau;
import com.google.android.gms.internal.fido.zzh;
import java.util.Arrays;
import java.util.List;
import qa.z;

/* loaded from: classes.dex */
public class v extends ea.a {

    /* renamed from: a, reason: collision with root package name */
    private final z f23882a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f23883b;

    /* renamed from: c, reason: collision with root package name */
    private final List f23884c;

    /* renamed from: d, reason: collision with root package name */
    private static final zzau f23881d = zzau.zzi(zzh.zza, zzh.zzb);
    public static final Parcelable.Creator<v> CREATOR = new v0();

    public v(String str, byte[] bArr, List<Transport> list) {
        com.google.android.gms.common.internal.s.j(str);
        try {
            this.f23882a = z.b(str);
            this.f23883b = (byte[]) com.google.android.gms.common.internal.s.j(bArr);
            this.f23884c = list;
        } catch (z.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.f23882a.equals(vVar.f23882a) || !Arrays.equals(this.f23883b, vVar.f23883b)) {
            return false;
        }
        List list2 = this.f23884c;
        if (list2 == null && vVar.f23884c == null) {
            return true;
        }
        return list2 != null && (list = vVar.f23884c) != null && list2.containsAll(list) && vVar.f23884c.containsAll(this.f23884c);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f23882a, Integer.valueOf(Arrays.hashCode(this.f23883b)), this.f23884c);
    }

    public byte[] u1() {
        return this.f23883b;
    }

    public List<Transport> v1() {
        return this.f23884c;
    }

    public String w1() {
        return this.f23882a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, w1(), false);
        ea.c.l(parcel, 3, u1(), false);
        ea.c.K(parcel, 4, v1(), false);
        ea.c.b(parcel, a10);
    }
}
