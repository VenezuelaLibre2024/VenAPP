.class final Lel/l0$c;
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
        "Lel/p0;",
        "Lgk/f$b;",
        "Lel/p0;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lel/l0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lel/l0$c;

    invoke-direct {v0}, Lel/l0$c;-><init>()V

    sput-object v0, Lel/l0$c;->a:Lel/l0$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lel/p0;Lgk/f$b;)Lel/p0;
    .locals 1

    instance-of v0, p2, Lzk/r2;

    if-eqz v0, :cond_0

    check-cast p2, Lzk/r2;

    iget-object v0, p1, Lel/p0;->a:Lgk/f;

    invoke-interface {p2, v0}, Lzk/r2;->v0(Lgk/f;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lel/p0;->a(Lzk/r2;Ljava/lang/Object;)V

    :cond_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lel/p0;

    check-cast p2, Lgk/f$b;

    invoke-virtual {p0, p1, p2}, Lel/l0$c;->a(Lel/p0;Lgk/f$b;)Lel/p0;

    move-result-object p1

    return-object p1
.end method
