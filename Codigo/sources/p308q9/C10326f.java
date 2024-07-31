package p308q9;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: q9.f */
/* loaded from: classes.dex */
public final class C10326f extends AbstractC7138a {
    public static final Parcelable.Creator<C10326f> CREATOR = new C10327g();

    /* renamed from: a */
    private final String f25836a;

    /* renamed from: b */
    private final int f25837b;

    public C10326f(String str, int i10) {
        this.f25836a = str;
        this.f25837b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, this.f25836a, false);
        C7140c.m21229u(parcel, 2, this.f25837b);
        C7140c.m21210b(parcel, m21209a);
    }

    public final int zza() {
        return this.f25837b;
    }

    public final String zzb() {
        return this.f25836a;
    }
}
