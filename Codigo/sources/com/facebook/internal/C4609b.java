package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.appevents.C4578h0;
import java.util.Set;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p191k1.C9109a;
import p450xk.C12514f;

/* renamed from: com.facebook.internal.b */
/* loaded from: classes.dex */
public final class C4609b extends BroadcastReceiver {

    /* renamed from: c */
    private static C4609b f8687c;

    /* renamed from: a */
    private final Context f8689a;

    /* renamed from: b */
    public static final a f8686b = new a(null);

    /* renamed from: d */
    private static final String f8688d = "com.parse.bolts.measurement_event";

    /* renamed from: com.facebook.internal.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C4609b m11124a(Context context) {
            C9322n.m27781e(context, "context");
            if (C4609b.m11119a() != null) {
                return C4609b.m11119a();
            }
            C4609b c4609b = new C4609b(context, null);
            C4609b.m11120b(c4609b);
            C4609b.m11121c(c4609b);
            return C4609b.m11119a();
        }
    }

    private C4609b(Context context) {
        Context applicationContext = context.getApplicationContext();
        C9322n.m27780d(applicationContext, "context.applicationContext");
        this.f8689a = applicationContext;
    }

    public /* synthetic */ C4609b(Context context, C9315g c9315g) {
        this(context);
    }

    /* renamed from: a */
    public static final /* synthetic */ C4609b m11119a() {
        if (C0033a.m107d(C4609b.class)) {
            return null;
        }
        try {
            return f8687c;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4609b.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m11120b(C4609b c4609b) {
        if (C0033a.m107d(C4609b.class)) {
            return;
        }
        try {
            c4609b.m11123e();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4609b.class);
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m11121c(C4609b c4609b) {
        if (C0033a.m107d(C4609b.class)) {
            return;
        }
        try {
            f8687c = c4609b;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4609b.class);
        }
    }

    /* renamed from: d */
    private final void m11122d() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C9109a m26825b = C9109a.m26825b(this.f8689a);
            C9322n.m27780d(m26825b, "getInstance(applicationContext)");
            m26825b.m26829e(this);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: e */
    private final void m11123e() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C9109a m26825b = C9109a.m26825b(this.f8689a);
            C9322n.m27780d(m26825b, "getInstance(applicationContext)");
            m26825b.m26827c(this, new IntentFilter(f8688d));
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    public final void finalize() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            m11122d();
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C4578h0 c4578h0 = new C4578h0(context);
            Set<String> set = null;
            String m27787k = C9322n.m27787k("bf_", intent == null ? null : intent.getStringExtra("event_name"));
            Bundle bundleExtra = intent == null ? null : intent.getBundleExtra("event_args");
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                set = bundleExtra.keySet();
            }
            if (set != null) {
                for (String key : set) {
                    C9322n.m27780d(key, "key");
                    bundle.putString(new C12514f("[ -]*$").m40970b(new C12514f("^[ -]*").m40970b(new C12514f("[^0-9a-zA-Z _-]").m40970b(key, "-"), ""), ""), (String) bundleExtra.get(key));
                }
            }
            c4578h0.m10996d(m27787k, bundle);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }
}
