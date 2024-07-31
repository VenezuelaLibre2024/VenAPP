package com.google.firebase.perf.util;

import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.google.firebase.perf.util.n */
/* loaded from: classes.dex */
public class C6340n {

    /* renamed from: a */
    private final URL f13615a;

    public C6340n(URL url) {
        this.f13615a = url;
    }

    /* renamed from: a */
    public URLConnection m17539a() {
        return this.f13615a.openConnection();
    }

    public String toString() {
        return this.f13615a.toString();
    }
}
