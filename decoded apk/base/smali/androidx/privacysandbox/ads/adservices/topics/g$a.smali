.class final Landroidx/privacysandbox/ads/adservices/topics/g$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/privacysandbox/ads/adservices/topics/g;->e(Landroidx/privacysandbox/ads/adservices/topics/g;Landroidx/privacysandbox/ads/adservices/topics/a;Lgk/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon"
    f = "TopicsManagerImplCommon.kt"
    l = {
        0x16
    }
    m = "getTopics$suspendImpl"
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/privacysandbox/ads/adservices/topics/g;

.field d:I


# direct methods
.method constructor <init>(Landroidx/privacysandbox/ads/adservices/topics/g;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/privacysandbox/ads/adservices/topics/g;",
            "Lgk/Continuation<",
            "-",
            "Landroidx/privacysandbox/ads/adservices/topics/g$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/privacysandbox/ads/adservices/topics/g$a;->c:Landroidx/privacysandbox/ads/adservices/topics/g;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Landroidx/privacysandbox/ads/adservices/topics/g$a;->b:Ljava/lang/Object;

    iget p1, p0, Landroidx/privacysandbox/ads/adservices/topics/g$a;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/privacysandbox/ads/adservices/topics/g$a;->d:I

    iget-object p1, p0, Landroidx/privacysandbox/ads/adservices/topics/g$a;->c:Landroidx/privacysandbox/ads/adservices/topics/g;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Landroidx/privacysandbox/ads/adservices/topics/g;->e(Landroidx/privacysandbox/ads/adservices/topics/g;Landroidx/privacysandbox/ads/adservices/topics/a;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
