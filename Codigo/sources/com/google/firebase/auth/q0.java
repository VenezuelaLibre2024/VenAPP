package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class q0 {

    /* loaded from: classes.dex */
    public static class a extends ea.a {
        public static final Parcelable.Creator<a> CREATOR = new b2();

        public static a u1() {
            return new a();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            ea.c.b(parcel, ea.c.a(parcel));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        private static final ga.a zza = new ga.a("PhoneAuthProvider", new String[0]);

        public void onCodeAutoRetrievalTimeOut(String str) {
            zza.e("Sms auto retrieval timed-out.", new Object[0]);
        }

        public void onCodeSent(String str, a aVar) {
        }

        public abstract void onVerificationCompleted(o0 o0Var);

        public abstract void onVerificationFailed(zb.m mVar);
    }

    public static o0 a(String str, String str2) {
        return o0.y1(str, str2);
    }

    public static void b(p0 p0Var) {
        com.google.android.gms.common.internal.s.j(p0Var);
        FirebaseAuth.g0(p0Var);
    }
}
