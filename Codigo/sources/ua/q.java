package ua;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzag;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final zzag f27550a;

    public q(zzag zzagVar) {
        this.f27550a = (zzag) com.google.android.gms.common.internal.s.j(zzagVar);
    }

    public String a() {
        try {
            return this.f27550a.zzk();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void b() {
        try {
            this.f27550a.zzo();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void c(boolean z10) {
        try {
            this.f27550a.zzp(z10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void d(int i10) {
        try {
            this.f27550a.zzq(i10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void e(boolean z10) {
        try {
            this.f27550a.zzr(z10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        try {
            return this.f27550a.zzB(((q) obj).f27550a);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void f(List<? extends List<LatLng>> list) {
        try {
            this.f27550a.zzs(list);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void g(List<LatLng> list) {
        try {
            com.google.android.gms.common.internal.s.k(list, "points must not be null.");
            this.f27550a.zzt(list);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void h(int i10) {
        try {
            this.f27550a.zzu(i10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f27550a.zzi();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void i(float f10) {
        try {
            this.f27550a.zzx(f10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void j(boolean z10) {
        try {
            this.f27550a.zzz(z10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void k(float f10) {
        try {
            this.f27550a.zzA(f10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }
}
