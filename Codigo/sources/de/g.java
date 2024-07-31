package de;

import android.graphics.Bitmap;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f13927a;

    /* renamed from: b, reason: collision with root package name */
    private final Bitmap f13928b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f13929a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f13930b;

        public g a() {
            if (TextUtils.isEmpty(this.f13929a)) {
                throw new IllegalArgumentException("ImageData model must have an imageUrl");
            }
            return new g(this.f13929a, this.f13930b);
        }

        public a b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f13929a = str;
            }
            return this;
        }
    }

    public g(String str, Bitmap bitmap) {
        this.f13927a = str;
        this.f13928b = bitmap;
    }

    public static a a() {
        return new a();
    }

    public String b() {
        return this.f13927a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return hashCode() == gVar.hashCode() && this.f13927a.equals(gVar.f13927a);
    }

    public int hashCode() {
        Bitmap bitmap = this.f13928b;
        return this.f13927a.hashCode() + (bitmap != null ? bitmap.hashCode() : 0);
    }
}
