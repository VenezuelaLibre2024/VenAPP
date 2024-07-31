package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbgc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f8982a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f8983b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Context f8984c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i1(Context context) {
        this.f8984c = context;
    }

    final synchronized void b(String str) {
        if (this.f8982a.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f8984c) : this.f8984c.getSharedPreferences(str, 0);
        h1 h1Var = new h1(this, str);
        this.f8982a.put(str, h1Var);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(h1Var);
    }

    public final void c() {
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjU)).booleanValue()) {
            com.google.android.gms.ads.internal.t.r();
            Map W = j2.W((String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjY));
            Iterator it = W.keySet().iterator();
            while (it.hasNext()) {
                b((String) it.next());
            }
            d(new g1(W));
        }
    }

    final synchronized void d(g1 g1Var) {
        this.f8983b.add(g1Var);
    }
}
