package ua;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.maps.zzao;
import com.google.android.gms.internal.maps.zzap;

/* loaded from: classes2.dex */
public final class c0 extends ea.a {
    public static final Parcelable.Creator<c0> CREATOR = new l0();

    /* renamed from: a, reason: collision with root package name */
    private zzap f27491a;

    /* renamed from: b, reason: collision with root package name */
    private d0 f27492b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27493c;

    /* renamed from: d, reason: collision with root package name */
    private float f27494d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27495e;

    /* renamed from: f, reason: collision with root package name */
    private float f27496f;

    public c0() {
        this.f27493c = true;
        this.f27495e = true;
        this.f27496f = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(IBinder iBinder, boolean z10, float f10, boolean z11, float f11) {
        this.f27493c = true;
        this.f27495e = true;
        this.f27496f = 0.0f;
        zzap zzc = zzao.zzc(iBinder);
        this.f27491a = zzc;
        this.f27492b = zzc == null ? null : new j0(this);
        this.f27493c = z10;
        this.f27494d = f10;
        this.f27495e = z11;
        this.f27496f = f11;
    }

    public c0 A1(float f10) {
        boolean z10 = false;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        com.google.android.gms.common.internal.s.b(z10, "Transparency must be in the range [0..1]");
        this.f27496f = f10;
        return this;
    }

    public c0 B1(boolean z10) {
        this.f27493c = z10;
        return this;
    }

    public c0 C1(float f10) {
        this.f27494d = f10;
        return this;
    }

    public c0 u1(boolean z10) {
        this.f27495e = z10;
        return this;
    }

    public boolean v1() {
        return this.f27495e;
    }

    public float w1() {
        return this.f27496f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        zzap zzapVar = this.f27491a;
        ea.c.t(parcel, 2, zzapVar == null ? null : zzapVar.asBinder(), false);
        ea.c.g(parcel, 3, y1());
        ea.c.q(parcel, 4, x1());
        ea.c.g(parcel, 5, v1());
        ea.c.q(parcel, 6, w1());
        ea.c.b(parcel, a10);
    }

    public float x1() {
        return this.f27494d;
    }

    public boolean y1() {
        return this.f27493c;
    }

    public c0 z1(d0 d0Var) {
        this.f27492b = (d0) com.google.android.gms.common.internal.s.k(d0Var, "tileProvider must not be null.");
        this.f27491a = new k0(this, d0Var);
        return this;
    }
}
