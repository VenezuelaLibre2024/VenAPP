package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.k2;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.ads.nativead.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import x8.g;
import x8.h;
import x8.o;
import x8.u;
import x8.z;

/* loaded from: classes2.dex */
public final class zzdzx extends k2 {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdzl zzd;
    private final zzgey zze;
    private final zzdzy zzf;
    private zzdzd zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzx(Context context, WeakReference weakReference, zzdzl zzdzlVar, zzdzy zzdzyVar, zzgey zzgeyVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdzlVar;
        this.zze = zzgeyVar;
        this.zzf = zzdzyVar;
    }

    private final Context zzj() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    private static x8.h zzk() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new h.a().b(AdMobAdapter.class, bundle).k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzl(Object obj) {
        z responseInfo;
        p2 h10;
        if (obj instanceof o) {
            responseInfo = ((o) obj).f();
        } else if (obj instanceof z8.a) {
            responseInfo = ((z8.a) obj).getResponseInfo();
        } else if (obj instanceof h9.a) {
            responseInfo = ((h9.a) obj).getResponseInfo();
        } else if (obj instanceof n9.c) {
            responseInfo = ((n9.c) obj).getResponseInfo();
        } else if (obj instanceof o9.a) {
            responseInfo = ((o9.a) obj).getResponseInfo();
        } else if (obj instanceof x8.k) {
            responseInfo = ((x8.k) obj).getResponseInfo();
        } else {
            if (!(obj instanceof com.google.android.gms.ads.nativead.b)) {
                return "";
            }
            responseInfo = ((com.google.android.gms.ads.nativead.b) obj).getResponseInfo();
        }
        if (responseInfo == null || (h10 = responseInfo.h()) == null) {
            return "";
        }
        try {
            return h10.zzh();
        } catch (RemoteException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(String str, String str2) {
        try {
            zzgen.zzr(this.zzg.zzb(str), new zzdzv(this, str2), this.zze);
        } catch (NullPointerException e10) {
            t.q().zzw(e10, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzk(str2);
        }
    }

    private final synchronized void zzn(String str, String str2) {
        try {
            zzgen.zzr(this.zzg.zzb(str), new zzdzw(this, str2), this.zze);
        } catch (NullPointerException e10) {
            t.q().zzw(e10, "OutOfContextTester.setAdAsShown");
            this.zzd.zzk(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.l2
    public final void zze(String str, com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2) {
        Context context = (Context) com.google.android.gms.dynamic.d.g2(bVar);
        ViewGroup viewGroup = (ViewGroup) com.google.android.gms.dynamic.d.g2(bVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.zza.get(str);
        if (obj != null) {
            this.zza.remove(str);
        }
        if (obj instanceof x8.k) {
            zzdzy.zza(context, viewGroup, (x8.k) obj);
        } else if (obj instanceof com.google.android.gms.ads.nativead.b) {
            zzdzy.zzb(context, viewGroup, (com.google.android.gms.ads.nativead.b) obj);
        }
    }

    public final void zzf(zzdzd zzdzdVar) {
        this.zzg = zzdzdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zzg(String str, Object obj, String str2) {
        this.zza.put(str, obj);
        zzm(zzl(obj), str2);
    }

    public final synchronized void zzh(final String str, String str2, final String str3) {
        char c10;
        switch (str2.hashCode()) {
            case -1999289321:
                if (str2.equals("NATIVE")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1372958932:
                if (str2.equals("INTERSTITIAL")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -428325382:
                if (str2.equals("APP_OPEN_AD")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 543046670:
                if (str2.equals("REWARDED")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1854800829:
                if (str2.equals("REWARDED_INTERSTITIAL")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1951953708:
                if (str2.equals("BANNER")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            z8.a.load(zzj(), str, zzk(), 1, new zzdzp(this, str, str3));
            return;
        }
        if (c10 == 1) {
            x8.k kVar = new x8.k(zzj());
            kVar.setAdSize(x8.i.f30678i);
            kVar.setAdUnitId(str);
            kVar.setAdListener(new zzdzq(this, str, kVar, str3));
            kVar.b(zzk());
            return;
        }
        if (c10 == 2) {
            h9.a.load(zzj(), str, zzk(), new zzdzr(this, str, str3));
            return;
        }
        if (c10 == 3) {
            g.a aVar = new g.a(zzj(), str);
            aVar.b(new b.c() { // from class: com.google.android.gms.internal.ads.zzdzm
                @Override // com.google.android.gms.ads.nativead.b.c
                public final void onNativeAdLoaded(com.google.android.gms.ads.nativead.b bVar) {
                    zzdzx.this.zzg(str, bVar, str3);
                }
            });
            aVar.c(new zzdzu(this, str3));
            aVar.a().a(zzk());
            return;
        }
        if (c10 == 4) {
            n9.c.load(zzj(), str, zzk(), new zzdzs(this, str, str3));
        } else {
            if (c10 != 5) {
                return;
            }
            o9.a.load(zzj(), str, zzk(), new zzdzt(this, str, str3));
        }
    }

    public final synchronized void zzi(String str, String str2) {
        Object obj;
        Activity zzg = this.zzd.zzg();
        if (zzg != null && (obj = this.zza.get(str)) != null) {
            zzbfu zzbfuVar = zzbgc.zzjm;
            if (!((Boolean) a0.c().zza(zzbfuVar)).booleanValue() || (obj instanceof z8.a) || (obj instanceof h9.a) || (obj instanceof n9.c) || (obj instanceof o9.a)) {
                this.zza.remove(str);
            }
            zzn(zzl(obj), str2);
            if (obj instanceof z8.a) {
                ((z8.a) obj).show(zzg);
                return;
            }
            if (obj instanceof h9.a) {
                ((h9.a) obj).show(zzg);
                return;
            }
            if (obj instanceof n9.c) {
                ((n9.c) obj).show(zzg, new u() { // from class: com.google.android.gms.internal.ads.zzdzn
                    @Override // x8.u
                    public final void onUserEarnedReward(n9.b bVar) {
                    }
                });
                return;
            }
            if (obj instanceof o9.a) {
                ((o9.a) obj).show(zzg, new u() { // from class: com.google.android.gms.internal.ads.zzdzo
                    @Override // x8.u
                    public final void onUserEarnedReward(n9.b bVar) {
                    }
                });
                return;
            }
            if (((Boolean) a0.c().zza(zzbfuVar)).booleanValue() && ((obj instanceof x8.k) || (obj instanceof com.google.android.gms.ads.nativead.b))) {
                Intent intent = new Intent();
                Context zzj = zzj();
                intent.setClassName(zzj, "com.google.android.gms.ads.OutOfContextTestingActivity");
                intent.putExtra("adUnit", str);
                t.r();
                j2.s(zzj, intent);
            }
        }
    }
}
