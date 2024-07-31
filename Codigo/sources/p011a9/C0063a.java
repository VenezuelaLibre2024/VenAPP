package p011a9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbld;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: a9.a */
/* loaded from: classes.dex */
public final class C0063a extends AbstractC7138a {
    public static final Parcelable.Creator<C0063a> CREATOR = new C0072j();

    /* renamed from: a */
    private final boolean f300a;

    /* renamed from: b */
    private final IBinder f301b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0063a(boolean z10, IBinder iBinder) {
        this.f300a = z10;
        this.f301b = iBinder;
    }

    /* renamed from: u1 */
    public boolean m347u1() {
        return this.f300a;
    }

    /* renamed from: v1 */
    public final zzbld m348v1() {
        IBinder iBinder = this.f301b;
        if (iBinder == null) {
            return null;
        }
        return zzblc.zzb(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21215g(parcel, 1, m347u1());
        C7140c.m21228t(parcel, 2, this.f301b, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
