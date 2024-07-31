package p308q9;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: q9.d */
/* loaded from: classes.dex */
public final class C10324d extends AbstractC7138a {
    public static final Parcelable.Creator<C10324d> CREATOR = new C10325e();

    /* renamed from: a */
    private final String f25834a;

    /* renamed from: b */
    private final String f25835b;

    public C10324d(String str, String str2) {
        this.f25834a = str;
        this.f25835b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, this.f25834a, false);
        C7140c.m21200G(parcel, 2, this.f25835b, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
