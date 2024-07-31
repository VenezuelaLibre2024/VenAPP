package p042cb;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;

/* renamed from: cb.c */
/* loaded from: classes2.dex */
public interface InterfaceC1934c {

    /* renamed from: cb.c$a */
    /* loaded from: classes2.dex */
    public interface a {
        void onConsentInfoUpdateFailure(@RecentlyNonNull C1936e c1936e);
    }

    /* renamed from: cb.c$b */
    /* loaded from: classes2.dex */
    public interface b {
        void onConsentInfoUpdateSuccess();
    }

    /* renamed from: cb.c$c */
    /* loaded from: classes2.dex */
    public enum c {
        UNKNOWN,
        NOT_REQUIRED,
        REQUIRED
    }

    boolean canRequestAds();

    int getConsentStatus();

    @RecentlyNonNull
    c getPrivacyOptionsRequirementStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(@RecentlyNonNull Activity activity, @RecentlyNonNull C1935d c1935d, @RecentlyNonNull b bVar, @RecentlyNonNull a aVar);

    void reset();
}
