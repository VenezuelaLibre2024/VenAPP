package io.flutter.plugins.firebase.auth;

import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public class FlutterFirebaseAuthPluginException {
    static GeneratedAndroidFirebaseAuth.FlutterError alreadyLinkedProvider() {
        return new GeneratedAndroidFirebaseAuth.FlutterError("PROVIDER_ALREADY_LINKED", "User has already been linked to the given provider.", null);
    }

    public static GeneratedAndroidFirebaseAuth.FlutterError invalidCredential() {
        return new GeneratedAndroidFirebaseAuth.FlutterError("INVALID_CREDENTIAL", "The supplied auth credential is malformed, has expired or is not currently supported.", null);
    }

    public static GeneratedAndroidFirebaseAuth.FlutterError noSuchProvider() {
        return new GeneratedAndroidFirebaseAuth.FlutterError("NO_SUCH_PROVIDER", "User was not linked to an account with the given provider.", null);
    }

    public static GeneratedAndroidFirebaseAuth.FlutterError noUser() {
        return new GeneratedAndroidFirebaseAuth.FlutterError("NO_CURRENT_USER", "No user currently signed in.", null);
    }

    public static GeneratedAndroidFirebaseAuth.FlutterError parserExceptionToFlutter(Exception exc) {
        if (exc == null) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("UNKNOWN", null, null);
        }
        String message = exc.getMessage();
        HashMap hashMap = new HashMap();
        if (exc instanceof com.google.firebase.auth.u) {
            com.google.firebase.auth.u uVar = (com.google.firebase.auth.u) exc;
            HashMap hashMap2 = new HashMap();
            com.google.firebase.auth.k0 b10 = uVar.b();
            List<com.google.firebase.auth.j0> v12 = b10.v1();
            com.google.firebase.auth.l0 w12 = b10.w1();
            String uuid = UUID.randomUUID().toString();
            FlutterFirebaseMultiFactor.multiFactorSessionMap.put(uuid, w12);
            String uuid2 = UUID.randomUUID().toString();
            FlutterFirebaseMultiFactor.multiFactorResolverMap.put(uuid2, b10);
            List<List<Object>> multiFactorInfoToMap = PigeonParser.multiFactorInfoToMap(v12);
            hashMap2.put("appName", uVar.b().u1().i().q());
            hashMap2.put(Constants.MULTI_FACTOR_HINTS, multiFactorInfoToMap);
            hashMap2.put(Constants.MULTI_FACTOR_SESSION_ID, uuid);
            hashMap2.put(Constants.MULTI_FACTOR_RESOLVER_ID, uuid2);
            return new GeneratedAndroidFirebaseAuth.FlutterError(uVar.a(), uVar.getLocalizedMessage(), hashMap2);
        }
        if (exc instanceof ExecutionException) {
            return noSuchProvider();
        }
        if ((exc instanceof zb.o) || (exc.getCause() != null && (exc.getCause() instanceof zb.o))) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("network-request-failed", "A network error (such as timeout, interrupted connection or unreachable host) has occurred.", null);
        }
        if ((exc instanceof zb.d) || (exc.getCause() != null && (exc.getCause() instanceof zb.d))) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("api-not-available", "The requested API is not available.", null);
        }
        if ((exc instanceof zb.q) || (exc.getCause() != null && (exc.getCause() instanceof zb.q))) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("too-many-requests", "We have blocked all requests from this device due to unusual activity. Try again later.", null);
        }
        if (exc.getMessage() != null && exc.getMessage().startsWith("Cannot create PhoneAuthCredential without either verificationProof")) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("invalid-verification-code", "The verification ID used to create the phone auth credential is invalid.", null);
        }
        if (message != null && message.contains("User has already been linked to the given provider.")) {
            return alreadyLinkedProvider();
        }
        String a10 = exc instanceof com.google.firebase.auth.q ? ((com.google.firebase.auth.q) exc).a() : "UNKNOWN";
        if (exc instanceof com.google.firebase.auth.y) {
            message = ((com.google.firebase.auth.y) exc).b();
        }
        if (exc instanceof com.google.firebase.auth.x) {
            com.google.firebase.auth.x xVar = (com.google.firebase.auth.x) exc;
            String b11 = xVar.b();
            if (b11 != null) {
                hashMap.put(Constants.EMAIL, b11);
            }
            com.google.firebase.auth.h c10 = xVar.c();
            if (c10 != null) {
                hashMap.put("authCredential", PigeonParser.parseAuthCredential(c10));
            }
        }
        return new GeneratedAndroidFirebaseAuth.FlutterError(a10, message, hashMap);
    }
}
