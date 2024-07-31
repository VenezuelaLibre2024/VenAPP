.class public Lxa/e$a;
.super Lcom/google/android/gms/common/api/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxa/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/m<",
        "Lxa/e$b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/api/m;-><init>()V

    return-void
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/m;->a()Lcom/google/android/gms/common/api/n;

    move-result-object v0

    check-cast v0, Lxa/e$b;

    invoke-interface {v0}, Lxa/e$b;->getJwsResult()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
