package a9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.b1;
import com.google.android.gms.ads.internal.client.c1;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbld;

@Deprecated
/* loaded from: classes.dex */
public final class g extends ea.a {
    public static final Parcelable.Creator<g> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f267a;

    /* renamed from: b, reason: collision with root package name */
    private final c1 f268b;

    /* renamed from: c, reason: collision with root package name */
    private final IBinder f269c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(boolean z10, IBinder iBinder, IBinder iBinder2) {
        this.f267a = z10;
        this.f268b = iBinder != null ? b1.zzd(iBinder) : null;
        this.f269c = iBinder2;
    }

    public final c1 u1() {
        return this.f268b;
    }

    public final zzbld v1() {
        IBinder iBinder = this.f269c;
        if (iBinder == null) {
            return null;
        }
        return zzblc.zzb(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.g(parcel, 1, this.f267a);
        c1 c1Var = this.f268b;
        ea.c.t(parcel, 2, c1Var == null ? null : c1Var.asBinder(), false);
        ea.c.t(parcel, 3, this.f269c, false);
        ea.c.b(parcel, a10);
    }

    public final boolean zzc() {
        return this.f267a;
    }
}
