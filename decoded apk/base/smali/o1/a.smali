.class public abstract Lo1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo1/a$a;,
        Lo1/a$b;
    }
.end annotation


# static fields
.field public static final a:Lo1/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo1/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo1/a$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lo1/a;->a:Lo1/a$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/content/Context;)Lo1/a;
    .locals 1

    sget-object v0, Lo1/a;->a:Lo1/a$b;

    invoke-virtual {v0, p0}, Lo1/a$b;->a(Landroid/content/Context;)Lo1/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b(Landroidx/privacysandbox/ads/adservices/topics/a;)Lcom/google/common/util/concurrent/f;
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
.end method
