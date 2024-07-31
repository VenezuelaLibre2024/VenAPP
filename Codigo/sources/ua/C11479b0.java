package ua;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.maps.zzam;

/* renamed from: ua.b0 */
/* loaded from: classes2.dex */
public final class C11479b0 {

    /* renamed from: a */
    private final zzam f29805a;

    public C11479b0(zzam zzamVar) {
        this.f29805a = (zzam) C5276s.m13324j(zzamVar);
    }

    /* renamed from: a */
    public void m35909a() {
        try {
            this.f29805a.zzh();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: b */
    public boolean m35910b() {
        try {
            return this.f29805a.zzo();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: c */
    public String m35911c() {
        try {
            return this.f29805a.zzg();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: d */
    public float m35912d() {
        try {
            return this.f29805a.zzd();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: e */
    public float m35913e() {
        try {
            return this.f29805a.zze();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11479b0)) {
            return false;
        }
        try {
            return this.f29805a.zzn(((C11479b0) obj).f29805a);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: f */
    public boolean m35914f() {
        try {
            return this.f29805a.zzp();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: g */
    public void m35915g() {
        try {
            this.f29805a.zzi();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: h */
    public void m35916h(boolean z10) {
        try {
            this.f29805a.zzj(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f29805a.zzf();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: i */
    public void m35917i(float f10) {
        try {
            this.f29805a.zzk(f10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: j */
    public void m35918j(boolean z10) {
        try {
            this.f29805a.zzl(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: k */
    public void m35919k(float f10) {
        try {
            this.f29805a.zzm(f10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }
}
