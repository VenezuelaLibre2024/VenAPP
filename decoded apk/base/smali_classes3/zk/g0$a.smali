.class final Lzk/g0$a;
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


# static fields
.field public static final a:Lzk/g0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzk/g0$a;

    invoke-direct {v0}, Lzk/g0$a;-><init>()V

    sput-object v0, Lzk/g0$a;->a:Lzk/g0$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lgk/f;Lgk/f$b;)Lgk/f;
    .locals 1

    instance-of v0, p2, Lzk/f0;

    if-eqz v0, :cond_0

    check-cast p2, Lzk/f0;

    invoke-interface {p2}, Lzk/f0;->q()Lzk/f0;

    move-result-object p2

    invoke-interface {p1, p2}, Lgk/f;->U(Lgk/f;)Lgk/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1, p2}, Lgk/f;->U(Lgk/f;)Lgk/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgk/f;

    check-cast p2, Lgk/f$b;

    invoke-virtual {p0, p1, p2}, Lzk/g0$a;->a(Lgk/f;Lgk/f$b;)Lgk/f;

    move-result-object p1

    return-object p1
.end method
