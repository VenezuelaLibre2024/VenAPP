package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.EnumC2121g;
import com.bumptech.glide.load.data.InterfaceC2133d;
import java.io.FileNotFoundException;
import java.io.IOException;
import p129h3.EnumC7617a;

/* renamed from: com.bumptech.glide.load.data.l */
/* loaded from: classes.dex */
public abstract class AbstractC2141l<T> implements InterfaceC2133d<T> {

    /* renamed from: a */
    private final Uri f8438a;

    /* renamed from: b */
    private final ContentResolver f8439b;

    /* renamed from: c */
    private T f8440c;

    public AbstractC2141l(ContentResolver contentResolver, Uri uri) {
        this.f8439b = contentResolver;
        this.f8438a = uri;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    /* renamed from: b */
    public void mo10765b() {
        T t10 = this.f8440c;
        if (t10 != null) {
            try {
                mo10761c(t10);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    protected abstract void mo10761c(T t10);

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
    public final void mo10768e(EnumC2121g enumC2121g, InterfaceC2133d.a<? super T> aVar) {
        try {
            T mo10762f = mo10762f(this.f8438a, this.f8439b);
            this.f8440c = mo10762f;
            aVar.mo10774f(mo10762f);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.mo10773c(e10);
        }
    }

    /* renamed from: f */
    protected abstract T mo10762f(Uri uri, ContentResolver contentResolver);
}
