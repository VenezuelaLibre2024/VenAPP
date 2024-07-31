package qa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class b2 extends ea.a {
    public static final Parcelable.Creator<b2> CREATOR = new c2();

    /* renamed from: a */
    private final List f23802a;

    public b2(List list) {
        this.f23802a = (List) com.google.android.gms.common.internal.s.j(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return this.f23802a.containsAll(b2Var.f23802a) && b2Var.f23802a.containsAll(this.f23802a);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(new HashSet(this.f23802a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.K(parcel, 1, this.f23802a, false);
        ea.c.b(parcel, a10);
    }
}
