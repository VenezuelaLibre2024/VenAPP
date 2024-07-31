package com.facebook.login;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class h0 extends com.facebook.internal.f0 {

    /* renamed from: y, reason: collision with root package name */
    public static final a f7940y = new a(null);

    /* renamed from: v, reason: collision with root package name */
    private final String f7941v;

    /* renamed from: w, reason: collision with root package name */
    private final String f7942w;

    /* renamed from: x, reason: collision with root package name */
    private final long f7943x;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final h0 a(Context context, String applicationId, String loggerRef, String graphApiVersion, long j10, String str) {
            kotlin.jvm.internal.n.e(context, "context");
            kotlin.jvm.internal.n.e(applicationId, "applicationId");
            kotlin.jvm.internal.n.e(loggerRef, "loggerRef");
            kotlin.jvm.internal.n.e(graphApiVersion, "graphApiVersion");
            return new h0(context, applicationId, loggerRef, graphApiVersion, j10, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, String applicationId, String loggerRef, String graphApiVersion, long j10, String str) {
        super(context, 65546, 65547, 20170411, applicationId, str);
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(applicationId, "applicationId");
        kotlin.jvm.internal.n.e(loggerRef, "loggerRef");
        kotlin.jvm.internal.n.e(graphApiVersion, "graphApiVersion");
        this.f7941v = loggerRef;
        this.f7942w = graphApiVersion;
        this.f7943x = j10;
    }

    @Override // com.facebook.internal.f0
    protected void e(Bundle data) {
        kotlin.jvm.internal.n.e(data, "data");
        data.putString("com.facebook.platform.extra.LOGGER_REF", this.f7941v);
        data.putString("com.facebook.platform.extra.GRAPH_API_VERSION", this.f7942w);
        data.putLong("com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS", this.f7943x);
    }
}
