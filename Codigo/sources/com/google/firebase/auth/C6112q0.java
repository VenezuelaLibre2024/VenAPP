package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import ga.C7533a;
import p081ea.AbstractC7138a;
import p081ea.C7140c;
import p485zb.C12873m;

/* renamed from: com.google.firebase.auth.q0 */
/* loaded from: classes.dex */
public class C6112q0 {

    /* renamed from: com.google.firebase.auth.q0$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC7138a {
        public static final Parcelable.Creator<a> CREATOR = new C6051b2();

        /* renamed from: u1 */
        public static a m16606u1() {
            return new a();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            C7140c.m21210b(parcel, C7140c.m21209a(parcel));
        }
    }

    /* renamed from: com.google.firebase.auth.q0$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        private static final C7533a zza = new C7533a("PhoneAuthProvider", new String[0]);

        public void onCodeAutoRetrievalTimeOut(String str) {
            zza.m22873e("Sms auto retrieval timed-out.", new Object[0]);
        }

        public void onCodeSent(String str, a aVar) {
        }

        public abstract void onVerificationCompleted(C6104o0 c6104o0);

        public abstract void onVerificationFailed(C12873m c12873m);
    }

    /* renamed from: a */
    public static C6104o0 m16604a(String str, String str2) {
        return C6104o0.m16579y1(str, str2);
    }

    /* renamed from: b */
    public static void m16605b(C6108p0 c6108p0) {
        C5276s.m13324j(c6108p0);
        FirebaseAuth.m16351g0(c6108p0);
    }
}
