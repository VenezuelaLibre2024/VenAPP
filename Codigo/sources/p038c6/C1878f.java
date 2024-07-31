package p038c6;

import android.content.Context;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.RewardedVideoAd;

/* renamed from: c6.f */
/* loaded from: classes.dex */
public class C1878f {
    /* renamed from: a */
    public InterstitialAd m9981a(Context context, String str) {
        return new InterstitialAd(context, str);
    }

    /* renamed from: b */
    public MediaView m9982b(Context context) {
        return new MediaView(context);
    }

    /* renamed from: c */
    public AdView m9983c(Context context, String str, String str2) {
        return new AdView(context, str, str2);
    }

    /* renamed from: d */
    public RewardedVideoAd m9984d(Context context, String str) {
        return new RewardedVideoAd(context, str);
    }
}
