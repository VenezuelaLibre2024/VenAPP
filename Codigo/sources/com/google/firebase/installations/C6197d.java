package com.google.firebase.installations;

import p485zb.C12873m;

/* renamed from: com.google.firebase.installations.d */
/* loaded from: classes.dex */
public class C6197d extends C12873m {

    /* renamed from: a */
    private final a f13204a;

    /* renamed from: com.google.firebase.installations.d$a */
    /* loaded from: classes.dex */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public C6197d(a aVar) {
        this.f13204a = aVar;
    }

    public C6197d(String str, a aVar) {
        super(str);
        this.f13204a = aVar;
    }
}
