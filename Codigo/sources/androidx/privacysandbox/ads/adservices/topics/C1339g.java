package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import androidx.core.os.OutcomeReceiverKt;
import hk.C7751c;
import hk.C7752d;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.C9302h;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9322n;
import p124gk.Continuation;
import p284p1.ExecutorC10035b;
import p494zk.C13087n;

/* renamed from: androidx.privacysandbox.ads.adservices.topics.g */
/* loaded from: classes.dex */
public class C1339g extends AbstractC1336d {

    /* renamed from: b */
    private final TopicsManager f5783b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", m27743f = "TopicsManagerImplCommon.kt", m27744l = {22}, m27745m = "getTopics$suspendImpl")
    /* renamed from: androidx.privacysandbox.ads.adservices.topics.g$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC9298d {

        /* renamed from: a */
        Object f5784a;

        /* renamed from: b */
        /* synthetic */ Object f5785b;

        /* renamed from: d */
        int f5787d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f5785b = obj;
            this.f5787d |= Integer.MIN_VALUE;
            return C1339g.m7461e(C1339g.this, null, this);
        }
    }

    public C1339g(TopicsManager mTopicsManager) {
        C9322n.m27781e(mTopicsManager, "mTopicsManager");
        this.f5783b = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object m7461e(androidx.privacysandbox.ads.adservices.topics.C1339g r4, androidx.privacysandbox.ads.adservices.topics.C1333a r5, p124gk.Continuation<? super androidx.privacysandbox.ads.adservices.topics.C1334b> r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.C1339g.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.g$a r0 = (androidx.privacysandbox.ads.adservices.topics.C1339g.a) r0
            int r1 = r0.f5787d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5787d = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.g$a r0 = new androidx.privacysandbox.ads.adservices.topics.g$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5785b
            java.lang.Object r1 = hk.C7750b.m23652c()
            int r2 = r0.f5787d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f5784a
            androidx.privacysandbox.ads.adservices.topics.g r4 = (androidx.privacysandbox.ads.adservices.topics.C1339g) r4
            ck.C2030o.m10349b(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            ck.C2030o.m10349b(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.mo7459c(r5)
            r0.f5784a = r4
            r0.f5787d = r3
            java.lang.Object r6 = r4.m7462f(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            android.adservices.topics.GetTopicsResponse r6 = (android.adservices.topics.GetTopicsResponse) r6
            androidx.privacysandbox.ads.adservices.topics.b r4 = r4.m7463d(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.C1339g.m7461e(androidx.privacysandbox.ads.adservices.topics.g, androidx.privacysandbox.ads.adservices.topics.a, gk.Continuation):java.lang.Object");
    }

    /* renamed from: f */
    private final Object m7462f(GetTopicsRequest getTopicsRequest, Continuation<? super GetTopicsResponse> continuation) {
        Continuation m23654b;
        Object m23655c;
        m23654b = C7751c.m23654b(continuation);
        C13087n c13087n = new C13087n(m23654b, 1);
        c13087n.m43269z();
        this.f5783b.getTopics(getTopicsRequest, new ExecutorC10035b(), OutcomeReceiverKt.asOutcomeReceiver(c13087n));
        Object m43267w = c13087n.m43267w();
        m23655c = C7752d.m23655c();
        if (m43267w == m23655c) {
            C9302h.m27753c(continuation);
        }
        return m43267w;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.AbstractC1336d
    /* renamed from: a */
    public Object mo7457a(C1333a c1333a, Continuation<? super C1334b> continuation) {
        return m7461e(this, c1333a, continuation);
    }

    /* renamed from: c */
    public GetTopicsRequest mo7459c(C1333a request) {
        C9322n.m27781e(request, "request");
        GetTopicsRequest build = new GetTopicsRequest.Builder().setAdsSdkName(request.m7448a()).build();
        C9322n.m27780d(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    /* renamed from: d */
    public final C1334b m7463d(GetTopicsResponse response) {
        C9322n.m27781e(response, "response");
        ArrayList arrayList = new ArrayList();
        for (Topic topic : response.getTopics()) {
            arrayList.add(new C1335c(topic.getTaxonomyVersion(), topic.getModelVersion(), topic.getTopicId()));
        }
        return new C1334b(arrayList);
    }
}
