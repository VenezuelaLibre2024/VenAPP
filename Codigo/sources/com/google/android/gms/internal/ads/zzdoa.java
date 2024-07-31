package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.u1;
import com.google.android.gms.ads.internal.util.w1;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdoa {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final w1 zzb;
    private final zzfhh zzc;
    private final zzdnf zzd;
    private final zzdna zze;
    private final zzdom zzf;
    private final zzdou zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbjb zzj;
    private final zzdmx zzk;

    public zzdoa(w1 w1Var, zzfhh zzfhhVar, zzdnf zzdnfVar, zzdna zzdnaVar, zzdom zzdomVar, zzdou zzdouVar, Executor executor, Executor executor2, zzdmx zzdmxVar) {
        this.zzb = w1Var;
        this.zzc = zzfhhVar;
        this.zzj = zzfhhVar.zzi;
        this.zzd = zzdnfVar;
        this.zze = zzdnaVar;
        this.zzf = zzdomVar;
        this.zzg = zzdouVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdmxVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i10 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z10) {
        View zzf = z10 ? this.zze.zzf() : this.zze.zzg();
        if (zzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzf.getParent()).removeView(zzf);
        }
        viewGroup.addView(zzf, ((Boolean) a0.c().zza(zzbgc.zzdJ)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        zzdna zzdnaVar = this.zze;
        if (zzdnaVar.zzf() != null) {
            boolean z10 = viewGroup != null;
            if (zzdnaVar.zzc() == 2 || zzdnaVar.zzc() == 1) {
                this.zzb.p(this.zzc.zzf, String.valueOf(zzdnaVar.zzc()), z10);
            } else if (zzdnaVar.zzc() == 6) {
                this.zzb.p(this.zzc.zzf, "2", z10);
                this.zzb.p(this.zzc.zzf, "1", z10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzb(zzdow zzdowVar) {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        zzbjj zza2;
        Drawable drawable;
        ImageView.ScaleType scaleType;
        if (this.zzd.zzf() || this.zzd.zze()) {
            String[] strArr = {"1098", "3011"};
            for (int i10 = 0; i10 < 2; i10++) {
                View zzg = zzdowVar.zzg(strArr[i10]);
                if (zzg != null && (zzg instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzdowVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdna zzdnaVar = this.zze;
        if (zzdnaVar.zze() != null) {
            zzbjb zzbjbVar = this.zzj;
            view = zzdnaVar.zze();
            if (zzbjbVar != null && viewGroup == null) {
                zzh(layoutParams, zzbjbVar.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdnaVar.zzl() instanceof zzbiw) {
            zzbiw zzbiwVar = (zzbiw) zzdnaVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbiwVar.zzc());
                viewGroup = null;
            }
            View zzbixVar = new zzbix(context, zzbiwVar, layoutParams);
            zzbixVar.setContentDescription((CharSequence) a0.c().zza(zzbgc.zzdH));
            view = zzbixVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                a9.i iVar = new a9.i(zzdowVar.zzf().getContext());
                iVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                iVar.addView(view);
                FrameLayout zzh = zzdowVar.zzh();
                if (zzh != null) {
                    zzh.addView(iVar);
                }
            }
            zzdowVar.zzq(zzdowVar.zzk(), view, true);
        }
        zzgaa zzgaaVar = zzdnw.zza;
        int size = zzgaaVar.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg2 = zzdowVar.zzg((String) zzgaaVar.get(i11));
            i11++;
            if (zzg2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnx
            public final /* synthetic */ ViewGroup zzb;

            public /* synthetic */ zzdnx(ViewGroup viewGroup22) {
                r2 = viewGroup22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzdoa.this.zza(r2);
            }
        });
        if (viewGroup22 == null) {
            return;
        }
        if (zzi(viewGroup22, true)) {
            zzdna zzdnaVar2 = this.zze;
            if (zzdnaVar2.zzs() != null) {
                zzdnaVar2.zzs().zzap(new zzdnz(zzdowVar, viewGroup22));
                return;
            }
            return;
        }
        if (((Boolean) a0.c().zza(zzbgc.zzjK)).booleanValue() && zzi(viewGroup22, false)) {
            zzdna zzdnaVar3 = this.zze;
            if (zzdnaVar3.zzq() != null) {
                zzdnaVar3.zzq().zzap(new zzdnz(zzdowVar, viewGroup22));
                return;
            }
            return;
        }
        viewGroup22.removeAllViews();
        View zzf = zzdowVar.zzf();
        Context context2 = zzf != null ? zzf.getContext() : null;
        if (context2 == null || (zza2 = this.zzk.zza()) == null) {
            return;
        }
        try {
            com.google.android.gms.dynamic.b zzi = zza2.zzi();
            if (zzi == null || (drawable = (Drawable) com.google.android.gms.dynamic.d.g2(zzi)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            com.google.android.gms.dynamic.b zzj = zzdowVar.zzj();
            if (zzj != null) {
                if (((Boolean) a0.c().zza(zzbgc.zzgi)).booleanValue()) {
                    scaleType = (ImageView.ScaleType) com.google.android.gms.dynamic.d.g2(zzj);
                    imageView.setScaleType(scaleType);
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup22.addView(imageView);
                }
            }
            scaleType = zza;
            imageView.setScaleType(scaleType);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup22.addView(imageView);
        } catch (RemoteException unused) {
            zzcec.zzj("Could not get main image drawable");
        }
    }

    public final void zzc(zzdow zzdowVar) {
        if (zzdowVar == null || this.zzf == null || zzdowVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdowVar.zzh().addView(this.zzf.zza());
        } catch (zzcjw e10) {
            u1.b("web view can not be obtained", e10);
        }
    }

    public final void zzd(zzdow zzdowVar) {
        if (zzdowVar == null) {
            return;
        }
        Context context = zzdowVar.zzf().getContext();
        if (b1.h(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                zzcec.zze("Activity context is needed for policy validator.");
                return;
            }
            if (this.zzg == null || zzdowVar.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.zzg.zza(zzdowVar.zzh(), windowManager), b1.b());
            } catch (zzcjw e10) {
                u1.b("web view can not be obtained", e10);
            }
        }
    }

    public final void zze(zzdow zzdowVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdny
            public final /* synthetic */ zzdow zzb;

            public /* synthetic */ zzdny(zzdow zzdowVar2) {
                r2 = zzdowVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzdoa.this.zzb(r2);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }
}
