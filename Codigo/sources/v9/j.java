package v9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class j extends ea.a {
    public static final Parcelable.Creator<j> CREATOR = new b0();

    /* renamed from: a, reason: collision with root package name */
    private final String f28732a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28733b;

    public j(String str, String str2) {
        this.f28732a = com.google.android.gms.common.internal.s.g(((String) com.google.android.gms.common.internal.s.k(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f28733b = com.google.android.gms.common.internal.s.f(str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return com.google.android.gms.common.internal.q.b(this.f28732a, jVar.f28732a) && com.google.android.gms.common.internal.q.b(this.f28733b, jVar.f28733b);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f28732a, this.f28733b);
    }

    public String u1() {
        return this.f28732a;
    }

    public String v1() {
        return this.f28733b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, u1(), false);
        ea.c.G(parcel, 2, v1(), false);
        ea.c.b(parcel, a10);
    }
}
