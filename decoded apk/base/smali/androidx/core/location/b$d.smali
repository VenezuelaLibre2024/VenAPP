.class Landroidx/core/location/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/location/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field volatile a:Landroidx/core/location/b$c;

.field final b:Ljava/util/concurrent/Executor;


# direct methods
.method public static synthetic a(Landroidx/core/location/b$d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/core/location/b$d;->l(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Landroidx/core/location/b$d;Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/core/location/b$d;->m(Ljava/lang/String;ILandroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic c(Landroidx/core/location/b$d;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/core/location/b$d;->j(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic d(Landroidx/core/location/b$d;I)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/core/location/b$d;->h(I)V

    return-void
.end method

.method public static synthetic e(Landroidx/core/location/b$d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/core/location/b$d;->k(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic f(Landroidx/core/location/b$d;Landroid/location/Location;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/core/location/b$d;->i(Landroid/location/Location;)V

    return-void
.end method

.method private synthetic h(I)V
    .locals 1

    iget-object v0, p0, Landroidx/core/location/b$d;->a:Landroidx/core/location/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Landroidx/core/location/b$c;->b:Landroidx/core/location/a;

    invoke-interface {v0, p1}, Landroidx/core/location/a;->onFlushComplete(I)V

    return-void
.end method

.method private synthetic i(Landroid/location/Location;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/location/b$d;->a:Landroidx/core/location/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Landroidx/core/location/b$c;->b:Landroidx/core/location/a;

    invoke-interface {v0, p1}, Landroid/location/LocationListener;->onLocationChanged(Landroid/location/Location;)V

    return-void
.end method

.method private synthetic j(Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/location/b$d;->a:Landroidx/core/location/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Landroidx/core/location/b$c;->b:Landroidx/core/location/a;

    invoke-interface {v0, p1}, Landroidx/core/location/a;->onLocationChanged(Ljava/util/List;)V

    return-void
.end method

.method private synthetic k(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/location/b$d;->a:Landroidx/core/location/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Landroidx/core/location/b$c;->b:Landroidx/core/location/a;

    invoke-interface {v0, p1}, Landroidx/core/location/a;->onProviderDisabled(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic l(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/location/b$d;->a:Landroidx/core/location/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Landroidx/core/location/b$c;->b:Landroidx/core/location/a;

    invoke-interface {v0, p1}, Landroidx/core/location/a;->onProviderEnabled(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic m(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/location/b$d;->a:Landroidx/core/location/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Landroidx/core/location/b$c;->b:Landroidx/core/location/a;

    invoke-interface {v0, p1, p2, p3}, Landroidx/core/location/a;->onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public g()Landroidx/core/location/b$c;
    .locals 1

    iget-object v0, p0, Landroidx/core/location/b$d;->a:Landroidx/core/location/b$c;

    invoke-static {v0}, Landroidx/core/util/c;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/location/b$c;

    return-object v0
.end method

.method public n()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/core/location/b$d;->a:Landroidx/core/location/b$c;

    return-void
.end method

.method public onFlushComplete(I)V
    .locals 2

    iget-object v0, p0, Landroidx/core/location/b$d;->a:Landroidx/core/location/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/core/location/b$d;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/core/location/g;

    invoke-direct {v1, p0, p1}, Landroidx/core/location/g;-><init>(Landroidx/core/location/b$d;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 2

    iget-object v0, p0, Landroidx/core/location/b$d;->a:Landroidx/core/location/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/core/location/b$d;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/core/location/j;

    invoke-direct {v1, p0, p1}, Landroidx/core/location/j;-><init>(Landroidx/core/location/b$d;Landroid/location/Location;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onLocationChanged(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/location/Location;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/core/location/b$d;->a:Landroidx/core/location/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/core/location/b$d;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/core/location/h;

    invoke-direct {v1, p0, p1}, Landroidx/core/location/h;-><init>(Landroidx/core/location/b$d;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Landroidx/core/location/b$d;->a:Landroidx/core/location/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/core/location/b$d;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/core/location/i;

    invoke-direct {v1, p0, p1}, Landroidx/core/location/i;-><init>(Landroidx/core/location/b$d;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Landroidx/core/location/b$d;->a:Landroidx/core/location/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/core/location/b$d;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/core/location/f;

    invoke-direct {v1, p0, p1}, Landroidx/core/location/f;-><init>(Landroidx/core/location/b$d;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroidx/core/location/b$d;->a:Landroidx/core/location/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/core/location/b$d;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/core/location/k;

    invoke-direct {v1, p0, p1, p2, p3}, Landroidx/core/location/k;-><init>(Landroidx/core/location/b$d;Ljava/lang/String;ILandroid/os/Bundle;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
