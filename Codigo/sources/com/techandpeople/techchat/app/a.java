package com.techandpeople.techchat.app;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.AudienceNetworkAds;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class a implements AudienceNetworkAds.InitListener {

    /* renamed from: a, reason: collision with root package name */
    public static final C0197a f13568a = new C0197a(null);

    /* renamed from: com.techandpeople.techchat.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0197a {
        private C0197a() {
        }

        public /* synthetic */ C0197a(g gVar) {
            this();
        }

        public final void a(Context context) {
            n.e(context, "context");
            if (AudienceNetworkAds.isInitialized(context)) {
                return;
            }
            AudienceNetworkAds.buildInitSettings(context).withInitListener(new a()).initialize();
        }
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        String message;
        if (initResult == null || (message = initResult.getMessage()) == null) {
            return;
        }
        Log.d(AudienceNetworkAds.TAG, message);
    }
}
