package p438x8;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.BinderC4887p4;
import com.google.android.gms.ads.internal.client.BinderC4934x3;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.client.C4875n4;
import com.google.android.gms.ads.internal.client.C4930x;
import com.google.android.gms.ads.internal.client.C4941y4;
import com.google.android.gms.ads.internal.client.C4945z2;
import com.google.android.gms.ads.internal.client.InterfaceC4871n0;
import com.google.android.gms.ads.internal.client.InterfaceC4889q0;
import com.google.android.gms.ads.nativead.AbstractC5067b;
import com.google.android.gms.ads.nativead.C5068c;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzblr;
import com.google.android.gms.internal.ads.zzblu;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbwi;
import com.google.android.gms.internal.ads.zzcdr;
import com.google.android.gms.internal.ads.zzcec;
import p011a9.C0067e;
import p011a9.InterfaceC0075m;
import p011a9.InterfaceC0076n;
import p011a9.InterfaceC0078p;
import p461y8.C12645a;

/* renamed from: x8.g */
/* loaded from: classes.dex */
public class C12363g {

    /* renamed from: a */
    private final C4941y4 f33190a;

    /* renamed from: b */
    private final Context f33191b;

    /* renamed from: c */
    private final InterfaceC4871n0 f33192c;

    /* renamed from: x8.g$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final Context f33193a;

        /* renamed from: b */
        private final InterfaceC4889q0 f33194b;

        public a(Context context, String str) {
            Context context2 = (Context) C5276s.m13325k(context, "context cannot be null");
            InterfaceC4889q0 m12450c = C4930x.m12473a().m12450c(context, str, new zzbsr());
            this.f33193a = context2;
            this.f33194b = m12450c;
        }

        /* renamed from: a */
        public C12363g m39983a() {
            try {
                return new C12363g(this.f33193a, this.f33194b.zze(), C4941y4.f9901a);
            } catch (RemoteException e10) {
                zzcec.zzh("Failed to build AdLoader.", e10);
                return new C12363g(this.f33193a, new BinderC4934x3().m12480g2(), C4941y4.f9901a);
            }
        }

        /* renamed from: b */
        public a m39984b(AbstractC5067b.c cVar) {
            try {
                this.f33194b.zzk(new zzbwi(cVar));
            } catch (RemoteException e10) {
                zzcec.zzk("Failed to add google native ad listener", e10);
            }
            return this;
        }

        /* renamed from: c */
        public a m39985c(AbstractC12359e abstractC12359e) {
            try {
                this.f33194b.zzl(new BinderC4887p4(abstractC12359e));
            } catch (RemoteException e10) {
                zzcec.zzk("Failed to set AdListener.", e10);
            }
            return this;
        }

        /* renamed from: d */
        public a m39986d(C5068c c5068c) {
            try {
                this.f33194b.zzo(new zzbjb(4, c5068c.m12815e(), -1, c5068c.m12814d(), c5068c.m12811a(), c5068c.m12813c() != null ? new C4875n4(c5068c.m12813c()) : null, c5068c.m12818h(), c5068c.m12812b(), c5068c.m12816f(), c5068c.m12817g(), c5068c.m12819i() - 1));
            } catch (RemoteException e10) {
                zzcec.zzk("Failed to specify native ad options", e10);
            }
            return this;
        }

        @Deprecated
        /* renamed from: e */
        public final a m39987e(String str, InterfaceC0076n interfaceC0076n, InterfaceC0075m interfaceC0075m) {
            zzblr zzblrVar = new zzblr(interfaceC0076n, interfaceC0075m);
            try {
                this.f33194b.zzh(str, zzblrVar.zzd(), zzblrVar.zzc());
            } catch (RemoteException e10) {
                zzcec.zzk("Failed to add custom template ad listener", e10);
            }
            return this;
        }

        @Deprecated
        /* renamed from: f */
        public final a m39988f(InterfaceC0078p interfaceC0078p) {
            try {
                this.f33194b.zzk(new zzblu(interfaceC0078p));
            } catch (RemoteException e10) {
                zzcec.zzk("Failed to add google native ad listener", e10);
            }
            return this;
        }

        @Deprecated
        /* renamed from: g */
        public final a m39989g(C0067e c0067e) {
            try {
                this.f33194b.zzo(new zzbjb(c0067e));
            } catch (RemoteException e10) {
                zzcec.zzk("Failed to specify native ad options", e10);
            }
            return this;
        }
    }

    C12363g(Context context, InterfaceC4871n0 interfaceC4871n0, C4941y4 c4941y4) {
        this.f33191b = context;
        this.f33192c = interfaceC4871n0;
        this.f33190a = c4941y4;
    }

    /* renamed from: d */
    private final void m39979d(final C4945z2 c4945z2) {
        zzbgc.zza(this.f33191b);
        if (((Boolean) zzbhy.zzc.zze()).booleanValue()) {
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkG)).booleanValue()) {
                zzcdr.zzb.execute(new Runnable() { // from class: x8.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12363g.this.m39982c(c4945z2);
                    }
                });
                return;
            }
        }
        try {
            this.f33192c.zzg(this.f33190a.m12509a(this.f33191b, c4945z2));
        } catch (RemoteException e10) {
            zzcec.zzh("Failed to load ad.", e10);
        }
    }

    /* renamed from: a */
    public void m39980a(C12365h c12365h) {
        m39979d(c12365h.f33196a);
    }

    /* renamed from: b */
    public void m39981b(C12645a c12645a) {
        m39979d(c12645a.f33196a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m39982c(C4945z2 c4945z2) {
        try {
            this.f33192c.zzg(this.f33190a.m12509a(this.f33191b, c4945z2));
        } catch (RemoteException e10) {
            zzcec.zzh("Failed to load ad.", e10);
        }
    }
}
