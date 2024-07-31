package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.e;
import com.facebook.internal.e0;
import com.facebook.internal.n0;
import com.facebook.internal.x;
import com.facebook.login.i0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class CustomTabMainActivity extends Activity {

    /* renamed from: c, reason: collision with root package name */
    public static final a f7545c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f7546d = n.k(CustomTabMainActivity.class.getSimpleName(), ".extra_action");

    /* renamed from: e, reason: collision with root package name */
    public static final String f7547e = n.k(CustomTabMainActivity.class.getSimpleName(), ".extra_params");

    /* renamed from: f, reason: collision with root package name */
    public static final String f7548f = n.k(CustomTabMainActivity.class.getSimpleName(), ".extra_chromePackage");

    /* renamed from: r, reason: collision with root package name */
    public static final String f7549r = n.k(CustomTabMainActivity.class.getSimpleName(), ".extra_url");

    /* renamed from: s, reason: collision with root package name */
    public static final String f7550s = n.k(CustomTabMainActivity.class.getSimpleName(), ".extra_targetApp");

    /* renamed from: t, reason: collision with root package name */
    public static final String f7551t = n.k(CustomTabMainActivity.class.getSimpleName(), ".action_refresh");

    /* renamed from: u, reason: collision with root package name */
    public static final String f7552u = n.k(CustomTabMainActivity.class.getSimpleName(), ".no_activity_exception");

    /* renamed from: a, reason: collision with root package name */
    private boolean f7553a = true;

    /* renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f7554b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle b(String str) {
            Uri parse = Uri.parse(str);
            n0 n0Var = n0.f7780a;
            Bundle p02 = n0.p0(parse.getQuery());
            p02.putAll(n0.p0(parse.getFragment()));
            return p02;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7555a;

        static {
            int[] iArr = new int[i0.valuesCustom().length];
            iArr[i0.INSTAGRAM.ordinal()] = 1;
            f7555a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            n.e(context, "context");
            n.e(intent, "intent");
            Intent intent2 = new Intent(CustomTabMainActivity.this, (Class<?>) CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f7551t);
            String str = CustomTabMainActivity.f7549r;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    private final void a(int i10, Intent intent) {
        BroadcastReceiver broadcastReceiver = this.f7554b;
        if (broadcastReceiver != null) {
            k1.a.b(this).e(broadcastReceiver);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f7549r);
            Bundle b10 = stringExtra != null ? f7545c.b(stringExtra) : new Bundle();
            e0 e0Var = e0.f7730a;
            Intent intent2 = getIntent();
            n.d(intent2, "intent");
            Intent m10 = e0.m(intent2, b10, null);
            if (m10 != null) {
                intent = m10;
            }
        } else {
            e0 e0Var2 = e0.f7730a;
            Intent intent3 = getIntent();
            n.d(intent3, "intent");
            intent = e0.m(intent3, null, null);
        }
        setResult(i10, intent);
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        String str = CustomTabActivity.f7541c;
        if (n.a(str, getIntent().getAction())) {
            setResult(0);
        } else {
            if (bundle != null || (stringExtra = getIntent().getStringExtra(f7546d)) == null) {
                return;
            }
            Bundle bundleExtra = getIntent().getBundleExtra(f7547e);
            boolean a10 = (b.f7555a[i0.Companion.a(getIntent().getStringExtra(f7550s)).ordinal()] == 1 ? new x(stringExtra, bundleExtra) : new e(stringExtra, bundleExtra)).a(this, getIntent().getStringExtra(f7548f));
            this.f7553a = false;
            if (a10) {
                c cVar = new c();
                this.f7554b = cVar;
                k1.a.b(this).c(cVar, new IntentFilter(str));
                return;
            }
            setResult(0, getIntent().putExtra(f7552u, true));
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        n.e(intent, "intent");
        super.onNewIntent(intent);
        if (n.a(f7551t, intent.getAction())) {
            k1.a.b(this).d(new Intent(CustomTabActivity.f7542d));
        } else if (!n.a(CustomTabActivity.f7541c, intent.getAction())) {
            return;
        }
        a(-1, intent);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.f7553a) {
            a(0, null);
        }
        this.f7553a = true;
    }
}
