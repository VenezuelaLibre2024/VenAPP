package p178ja;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ja.d */
/* loaded from: classes.dex */
public final class C9006d extends AbstractC7138a {
    public static final Parcelable.Creator<C9006d> CREATOR = new C9008f();

    /* renamed from: a */
    final int f21606a;

    /* renamed from: b */
    final String f21607b;

    /* renamed from: c */
    final int f21608c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9006d(int i10, String str, int i11) {
        this.f21606a = i10;
        this.f21607b = str;
        this.f21608c = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9006d(String str, int i10) {
        this.f21606a = 1;
        this.f21607b = str;
        this.f21608c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f21606a);
        C7140c.m21200G(parcel, 2, this.f21607b, false);
        C7140c.m21229u(parcel, 3, this.f21608c);
        C7140c.m21210b(parcel, m21209a);
    }
}
