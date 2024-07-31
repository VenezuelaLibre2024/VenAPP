package com.auth0.android.jwt;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    final String f7282a;

    /* renamed from: b, reason: collision with root package name */
    final String f7283b;

    /* renamed from: c, reason: collision with root package name */
    final Date f7284c;

    /* renamed from: d, reason: collision with root package name */
    final Date f7285d;

    /* renamed from: e, reason: collision with root package name */
    final Date f7286e;

    /* renamed from: f, reason: collision with root package name */
    final String f7287f;

    /* renamed from: g, reason: collision with root package name */
    final List<String> f7288g;

    /* renamed from: h, reason: collision with root package name */
    final Map<String, Object> f7289h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str, String str2, Date date, Date date2, Date date3, String str3, List<String> list, Map<String, Object> map) {
        this.f7282a = str;
        this.f7283b = str2;
        this.f7284c = date;
        this.f7285d = date2;
        this.f7286e = date3;
        this.f7287f = str3;
        this.f7288g = list;
        this.f7289h = Collections.unmodifiableMap(map);
    }
}
