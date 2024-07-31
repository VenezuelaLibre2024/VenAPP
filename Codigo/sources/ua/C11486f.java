package ua;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.maps.zzl;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: ua.f */
/* loaded from: classes2.dex */
public final class C11486f {

    /* renamed from: a */
    private final zzl f29823a;

    public C11486f(zzl zzlVar) {
        this.f29823a = (zzl) C5276s.m13324j(zzlVar);
    }

    /* renamed from: a */
    public String m35937a() {
        try {
            return this.f29823a.zzl();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: b */
    public void m35938b() {
        try {
            this.f29823a.zzn();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: c */
    public void m35939c(LatLng latLng) {
        try {
            C5276s.m13325k(latLng, "center must not be null.");
            this.f29823a.zzo(latLng);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: d */
    public void m35940d(boolean z10) {
        try {
            this.f29823a.zzp(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: e */
    public void m35941e(int i10) {
        try {
            this.f29823a.zzq(i10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11486f)) {
            return false;
        }
        try {
            return this.f29823a.zzy(((C11486f) obj).f29823a);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: f */
    public void m35942f(double d10) {
        try {
            this.f29823a.zzr(d10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: g */
    public void m35943g(int i10) {
        try {
            this.f29823a.zzs(i10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: h */
    public void m35944h(float f10) {
        try {
            this.f29823a.zzu(f10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    public final int hashCode() {
        try {
            return this.f29823a.zzi();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: i */
    public void m35945i(boolean z10) {
        try {
            this.f29823a.zzw(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: j */
    public void m35946j(float f10) {
        try {
            this.f29823a.zzx(f10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }
}
