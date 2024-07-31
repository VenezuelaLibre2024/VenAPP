package ua;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzaj;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final zzaj f27562a;

    public s(zzaj zzajVar) {
        this.f27562a = (zzaj) com.google.android.gms.common.internal.s.j(zzajVar);
    }

    public String a() {
        try {
            return this.f27562a.zzl();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void b() {
        try {
            this.f27562a.zzp();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void c(boolean z10) {
        try {
            this.f27562a.zzq(z10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void d(int i10) {
        try {
            this.f27562a.zzr(i10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void e(e eVar) {
        com.google.android.gms.common.internal.s.k(eVar, "endCap must not be null");
        try {
            this.f27562a.zzs(eVar);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        try {
            return this.f27562a.zzD(((s) obj).f27562a);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void f(boolean z10) {
        try {
            this.f27562a.zzt(z10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void g(int i10) {
        try {
            this.f27562a.zzu(i10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void h(List<o> list) {
        try {
            this.f27562a.zzv(list);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f27562a.zzh();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void i(List<LatLng> list) {
        com.google.android.gms.common.internal.s.k(list, "points must not be null");
        try {
            this.f27562a.zzw(list);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void j(e eVar) {
        com.google.android.gms.common.internal.s.k(eVar, "startCap must not be null");
        try {
            this.f27562a.zzy(eVar);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void k(boolean z10) {
        try {
            this.f27562a.zzA(z10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void l(float f10) {
        try {
            this.f27562a.zzB(f10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void m(float f10) {
        try {
            this.f27562a.zzC(f10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }
}
