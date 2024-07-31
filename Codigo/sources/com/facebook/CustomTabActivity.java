package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class CustomTabActivity extends Activity {

    /* renamed from: b */
    public static final a f7540b = new a(null);

    /* renamed from: c */
    public static final String f7541c = n.k(CustomTabActivity.class.getSimpleName(), ".action_customTabRedirect");

    /* renamed from: d */
    public static final String f7542d = n.k(CustomTabActivity.class.getSimpleName(), ".action_destroy");

    /* renamed from: a */
    private BroadcastReceiver f7543a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            n.e(context, "context");
            n.e(intent, "intent");
            CustomTabActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            Intent intent2 = new Intent(f7541c);
            intent2.putExtra(CustomTabMainActivity.f7549r, getIntent().getDataString());
            k1.a.b(this).d(intent2);
            b bVar = new b();
            k1.a.b(this).c(bVar, new IntentFilter(f7542d));
            this.f7543a = bVar;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(f7541c);
        intent.putExtra(CustomTabMainActivity.f7549r, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.f7543a;
        if (broadcastReceiver != null) {
            k1.a.b(this).e(broadcastReceiver);
        }
        super.onDestroy();
    }
}
