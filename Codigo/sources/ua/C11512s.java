package ua;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.maps.zzaj;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* renamed from: ua.s */
/* loaded from: classes2.dex */
public final class C11512s {

    /* renamed from: a */
    private final zzaj f29882a;

    public C11512s(zzaj zzajVar) {
        this.f29882a = (zzaj) C5276s.m13324j(zzajVar);
    }

    /* renamed from: a */
    public String m36043a() {
        try {
            return this.f29882a.zzl();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: b */
    public void m36044b() {
        try {
            this.f29882a.zzp();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: c */
    public void m36045c(boolean z10) {
        try {
            this.f29882a.zzq(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: d */
    public void m36046d(int i10) {
        try {
            this.f29882a.zzr(i10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: e */
    public void m36047e(C11484e c11484e) {
        C5276s.m13325k(c11484e, "endCap must not be null");
        try {
            this.f29882a.zzs(c11484e);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11512s)) {
            return false;
        }
        try {
            return this.f29882a.zzD(((C11512s) obj).f29882a);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: f */
    public void m36048f(boolean z10) {
        try {
            this.f29882a.zzt(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: g */
    public void m36049g(int i10) {
        try {
            this.f29882a.zzu(i10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: h */
    public void m36050h(List<C11504o> list) {
        try {
            this.f29882a.zzv(list);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f29882a.zzh();
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: i */
    public void m36051i(List<LatLng> list) {
        C5276s.m13325k(list, "points must not be null");
        try {
            this.f29882a.zzw(list);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: j */
    public void m36052j(C11484e c11484e) {
        C5276s.m13325k(c11484e, "startCap must not be null");
        try {
            this.f29882a.zzy(c11484e);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: k */
    public void m36053k(boolean z10) {
        try {
            this.f29882a.zzA(z10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: l */
    public void m36054l(float f10) {
        try {
            this.f29882a.zzB(f10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }

    /* renamed from: m */
    public void m36055m(float f10) {
        try {
            this.f29882a.zzC(f10);
        } catch (RemoteException e10) {
            throw new C11518v(e10);
        }
    }
}
