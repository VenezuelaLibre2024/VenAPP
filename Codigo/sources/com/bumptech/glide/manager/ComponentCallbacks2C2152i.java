package com.bumptech.glide.manager;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: com.bumptech.glide.manager.i */
/* loaded from: classes.dex */
final class ComponentCallbacks2C2152i implements InterfaceC2154k, ComponentCallbacks2 {
    @Override // com.bumptech.glide.manager.InterfaceC2154k
    /* renamed from: a */
    public void mo10805a(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(20);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
    }
}
