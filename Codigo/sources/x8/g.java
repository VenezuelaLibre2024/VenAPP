package x8;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.n0;
import com.google.android.gms.ads.internal.client.n4;
import com.google.android.gms.ads.internal.client.p4;
import com.google.android.gms.ads.internal.client.q0;
import com.google.android.gms.ads.internal.client.x3;
import com.google.android.gms.ads.internal.client.y4;
import com.google.android.gms.ads.internal.client.z2;
import com.google.android.gms.ads.nativead.b;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzblr;
import com.google.android.gms.internal.ads.zzblu;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbwi;
import com.google.android.gms.internal.ads.zzcdr;
import com.google.android.gms.internal.ads.zzcec;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a */
    private final y4 f30670a;

    /* renamed from: b */
    private final Context f30671b;

    /* renamed from: c */
    private final n0 f30672c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final Context f30673a;

        /* renamed from: b */
        private final q0 f30674b;

        public a(Context context, String str) {
            Context context2 = (Context) com.google.android.gms.common.internal.s.k(context, "context cannot be null");
            q0 c10 = com.google.android.gms.ads.internal.client.x.a().c(context, str, new zzbsr());
            this.f30673a = context2;
            this.f30674b = c10;
        }

        public g a() {
            try {
                return new g(this.f30673a, this.f30674b.zze(), y4.f8814a);
            } catch (RemoteException e10) {
                zzcec.zzh("Failed to build AdLoader.", e10);
                return new g(this.f30673a, new x3().g2(), y4.f8814a);
            }
        }

        public a b(b.c cVar) {
            try {
                this.f30674b.zzk(new zzbwi(cVar));
            } catch (RemoteException e10) {
                zzcec.zzk("Failed to add google native ad listener", e10);
            }
            return this;
        }

        public a c(e eVar) {
            try {
                this.f30674b.zzl(new p4(eVar));
            } catch (RemoteException e10) {
                zzcec.zzk("Failed to set AdListener.", e10);
            }
            return this;
        }

        public a d(com.google.android.gms.ads.nativead.c cVar) {
            try {
                this.f30674b.zzo(new zzbjb(4, cVar.e(), -1, cVar.d(), cVar.a(), cVar.c() != null ? new n4(cVar.c()) : null, cVar.h(), cVar.b(), cVar.f(), cVar.g(), cVar.i() - 1));
            } catch (RemoteException e10) {
                zzcec.zzk("Failed to specify native ad options", e10);
            }
            return this;
        }

        @Deprecated
        public final a e(String str, a9.n nVar, a9.m mVar) {
            zzblr zzblrVar = new zzblr(nVar, mVar);
            try {
                this.f30674b.zzh(str, zzblrVar.zzd(), zzblrVar.zzc());
            } catch (RemoteException e10) {
                zzcec.zzk("Failed to add custom template ad listener", e10);
            }
            return this;
        }

        @Deprecated
        public final a f(a9.p pVar) {
            try {
                this.f30674b.zzk(new zzblu(pVar));
            } catch (RemoteException e10) {
                zzcec.zzk("Failed to add google native ad listener", e10);
            }
            return this;
        }

        @Deprecated
        public final a g(a9.e eVar) {
            try {
                this.f30674b.zzo(new zzbjb(eVar));
            } catch (RemoteException e10) {
                zzcec.zzk("Failed to specify native ad options", e10);
            }
            return this;
        }
    }

    g(Context context, n0 n0Var, y4 y4Var) {
        this.f30671b = context;
        this.f30672c = n0Var;
        this.f30670a = y4Var;
    }

    private final void d(z2 z2Var) {
        zzbgc.zza(this.f30671b);
        if (((Boolean) zzbhy.zzc.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: x8.d0

                    /* renamed from: b */
                    public final /* synthetic */ z2 f30668b;

                    public /* synthetic */ d0(z2 z2Var2) {
                        r2 = z2Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.c(r2);
                    }
                });
                return;
            }
        }
        try {
            this.f30672c.zzg(this.f30670a.a(this.f30671b, z2Var2));
        } catch (RemoteException e10) {
            zzcec.zzh("Failed to load ad.", e10);
        }
    }

    public void a(h hVar) {
        d(hVar.f30676a);
    }

    public void b(y8.a aVar) {
        d(aVar.f30676a);
    }

    public final /* synthetic */ void c(z2 z2Var) {
        try {
            this.f30672c.zzg(this.f30670a.a(this.f30671b, z2Var));
        } catch (RemoteException e10) {
            zzcec.zzh("Failed to load ad.", e10);
        }
    }
}
