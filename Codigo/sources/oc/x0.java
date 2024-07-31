package oc;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.p002firebaseauthapi.zzafn;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    private volatile int f22478a;

    /* renamed from: b, reason: collision with root package name */
    private final s f22479b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f22480c;

    private x0(Context context, s sVar) {
        this.f22480c = false;
        this.f22478a = 0;
        this.f22479b = sVar;
        com.google.android.gms.common.api.internal.c.c((Application) context.getApplicationContext());
        com.google.android.gms.common.api.internal.c.b().a(new a1(this));
    }

    public x0(zb.g gVar) {
        this(gVar.m(), new s(gVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e() {
        return this.f22478a > 0 && !this.f22480c;
    }

    public final void b() {
        this.f22479b.b();
    }

    public final void c(zzafn zzafnVar) {
        if (zzafnVar == null) {
            return;
        }
        long zza = zzafnVar.zza();
        if (zza <= 0) {
            zza = 3600;
        }
        long zzb = zzafnVar.zzb() + (zza * 1000);
        s sVar = this.f22479b;
        sVar.f22446b = zzb;
        sVar.f22447c = -1L;
        if (e()) {
            this.f22479b.c();
        }
    }
}
