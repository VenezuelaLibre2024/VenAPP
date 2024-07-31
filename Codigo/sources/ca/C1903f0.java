package ca;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ca.f0 */
/* loaded from: classes.dex */
public final class C1903f0 extends AbstractC7138a {
    public static final Parcelable.Creator<C1903f0> CREATOR = new C1905g0();

    /* renamed from: a */
    private final boolean f7919a;

    /* renamed from: b */
    private final String f7920b;

    /* renamed from: c */
    private final int f7921c;

    /* renamed from: d */
    private final int f7922d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1903f0(boolean z10, String str, int i10, int i11) {
        this.f7919a = z10;
        this.f7920b = str;
        this.f7921c = C1919n0.m10121a(i10) - 1;
        this.f7922d = C1924s.m10123a(i11) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21215g(parcel, 1, this.f7919a);
        C7140c.m21200G(parcel, 2, this.f7920b, false);
        C7140c.m21229u(parcel, 3, this.f7921c);
        C7140c.m21229u(parcel, 4, this.f7922d);
        C7140c.m21210b(parcel, m21209a);
    }

    public final String zza() {
        return this.f7920b;
    }

    public final boolean zzb() {
        return this.f7919a;
    }

    public final int zzc() {
        return C1924s.m10123a(this.f7922d);
    }

    public final int zzd() {
        return C1919n0.m10121a(this.f7921c);
    }
}
