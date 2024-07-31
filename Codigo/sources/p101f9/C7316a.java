package p101f9;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: f9.a */
/* loaded from: classes.dex */
public final class C7316a extends AbstractC7138a {
    public static final Parcelable.Creator<C7316a> CREATOR = new C7317b();

    /* renamed from: a */
    public final String f16479a;

    /* renamed from: b */
    public final String f16480b;

    /* renamed from: c */
    public final String f16481c;

    public C7316a(String str, String str2, String str3) {
        this.f16479a = str;
        this.f16480b = str2;
        this.f16481c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f16479a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, str, false);
        C7140c.m21200G(parcel, 2, this.f16480b, false);
        C7140c.m21200G(parcel, 3, this.f16481c, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
