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

/* renamed from: androidx.core.app.u1 */
/* loaded from: classes.dex */
public final class C0838u1 {

    /* renamed from: a */
    private final String f4310a;

    /* renamed from: b */
    private final CharSequence f4311b;

    /* renamed from: c */
    private final CharSequence[] f4312c;

    /* renamed from: d */
    private final boolean f4313d;

    /* renamed from: e */
    private final int f4314e;

    /* renamed from: f */
    private final Bundle f4315f;

    /* renamed from: g */
    private final Set<String> f4316g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.u1$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static void m4328a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static RemoteInput m4329b(C0838u1 c0838u1) {
            Set<String> m4321d;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(c0838u1.m4326i()).setLabel(c0838u1.m4325h()).setChoices(c0838u1.m4322e()).setAllowFreeFormInput(c0838u1.m4320c()).addExtras(c0838u1.m4324g());
            if (Build.VERSION.SDK_INT >= 26 && (m4321d = c0838u1.m4321d()) != null) {
                Iterator<String> it = m4321d.iterator();
                while (it.hasNext()) {
                    b.m4334d(addExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.m4336b(addExtras, c0838u1.m4323f());
            }
            return addExtras.build();
        }

        /* renamed from: c */
        static Bundle m4330c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.u1$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static void m4331a(C0838u1 c0838u1, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(C0838u1.m4317a(c0838u1), intent, map);
        }

        /* renamed from: b */
        static Set<String> m4332b(Object obj) {
            Set<String> allowedDataTypes;
            allowedDataTypes = ((RemoteInput) obj).getAllowedDataTypes();
            return allowedDataTypes;
        }

        /* renamed from: c */
        static Map<String, Uri> m4333c(Intent intent, String str) {
            Map<String, Uri> dataResultsFromIntent;
            dataResultsFromIntent = RemoteInput.getDataResultsFromIntent(intent, str);
            return dataResultsFromIntent;
        }

        /* renamed from: d */
        static RemoteInput.Builder m4334d(RemoteInput.Builder builder, String str, boolean z10) {
            RemoteInput.Builder allowDataType;
            allowDataType = builder.setAllowDataType(str, z10);
            return allowDataType;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.u1$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        static int m4335a(Object obj) {
            int editChoicesBeforeSending;
            editChoicesBeforeSending = ((RemoteInput) obj).getEditChoicesBeforeSending();
            return editChoicesBeforeSending;
        }

        /* renamed from: b */
        static RemoteInput.Builder m4336b(RemoteInput.Builder builder, int i10) {
            RemoteInput.Builder editChoicesBeforeSending;
            editChoicesBeforeSending = builder.setEditChoicesBeforeSending(i10);
            return editChoicesBeforeSending;
        }
    }

    /* renamed from: androidx.core.app.u1$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final String f4317a;

        /* renamed from: d */
        private CharSequence f4320d;

        /* renamed from: e */
        private CharSequence[] f4321e;

        /* renamed from: b */
        private final Set<String> f4318b = new HashSet();

        /* renamed from: c */
        private final Bundle f4319c = new Bundle();

        /* renamed from: f */
        private boolean f4322f = true;

        /* renamed from: g */
        private int f4323g = 0;

        public d(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f4317a = str;
        }

        /* renamed from: a */
        public C0838u1 m4337a() {
            return new C0838u1(this.f4317a, this.f4320d, this.f4321e, this.f4322f, this.f4323g, this.f4319c, this.f4318b);
        }

        /* renamed from: b */
        public d m4338b(String str, boolean z10) {
            if (z10) {
                this.f4318b.add(str);
            } else {
                this.f4318b.remove(str);
            }
            return this;
        }

        /* renamed from: c */
        public d m4339c(boolean z10) {
            this.f4322f = z10;
            return this;
        }

        /* renamed from: d */
        public d m4340d(CharSequence[] charSequenceArr) {
            this.f4321e = charSequenceArr;
            return this;
        }

        /* renamed from: e */
        public d m4341e(CharSequence charSequence) {
            this.f4320d = charSequence;
            return this;
        }
    }

    C0838u1(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set<String> set) {
        this.f4310a = str;
        this.f4311b = charSequence;
        this.f4312c = charSequenceArr;
        this.f4313d = z10;
        this.f4314e = i10;
        this.f4315f = bundle;
        this.f4316g = set;
        if (m4323f() == 2 && !m4320c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    /* renamed from: a */
    static RemoteInput m4317a(C0838u1 c0838u1) {
        return a.m4329b(c0838u1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static RemoteInput[] m4318b(C0838u1[] c0838u1Arr) {
        if (c0838u1Arr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[c0838u1Arr.length];
        for (int i10 = 0; i10 < c0838u1Arr.length; i10++) {
            remoteInputArr[i10] = m4317a(c0838u1Arr[i10]);
        }
        return remoteInputArr;
    }

    /* renamed from: j */
    public static Bundle m4319j(Intent intent) {
        return a.m4330c(intent);
    }

    /* renamed from: c */
    public boolean m4320c() {
        return this.f4313d;
    }

    /* renamed from: d */
    public Set<String> m4321d() {
        return this.f4316g;
    }

    /* renamed from: e */
    public CharSequence[] m4322e() {
        return this.f4312c;
    }

    /* renamed from: f */
    public int m4323f() {
        return this.f4314e;
    }

    /* renamed from: g */
    public Bundle m4324g() {
        return this.f4315f;
    }

    /* renamed from: h */
    public CharSequence m4325h() {
        return this.f4311b;
    }

    /* renamed from: i */
    public String m4326i() {
        return this.f4310a;
    }

    /* renamed from: k */
    public boolean m4327k() {
        return (m4320c() || (m4322e() != null && m4322e().length != 0) || m4321d() == null || m4321d().isEmpty()) ? false : true;
    }
}
