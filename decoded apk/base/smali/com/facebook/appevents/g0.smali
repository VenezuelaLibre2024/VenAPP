.class public final Lcom/facebook/appevents/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Lcom/facebook/appevents/f0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/facebook/appevents/f0;->SUCCESS:Lcom/facebook/appevents/f0;

    iput-object v0, p0, Lcom/facebook/appevents/g0;->b:Lcom/facebook/appevents/f0;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/facebook/appevents/g0;->a:I

    return v0
.end method

.method public final b()Lcom/facebook/appevents/f0;
    .locals 1

    iget-object v0, p0, Lcom/facebook/appevents/g0;->b:Lcom/facebook/appevents/f0;

    return-object v0
.end method

.method public final c(I)V
    .locals 0

    iput p1, p0, Lcom/facebook/appevents/g0;->a:I

    return-void
.end method

.method public final d(Lcom/facebook/appevents/f0;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/facebook/appevents/g0;->b:Lcom/facebook/appevents/f0;

    return-void
.end method
