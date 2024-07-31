package com.auth0.android.jwt;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: com.auth0.android.jwt.d */
/* loaded from: classes.dex */
class C2098d {

    /* renamed from: a */
    final String f8234a;

    /* renamed from: b */
    final String f8235b;

    /* renamed from: c */
    final Date f8236c;

    /* renamed from: d */
    final Date f8237d;

    /* renamed from: e */
    final Date f8238e;

    /* renamed from: f */
    final String f8239f;

    /* renamed from: g */
    final List<String> f8240g;

    /* renamed from: h */
    final Map<String, Object> f8241h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2098d(String str, String str2, Date date, Date date2, Date date3, String str3, List<String> list, Map<String, Object> map) {
        this.f8234a = str;
        this.f8235b = str2;
        this.f8236c = date;
        this.f8237d = date2;
        this.f8238e = date3;
        this.f8239f = str3;
        this.f8240g = list;
        this.f8241h = Collections.unmodifiableMap(map);
    }
}
