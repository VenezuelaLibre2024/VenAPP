package com.google.android.gms.ads.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import x8.p;
import x8.q;
import x8.r;
import x8.t;
import x8.z;

/* loaded from: classes.dex */
public abstract class b {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract List<AbstractC0145b> getImages();

        public abstract CharSequence getText();
    }

    /* renamed from: com.google.android.gms.ads.nativead.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0145b {
        public abstract Drawable getDrawable();

        public abstract double getScale();

        public abstract Uri getUri();
    }

    /* loaded from: classes.dex */
    public interface c {
        void onNativeAdLoaded(b bVar);
    }

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

    public abstract AbstractC0145b getIcon();

    public abstract List<AbstractC0145b> getImages();

    public abstract p getMediaContent();

    public abstract List<r> getMuteThisAdReasons();

    public abstract String getPrice();

    public abstract z getResponseInfo();

    public abstract Double getStarRating();

    public abstract String getStore();

    @Deprecated
    public abstract boolean isCustomClickGestureEnabled();

    public abstract boolean isCustomMuteThisAdEnabled();

    public abstract void muteThisAd(r rVar);

    public abstract void performClick(Bundle bundle);

    @Deprecated
    public abstract void recordCustomClickGesture();

    public abstract boolean recordImpression(Bundle bundle);

    public abstract void reportTouchEvent(Bundle bundle);

    public abstract void setMuteThisAdListener(q qVar);

    public abstract void setOnPaidEventListener(t tVar);

    public abstract void setUnconfirmedClickListener(d dVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zza();
}
