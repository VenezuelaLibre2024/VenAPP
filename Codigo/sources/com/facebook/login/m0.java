package com.facebook.login;

import android.os.Bundle;
import android.util.Base64;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f7971a = new m0();

    private m0() {
    }

    public static final i4.i0 a(String authorizationCode, String redirectUri, String codeVerifier) {
        kotlin.jvm.internal.n.e(authorizationCode, "authorizationCode");
        kotlin.jvm.internal.n.e(redirectUri, "redirectUri");
        kotlin.jvm.internal.n.e(codeVerifier, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", authorizationCode);
        bundle.putString("client_id", i4.e0.m());
        bundle.putString("redirect_uri", redirectUri);
        bundle.putString("code_verifier", codeVerifier);
        i4.i0 x10 = i4.i0.f17005n.x(null, "oauth/access_token", null);
        x10.G(i4.o0.GET);
        x10.H(bundle);
        return x10;
    }

    public static final String b(String codeVerifier, a codeChallengeMethod) {
        kotlin.jvm.internal.n.e(codeVerifier, "codeVerifier");
        kotlin.jvm.internal.n.e(codeChallengeMethod, "codeChallengeMethod");
        if (!d(codeVerifier)) {
            throw new i4.r("Invalid Code Verifier.");
        }
        if (codeChallengeMethod == a.PLAIN) {
            return codeVerifier;
        }
        try {
            byte[] bytes = codeVerifier.getBytes(xk.d.f31397f);
            kotlin.jvm.internal.n.d(bytes, "(this as java.lang.String).getBytes(charset)");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            kotlin.jvm.internal.n.d(encodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
            return encodeToString;
        } catch (Exception e10) {
            throw new i4.r(e10);
        }
    }

    public static final String c() {
        int i10;
        List Q;
        List R;
        List S;
        List S2;
        List S3;
        List S4;
        String M;
        Object U;
        i10 = uk.l.i(new uk.f(43, RecognitionOptions.ITF), sk.c.f25684a);
        Q = dk.z.Q(new uk.c('a', 'z'), new uk.c('A', 'Z'));
        R = dk.z.R(Q, new uk.c('0', '9'));
        S = dk.z.S(R, '-');
        S2 = dk.z.S(S, '.');
        S3 = dk.z.S(S2, '_');
        S4 = dk.z.S(S3, '~');
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            U = dk.z.U(S4, sk.c.f25684a);
            arrayList.add(Character.valueOf(((Character) U).charValue()));
        }
        M = dk.z.M(arrayList, "", null, null, 0, null, null, 62, null);
        return M;
    }

    public static final boolean d(String str) {
        if ((str == null || str.length() == 0) || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new xk.f("^[-._~A-Za-z0-9]+$").a(str);
    }
}
