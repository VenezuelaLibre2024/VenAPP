package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.t0;
import androidx.core.view.x0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f690a;

    /* renamed from: b, reason: collision with root package name */
    final m f691b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f692c;

    /* renamed from: d, reason: collision with root package name */
    private final int f693d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f694e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f695f;

    /* renamed from: g, reason: collision with root package name */
    ListView f696g;

    /* renamed from: h, reason: collision with root package name */
    private View f697h;

    /* renamed from: i, reason: collision with root package name */
    private int f698i;

    /* renamed from: j, reason: collision with root package name */
    private int f699j;

    /* renamed from: k, reason: collision with root package name */
    private int f700k;

    /* renamed from: l, reason: collision with root package name */
    private int f701l;

    /* renamed from: m, reason: collision with root package name */
    private int f702m;

    /* renamed from: o, reason: collision with root package name */
    Button f704o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f705p;

    /* renamed from: q, reason: collision with root package name */
    Message f706q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f707r;

    /* renamed from: s, reason: collision with root package name */
    Button f708s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f709t;

    /* renamed from: u, reason: collision with root package name */
    Message f710u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f711v;

    /* renamed from: w, reason: collision with root package name */
    Button f712w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f713x;

    /* renamed from: y, reason: collision with root package name */
    Message f714y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f715z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f703n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: a, reason: collision with root package name */
        private final int f716a;

        /* renamed from: b, reason: collision with root package name */
        private final int f717b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f15414c2);
            this.f717b = obtainStyledAttributes.getDimensionPixelOffset(g.j.f15419d2, -1);
            this.f716a = obtainStyledAttributes.getDimensionPixelOffset(g.j.f15424e2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f716a, getPaddingRight(), z11 ? getPaddingBottom() : this.f717b);
        }
    }

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f704o || (message2 = alertController.f706q) == null) && (view != alertController.f708s || (message2 = alertController.f710u) == null)) ? (view != alertController.f712w || (message = alertController.f714y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f691b).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;

        /* renamed from: a, reason: collision with root package name */
        public final Context f719a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f720b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f722d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f724f;

        /* renamed from: g, reason: collision with root package name */
        public View f725g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f726h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f727i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f728j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f729k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f730l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f731m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f732n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f733o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f734p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f735q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f737s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f738t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f739u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f740v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f741w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f742x;

        /* renamed from: y, reason: collision with root package name */
        public int f743y;

        /* renamed from: z, reason: collision with root package name */
        public View f744z;

        /* renamed from: c, reason: collision with root package name */
        public int f721c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f723e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean O = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f736r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f745a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f745a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f745a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0017b extends CursorAdapter {

            /* renamed from: a, reason: collision with root package name */
            private final int f747a;

            /* renamed from: b, reason: collision with root package name */
            private final int f748b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f749c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f750d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0017b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f749c = recycleListView;
                this.f750d = alertController;
                Cursor cursor2 = getCursor();
                this.f747a = cursor2.getColumnIndexOrThrow(b.this.L);
                this.f748b = cursor2.getColumnIndexOrThrow(b.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f747a));
                this.f749c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f748b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f720b.inflate(this.f750d.M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f752a;

            c(AlertController alertController) {
                this.f752a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                b.this.f742x.onClick(this.f752a.f691b, i10);
                if (b.this.H) {
                    return;
                }
                this.f752a.f691b.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f754a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f755b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f754a = recycleListView;
                this.f755b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f754a.isItemChecked(i10);
                }
                b.this.J.onClick(this.f755b.f691b, i10, this.f754a.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f719a = context;
            this.f720b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f720b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L26
                androidx.appcompat.app.AlertController$b$a r9 = new androidx.appcompat.app.AlertController$b$a
                android.content.Context r3 = r10.f719a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f740v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L26:
                androidx.appcompat.app.AlertController$b$b r9 = new androidx.appcompat.app.AlertController$b$b
                android.content.Context r3 = r10.f719a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.H
                if (r1 == 0) goto L3c
                int r1 = r11.N
                goto L3e
            L3c:
                int r1 = r11.O
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f719a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.f741w
                if (r9 == 0) goto L62
                goto L6b
            L62:
                androidx.appcompat.app.AlertController$d r9 = new androidx.appcompat.app.AlertController$d
                android.content.Context r1 = r10.f719a
                java.lang.CharSequence[] r3 = r10.f740v
                r9.<init>(r1, r4, r2, r3)
            L6b:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f742x
                if (r1 == 0) goto L7e
                androidx.appcompat.app.AlertController$b$c r1 = new androidx.appcompat.app.AlertController$b$c
                r1.<init>(r11)
            L7a:
                r0.setOnItemClickListener(r1)
                goto L88
            L7e:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L88
                androidx.appcompat.app.AlertController$b$d r1 = new androidx.appcompat.app.AlertController$b$d
                r1.<init>(r0, r11)
                goto L7a
            L88:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.N
                if (r1 == 0) goto L8f
                r0.setOnItemSelectedListener(r1)
            L8f:
                boolean r1 = r10.H
                if (r1 == 0) goto L97
                r0.setChoiceMode(r8)
                goto L9f
            L97:
                boolean r1 = r10.G
                if (r1 == 0) goto L9f
                r1 = 2
                r0.setChoiceMode(r1)
            L9f:
                r11.f696g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.b.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f725g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f724f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f722d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i10 = this.f721c;
                if (i10 != 0) {
                    alertController.l(i10);
                }
                int i11 = this.f723e;
                if (i11 != 0) {
                    alertController.l(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f726h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f727i;
            if (charSequence3 != null || this.f728j != null) {
                alertController.j(-1, charSequence3, this.f729k, null, this.f728j);
            }
            CharSequence charSequence4 = this.f730l;
            if (charSequence4 != null || this.f731m != null) {
                alertController.j(-2, charSequence4, this.f732n, null, this.f731m);
            }
            CharSequence charSequence5 = this.f733o;
            if (charSequence5 != null || this.f734p != null) {
                alertController.j(-3, charSequence5, this.f735q, null, this.f734p);
            }
            if (this.f740v != null || this.K != null || this.f741w != null) {
                b(alertController);
            }
            View view2 = this.f744z;
            if (view2 != null) {
                if (this.E) {
                    alertController.s(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.r(view2);
                    return;
                }
            }
            int i12 = this.f743y;
            if (i12 != 0) {
                alertController.q(i12);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f757a;

        public c(DialogInterface dialogInterface) {
            this.f757a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f757a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, m mVar, Window window) {
        this.f690a = context;
        this.f691b = mVar;
        this.f692c = window;
        this.R = new c(mVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, g.j.F, g.a.f15274n, 0);
        this.J = obtainStyledAttributes.getResourceId(g.j.G, 0);
        this.K = obtainStyledAttributes.getResourceId(g.j.I, 0);
        this.L = obtainStyledAttributes.getResourceId(g.j.K, 0);
        this.M = obtainStyledAttributes.getResourceId(g.j.L, 0);
        this.N = obtainStyledAttributes.getResourceId(g.j.N, 0);
        this.O = obtainStyledAttributes.getResourceId(g.j.J, 0);
        this.P = obtainStyledAttributes.getBoolean(g.j.M, true);
        this.f693d = obtainStyledAttributes.getDimensionPixelSize(g.j.H, 0);
        obtainStyledAttributes.recycle();
        mVar.g(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i10 = this.K;
        return (i10 != 0 && this.Q == 1) ? i10 : this.J;
    }

    private void o(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f692c.findViewById(g.f.f15359v);
        View findViewById2 = this.f692c.findViewById(g.f.f15358u);
        x0.j0(view, i10, i11);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        int i10;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(R.id.button1);
        this.f704o = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f705p) && this.f707r == null) {
            this.f704o.setVisibility(8);
            i10 = 0;
        } else {
            this.f704o.setText(this.f705p);
            Drawable drawable = this.f707r;
            if (drawable != null) {
                int i11 = this.f693d;
                drawable.setBounds(0, 0, i11, i11);
                this.f704o.setCompoundDrawables(this.f707r, null, null, null);
            }
            this.f704o.setVisibility(0);
            i10 = 1;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button2);
        this.f708s = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f709t) && this.f711v == null) {
            this.f708s.setVisibility(8);
        } else {
            this.f708s.setText(this.f709t);
            Drawable drawable2 = this.f711v;
            if (drawable2 != null) {
                int i12 = this.f693d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f708s.setCompoundDrawables(this.f711v, null, null, null);
            }
            this.f708s.setVisibility(0);
            i10 |= 2;
        }
        Button button4 = (Button) viewGroup.findViewById(R.id.button3);
        this.f712w = button4;
        button4.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f713x) && this.f715z == null) {
            this.f712w.setVisibility(8);
        } else {
            this.f712w.setText(this.f713x);
            Drawable drawable3 = this.f715z;
            if (drawable3 != null) {
                int i13 = this.f693d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f712w.setCompoundDrawables(this.f715z, null, null, null);
            }
            this.f712w.setVisibility(0);
            i10 |= 4;
        }
        if (y(this.f690a)) {
            if (i10 == 1) {
                button = this.f704o;
            } else if (i10 == 2) {
                button = this.f708s;
            } else if (i10 == 4) {
                button = this.f712w;
            }
            b(button);
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f692c.findViewById(g.f.f15360w);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f695f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f696g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f696g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View view = this.f697h;
        if (view == null) {
            view = this.f698i != 0 ? LayoutInflater.from(this.f690a).inflate(this.f698i, viewGroup, false) : null;
        }
        boolean z10 = view != null;
        if (!z10 || !a(view)) {
            this.f692c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f692c.findViewById(g.f.f15351n);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f703n) {
            frameLayout.setPadding(this.f699j, this.f700k, this.f701l, this.f702m);
        }
        if (this.f696g != null) {
            ((LinearLayout.LayoutParams) ((t0.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.view.View] */
    private void w(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            viewGroup2 = this.f692c.findViewById(g.f.O);
        } else {
            this.D = (ImageView) this.f692c.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(this.f694e)) && this.P) {
                TextView textView = (TextView) this.f692c.findViewById(g.f.f15347j);
                this.E = textView;
                textView.setText(this.f694e);
                int i10 = this.B;
                if (i10 != 0) {
                    this.D.setImageResource(i10);
                    return;
                }
                Drawable drawable = this.C;
                if (drawable != null) {
                    this.D.setImageDrawable(drawable);
                    return;
                } else {
                    this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
                    this.D.setVisibility(8);
                    return;
                }
            }
            this.f692c.findViewById(g.f.O).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup2 = viewGroup;
        }
        viewGroup2.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
    
        r1.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009d, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void x() {
        /*
            r8 = this;
            android.view.Window r0 = r8.f692c
            int r1 = g.f.f15357t
            android.view.View r0 = r0.findViewById(r1)
            int r1 = g.f.P
            android.view.View r2 = r0.findViewById(r1)
            int r3 = g.f.f15350m
            android.view.View r4 = r0.findViewById(r3)
            int r5 = g.f.f15348k
            android.view.View r6 = r0.findViewById(r5)
            int r7 = g.f.f15352o
            android.view.View r0 = r0.findViewById(r7)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.v(r0)
            android.view.View r1 = r0.findViewById(r1)
            android.view.View r3 = r0.findViewById(r3)
            android.view.View r5 = r0.findViewById(r5)
            android.view.ViewGroup r1 = r8.h(r1, r2)
            android.view.ViewGroup r2 = r8.h(r3, r4)
            android.view.ViewGroup r3 = r8.h(r5, r6)
            r8.u(r2)
            r8.t(r3)
            r8.w(r1)
            int r0 = r0.getVisibility()
            r4 = 8
            r5 = 1
            r6 = 0
            if (r0 == r4) goto L52
            r0 = r5
            goto L53
        L52:
            r0 = r6
        L53:
            if (r1 == 0) goto L5d
            int r7 = r1.getVisibility()
            if (r7 == r4) goto L5d
            r7 = r5
            goto L5e
        L5d:
            r7 = r6
        L5e:
            if (r3 == 0) goto L68
            int r3 = r3.getVisibility()
            if (r3 == r4) goto L68
            r3 = r5
            goto L69
        L68:
            r3 = r6
        L69:
            if (r3 != 0) goto L78
            if (r2 == 0) goto L78
            int r4 = g.f.K
            android.view.View r4 = r2.findViewById(r4)
            if (r4 == 0) goto L78
            r4.setVisibility(r6)
        L78:
            if (r7 == 0) goto L95
            androidx.core.widget.NestedScrollView r4 = r8.A
            if (r4 == 0) goto L81
            r4.setClipToPadding(r5)
        L81:
            java.lang.CharSequence r4 = r8.f695f
            if (r4 != 0) goto L8c
            android.widget.ListView r4 = r8.f696g
            if (r4 == 0) goto L8a
            goto L8c
        L8a:
            r1 = 0
            goto L92
        L8c:
            int r4 = g.f.N
            android.view.View r1 = r1.findViewById(r4)
        L92:
            if (r1 == 0) goto La2
            goto L9f
        L95:
            if (r2 == 0) goto La2
            int r1 = g.f.L
            android.view.View r1 = r2.findViewById(r1)
            if (r1 == 0) goto La2
        L9f:
            r1.setVisibility(r6)
        La2:
            android.widget.ListView r1 = r8.f696g
            boolean r4 = r1 instanceof androidx.appcompat.app.AlertController.RecycleListView
            if (r4 == 0) goto Lad
            androidx.appcompat.app.AlertController$RecycleListView r1 = (androidx.appcompat.app.AlertController.RecycleListView) r1
            r1.a(r7, r3)
        Lad:
            if (r0 != 0) goto Lc1
            android.widget.ListView r0 = r8.f696g
            if (r0 == 0) goto Lb4
            goto Lb6
        Lb4:
            androidx.core.widget.NestedScrollView r0 = r8.A
        Lb6:
            if (r0 == 0) goto Lc1
            if (r3 == 0) goto Lbb
            r6 = 2
        Lbb:
            r1 = r7 | r6
            r3 = 3
            r8.o(r2, r0, r1, r3)
        Lc1:
            android.widget.ListView r0 = r8.f696g
            if (r0 == 0) goto Ld7
            android.widget.ListAdapter r1 = r8.H
            if (r1 == 0) goto Ld7
            r0.setAdapter(r1)
            int r1 = r8.I
            r2 = -1
            if (r1 <= r2) goto Ld7
            r0.setItemChecked(r1, r5)
            r0.setSelection(r1)
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.x():void");
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(g.a.f15273m, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f690a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f696g;
    }

    public void e() {
        this.f691b.setContentView(i());
        x();
    }

    public boolean f(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.m(keyEvent);
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.m(keyEvent);
    }

    public void j(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f713x = charSequence;
            this.f714y = message;
            this.f715z = drawable;
        } else if (i10 == -2) {
            this.f709t = charSequence;
            this.f710u = message;
            this.f711v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f705p = charSequence;
            this.f706q = message;
            this.f707r = drawable;
        }
    }

    public void k(View view) {
        this.G = view;
    }

    public void l(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f695f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f694e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i10) {
        this.f697h = null;
        this.f698i = i10;
        this.f703n = false;
    }

    public void r(View view) {
        this.f697h = view;
        this.f698i = 0;
        this.f703n = false;
    }

    public void s(View view, int i10, int i11, int i12, int i13) {
        this.f697h = view;
        this.f698i = 0;
        this.f703n = true;
        this.f699j = i10;
        this.f700k = i11;
        this.f701l = i12;
        this.f702m = i13;
    }
}
