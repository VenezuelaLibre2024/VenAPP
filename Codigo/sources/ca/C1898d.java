package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ca.d */
/* loaded from: classes.dex */
public class C1898d extends AbstractC7138a {
    public static final Parcelable.Creator<C1898d> CREATOR = new C1923r();

    /* renamed from: a */
    private final String f7906a;

    /* renamed from: b */
    @Deprecated
    private final int f7907b;

    /* renamed from: c */
    private final long f7908c;

    public C1898d(String str, int i10, long j10) {
        this.f7906a = str;
        this.f7907b = i10;
        this.f7908c = j10;
    }

    public C1898d(String str, long j10) {
        this.f7906a = str;
        this.f7908c = j10;
        this.f7907b = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1898d) {
            C1898d c1898d = (C1898d) obj;
            if (((m10064u1() != null && m10064u1().equals(c1898d.m10064u1())) || (m10064u1() == null && c1898d.m10064u1() == null)) && m10065v1() == c1898d.m10065v1()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C5270q.m13305c(m10064u1(), Long.valueOf(m10065v1()));
    }

    public final String toString() {
        C5270q.a m13306d = C5270q.m13306d(this);
        m13306d.m13307a("name", m10064u1());
        m13306d.m13307a("version", Long.valueOf(m10065v1()));
        return m13306d.toString();
    }

    /* renamed from: u1 */
    public String m10064u1() {
        return this.f7906a;
    }

    /* renamed from: v1 */
    public long m10065v1() {
        long j10 = this.f7908c;
        return j10 == -1 ? this.f7907b : j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, m10064u1(), false);
        C7140c.m21229u(parcel, 2, this.f7907b);
        C7140c.m21234z(parcel, 3, m10065v1());
        C7140c.m21210b(parcel, m21209a);
    }
}
