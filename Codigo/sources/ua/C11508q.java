package ua;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.maps.zzag;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* renamed from: ua.q */
/* loaded from: classes2.dex */
public final class C11508q {

    /* renamed from: a */
    private final zzag f29870a;

    public C11508q(zzag zzagVar) {
        this.f29870a = (zzag) C5276s.m13324j(zzagVar);
    }

    /* renamed from: a */
    public String m36013a() {
        try {
            return this.f29870a.zzk();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: b */
    public void m36014b() {
        try {
            this.f29870a.zzo();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: c */
    public void m36015c(boolean z10) {
        try {
            this.f29870a.zzp(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: d */
    public void m36016d(int i10) {
        try {
            this.f29870a.zzq(i10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: e */
    public void m36017e(boolean z10) {
        try {
            this.f29870a.zzr(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11508q)) {
            return false;
        }
        try {
            return this.f29870a.zzB(((C11508q) obj).f29870a);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: f */
    public void m36018f(List<? extends List<LatLng>> list) {
        try {
            this.f29870a.zzs(list);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: g */
    public void m36019g(List<LatLng> list) {
        try {
            C5276s.m13325k(list, "points must not be null.");
            this.f29870a.zzt(list);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: h */
    public void m36020h(int i10) {
        try {
            this.f29870a.zzu(i10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f29870a.zzi();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: i */
    public void m36021i(float f10) {
        try {
            this.f29870a.zzx(f10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: j */
    public void m36022j(boolean z10) {
        try {
            this.f29870a.zzz(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: k */
    public void m36023k(float f10) {
        try {
            this.f29870a.zzA(f10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }
}
