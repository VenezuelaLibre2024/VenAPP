package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.core.provider.C0959e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p299q0.C10223g;

/* renamed from: androidx.core.content.res.d */
/* loaded from: classes.dex */
public class C0869d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.res.d$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static int m4435a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* renamed from: androidx.core.content.res.d$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* renamed from: androidx.core.content.res.d$c */
    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a */
        private final d[] f4340a;

        public c(d[] dVarArr) {
            this.f4340a = dVarArr;
        }

        /* renamed from: a */
        public d[] m4436a() {
            return this.f4340a;
        }
    }

    /* renamed from: androidx.core.content.res.d$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final String f4341a;

        /* renamed from: b */
        private final int f4342b;

        /* renamed from: c */
        private final boolean f4343c;

        /* renamed from: d */
        private final String f4344d;

        /* renamed from: e */
        private final int f4345e;

        /* renamed from: f */
        private final int f4346f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f4341a = str;
            this.f4342b = i10;
            this.f4343c = z10;
            this.f4344d = str2;
            this.f4345e = i11;
            this.f4346f = i12;
        }

        /* renamed from: a */
        public String m4437a() {
            return this.f4341a;
        }

        /* renamed from: b */
        public int m4438b() {
            return this.f4346f;
        }

        /* renamed from: c */
        public int m4439c() {
            return this.f4345e;
        }

        /* renamed from: d */
        public String m4440d() {
            return this.f4344d;
        }

        /* renamed from: e */
        public int m4441e() {
            return this.f4342b;
        }

        /* renamed from: f */
        public boolean m4442f() {
            return this.f4343c;
        }
    }

    /* renamed from: androidx.core.content.res.d$e */
    /* loaded from: classes.dex */
    public static final class e implements b {

        /* renamed from: a */
        private final C0959e f4347a;

        /* renamed from: b */
        private final int f4348b;

        /* renamed from: c */
        private final int f4349c;

        /* renamed from: d */
        private final String f4350d;

        public e(C0959e c0959e, int i10, int i11, String str) {
            this.f4347a = c0959e;
            this.f4349c = i10;
            this.f4348b = i11;
            this.f4350d = str;
        }

        /* renamed from: a */
        public int m4443a() {
            return this.f4349c;
        }

        /* renamed from: b */
        public C0959e m4444b() {
            return this.f4347a;
        }

        /* renamed from: c */
        public String m4445c() {
            return this.f4350d;
        }

        /* renamed from: d */
        public int m4446d() {
            return this.f4348b;
        }
    }

    /* renamed from: a */
    private static int m4427a(TypedArray typedArray, int i10) {
        return a.m4435a(typedArray, i10);
    }

    /* renamed from: b */
    public static b m4428b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m4430d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m4429c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m4427a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(m4434h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m4434h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static b m4430d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m4431e(xmlPullParser, resources);
        }
        m4433g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static b m4431e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C10223g.f25326h);
        String string = obtainAttributes.getString(C10223g.f25327i);
        String string2 = obtainAttributes.getString(C10223g.f25331m);
        String string3 = obtainAttributes.getString(C10223g.f25332n);
        int resourceId = obtainAttributes.getResourceId(C10223g.f25328j, 0);
        int integer = obtainAttributes.getInteger(C10223g.f25329k, 1);
        int integer2 = obtainAttributes.getInteger(C10223g.f25330l, 500);
        String string4 = obtainAttributes.getString(C10223g.f25333o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m4433g(xmlPullParser);
            }
            return new e(new C0959e(string, string2, string3, m4429c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m4432f(xmlPullParser, resources));
                } else {
                    m4433g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    /* renamed from: f */
    private static d m4432f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C10223g.f25334p);
        int i10 = C10223g.f25343y;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = C10223g.f25336r;
        }
        int i11 = obtainAttributes.getInt(i10, 400);
        int i12 = C10223g.f25341w;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = C10223g.f25337s;
        }
        boolean z10 = 1 == obtainAttributes.getInt(i12, 0);
        int i13 = C10223g.f25344z;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = C10223g.f25338t;
        }
        int i14 = C10223g.f25342x;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = C10223g.f25339u;
        }
        String string = obtainAttributes.getString(i14);
        int i15 = obtainAttributes.getInt(i13, 0);
        int i16 = C10223g.f25340v;
        if (!obtainAttributes.hasValue(i16)) {
            i16 = C10223g.f25335q;
        }
        int resourceId = obtainAttributes.getResourceId(i16, 0);
        String string2 = obtainAttributes.getString(i16);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m4433g(xmlPullParser);
        }
        return new d(string2, i11, z10, string, i15, resourceId);
    }

    /* renamed from: g */
    private static void m4433g(XmlPullParser xmlPullParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m4434h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
