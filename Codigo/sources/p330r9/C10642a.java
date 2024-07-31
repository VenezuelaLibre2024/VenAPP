package p330r9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: r9.a */
/* loaded from: classes.dex */
public class C10642a extends AbstractC7138a {
    public static final Parcelable.Creator<C10642a> CREATOR = new C10648g();

    /* renamed from: a */
    final int f26913a;

    /* renamed from: b */
    final long f26914b;

    /* renamed from: c */
    final String f26915c;

    /* renamed from: d */
    final int f26916d;

    /* renamed from: e */
    final int f26917e;

    /* renamed from: f */
    final String f26918f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10642a(int i10, long j10, String str, int i11, int i12, String str2) {
        this.f26913a = i10;
        this.f26914b = j10;
        this.f26915c = (String) C5276s.m13324j(str);
        this.f26916d = i11;
        this.f26917e = i12;
        this.f26918f = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10642a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C10642a c10642a = (C10642a) obj;
        return this.f26913a == c10642a.f26913a && this.f26914b == c10642a.f26914b && C5270q.m13304b(this.f26915c, c10642a.f26915c) && this.f26916d == c10642a.f26916d && this.f26917e == c10642a.f26917e && C5270q.m13304b(this.f26918f, c10642a.f26918f);
    }

    public int hashCode() {
        return C5270q.m13305c(Integer.valueOf(this.f26913a), Long.valueOf(this.f26914b), this.f26915c, Integer.valueOf(this.f26916d), Integer.valueOf(this.f26917e), this.f26918f);
    }

    public String toString() {
        int i10 = this.f26916d;
        String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        return "AccountChangeEvent {accountName = " + this.f26915c + ", changeType = " + str + ", changeData = " + this.f26918f + ", eventIndex = " + this.f26917e + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f26913a);
        C7140c.m21234z(parcel, 2, this.f26914b);
        C7140c.m21200G(parcel, 3, this.f26915c, false);
        C7140c.m21229u(parcel, 4, this.f26916d);
        C7140c.m21229u(parcel, 5, this.f26917e);
        C7140c.m21200G(parcel, 6, this.f26918f, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
