.class Landroidx/appcompat/app/h$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "i"
.end annotation


# instance fields
.field private a:Landroidx/appcompat/view/b$a;

.field final synthetic b:Landroidx/appcompat/app/h;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/h;Landroidx/appcompat/view/b$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/h$i;->b:Landroidx/appcompat/app/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/app/h$i;->a:Landroidx/appcompat/view/b$a;

    return-void
.end method


# virtual methods
.method public a(Landroidx/appcompat/view/b;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/h$i;->a:Landroidx/appcompat/view/b$a;

    invoke-interface {v0, p1}, Landroidx/appcompat/view/b$a;->a(Landroidx/appcompat/view/b;)V

    iget-object p1, p0, Landroidx/appcompat/app/h$i;->b:Landroidx/appcompat/app/h;

    iget-object v0, p1, Landroidx/appcompat/app/h;->H:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object p1, p1, Landroidx/appcompat/app/h;->w:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Landroidx/appcompat/app/h$i;->b:Landroidx/appcompat/app/h;

    iget-object v0, v0, Landroidx/appcompat/app/h;->I:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/app/h$i;->b:Landroidx/appcompat/app/h;

    iget-object v0, p1, Landroidx/appcompat/app/h;->G:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/appcompat/app/h;->k0()V

    iget-object p1, p0, Landroidx/appcompat/app/h$i;->b:Landroidx/appcompat/app/h;

    iget-object v0, p1, Landroidx/appcompat/app/h;->G:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Landroidx/core/view/x0;->c(Landroid/view/View;)Landroidx/core/view/n2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/core/view/n2;->b(F)Landroidx/core/view/n2;

    move-result-object v0

    iput-object v0, p1, Landroidx/appcompat/app/h;->J:Landroidx/core/view/n2;

    iget-object p1, p0, Landroidx/appcompat/app/h$i;->b:Landroidx/appcompat/app/h;

    iget-object p1, p1, Landroidx/appcompat/app/h;->J:Landroidx/core/view/n2;

    new-instance v0, Landroidx/appcompat/app/h$i$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/h$i$a;-><init>(Landroidx/appcompat/app/h$i;)V

    invoke-virtual {p1, v0}, Landroidx/core/view/n2;->h(Landroidx/core/view/o2;)Landroidx/core/view/n2;

    :cond_1
    iget-object p1, p0, Landroidx/appcompat/app/h$i;->b:Landroidx/appcompat/app/h;

    iget-object v0, p1, Landroidx/appcompat/app/h;->y:Landroidx/appcompat/app/e;

    if-eqz v0, :cond_2

    iget-object p1, p1, Landroidx/appcompat/app/h;->F:Landroidx/appcompat/view/b;

    invoke-interface {v0, p1}, Landroidx/appcompat/app/e;->onSupportActionModeFinished(Landroidx/appcompat/view/b;)V

    :cond_2
    iget-object p1, p0, Landroidx/appcompat/app/h$i;->b:Landroidx/appcompat/app/h;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/appcompat/app/h;->F:Landroidx/appcompat/view/b;

    iget-object p1, p1, Landroidx/appcompat/app/h;->M:Landroid/view/ViewGroup;

    invoke-static {p1}, Landroidx/core/view/x0;->T(Landroid/view/View;)V

    iget-object p1, p0, Landroidx/appcompat/app/h$i;->b:Landroidx/appcompat/app/h;

    invoke-virtual {p1}, Landroidx/appcompat/app/h;->d1()V

    return-void
.end method

.method public b(Landroidx/appcompat/view/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/h$i;->a:Landroidx/appcompat/view/b$a;

    invoke-interface {v0, p1, p2}, Landroidx/appcompat/view/b$a;->b(Landroidx/appcompat/view/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public c(Landroidx/appcompat/view/b;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/h$i;->a:Landroidx/appcompat/view/b$a;

    invoke-interface {v0, p1, p2}, Landroidx/appcompat/view/b$a;->c(Landroidx/appcompat/view/b;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public d(Landroidx/appcompat/view/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/h$i;->b:Landroidx/appcompat/app/h;

    iget-object v0, v0, Landroidx/appcompat/app/h;->M:Landroid/view/ViewGroup;

    invoke-static {v0}, Landroidx/core/view/x0;->T(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/appcompat/app/h$i;->a:Landroidx/appcompat/view/b$a;

    invoke-interface {v0, p1, p2}, Landroidx/appcompat/view/b$a;->d(Landroidx/appcompat/view/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
