.class final Lel/l0$b;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lel/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/p<",
        "Lzk/r2<",
        "*>;",
        "Lgk/f$b;",
        "Lzk/r2<",
        "*>;>;"
    }
.end annotation


# static fields
.field public static final a:Lel/l0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lel/l0$b;

    invoke-direct {v0}, Lel/l0$b;-><init>()V

    sput-object v0, Lel/l0$b;->a:Lel/l0$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lzk/r2;Lgk/f$b;)Lzk/r2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzk/r2<",
            "*>;",
            "Lgk/f$b;",
            ")",
            "Lzk/r2<",
            "*>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    instance-of p1, p2, Lzk/r2;

    if-eqz p1, :cond_1

    check-cast p2, Lzk/r2;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzk/r2;

    check-cast p2, Lgk/f$b;

    invoke-virtual {p0, p1, p2}, Lel/l0$b;->a(Lzk/r2;Lgk/f$b;)Lzk/r2;

    move-result-object p1

    return-object p1
.end method
