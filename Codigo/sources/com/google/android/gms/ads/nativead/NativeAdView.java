package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.s3;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbjq;
import com.google.android.gms.internal.ads.zzcec;
import x8.p;

/* loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {

    /* renamed from: a */
    private final FrameLayout f9139a;

    /* renamed from: b */
    private final zzbjq f9140b;

    public NativeAdView(Context context) {
        super(context);
        this.f9139a = e(context);
        this.f9140b = f();
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9139a = e(context);
        this.f9140b = f();
    }

    private final FrameLayout e(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final zzbjq f() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.f9139a;
        return x.a().h(frameLayout.getContext(), this, frameLayout);
    }

    private final void g(String str, View view) {
        zzbjq zzbjqVar = this.f9140b;
        if (zzbjqVar == null) {
            return;
        }
        try {
            zzbjqVar.zzbE(str, com.google.android.gms.dynamic.d.h2(view));
        } catch (RemoteException e10) {
            zzcec.zzh("Unable to call setAssetView on delegate", e10);
        }
    }

    public void a() {
        zzbjq zzbjqVar = this.f9140b;
        if (zzbjqVar == null) {
            return;
        }
        try {
            zzbjqVar.zzc();
        } catch (RemoteException e10) {
            zzcec.zzh("Unable to destroy native ad view", e10);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront(this.f9139a);
    }

    protected final View b(String str) {
        zzbjq zzbjqVar = this.f9140b;
        if (zzbjqVar != null) {
            try {
                com.google.android.gms.dynamic.b zzb = zzbjqVar.zzb(str);
                if (zzb != null) {
                    return (View) com.google.android.gms.dynamic.d.g2(zzb);
                }
            } catch (RemoteException e10) {
                zzcec.zzh("Unable to call getAssetView on delegate", e10);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f9139a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final /* synthetic */ void c(p pVar) {
        zzbjq zzbjqVar = this.f9140b;
        if (zzbjqVar == null) {
            return;
        }
        try {
            if (pVar instanceof s3) {
                zzbjqVar.zzbG(((s3) pVar).b());
            } else if (pVar == null) {
                zzbjqVar.zzbG(null);
            } else {
                zzcec.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e10) {
            zzcec.zzh("Unable to call setMediaContent on delegate", e10);
        }
    }

    public final /* synthetic */ void d(ImageView.ScaleType scaleType) {
        zzbjq zzbjqVar = this.f9140b;
        if (zzbjqVar == null || scaleType == null) {
            return;
        }
        try {
            zzbjqVar.zzbH(com.google.android.gms.dynamic.d.h2(scaleType));
        } catch (RemoteException e10) {
            zzcec.zzh("Unable to call setMediaViewImageScaleType on delegate", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f9140b != null) {
            if (((Boolean) a0.c().zza(zzbgc.zzkU)).booleanValue()) {
                try {
                    this.f9140b.zzd(com.google.android.gms.dynamic.d.h2(motionEvent));
                } catch (RemoteException e10) {
                    zzcec.zzh("Unable to call handleTouchEvent on delegate", e10);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        View b10 = b("3011");
        if (b10 instanceof a) {
            return (a) b10;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return b("3005");
    }

    public final View getBodyView() {
        return b("3004");
    }

    public final View getCallToActionView() {
        return b("3002");
    }

    public final View getHeadlineView() {
        return b("3001");
    }

    public final View getIconView() {
        return b("3003");
    }

    public final View getImageView() {
        return b("3008");
    }

    public final MediaView getMediaView() {
        View b10 = b("3010");
        if (b10 instanceof MediaView) {
            return (MediaView) b10;
        }
        if (b10 == null) {
            return null;
        }
        zzcec.zze("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return b("3007");
    }

    public final View getStarRatingView() {
        return b("3009");
    }

    public final View getStoreView() {
        return b("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        zzbjq zzbjqVar = this.f9140b;
        if (zzbjqVar == null) {
            return;
        }
        try {
            zzbjqVar.zze(com.google.android.gms.dynamic.d.h2(view), i10);
        } catch (RemoteException e10) {
            zzcec.zzh("Unable to call onVisibilityChanged on delegate", e10);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f9139a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f9139a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
        g("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        g("3005", view);
    }

    public final void setBodyView(View view) {
        g("3004", view);
    }

    public final void setCallToActionView(View view) {
        g("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        zzbjq zzbjqVar = this.f9140b;
        if (zzbjqVar == null) {
            return;
        }
        try {
            zzbjqVar.zzbF(com.google.android.gms.dynamic.d.h2(view));
        } catch (RemoteException e10) {
            zzcec.zzh("Unable to call setClickConfirmingView on delegate", e10);
        }
    }

    public final void setHeadlineView(View view) {
        g("3001", view);
    }

    public final void setIconView(View view) {
        g("3003", view);
    }

    public final void setImageView(View view) {
        g("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        g("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.a(new f(this));
        mediaView.b(new g(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.dynamic.b, java.lang.Object] */
    public void setNativeAd(b bVar) {
        zzbjq zzbjqVar = this.f9140b;
        if (zzbjqVar == 0) {
            return;
        }
        try {
            zzbjqVar.zzbI(bVar.zza());
        } catch (RemoteException e10) {
            zzcec.zzh("Unable to call setNativeAd on delegate", e10);
        }
    }

    public final void setPriceView(View view) {
        g("3007", view);
    }

    public final void setStarRatingView(View view) {
        g("3009", view);
    }

    public final void setStoreView(View view) {
        g("3006", view);
    }
}
