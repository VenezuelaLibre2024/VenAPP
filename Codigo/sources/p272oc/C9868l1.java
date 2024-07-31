package p272oc;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzagt;
import com.google.firebase.auth.AbstractC6072h;
import com.google.firebase.auth.C6046a1;
import com.google.firebase.auth.C6057d0;
import com.google.firebase.auth.C6059d2;
import com.google.firebase.auth.C6065f0;
import com.google.firebase.auth.C6091l;
import com.google.firebase.auth.C6128u0;

/* renamed from: oc.l1 */
/* loaded from: classes.dex */
public final class C9868l1 {
    /* renamed from: a */
    public static zzagt m29554a(AbstractC6072h abstractC6072h, String str) {
        C5276s.m13324j(abstractC6072h);
        if (C6065f0.class.isAssignableFrom(abstractC6072h.getClass())) {
            return C6065f0.m16524x1((C6065f0) abstractC6072h, str);
        }
        if (C6091l.class.isAssignableFrom(abstractC6072h.getClass())) {
            return C6091l.m16563x1((C6091l) abstractC6072h, str);
        }
        if (C6046a1.class.isAssignableFrom(abstractC6072h.getClass())) {
            return C6046a1.m16463x1((C6046a1) abstractC6072h, str);
        }
        if (C6057d0.class.isAssignableFrom(abstractC6072h.getClass())) {
            return C6057d0.m16482x1((C6057d0) abstractC6072h, str);
        }
        if (C6128u0.class.isAssignableFrom(abstractC6072h.getClass())) {
            return C6128u0.m16612x1((C6128u0) abstractC6072h, str);
        }
        if (C6059d2.class.isAssignableFrom(abstractC6072h.getClass())) {
            return C6059d2.m16488A1((C6059d2) abstractC6072h, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
