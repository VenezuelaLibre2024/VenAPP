package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.t;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcvt extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcvt(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcvt zza(Context context, View view, zzfgm zzfgmVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcvt zzcvtVar = new zzcvt(context);
        if (!zzfgmVar.zzv.isEmpty() && (resources = zzcvtVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f10 = ((zzfgn) zzfgmVar.zzv.get(0)).zza;
            float f11 = displayMetrics.density;
            zzcvtVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f10 * f11), (int) (r1.zzb * f11)));
        }
        zzcvtVar.zzb = view;
        zzcvtVar.addView(view);
        t.z();
        zzcfc.zzb(zzcvtVar, zzcvtVar);
        t.z();
        zzcfc.zza(zzcvtVar, zzcvtVar);
        JSONObject jSONObject = zzfgmVar.zzai;
        RelativeLayout relativeLayout = new RelativeLayout(zzcvtVar.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcvtVar.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcvtVar.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcvtVar.addView(relativeLayout);
        return zzcvtVar;
    }

    private final int zzb(double d10) {
        x.b();
        return zzcdv.zzx(this.zza, (int) d10);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzb, 0, zzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i10);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }
}
