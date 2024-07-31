package cb;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes2.dex */
public interface c {

    /* loaded from: classes2.dex */
    public interface a {
        void onConsentInfoUpdateFailure(@RecentlyNonNull e eVar);
    }

    /* loaded from: classes2.dex */
    public interface b {
        void onConsentInfoUpdateSuccess();
    }

    /* renamed from: cb.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0119c {
        UNKNOWN,
        NOT_REQUIRED,
        REQUIRED
    }

    boolean canRequestAds();

    int getConsentStatus();

    @RecentlyNonNull
    EnumC0119c getPrivacyOptionsRequirementStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(@RecentlyNonNull Activity activity, @RecentlyNonNull d dVar, @RecentlyNonNull b bVar, @RecentlyNonNull a aVar);

    void reset();
}
