package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.h4;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.s3;
import com.google.android.gms.ads.internal.client.u1;
import com.google.android.gms.ads.internal.client.y1;
import com.google.android.gms.ads.nativead.b;
import java.util.ArrayList;
import java.util.List;
import x8.p;
import x8.q;
import x8.r;
import x8.t;
import x8.z;

/* loaded from: classes2.dex */
public final class zzbwb extends com.google.android.gms.ads.nativead.b {
    private final zzblj zza;
    private final zzbwa zzc;
    private final b.a zzd;
    private final List zzb = new ArrayList();
    private final List zze = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(3:2|3|(2:5|(5:8|(1:10)(1:17)|(3:12|13|14)(1:16)|15|6)))|19|20|(2:22|(5:25|(1:27)(1:34)|(3:29|30|31)(1:33)|32|23))|(2:36|37)|(7:39|40|41|42|(2:44|45)|47|48)|53|40|41|42|(0)|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zzh("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097 A[Catch: RemoteException -> 0x00a4, TRY_LEAVE, TryCatch #2 {RemoteException -> 0x00a4, blocks: (B:42:0x008f, B:44:0x0097), top: B:41:0x008f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbwb(com.google.android.gms.internal.ads.zzblj r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzb = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zze = r1
            r5.zza = r6
            r1 = 0
            java.util.List r6 = r6.zzu()     // Catch: android.os.RemoteException -> L43
            if (r6 == 0) goto L47
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L43
        L20:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L43
            if (r2 == 0) goto L47
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L43
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L43
            if (r3 == 0) goto L35
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L43
            com.google.android.gms.internal.ads.zzbjm r2 = com.google.android.gms.internal.ads.zzbjl.zzg(r2)     // Catch: android.os.RemoteException -> L43
            goto L36
        L35:
            r2 = r1
        L36:
            if (r2 == 0) goto L20
            java.util.List r3 = r5.zzb     // Catch: android.os.RemoteException -> L43
            com.google.android.gms.internal.ads.zzbwa r4 = new com.google.android.gms.internal.ads.zzbwa     // Catch: android.os.RemoteException -> L43
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L43
            r3.add(r4)     // Catch: android.os.RemoteException -> L43
            goto L20
        L43:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzcec.zzh(r0, r6)
        L47:
            com.google.android.gms.internal.ads.zzblj r6 = r5.zza     // Catch: android.os.RemoteException -> L76
            java.util.List r6 = r6.zzv()     // Catch: android.os.RemoteException -> L76
            if (r6 == 0) goto L7a
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L76
        L53:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L76
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L76
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L76
            if (r3 == 0) goto L68
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L76
            com.google.android.gms.ads.internal.client.x1 r2 = com.google.android.gms.ads.internal.client.w1.f2(r2)     // Catch: android.os.RemoteException -> L76
            goto L69
        L68:
            r2 = r1
        L69:
            if (r2 == 0) goto L53
            java.util.List r3 = r5.zze     // Catch: android.os.RemoteException -> L76
            com.google.android.gms.ads.internal.client.y1 r4 = new com.google.android.gms.ads.internal.client.y1     // Catch: android.os.RemoteException -> L76
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L76
            r3.add(r4)     // Catch: android.os.RemoteException -> L76
            goto L53
        L76:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzcec.zzh(r0, r6)
        L7a:
            com.google.android.gms.internal.ads.zzblj r6 = r5.zza     // Catch: android.os.RemoteException -> L88
            com.google.android.gms.internal.ads.zzbjm r6 = r6.zzk()     // Catch: android.os.RemoteException -> L88
            if (r6 == 0) goto L8c
            com.google.android.gms.internal.ads.zzbwa r2 = new com.google.android.gms.internal.ads.zzbwa     // Catch: android.os.RemoteException -> L88
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L88
            goto L8d
        L88:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzcec.zzh(r0, r6)
        L8c:
            r2 = r1
        L8d:
            r5.zzc = r2
            com.google.android.gms.internal.ads.zzblj r6 = r5.zza     // Catch: android.os.RemoteException -> La4
            com.google.android.gms.internal.ads.zzbjf r6 = r6.zzi()     // Catch: android.os.RemoteException -> La4
            if (r6 == 0) goto La8
            com.google.android.gms.internal.ads.zzbvy r6 = new com.google.android.gms.internal.ads.zzbvy     // Catch: android.os.RemoteException -> La4
            com.google.android.gms.internal.ads.zzblj r2 = r5.zza     // Catch: android.os.RemoteException -> La4
            com.google.android.gms.internal.ads.zzbjf r2 = r2.zzi()     // Catch: android.os.RemoteException -> La4
            r6.<init>(r2)     // Catch: android.os.RemoteException -> La4
            r1 = r6
            goto La8
        La4:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzcec.zzh(r0, r6)
        La8:
            r5.zzd = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwb.<init>(com.google.android.gms.internal.ads.zzblj):void");
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzw();
        } catch (RemoteException e10) {
            zzcec.zzh("Failed to cancelUnconfirmedClick", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final void destroy() {
        try {
            this.zza.zzx();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final void enableCustomClickGesture() {
        try {
            this.zza.zzC();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final b.a getAdChoicesInfo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final String getAdvertiser() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final String getBody() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final String getCallToAction() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final Bundle getExtras() {
        try {
            Bundle zzf = this.zza.zzf();
            if (zzf != null) {
                return zzf;
            }
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final String getHeadline() {
        try {
            return this.zza.zzq();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final b.AbstractC0145b getIcon() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final List<b.AbstractC0145b> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final p getMediaContent() {
        try {
            if (this.zza.zzj() != null) {
                return new s3(this.zza.zzj(), null);
            }
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final List<r> getMuteThisAdReasons() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final String getPrice() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final z getResponseInfo() {
        p2 p2Var;
        try {
            p2Var = this.zza.zzg();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            p2Var = null;
        }
        return z.f(p2Var);
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final Double getStarRating() {
        try {
            double zze = this.zza.zze();
            if (zze == -1.0d) {
                return null;
            }
            return Double.valueOf(zze);
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final String getStore() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzG();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzH();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final void muteThisAd(r rVar) {
        try {
            try {
                if (this.zza.zzH()) {
                    if (rVar == null) {
                        this.zza.zzy(null);
                        return;
                    } else if (rVar instanceof y1) {
                        this.zza.zzy(((y1) rVar).a());
                        return;
                    } else {
                        zzcec.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e10) {
                zzcec.zzh("", e10);
            }
            zzcec.zzg("Ad is not custom mute enabled");
        } catch (RemoteException e11) {
            zzcec.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final void recordCustomClickGesture() {
        try {
            this.zza.zzA();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzI(bundle);
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzB(bundle);
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final void setMuteThisAdListener(q qVar) {
        try {
            this.zza.zzD(new u1(qVar));
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final void setOnPaidEventListener(t tVar) {
        try {
            this.zza.zzE(new h4(tVar));
        } catch (RemoteException e10) {
            zzcec.zzh("Failed to setOnPaidEventListener", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.b
    public final void setUnconfirmedClickListener(b.d dVar) {
        try {
            this.zza.zzF(new zzbwj(dVar));
        } catch (RemoteException e10) {
            zzcec.zzh("Failed to setUnconfirmedClickListener", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.nativead.b
    public final /* bridge */ /* synthetic */ Object zza() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return null;
        }
    }
}
