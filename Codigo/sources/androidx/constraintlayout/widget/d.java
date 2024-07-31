package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    private final ConstraintLayout f3102a;

    /* renamed from: b */
    e f3103b;

    /* renamed from: c */
    int f3104c = -1;

    /* renamed from: d */
    int f3105d = -1;

    /* renamed from: e */
    private SparseArray<a> f3106e = new SparseArray<>();

    /* renamed from: f */
    private SparseArray<e> f3107f = new SparseArray<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        int f3108a;

        /* renamed from: b */
        ArrayList<b> f3109b = new ArrayList<>();

        /* renamed from: c */
        int f3110c;

        /* renamed from: d */
        e f3111d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f3110c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.U6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.V6) {
                    this.f3108a = obtainStyledAttributes.getResourceId(index, this.f3108a);
                } else if (index == k.W6) {
                    this.f3110c = obtainStyledAttributes.getResourceId(index, this.f3110c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3110c);
                    context.getResources().getResourceName(this.f3110c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f3111d = eVar;
                        eVar.e(context, this.f3110c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f3109b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f3109b.size(); i10++) {
                if (this.f3109b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        float f3112a;

        /* renamed from: b */
        float f3113b;

        /* renamed from: c */
        float f3114c;

        /* renamed from: d */
        float f3115d;

        /* renamed from: e */
        int f3116e;

        /* renamed from: f */
        e f3117f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f3112a = Float.NaN;
            this.f3113b = Float.NaN;
            this.f3114c = Float.NaN;
            this.f3115d = Float.NaN;
            this.f3116e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.f3403s7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.f3412t7) {
                    this.f3116e = obtainStyledAttributes.getResourceId(index, this.f3116e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3116e);
                    context.getResources().getResourceName(this.f3116e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f3117f = eVar;
                        eVar.e(context, this.f3116e);
                    }
                } else if (index == k.f3421u7) {
                    this.f3115d = obtainStyledAttributes.getDimension(index, this.f3115d);
                } else if (index == k.f3430v7) {
                    this.f3113b = obtainStyledAttributes.getDimension(index, this.f3113b);
                } else if (index == k.f3439w7) {
                    this.f3114c = obtainStyledAttributes.getDimension(index, this.f3114c);
                } else if (index == k.f3448x7) {
                    this.f3112a = obtainStyledAttributes.getDimension(index, this.f3112a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f3112a) && f10 < this.f3112a) {
                return false;
            }
            if (!Float.isNaN(this.f3113b) && f11 < this.f3113b) {
                return false;
            }
            if (Float.isNaN(this.f3114c) || f10 <= this.f3114c) {
                return Float.isNaN(this.f3115d) || f11 <= this.f3115d;
            }
            return false;
        }
    }

    public d(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f3102a = constraintLayout;
        a(context, i10);
    }

    private void a(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                char c10 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    c10 = 65535;
                    if (c10 == 2) {
                        aVar = new a(context, xml);
                        this.f3106e.put(aVar.f3108a, aVar);
                    } else if (c10 == 3) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.a(bVar);
                        }
                    } else if (c10 == 4) {
                        b(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && FacebookMediationAdapter.KEY_ID.equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), FacebookMediationAdapter.KEY_ID, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                eVar.k(context, xmlPullParser);
                this.f3107f.put(identifier, eVar);
                return;
            }
        }
    }

    public void c(g gVar) {
    }

    public void d(int i10, float f10, float f11) {
        int b10;
        int i11 = this.f3104c;
        if (i11 == i10) {
            a valueAt = i10 == -1 ? this.f3106e.valueAt(0) : this.f3106e.get(i11);
            int i12 = this.f3105d;
            if ((i12 == -1 || !valueAt.f3109b.get(i12).a(f10, f11)) && this.f3105d != (b10 = valueAt.b(f10, f11))) {
                e eVar = b10 == -1 ? this.f3103b : valueAt.f3109b.get(b10).f3117f;
                if (b10 != -1) {
                    int i13 = valueAt.f3109b.get(b10).f3116e;
                }
                if (eVar == null) {
                    return;
                }
                this.f3105d = b10;
                eVar.c(this.f3102a);
                return;
            }
            return;
        }
        this.f3104c = i10;
        a aVar = this.f3106e.get(i10);
        int b11 = aVar.b(f10, f11);
        e eVar2 = b11 == -1 ? aVar.f3111d : aVar.f3109b.get(b11).f3117f;
        if (b11 != -1) {
            int i14 = aVar.f3109b.get(b11).f3116e;
        }
        if (eVar2 != null) {
            this.f3105d = b11;
            eVar2.c(this.f3102a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
    }
}
