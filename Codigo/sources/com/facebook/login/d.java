package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class d extends androidx.browser.customtabs.e {

    /* renamed from: b, reason: collision with root package name */
    private static androidx.browser.customtabs.c f7910b;

    /* renamed from: c, reason: collision with root package name */
    private static androidx.browser.customtabs.i f7911c;

    /* renamed from: a, reason: collision with root package name */
    public static final a f7909a = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final ReentrantLock f7912d = new ReentrantLock();

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d() {
            androidx.browser.customtabs.c cVar;
            d.f7912d.lock();
            if (d.f7911c == null && (cVar = d.f7910b) != null) {
                d.f7911c = cVar.f(null);
            }
            d.f7912d.unlock();
        }

        public final androidx.browser.customtabs.i b() {
            d.f7912d.lock();
            androidx.browser.customtabs.i iVar = d.f7911c;
            d.f7911c = null;
            d.f7912d.unlock();
            return iVar;
        }

        public final void c(Uri url) {
            kotlin.jvm.internal.n.e(url, "url");
            d();
            d.f7912d.lock();
            androidx.browser.customtabs.i iVar = d.f7911c;
            if (iVar != null) {
                iVar.i(url, null, null);
            }
            d.f7912d.unlock();
        }
    }

    @Override // androidx.browser.customtabs.e
    public void onCustomTabsServiceConnected(ComponentName name, androidx.browser.customtabs.c newClient) {
        kotlin.jvm.internal.n.e(name, "name");
        kotlin.jvm.internal.n.e(newClient, "newClient");
        newClient.h(0L);
        f7910b = newClient;
        f7909a.d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        kotlin.jvm.internal.n.e(componentName, "componentName");
    }
}
