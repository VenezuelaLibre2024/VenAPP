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

/* renamed from: androidx.constraintlayout.widget.d */
/* loaded from: classes.dex */
public class C0762d {

    /* renamed from: a */
    private final ConstraintLayout f3506a;

    /* renamed from: b */
    C0763e f3507b;

    /* renamed from: c */
    int f3508c = -1;

    /* renamed from: d */
    int f3509d = -1;

    /* renamed from: e */
    private SparseArray<a> f3510e = new SparseArray<>();

    /* renamed from: f */
    private SparseArray<C0763e> f3511f = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.d$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        int f3512a;

        /* renamed from: b */
        ArrayList<b> f3513b = new ArrayList<>();

        /* renamed from: c */
        int f3514c;

        /* renamed from: d */
        C0763e f3515d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f3514c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0769k.f3843U6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C0769k.f3851V6) {
                    this.f3512a = obtainStyledAttributes.getResourceId(index, this.f3512a);
                } else if (index == C0769k.f3859W6) {
                    this.f3514c = obtainStyledAttributes.getResourceId(index, this.f3514c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3514c);
                    context.getResources().getResourceName(this.f3514c);
                    if ("layout".equals(resourceTypeName)) {
                        C0763e c0763e = new C0763e();
                        this.f3515d = c0763e;
                        c0763e.m3875e(context, this.f3514c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        void m3860a(b bVar) {
            this.f3513b.add(bVar);
        }

        /* renamed from: b */
        public int m3861b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f3513b.size(); i10++) {
                if (this.f3513b.get(i10).m3862a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.d$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        float f3516a;

        /* renamed from: b */
        float f3517b;

        /* renamed from: c */
        float f3518c;

        /* renamed from: d */
        float f3519d;

        /* renamed from: e */
        int f3520e;

        /* renamed from: f */
        C0763e f3521f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f3516a = Float.NaN;
            this.f3517b = Float.NaN;
            this.f3518c = Float.NaN;
            this.f3519d = Float.NaN;
            this.f3520e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0769k.f4054s7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C0769k.f4063t7) {
                    this.f3520e = obtainStyledAttributes.getResourceId(index, this.f3520e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3520e);
                    context.getResources().getResourceName(this.f3520e);
                    if ("layout".equals(resourceTypeName)) {
                        C0763e c0763e = new C0763e();
                        this.f3521f = c0763e;
                        c0763e.m3875e(context, this.f3520e);
                    }
                } else if (index == C0769k.f4072u7) {
                    this.f3519d = obtainStyledAttributes.getDimension(index, this.f3519d);
                } else if (index == C0769k.f4081v7) {
                    this.f3517b = obtainStyledAttributes.getDimension(index, this.f3517b);
                } else if (index == C0769k.f4090w7) {
                    this.f3518c = obtainStyledAttributes.getDimension(index, this.f3518c);
                } else if (index == C0769k.f4099x7) {
                    this.f3516a = obtainStyledAttributes.getDimension(index, this.f3516a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        boolean m3862a(float f10, float f11) {
            if (!Float.isNaN(this.f3516a) && f10 < this.f3516a) {
                return false;
            }
            if (!Float.isNaN(this.f3517b) && f11 < this.f3517b) {
                return false;
            }
            if (Float.isNaN(this.f3518c) || f10 <= this.f3518c) {
                return Float.isNaN(this.f3519d) || f11 <= this.f3519d;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0762d(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f3506a = constraintLayout;
        m3856a(context, i10);
    }

    /* renamed from: a */
    private void m3856a(Context context, int i10) {
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
                        this.f3510e.put(aVar.f3512a, aVar);
                    } else if (c10 == 3) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.m3860a(bVar);
                        }
                    } else if (c10 == 4) {
                        m3857b(context, xml);
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

    /* renamed from: b */
    private void m3857b(Context context, XmlPullParser xmlPullParser) {
        C0763e c0763e = new C0763e();
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
                c0763e.m3879k(context, xmlPullParser);
                this.f3511f.put(identifier, c0763e);
                return;
            }
        }
    }

    /* renamed from: c */
    public void m3858c(AbstractC0765g abstractC0765g) {
    }

    /* renamed from: d */
    public void m3859d(int i10, float f10, float f11) {
        int m3861b;
        int i11 = this.f3508c;
        if (i11 == i10) {
            a valueAt = i10 == -1 ? this.f3510e.valueAt(0) : this.f3510e.get(i11);
            int i12 = this.f3509d;
            if ((i12 == -1 || !valueAt.f3513b.get(i12).m3862a(f10, f11)) && this.f3509d != (m3861b = valueAt.m3861b(f10, f11))) {
                C0763e c0763e = m3861b == -1 ? this.f3507b : valueAt.f3513b.get(m3861b).f3521f;
                if (m3861b != -1) {
                    int i13 = valueAt.f3513b.get(m3861b).f3520e;
                }
                if (c0763e == null) {
                    return;
                }
                this.f3509d = m3861b;
                c0763e.m3873c(this.f3506a);
                return;
            }
            return;
        }
        this.f3508c = i10;
        a aVar = this.f3510e.get(i10);
        int m3861b2 = aVar.m3861b(f10, f11);
        C0763e c0763e2 = m3861b2 == -1 ? aVar.f3515d : aVar.f3513b.get(m3861b2).f3521f;
        if (m3861b2 != -1) {
            int i14 = aVar.f3513b.get(m3861b2).f3520e;
        }
        if (c0763e2 != null) {
            this.f3509d = m3861b2;
            c0763e2.m3873c(this.f3506a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
    }
}
