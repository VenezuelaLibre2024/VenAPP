package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC0220c;
import androidx.appcompat.view.menu.InterfaceC0266m;
import p111g.C7383g;

/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
class DialogInterfaceOnKeyListenerC0261h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0266m.a {

    /* renamed from: a */
    private C0260g f1289a;

    /* renamed from: b */
    private DialogInterfaceC0220c f1290b;

    /* renamed from: c */
    C0258e f1291c;

    /* renamed from: d */
    private InterfaceC0266m.a f1292d;

    public DialogInterfaceOnKeyListenerC0261h(C0260g c0260g) {
        this.f1289a = c0260g;
    }

    /* renamed from: a */
    public void m1349a() {
        DialogInterfaceC0220c dialogInterfaceC0220c = this.f1290b;
        if (dialogInterfaceC0220c != null) {
            dialogInterfaceC0220c.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m.a
    /* renamed from: b */
    public void mo1035b(C0260g c0260g, boolean z10) {
        if (z10 || c0260g == this.f1289a) {
            m1349a();
        }
        InterfaceC0266m.a aVar = this.f1292d;
        if (aVar != null) {
            aVar.mo1035b(c0260g, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m.a
    /* renamed from: c */
    public boolean mo1036c(C0260g c0260g) {
        InterfaceC0266m.a aVar = this.f1292d;
        if (aVar != null) {
            return aVar.mo1036c(c0260g);
        }
        return false;
    }

    /* renamed from: d */
    public void m1350d(IBinder iBinder) {
        C0260g c0260g = this.f1289a;
        DialogInterfaceC0220c.a aVar = new DialogInterfaceC0220c.a(c0260g.m1343u());
        C0258e c0258e = new C0258e(aVar.getContext(), C7383g.f16844j);
        this.f1291c = c0258e;
        c0258e.mo1244d(this);
        this.f1289a.m1325b(this.f1291c);
        aVar.m907a(this.f1291c.m1284a(), this);
        View m1347y = c0260g.m1347y();
        if (m1347y != null) {
            aVar.m908b(m1347y);
        } else {
            aVar.m909c(c0260g.m1345w()).setTitle(c0260g.m1346x());
        }
        aVar.m913g(this);
        DialogInterfaceC0220c create = aVar.create();
        this.f1290b = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1290b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1290b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f1289a.m1310L((C0262i) this.f1291c.m1284a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1291c.mo1242b(this.f1289a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1290b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1290b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1289a.m1330e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1289a.performShortcut(i10, keyEvent, 0);
    }
}
