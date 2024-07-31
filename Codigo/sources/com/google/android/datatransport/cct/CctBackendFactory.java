package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import i6.h;
import i6.m;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements i6.d {
    @Override // i6.d
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
