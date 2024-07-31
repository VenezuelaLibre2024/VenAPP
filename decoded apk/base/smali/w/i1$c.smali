.class Lw/i1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/i1;-><init>(Landroid/util/Size;Landroidx/camera/core/impl/c0;Lw/y;Landroid/util/Range;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La0/c<",
        "Landroid/view/Surface;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/util/concurrent/f;

.field final synthetic b:Landroidx/concurrent/futures/c$a;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lw/i1;


# direct methods
.method constructor <init>(Lw/i1;Lcom/google/common/util/concurrent/f;Landroidx/concurrent/futures/c$a;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lw/i1$c;->d:Lw/i1;

    iput-object p2, p0, Lw/i1$c;->a:Lcom/google/common/util/concurrent/f;

    iput-object p3, p0, Lw/i1$c;->b:Landroidx/concurrent/futures/c$a;

    iput-object p4, p0, Lw/i1$c;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 4

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lw/i1$c;->b:Landroidx/concurrent/futures/c$a;

    new-instance v1, Lw/i1$f;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lw/i1$c;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " cancelled."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lw/i1$f;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    move-result p1

    invoke-static {p1}, Landroidx/core/util/h;->m(Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lw/i1$c;->b:Landroidx/concurrent/futures/c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public b(Landroid/view/Surface;)V
    .locals 1

    iget-object p1, p0, Lw/i1$c;->a:Lcom/google/common/util/concurrent/f;

    iget-object v0, p0, Lw/i1$c;->b:Landroidx/concurrent/futures/c$a;

    invoke-static {p1, v0}, La0/f;->k(Lcom/google/common/util/concurrent/f;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/view/Surface;

    invoke-virtual {p0, p1}, Lw/i1$c;->b(Landroid/view/Surface;)V

    return-void
.end method
