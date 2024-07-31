package com.mr.flutter.plugin.filepicker;

import android.net.Uri;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;

/* renamed from: com.mr.flutter.plugin.filepicker.a */
/* loaded from: classes3.dex */
public class C6664a {

    /* renamed from: a */
    final String f14810a;

    /* renamed from: b */
    final String f14811b;

    /* renamed from: c */
    final Uri f14812c;

    /* renamed from: d */
    final long f14813d;

    /* renamed from: e */
    final byte[] f14814e;

    /* renamed from: com.mr.flutter.plugin.filepicker.a$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private String f14815a;

        /* renamed from: b */
        private String f14816b;

        /* renamed from: c */
        private Uri f14817c;

        /* renamed from: d */
        private long f14818d;

        /* renamed from: e */
        private byte[] f14819e;

        /* renamed from: a */
        public C6664a m19500a() {
            return new C6664a(this.f14815a, this.f14816b, this.f14817c, this.f14818d, this.f14819e);
        }

        /* renamed from: b */
        public a m19501b(byte[] bArr) {
            this.f14819e = bArr;
            return this;
        }

        /* renamed from: c */
        public a m19502c(String str) {
            this.f14816b = str;
            return this;
        }

        /* renamed from: d */
        public a m19503d(String str) {
            this.f14815a = str;
            return this;
        }

        /* renamed from: e */
        public a m19504e(long j10) {
            this.f14818d = j10;
            return this;
        }

        /* renamed from: f */
        public a m19505f(Uri uri) {
            this.f14817c = uri;
            return this;
        }
    }

    public C6664a(String str, String str2, Uri uri, long j10, byte[] bArr) {
        this.f14810a = str;
        this.f14811b = str2;
        this.f14813d = j10;
        this.f14814e = bArr;
        this.f14812c = uri;
    }

    /* renamed from: a */
    public HashMap<String, Object> m19499a() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("path", this.f14810a);
        hashMap.put("name", this.f14811b);
        hashMap.put("size", Long.valueOf(this.f14813d));
        hashMap.put("bytes", this.f14814e);
        hashMap.put(Constants.IDENTIFIER, this.f14812c.toString());
        return hashMap;
    }
}
