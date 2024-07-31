package r1;

import android.content.Context;
import r1.u;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f24635a = new t();

    private t() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends r1.u> r1.u.a<T> a(android.content.Context r2, java.lang.Class<T> r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.n.e(r2, r0)
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.n.e(r3, r0)
            r0 = 1
            if (r4 == 0) goto L16
            boolean r1 = xk.g.t(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: r1.t.a(android.content.Context, java.lang.Class, java.lang.String):r1.u$a");
    }

    public static final <T, C> T b(Class<C> klass, String suffix) {
        String z10;
        String str;
        kotlin.jvm.internal.n.e(klass, "klass");
        kotlin.jvm.internal.n.e(suffix, "suffix");
        Package r12 = klass.getPackage();
        kotlin.jvm.internal.n.b(r12);
        String fullPackage = r12.getName();
        String canonicalName = klass.getCanonicalName();
        kotlin.jvm.internal.n.b(canonicalName);
        kotlin.jvm.internal.n.d(fullPackage, "fullPackage");
        if (!(fullPackage.length() == 0)) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            kotlin.jvm.internal.n.d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str2 = canonicalName;
        StringBuilder sb2 = new StringBuilder();
        z10 = xk.p.z(str2, '.', '_', false, 4, null);
        sb2.append(z10);
        sb2.append(suffix);
        String sb3 = sb2.toString();
        try {
            if (fullPackage.length() == 0) {
                str = sb3;
            } else {
                str = fullPackage + '.' + sb3;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            kotlin.jvm.internal.n.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return (T) cls.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + sb3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass + ".canonicalName");
        }
    }

    public static final <T extends u> u.a<T> c(Context context, Class<T> klass) {
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(klass, "klass");
        return new u.a<>(context, klass, null);
    }
}
