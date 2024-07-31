package ra;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ra.c;

@Deprecated
/* loaded from: classes.dex */
public class d extends ea.a {
    public static final Parcelable.Creator<d> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    private final int f24844a;

    /* renamed from: b, reason: collision with root package name */
    private final c f24845b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f24846c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24847d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(int i10, String str, byte[] bArr, String str2) {
        this.f24844a = i10;
        try {
            this.f24845b = c.b(str);
            this.f24846c = bArr;
            this.f24847d = str2;
        } catch (c.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!Arrays.equals(this.f24846c, dVar.f24846c) || this.f24845b != dVar.f24845b) {
            return false;
        }
        String str = this.f24847d;
        String str2 = dVar.f24847d;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((Arrays.hashCode(this.f24846c) + 31) * 31) + this.f24845b.hashCode();
        String str = this.f24847d;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String u1() {
        return this.f24847d;
    }

    public byte[] v1() {
        return this.f24846c;
    }

    public int w1() {
        return this.f24844a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, w1());
        ea.c.G(parcel, 2, this.f24845b.toString(), false);
        ea.c.l(parcel, 3, v1(), false);
        ea.c.G(parcel, 4, u1(), false);
        ea.c.b(parcel, a10);
    }
}
