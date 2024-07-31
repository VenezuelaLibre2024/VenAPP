package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import androidx.core.os.OutcomeReceiverKt;
import gk.Continuation;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public class g extends d {

    /* renamed from: b */
    private final TopicsManager f5029b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {22}, m = "getTopics$suspendImpl")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f5030a;

        /* renamed from: b */
        /* synthetic */ Object f5031b;

        /* renamed from: d */
        int f5033d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5031b = obj;
            this.f5033d |= Integer.MIN_VALUE;
            return g.e(g.this, null, this);
        }
    }

    public g(TopicsManager mTopicsManager) {
        n.e(mTopicsManager, "mTopicsManager");
        this.f5029b = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object e(androidx.privacysandbox.ads.adservices.topics.g r4, androidx.privacysandbox.ads.adservices.topics.a r5, gk.Continuation<? super androidx.privacysandbox.ads.adservices.topics.b> r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.g.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.g$a r0 = (androidx.privacysandbox.ads.adservices.topics.g.a) r0
            int r1 = r0.f5033d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5033d = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.g$a r0 = new androidx.privacysandbox.ads.adservices.topics.g$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5031b
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.f5033d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f5030a
            androidx.privacysandbox.ads.adservices.topics.g r4 = (androidx.privacysandbox.ads.adservices.topics.g) r4
            ck.o.b(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            ck.o.b(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.c(r5)
            r0.f5030a = r4
            r0.f5033d = r3
            java.lang.Object r6 = r4.f(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            android.adservices.topics.GetTopicsResponse r6 = (android.adservices.topics.GetTopicsResponse) r6
            androidx.privacysandbox.ads.adservices.topics.b r4 = r4.d(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.g.e(androidx.privacysandbox.ads.adservices.topics.g, androidx.privacysandbox.ads.adservices.topics.a, gk.Continuation):java.lang.Object");
    }

    private final Object f(GetTopicsRequest getTopicsRequest, Continuation<? super GetTopicsResponse> continuation) {
        Continuation b10;
        Object c10;
        b10 = hk.c.b(continuation);
        zk.n nVar = new zk.n(b10, 1);
        nVar.z();
        this.f5029b.getTopics(getTopicsRequest, new p1.b(), OutcomeReceiverKt.asOutcomeReceiver(nVar));
        Object w10 = nVar.w();
        c10 = hk.d.c();
        if (w10 == c10) {
            h.c(continuation);
        }
        return w10;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.d
    public Object a(androidx.privacysandbox.ads.adservices.topics.a aVar, Continuation<? super b> continuation) {
        return e(this, aVar, continuation);
    }

    public GetTopicsRequest c(androidx.privacysandbox.ads.adservices.topics.a request) {
        n.e(request, "request");
        GetTopicsRequest build = new GetTopicsRequest.Builder().setAdsSdkName(request.a()).build();
        n.d(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    public final b d(GetTopicsResponse response) {
        n.e(response, "response");
        ArrayList arrayList = new ArrayList();
        for (Topic topic : response.getTopics()) {
            arrayList.add(new c(topic.getTaxonomyVersion(), topic.getModelVersion(), topic.getTopicId()));
        }
        return new b(arrayList);
    }
}
