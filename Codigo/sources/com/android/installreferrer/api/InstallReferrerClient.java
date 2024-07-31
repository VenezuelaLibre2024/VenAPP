package com.android.installreferrer.api;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class InstallReferrerClient {

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final Context f7200a;

        private b(Context context) {
            this.f7200a = context;
        }

        /* synthetic */ b(Context context, a aVar) {
            this(context);
        }

        public InstallReferrerClient a() {
            Context context = this.f7200a;
            if (context != null) {
                return new com.android.installreferrer.api.a(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    public static b c(Context context) {
        return new b(context);
    }

    public abstract void a();

    public abstract ReferrerDetails b();

    public abstract void d(InstallReferrerStateListener installReferrerStateListener);
}
