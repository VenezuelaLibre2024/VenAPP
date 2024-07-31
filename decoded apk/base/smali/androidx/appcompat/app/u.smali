.class Landroidx/appcompat/app/u;
.super Landroidx/appcompat/app/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/app/u$d;,
        Landroidx/appcompat/app/u$c;,
        Landroidx/appcompat/app/u$e;
    }
.end annotation


# instance fields
.field final a:Landroidx/appcompat/widget/o0;

.field final b:Landroid/view/Window$Callback;

.field final c:Landroidx/appcompat/app/h$g;

.field d:Z

.field private e:Z

.field private f:Z

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/appcompat/app/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/lang/Runnable;

.field private final i:Landroidx/appcompat/widget/Toolbar$h;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V
    .locals 3

    invoke-direct {p0}, Landroidx/appcompat/app/a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/app/u;->g:Ljava/util/ArrayList;

    new-instance v0, Landroidx/appcompat/app/u$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/u$a;-><init>(Landroidx/appcompat/app/u;)V

    iput-object v0, p0, Landroidx/appcompat/app/u;->h:Ljava/lang/Runnable;

    new-instance v0, Landroidx/appcompat/app/u$b;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/u$b;-><init>(Landroidx/appcompat/app/u;)V

    iput-object v0, p0, Landroidx/appcompat/app/u;->i:Landroidx/appcompat/widget/Toolbar$h;

    invoke-static {p1}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Landroidx/appcompat/widget/p1;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Landroidx/appcompat/widget/p1;-><init>(Landroidx/appcompat/widget/Toolbar;Z)V

    iput-object v1, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    invoke-static {p3}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/Window$Callback;

    iput-object v2, p0, Landroidx/appcompat/app/u;->b:Landroid/view/Window$Callback;

    invoke-interface {v1, p3}, Landroidx/appcompat/widget/o0;->setWindowCallback(Landroid/view/Window$Callback;)V

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(Landroidx/appcompat/widget/Toolbar$h;)V

    invoke-interface {v1, p2}, Landroidx/appcompat/widget/o0;->setWindowTitle(Ljava/lang/CharSequence;)V

    new-instance p1, Landroidx/appcompat/app/u$e;

    invoke-direct {p1, p0}, Landroidx/appcompat/app/u$e;-><init>(Landroidx/appcompat/app/u;)V

    iput-object p1, p0, Landroidx/appcompat/app/u;->c:Landroidx/appcompat/app/h$g;

    return-void
.end method

