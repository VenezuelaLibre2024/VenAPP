package qb;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
import jb.q;
import vb.c0;
import vb.t;
import wb.k;

/* loaded from: classes2.dex */
public final class d implements q {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences.Editor f23924a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23925b;

    public d(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f23925b = str;
        Context applicationContext = context.getApplicationContext();
        this.f23924a = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).edit();
    }

    @Override // jb.q
    public void a(t tVar) {
        if (!this.f23924a.putString(this.f23925b, k.b(tVar.h())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // jb.q
    public void b(c0 c0Var) {
        if (!this.f23924a.putString(this.f23925b, k.b(c0Var.h())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
