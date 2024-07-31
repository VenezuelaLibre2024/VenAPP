package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import p294pc.C10132c;
import p294pc.C10150q;
import p294pc.InterfaceC10134d;
import p294pc.InterfaceC10140g;
import tf.AbstractC11253b;

/* renamed from: com.google.mlkit.common.sdkinternal.n */
/* loaded from: classes2.dex */
public class C6532n {

    /* renamed from: b */
    public static final C10132c<?> f14338b = C10132c.m30257c(C6532n.class).m30279b(C10150q.m30353j(C6524i.class)).m30279b(C10150q.m30353j(Context.class)).m30283f(new InterfaceC10140g() { // from class: com.google.mlkit.common.sdkinternal.f0
        @Override // p294pc.InterfaceC10140g
        /* renamed from: a */
        public final Object mo9329a(InterfaceC10134d interfaceC10134d) {
            return new C6532n((Context) interfaceC10134d.get(Context.class));
        }
    }).m30281d();

    /* renamed from: a */
    protected final Context f14339a;

    public C6532n(Context context) {
        this.f14339a = context;
    }

    /* renamed from: a */
    public synchronized String m18334a() {
        String string = m18338e().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        m18338e().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    /* renamed from: b */
    public synchronized long m18335b(AbstractC11253b abstractC11253b) {
        return m18338e().getLong(String.format("downloading_begin_time_%s", abstractC11253b.m35166d()), 0L);
    }

    /* renamed from: c */
    public synchronized long m18336c(AbstractC11253b abstractC11253b) {
        return m18338e().getLong(String.format("model_first_use_time_%s", abstractC11253b.m35166d()), 0L);
    }

    /* renamed from: d */
    public synchronized void m18337d(AbstractC11253b abstractC11253b, long j10) {
        m18338e().edit().putLong(String.format("model_first_use_time_%s", abstractC11253b.m35166d()), j10).apply();
    }

    /* renamed from: e */
    protected final SharedPreferences m18338e() {
        return this.f14339a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
