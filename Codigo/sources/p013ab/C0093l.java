package p013ab;

import android.os.Parcel;
import android.os.Parcelable;
import ca.C1894b;
import com.google.android.gms.common.internal.C5283u0;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ab.l */
/* loaded from: classes2.dex */
public final class C0093l extends AbstractC7138a {
    public static final Parcelable.Creator<C0093l> CREATOR = new C0094m();

    /* renamed from: a */
    final int f350a;

    /* renamed from: b */
    private final C1894b f351b;

    /* renamed from: c */
    private final C5283u0 f352c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0093l(int i10, C1894b c1894b, C5283u0 c5283u0) {
        this.f350a = i10;
        this.f351b = c1894b;
        this.f352c = c5283u0;
    }

    /* renamed from: u1 */
    public final C1894b m381u1() {
        return this.f351b;
    }

    /* renamed from: v1 */
    public final C5283u0 m382v1() {
        return this.f352c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f350a);
        C7140c.m21198E(parcel, 2, this.f351b, i10, false);
        C7140c.m21198E(parcel, 3, this.f352c, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
