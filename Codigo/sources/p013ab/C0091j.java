package p013ab;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5277s0;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ab.j */
/* loaded from: classes2.dex */
public final class C0091j extends AbstractC7138a {
    public static final Parcelable.Creator<C0091j> CREATOR = new C0092k();

    /* renamed from: a */
    final int f348a;

    /* renamed from: b */
    final C5277s0 f349b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0091j(int i10, C5277s0 c5277s0) {
        this.f348a = i10;
        this.f349b = c5277s0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f348a);
        C7140c.m21198E(parcel, 2, this.f349b, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
