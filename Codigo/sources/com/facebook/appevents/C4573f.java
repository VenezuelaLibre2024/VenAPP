package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.appevents.C4563a;
import com.facebook.appevents.C4569d;
import com.facebook.internal.C4634n0;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;

/* renamed from: com.facebook.appevents.f */
/* loaded from: classes.dex */
public final class C4573f {

    /* renamed from: a */
    public static final C4573f f8590a = new C4573f();

    /* renamed from: b */
    private static final String f8591b = C4573f.class.getName();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.appevents.f$a */
    /* loaded from: classes.dex */
    public static final class a extends ObjectInputStream {

        /* renamed from: a */
        public static final C13179a f8592a = new C13179a(null);

        /* renamed from: com.facebook.appevents.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C13179a {
            private C13179a() {
            }

            public /* synthetic */ C13179a(C9315g c9315g) {
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
            if (!C9322n.m27777a(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                cls = C9322n.m27777a(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2") ? C4569d.b.class : C4563a.b.class;
                C9322n.m27780d(resultClassDescriptor, "resultClassDescriptor");
                return resultClassDescriptor;
            }
            resultClassDescriptor = ObjectStreamClass.lookup(cls);
            C9322n.m27780d(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    private C4573f() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0099 A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x0028, B:14:0x002b, B:17:0x0099, B:23:0x0036, B:36:0x0056, B:38:0x0059, B:41:0x0064, B:33:0x0068, B:44:0x006d, B:46:0x0070, B:47:0x0082, B:50:0x007b, B:27:0x0084, B:29:0x0087, B:32:0x0092), top: B:3:0x0003, inners: #3, #7, #9, #10 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized com.facebook.appevents.C4580i0 m10986a() {
        /*
            java.lang.Class<com.facebook.appevents.f> r0 = com.facebook.appevents.C4573f.class
            monitor-enter(r0)
            p303q4.C10267g.m30745b()     // Catch: java.lang.Throwable -> La0
            android.content.Context r1 = p152i4.C7799e0.m23860l()     // Catch: java.lang.Throwable -> La0
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L83
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            kotlin.jvm.internal.C9322n.m27780d(r3, r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L83
            com.facebook.appevents.f$a r4 = new com.facebook.appevents.f$a     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L83
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L83
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L83
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d java.io.FileNotFoundException -> L83
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L6c java.io.FileNotFoundException -> L84
            if (r3 == 0) goto L3f
            com.facebook.appevents.i0 r3 = (com.facebook.appevents.C4580i0) r3     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L6c java.io.FileNotFoundException -> L84
            com.facebook.internal.C4634n0.m11311j(r4)     // Catch: java.lang.Throwable -> La0
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> La0
            r1.delete()     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> La0
            goto L3d
        L35:
            r1 = move-exception
            java.lang.String r2 = com.facebook.appevents.C4573f.f8591b     // Catch: java.lang.Throwable -> La0
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
            java.lang.String r5 = com.facebook.appevents.C4573f.f8591b     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L6c
            com.facebook.internal.C4634n0.m11311j(r4)     // Catch: java.lang.Throwable -> La0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> La0
            r1.delete()     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> La0
            goto L97
        L63:
            r1 = move-exception
            java.lang.String r3 = com.facebook.appevents.C4573f.f8591b     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L68:
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> La0
            goto L97
        L6c:
            r2 = move-exception
        L6d:
            com.facebook.internal.C4634n0.m11311j(r4)     // Catch: java.lang.Throwable -> La0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> La0
            r1.delete()     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> La0
            goto L82
        L7a:
            r1 = move-exception
            java.lang.String r3 = com.facebook.appevents.C4573f.f8591b     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> La0
        L82:
            throw r2     // Catch: java.lang.Throwable -> La0
        L83:
            r4 = r2
        L84:
            com.facebook.internal.C4634n0.m11311j(r4)     // Catch: java.lang.Throwable -> La0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La0
            r1.delete()     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La0
            goto L97
        L91:
            r1 = move-exception
            java.lang.String r3 = com.facebook.appevents.C4573f.f8591b     // Catch: java.lang.Throwable -> La0
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C4573f.m10986a():com.facebook.appevents.i0");
    }

    /* renamed from: b */
    public static final void m10987b(C4580i0 c4580i0) {
        Context m23860l = C7799e0.m23860l();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(m23860l.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(c4580i0);
                C4634n0.m11311j(objectOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(f8591b, "Got unexpected exception while persisting events: ", th);
                    try {
                        m23860l.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                } finally {
                    C4634n0.m11311j(objectOutputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
