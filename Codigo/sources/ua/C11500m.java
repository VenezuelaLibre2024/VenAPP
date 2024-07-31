package ua;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: ua.m */
/* loaded from: classes2.dex */
public class C11500m {

    /* renamed from: a */
    protected final zzad f29841a;

    public C11500m(zzad zzadVar) {
        this.f29841a = (zzad) C5276s.m13324j(zzadVar);
    }

    /* renamed from: a */
    public String m35964a() {
        try {
            return this.f29841a.zzk();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: b */
    public LatLng m35965b() {
        try {
            return this.f29841a.zzj();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: c */
    public void m35966c() {
        try {
            this.f29841a.zzn();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: d */
    public boolean m35967d() {
        try {
            return this.f29841a.zzH();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: e */
    public void m35968e() {
        try {
            this.f29841a.zzo();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11500m)) {
            return false;
        }
        try {
            return this.f29841a.zzE(((C11500m) obj).f29841a);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: f */
    public void m35969f(float f10) {
        try {
            this.f29841a.zzp(f10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: g */
    public void m35970g(float f10, float f11) {
        try {
            this.f29841a.zzq(f10, f11);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: h */
    public void m35971h(boolean z10) {
        try {
            this.f29841a.zzr(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f29841a.zzg();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: i */
    public void m35972i(boolean z10) {
        try {
            this.f29841a.zzs(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: j */
    public void m35973j(C11478b c11478b) {
        try {
            if (c11478b == null) {
                this.f29841a.zzt(null);
            } else {
                this.f29841a.zzt(c11478b.m35908a());
            }
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: k */
    public void m35974k(float f10, float f11) {
        try {
            this.f29841a.zzv(f10, f11);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: l */
    public void m35975l(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.f29841a.zzw(latLng);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: m */
    public void m35976m(float f10) {
        try {
            this.f29841a.zzx(f10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: n */
    public void m35977n(String str) {
        try {
            this.f29841a.zzy(str);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: o */
    public void m35978o(String str) {
        try {
            this.f29841a.zzA(str);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: p */
    public void m35979p(boolean z10) {
        try {
            this.f29841a.zzB(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: q */
    public void m35980q(float f10) {
        try {
            this.f29841a.zzC(f10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: r */
    public void m35981r() {
        try {
            this.f29841a.zzD();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }
}
