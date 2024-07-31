package p011a9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.AbstractBinderC4792b1;
import com.google.android.gms.ads.internal.client.InterfaceC4799c1;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbld;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

@Deprecated
/* renamed from: a9.g */
/* loaded from: classes.dex */
public final class C0069g extends AbstractC7138a {
    public static final Parcelable.Creator<C0069g> CREATOR = new C0077o();

    /* renamed from: a */
    private final boolean f318a;

    /* renamed from: b */
    private final InterfaceC4799c1 f319b;

    /* renamed from: c */
    private final IBinder f320c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0069g(boolean z10, IBinder iBinder, IBinder iBinder2) {
        this.f318a = z10;
        this.f319b = iBinder != null ? AbstractBinderC4792b1.zzd(iBinder) : null;
        this.f320c = iBinder2;
    }

    /* renamed from: u1 */
    public final InterfaceC4799c1 m371u1() {
        return this.f319b;
    }

    /* renamed from: v1 */
    public final zzbld m372v1() {
        IBinder iBinder = this.f320c;
        if (iBinder == null) {
            return null;
        }
        return zzblc.zzb(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21215g(parcel, 1, this.f318a);
        InterfaceC4799c1 interfaceC4799c1 = this.f319b;
        C7140c.m21228t(parcel, 2, interfaceC4799c1 == null ? null : interfaceC4799c1.asBinder(), false);
        C7140c.m21228t(parcel, 3, this.f320c, false);
        C7140c.m21210b(parcel, m21209a);
    }

    public final boolean zzc() {
        return this.f318a;
    }
}
