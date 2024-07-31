package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import androidx.browser.customtabs.AbstractServiceConnectionC0395e;
import androidx.browser.customtabs.C0393c;
import androidx.browser.customtabs.C0399i;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: com.facebook.login.d */
/* loaded from: classes.dex */
public final class C4659d extends AbstractServiceConnectionC0395e {

    /* renamed from: b */
    private static C0393c f8890b;

    /* renamed from: c */
    private static C0399i f8891c;

    /* renamed from: a */
    public static final a f8889a = new a(null);

    /* renamed from: d */
    private static final ReentrantLock f8892d = new ReentrantLock();

    /* renamed from: com.facebook.login.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final void m11508d() {
            C0393c c0393c;
            C4659d.f8892d.lock();
            if (C4659d.f8891c == null && (c0393c = C4659d.f8890b) != null) {
                C4659d.f8891c = c0393c.m2097f(null);
            }
            C4659d.f8892d.unlock();
        }

        /* renamed from: b */
        public final C0399i m11509b() {
            C4659d.f8892d.lock();
            C0399i c0399i = C4659d.f8891c;
            C4659d.f8891c = null;
            C4659d.f8892d.unlock();
            return c0399i;
        }

        /* renamed from: c */
        public final void m11510c(Uri url) {
            C9322n.m27781e(url, "url");
            m11508d();
            C4659d.f8892d.lock();
            C0399i c0399i = C4659d.f8891c;
            if (c0399i != null) {
                c0399i.m2132i(url, null, null);
            }
            C4659d.f8892d.unlock();
        }
    }

    @Override // androidx.browser.customtabs.AbstractServiceConnectionC0395e
    public void onCustomTabsServiceConnected(ComponentName name, C0393c newClient) {
        C9322n.m27781e(name, "name");
        C9322n.m27781e(newClient, "newClient");
        newClient.m2098h(0L);
        f8890b = newClient;
        f8889a.m11508d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        C9322n.m27781e(componentName, "componentName");
    }
}
