package com.google.ads.mediation.facebook;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import java.util.ArrayList;
import java.util.Iterator;
import x8.b;

/* loaded from: classes.dex */
class a implements AudienceNetworkAds.InitListener {

    /* renamed from: d, reason: collision with root package name */
    private static a f8076d;

    /* renamed from: a, reason: collision with root package name */
    private boolean f8077a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8078b = false;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<InterfaceC0139a> f8079c = new ArrayList<>();

    /* renamed from: com.google.ads.mediation.facebook.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    interface InterfaceC0139a {
        void a();

        void b(b bVar);
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a() {
        if (f8076d == null) {
            f8076d = new a();
        }
        return f8076d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Context context, ArrayList<String> arrayList, InterfaceC0139a interfaceC0139a) {
        if (this.f8077a) {
            this.f8079c.add(interfaceC0139a);
        } else {
            if (this.f8078b) {
                interfaceC0139a.a();
                return;
            }
            this.f8077a = true;
            a().f8079c.add(interfaceC0139a);
            AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.17.0.0").withPlacementIds(arrayList).withInitListener(this).initialize();
        }
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.f8077a = false;
        this.f8078b = initResult.isSuccess();
        Iterator<InterfaceC0139a> it = this.f8079c.iterator();
        while (it.hasNext()) {
            InterfaceC0139a next = it.next();
            if (initResult.isSuccess()) {
                next.a();
            } else {
                next.b(new b(104, initResult.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN));
            }
        }
        this.f8079c.clear();
    }
}
