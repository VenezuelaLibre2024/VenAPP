package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.zzbkg;
import com.google.android.gms.internal.ads.zzcec;
import x8.p;

/* loaded from: classes.dex */
public class MediaView extends FrameLayout {

    /* renamed from: a */
    private p f9133a;

    /* renamed from: b */
    private boolean f9134b;

    /* renamed from: c */
    private ImageView.ScaleType f9135c;

    /* renamed from: d */
    private boolean f9136d;

    /* renamed from: e */
    private f f9137e;

    /* renamed from: f */
    private g f9138f;

    public MediaView(Context context) {
        super(context);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final synchronized void a(f fVar) {
        this.f9137e = fVar;
        if (this.f9134b) {
            fVar.f9159a.c(this.f9133a);
        }
    }

    public final synchronized void b(g gVar) {
        this.f9138f = gVar;
        if (this.f9136d) {
            gVar.f9160a.d(this.f9135c);
        }
    }

    public p getMediaContent() {
        return this.f9133a;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f9136d = true;
        this.f9135c = scaleType;
        g gVar = this.f9138f;
        if (gVar != null) {
            gVar.f9160a.d(scaleType);
        }
    }

    public void setMediaContent(p pVar) {
        boolean zzr;
        this.f9134b = true;
        this.f9133a = pVar;
        f fVar = this.f9137e;
        if (fVar != null) {
            fVar.f9159a.c(pVar);
        }
        if (pVar == null) {
            return;
        }
        try {
            zzbkg zza = pVar.zza();
            if (zza != null) {
                if (!pVar.a()) {
                    if (pVar.zzb()) {
                        zzr = zza.zzr(com.google.android.gms.dynamic.d.h2(this));
                    }
                    removeAllViews();
                }
                zzr = zza.zzs(com.google.android.gms.dynamic.d.h2(this));
                if (zzr) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e10) {
            removeAllViews();
            zzcec.zzh("", e10);
        }
    }
}
