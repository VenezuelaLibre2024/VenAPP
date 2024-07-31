package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h1 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final String f8979a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i1 f8980b;

    public h1(i1 i1Var, String str) {
        this.f8980b = i1Var;
        this.f8979a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<g1> list;
        synchronized (this.f8980b) {
            list = this.f8980b.f8983b;
            for (g1 g1Var : list) {
                String str2 = this.f8979a;
                Map map = g1Var.f8974a;
                if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                    com.google.android.gms.ads.internal.t.q().zzi().k(false);
                }
            }
        }
    }
}
