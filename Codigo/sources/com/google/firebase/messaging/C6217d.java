package com.google.firebase.messaging;

import android.os.Bundle;
import androidx.collection.C0731a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.d */
/* loaded from: classes.dex */
public final class C6217d {

    /* renamed from: a */
    public static final long f13283a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static C0731a<String, String> m16971a(Bundle bundle) {
            C0731a<String, String> c0731a = new C0731a<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c0731a.put(str, str2);
                    }
                }
            }
            return c0731a;
        }
    }
}
