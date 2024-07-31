package io.flutter.plugins.firebase.auth;

import android.app.Activity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.p0;
import com.google.firebase.auth.q0;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class PhoneNumberVerificationStreamHandler implements EventChannel.StreamHandler {
    private static final HashMap<Integer, q0.a> forceResendingTokens = new HashMap<>();
    final AtomicReference<Activity> activityRef;
    String autoRetrievedSmsCodeForTesting;
    private EventChannel.EventSink eventSink;
    final FirebaseAuth firebaseAuth;
    Integer forceResendingToken;
    final com.google.firebase.auth.t0 multiFactorInfo;
    final com.google.firebase.auth.l0 multiFactorSession;
    final OnCredentialsListener onCredentialsListener;
    final String phoneNumber;
    final int timeout;

    /* loaded from: classes3.dex */
    interface OnCredentialsListener {
        void onCredentialsReceived(com.google.firebase.auth.o0 o0Var);
    }

    public PhoneNumberVerificationStreamHandler(Activity activity, GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest pigeonVerifyPhoneNumberRequest, com.google.firebase.auth.l0 l0Var, com.google.firebase.auth.t0 t0Var, OnCredentialsListener onCredentialsListener) {
        AtomicReference<Activity> atomicReference = new AtomicReference<>(null);
        this.activityRef = atomicReference;
        atomicReference.set(activity);
        this.multiFactorSession = l0Var;
        this.multiFactorInfo = t0Var;
        this.firebaseAuth = FlutterFirebaseAuthPlugin.getAuthFromPigeon(authPigeonFirebaseApp);
        this.phoneNumber = pigeonVerifyPhoneNumberRequest.getPhoneNumber();
        this.timeout = Math.toIntExact(pigeonVerifyPhoneNumberRequest.getTimeout().longValue());
        if (pigeonVerifyPhoneNumberRequest.getAutoRetrievedSmsCodeForTesting() != null) {
            this.autoRetrievedSmsCodeForTesting = pigeonVerifyPhoneNumberRequest.getAutoRetrievedSmsCodeForTesting();
        }
        if (pigeonVerifyPhoneNumberRequest.getForceResendingToken() != null) {
            this.forceResendingToken = Integer.valueOf(Math.toIntExact(pigeonVerifyPhoneNumberRequest.getForceResendingToken().longValue()));
        }
        this.onCredentialsListener = onCredentialsListener;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.eventSink = null;
        this.activityRef.set(null);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        q0.a aVar;
        this.eventSink = eventSink;
        q0.b bVar = new q0.b() { // from class: io.flutter.plugins.firebase.auth.PhoneNumberVerificationStreamHandler.1
            @Override // com.google.firebase.auth.q0.b
            public void onCodeAutoRetrievalTimeOut(String str) {
                HashMap hashMap = new HashMap();
                hashMap.put(Constants.VERIFICATION_ID, str);
                hashMap.put("name", "Auth#phoneCodeAutoRetrievalTimeout");
                if (PhoneNumberVerificationStreamHandler.this.eventSink != null) {
                    PhoneNumberVerificationStreamHandler.this.eventSink.success(hashMap);
                }
            }

            @Override // com.google.firebase.auth.q0.b
            public void onCodeSent(String str, q0.a aVar2) {
                int hashCode = aVar2.hashCode();
                PhoneNumberVerificationStreamHandler.forceResendingTokens.put(Integer.valueOf(hashCode), aVar2);
                HashMap hashMap = new HashMap();
                hashMap.put(Constants.VERIFICATION_ID, str);
                hashMap.put(Constants.FORCE_RESENDING_TOKEN, Integer.valueOf(hashCode));
                hashMap.put("name", "Auth#phoneCodeSent");
                if (PhoneNumberVerificationStreamHandler.this.eventSink != null) {
                    PhoneNumberVerificationStreamHandler.this.eventSink.success(hashMap);
                }
            }

            @Override // com.google.firebase.auth.q0.b
            public void onVerificationCompleted(com.google.firebase.auth.o0 o0Var) {
                int hashCode = o0Var.hashCode();
                PhoneNumberVerificationStreamHandler.this.onCredentialsListener.onCredentialsReceived(o0Var);
                HashMap hashMap = new HashMap();
                hashMap.put(Constants.TOKEN, Integer.valueOf(hashCode));
                if (o0Var.x1() != null) {
                    hashMap.put(Constants.SMS_CODE, o0Var.x1());
                }
                hashMap.put("name", "Auth#phoneVerificationCompleted");
                if (PhoneNumberVerificationStreamHandler.this.eventSink != null) {
                    PhoneNumberVerificationStreamHandler.this.eventSink.success(hashMap);
                }
            }

            @Override // com.google.firebase.auth.q0.b
            public void onVerificationFailed(zb.m mVar) {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                GeneratedAndroidFirebaseAuth.FlutterError parserExceptionToFlutter = FlutterFirebaseAuthPluginException.parserExceptionToFlutter(mVar);
                hashMap2.put("code", parserExceptionToFlutter.code.replaceAll("ERROR_", "").toLowerCase(Locale.ROOT).replaceAll("_", "-"));
                hashMap2.put(io.flutter.plugins.firebase.crashlytics.Constants.MESSAGE, parserExceptionToFlutter.getMessage());
                hashMap2.put("details", parserExceptionToFlutter.details);
                hashMap.put("error", hashMap2);
                hashMap.put("name", "Auth#phoneVerificationFailed");
                if (PhoneNumberVerificationStreamHandler.this.eventSink != null) {
                    PhoneNumberVerificationStreamHandler.this.eventSink.success(hashMap);
                }
            }
        };
        if (this.autoRetrievedSmsCodeForTesting != null) {
            this.firebaseAuth.l().c(this.phoneNumber, this.autoRetrievedSmsCodeForTesting);
        }
        p0.a aVar2 = new p0.a(this.firebaseAuth);
        aVar2.b(this.activityRef.get());
        aVar2.c(bVar);
        String str = this.phoneNumber;
        if (str != null) {
            aVar2.g(str);
        }
        com.google.firebase.auth.l0 l0Var = this.multiFactorSession;
        if (l0Var != null) {
            aVar2.f(l0Var);
        }
        com.google.firebase.auth.t0 t0Var = this.multiFactorInfo;
        if (t0Var != null) {
            aVar2.e(t0Var);
        }
        aVar2.h(Long.valueOf(this.timeout), TimeUnit.MILLISECONDS);
        Integer num = this.forceResendingToken;
        if (num != null && (aVar = forceResendingTokens.get(num)) != null) {
            aVar2.d(aVar);
        }
        com.google.firebase.auth.q0.b(aVar2.a());
    }
}
