package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbvv extends zzbvw implements zzbng {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcjk zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbfm zzk;
    private float zzl;
    private int zzm;

    public zzbvv(zzcjk zzcjkVar, Context context, zzbfm zzbfmVar) {
        super(zzcjkVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcjkVar;
        this.zzi = context;
        this.zzk = zzbfmVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* synthetic */ void zza(Object obj, Map map) {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        JSONObject jSONObject;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        x.b();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzcdv.zzv(displayMetrics, displayMetrics.widthPixels);
        x.b();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzcdv.zzv(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzi = this.zzh.zzi();
        if (zzi == null || zzi.getWindow() == null) {
            this.zzd = this.zzb;
            i10 = this.zzc;
        } else {
            t.r();
            int[] p10 = j2.p(zzi);
            x.b();
            this.zzd = zzcdv.zzv(this.zza, p10[0]);
            x.b();
            i10 = zzcdv.zzv(this.zza, p10[1]);
        }
        this.zze = i10;
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzj(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbvu zzbvuVar = new zzbvu();
        zzbfm zzbfmVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbvuVar.zze(zzbfmVar.zza(intent));
        zzbfm zzbfmVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbvuVar.zzc(zzbfmVar2.zza(intent2));
        zzbvuVar.zza(this.zzk.zzb());
        zzbvuVar.zzd(this.zzk.zzc());
        zzbvuVar.zzb(true);
        z10 = zzbvuVar.zza;
        z11 = zzbvuVar.zzb;
        z12 = zzbvuVar.zzc;
        z13 = zzbvuVar.zzd;
        z14 = zzbvuVar.zze;
        zzcjk zzcjkVar = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", z10).put("tel", z11).put("calendar", z12).put("storePicture", z13).put("inlineVideo", z14);
        } catch (JSONException e10) {
            zzcec.zzh("Error occurred while obtaining the MRAID capabilities.", e10);
            jSONObject = null;
        }
        zzcjkVar.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(x.b().zzb(this.zzi, iArr[0]), x.b().zzb(this.zzi, iArr[1]));
        if (zzcec.zzm(2)) {
            zzcec.zzi("Dispatching Ready Event.");
        }
        zzi(this.zzh.zzn().zza);
    }

    public final void zzb(int i10, int i11) {
        int i12;
        Context context = this.zzi;
        int i13 = 0;
        if (context instanceof Activity) {
            t.r();
            i12 = j2.q((Activity) context)[0];
        } else {
            i12 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            zzcjk zzcjkVar = this.zzh;
            int width = zzcjkVar.getWidth();
            int height = zzcjkVar.getHeight();
            if (((Boolean) a0.c().zza(zzbgc.zzR)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzO() != null ? this.zzh.zzO().zzb : 0;
                }
                if (height == 0) {
                    if (this.zzh.zzO() != null) {
                        i13 = this.zzh.zzO().zza;
                    }
                    this.zzf = x.b().zzb(this.zzi, width);
                    this.zzg = x.b().zzb(this.zzi, i13);
                }
            }
            i13 = height;
            this.zzf = x.b().zzb(this.zzi, width);
            this.zzg = x.b().zzb(this.zzi, i13);
        }
        zzg(i10, i11 - i12, this.zzf, this.zzg);
        this.zzh.zzN().zzC(i10, i11);
    }
}
