.class public Lz2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lz2/p;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lz2/l;->a:Ljava/util/List;

    return-void
.end method

.method private c(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lca/f;->n()Lca/f;

    move-result-object v1

    invoke-virtual {v1, p1}, Lca/f;->g(Landroid/content/Context;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :catch_0
    :cond_0
    return v0
.end method


# virtual methods
.method public a(Landroid/content/Context;ZLz2/z;)Lz2/p;
    .locals 0

    if-eqz p2, :cond_0

    new-instance p2, Lz2/q;

    invoke-direct {p2, p1, p3}, Lz2/q;-><init>(Landroid/content/Context;Lz2/z;)V

    return-object p2

    :cond_0
    invoke-direct {p0, p1}, Lz2/l;->c(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, Lz2/k;

    invoke-direct {p2, p1, p3}, Lz2/k;-><init>(Landroid/content/Context;Lz2/z;)V

    goto :goto_0

    :cond_1
    new-instance p2, Lz2/q;

    invoke-direct {p2, p1, p3}, Lz2/q;-><init>(Landroid/content/Context;Lz2/z;)V

    :goto_0
    return-object p2
.end method

.method public b(Landroid/content/Context;ZLz2/e0;Ly2/a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lz2/l;->a(Landroid/content/Context;ZLz2/z;)Lz2/p;

    move-result-object p1

    invoke-interface {p1, p3, p4}, Lz2/p;->d(Lz2/e0;Ly2/a;)V

    return-void
.end method

.method public d(Landroid/content/Context;Lz2/a0;)V
    .locals 2

    if-nez p1, :cond_0

    sget-object v0, Ly2/b;->locationServicesDisabled:Ly2/b;

    invoke-interface {p2, v0}, Lz2/a0;->a(Ly2/b;)V

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lz2/l;->a(Landroid/content/Context;ZLz2/z;)Lz2/p;

    move-result-object p1

    invoke-interface {p1, p2}, Lz2/p;->b(Lz2/a0;)V

    return-void
.end method

.method public e(Lz2/p;Landroid/app/Activity;Lz2/e0;Ly2/a;)V
    .locals 1

    iget-object v0, p0, Lz2/l;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1, p2, p3, p4}, Lz2/p;->c(Landroid/app/Activity;Lz2/e0;Ly2/a;)V

    return-void
.end method

.method public f(Lz2/p;)V
    .locals 1

    iget-object v0, p0, Lz2/l;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-interface {p1}, Lz2/p;->f()V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 1

    iget-object p3, p0, Lz2/l;->a:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/p;

    invoke-interface {v0, p1, p2}, Lz2/p;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
