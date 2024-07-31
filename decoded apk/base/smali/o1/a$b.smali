.class public final Lo1/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lo1/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lo1/a;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/privacysandbox/ads/adservices/topics/d;->a:Landroidx/privacysandbox/ads/adservices/topics/d$a;

    invoke-virtual {v0, p1}, Landroidx/privacysandbox/ads/adservices/topics/d$a;->a(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/topics/d;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lo1/a$a;

    invoke-direct {v0, p1}, Lo1/a$a;-><init>(Landroidx/privacysandbox/ads/adservices/topics/d;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
