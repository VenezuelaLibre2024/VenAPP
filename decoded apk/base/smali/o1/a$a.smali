.class final Lo1/a$a;
.super Lo1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final b:Landroidx/privacysandbox/ads/adservices/topics/d;


# direct methods
.method public constructor <init>(Landroidx/privacysandbox/ads/adservices/topics/d;)V
    .locals 1

    const-string v0, "mTopicsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lo1/a;-><init>()V

    iput-object p1, p0, Lo1/a$a;->b:Landroidx/privacysandbox/ads/adservices/topics/d;

    return-void
.end method

.method public static final synthetic c(Lo1/a$a;)Landroidx/privacysandbox/ads/adservices/topics/d;
    .locals 0

    iget-object p0, p0, Lo1/a$a;->b:Landroidx/privacysandbox/ads/adservices/topics/d;

    return-object p0
.end method


# virtual methods
.method public b(Landroidx/privacysandbox/ads/adservices/topics/a;)Lcom/google/common/util/concurrent/f;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/privacysandbox/ads/adservices/topics/a;",
            ")",
            "Lcom/google/common/util/concurrent/f<",
            "Landroidx/privacysandbox/ads/adservices/topics/b;",
            ">;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lzk/a1;->c()Lzk/h2;

    move-result-object v0

    invoke-static {v0}, Lzk/l0;->a(Lgk/f;)Lzk/k0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lo1/a$a$a;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lo1/a$a$a;-><init>(Lo1/a$a;Landroidx/privacysandbox/ads/adservices/topics/a;Lgk/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lzk/h;->b(Lzk/k0;Lgk/f;Lzk/m0;Lok/p;ILjava/lang/Object;)Lzk/r0;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lm1/b;->c(Lzk/r0;Ljava/lang/Object;ILjava/lang/Object;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
