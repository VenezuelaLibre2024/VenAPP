.class final synthetic Lil/d$a;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lok/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lil/d;->e(Lzk/b3;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/k;",
        "Lok/p<",
        "Ljava/lang/Long;",
        "Lil/f;",
        "Lil/f;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lil/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lil/d$a;

    invoke-direct {v0}, Lil/d$a;-><init>()V

    sput-object v0, Lil/d$a;->a:Lil/d$a;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const/4 v1, 0x2

    const-class v2, Lil/e;

    const-string v3, "createSegment"

    const-string v4, "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;"

    const/4 v5, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(JLil/f;)Lil/f;
    .locals 0

    invoke-static {p1, p2, p3}, Lil/e;->a(JLil/f;)Lil/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    check-cast p2, Lil/f;

    invoke-virtual {p0, v0, v1, p2}, Lil/d$a;->a(JLil/f;)Lil/f;

    move-result-object p1

    return-object p1
.end method
