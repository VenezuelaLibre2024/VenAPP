package ua;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzl;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final zzl f27507a;

    public f(zzl zzlVar) {
        this.f27507a = (zzl) com.google.android.gms.common.internal.s.j(zzlVar);
    }

    public String a() {
        try {
            return this.f27507a.zzl();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void b() {
        try {
            this.f27507a.zzn();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void c(LatLng latLng) {
        try {
            com.google.android.gms.common.internal.s.k(latLng, "center must not be null.");
            this.f27507a.zzo(latLng);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void d(boolean z10) {
        try {
            this.f27507a.zzp(z10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void e(int i10) {
        try {
            this.f27507a.zzq(i10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            return this.f27507a.zzy(((f) obj).f27507a);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void f(double d10) {
        try {
            this.f27507a.zzr(d10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void g(int i10) {
        try {
            this.f27507a.zzs(i10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void h(float f10) {
        try {
            this.f27507a.zzu(f10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public final int hashCode() {
        try {
            return this.f27507a.zzi();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void i(boolean z10) {
        try {
            this.f27507a.zzw(z10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void j(float f10) {
        try {
            this.f27507a.zzx(f10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }
}
