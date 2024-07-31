package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f7471a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentResolver f7472b;

    /* renamed from: c, reason: collision with root package name */
    private T f7473c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f7472b = contentResolver;
        this.f7471a = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t10 = this.f7473c;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void c(T t10);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public h3.a d() {
        return h3.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T f10 = f(this.f7471a, this.f7472b);
            this.f7473c = f10;
            aVar.f(f10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.c(e10);
        }
    }

    protected abstract T f(Uri uri, ContentResolver contentResolver);
}
