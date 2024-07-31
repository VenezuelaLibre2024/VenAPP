package r9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;

/* loaded from: classes.dex */
public class a extends ea.a {
    public static final Parcelable.Creator<a> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    final int f24799a;

    /* renamed from: b, reason: collision with root package name */
    final long f24800b;

    /* renamed from: c, reason: collision with root package name */
    final String f24801c;

    /* renamed from: d, reason: collision with root package name */
    final int f24802d;

    /* renamed from: e, reason: collision with root package name */
    final int f24803e;

    /* renamed from: f, reason: collision with root package name */
    final String f24804f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i10, long j10, String str, int i11, int i12, String str2) {
        this.f24799a = i10;
        this.f24800b = j10;
        this.f24801c = (String) s.j(str);
        this.f24802d = i11;
        this.f24803e = i12;
        this.f24804f = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a aVar = (a) obj;
        return this.f24799a == aVar.f24799a && this.f24800b == aVar.f24800b && q.b(this.f24801c, aVar.f24801c) && this.f24802d == aVar.f24802d && this.f24803e == aVar.f24803e && q.b(this.f24804f, aVar.f24804f);
    }

    public int hashCode() {
        return q.c(Integer.valueOf(this.f24799a), Long.valueOf(this.f24800b), this.f24801c, Integer.valueOf(this.f24802d), Integer.valueOf(this.f24803e), this.f24804f);
    }

    public String toString() {
        int i10 = this.f24802d;
        String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        return "AccountChangeEvent {accountName = " + this.f24801c + ", changeType = " + str + ", changeData = " + this.f24804f + ", eventIndex = " + this.f24803e + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f24799a);
        ea.c.z(parcel, 2, this.f24800b);
        ea.c.G(parcel, 3, this.f24801c, false);
        ea.c.u(parcel, 4, this.f24802d);
        ea.c.u(parcel, 5, this.f24803e);
        ea.c.G(parcel, 6, this.f24804f, false);
        ea.c.b(parcel, a10);
    }
}
