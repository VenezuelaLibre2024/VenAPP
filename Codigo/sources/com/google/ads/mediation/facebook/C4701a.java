package com.google.ads.mediation.facebook;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import java.util.ArrayList;
import java.util.Iterator;
import p438x8.C12353b;

/* renamed from: com.google.ads.mediation.facebook.a */
/* loaded from: classes.dex */
class C4701a implements AudienceNetworkAds.InitListener {

    /* renamed from: d */
    private static C4701a f9075d;

    /* renamed from: a */
    private boolean f9076a = false;

    /* renamed from: b */
    private boolean f9077b = false;

    /* renamed from: c */
    private final ArrayList<a> f9078c = new ArrayList<>();

    /* renamed from: com.google.ads.mediation.facebook.a$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        void mo11775a();

        /* renamed from: b */
        void mo11776b(C12353b c12353b);
    }

    private C4701a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C4701a m11777a() {
        if (f9075d == null) {
            f9075d = new C4701a();
        }
        return f9075d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m11778b(Context context, ArrayList<String> arrayList, a aVar) {
        if (this.f9076a) {
            this.f9078c.add(aVar);
        } else {
            if (this.f9077b) {
                aVar.mo11775a();
                return;
            }
            this.f9076a = true;
            m11777a().f9078c.add(aVar);
            AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.17.0.0").withPlacementIds(arrayList).withInitListener(this).initialize();
        }
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.f9076a = false;
        this.f9077b = initResult.isSuccess();
        Iterator<a> it = this.f9078c.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (initResult.isSuccess()) {
                next.mo11775a();
            } else {
                next.mo11776b(new C12353b(104, initResult.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN));
            }
        }
        this.f9078c.clear();
    }
}
