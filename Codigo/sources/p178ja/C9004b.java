package p178ja;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.AbstractC5300a;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ja.b */
/* loaded from: classes.dex */
public final class C9004b extends AbstractC7138a {
    public static final Parcelable.Creator<C9004b> CREATOR = new C9005c();

    /* renamed from: a */
    final int f21604a;

    /* renamed from: b */
    private final C9003a f21605b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9004b(int i10, C9003a c9003a) {
        this.f21604a = i10;
        this.f21605b = c9003a;
    }

    private C9004b(C9003a c9003a) {
        this.f21604a = 1;
        this.f21605b = c9003a;
    }

    /* renamed from: u1 */
    public static C9004b m26422u1(AbstractC5300a.b bVar) {
        if (bVar instanceof C9003a) {
            return new C9004b((C9003a) bVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: v1 */
    public final AbstractC5300a.b m26423v1() {
        C9003a c9003a = this.f21605b;
        if (c9003a != null) {
            return c9003a;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f21604a);
        C7140c.m21198E(parcel, 2, this.f21605b, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
