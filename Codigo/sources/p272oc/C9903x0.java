package p272oc;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C5119c;
import com.google.android.gms.internal.p498firebaseauthapi.zzafn;
import p485zb.C12867g;

/* renamed from: oc.x0 */
/* loaded from: classes.dex */
public final class C9903x0 {

    /* renamed from: a */
    private volatile int f24411a;

    /* renamed from: b */
    private final C9887s f24412b;

    /* renamed from: c */
    private volatile boolean f24413c;

    private C9903x0(Context context, C9887s c9887s) {
        this.f24413c = false;
        this.f24411a = 0;
        this.f24412b = c9887s;
        ComponentCallbacks2C5119c.m13011c((Application) context.getApplicationContext());
        ComponentCallbacks2C5119c.m13010b().m13013a(new C9833a1(this));
    }

    public C9903x0(C12867g c12867g) {
        this(c12867g.m42630m(), new C9887s(c12867g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m29612e() {
        return this.f24411a > 0 && !this.f24413c;
    }

    /* renamed from: b */
    public final void m29614b() {
        this.f24412b.m29590b();
    }

    /* renamed from: c */
    public final void m29615c(zzafn zzafnVar) {
        if (zzafnVar == null) {
            return;
        }
        long zza = zzafnVar.zza();
        if (zza <= 0) {
            zza = 3600;
        }
        long zzb = zzafnVar.zzb() + (zza * 1000);
        C9887s c9887s = this.f24412b;
        c9887s.f24379b = zzb;
        c9887s.f24380c = -1L;
        if (m29612e()) {
            this.f24412b.m29591c();
        }
    }
}
