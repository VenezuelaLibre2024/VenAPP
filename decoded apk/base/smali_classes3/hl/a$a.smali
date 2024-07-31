.class public final Lhl/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhl/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field private final b:Ljava/lang/Object;

.field public final c:Lok/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/q<",
            "Lhl/b<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lok/l<",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;>;"
        }
    .end annotation
.end field

.field public d:Ljava/lang/Object;

.field public e:I

.field final synthetic f:Lhl/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhl/a<",
            "TR;>;"
        }
    .end annotation
.end field


# virtual methods
.method public final a(Lhl/b;Ljava/lang/Object;)Lok/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhl/b<",
            "*>;",
            "Ljava/lang/Object;",
            ")",
            "Lok/l<",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lhl/a$a;->c:Lok/q;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lhl/a$a;->b:Ljava/lang/Object;

    invoke-interface {v0, p1, v1, p2}, Lok/q;->m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lok/l;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, Lhl/a$a;->d:Ljava/lang/Object;

    iget-object v1, p0, Lhl/a$a;->f:Lhl/a;

    instance-of v2, v0, Lel/e0;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v0, Lel/e0;

    iget v2, p0, Lhl/a$a;->e:I

    invoke-virtual {v1}, Lhl/a;->getContext()Lgk/f;

    move-result-object v1

    invoke-virtual {v0, v2, v3, v1}, Lel/e0;->o(ILjava/lang/Throwable;Lgk/f;)V

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lzk/c1;

    if-eqz v1, :cond_1

    move-object v3, v0

    check-cast v3, Lzk/c1;

    :cond_1
    if-eqz v3, :cond_2

    invoke-interface {v3}, Lzk/c1;->dispose()V

    :cond_2
    :goto_0
    return-void
.end method
