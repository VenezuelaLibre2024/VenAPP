package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f3638a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f3639b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence[] f3640c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f3641d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3642e;

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f3643f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<String> f3644g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(u1 u1Var) {
            Set<String> d10;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(u1Var.i()).setLabel(u1Var.h()).setChoices(u1Var.e()).setAllowFreeFormInput(u1Var.c()).addExtras(u1Var.g());
            if (Build.VERSION.SDK_INT >= 26 && (d10 = u1Var.d()) != null) {
                Iterator<String> it = d10.iterator();
                while (it.hasNext()) {
                    b.d(addExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(addExtras, u1Var.f());
            }
            return addExtras.build();
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static void a(u1 u1Var, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(u1.a(u1Var), intent, map);
        }

        static Set<String> b(Object obj) {
            Set<String> allowedDataTypes;
            allowedDataTypes = ((RemoteInput) obj).getAllowedDataTypes();
            return allowedDataTypes;
        }

        static Map<String, Uri> c(Intent intent, String str) {
            Map<String, Uri> dataResultsFromIntent;
            dataResultsFromIntent = RemoteInput.getDataResultsFromIntent(intent, str);
            return dataResultsFromIntent;
        }

        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z10) {
            RemoteInput.Builder allowDataType;
            allowDataType = builder.setAllowDataType(str, z10);
            return allowDataType;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        static int a(Object obj) {
            int editChoicesBeforeSending;
            editChoicesBeforeSending = ((RemoteInput) obj).getEditChoicesBeforeSending();
            return editChoicesBeforeSending;
        }

        static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
            RemoteInput.Builder editChoicesBeforeSending;
            editChoicesBeforeSending = builder.setEditChoicesBeforeSending(i10);
            return editChoicesBeforeSending;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f3645a;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f3648d;

        /* renamed from: e, reason: collision with root package name */
        private CharSequence[] f3649e;

        /* renamed from: b, reason: collision with root package name */
        private final Set<String> f3646b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Bundle f3647c = new Bundle();

        /* renamed from: f, reason: collision with root package name */
        private boolean f3650f = true;

        /* renamed from: g, reason: collision with root package name */
        private int f3651g = 0;

        public d(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f3645a = str;
        }

        public u1 a() {
            return new u1(this.f3645a, this.f3648d, this.f3649e, this.f3650f, this.f3651g, this.f3647c, this.f3646b);
        }

        public d b(String str, boolean z10) {
            if (z10) {
                this.f3646b.add(str);
            } else {
                this.f3646b.remove(str);
            }
            return this;
        }

        public d c(boolean z10) {
            this.f3650f = z10;
            return this;
        }

        public d d(CharSequence[] charSequenceArr) {
            this.f3649e = charSequenceArr;
            return this;
        }

        public d e(CharSequence charSequence) {
            this.f3648d = charSequence;
            return this;
        }
    }

    u1(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set<String> set) {
        this.f3638a = str;
        this.f3639b = charSequence;
        this.f3640c = charSequenceArr;
        this.f3641d = z10;
        this.f3642e = i10;
        this.f3643f = bundle;
        this.f3644g = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    static RemoteInput a(u1 u1Var) {
        return a.b(u1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RemoteInput[] b(u1[] u1VarArr) {
        if (u1VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[u1VarArr.length];
        for (int i10 = 0; i10 < u1VarArr.length; i10++) {
            remoteInputArr[i10] = a(u1VarArr[i10]);
        }
        return remoteInputArr;
    }

    public static Bundle j(Intent intent) {
        return a.c(intent);
    }

    public boolean c() {
        return this.f3641d;
    }

    public Set<String> d() {
        return this.f3644g;
    }

    public CharSequence[] e() {
        return this.f3640c;
    }

    public int f() {
        return this.f3642e;
    }

    public Bundle g() {
        return this.f3643f;
    }

    public CharSequence h() {
        return this.f3639b;
    }

    public String i() {
        return this.f3638a;
    }

    public boolean k() {
        return (c() || (e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
