package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    private static b f7712c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f7714a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f7711b = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final String f7713d = "com.parse.bolts.measurement_event";

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final b a(Context context) {
            kotlin.jvm.internal.n.e(context, "context");
            if (b.a() != null) {
                return b.a();
            }
            b bVar = new b(context, null);
            b.b(bVar);
            b.c(bVar);
            return b.a();
        }
    }

    private b(Context context) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.d(applicationContext, "context.applicationContext");
        this.f7714a = applicationContext;
    }

    public /* synthetic */ b(Context context, kotlin.jvm.internal.g gVar) {
        this(context);
    }

    public static final /* synthetic */ b a() {
        if (a5.a.d(b.class)) {
            return null;
        }
        try {
            return f7712c;
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(b bVar) {
        if (a5.a.d(b.class)) {
            return;
        }
        try {
            bVar.e();
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
        }
    }

    public static final /* synthetic */ void c(b bVar) {
        if (a5.a.d(b.class)) {
            return;
        }
        try {
            f7712c = bVar;
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
        }
    }

    private final void d() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            k1.a b10 = k1.a.b(this.f7714a);
            kotlin.jvm.internal.n.d(b10, "getInstance(applicationContext)");
            b10.e(this);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    private final void e() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            k1.a b10 = k1.a.b(this.f7714a);
            kotlin.jvm.internal.n.d(b10, "getInstance(applicationContext)");
            b10.c(this, new IntentFilter(f7713d));
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void finalize() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            d();
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            com.facebook.appevents.h0 h0Var = new com.facebook.appevents.h0(context);
            Set<String> set = null;
            String k10 = kotlin.jvm.internal.n.k("bf_", intent == null ? null : intent.getStringExtra("event_name"));
            Bundle bundleExtra = intent == null ? null : intent.getBundleExtra("event_args");
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                set = bundleExtra.keySet();
            }
            if (set != null) {
                for (String key : set) {
                    kotlin.jvm.internal.n.d(key, "key");
                    bundle.putString(new xk.f("[ -]*$").b(new xk.f("^[ -]*").b(new xk.f("[^0-9a-zA-Z _-]").b(key, "-"), ""), ""), (String) bundleExtra.get(key));
                }
            }
            h0Var.d(k10, bundle);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }
}
