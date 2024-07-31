package p399v9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: v9.d */
/* loaded from: classes.dex */
public class C11761d extends AbstractC7138a {
    public static final Parcelable.Creator<C11761d> CREATOR = new C11774q();

    /* renamed from: a */
    private final int f31136a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11761d(int i10) {
        this.f31136a = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11761d) {
            return C5270q.m13304b(Integer.valueOf(this.f31136a), Integer.valueOf(((C11761d) obj).f31136a));
        }
        return false;
    }

    public int hashCode() {
        return C5270q.m13305c(Integer.valueOf(this.f31136a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f31136a);
        C7140c.m21210b(parcel, m21209a);
    }
}
