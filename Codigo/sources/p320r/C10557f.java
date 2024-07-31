package p320r;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* renamed from: r.f */
/* loaded from: classes.dex */
public final class C10557f {

    /* renamed from: a */
    private final a f26572a;

    /* renamed from: r.f$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        void mo32061a(long j10);

        /* renamed from: b */
        void mo32062b(Surface surface);

        /* renamed from: c */
        void mo32063c(long j10);

        /* renamed from: d */
        void mo32064d(String str);

        /* renamed from: e */
        String mo32065e();

        /* renamed from: f */
        void mo32066f();

        /* renamed from: g */
        Object mo32067g();

        Surface getSurface();
    }

    public C10557f(int i10, Surface surface) {
        int i11 = Build.VERSION.SDK_INT;
        this.f26572a = i11 >= 33 ? new C10564m(i10, surface) : i11 >= 28 ? new C10563l(i10, surface) : i11 >= 26 ? new C10561j(i10, surface) : new C10558g(i10, surface);
    }

    private C10557f(a aVar) {
        this.f26572a = aVar;
    }

    /* renamed from: i */
    public static C10557f m32052i(Object obj) {
        a m32072j;
        if (obj == null) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            m32072j = C10564m.m32075l((OutputConfiguration) obj);
        } else if (i10 >= 28) {
            m32072j = C10563l.m32074k((OutputConfiguration) obj);
        } else {
            OutputConfiguration outputConfiguration = (OutputConfiguration) obj;
            m32072j = i10 >= 26 ? C10561j.m32072j(outputConfiguration) : C10558g.m32068i(outputConfiguration);
        }
        if (m32072j == null) {
            return null;
        }
        return new C10557f(m32072j);
    }

    /* renamed from: a */
    public void m32053a(Surface surface) {
        this.f26572a.mo32062b(surface);
    }

    /* renamed from: b */
    public void m32054b() {
        this.f26572a.mo32066f();
    }

    /* renamed from: c */
    public String m32055c() {
        return this.f26572a.mo32065e();
    }

    /* renamed from: d */
    public Surface m32056d() {
        return this.f26572a.getSurface();
    }

    /* renamed from: e */
    public void m32057e(long j10) {
        this.f26572a.mo32063c(j10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10557f) {
            return this.f26572a.equals(((C10557f) obj).f26572a);
        }
        return false;
    }

    /* renamed from: f */
    public void m32058f(String str) {
        this.f26572a.mo32064d(str);
    }

    /* renamed from: g */
    public void m32059g(long j10) {
        this.f26572a.mo32061a(j10);
    }

    /* renamed from: h */
    public Object m32060h() {
        return this.f26572a.mo32067g();
    }

    public int hashCode() {
        return this.f26572a.hashCode();
    }
}
