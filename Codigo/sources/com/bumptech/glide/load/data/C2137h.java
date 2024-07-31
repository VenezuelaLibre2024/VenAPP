package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

/* renamed from: com.bumptech.glide.load.data.h */
/* loaded from: classes.dex */
public class C2137h extends AbstractC2131b<AssetFileDescriptor> {
    public C2137h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    /* renamed from: a */
    public Class<AssetFileDescriptor> mo10760a() {
        return AssetFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC2131b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo10766c(AssetFileDescriptor assetFileDescriptor) {
        assetFileDescriptor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC2131b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo10769f(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }
}
