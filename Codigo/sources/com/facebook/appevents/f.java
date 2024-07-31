package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.appevents.a;
import com.facebook.appevents.d;
import com.facebook.internal.n0;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f7615a = new f();

    /* renamed from: b, reason: collision with root package name */
    private static final String f7616b = f.class.getName();

    /* loaded from: classes.dex */
    private static final class a extends ObjectInputStream {

        /* renamed from: a, reason: collision with root package name */
        public static final C0133a f7617a = new C0133a(null);

        /* renamed from: com.facebook.appevents.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0133a {
            private C0133a() {
            }

            public /* synthetic */ C0133a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected ObjectStreamClass readClassDescriptor() {
            Class cls;
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (!kotlin.jvm.internal.n.a(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                cls = kotlin.jvm.internal.n.a(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2") ? d.b.class : a.b.class;
                kotlin.jvm.internal.n.d(resultClassDescriptor, "resultClassDescriptor");
                return resultClassDescriptor;
            }
            resultClassDescriptor = ObjectStreamClass.lookup(cls);
            kotlin.jvm.internal.n.d(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    private f() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0099 A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x0028, B:14:0x002b, B:17:0x0099, B:23:0x0036, B:36:0x0056, B:38:0x0059, B:41:0x0064, B:33:0x0068, B:44:0x006d, B:46:0x0070, B:47:0x0082, B:50:0x007b, B:27:0x0084, B:29:0x0087, B:32:0x0092), top: B:3:0x0003, inners: #3, #7, #9, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized com.facebook.appevents.i0 a() {
        /*
            java.lang.Class<com.facebook.appevents.f> r0 = com.facebook.appevents.f.class
            monitor-enter(r0)
            q4.g.b()     // Catch: java.lang.Throwable -> La0
            android.content.Context r1 = i4.e0.l()     // Catch: java.lang.Throwable -> La0
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L83
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            kotlin.jvm.internal.n.d(r3, r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L83
            com.facebook.appevents.f$a r4 = new com.facebook.appevents.f$a     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L83
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L83
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L83
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L83
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L6c java.io.FileNotFoundException -> L84
            if (r3 == 0) goto L3f
            com.facebook.appevents.i0 r3 = (com.facebook.appevents.i0) r3     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L6c java.io.FileNotFoundException -> L84
            com.facebook.internal.n0.j(r4)     // Catch: java.lang.Throwable -> La0
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> La0
            r1.delete()     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> La0
            goto L3d
        L35:
            r1 = move-exception
            java.lang.String r2 = com.facebook.appevents.f.f7616b     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch: java.lang.Throwable -> La0
        L3d:
            r2 = r3
            goto L97
        L3f:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L6c java.io.FileNotFoundException -> L84
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L6c java.io.FileNotFoundException -> L84
            throw r3     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L6c java.io.FileNotFoundException -> L84
        L47:
            r3 = move-exception
            goto L4f
        L49:
            r3 = move-exception
            r4 = r2
            r2 = r3
            goto L6d
        L4d:
            r3 = move-exception
            r4 = r2
        L4f:
            java.lang.String r5 = com.facebook.appevents.f.f7616b     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L6c
            com.facebook.internal.n0.j(r4)     // Catch: java.lang.Throwable -> La0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> La0
            r1.delete()     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> La0
            goto L97
        L63:
            r1 = move-exception
            java.lang.String r3 = com.facebook.appevents.f.f7616b     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L68:
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> La0
            goto L97
        L6c:
            r2 = move-exception
        L6d:
            com.facebook.internal.n0.j(r4)     // Catch: java.lang.Throwable -> La0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> La0
            r1.delete()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> La0
            goto L82
        L7a:
            r1 = move-exception
            java.lang.String r3 = com.facebook.appevents.f.f7616b     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> La0
        L82:
            throw r2     // Catch: java.lang.Throwable -> La0
        L83:
            r4 = r2
        L84:
            com.facebook.internal.n0.j(r4)     // Catch: java.lang.Throwable -> La0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La0
            r1.delete()     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La0
            goto L97
        L91:
            r1 = move-exception
            java.lang.String r3 = com.facebook.appevents.f.f7616b     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L68
        L97:
            if (r2 != 0) goto L9e
            com.facebook.appevents.i0 r2 = new com.facebook.appevents.i0     // Catch: java.lang.Throwable -> La0
            r2.<init>()     // Catch: java.lang.Throwable -> La0
        L9e:
            monitor-exit(r0)
            return r2
        La0:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.f.a():com.facebook.appevents.i0");
    }

    public static final void b(i0 i0Var) {
        Context l10 = i4.e0.l();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(l10.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(i0Var);
                n0.j(objectOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(f7616b, "Got unexpected exception while persisting events: ", th);
                    try {
                        l10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                } finally {
                    n0.j(objectOutputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
