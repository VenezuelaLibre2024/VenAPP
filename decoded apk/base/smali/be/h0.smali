.class public Lbe/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Application;)Lzd/u2;
    .locals 2

    new-instance v0, Lzd/u2;

    const-string v1, "fiam_eligible_campaigns_cache_file"

    invoke-direct {v0, p1, v1}, Lzd/u2;-><init>(Landroid/app/Application;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Landroid/app/Application;)Lzd/u2;
    .locals 2

    new-instance v0, Lzd/u2;

    const-string v1, "fiam_impressions_store_file"

    invoke-direct {v0, p1, v1}, Lzd/u2;-><init>(Landroid/app/Application;Ljava/lang/String;)V

    return-object v0
.end method

.method public c(Landroid/app/Application;)Lzd/u2;
    .locals 2

    new-instance v0, Lzd/u2;

    const-string v1, "rate_limit_store_file"

    invoke-direct {v0, p1, v1}, Lzd/u2;-><init>(Landroid/app/Application;Ljava/lang/String;)V

    return-object v0
.end method
