.class public final Lel/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lel/h0;

.field private static final b:Lok/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/p<",
            "Ljava/lang/Object;",
            "Lgk/f$b;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Lok/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/p<",
            "Lzk/r2<",
            "*>;",
            "Lgk/f$b;",
            "Lzk/r2<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final d:Lok/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/p<",
            "Lel/p0;",
            "Lgk/f$b;",
            "Lel/p0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lel/h0;

    const-string v1, "NO_THREAD_ELEMENTS"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lel/l0;->a:Lel/h0;

    sget-object v0, Lel/l0$a;->a:Lel/l0$a;

    sput-object v0, Lel/l0;->b:Lok/p;

    sget-object v0, Lel/l0$b;->a:Lel/l0$b;

    sput-object v0, Lel/l0;->c:Lok/p;

    sget-object v0, Lel/l0$c;->a:Lel/l0$c;

    sput-object v0, Lel/l0;->d:Lok/p;

    return-void
.end method

.method public static final a(Lgk/f;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, Lel/l0;->a:Lel/h0;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lel/p0;

    if-eqz v0, :cond_1

    check-cast p1, Lel/p0;

    invoke-virtual {p1, p0}, Lel/p0;->b(Lgk/f;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    sget-object v1, Lel/l0;->c:Lok/p;

    invoke-interface {p0, v0, v1}, Lgk/f;->z0(Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lzk/r2;

    invoke-interface {v0, p0, p1}, Lzk/r2;->S(Lgk/f;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final b(Lgk/f;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lel/l0;->b:Lok/p;

    invoke-interface {p0, v0, v1}, Lgk/f;->z0(Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final c(Lgk/f;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    invoke-static {p0}, Lel/l0;->b(Lgk/f;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p1, v0, :cond_1

    sget-object p0, Lel/l0;->a:Lel/h0;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    new-instance v0, Lel/p0;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p0, p1}, Lel/p0;-><init>(Lgk/f;I)V

    sget-object p1, Lel/l0;->d:Lok/p;

    invoke-interface {p0, v0, p1}, Lgk/f;->z0(Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_2
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lzk/r2;

    invoke-interface {p1, p0}, Lzk/r2;->v0(Lgk/f;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0
.end method
