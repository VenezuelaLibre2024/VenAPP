.class Ly/r0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly/r0;->m(Ly/j;)Lcom/google/common/util/concurrent/f;
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
.field final synthetic a:Ly/j;

.field final synthetic b:Ly/r0;


# direct methods
.method constructor <init>(Ly/r0;Ly/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ly/r0$a;->b:Ly/r0;

    iput-object p2, p0, Ly/r0$a;->a:Ly/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 4

    iget-object v0, p0, Ly/r0$a;->a:Ly/j;

    invoke-virtual {v0}, Ly/j;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lw/g0;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ly/r0$a;->b:Ly/r0;

    iget-object v0, v0, Ly/r0;->c:Ly/r;

    check-cast p1, Lw/g0;

    invoke-virtual {v0, p1}, Ly/r;->j(Lw/g0;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ly/r0$a;->b:Ly/r0;

    iget-object v0, v0, Ly/r0;->c:Ly/r;

    new-instance v1, Lw/g0;

    const/4 v2, 0x2

    const-string v3, "Failed to submit capture request"

    invoke-direct {v1, v2, v3, p1}, Lw/g0;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Ly/r;->j(Lw/g0;)V

    :goto_0
    iget-object p1, p0, Ly/r0$a;->b:Ly/r0;

    iget-object p1, p1, Ly/r0;->b:Ly/q;

    invoke-interface {p1}, Ly/q;->c()V

    return-void
.end method

.method public b(Ljava/lang/Void;)V
    .locals 0

    iget-object p1, p0, Ly/r0$a;->b:Ly/r0;

    iget-object p1, p1, Ly/r0;->b:Ly/q;

    invoke-interface {p1}, Ly/q;->c()V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Ly/r0$a;->b(Ljava/lang/Void;)V

    return-void
.end method
