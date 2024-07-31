package com.facebook.login;

import android.os.Bundle;
import android.util.Base64;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dk.C7042z;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;
import p152i4.C7807i0;
import p152i4.C7824r;
import p152i4.EnumC7819o0;
import p450xk.C12512d;
import p450xk.C12514f;
import sk.AbstractC10933c;
import uk.C11576c;
import uk.C11579f;
import uk.C11585l;

/* renamed from: com.facebook.login.m0 */
/* loaded from: classes.dex */
public final class C4678m0 {

    /* renamed from: a */
    public static final C4678m0 f8966a = new C4678m0();

    private C4678m0() {
    }

    /* renamed from: a */
    public static final C7807i0 m11630a(String authorizationCode, String redirectUri, String codeVerifier) {
        C9322n.m27781e(authorizationCode, "authorizationCode");
        C9322n.m27781e(redirectUri, "redirectUri");
        C9322n.m27781e(codeVerifier, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", authorizationCode);
        bundle.putString("client_id", C7799e0.m23861m());
        bundle.putString("redirect_uri", redirectUri);
        bundle.putString("code_verifier", codeVerifier);
        C7807i0 m24001x = C7807i0.f18658n.m24001x(null, "oauth/access_token", null);
        m24001x.m23946G(EnumC7819o0.GET);
        m24001x.m23947H(bundle);
        return m24001x;
    }

    /* renamed from: b */
    public static final String m11631b(String codeVerifier, EnumC4653a codeChallengeMethod) {
        C9322n.m27781e(codeVerifier, "codeVerifier");
        C9322n.m27781e(codeChallengeMethod, "codeChallengeMethod");
        if (!m11633d(codeVerifier)) {
            throw new C7824r("Invalid Code Verifier.");
        }
        if (codeChallengeMethod == EnumC4653a.PLAIN) {
            return codeVerifier;
        }
        try {
            byte[] bytes = codeVerifier.getBytes(C12512d.f33917f);
            C9322n.m27780d(bytes, "(this as java.lang.String).getBytes(charset)");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            C9322n.m27780d(encodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
            return encodeToString;
        } catch (Exception e10) {
            throw new C7824r(e10);
        }
    }

    /* renamed from: c */
    public static final String m11632c() {
        int m36300i;
        List m20615Q;
        List m20616R;
        List m20617S;
        List m20617S2;
        List m20617S3;
        List m20617S4;
        String m20611M;
        Object m20619U;
        m36300i = C11585l.m36300i(new C11579f(43, RecognitionOptions.ITF), AbstractC10933c.f27828a);
        m20615Q = C7042z.m20615Q(new C11576c('a', 'z'), new C11576c('A', 'Z'));
        m20616R = C7042z.m20616R(m20615Q, new C11576c('0', '9'));
        m20617S = C7042z.m20617S(m20616R, '-');
        m20617S2 = C7042z.m20617S(m20617S, '.');
        m20617S3 = C7042z.m20617S(m20617S2, '_');
        m20617S4 = C7042z.m20617S(m20617S3, '~');
        ArrayList arrayList = new ArrayList(m36300i);
        for (int i10 = 0; i10 < m36300i; i10++) {
            m20619U = C7042z.m20619U(m20617S4, AbstractC10933c.f27828a);
            arrayList.add(Character.valueOf(((Character) m20619U).charValue()));
        }
        m20611M = C7042z.m20611M(arrayList, "", null, null, 0, null, null, 62, null);
        return m20611M;
    }

    /* renamed from: d */
    public static final boolean m11633d(String str) {
        if ((str == null || str.length() == 0) || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new C12514f("^[-._~A-Za-z0-9]+$").m40969a(str);
    }
}
