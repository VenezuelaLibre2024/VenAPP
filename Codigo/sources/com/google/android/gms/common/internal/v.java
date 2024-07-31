package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f9657a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9658b;

    public v(Context context) {
        s.j(context);
        Resources resources = context.getResources();
        this.f9657a = resources;
        this.f9658b = resources.getResourcePackageName(ca.m.f6992a);
    }

    public String a(String str) {
        int identifier = this.f9657a.getIdentifier(str, "string", this.f9658b);
        if (identifier == 0) {
            return null;
        }
        return this.f9657a.getString(identifier);
    }
}
