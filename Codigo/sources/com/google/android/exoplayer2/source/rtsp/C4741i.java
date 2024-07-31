package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.source.rtsp.C4753u;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p361t6.C11005b3;
import p363t8.C11172r0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.source.rtsp.i */
/* loaded from: classes.dex */
public final class C4741i {

    /* renamed from: a */
    public final int f9397a;

    /* renamed from: b */
    public final String f9398b;

    /* renamed from: c */
    public final String f9399c;

    /* renamed from: d */
    public final String f9400d;

    public C4741i(int i10, String str, String str2, String str3) {
        this.f9397a = i10;
        this.f9398b = str;
        this.f9399c = str2;
        this.f9400d = str3;
    }

    /* renamed from: b */
    private String m12055b(C4753u.a aVar) {
        String str = aVar.f9506a;
        String str2 = aVar.f9507b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return Base64.encodeToString(C4753u.m12231c(sb2.toString()), 0);
    }

    /* renamed from: c */
    private String m12056c(C4753u.a aVar, Uri uri, int i10) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String m12247s = C4753u.m12247s(i10);
            String str = aVar.f9506a;
            String str2 = this.f9398b;
            String str3 = aVar.f9507b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb2.append(str);
            sb2.append(":");
            sb2.append(str2);
            sb2.append(":");
            sb2.append(str3);
            String m34901W0 = C11172r0.m34901W0(messageDigest.digest(C4753u.m12231c(sb2.toString())));
            String valueOf = String.valueOf(uri);
            StringBuilder sb3 = new StringBuilder(String.valueOf(m12247s).length() + 1 + valueOf.length());
            sb3.append(m12247s);
            sb3.append(":");
            sb3.append(valueOf);
            String m34901W02 = C11172r0.m34901W0(messageDigest.digest(C4753u.m12231c(sb3.toString())));
            String str4 = this.f9399c;
            StringBuilder sb4 = new StringBuilder(String.valueOf(m34901W0).length() + 2 + String.valueOf(str4).length() + String.valueOf(m34901W02).length());
            sb4.append(m34901W0);
            sb4.append(":");
            sb4.append(str4);
            sb4.append(":");
            sb4.append(m34901W02);
            String m34901W03 = C11172r0.m34901W0(messageDigest.digest(C4753u.m12231c(sb4.toString())));
            return this.f9400d.isEmpty() ? C11172r0.m34860C("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", aVar.f9506a, this.f9398b, this.f9399c, uri, m34901W03) : C11172r0.m34860C("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", aVar.f9506a, this.f9398b, this.f9399c, uri, m34901W03, this.f9400d);
        } catch (NoSuchAlgorithmException e10) {
            throw C11005b3.m33718d(null, e10);
        }
    }

    /* renamed from: a */
    public String m12057a(C4753u.a aVar, Uri uri, int i10) {
        int i11 = this.f9397a;
        if (i11 == 1) {
            return m12055b(aVar);
        }
        if (i11 == 2) {
            return m12056c(aVar, uri, i10);
        }
        throw C11005b3.m33718d(null, new UnsupportedOperationException());
    }
}
