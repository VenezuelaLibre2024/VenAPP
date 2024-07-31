package be;

import android.app.Application;
import zd.u2;

/* loaded from: classes.dex */
public class h0 {
    public u2 a(Application application) {
        return new u2(application, "fiam_eligible_campaigns_cache_file");
    }

    public u2 b(Application application) {
        return new u2(application, "fiam_impressions_store_file");
    }

    public u2 c(Application application) {
        return new u2(application, "rate_limit_store_file");
    }
}
