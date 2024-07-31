package com.mr.flutter.plugin.filepicker;

import android.net.Uri;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    final String f13518a;

    /* renamed from: b, reason: collision with root package name */
    final String f13519b;

    /* renamed from: c, reason: collision with root package name */
    final Uri f13520c;

    /* renamed from: d, reason: collision with root package name */
    final long f13521d;

    /* renamed from: e, reason: collision with root package name */
    final byte[] f13522e;

    /* renamed from: com.mr.flutter.plugin.filepicker.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0194a {

        /* renamed from: a, reason: collision with root package name */
        private String f13523a;

        /* renamed from: b, reason: collision with root package name */
        private String f13524b;

        /* renamed from: c, reason: collision with root package name */
        private Uri f13525c;

        /* renamed from: d, reason: collision with root package name */
        private long f13526d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f13527e;

        public a a() {
            return new a(this.f13523a, this.f13524b, this.f13525c, this.f13526d, this.f13527e);
        }

        public C0194a b(byte[] bArr) {
            this.f13527e = bArr;
            return this;
        }

        public C0194a c(String str) {
            this.f13524b = str;
            return this;
        }

        public C0194a d(String str) {
            this.f13523a = str;
            return this;
        }

        public C0194a e(long j10) {
            this.f13526d = j10;
            return this;
        }

        public C0194a f(Uri uri) {
            this.f13525c = uri;
            return this;
        }
    }

    public a(String str, String str2, Uri uri, long j10, byte[] bArr) {
        this.f13518a = str;
        this.f13519b = str2;
        this.f13521d = j10;
        this.f13522e = bArr;
        this.f13520c = uri;
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("path", this.f13518a);
        hashMap.put("name", this.f13519b);
        hashMap.put("size", Long.valueOf(this.f13521d));
        hashMap.put("bytes", this.f13522e);
        hashMap.put(Constants.IDENTIFIER, this.f13520c.toString());
        return hashMap;
    }
}
