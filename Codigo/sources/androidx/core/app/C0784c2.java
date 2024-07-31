package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0854a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.c2 */
/* loaded from: classes.dex */
public final class C0784c2 implements Iterable<Intent> {

    /* renamed from: a */
    private final ArrayList<Intent> f4129a = new ArrayList<>();

    /* renamed from: b */
    private final Context f4130b;

    /* renamed from: androidx.core.app.c2$a */
    /* loaded from: classes.dex */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private C0784c2(Context context) {
        this.f4130b = context;
    }

    /* renamed from: h */
    public static C0784c2 m3942h(Context context) {
        return new C0784c2(context);
    }

    /* renamed from: c */
    public C0784c2 m3943c(Intent intent) {
        this.f4129a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public C0784c2 m3944d(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C0812m.m4060a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f4130b.getPackageManager());
            }
            m3945f(component);
            m3943c(supportParentActivityIntent);
        }
        return this;
    }

    /* renamed from: f */
    public C0784c2 m3945f(ComponentName componentName) {
        int size = this.f4129a.size();
        try {
            Context context = this.f4130b;
            while (true) {
                Intent m4061b = C0812m.m4061b(context, componentName);
                if (m4061b == null) {
                    return this;
                }
                this.f4129a.add(size, m4061b);
                context = this.f4130b;
                componentName = m4061b.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f4129a.iterator();
    }

    /* renamed from: k */
    public void m3946k() {
        m3947l(null);
    }

    /* renamed from: l */
    public void m3947l(Bundle bundle) {
        if (this.f4129a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f4129a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C0854a.startActivities(this.f4130b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f4130b.startActivity(intent);
    }
}
