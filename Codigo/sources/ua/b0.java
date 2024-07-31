package ua;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzam;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final zzam f27489a;

    public b0(zzam zzamVar) {
        this.f27489a = (zzam) com.google.android.gms.common.internal.s.j(zzamVar);
    }

    public void a() {
        try {
            this.f27489a.zzh();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public boolean b() {
        try {
            return this.f27489a.zzo();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public String c() {
        try {
            return this.f27489a.zzg();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public float d() {
        try {
            return this.f27489a.zzd();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public float e() {
        try {
            return this.f27489a.zze();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        try {
            return this.f27489a.zzn(((b0) obj).f27489a);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public boolean f() {
        try {
            return this.f27489a.zzp();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void g() {
        try {
            this.f27489a.zzi();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void h(boolean z10) {
        try {
            this.f27489a.zzj(z10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f27489a.zzf();
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void i(float f10) {
        try {
            this.f27489a.zzk(f10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void j(boolean z10) {
        try {
            this.f27489a.zzl(z10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }

    public void k(float f10) {
        try {
            this.f27489a.zzm(f10);
        } catch (RemoteException e10) {
            throw new v(e10);
        }
    }
}
