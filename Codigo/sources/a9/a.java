package a9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbld;

/* loaded from: classes.dex */
public final class a extends ea.a {
    public static final Parcelable.Creator<a> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f249a;

    /* renamed from: b, reason: collision with root package name */
    private final IBinder f250b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(boolean z10, IBinder iBinder) {
        this.f249a = z10;
        this.f250b = iBinder;
    }

    public boolean u1() {
        return this.f249a;
    }

    public final zzbld v1() {
        IBinder iBinder = this.f250b;
        if (iBinder == null) {
            return null;
        }
        return zzblc.zzb(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.g(parcel, 1, u1());
        ea.c.t(parcel, 2, this.f250b, false);
        ea.c.b(parcel, a10);
    }
}
