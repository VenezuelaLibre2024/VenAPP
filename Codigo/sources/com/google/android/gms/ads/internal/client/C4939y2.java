package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.client.y2 */
/* loaded from: classes.dex */
public final class C4939y2 {

    /* renamed from: g */
    private String f9892g;

    /* renamed from: i */
    private String f9894i;

    /* renamed from: j */
    private String f9895j;

    /* renamed from: l */
    private boolean f9897l;

    /* renamed from: m */
    private String f9898m;

    /* renamed from: a */
    private final HashSet f9886a = new HashSet();

    /* renamed from: b */
    private final Bundle f9887b = new Bundle();

    /* renamed from: c */
    private final HashMap f9888c = new HashMap();

    /* renamed from: d */
    private final HashSet f9889d = new HashSet();

    /* renamed from: e */
    private final Bundle f9890e = new Bundle();

    /* renamed from: f */
    private final HashSet f9891f = new HashSet();

    /* renamed from: h */
    private final List f9893h = new ArrayList();

    /* renamed from: k */
    private int f9896k = -1;

    /* renamed from: n */
    private int f9899n = 60000;

    /* renamed from: a */
    public final void m12497a(String str) {
        this.f9894i = str;
    }

    /* renamed from: b */
    public final void m12498b(String str) {
        this.f9895j = str;
    }

    @Deprecated
    /* renamed from: c */
    public final void m12499c(boolean z10) {
        this.f9896k = z10 ? 1 : 0;
    }

    /* renamed from: r */
    public final void m12500r(String str, String str2) {
        this.f9890e.putString(str, str2);
    }

    /* renamed from: s */
    public final void m12501s(String str) {
        this.f9886a.add(str);
    }

    /* renamed from: t */
    public final void m12502t(Class cls, Bundle bundle) {
        this.f9887b.putBundle(cls.getName(), bundle);
    }

    /* renamed from: u */
    public final void m12503u(String str) {
        this.f9889d.add(str);
    }

    /* renamed from: v */
    public final void m12504v(String str) {
        this.f9889d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    /* renamed from: w */
    public final void m12505w(String str) {
        this.f9892g = str;
    }

    /* renamed from: x */
    public final void m12506x(int i10) {
        this.f9899n = i10;
    }

    @Deprecated
    /* renamed from: y */
    public final void m12507y(boolean z10) {
        this.f9897l = z10;
    }

    /* renamed from: z */
    public final void m12508z(List list) {
        this.f9893h.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                zzcec.zzj("neighboring content URL should not be null or empty");
            } else {
                this.f9893h.add(str);
            }
        }
    }
}
