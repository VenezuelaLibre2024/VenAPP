package ua;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ua.l */
/* loaded from: classes2.dex */
public final class C11498l extends AbstractC7138a {
    public static final Parcelable.Creator<C11498l> CREATOR = new C11513s0();

    /* renamed from: a */
    private final String f29840a;

    public C11498l(String str) {
        C5276s.m13325k(str, "json must not be null");
        this.f29840a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        String str = this.f29840a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, str, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
