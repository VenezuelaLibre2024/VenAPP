package de;

import android.graphics.Bitmap;
import android.text.TextUtils;

/* renamed from: de.g */
/* loaded from: classes.dex */
public class C6894g {

    /* renamed from: a */
    private final String f15281a;

    /* renamed from: b */
    private final Bitmap f15282b;

    /* renamed from: de.g$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private String f15283a;

        /* renamed from: b */
        private Bitmap f15284b;

        /* renamed from: a */
        public C6894g m19922a() {
            if (TextUtils.isEmpty(this.f15283a)) {
                throw new IllegalArgumentException("ImageData model must have an imageUrl");
            }
            return new C6894g(this.f15283a, this.f15284b);
        }

        /* renamed from: b */
        public a m19923b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f15283a = str;
            }
            return this;
        }
    }

    public C6894g(String str, Bitmap bitmap) {
        this.f15281a = str;
        this.f15282b = bitmap;
    }

    /* renamed from: a */
    public static a m19920a() {
        return new a();
    }

    /* renamed from: b */
    public String m19921b() {
        return this.f15281a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6894g)) {
            return false;
        }
        C6894g c6894g = (C6894g) obj;
        return hashCode() == c6894g.hashCode() && this.f15281a.equals(c6894g.f15281a);
    }

    public int hashCode() {
        Bitmap bitmap = this.f15282b;
        return this.f15281a.hashCode() + (bitmap != null ? bitmap.hashCode() : 0);
    }
}
