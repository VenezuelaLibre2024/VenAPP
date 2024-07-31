.class Lw/i1$a;
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
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/concurrent/futures/c$a;

.field final synthetic b:Lcom/google/common/util/concurrent/f;

.field final synthetic c:Lw/i1;


# direct methods
.method constructor <init>(Lw/i1;Landroidx/concurrent/futures/c$a;Lcom/google/common/util/concurrent/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lw/i1$a;->c:Lw/i1;

    iput-object p2, p0, Lw/i1$a;->a:Landroidx/concurrent/futures/c$a;

    iput-object p3, p0, Lw/i1$a;->b:Lcom/google/common/util/concurrent/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    instance-of p1, p1, Lw/i1$f;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lw/i1$a;->b:Lcom/google/common/util/concurrent/f;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lw/i1$a;->a:Landroidx/concurrent/futures/c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    invoke-static {p1}, Landroidx/core/util/h;->m(Z)V

    return-void
.end method

.method public b(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Lw/i1$a;->a:Landroidx/concurrent/futures/c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Landroidx/core/util/h;->m(Z)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lw/i1$a;->b(Ljava/lang/Void;)V

    return-void
.end method
