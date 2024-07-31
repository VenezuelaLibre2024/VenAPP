package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: b, reason: collision with root package name */
    public static final pc.c<?> f13064b = pc.c.c(n.class).b(pc.q.j(i.class)).b(pc.q.j(Context.class)).f(new pc.g() { // from class: com.google.mlkit.common.sdkinternal.f0
        @Override // pc.g
        public final Object a(pc.d dVar) {
            return new n((Context) dVar.get(Context.class));
        }
    }).d();

    /* renamed from: a, reason: collision with root package name */
    protected final Context f13065a;

    public n(Context context) {
        this.f13065a = context;
    }

    public synchronized String a() {
        String string = e().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        e().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    public synchronized long b(tf.b bVar) {
        return e().getLong(String.format("downloading_begin_time_%s", bVar.d()), 0L);
    }

    public synchronized long c(tf.b bVar) {
        return e().getLong(String.format("model_first_use_time_%s", bVar.d()), 0L);
    }

    public synchronized void d(tf.b bVar, long j10) {
        e().edit().putLong(String.format("model_first_use_time_%s", bVar.d()), j10).apply();
    }

    protected final SharedPreferences e() {
        return this.f13065a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
