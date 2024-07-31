package ra;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import java.util.List;
import ra.c;

@Deprecated
/* loaded from: classes.dex */
public class b extends ea.a {
    public static final Parcelable.Creator<b> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    private final int f24840a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f24841b;

    /* renamed from: c, reason: collision with root package name */
    private final c f24842c;

    /* renamed from: d, reason: collision with root package name */
    private final List f24843d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i10, byte[] bArr, String str, List list) {
        this.f24840a = i10;
        this.f24841b = bArr;
        try {
            this.f24842c = c.b(str);
            this.f24843d = list;
        } catch (c.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Arrays.equals(this.f24841b, bVar.f24841b) || !this.f24842c.equals(bVar.f24842c)) {
            return false;
        }
        List list2 = this.f24843d;
        if (list2 == null && bVar.f24843d == null) {
            return true;
        }
        return list2 != null && (list = bVar.f24843d) != null && list2.containsAll(list) && bVar.f24843d.containsAll(this.f24843d);
    }

    public int hashCode() {
        return q.c(Integer.valueOf(Arrays.hashCode(this.f24841b)), this.f24842c, this.f24843d);
    }

    public String toString() {
        List list = this.f24843d;
        return String.format("{keyHandle: %s, version: %s, transports: %s}", la.c.c(this.f24841b), this.f24842c, list == null ? "null" : list.toString());
    }

    public byte[] u1() {
        return this.f24841b;
    }

    public c v1() {
        return this.f24842c;
    }

    public List<Transport> w1() {
        return this.f24843d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, x1());
        ea.c.l(parcel, 2, u1(), false);
        ea.c.G(parcel, 3, this.f24842c.toString(), false);
        ea.c.K(parcel, 4, w1(), false);
        ea.c.b(parcel, a10);
    }

    public int x1() {
        return this.f24840a;
    }
}
