package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.source.rtsp.u;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import t6.b3;
import t8.r0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f8353a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8354b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8355c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8356d;

    public i(int i10, String str, String str2, String str3) {
        this.f8353a = i10;
        this.f8354b = str;
        this.f8355c = str2;
        this.f8356d = str3;
    }

    private String b(u.a aVar) {
        String str = aVar.f8451a;
        String str2 = aVar.f8452b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return Base64.encodeToString(u.c(sb2.toString()), 0);
    }

    private String c(u.a aVar, Uri uri, int i10) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String s10 = u.s(i10);
            String str = aVar.f8451a;
            String str2 = this.f8354b;
            String str3 = aVar.f8452b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb2.append(str);
            sb2.append(":");
            sb2.append(str2);
            sb2.append(":");
            sb2.append(str3);
            String W0 = r0.W0(messageDigest.digest(u.c(sb2.toString())));
            String valueOf = String.valueOf(uri);
            StringBuilder sb3 = new StringBuilder(String.valueOf(s10).length() + 1 + valueOf.length());
            sb3.append(s10);
            sb3.append(":");
            sb3.append(valueOf);
            String W02 = r0.W0(messageDigest.digest(u.c(sb3.toString())));
            String str4 = this.f8355c;
            StringBuilder sb4 = new StringBuilder(String.valueOf(W0).length() + 2 + String.valueOf(str4).length() + String.valueOf(W02).length());
            sb4.append(W0);
            sb4.append(":");
            sb4.append(str4);
            sb4.append(":");
            sb4.append(W02);
            String W03 = r0.W0(messageDigest.digest(u.c(sb4.toString())));
            return this.f8356d.isEmpty() ? r0.C("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", aVar.f8451a, this.f8354b, this.f8355c, uri, W03) : r0.C("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", aVar.f8451a, this.f8354b, this.f8355c, uri, W03, this.f8356d);
        } catch (NoSuchAlgorithmException e10) {
            throw b3.d(null, e10);
        }
    }

    public String a(u.a aVar, Uri uri, int i10) {
        int i11 = this.f8353a;
        if (i11 == 1) {
            return b(aVar);
        }
        if (i11 == 2) {
            return c(aVar, uri, i10);
        }
        throw b3.d(null, new UnsupportedOperationException());
    }
}
