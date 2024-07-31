package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import kotlin.jvm.internal.C9322n;

/* renamed from: androidx.privacysandbox.ads.adservices.topics.f */
/* loaded from: classes.dex */
public final class C1338f extends C1339g {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1338f(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C9322n.m27781e(r2, r0)
            java.lang.Class<android.adservices.topics.TopicsManager> r0 = android.adservices.topics.TopicsManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "context.getSystemService…opicsManager::class.java)"
            kotlin.jvm.internal.C9322n.m27780d(r2, r0)
            android.adservices.topics.TopicsManager r2 = (android.adservices.topics.TopicsManager) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.C1338f.<init>(android.content.Context):void");
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.C1339g
    /* renamed from: c */
    public GetTopicsRequest mo7459c(C1333a request) {
        C9322n.m27781e(request, "request");
        GetTopicsRequest build = new GetTopicsRequest.Builder().setAdsSdkName(request.m7448a()).setShouldRecordObservation(request.m7449b()).build();
        C9322n.m27780d(build, "Builder()\n            .s…ion)\n            .build()");
        return build;
    }
}
