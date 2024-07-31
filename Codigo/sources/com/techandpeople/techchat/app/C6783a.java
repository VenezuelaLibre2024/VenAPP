package com.techandpeople.techchat.app;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.AudienceNetworkAds;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: com.techandpeople.techchat.app.a */
/* loaded from: classes3.dex */
public final class C6783a implements AudienceNetworkAds.InitListener {

    /* renamed from: a */
    public static final a f14870a = new a(null);

    /* renamed from: com.techandpeople.techchat.app.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final void m19548a(Context context) {
            C9322n.m27781e(context, "context");
            if (AudienceNetworkAds.isInitialized(context)) {
                return;
            }
            AudienceNetworkAds.buildInitSettings(context).withInitListener(new C6783a()).initialize();
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
