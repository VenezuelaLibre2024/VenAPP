package com.google.firebase.installations;

import zb.m;

/* loaded from: classes.dex */
public class d extends m {

    /* renamed from: a, reason: collision with root package name */
    private final a f11989a;

    /* loaded from: classes.dex */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f11989a = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f11989a = aVar;
    }
}
