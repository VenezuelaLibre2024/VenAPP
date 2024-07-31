package cb;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zzcl;
import com.google.android.gms.internal.consent_sdk.zzct;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7006a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7007b;

    /* renamed from: cb.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0118a {

        /* renamed from: b, reason: collision with root package name */
        private final Context f7009b;

        /* renamed from: d, reason: collision with root package name */
        private boolean f7011d;

        /* renamed from: a, reason: collision with root package name */
        private final List f7008a = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private int f7010c = 0;

        public C0118a(@RecentlyNonNull Context context) {
            this.f7009b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public C0118a a(@RecentlyNonNull String str) {
            this.f7008a.add(str);
            return this;
        }

        @RecentlyNonNull
        public a b() {
            boolean z10 = true;
            if (!zzct.zza(true) && !this.f7008a.contains(zzcl.zza(this.f7009b)) && !this.f7011d) {
                z10 = false;
            }
            return new a(z10, this, null);
        }

        @RecentlyNonNull
        public C0118a c(int i10) {
            this.f7010c = i10;
            return this;
        }
    }

    /* synthetic */ a(boolean z10, C0118a c0118a, g gVar) {
        this.f7006a = z10;
        this.f7007b = c0118a.f7010c;
    }

    public int a() {
        return this.f7007b;
    }

    public boolean b() {
        return this.f7006a;
    }
}
