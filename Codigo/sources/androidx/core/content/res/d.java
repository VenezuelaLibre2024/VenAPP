package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final C0042d[] f3668a;

        public c(C0042d[] c0042dArr) {
            this.f3668a = c0042dArr;
        }

        public C0042d[] a() {
            return this.f3668a;
        }
    }

    /* renamed from: androidx.core.content.res.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0042d {

        /* renamed from: a, reason: collision with root package name */
        private final String f3669a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3670b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f3671c;

        /* renamed from: d, reason: collision with root package name */
        private final String f3672d;

        /* renamed from: e, reason: collision with root package name */
        private final int f3673e;

        /* renamed from: f, reason: collision with root package name */
        private final int f3674f;

        public C0042d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f3669a = str;
            this.f3670b = i10;
            this.f3671c = z10;
            this.f3672d = str2;
            this.f3673e = i11;
            this.f3674f = i12;
        }

        public String a() {
            return this.f3669a;
        }

        public int b() {
            return this.f3674f;
        }

        public int c() {
            return this.f3673e;
        }

        public String d() {
            return this.f3672d;
        }

        public int e() {
            return this.f3670b;
        }

        public boolean f() {
            return this.f3671c;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.core.provider.e f3675a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3676b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3677c;

        /* renamed from: d, reason: collision with root package name */
        private final String f3678d;

        public e(androidx.core.provider.e eVar, int i10, int i11, String str) {
            this.f3675a = eVar;
            this.f3677c = i10;
            this.f3676b = i11;
            this.f3678d = str;
        }

        public int a() {
            return this.f3677c;
        }

        public androidx.core.provider.e b() {
            return this.f3675a;
        }

        public String c() {
            return this.f3678d;
        }

        public int d() {
            return this.f3676b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), q0.g.f23358h);
        String string = obtainAttributes.getString(q0.g.f23359i);
        String string2 = obtainAttributes.getString(q0.g.f23363m);
        String string3 = obtainAttributes.getString(q0.g.f23364n);
        int resourceId = obtainAttributes.getResourceId(q0.g.f23360j, 0);
        int integer = obtainAttributes.getInteger(q0.g.f23361k, 1);
        int integer2 = obtainAttributes.getInteger(q0.g.f23362l, 500);
        String string4 = obtainAttributes.getString(q0.g.f23365o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new e(new androidx.core.provider.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((C0042d[]) arrayList.toArray(new C0042d[0]));
    }

    private static C0042d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), q0.g.f23366p);
        int i10 = q0.g.f23375y;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = q0.g.f23368r;
        }
        int i11 = obtainAttributes.getInt(i10, 400);
        int i12 = q0.g.f23373w;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = q0.g.f23369s;
        }
        boolean z10 = 1 == obtainAttributes.getInt(i12, 0);
        int i13 = q0.g.f23376z;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = q0.g.f23370t;
        }
        int i14 = q0.g.f23374x;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = q0.g.f23371u;
        }
        String string = obtainAttributes.getString(i14);
        int i15 = obtainAttributes.getInt(i13, 0);
        int i16 = q0.g.f23372v;
        if (!obtainAttributes.hasValue(i16)) {
            i16 = q0.g.f23367q;
        }
        int resourceId = obtainAttributes.getResourceId(i16, 0);
        String string2 = obtainAttributes.getString(i16);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0042d(string2, i11, z10, string, i15, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
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

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
