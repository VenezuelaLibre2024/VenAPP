package p309qb;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
import p179jb.InterfaceC9025q;
import p400vb.C11790c0;
import p400vb.C11816t;
import p419wb.C12139k;

/* renamed from: qb.d */
/* loaded from: classes2.dex */
public final class C10418d implements InterfaceC9025q {

    /* renamed from: a */
    private final SharedPreferences.Editor f25966a;

    /* renamed from: b */
    private final String f25967b;

    public C10418d(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f25967b = str;
        Context applicationContext = context.getApplicationContext();
        this.f25966a = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).edit();
    }

    @Override // p179jb.InterfaceC9025q
    /* renamed from: a */
    public void mo26490a(C11816t c11816t) {
        if (!this.f25966a.putString(this.f25967b, C12139k.m38899b(c11816t.mo15293h())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // p179jb.InterfaceC9025q
    /* renamed from: b */
    public void mo26491b(C11790c0 c11790c0) {
        if (!this.f25966a.putString(this.f25967b, C12139k.m38899b(c11790c0.mo15293h())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