.method private A()Landroid/view/Menu;
    .locals 3

    iget-boolean v0, p0, Landroidx/appcompat/app/u;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    new-instance v1, Landroidx/appcompat/app/u$c;

    invoke-direct {v1, p0}, Landroidx/appcompat/app/u$c;-><init>(Landroidx/appcompat/app/u;)V

    new-instance v2, Landroidx/appcompat/app/u$d;

    invoke-direct {v2, p0}, Landroidx/appcompat/app/u$d;-><init>(Landroidx/appcompat/app/u;)V

    invoke-interface {v0, v1, v2}, Landroidx/appcompat/widget/o0;->u(Landroidx/appcompat/view/menu/m$a;Landroidx/appcompat/view/menu/g$a;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/app/u;->e:Z

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    invoke-interface {v0}, Landroidx/appcompat/widget/o0;->k()Landroid/view/Menu;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method B()V
    .locals 5

    invoke-direct {p0}, Landroidx/appcompat/app/u;->A()Landroid/view/Menu;

    move-result-object v0

    instance-of v1, v0, Landroidx/appcompat/view/menu/g;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Landroidx/appcompat/view/menu/g;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/g;->e0()V

    :cond_1
    :try_start_0
    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    iget-object v3, p0, Landroidx/appcompat/app/u;->b:Landroid/view/Window$Callback;

    const/4 v4, 0x0

    invoke-interface {v3, v4, v0}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Landroidx/appcompat/app/u;->b:Landroid/view/Window$Callback;

    invoke-interface {v3, v4, v2, v0}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    invoke-interface {v0}, Landroid/view/Menu;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/g;->d0()V

    :cond_4
    return-void

    :catchall_0
    move-exception v0

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/g;->d0()V

    :cond_5
    throw v0
.end method

.method public C(II)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    invoke-interface {v0}, Landroidx/appcompat/widget/o0;->w()I

    move-result v0

    iget-object v1, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    and-int/2addr p1, p2

    not-int p2, p2

    and-int/2addr p2, v0

    or-int/2addr p1, p2

    invoke-interface {v1, p1}, Landroidx/appcompat/widget/o0;->j(I)V

    return-void
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    invoke-interface {v0}, Landroidx/appcompat/widget/o0;->b()Z

    move-result v0

    return v0
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    invoke-interface {v0}, Landroidx/appcompat/widget/o0;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    invoke-interface {v0}, Landroidx/appcompat/widget/o0;->collapseActionView()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public h(Z)V
    .locals 3

    iget-boolean v0, p0, Landroidx/appcompat/app/u;->f:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Landroidx/appcompat/app/u;->f:Z

    iget-object v0, p0, Landroidx/appcompat/app/u;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Landroidx/appcompat/app/u;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/app/a$b;

    invoke-interface {v2, p1}, Landroidx/appcompat/app/a$b;->onMenuVisibilityChanged(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public i()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    invoke-interface {v0}, Landroidx/appcompat/widget/o0;->w()I

    move-result v0

    return v0
.end method

.method public j()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    invoke-interface {v0}, Landroidx/appcompat/widget/o0;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public k()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    const/16 v1, 0x8

    invoke-interface {v0, v1}, Landroidx/appcompat/widget/o0;->v(I)V

    return-void
.end method

.method public l()Z
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    invoke-interface {v0}, Landroidx/appcompat/widget/o0;->n()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/app/u;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    invoke-interface {v0}, Landroidx/appcompat/widget/o0;->n()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/app/u;->h:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Landroidx/core/view/x0;->R(Landroid/view/View;Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    return v0
.end method

.method public m()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    invoke-interface {v0}, Landroidx/appcompat/widget/o0;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public n(Landroid/content/res/Configuration;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/a;->n(Landroid/content/res/Configuration;)V

    return-void
.end method

.method o()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    invoke-interface {v0}, Landroidx/appcompat/widget/o0;->n()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/app/u;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public p(ILandroid/view/KeyEvent;)Z
    .locals 4

    invoke-direct {p0}, Landroidx/appcompat/app/u;->A()Landroid/view/Menu;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, -0x1

    :goto_0
    invoke-static {v2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    invoke-interface {v0, v3}, Landroid/view/Menu;->setQwertyMode(Z)V

    invoke-interface {v0, p1, p2, v1}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1

    :cond_2
    return v1
.end method

.method public q(Landroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/app/u;->r()Z

    :cond_0
    return v0
.end method

.method public r()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    invoke-interface {v0}, Landroidx/appcompat/widget/o0;->c()Z

    move-result v0

    return v0
.end method

.method public s(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    invoke-interface {v0, p1}, Landroidx/appcompat/widget/o0;->g(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public t(Z)V
    .locals 0

    return-void
.end method

.method public u(Z)V
    .locals 1

    const/16 v0, 0x8

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/u;->C(II)V

    return-void
.end method

.method public v(Z)V
    .locals 0

    return-void
.end method

.method public w(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    invoke-interface {v0, p1}, Landroidx/appcompat/widget/o0;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public x(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    invoke-interface {v0, p1}, Landroidx/appcompat/widget/o0;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public y()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/u;->a:Landroidx/appcompat/widget/o0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroidx/appcompat/widget/o0;->v(I)V

    return-void
.end method
