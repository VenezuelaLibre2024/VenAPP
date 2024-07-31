package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.internal.ads.zzbgc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.ads.internal.util.i1 */
/* loaded from: classes.dex */
public final class C5000i1 {

    /* renamed from: a */
    private final Map f10081a = new HashMap();

    /* renamed from: b */
    private final List f10082b = new ArrayList();

    /* renamed from: c */
    private final Context f10083c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5000i1(Context context) {
        this.f10083c = context;
    }

    /* renamed from: b */
    final synchronized void m12638b(String str) {
        if (this.f10081a.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f10083c) : this.f10083c.getSharedPreferences(str, 0);
        SharedPreferencesOnSharedPreferenceChangeListenerC4996h1 sharedPreferencesOnSharedPreferenceChangeListenerC4996h1 = new SharedPreferencesOnSharedPreferenceChangeListenerC4996h1(this, str);
        this.f10081a.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC4996h1);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC4996h1);
    }

    /* renamed from: c */
    public final void m12639c() {
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzjU)).booleanValue()) {
            C4965t.m12581r();
            Map m12656W = C5005j2.m12656W((String) C4784a0.m12365c().zza(zzbgc.zzjY));
            Iterator it = m12656W.keySet().iterator();
            while (it.hasNext()) {
                m12638b((String) it.next());
            }
            m12640d(new C4992g1(m12656W));
        }
    }

    /* renamed from: d */
    final synchronized void m12640d(C4992g1 c4992g1) {
        this.f10082b.add(c4992g1);
    }
}
