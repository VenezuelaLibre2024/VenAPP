package com.google.firebase.perf.util;

import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final URL f12383a;

    public n(URL url) {
        this.f12383a = url;
    }

    public URLConnection a() {
        return this.f12383a.openConnection();
    }

    public String toString() {
        return this.f12383a.toString();
    }
}
