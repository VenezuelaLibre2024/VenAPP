package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.m */
/* loaded from: classes.dex */
public class C2142m extends AbstractC2131b<InputStream> {
    public C2142m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    /* renamed from: a */
    public Class<InputStream> mo10760a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC2131b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo10766c(InputStream inputStream) {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC2131b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo10769f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
