package p322r1;

import android.content.Context;
import kotlin.jvm.internal.C9322n;
import p322r1.AbstractC10604u;
import p450xk.C12524p;

/* renamed from: r1.t */
/* loaded from: classes.dex */
public final class C10603t {

    /* renamed from: a */
    public static final C10603t f26749a = new C10603t();

    private C10603t() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends p322r1.AbstractC10604u> p322r1.AbstractC10604u.a<T> m32240a(android.content.Context r2, java.lang.Class<T> r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C9322n.m27781e(r2, r0)
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.C9322n.m27781e(r3, r0)
            r0 = 1
            if (r4 == 0) goto L16
            boolean r1 = p450xk.C12515g.m41007t(r4)
            if (r1 == 0) goto L14
            goto L16
        L14:
            r1 = 0
            goto L17
        L16:
            r1 = r0
        L17:
            r0 = r0 ^ r1
            if (r0 == 0) goto L20
            r1.u$a r0 = new r1.u$a
            r0.<init>(r2, r3, r4)
            return r0
        L20:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p322r1.C10603t.m32240a(android.content.Context, java.lang.Class, java.lang.String):r1.u$a");
    }

    /* renamed from: b */
    public static final <T, C> T m32241b(Class<C> klass, String suffix) {
        String m41045z;
        String str;
        C9322n.m27781e(klass, "klass");
        C9322n.m27781e(suffix, "suffix");
        Package r12 = klass.getPackage();
        C9322n.m27778b(r12);
        String fullPackage = r12.getName();
        String canonicalName = klass.getCanonicalName();
        C9322n.m27778b(canonicalName);
        C9322n.m27780d(fullPackage, "fullPackage");
        if (!(fullPackage.length() == 0)) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            C9322n.m27780d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str2 = canonicalName;
        StringBuilder sb2 = new StringBuilder();
        m41045z = C12524p.m41045z(str2, '.', '_', false, 4, null);
        sb2.append(m41045z);
        sb2.append(suffix);
        String sb3 = sb2.toString();
        try {
            if (fullPackage.length() == 0) {
                str = sb3;
            } else {
                str = fullPackage + '.' + sb3;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            C9322n.m27779c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return (T) cls.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + sb3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass + ".canonicalName");
        }
    }

    /* renamed from: c */
    public static final <T extends AbstractC10604u> AbstractC10604u.a<T> m32242c(Context context, Class<T> klass) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(klass, "klass");
        return new AbstractC10604u.a<>(context, klass, null);
    }
}
