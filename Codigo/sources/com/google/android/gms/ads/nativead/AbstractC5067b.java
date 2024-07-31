package com.google.android.gms.ads.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import p438x8.C12388z;
import p438x8.InterfaceC12378p;
import p438x8.InterfaceC12379q;
import p438x8.InterfaceC12380r;
import p438x8.InterfaceC12382t;

/* renamed from: com.google.android.gms.ads.nativead.b */
/* loaded from: classes.dex */
public abstract class AbstractC5067b {

    /* renamed from: com.google.android.gms.ads.nativead.b$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract List<b> getImages();

        public abstract CharSequence getText();
    }

    /* renamed from: com.google.android.gms.ads.nativead.b$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract Drawable getDrawable();

        public abstract double getScale();

        public abstract Uri getUri();
    }

    /* renamed from: com.google.android.gms.ads.nativead.b$c */
    /* loaded from: classes.dex */
    public interface c {
        void onNativeAdLoaded(AbstractC5067b abstractC5067b);
    }

    /* renamed from: com.google.android.gms.ads.nativead.b$d */
    /* loaded from: classes.dex */
    public interface d {
    }

    public abstract void cancelUnconfirmedClick();

    public abstract void destroy();

    @Deprecated
    public abstract void enableCustomClickGesture();

    public abstract a getAdChoicesInfo();

    public abstract String getAdvertiser();

    public abstract String getBody();

    public abstract String getCallToAction();

    public abstract Bundle getExtras();

    public abstract String getHeadline();

    public abstract b getIcon();

    public abstract List<b> getImages();

    public abstract InterfaceC12378p getMediaContent();

    public abstract List<InterfaceC12380r> getMuteThisAdReasons();

    public abstract String getPrice();

    public abstract C12388z getResponseInfo();

    public abstract Double getStarRating();

    public abstract String getStore();

    @Deprecated
    public abstract boolean isCustomClickGestureEnabled();

    public abstract boolean isCustomMuteThisAdEnabled();

    public abstract void muteThisAd(InterfaceC12380r interfaceC12380r);

    public abstract void performClick(Bundle bundle);

    @Deprecated
    public abstract void recordCustomClickGesture();

    public abstract boolean recordImpression(Bundle bundle);

    public abstract void reportTouchEvent(Bundle bundle);

    public abstract void setMuteThisAdListener(InterfaceC12379q interfaceC12379q);

    public abstract void setOnPaidEventListener(InterfaceC12382t interfaceC12382t);

    public abstract void setUnconfirmedClickListener(d dVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zza();
}
