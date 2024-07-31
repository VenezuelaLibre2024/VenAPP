.class public final Lcom/facebook/appevents/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/appevents/o$b;,
        Lcom/facebook/appevents/o$a;
    }
.end annotation


# static fields
.field public static final b:Lcom/facebook/appevents/o$a;

.field private static final c:Ljava/lang/String;


# instance fields
.field private final a:Lcom/facebook/appevents/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/appevents/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/appevents/o$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/appevents/o;->b:Lcom/facebook/appevents/o$a;

    const-class v0, Lcom/facebook/appevents/o;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/appevents/o;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Li4/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/facebook/appevents/r;

    invoke-direct {v0, p1, p2, p3}, Lcom/facebook/appevents/r;-><init>(Landroid/content/Context;Ljava/lang/String;Li4/a;)V

    iput-object v0, p0, Lcom/facebook/appevents/o;->a:Lcom/facebook/appevents/r;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Li4/a;Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/appevents/o;-><init>(Landroid/content/Context;Ljava/lang/String;Li4/a;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/appevents/o;->a:Lcom/facebook/appevents/r;

    invoke-virtual {v0}, Lcom/facebook/appevents/r;->j()V

    return-void
.end method

.method public final b(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/appevents/o;->a:Lcom/facebook/appevents/r;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/appevents/r;->l(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
