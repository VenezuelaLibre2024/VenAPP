package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import ca.C1916m;

/* renamed from: com.google.android.gms.common.internal.v */
/* loaded from: classes.dex */
public class C5285v {

    /* renamed from: a */
    private final Resources f10772a;

    /* renamed from: b */
    private final String f10773b;

    public C5285v(Context context) {
        C5276s.m13324j(context);
        Resources resources = context.getResources();
        this.f10772a = resources;
        this.f10773b = resources.getResourcePackageName(C1916m.f7941a);
    }

    /* renamed from: a */
    public String m13351a(String str) {
        int identifier = this.f10772a.getIdentifier(str, "string", this.f10773b);
        if (identifier == 0) {
            return null;
        }
        return this.f10772a.getString(identifier);
    }
}
