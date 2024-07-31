package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.AbstractServiceConnectionC4618f0;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: com.facebook.login.h0 */
/* loaded from: classes.dex */
public final class C4668h0 extends AbstractServiceConnectionC4618f0 {

    /* renamed from: y */
    public static final a f8920y = new a(null);

    /* renamed from: v */
    private final String f8921v;

    /* renamed from: w */
    private final String f8922w;

    /* renamed from: x */
    private final long f8923x;

    /* renamed from: com.facebook.login.h0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C4668h0 m11569a(Context context, String applicationId, String loggerRef, String graphApiVersion, long j10, String str) {
            C9322n.m27781e(context, "context");
            C9322n.m27781e(applicationId, "applicationId");
            C9322n.m27781e(loggerRef, "loggerRef");
            C9322n.m27781e(graphApiVersion, "graphApiVersion");
            return new C4668h0(context, applicationId, loggerRef, graphApiVersion, j10, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4668h0(Context context, String applicationId, String loggerRef, String graphApiVersion, long j10, String str) {
        super(context, 65546, 65547, 20170411, applicationId, str);
        C9322n.m27781e(context, "context");
        C9322n.m27781e(applicationId, "applicationId");
        C9322n.m27781e(loggerRef, "loggerRef");
        C9322n.m27781e(graphApiVersion, "graphApiVersion");
        this.f8921v = loggerRef;
        this.f8922w = graphApiVersion;
        this.f8923x = j10;
    }

    @Override // com.facebook.internal.AbstractServiceConnectionC4618f0
    /* renamed from: e */
    protected void mo11203e(Bundle data) {
        C9322n.m27781e(data, "data");
        data.putString("com.facebook.platform.extra.LOGGER_REF", this.f8921v);
        data.putString("com.facebook.platform.extra.GRAPH_API_VERSION", this.f8922w);
        data.putLong("com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS", this.f8923x);
    }
}
