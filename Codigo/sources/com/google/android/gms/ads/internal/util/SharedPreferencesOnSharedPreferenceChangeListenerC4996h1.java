package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.C4965t;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.util.h1 */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC4996h1 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final String f10078a;

    /* renamed from: b */
    final /* synthetic */ C5000i1 f10079b;

    public SharedPreferencesOnSharedPreferenceChangeListenerC4996h1(C5000i1 c5000i1, String str) {
        this.f10079b = c5000i1;
        this.f10078a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<C4992g1> list;
        synchronized (this.f10079b) {
            list = this.f10079b.f10082b;
            for (C4992g1 c4992g1 : list) {
                String str2 = this.f10078a;
                Map map = c4992g1.f10073a;
                if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                    C4965t.m12580q().zzi().mo12760k(false);
                }
            }
        }
    }
}
