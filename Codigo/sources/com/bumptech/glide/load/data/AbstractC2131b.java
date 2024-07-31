package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.EnumC2121g;
import com.bumptech.glide.load.data.InterfaceC2133d;
import java.io.IOException;
import p129h3.EnumC7617a;

/* renamed from: com.bumptech.glide.load.data.b */
/* loaded from: classes.dex */
public abstract class AbstractC2131b<T> implements InterfaceC2133d<T> {

    /* renamed from: a */
    private final String f8414a;

    /* renamed from: b */
    private final AssetManager f8415b;

    /* renamed from: c */
    private T f8416c;

    public AbstractC2131b(AssetManager assetManager, String str) {
        this.f8415b = assetManager;
        this.f8414a = str;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    /* renamed from: b */
    public void mo10765b() {
        T t10 = this.f8416c;
        if (t10 == null) {
            return;
        }
        try {
            mo10766c(t10);
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    protected abstract void mo10766c(T t10);

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    /* renamed from: d */
    public EnumC7617a mo10767d() {
        return EnumC7617a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    /* renamed from: e */
    public void mo10768e(EnumC2121g enumC2121g, InterfaceC2133d.a<? super T> aVar) {
        try {
            T mo10769f = mo10769f(this.f8415b, this.f8414a);
            this.f8416c = mo10769f;
            aVar.mo10774f(mo10769f);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.mo10773c(e10);
        }
    }

    /* renamed from: f */
    protected abstract T mo10769f(AssetManager assetManager, String str);
}
