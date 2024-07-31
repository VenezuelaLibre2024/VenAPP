.class public Landroidx/core/view/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/x$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Runnable;

.field private final b:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Landroidx/core/view/m0;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/core/view/m0;",
            "Landroidx/core/view/x$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Landroidx/core/view/x;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/core/view/x;->c:Ljava/util/Map;

    iput-object p1, p0, Landroidx/core/view/x;->a:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic a(Landroidx/core/view/x;Landroidx/lifecycle/f$b;Landroidx/core/view/m0;Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/core/view/x;->g(Landroidx/lifecycle/f$b;Landroidx/core/view/m0;Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public static synthetic b(Landroidx/core/view/x;Landroidx/core/view/m0;Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/core/view/x;->f(Landroidx/core/view/m0;Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method private synthetic f(Landroidx/core/view/m0;Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V
    .locals 0

    sget-object p2, Landroidx/lifecycle/f$a;->ON_DESTROY:Landroidx/lifecycle/f$a;

    if-ne p3, p2, :cond_0

    invoke-virtual {p0, p1}, Landroidx/core/view/x;->l(Landroidx/core/view/m0;)V

    :cond_0
    return-void
.end method

.method private synthetic g(Landroidx/lifecycle/f$b;Landroidx/core/view/m0;Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V
    .locals 0

    invoke-static {p1}, Landroidx/lifecycle/f$a;->l(Landroidx/lifecycle/f$b;)Landroidx/lifecycle/f$a;

    move-result-object p3

    if-ne p4, p3, :cond_0

    invoke-virtual {p0, p2}, Landroidx/core/view/x;->c(Landroidx/core/view/m0;)V

    goto :goto_0

    :cond_0
    sget-object p3, Landroidx/lifecycle/f$a;->ON_DESTROY:Landroidx/lifecycle/f$a;

    if-ne p4, p3, :cond_1

    invoke-virtual {p0, p2}, Landroidx/core/view/x;->l(Landroidx/core/view/m0;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Landroidx/lifecycle/f$a;->h(Landroidx/lifecycle/f$b;)Landroidx/lifecycle/f$a;

    move-result-object p1

    if-ne p4, p1, :cond_2

    iget-object p1, p0, Landroidx/core/view/x;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Landroidx/core/view/x;->a:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public c(Landroidx/core/view/m0;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/x;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Landroidx/core/view/x;->a:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public d(Landroidx/core/view/m0;Landroidx/lifecycle/k;)V
    .locals 3

    invoke-virtual {p0, p1}, Landroidx/core/view/x;->c(Landroidx/core/view/m0;)V

    invoke-interface {p2}, Landroidx/lifecycle/k;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p2

    iget-object v0, p0, Landroidx/core/view/x;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/view/x$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/core/view/x$a;->a()V

    :cond_0
    new-instance v0, Landroidx/core/view/v;

    invoke-direct {v0, p0, p1}, Landroidx/core/view/v;-><init>(Landroidx/core/view/x;Landroidx/core/view/m0;)V

    iget-object v1, p0, Landroidx/core/view/x;->c:Ljava/util/Map;

    new-instance v2, Landroidx/core/view/x$a;

    invoke-direct {v2, p2, v0}, Landroidx/core/view/x$a;-><init>(Landroidx/lifecycle/f;Landroidx/lifecycle/i;)V

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public e(Landroidx/core/view/m0;Landroidx/lifecycle/k;Landroidx/lifecycle/f$b;)V
    .locals 2

    invoke-interface {p2}, Landroidx/lifecycle/k;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p2

    iget-object v0, p0, Landroidx/core/view/x;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/view/x$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/core/view/x$a;->a()V

    :cond_0
    new-instance v0, Landroidx/core/view/w;

    invoke-direct {v0, p0, p3, p1}, Landroidx/core/view/w;-><init>(Landroidx/core/view/x;Landroidx/lifecycle/f$b;Landroidx/core/view/m0;)V

    iget-object p3, p0, Landroidx/core/view/x;->c:Ljava/util/Map;

    new-instance v1, Landroidx/core/view/x$a;

    invoke-direct {v1, p2, v0}, Landroidx/core/view/x$a;-><init>(Landroidx/lifecycle/f;Landroidx/lifecycle/i;)V

    invoke-interface {p3, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public h(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 2

    iget-object v0, p0, Landroidx/core/view/x;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/core/view/m0;

    invoke-interface {v1, p1, p2}, Landroidx/core/view/m0;->d(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i(Landroid/view/Menu;)V
    .locals 2

    iget-object v0, p0, Landroidx/core/view/x;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/core/view/m0;

    invoke-interface {v1, p1}, Landroidx/core/view/m0;->a(Landroid/view/Menu;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public j(Landroid/view/MenuItem;)Z
    .locals 2

    iget-object v0, p0, Landroidx/core/view/x;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/core/view/m0;

    invoke-interface {v1, p1}, Landroidx/core/view/m0;->c(Landroid/view/MenuItem;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public k(Landroid/view/Menu;)V
    .locals 2

    iget-object v0, p0, Landroidx/core/view/x;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/core/view/m0;

    invoke-interface {v1, p1}, Landroidx/core/view/m0;->b(Landroid/view/Menu;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public l(Landroidx/core/view/m0;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/x;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/core/view/x;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/core/view/x$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/core/view/x$a;->a()V

    :cond_0
    iget-object p1, p0, Landroidx/core/view/x;->a:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
