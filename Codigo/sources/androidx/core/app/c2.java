package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c2 implements Iterable<Intent> {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<Intent> f3478a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final Context f3479b;

    /* loaded from: classes.dex */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private c2(Context context) {
        this.f3479b = context;
    }

    public static c2 h(Context context) {
        return new c2(context);
    }

    public c2 c(Intent intent) {
        this.f3478a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c2 d(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = m.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f3479b.getPackageManager());
            }
            f(component);
            c(supportParentActivityIntent);
        }
        return this;
    }

    public c2 f(ComponentName componentName) {
        int size = this.f3478a.size();
        try {
            Context context = this.f3479b;
            while (true) {
                Intent b10 = m.b(context, componentName);
                if (b10 == null) {
                    return this;
                }
                this.f3478a.add(size, b10);
                context = this.f3479b;
                componentName = b10.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f3478a.iterator();
    }

    public void k() {
        l(null);
    }

    public void l(Bundle bundle) {
        if (this.f3478a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f3478a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.startActivities(this.f3479b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f3479b.startActivity(intent);
    }
}
