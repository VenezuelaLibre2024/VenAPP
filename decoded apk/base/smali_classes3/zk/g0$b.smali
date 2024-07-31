.class final Lzk/g0$b;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzk/g0;->a(Lgk/f;Lgk/f;Z)Lgk/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/p<",
        "Lgk/f;",
        "Lgk/f$b;",
        "Lgk/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/x<",
            "Lgk/f;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Z


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/x;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/x<",
            "Lgk/f;",
            ">;Z)V"
        }
    .end annotation

    iput-object p1, p0, Lzk/g0$b;->a:Lkotlin/jvm/internal/x;

    iput-boolean p2, p0, Lzk/g0$b;->b:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lgk/f;Lgk/f$b;)Lgk/f;
    .locals 4

    instance-of v0, p2, Lzk/f0;

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Lgk/f;->U(Lgk/f;)Lgk/f;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lzk/g0$b;->a:Lkotlin/jvm/internal/x;

    iget-object v0, v0, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    check-cast v0, Lgk/f;

    invoke-interface {p2}, Lgk/f$b;->getKey()Lgk/f$c;

    move-result-object v1

    invoke-interface {v0, v1}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lzk/g0$b;->b:Z

    check-cast p2, Lzk/f0;

    if-eqz v0, :cond_1

    invoke-interface {p2}, Lzk/f0;->q()Lzk/f0;

    move-result-object p2

    :cond_1
    invoke-interface {p1, p2}, Lgk/f;->U(Lgk/f;)Lgk/f;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v1, p0, Lzk/g0$b;->a:Lkotlin/jvm/internal/x;

    iget-object v2, v1, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    check-cast v2, Lgk/f;

    invoke-interface {p2}, Lgk/f$b;->getKey()Lgk/f$c;

    move-result-object v3

    invoke-interface {v2, v3}, Lgk/f;->Q(Lgk/f$c;)Lgk/f;

    move-result-object v2

    iput-object v2, v1, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    check-cast p2, Lzk/f0;

    invoke-interface {p2, v0}, Lzk/f0;->f(Lgk/f$b;)Lgk/f;

    move-result-object p2

    invoke-interface {p1, p2}, Lgk/f;->U(Lgk/f;)Lgk/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgk/f;

    check-cast p2, Lgk/f$b;

    invoke-virtual {p0, p1, p2}, Lzk/g0$b;->a(Lgk/f;Lgk/f$b;)Lgk/f;

    move-result-object p1

    return-object p1
.end method
