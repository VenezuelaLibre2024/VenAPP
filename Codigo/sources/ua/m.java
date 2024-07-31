package ua;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    protected final zzad f27525a;

    public m(zzad zzadVar) {
        this.f27525a = (zzad) com.google.android.gms.common.internal.s.j(zzadVar);
    }

    public String a() {
        try {
            return this.f27525a.zzk();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public LatLng b() {
        try {
            return this.f27525a.zzj();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void c() {
        try {
            this.f27525a.zzn();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public boolean d() {
        try {
            return this.f27525a.zzH();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void e() {
        try {
            this.f27525a.zzo();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        try {
            return this.f27525a.zzE(((m) obj).f27525a);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void f(float f10) {
        try {
            this.f27525a.zzp(f10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void g(float f10, float f11) {
        try {
            this.f27525a.zzq(f10, f11);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void h(boolean z10) {
        try {
            this.f27525a.zzr(z10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f27525a.zzg();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void i(boolean z10) {
        try {
            this.f27525a.zzs(z10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void j(b bVar) {
        try {
            if (bVar == null) {
                this.f27525a.zzt(null);
            } else {
                this.f27525a.zzt(bVar.a());
            }
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void k(float f10, float f11) {
        try {
            this.f27525a.zzv(f10, f11);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void l(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.f27525a.zzw(latLng);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void m(float f10) {
        try {
            this.f27525a.zzx(f10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void n(String str) {
        try {
            this.f27525a.zzy(str);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void o(String str) {
        try {
            this.f27525a.zzA(str);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void p(boolean z10) {
        try {
            this.f27525a.zzB(z10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void q(float f10) {
        try {
            this.f27525a.zzC(f10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void r() {
        try {
            this.f27525a.zzD();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }
}
