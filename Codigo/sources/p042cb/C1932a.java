package p042cb;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zzcl;
import com.google.android.gms.internal.consent_sdk.zzct;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cb.a */
/* loaded from: classes2.dex */
public class C1932a {

    /* renamed from: a */
    private final boolean f7958a;

    /* renamed from: b */
    private final int f7959b;

    /* renamed from: cb.a$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: b */
        private final Context f7961b;

        /* renamed from: d */
        private boolean f7963d;

        /* renamed from: a */
        private final List f7960a = new ArrayList();

        /* renamed from: c */
        private int f7962c = 0;

        public a(@RecentlyNonNull Context context) {
            this.f7961b = context.getApplicationContext();
        }

        @RecentlyNonNull
        /* renamed from: a */
        public a m10128a(@RecentlyNonNull String str) {
            this.f7960a.add(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C1932a m10129b() {
            boolean z10 = true;
            if (!zzct.zza(true) && !this.f7960a.contains(zzcl.zza(this.f7961b)) && !this.f7963d) {
                z10 = false;
            }
            return new C1932a(z10, this, null);
        }

        @RecentlyNonNull
        /* renamed from: c */
        public a m10130c(int i10) {
            this.f7962c = i10;
            return this;
        }
    }

    /* synthetic */ C1932a(boolean z10, a aVar, C1938g c1938g) {
        this.f7958a = z10;
        this.f7959b = aVar.f7962c;
    }

    /* renamed from: a */
    public int m10125a() {
        return this.f7959b;
    }

    /* renamed from: b */
    public boolean m10126b() {
        return this.f7958a;
    }
}
