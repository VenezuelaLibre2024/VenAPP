.class public final Lcom/techandpeople/techchat/app/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/ads/AudienceNetworkAds$InitListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/techandpeople/techchat/app/a$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/techandpeople/techchat/app/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/techandpeople/techchat/app/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/techandpeople/techchat/app/a$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/techandpeople/techchat/app/a;->a:Lcom/techandpeople/techchat/app/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInitialized(Lcom/facebook/ads/AudienceNetworkAds$InitResult;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/facebook/ads/AudienceNetworkAds$InitResult;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "FBAudienceNetwork"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method
