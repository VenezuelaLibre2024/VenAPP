package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.core.provider.C0959e;
import androidx.core.util.C0984h;
import androidx.emoji2.text.C1227e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.emoji2.text.c */
/* loaded from: classes.dex */
public final class C1225c {

    /* renamed from: androidx.emoji2.text.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final b f5051a;

        public a(b bVar) {
            this.f5051a = bVar == null ? m6611e() : bVar;
        }

        /* renamed from: a */
        private C1227e.c m6608a(Context context, C0959e c0959e) {
            if (c0959e == null) {
                return null;
            }
            return new C1232j(context, c0959e);
        }

        /* renamed from: b */
        private List<List<byte[]>> m6609b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* renamed from: d */
        private C0959e m6610d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C0959e(str, str2, "emojicompat-emoji-font", m6609b(this.f5051a.mo6617b(packageManager, str2)));
        }

        /* renamed from: e */
        private static b m6611e() {
            return Build.VERSION.SDK_INT >= 28 ? new d() : new c();
        }

        /* renamed from: f */
        private boolean m6612f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        /* renamed from: g */
        private ProviderInfo m6613g(PackageManager packageManager) {
            Iterator<ResolveInfo> it = this.f5051a.mo6618c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo mo6616a = this.f5051a.mo6616a(it.next());
                if (m6612f(mo6616a)) {
                    return mo6616a;
                }
            }
            return null;
        }

        /* renamed from: c */
        public C1227e.c m6614c(Context context) {
            return m6608a(context, m6615h(context));
        }

        /* renamed from: h */
        C0959e m6615h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            C0984h.m4834l(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo m6613g = m6613g(packageManager);
            if (m6613g == null) {
                return null;
            }
            try {
                return m6610d(m6613g, packageManager);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
                return null;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.c$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public ProviderInfo mo6616a(ResolveInfo resolveInfo) {
            throw null;
        }

        /* renamed from: b */
        public Signature[] mo6617b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* renamed from: c */
        public List<ResolveInfo> mo6618c(PackageManager packageManager, Intent intent, int i10) {
            throw null;
        }
    }

    /* renamed from: androidx.emoji2.text.c$c */
    /* loaded from: classes.dex */
    public static class c extends b {
        @Override // androidx.emoji2.text.C1225c.b
        /* renamed from: a */
        public ProviderInfo mo6616a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.C1225c.b
        /* renamed from: c */
        public List<ResolveInfo> mo6618c(PackageManager packageManager, Intent intent, int i10) {
            return packageManager.queryIntentContentProviders(intent, i10);
        }
    }

    /* renamed from: androidx.emoji2.text.c$d */
    /* loaded from: classes.dex */
    public static class d extends c {
        @Override // androidx.emoji2.text.C1225c.b
        /* renamed from: b */
        public Signature[] mo6617b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* renamed from: a */
    public static C1232j m6607a(Context context) {
        return (C1232j) new a(null).m6614c(context);
    }
}
