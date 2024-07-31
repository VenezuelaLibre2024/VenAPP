package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.ads.internal.util.u1;
import com.google.android.gms.common.internal.s;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzcfz extends FrameLayout implements zzcfq {
    final zzcgn zza;
    private final zzcgl zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbgu zze;
    private final long zzf;
    private final zzcfr zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcfz(Context context, zzcgl zzcglVar, int i10, boolean z10, zzbgu zzbguVar, zzcgk zzcgkVar) {
        super(context);
        this.zzb = zzcglVar;
        this.zze = zzbguVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        s.j(zzcglVar.zzj());
        zzcfs zzcfsVar = zzcglVar.zzj().f8601a;
        zzcfr zzchdVar = i10 == 2 ? new zzchd(context, new zzcgm(context, zzcglVar.zzn(), zzcglVar.zzbr(), zzbguVar, zzcglVar.zzk()), zzcglVar, z10, zzcfs.zza(zzcglVar), zzcgkVar) : new zzcfp(context, zzcglVar, z10, zzcfs.zza(zzcglVar), zzcgkVar, new zzcgm(context, zzcglVar.zzn(), zzcglVar.zzbr(), zzbguVar, zzcglVar.zzk()));
        this.zzg = zzchdVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzchdVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) a0.c().zza(zzbgc.zzF)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) a0.c().zza(zzbgc.zzC)).booleanValue()) {
            zzn();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) a0.c().zza(zzbgc.zzI)).longValue();
        boolean booleanValue = ((Boolean) a0.c().zza(zzbgc.zzE)).booleanValue();
        this.zzk = booleanValue;
        if (zzbguVar != null) {
            zzbguVar.zzd("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.zza = new zzcgn(this);
        zzchdVar.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzi() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zzb.zzi().getWindow().clearFlags(RecognitionOptions.ITF);
        this.zzi = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer zzl = zzl();
        if (zzl != null) {
            hashMap.put("playerId", zzl.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", hashMap);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzm(zzcfz zzcfzVar, String str, String[] strArr) {
        zzcfzVar.zzK(str, strArr);
    }

    public final void finalize() {
        try {
            this.zza.zza();
            final zzcfr zzcfrVar = this.zzg;
            if (zzcfrVar != null) {
                zzcep.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcft
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcfr.this.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z10) {
        super.onWindowFocusChanged(z10);
        zzcgn zzcgnVar = this.zza;
        if (z10) {
            zzcgnVar.zzb();
        } else {
            zzcgnVar.zza();
            this.zzm = this.zzl;
        }
        j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfv
            @Override // java.lang.Runnable
            public final void run() {
                zzcfz.this.zzq(z10);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfq
    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.zza.zzb();
            z10 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z10 = false;
        }
        j2.f8993l.post(new zzcfy(this, z10));
    }

    public final void zzA(int i10) {
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.zzz(i10);
    }

    public final void zzB(int i10) {
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.zzA(i10);
    }

    public final void zzC(int i10) {
        if (((Boolean) a0.c().zza(zzbgc.zzF)).booleanValue()) {
            this.zzc.setBackgroundColor(i10);
            this.zzd.setBackgroundColor(i10);
        }
    }

    public final void zzD(int i10) {
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.zzB(i10);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i10, int i11, int i12, int i13) {
        if (u1.c()) {
            u1.a("Set video bounds to x:" + i10 + ";y:" + i11 + ";w:" + i12 + ";h:" + i13);
        }
        if (i12 == 0 || i13 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.setMargins(i10, i11, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzG(float f10) {
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.zzb.zze(f10);
        zzcfrVar.zzn();
    }

    public final void zzH(float f10, float f11) {
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar != null) {
            zzcfrVar.zzu(f10, f11);
        }
    }

    public final void zzI() {
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.zzb.zzd(false);
        zzcfrVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcfq
    public final void zza() {
        if (((Boolean) a0.c().zza(zzbgc.zzbS)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcfq
    public final void zzb(String str, String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfq
    public final void zzc(String str, String str2) {
        zzK(Constants.EXCEPTION, "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfq
    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfq
    public final void zze() {
        if (((Boolean) a0.c().zza(zzbgc.zzbS)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            boolean z10 = (this.zzb.zzi().getWindow().getAttributes().flags & RecognitionOptions.ITF) != 0;
            this.zzj = z10;
            if (!z10) {
                this.zzb.zzi().getWindow().addFlags(RecognitionOptions.ITF);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfq
    public final void zzf() {
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar != null && this.zzm == 0) {
            float zzc = zzcfrVar.zzc();
            zzcfr zzcfrVar2 = this.zzg;
            zzK("canplaythrough", "duration", String.valueOf(zzc / 1000.0f), "videoWidth", String.valueOf(zzcfrVar2.zze()), "videoHeight", String.valueOf(zzcfrVar2.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfq
    public final void zzg() {
        this.zzd.setVisibility(4);
        j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfu
            @Override // java.lang.Runnable
            public final void run() {
                zzcfz.this.zzp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfq
    public final void zzh() {
        this.zza.zzb();
        j2.f8993l.post(new zzcfw(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcfq
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        j2.f8993l.post(new zzcfx(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcfq
    public final void zzj(int i10, int i11) {
        if (this.zzk) {
            zzbfu zzbfuVar = zzbgc.zzH;
            int max = Math.max(i10 / ((Integer) a0.c().zza(zzbfuVar)).intValue(), 1);
            int max2 = Math.max(i11 / ((Integer) a0.c().zza(zzbfuVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfq
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg == null || this.zzp == null) {
            return;
        }
        long b10 = t.b().b();
        if (this.zzg.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long b11 = t.b().b() - b10;
        if (u1.c()) {
            u1.a("Spinner frame grab took " + b11 + "ms");
        }
        if (b11 > this.zzf) {
            zzcec.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbgu zzbguVar = this.zze;
            if (zzbguVar != null) {
                zzbguVar.zzd("spinner_jank", Long.toString(b11));
            }
        }
    }

    public final Integer zzl() {
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar != null) {
            return zzcfrVar.zzw();
        }
        return null;
    }

    public final void zzn() {
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar == null) {
            return;
        }
        TextView textView = new TextView(zzcfrVar.getContext());
        Resources zze = t.q().zze();
        textView.setText(String.valueOf(zze == null ? "AdMob - " : zze.getString(d9.d.f13876t)).concat(this.zzg.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzo() {
        this.zza.zza();
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar != null) {
            zzcfrVar.zzt();
        }
        zzJ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(boolean z10) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
    }

    public final void zzr(Integer num) {
        if (this.zzg == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzK("no_src", new String[0]);
        } else {
            this.zzg.zzC(this.zzn, this.zzo, num);
        }
    }

    public final void zzs() {
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.zzb.zzd(true);
        zzcfrVar.zzn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzt() {
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar == null) {
            return;
        }
        long zza = zzcfrVar.zza();
        if (this.zzl == zza || zza <= 0) {
            return;
        }
        float f10 = ((float) zza) / 1000.0f;
        if (((Boolean) a0.c().zza(zzbgc.zzbQ)).booleanValue()) {
            zzK("timeupdate", "time", String.valueOf(f10), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(t.b().a()));
        } else {
            zzK("timeupdate", "time", String.valueOf(f10));
        }
        this.zzl = zza;
    }

    public final void zzu() {
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.zzo();
    }

    public final void zzv() {
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.zzp();
    }

    public final void zzw(int i10) {
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.zzq(i10);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i10) {
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.zzx(i10);
    }

    public final void zzz(int i10) {
        zzcfr zzcfrVar = this.zzg;
        if (zzcfrVar == null) {
            return;
        }
        zzcfrVar.zzy(i10);
    }
}
